package com.yantriks.oic.models;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;

/**
 * 
 * @author pprem
 *
 *         Collection: yih_postal_code Postal codes. Supplied out of the box for
 *         USA.
 */
@RooJavaBean
@RooToString
@RooMongoEntity
public class YihPostalCode {

	/**
	 * Postal code as assigned by the country's postal department.
	 */
	private String postalCode;

	/**
	 * Country. Can be ISO 2-character country code, or preferably the country
	 * code can match the configuration in your enterprise systems (OMS).
	 */
	private String countryCode;

	/**
	 * Geo-position of the shipping location
	 */
	private String longitude;

	/**
	 * Geo-position of the shipping location
	 */
	private String latitude;
}
