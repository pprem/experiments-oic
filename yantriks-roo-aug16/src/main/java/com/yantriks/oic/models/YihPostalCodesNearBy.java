package com.yantriks.oic.models;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;

/**
 * Contains a list of all postal codes and a set of surrounding postal codes within a 50 mile radius. Used for computing nearby shipping locations. Supplied out of the box for USA.
 * @author pprem
 *
 */
@RooJavaBean
@RooToString
@RooMongoEntity
public class YihPostalCodesNearBy {

    /**
     * Postal code with reference to which nearby postal codes are cached.
     */
    private String postalCode_50;

    /**
     * A Map with key "postalCode" and the value "distanceToPostalCode" as defined below.
     */
    private double distanceToPostalCode;

    /**
     * Distance of this shipping location from the reference postalCode in miles
     */
    private String nearByPostalCodes;
}
