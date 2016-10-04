package io.gs2.notification.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 通知先
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Subscribe implements Serializable {

	/** 通知先ID */
	String subscribeId;
	/** 通知ID */
	String notificationId;
	/** 通知プロトコル */
	String type;
	/** 通知先 */
	String endpoint;
	/** 作成日時 */
	Long createAt;
	
	/**
	 * 通知先IDを取得
	 * 
	 * @return 通知先ID
	 */
	public String getSubscribeId() {
		return subscribeId;
	}
	
	/**
	 * 通知先IDを設定
	 * 
	 * @param subscribeId 通知先ID
	 */
	public void setSubscribeId(String subscribeId) {
		this.subscribeId = subscribeId;
	}
	
	/**
	 * 通知IDを取得
	 * 
	 * @return 通知ID
	 */
	public String getNotificationId() {
		return notificationId;
	}
	
	/**
	 * 通知IDを設定
	 * 
	 * @param notificationId 通知ID
	 */
	public void setNotificationId(String notificationId) {
		this.notificationId = notificationId;
	}
	
	/**
	 * 通知プロトコルを取得
	 * 
	 * @return 通知プロトコル
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * 通知プロトコルを設定
	 * 
	 * @param type 通知プロトコル
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * 通知先を取得
	 * 
	 * @return 通知先
	 */
	public String getEndpoint() {
		return endpoint;
	}
	
	/**
	 * 通知先を設定
	 * 
	 * @param endpoint 通知先
	 */
	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}
	
	/**
	 * 作成日時を取得
	 * 
	 * @return 作成日時
	 */
	public Long getCreateAt() {
		return createAt;
	}
	
	/**
	 * 作成日時を設定
	 * 
	 * @param createAt 作成日時
	 */
	public void setCreateAt(Long createAt) {
		this.createAt = createAt;
	}
}
