// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.yantriks.oic.models;

import com.yantriks.oic.models.YihNodeCapacity;
import java.math.BigInteger;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Persistent;

privileged aspect YihNodeCapacity_Roo_Mongo_Entity {
    
    declare @type: YihNodeCapacity: @Persistent;
    
    @Id
    private BigInteger YihNodeCapacity.id;
    
    public BigInteger YihNodeCapacity.getId() {
        return this.id;
    }
    
    public void YihNodeCapacity.setId(BigInteger id) {
        this.id = id;
    }
    
}
