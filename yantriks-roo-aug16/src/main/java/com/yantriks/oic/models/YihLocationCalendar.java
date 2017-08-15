package com.yantriks.oic.models;

import java.util.Date;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;

/**
 * 
 * Collection: yih_location_calendar Working shift calendar for the shipping
 * location. This is used for computing lead time for shipping (and procurement)
 * 
 * @author pprem
 *
 */
@RooJavaBean
@RooToString
@RooMongoEntity
public class YihLocationCalendar {
	/**
	 * Organization code for which inventory is maintained.
	 * 
	 * 
	 */
	private String orgCode;
	/**
	 * Shipping location for which calendar is being defined.
	 */
	private String storeID;
	/**
	 * Date (yyyy-mm-dd) from which this calendar is effective.
	 */
	private Date date;
	/**
	 * start of shift time in Unix EPOC time format.
	 */
	private Integer startshifttime;
	/**
	 * end of shift of shift time in Unix EPOC time format.
	 */
	private Integer endshifttime;

}
