package io.gs2.notification.control;

import java.util.List;

import io.gs2.notification.model.Notification;

/**
 * 通知一覧取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
public class DescribeNotificationResult {

	/** 通知一覧 */
	List<Notification> items;
	/** 次のページを取得するためのトークン */
	String nextPageToken;
	
	/**
	 * 取得した通知数を取得。
	 * 
	 * @return 取得した通知数
	 */
	public Integer getCount() {
		return items == null ? null : items.size();
	}
	
	@Deprecated
	public void setCount(Integer count){ }
	
	/**
	 * 取得した通知一覧を取得。
	 * 
	 * @return 通知一覧
	 */
	public List<Notification> getItems() {
		return items;
	}
	
	/**
	 * 通知一覧を設定。
	 * 
	 * @param items 通知一覧
	 */
	public void setItems(List<Notification> items) {
		this.items = items;
	}
	
	/**
	 * 次のページを取得するためのトークンを取得。
	 * 
	 * {@link DescribeNotificationRequest} に指定することで、次のページを取得できます。
	 * 
	 * @return トークン
	 */
	public String getNextPageToken() {
		return nextPageToken;
	}
	
	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
	}
}
