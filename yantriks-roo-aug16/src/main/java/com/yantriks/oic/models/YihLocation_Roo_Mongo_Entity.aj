// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.yantriks.oic.models;

import com.yantriks.oic.models.YihLocation;
import java.math.BigInteger;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Persistent;

privileged aspect YihLocation_Roo_Mongo_Entity {
    
    declare @type: YihLocation: @Persistent;
    
    @Id
    private BigInteger YihLocation.id;
    
    public BigInteger YihLocation.getId() {
        return this.id;
    }
    
    public void YihLocation.setId(BigInteger id) {
        this.id = id;
    }
    
}
