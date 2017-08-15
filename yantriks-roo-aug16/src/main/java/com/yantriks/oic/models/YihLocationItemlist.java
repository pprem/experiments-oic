package com.yantriks.oic.models;

import java.util.List;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;

/**
 * Holds list of items shipped from a shipping location.
 * 
 * @author pprem
 *
 */
@RooJavaBean
@RooToString
@RooMongoEntity
public class YihLocationItemlist {
	/**
	 * Organization code for which inventory is maintained.
	 */
	private String orgCode;
	/**
	 * Unique shipping location identifier.
	 */
	private String storeID;
	/**
	 * List of items shipped from the shipping location.
	 */
	private List itemList;

}
