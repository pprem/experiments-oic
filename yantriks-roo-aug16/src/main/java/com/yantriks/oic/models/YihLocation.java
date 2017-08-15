package com.yantriks.oic.models;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooMongoEntity

/**
 * Store information about shipping locations (DCs, Stores, etc)
 * 
 * @author premprakash
 *
 */
public class YihLocation {

	/**
	 * orgCode: This is the organization for which you wish to maintain
	 * exclusive inventory. Generally, this inventory will not be shared with
	 * other sub-organizations within your company."
	 */
	private String orgCode;

	/**
	 * storeID: A unique identifier for the shipping location within the
	 * inventory organization. You should select the location identifier such
	 * that it is consistent with what is defined in OMS, for your convenience.
	 * Within Yantriks, the terms "node", "shipping location", "store" are often
	 * interchangeably used. The term "store" within Yantriks is inclusive of
	 * distribution centers (DCs and Regional DCs). Store ID is generally
	 * assigned by your enterprise systems. If you are using IBM Sterling OMS,
	 * the StoreID can be mapped to the OrganizationCode corresponding to the
	 * Store, or to the "identifiedByParentAs" at the ship node level.
	 */
	private String storeID;

	/**
	 * This is a descriptive short name. It is meant to be used in your order
	 * capture channel Uis to display In-Store Pickup options in case of stores.
	 */
	private String storeName;

	/**
	 * “DC” or “STORE” or any other value.
	 */
	private String storeType;

	/**
	 * Geo-position of the shipping location
	 */
	private Double longitude;

	/**
	 * Geo-position of the shipping location
	 */
	private Double latitude;

	/**
	 * Postal code of the store. This is used for computing distances between
	 * the shopper's postal code and the store. System uses this for locating
	 * optimal fulfillment options.
	 */
	private String postalCode;

	/**
	 * Hours taken by the shipping location to prepare the order for shipment.
	 * This, along with other such lead times is used to calculate expected
	 * delivery date as part of availability API.
	 */
	private Integer nodeProcessingTime;

	/**
	 * Time zone of the store expressed as "EST", "PDT" etc. Used for
	 * normalizing date and time conversions and date math.
	 */
	private String timeZone;

	/**
	 * The ISO Alpha-2 country code of the postal address of the store. For
	 * example, The united States of America is expressed as "US".
	 */
	private String countryCode;

}
