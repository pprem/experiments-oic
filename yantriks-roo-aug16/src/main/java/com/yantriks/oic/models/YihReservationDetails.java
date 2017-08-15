package com.yantriks.oic.models;
import java.util.Map;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;
/**
 * Contains reservation details for one or more lineID consisting of a given item and quantity. The reservation may be confirmed or temporary. Temporary reservations can be evicted after expiry of time-to-live. Reservation can be done at enterprise level as well as shipping location level.
 * @author pprem
 *
 */
@RooJavaBean
@RooToString
@RooMongoEntity
public class YihReservationDetails {
	/**
	 * Organization code for which inventory is maintained.
	 */
	private String orgCode;
	/**
	 * Unique reservation identifier passed by any order capture channel.
	 */
	private String reservationID;
	/**
	 * Unique identifier for a line item within the context of the request. For an enterprise level reservation, the line item is represented as a combination of lineID, itemID and unit of measure. For a store level reservation, the line item is represented as a combination of lineID, storeID, itemID and unit of measure.
	 */

	private String lineID;
	/**
	 * Quantity ordered.
	 */
	private Integer qty;
	/**
	 * SKU
	 */
	private String itemID;
	/**
	 * Confirmation status for the reservation. Possible values can be Unconfirmed Demand, Forced Demand, Reserved Demand and Forced Confirmed Demand.
	 */
	private String isConfirmed;
	/**
	 * Current ordered quantity.
	 */
	private String currentQty;
	/**
	 * 	For change request, this field gives the value for originally ordered quantity.
	 */
	private String originalOrderedQty;
	/**
	 * For forced reservation, this field holds the value of shortage quantity.
	 */
	private String shortageQty;
	/**
	 * 	Quantity shipped.
	 */
	private String shippedQty;
	/**
	 * If substitution was required to fulfill the reservation request.
	 */
	private Boolean isSubstitutionDone;
	/**
	 * 	For substitution, a mapping between substitued item and quantity substituted.
	 */
	private Map substitutedItemQty;
}
