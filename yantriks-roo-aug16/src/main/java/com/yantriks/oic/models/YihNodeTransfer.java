package com.yantriks.oic.models;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;

/**
 * Maintains the information about transit time from one node to another node
 * 
 * @author pprem
 *
 */
@RooJavaBean
@RooToString
@RooMongoEntity
public class YihNodeTransfer {
	/**
	 * A unique identifier for the shipping location to which the procurement is
	 * to be done.
	 * 
	 * 
	 */
	private String toNode;
	/**
	 * A unique identifier for the shipping location from which the procurement
	 * is to be done.
	 */
	private String fromNode;
	/**
	 * The name of days of week(Ex-Sunday,Monday etc.) or a particular
	 * date(Ex-12-01-2016).
	 */
	private String daysOfweek;
	/**
	 * Represents the transit time taken to ship an item from source shipping
	 * location to destination shipping location.
	 */
	private Double transitDays;

}
