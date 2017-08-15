package com.yantriks.oic.models;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;

/**
 * Your distribution network can be divided into various zones, so as to be able
 * to define various configurations at the regional level. This collection makes
 * it easy to lookup the region to which a postal code belongs.
 * 
 * @author pprem
 *
 */
@RooJavaBean
@RooToString
@RooMongoEntity
public class YihRegion {
	/**
	 * postalCode for which region is being defined
	 */
	private String postalCode;
	/**
	 * An identifier code for the region
	 */
	private String region;
}
