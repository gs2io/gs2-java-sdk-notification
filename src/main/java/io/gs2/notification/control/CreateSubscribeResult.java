package io.gs2.notification.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.notification.model.Subscribe;

/**
 * 通知先の作成結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class CreateSubscribeResult {
	
	Subscribe item;
	
	/**
	 * 通知先を取得。
	 * 
	 * @return 通知先
	 */
	public Subscribe getItem() {
		return item;
	}
	
	/**
	 * 通知先を設定。
	 * 
	 * @param item 通知先
	 */
	public void setItem(Subscribe item) {
		this.item = item;
	}
	
	/**
	 * 通知先を設定。
	 * 
	 * @param item 通知先
	 * @return this
	 */
	public CreateSubscribeResult withItem(Subscribe item) {
		setItem(item);
		return this;
	}
}
