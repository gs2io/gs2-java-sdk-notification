package io.gs2.notification.control;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.notification.model.Subscribe;

/**
 * 通知先一覧取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class DescribeSubscribeResult {

	/** 通知先一覧 */
	List<Subscribe> items;
	/** 次のページを取得するためのトークン */
	String nextPageToken;
	
	/**
	 * 取得した通知先数を取得。
	 * 
	 * @return 取得した通知先数
	 */
	public Integer getCount() {
		return items == null ? null : items.size();
	}
	
	@Deprecated
	public void setCount(Integer count){ }
	
	/**
	 * 取得した通知先一覧を取得。
	 * 
	 * @return 通知先一覧
	 */
	public List<Subscribe> getItems() {
		return items;
	}
	
	/**
	 * 通知先一覧を設定。
	 * 
	 * @param items 通知先一覧
	 */
	public void setItems(List<Subscribe> items) {
		this.items = items;
	}
	
	/**
	 * 次のページを取得するためのトークンを取得。
	 * 
	 * {@link DescribeSubscribeRequest} に指定することで、次のページを取得できます。
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
