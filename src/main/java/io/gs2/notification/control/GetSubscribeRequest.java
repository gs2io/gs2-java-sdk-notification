package io.gs2.notification.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.notification.Gs2Notification;

/**
 * 通知先の取得リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class GetSubscribeRequest extends Gs2BasicRequest<GetSubscribeRequest> {

	public static class Constant extends Gs2Notification.Constant {
		public static final String FUNCTION = "GetSubscribe";
	}

	/** 通知名 */
	String notificationName;
	/** 通知先ID */
	String subscribeId;

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
	public GetSubscribeRequest withNotificationName(String notificationName) {
		setNotificationName(notificationName);
		return this;
	}

	/**
	 * 通知先IDを取得。
	 * 
	 * @return 通知先ID
	 */
	public String getSubscribeId() {
		return subscribeId;
	}
	
	/**
	 * 通知先IDを設定。
	 * 
	 * @param subscribeId 通知先ID
	 */
	public void setSubscribeId(String subscribeId) {
		this.subscribeId = subscribeId;
	}
	
	/**
	 * 通知先IDを設定。
	 * 
	 * @param subscribeId 通知先ID
	 * @return this
	 */
	public GetSubscribeRequest withSubscribeId(String subscribeId) {
		setSubscribeId(subscribeId);
		return this;
	}
}
