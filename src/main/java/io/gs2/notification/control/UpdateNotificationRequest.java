package io.gs2.notification.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.notification.Gs2Notification;

/**
 * 通知の更新リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class UpdateNotificationRequest extends Gs2BasicRequest<UpdateNotificationRequest> {

	public static class Constant extends Gs2Notification.Constant {
		public static final String FUNCTION = "UpdateNotification";
	}

	/** 通知名 */
	String notificationName;
	/** 説明文 */
	String description;

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
	public UpdateNotificationRequest withNotificationName(String notificationName) {
		setNotificationName(notificationName);
		return this;
	}
	
	/**
	 * 説明文を取得。
	 * 
	 * @return 説明文
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * 説明文を設定。
	 * 
	 * @param description 説明文
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * 説明文を設定。
	 * 
	 * @param description 説明文
	 * @return this
	 */
	public UpdateNotificationRequest withDescription(String description) {
		setDescription(description);
		return this;
	}
}
