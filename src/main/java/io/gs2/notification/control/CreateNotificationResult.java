package io.gs2.notification.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.notification.model.Notification;

/**
 * 通知の作成結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class CreateNotificationResult {
	
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
	public CreateNotificationResult withItem(Notification item) {
		setItem(item);
		return this;
	}
}
