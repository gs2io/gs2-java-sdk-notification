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
public class CreateNotificationRequest extends Gs2BasicRequest<CreateNotificationRequest> {

	public static class Constant extends Gs2Notification.Constant {
		public static final String FUNCTION = "CreateNotification";
	}
	
	/** 通知名 */
	String name;
	/** 説明文 */
	String description;
	
	/**
	 * 通知名を取得。
	 * 
	 * @return 通知名
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 通知名を設定。
	 * 
	 * @param name 通知名
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 通知名を設定。
	 * 
	 * @param name 通知名
	 * @return this
	 */
	public CreateNotificationRequest withName(String name) {
		setName(name);
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
	public CreateNotificationRequest withDescription(String description) {
		setDescription(description);
		return this;
	}
}
