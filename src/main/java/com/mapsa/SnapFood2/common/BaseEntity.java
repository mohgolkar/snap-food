package com.mapsa.SnapFood2.common;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.util.Date;
@EntityListeners({AuditingEntityListener.class})
@MappedSuperclass
public class BaseEntity {
    @CreatedDate
    private Date lastdata;

    @LastModifiedDate
    private Date lastModifiredata;

    @CreatedBy
    private String createdBy;

    @LastModifiedBy
    private String lastmodifyBy;

    @Version
    private Integer version;

    public Date getLastdata() {
        return lastdata;
    }

    public void setLastdata(Date lastdata) {
        this.lastdata = lastdata;
    }

    public Date getLastModifiredata() {
        return lastModifiredata;
    }

    public void setLastModifiredata(Date lastModifiredata) {
        this.lastModifiredata = lastModifiredata;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getLastmodifyBy() {
        return lastmodifyBy;
    }

    public void setLastmodifyBy(String lastmodifyBy) {
        this.lastmodifyBy = lastmodifyBy;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
