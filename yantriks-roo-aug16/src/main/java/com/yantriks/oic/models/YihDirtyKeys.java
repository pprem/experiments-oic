package com.yantriks.oic.models;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;
/**
 * 
Collection: yih_dirty_keys
A concise way to store if a storeID - itemID combination has become 'dirty'.
 * @author pprem
 *
 */
@RooJavaBean
@RooToString
@RooMongoEntity
public class YihDirtyKeys {
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
	 * Denotes if the storeID - itemID combination has become 'dirty'.
	 */
	private Boolean isDirty;

}
