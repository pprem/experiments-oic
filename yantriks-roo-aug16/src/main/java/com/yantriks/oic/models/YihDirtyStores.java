package com.yantriks.oic.models;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;
/**
 * Shipping locations unavailable to serve fulfillment requests. Hence, quantity for an item available in a dirty store should not be included in ATP calculation (unless ATP is pre-calculated).
 * @author pprem
 *
 */
@RooJavaBean
@RooToString
@RooMongoEntity
public class YihDirtyStores {
	/**
	 * Organization code for which inventory is maintained.
	 */
	private String orgCode;
/**
 * Shipping location which has become 'dirty' (that is, unavailable to handle requests).
 */
	private String storeID;
	/**
	 * Item which cannot be shipped out of the shipping location. If no itemID is set, then the shipping location can be considered 'dirty' for all items..
	 */
	private String itemID;
	/**
	 * Unit of Measure.
	 */
	private String uom;
	/**
	 * 	The date from which the shipping location should be considered unavailable..
	 */
	private String startDate;
	/**
	 * The date up till which the shipping location should be considered 'dirty'.
	 */
	private String endDate;
}
