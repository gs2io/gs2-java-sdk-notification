package io.gs2.notification.control;

import io.gs2.notification.model.Notification;

/**
 * 通知の更新結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
public class UpdateNotificationResult {
	
	Notification item;
	
	/**
	 * 通知を取得。
	 * 
	 * @return 通知
	 */
	public Notification getItem() {
		return item;
	}
	
	/**
	 * 通知を設定。
	 * 
	 * @param item 通知
	 */
	public void setItem(Notification item) {
		this.item = item;
	}
	
	/**
	 * 通知を設定。
	 * 
	 * @param item 通知
	 * @return this
	 */
	public UpdateNotificationResult withItem(Notification item) {
		setItem(item);
		return this;
	}
}
