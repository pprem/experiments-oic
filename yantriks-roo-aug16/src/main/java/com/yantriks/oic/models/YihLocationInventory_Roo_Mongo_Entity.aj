// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.yantriks.oic.models;

import com.yantriks.oic.models.YihLocationInventory;
import java.math.BigInteger;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Persistent;

privileged aspect YihLocationInventory_Roo_Mongo_Entity {
    
    declare @type: YihLocationInventory: @Persistent;
    
    @Id
    private BigInteger YihLocationInventory.id;
    
    public BigInteger YihLocationInventory.getId() {
        return this.id;
    }
    
    public void YihLocationInventory.setId(BigInteger id) {
        this.id = id;
    }
    
}
