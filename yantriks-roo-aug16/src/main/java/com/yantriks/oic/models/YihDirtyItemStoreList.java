package com.yantriks.oic.models;
import java.util.List;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;
/**
 * Maps a list of stores which are unavailable to serve a request for a given item.
 * @author pprem
 *
 */
@RooJavaBean
@RooToString
@RooMongoEntity
public class YihDirtyItemStoreList {
	/**
	 *  Organization code for which inventory is maintained.
	 */
	private String orgCode;
	/**
	 * SKU
	 */

	private String itemID;
	/**
	 * List of stores which are marked as 'dirty' for a given item. The stores will not be able to server a fulfillment request for the item.
 
	 */
	private List storeList;


}
