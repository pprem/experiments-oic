package com.yantriks.oic.models;

import java.util.Date;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;

/**
 * You can configure a capacity for each of your stores that controls how many
 * units can be processed from a store for shipping. System tracks how many
 * units are already already allocated to that store, and once the capacity is
 * met, system will consider that no more orders can be shipped from that store
 * for that day. This information is used in computing delivery date. For
 * instance, if you have just one unit of ITEM001 remaining in stock in your
 * entire distribution network, and that happens to be located in STORE001. But,
 * lets say that the STORE001 has already met its capacity to ship for the day
 * because of the demand for other SKUs. Then, the shipping cannot be done this
 * day, it can only be done the next day. This information is used in arriving
 * at expected delivery date.
 * 
 * @author pprem
 *
 */
@RooJavaBean
@RooToString
@RooMongoEntity
public class YihNodeCapacity {
	/**
	 * Organization code for which inventory is maintained.
	 */
	private String orgCode;
	/**
	 * Shipping location for which capacity is being defined.
	 */
	private String storeID;
	/**
	 * The capacity to ship in the current day.
	 */
	private Integer standardCapacity;
	/**
	 * Not used. Presently the unit of measure is assumed to be units, or
	 * "EACH".
	 */
	private String capacityUnitOfMeasure;
	/**
	 * The remaining available capacity to ship in the current day.
	 */
	private Integer availableCapacity;
	/**
	 * Date till which the node capacity will be effective.
	 */
	private Date date;

}
