package com.yantriks.oic.models;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;

/**
 * Holds the timestamp of record generated for inventory demand information for
 * absolute feeds.
 * 
 * @author pprem
 *
 */
@RooJavaBean
@RooToString
@RooMongoEntity
public class YihTimeStampInventory {
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
	 * 
	 * type
	 * 
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
	 * 
	 * 
	 */

	private String type;

	/**
	 * Represents the time when the record was generated.
	 */
	
	private Long timestamp;

}
