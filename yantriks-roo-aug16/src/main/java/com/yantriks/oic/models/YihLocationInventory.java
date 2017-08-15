package com.yantriks.oic.models;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;

/**
 * Contains inventory including supply and demand for each SKU at each shipping
 * location - all the DCs and Stores. This map also stores internally computed
 * location-level availability. The value in this collection contains a map
 * whose key is supply type or demand type, and the value is the supply or
 * demand quantity. Supplies in your distribution network can be categorized as
 * physical on-hand stock, expected future stock, etc. Similarly demand can be
 * of various types. Some of the demand types are system defined. There can be
 * any number of user defined demand types.
 * 
 * @author pprem
 *
 */
@RooJavaBean
@RooToString
@RooMongoEntity
public class YihLocationInventory {
	/**
	 * Organization code for which inventory is maintained.
	 */
	private String orgCode;
	/**
	 * The shipping location (can be DC or Store)
	 */
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
	 * Either supply or demand type. The following demand types are system
	 * defined: unconfirmeddemand (used when a new, temporary reservation is
	 * created), reserveddemand (used when a permanent reservation is created),
	 * forceddemand (used when a temporary reservation is forced on the system
	 * despite shortage), forcedconfirmeddemand (used when a permanent
	 * reservation is forced on the system despite shortage). Besides this,
	 * onhandsupply is also a system defined value which represents the physical
	 * stock on hand against which orders can be taken. Besides supply and
	 * demand, this field can also be totalAva which is a system defined field
	 * containing the computed availabile to promise value.
	 */
	private String type; // DEMAND or SUPPLY
	/**
	 * The quantity of supply or demand. Decimal values for supplies are not
	 * supported. Supply or demand are allowed to go negative.
	 */
	private Integer quantity;

}
