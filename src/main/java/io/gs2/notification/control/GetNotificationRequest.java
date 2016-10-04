package io.gs2.notification.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.notification.Gs2Notification;

/**
 * 通知の取得リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class GetNotificationRequest extends Gs2BasicRequest<GetNotificationRequest> {

	public static class Constant extends Gs2Notification.Constant {
		public static final String FUNCTION = "GetNotification";
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
	public GetNotificationRequest withNotificationName(String notificationName) {
		setNotificationName(notificationName);
		return this;
	}
}
