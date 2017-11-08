/*
 * Copyright 2016 Game Server Services, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package io.gs2.notification.control;

import org.json.JSONObject;
import java.util.List;
import io.gs2.notification.Gs2Notification;
import io.gs2.control.Gs2BasicRequest;

/**
 * @author Game Server Services, Inc.
 */
@SuppressWarnings("serial")
public class DeleteNotificationRequest extends Gs2BasicRequest<DeleteNotificationRequest> {

	public static class Constant extends Gs2Notification.Constant {
		public static final String FUNCTION = "DeleteNotification";
	}

	/** 通知の名前を指定します。 */
	private String notificationName;


	/**
	 * 通知の名前を指定します。を取得
	 *
	 * @return 通知の名前を指定します。
	 */
	public String getNotificationName() {
		return notificationName;
	}

	/**
	 * 通知の名前を指定します。を設定
	 *
	 * @param notificationName 通知の名前を指定します。
	 */
	public void setNotificationName(String notificationName) {
		this.notificationName = notificationName;
	}

	/**
	 * 通知の名前を指定します。を設定
	 *
	 * @param notificationName 通知の名前を指定します。
	 * @return this
	 */
	public DeleteNotificationRequest withNotificationName(String notificationName) {
		setNotificationName(notificationName);
		return this;
	}

}