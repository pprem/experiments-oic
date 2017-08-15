package com.yantriks.oic.models;
import java.util.List;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooMongoEntity
public class YihDistributionGroup {
	
	private String orgCode;
	private String distributionRuleId;
	
	private Integer priority;
	private List storeList;
	
	
	
	
}
