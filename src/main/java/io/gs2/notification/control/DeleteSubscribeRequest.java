package io.gs2.notification.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.notification.Gs2Notification;

/**
 * 通知の削除リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class DeleteSubscribeRequest extends Gs2BasicRequest<DeleteSubscribeRequest> {

	public static class Constant extends Gs2Notification.Constant {
		public static final String FUNCTION = "DeleteSubscribe";
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
	public DeleteSubscribeRequest withNotificationName(String notificationName) {
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
	public DeleteSubscribeRequest withSubscribeId(String subscribeId) {
		setSubscribeId(subscribeId);
		return this;
	}
}
