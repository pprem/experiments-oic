package com.yantriks.oic.models;
import java.util.Map;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;


/**
 * Contains SKUs for which inventory needs to be maintained.
 * @author pprem
 *
 */
@RooJavaBean
@RooToString
@RooMongoEntity
public class YihItem {

    /**
     * Organization code for which inventory is maintained.
     */
    private String orgCode;
    /**
     * SKU
     */
    private String itemID;
    /**
     * Unit of Measure
     */
    private String uom;
    /**
     * An item attribute that can be used for setting up various rules governing availability caculation.
     */
    private String itemClassification;
    /**
     * 	Additional processing time taken to get this product ready for shipping.
     */
    private Integer itemProcessingTime;
    /**
     * Short description for the item
     */
    private String shortDesc;
    /**
     * A collection of mappings between channels (like Marketplace) and safety factor for the item at enterprise level.
     */
    private Map enterpriseLevelSafetyStock;
    /**
     * A collection of mappings between channels (like Marketplace) and safety factor for the item at shipping location level.
     */
    private Map locationLevelSafetyStock;
    /**
     * GTIN
     */
    private String gtin;
    /**
     * In case of shortage, can the item be substituted with an item having the same GTIN?
     */
    private String isSubstitutionAllowed;
    /**
     * A channel based mapping for publishing ATP change details to Kafka. The values define if publishing should be for every change or only if a threshold is reached.
     */
    private Map atpSubscription;

   
}
