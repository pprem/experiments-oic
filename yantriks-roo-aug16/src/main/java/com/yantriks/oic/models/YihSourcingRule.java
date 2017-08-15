package com.yantriks.oic.models;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;

/**
 * Rules governing how product is sourced to be shipped. This is used for
 * computing ship date, delivery date and shipping location. Sourcing rules can
 * be defined for a combination of (1) orgCode and region OR (2) orgCode and
 * itemClassification OR (3) orgCode and itemID. This collection's value is in
 * turn a map with key as priority and value as a shipping location. Thus, you
 * can define a set of shipping locations by priority for a given criteria such
 * as region or item classifiation or item.
 * 
 * @author pprem
 *
 */
@RooJavaBean
@RooToString
@RooMongoEntity
public class YihSourcingRule {
/**
 * Organization code for which inventory is maintained.
 */
	private String orgCode;
	/**
	 * If shipping to this region, use these set of shipping locations.
	 */
	private String region;
	/**
	 * If shipping SKUs having this itemClassification, then use these set of shipping locations
	 */
	private String itemClassification;
	/**
	 * If shipping this SKU, then use these set of shipping locations.

Value:	
	 */
	private String itemID;
/**
 * Entries with numerically lower value of this field are given higher priority. That is, an entry with priority of 1 will get picked up first for sourcing.
 */
	private Integer priority;
	/**
	 * 	The shipping location (can be DC or Store)
	 */
	private String storeID;

}
