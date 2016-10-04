package io.gs2.notification.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.notification.Gs2Notification;

/**
 * 通知の作成リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class CreateSubscribeRequest extends Gs2BasicRequest<CreateSubscribeRequest> {

	public static class Constant extends Gs2Notification.Constant {
		public static final String FUNCTION = "CreateSubscribe";
	}

	/** 通知名 */
	String notificationName;
	/** 通知プロトコル */
	String type;
	/** 通知先 */
	String endpoint;
	
	/**
	 * 通知名を取得。
	 * 
	 * @return 通知名
	 */
	public String getNotificationName() {
		return notificationName;
	}
	
	/**
	 * 通知名を設定。
	 * 
	 * @param notificationName 通知名
	 */
	public void setNotificationName(String notificationName) {
		this.notificationName = notificationName;
	}
	
	/**
	 * 通知名を設定。
	 * 
	 * @param notificationName 通知名
	 * @return this
	 */
	public CreateSubscribeRequest withNotificationName(String notificationName) {
		setNotificationName(notificationName);
		return this;
	}

	/**
	 * 通知プロトコルを取得。
	 * 
	 * @return 通知名
	 */
	public String getType() {
		return type;
	}

	/**
	 * 通知プロトコルを設定。
	 * 
	 * @param type 通知プロトコル
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 通知プロトコルを設定。
	 * 
	 * @param type 通知プロトコル
	 * @return this
	 */
	public CreateSubscribeRequest withType(String type) {
		setType(type);
		return this;
	}

	/**
	 * 通知先を取得。
	 * 
	 * @return 通知先
	 */
	public String getEndpoint() {
		return endpoint;
	}

	/**
	 * 通知先を設定。
	 * 
	 * @param endpoint 通知先
	 */
	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	/**
	 * 通知先を設定。
	 * 
	 * @param endpoint 通知先
	 * @return this
	 */
	public CreateSubscribeRequest withEndpoint(String endpoint) {
		setEndpoint(endpoint);
		return this;
	}
}
