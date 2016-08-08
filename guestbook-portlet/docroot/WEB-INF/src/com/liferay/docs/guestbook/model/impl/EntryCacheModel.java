/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.docs.guestbook.model.impl;

import com.liferay.docs.guestbook.model.Entry;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing Entry in entity cache.
 *
 * @author Administrator
 * @see Entry
 * @generated
 */
public class EntryCacheModel implements CacheModel<Entry>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", entryId=");
		sb.append(entryId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", email=");
		sb.append(email);
		sb.append(", entry=");
		sb.append(entry);
		sb.append(", guestbookId=");
		sb.append(guestbookId);
		sb.append(", message=");
		sb.append(message);
		sb.append("}");

		return sb.toString();
	}

	public Entry toEntityModel() {
		EntryImpl entryImpl = new EntryImpl();

		if (uuid == null) {
			entryImpl.setUuid(StringPool.BLANK);
		}
		else {
			entryImpl.setUuid(uuid);
		}

		entryImpl.setEntryId(entryId);
		entryImpl.setGroupId(groupId);
		entryImpl.setCompanyId(companyId);
		entryImpl.setUserId(userId);

		if (userName == null) {
			entryImpl.setUserName(StringPool.BLANK);
		}
		else {
			entryImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			entryImpl.setCreateDate(null);
		}
		else {
			entryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			entryImpl.setModifiedDate(null);
		}
		else {
			entryImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			entryImpl.setName(StringPool.BLANK);
		}
		else {
			entryImpl.setName(name);
		}

		if (email == null) {
			entryImpl.setEmail(StringPool.BLANK);
		}
		else {
			entryImpl.setEmail(email);
		}

		if (entry == null) {
			entryImpl.setEntry(StringPool.BLANK);
		}
		else {
			entryImpl.setEntry(entry);
		}

		entryImpl.setGuestbookId(guestbookId);

		if (message == null) {
			entryImpl.setMessage(StringPool.BLANK);
		}
		else {
			entryImpl.setMessage(message);
		}

		entryImpl.resetOriginalValues();

		return entryImpl;
	}

	public String uuid;
	public long entryId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String email;
	public String entry;
	public long guestbookId;
	public String message;
}