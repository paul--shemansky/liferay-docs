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

package com.nosester.portlet.eventlisting.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.nosester.portlet.eventlisting.model.Location;

import java.io.Serializable;

/**
 * The cache model class for representing Location in entity cache.
 *
 * @author jbloggs
 * @see Location
 * @generated
 */
public class LocationCacheModel implements CacheModel<Location>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{locationId=");
		sb.append(locationId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", streetAddress=");
		sb.append(streetAddress);
		sb.append(", city=");
		sb.append(city);
		sb.append(", stateOrProvince=");
		sb.append(stateOrProvince);
		sb.append(", country=");
		sb.append(country);
		sb.append("}");

		return sb.toString();
	}

	public Location toEntityModel() {
		LocationImpl locationImpl = new LocationImpl();

		locationImpl.setLocationId(locationId);
		locationImpl.setCompanyId(companyId);
		locationImpl.setGroupId(groupId);
		locationImpl.setUserId(userId);
		locationImpl.setCreateDate(createDate);
		locationImpl.setModifiedDate(modifiedDate);

		if (name == null) {
			locationImpl.setName(StringPool.BLANK);
		}
		else {
			locationImpl.setName(name);
		}

		if (description == null) {
			locationImpl.setDescription(StringPool.BLANK);
		}
		else {
			locationImpl.setDescription(description);
		}

		if (streetAddress == null) {
			locationImpl.setStreetAddress(StringPool.BLANK);
		}
		else {
			locationImpl.setStreetAddress(streetAddress);
		}

		if (city == null) {
			locationImpl.setCity(StringPool.BLANK);
		}
		else {
			locationImpl.setCity(city);
		}

		if (stateOrProvince == null) {
			locationImpl.setStateOrProvince(StringPool.BLANK);
		}
		else {
			locationImpl.setStateOrProvince(stateOrProvince);
		}

		if (country == null) {
			locationImpl.setCountry(StringPool.BLANK);
		}
		else {
			locationImpl.setCountry(country);
		}

		locationImpl.resetOriginalValues();

		return locationImpl;
	}

	public long locationId;
	public long companyId;
	public long groupId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String description;
	public String streetAddress;
	public String city;
	public String stateOrProvince;
	public String country;
}