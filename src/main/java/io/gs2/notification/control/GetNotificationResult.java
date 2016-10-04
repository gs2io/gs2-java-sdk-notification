package io.gs2.notification.control;

import io.gs2.notification.model.Notification;

/**
 * 通知取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
public class GetNotificationResult {

	/** 通知 */
	Notification item;
	
	/**
	 * 取得した通知を取得。
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
}
