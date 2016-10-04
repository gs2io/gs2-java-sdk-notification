package io.gs2.notification.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.notification.Gs2Notification;

/**
 * 通知先一覧の取得リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class DescribeSubscribeRequest extends Gs2BasicRequest<DescribeSubscribeRequest> {

	public static class Constant extends Gs2Notification.Constant {
		public static final String FUNCTION = "DescribeSubscribe";
	}

	/** 通知名 */
	String notificationName;
	/** 取得開始位置トークン */
	String pageToken;
	/** 取得件数 */
	Integer limit;

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
	public DescribeSubscribeRequest withNotificationName(String notificationName) {
		setNotificationName(notificationName);
		return this;
	}

	/**
	 * 取得開始位置トークンを取得。
	 * 
	 * @return 取得開始位置トークン
	 */
	public String getPageToken() {
		return pageToken;
	}
	
	/**
	 * 取得開始位置トークンを設定。
	 * 
	 * @param pageToken 取得開始位置トークン
	 */
	public void setPageToken(String pageToken) {
		this.pageToken = pageToken;
	}
	
	/**
	 * 取得開始位置トークンを設定。
	 * 
	 * @param pageToken 取得開始位置トークン
	 * @return this
	 */
	public DescribeSubscribeRequest withPageToken(String pageToken) {
		setPageToken(pageToken);
		return this;
	}

	/**
	 * 取得件数を取得。
	 * 
	 * @return 取得件数
	 */
	public Integer getLimit() {
		return limit;
	}
	
	/**
	 * 取得件数を設定。
	 * 
	 * @param limit 取得件数
	 */
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	
	/**
	 * 取得件数を設定。
	 * 
	 * @param limit 取得件数
	 * @return this
	 */
	public DescribeSubscribeRequest withLimit(Integer limit) {
		setLimit(limit);
		return this;
	}
}
