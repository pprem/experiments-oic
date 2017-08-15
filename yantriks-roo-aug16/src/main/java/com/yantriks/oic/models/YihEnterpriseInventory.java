package com.yantriks.oic.models;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;

/**
 * Contains enterprise level supply, demand and available to promise quantity.
 * All the incremental or absolute feeds at the shipping location level relating
 * to supply / demand are propagated up to enterprise level, and stored in this
 * map. For instance, as part of the incremental feed, inventory at a DC is
 * increased by 10 units. There are two collections within Yantriks that are
 * impacted. First, the yih_location_inventory collection is updated to
 * increment the supply position. Here, if the record is already present, the
 * quantity is updated, and if the record is not already present, a new record
 * is inserted. Next, this present collection of yih_enterprise_inventory, which
 * maintains enterprise level inventory is updated.
 * 
 * @author pprem
 *
 */
@RooJavaBean
@RooToString
@RooMongoEntity
public class YihEnterpriseInventory {
	/**
	 * Organization code for which inventory is maintained.
	 * 
	 * 
	 */
	private String orgCode;

	private String storeID;
	/**
	 * SKU
	 */
	private String itemID;
	/**
	 * Unit of Measure
	 */
	private String uom;
	/**
	 * Please refer to the field by the same name in the yih_location_inventory
	 * map above for a detailed explanation.
	 */
	private String type; // DEMAND or SUPPLY
	/**
	 * The quantity of supply or demand. Decimal values for supplies are not
	 * supported. Supply or demand are allowed to go negative.
	 */
	private Integer quantity;
}
