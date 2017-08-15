package com.yantriks.oic.models;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;
/**
 * Contains average lead time for carrier to any destination
 * @author premprakash
 *
 */
@RooJavaBean
@RooToString
@RooMongoEntity
public class YihCarrierProcessingTime {

    /**
     * Combination of a 4 digit SCAC Code and service codes. This collection maintains the average transit time SLA provided by the carrier for the given service.
     */
    private String carrierService;

    /**
     * Standard SLA time in hours as defined by the carrier, for the given service. For instance, a 2 day service by Fedex would have the Transit Time as 48.
     */
    private int transitTime;

    /**
     * Name of the Carrier Service.
     */
    private String scacAndService;

    /**
     * A date/day based mapping of pickup cutoff time.
     */
    private String cutoffData;
}
