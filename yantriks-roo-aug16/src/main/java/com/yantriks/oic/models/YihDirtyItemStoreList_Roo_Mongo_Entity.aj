// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.yantriks.oic.models;

import com.yantriks.oic.models.YihDirtyItemStoreList;
import java.math.BigInteger;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Persistent;

privileged aspect YihDirtyItemStoreList_Roo_Mongo_Entity {
    
    declare @type: YihDirtyItemStoreList: @Persistent;
    
    @Id
    private BigInteger YihDirtyItemStoreList.id;
    
    public BigInteger YihDirtyItemStoreList.getId() {
        return this.id;
    }
    
    public void YihDirtyItemStoreList.setId(BigInteger id) {
        this.id = id;
    }
    
}
