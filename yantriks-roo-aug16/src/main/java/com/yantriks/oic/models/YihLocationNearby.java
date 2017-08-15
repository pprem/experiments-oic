package com.yantriks.oic.models;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;

/**
 * The purpose of this collection is to be able to quickly access the list of
 * stores that are within a 50 mile radius of a given reference PostalCode. This
 * collection is populated with the combination of (a) yih_postalccodes_nearby
 * which is another collection that provides a list of postal codes and (b)
 * yih_location collection, which provides the list of stores and their postal
 * codes. The collection yih_locations_nearby has nearby shipping locations for
 * ALL postal codes that are defined in the yih_postal_code map having shipping
 * locations within a 50 mile radius. If for a given postal code there is no
 * shipping location within a 50 mile radius, then it won't have an entry in
 * this map.
 * 
 * @author pprem
 *
 */
@RooJavaBean
@RooToString
@RooMongoEntity
public class YihLocationNearby {

	/**
	 * postalCode_50: Postal code with reference to which nearby shipping
	 * locations are cached.
	 */
	private String postalCode_50;

	/**
	 * A Map with key as {orgCode}|{storeID} without parenthesis and the value
	 * is the following attribute.
	 */
	private String nearByStores;

	/**
	 * Distance of this shipping location from the reference postalCode in miles
	 */
	private double distanceToPostalCode;
}
