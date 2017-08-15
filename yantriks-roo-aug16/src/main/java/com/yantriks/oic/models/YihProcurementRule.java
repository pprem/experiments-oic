package com.yantriks.oic.models;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;

/**
 * Rules governing how product is procured from a DC into a Store for shipping
 * or pickup. This is used for computing ship date and delivery date.
 * Procurement rules can be defined for a combination of (1) orgCode and region
 * OR (2) orgCode and itemClassification OR (3) orgCode and itemID. This
 * collection's value is in turn a map with key as priority and value as a
 * procure-from shipping location. Thus, you can define a set of procure-from
 * shipping locations by priority for a given criteria such as region or item
 * classifiation or item.
 * 
 * @author pprem
 *
 */
@RooJavaBean
@RooToString
@RooMongoEntity
public class YihProcurementRule {
	/**
	 * The organization code to which the store belongs to.
	 */
	private String orgCode;
	private String itemClassification;
	private String itemID;
	private String region;
	/**
	 * Entries with numerically lower value of this field are given higher
	 * priority. That is, an entry with priority of 1 will get picked up first
	 * for sourcing.
	 */
	private Integer priority;
	/**
	 * The ID uniquely identifying a shipping location (can be DC or Store)
	 */
	private String storeID;
	/**
	 * “DC” or “STORE” or any other value.
	 */
	private String storeType;
	/**
	 * ID representing the distribution group for the rule. This distribution
	 * group will be used for procurement if store ID is not set.
	 */
	private String distributionRuleId;

}
