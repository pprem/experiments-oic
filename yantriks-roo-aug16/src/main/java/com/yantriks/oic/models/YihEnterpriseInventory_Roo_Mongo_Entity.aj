// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.yantriks.oic.models;

import com.yantriks.oic.models.YihEnterpriseInventory;
import java.math.BigInteger;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Persistent;

privileged aspect YihEnterpriseInventory_Roo_Mongo_Entity {
    
    declare @type: YihEnterpriseInventory: @Persistent;
    
    @Id
    private BigInteger YihEnterpriseInventory.id;
    
    public BigInteger YihEnterpriseInventory.getId() {
        return this.id;
    }
    
    public void YihEnterpriseInventory.setId(BigInteger id) {
        this.id = id;
    }
    
}
