package io.github.jhipster.application.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A ExtractTables.
 */
@Entity
@Table(name = "extract_tables")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ExtractTables implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tablename")
    private String tablename;

    @Column(name = "is_extractable")
    private Boolean isExtractable;

    @OneToMany(mappedBy = "extractTables")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<ExtractParts> extractTableids = new HashSet<>();
    @OneToMany(mappedBy = "extractTables")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<ExtractOrganisationAudit> extractTableids = new HashSet<>();
    @OneToMany(mappedBy = "extractTables")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<ExtractAudit> extractTableids = new HashSet<>();
    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTablename() {
        return tablename;
    }

    public ExtractTables tablename(String tablename) {
        this.tablename = tablename;
        return this;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public Boolean isIsExtractable() {
        return isExtractable;
    }

    public ExtractTables isExtractable(Boolean isExtractable) {
        this.isExtractable = isExtractable;
        return this;
    }

    public void setIsExtractable(Boolean isExtractable) {
        this.isExtractable = isExtractable;
    }

    public Set<ExtractParts> getExtractTableids() {
        return extractTableids;
    }

    public ExtractTables extractTableids(Set<ExtractParts> extractParts) {
        this.extractTableids = extractParts;
        return this;
    }

    public ExtractTables addExtractTableid(ExtractParts extractParts) {
        this.extractTableids.add(extractParts);
        extractParts.setExtractTables(this);
        return this;
    }

    public ExtractTables removeExtractTableid(ExtractParts extractParts) {
        this.extractTableids.remove(extractParts);
        extractParts.setExtractTables(null);
        return this;
    }

    public void setExtractTableids(Set<ExtractParts> extractParts) {
        this.extractTableids = extractParts;
    }

    public Set<ExtractOrganisationAudit> getExtractTableids() {
        return extractTableids;
    }

    public ExtractTables extractTableids(Set<ExtractOrganisationAudit> extractOrganisationAudits) {
        this.extractTableids = extractOrganisationAudits;
        return this;
    }

    public ExtractTables addExtractTableid(ExtractOrganisationAudit extractOrganisationAudit) {
        this.extractTableids.add(extractOrganisationAudit);
        extractOrganisationAudit.setExtractTables(this);
        return this;
    }

    public ExtractTables removeExtractTableid(ExtractOrganisationAudit extractOrganisationAudit) {
        this.extractTableids.remove(extractOrganisationAudit);
        extractOrganisationAudit.setExtractTables(null);
        return this;
    }

    public void setExtractTableids(Set<ExtractOrganisationAudit> extractOrganisationAudits) {
        this.extractTableids = extractOrganisationAudits;
    }

    public Set<ExtractAudit> getExtractTableids() {
        return extractTableids;
    }

    public ExtractTables extractTableids(Set<ExtractAudit> extractAudits) {
        this.extractTableids = extractAudits;
        return this;
    }

    public ExtractTables addExtractTableid(ExtractAudit extractAudit) {
        this.extractTableids.add(extractAudit);
        extractAudit.setExtractTables(this);
        return this;
    }

    public ExtractTables removeExtractTableid(ExtractAudit extractAudit) {
        this.extractTableids.remove(extractAudit);
        extractAudit.setExtractTables(null);
        return this;
    }

    public void setExtractTableids(Set<ExtractAudit> extractAudits) {
        this.extractTableids = extractAudits;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExtractTables extractTables = (ExtractTables) o;
        if (extractTables.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), extractTables.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "ExtractTables{" +
            "id=" + getId() +
            ", tablename='" + getTablename() + "'" +
            ", isExtractable='" + isIsExtractable() + "'" +
            "}";
    }
}
