package io.gs2.notification;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import io.gs2.AbstractGs2Client;
import io.gs2.Gs2Constant;
import io.gs2.model.IGs2Credential;
import io.gs2.notification.control.CreateNotificationRequest;
import io.gs2.notification.control.CreateNotificationResult;
import io.gs2.notification.control.CreateSubscribeRequest;
import io.gs2.notification.control.CreateSubscribeResult;
import io.gs2.notification.control.DeleteNotificationRequest;
import io.gs2.notification.control.DeleteSubscribeRequest;
import io.gs2.notification.control.DescribeNotificationRequest;
import io.gs2.notification.control.DescribeNotificationResult;
import io.gs2.notification.control.DescribeSubscribeRequest;
import io.gs2.notification.control.DescribeSubscribeResult;
import io.gs2.notification.control.GetNotificationRequest;
import io.gs2.notification.control.GetNotificationResult;
import io.gs2.notification.control.GetSubscribeRequest;
import io.gs2.notification.control.GetSubscribeResult;
import io.gs2.notification.control.UpdateNotificationRequest;
import io.gs2.notification.control.UpdateNotificationResult;

/**
 * GS2 Notification API クライアント
 * 
 * @author Game Server Services, Inc.
 *
 */
public class Gs2NotificationClient extends AbstractGs2Client<Gs2NotificationClient> {

	public static String ENDPOINT = "notification";
	
	/**
	 * コンストラクタ。
	 * 
	 * @param credential 認証情報
	 */
	public Gs2NotificationClient(IGs2Credential credential) {
		super(credential);
	}

	/**
	 * 通知を作成。<br>
	 * <br>
	 * 通知はGS2内で発生したイベントを受け取る手段を提供します。<br>
	 * 例えば、GS2-Watch の監視データが一定の閾値を超えた時に通知する。といった用途に利用できます。<br>
	 * <br>
	 * GS2 のサービスの多くはクオータを買い、その範囲内でサービスを利用する形式が多く取られていますが、<br>
	 * 現在の消費クオータが GS2-Watch で取れますので、クオータの消費量が予約量の80%を超えたら通知をだす。というような使い方ができます。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return 作成結果
	 */
	public CreateNotificationResult createNotification(CreateNotificationRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("name", request.getName())
				.put("description", request.getDescription());
		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/notification", 
				credential, 
				ENDPOINT,
				CreateNotificationRequest.Constant.MODULE, 
				CreateNotificationRequest.Constant.FUNCTION,
				body.toString());
		return doRequest(post, CreateNotificationResult.class);
	}
	
	/**
	 * 通知一覧を取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return 通知一覧
	 */
	public DescribeNotificationResult describeNotification(DescribeNotificationRequest request) {
		String url = Gs2Constant.ENDPOINT_HOST + "/notification";
		List<NameValuePair> queryString = new ArrayList<>();
		if(request.getLimit() != null) queryString.add(new BasicNameValuePair("limit", String.valueOf(request.getLimit())));
		if(request.getPageToken() != null) queryString.add(new BasicNameValuePair("pageToken", request.getPageToken()));
		if(queryString.size() > 0) {
			url += "?" + URLEncodedUtils.format(queryString, "UTF-8");
		}
		HttpGet get = createHttpGet(
				url, 
				credential, 
				ENDPOINT,
				DescribeNotificationRequest.Constant.MODULE, 
				DescribeNotificationRequest.Constant.FUNCTION);
		return doRequest(get, DescribeNotificationResult.class);
	}

	/**
	 * 通知を取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return 通知
	 */
	public GetNotificationResult getNotification(GetNotificationRequest request) {
		HttpGet get = createHttpGet(
				Gs2Constant.ENDPOINT_HOST + "/notification/" + request.getNotificationName(), 
				credential, 
				ENDPOINT,
				GetNotificationRequest.Constant.MODULE, 
				GetNotificationRequest.Constant.FUNCTION);
		return doRequest(get, GetNotificationResult.class);
	}

	/**
	 * 通知を更新。
	 * 
	 * @param request リクエストパラメータ
	 * @return 更新結果
	 */
	public UpdateNotificationResult updateNotification(UpdateNotificationRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("description", request.getDescription());
		HttpPut put = createHttpPut(
				Gs2Constant.ENDPOINT_HOST + "/notification/" + request.getNotificationName(), 
				credential, 
				ENDPOINT,
				UpdateNotificationRequest.Constant.MODULE, 
				UpdateNotificationRequest.Constant.FUNCTION,
				body.toString());
		return doRequest(put, UpdateNotificationResult.class);
	}

	/**
	 * 通知を削除。
	 * 
	 * @param request リクエストパラメータ
	 */
	public void deleteNotification(DeleteNotificationRequest request) {
		HttpDelete delete = createHttpDelete(
				Gs2Constant.ENDPOINT_HOST + "/notification/" + request.getNotificationName(), 
				credential, 
				ENDPOINT,
				DeleteNotificationRequest.Constant.MODULE, 
				DeleteNotificationRequest.Constant.FUNCTION);
		doRequest(delete, null);
	}

	/**
	 * 通知先を作成。<br>
	 * <br>
	 * E-Mail, HTTP/HTTPS 通信を指定して通知先を登録できます。<br>
	 * 通知先は1つの通知に対して複数登録することもできます。<br>
	 * <br>
	 * そのため、メールとSlackに通知する。といった利用ができます。<br>
	 * <br>
	 * type に指定できるパラメータ<br>
	 * <ul>
	 * <li>email</li>
	 * <li>http/https</li>
	 * </ul>
	 * <br>
	 * endpoint には type に指定したプロトコルによって指定する内容が変わります。<br>
	 * email を選択した場合には メールアドレスを、<br>
	 * http/https を選択した場合には URL を指定してください。<br>
	 * <br>
	 * http/https を選択した場合には登録時に疎通確認を行います。<br>
	 * 指定したURLでPOSTリクエストを受け付けられる状態で登録してください。<br>
	 * 疎通確認の通信は通常の通知とは異なり、body パラメータがからの通信が発生します。ご注意ください。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return 作成結果
	 */
	public CreateSubscribeResult createSubscribe(CreateSubscribeRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("name", request.getNotificationName())
				.put("type", request.getType())
				.put("endpoint", request.getEndpoint());
		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/notification/" + request.getNotificationName() + "/subscribe", 
				credential, 
				ENDPOINT,
				CreateSubscribeRequest.Constant.MODULE, 
				CreateSubscribeRequest.Constant.FUNCTION,
				body.toString());
		return doRequest(post, CreateSubscribeResult.class);
	}
	
	/**
	 * 通知先一覧を取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return 通知先一覧
	 */
	public DescribeSubscribeResult describeSubscribe(DescribeSubscribeRequest request) {
		String url = Gs2Constant.ENDPOINT_HOST + "/notification/" + request.getNotificationName() + "/subscribe";
		List<NameValuePair> queryString = new ArrayList<>();
		if(request.getLimit() != null) queryString.add(new BasicNameValuePair("limit", String.valueOf(request.getLimit())));
		if(request.getPageToken() != null) queryString.add(new BasicNameValuePair("pageToken", request.getPageToken()));
		if(queryString.size() > 0) {
			url += "?" + URLEncodedUtils.format(queryString, "UTF-8");
		}
		HttpGet get = createHttpGet(
				url, 
				credential, 
				ENDPOINT,
				DescribeSubscribeRequest.Constant.MODULE, 
				DescribeSubscribeRequest.Constant.FUNCTION);
		return doRequest(get, DescribeSubscribeResult.class);
	}

	/**
	 * 通知先を取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return 通知先
	 */
	public GetSubscribeResult getSubscribe(GetSubscribeRequest request) {
		HttpGet get = createHttpGet(
				Gs2Constant.ENDPOINT_HOST + "/notification/" + request.getNotificationName() + "/subscribe/" + request.getSubscribeId(), 
				credential, 
				ENDPOINT,
				GetSubscribeRequest.Constant.MODULE, 
				GetSubscribeRequest.Constant.FUNCTION);
		return doRequest(get, GetSubscribeResult.class);
	}

	/**
	 * 通知先を削除。
	 * 
	 * @param request リクエストパラメータ
	 */
	public void deleteSubscribe(DeleteSubscribeRequest request) {
		HttpDelete delete = createHttpDelete(
				Gs2Constant.ENDPOINT_HOST + "/notification/" + request.getNotificationName() + "/subscribe/" + request.getSubscribeId(), 
				credential, 
				ENDPOINT,
				DeleteSubscribeRequest.Constant.MODULE, 
				DeleteSubscribeRequest.Constant.FUNCTION);
		doRequest(delete, null);
	}
	
}
