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
public class DeleteNotificationRequest extends Gs2BasicRequest<DeleteNotificationRequest> {

	public static class Constant extends Gs2Notification.Constant {
		public static final String FUNCTION = "DeleteNotification";
	}
	
	/** 通知名 */
	String notificationName;
	
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
	public DeleteNotificationRequest withNotificationName(String notificationName) {
		setNotificationName(notificationName);
		return this;
	}
}
