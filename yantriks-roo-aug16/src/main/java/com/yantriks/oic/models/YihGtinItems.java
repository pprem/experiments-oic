package com.yantriks.oic.models;

import java.util.List;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;

/**
 * The list of items with same GTIN.
 * 
 * @author pprem
 *
 */
@RooJavaBean
@RooToString
@RooMongoEntity
public class YihGtinItems {
	/**
	 * Organization code for which inventory is maintained.
	 */
	private String orgCod;
	/**
	 * GTIN
	 */
	private String gtin;
	/**
	 * List of items with same GTIN. The items can be substituted with each
	 * other if substitution is allowed for the item.
	 */
	private List items;
}
