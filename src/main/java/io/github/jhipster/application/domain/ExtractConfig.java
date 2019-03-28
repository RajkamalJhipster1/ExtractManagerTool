package io.github.jhipster.application.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A ExtractConfig.
 */
@Entity
@Table(name = "extract_config")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ExtractConfig implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "extractname")
    private String extractname;

    @Column(name = "jhi_type")
    private String type;

    @Column(name = "requestingorg")
    private String requestingorg;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "deleted")
    private Boolean deleted;

    @Column(name = "email_contact")
    private String emailContact;

    @Column(name = "created_date")
    private Instant createdDate;

    @OneToMany(mappedBy = "extractConfig")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<ExtractOrganisation> extractids = new HashSet<>();
    @OneToMany(mappedBy = "extractConfig")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<ExtractParts> extractids = new HashSet<>();
    @OneToMany(mappedBy = "extractConfig")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<ExtractDetails> extractids = new HashSet<>();
    @OneToMany(mappedBy = "extractConfig")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<ExtractOrganisationAudit> extractids = new HashSet<>();
    @OneToMany(mappedBy = "extractConfig")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<ExtractAudit> extractids = new HashSet<>();
    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExtractname() {
        return extractname;
    }

    public ExtractConfig extractname(String extractname) {
        this.extractname = extractname;
        return this;
    }

    public void setExtractname(String extractname) {
        this.extractname = extractname;
    }

    public String getType() {
        return type;
    }

    public ExtractConfig type(String type) {
        this.type = type;
        return this;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRequestingorg() {
        return requestingorg;
    }

    public ExtractConfig requestingorg(String requestingorg) {
        this.requestingorg = requestingorg;
        return this;
    }

    public void setRequestingorg(String requestingorg) {
        this.requestingorg = requestingorg;
    }

    public Boolean isActive() {
        return active;
    }

    public ExtractConfig active(Boolean active) {
        this.active = active;
        return this;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean isDeleted() {
        return deleted;
    }

    public ExtractConfig deleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getEmailContact() {
        return emailContact;
    }

    public ExtractConfig emailContact(String emailContact) {
        this.emailContact = emailContact;
        return this;
    }

    public void setEmailContact(String emailContact) {
        this.emailContact = emailContact;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public ExtractConfig createdDate(Instant createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public Set<ExtractOrganisation> getExtractids() {
        return extractids;
    }

    public ExtractConfig extractids(Set<ExtractOrganisation> extractOrganisations) {
        this.extractids = extractOrganisations;
        return this;
    }

    public ExtractConfig addExtractid(ExtractOrganisation extractOrganisation) {
        this.extractids.add(extractOrganisation);
        extractOrganisation.setExtractConfig(this);
        return this;
    }

    public ExtractConfig removeExtractid(ExtractOrganisation extractOrganisation) {
        this.extractids.remove(extractOrganisation);
        extractOrganisation.setExtractConfig(null);
        return this;
    }

    public void setExtractids(Set<ExtractOrganisation> extractOrganisations) {
        this.extractids = extractOrganisations;
    }

    public Set<ExtractParts> getExtractids() {
        return extractids;
    }

    public ExtractConfig extractids(Set<ExtractParts> extractParts) {
        this.extractids = extractParts;
        return this;
    }

    public ExtractConfig addExtractid(ExtractParts extractParts) {
        this.extractids.add(extractParts);
        extractParts.setExtractConfig(this);
        return this;
    }

    public ExtractConfig removeExtractid(ExtractParts extractParts) {
        this.extractids.remove(extractParts);
        extractParts.setExtractConfig(null);
        return this;
    }

    public void setExtractids(Set<ExtractParts> extractParts) {
        this.extractids = extractParts;
    }

    public Set<ExtractDetails> getExtractids() {
        return extractids;
    }

    public ExtractConfig extractids(Set<ExtractDetails> extractDetails) {
        this.extractids = extractDetails;
        return this;
    }

    public ExtractConfig addExtractid(ExtractDetails extractDetails) {
        this.extractids.add(extractDetails);
        extractDetails.setExtractConfig(this);
        return this;
    }

    public ExtractConfig removeExtractid(ExtractDetails extractDetails) {
        this.extractids.remove(extractDetails);
        extractDetails.setExtractConfig(null);
        return this;
    }

    public void setExtractids(Set<ExtractDetails> extractDetails) {
        this.extractids = extractDetails;
    }

    public Set<ExtractOrganisationAudit> getExtractids() {
        return extractids;
    }

    public ExtractConfig extractids(Set<ExtractOrganisationAudit> extractOrganisationAudits) {
        this.extractids = extractOrganisationAudits;
        return this;
    }

    public ExtractConfig addExtractid(ExtractOrganisationAudit extractOrganisationAudit) {
        this.extractids.add(extractOrganisationAudit);
        extractOrganisationAudit.setExtractConfig(this);
        return this;
    }

    public ExtractConfig removeExtractid(ExtractOrganisationAudit extractOrganisationAudit) {
        this.extractids.remove(extractOrganisationAudit);
        extractOrganisationAudit.setExtractConfig(null);
        return this;
    }

    public void setExtractids(Set<ExtractOrganisationAudit> extractOrganisationAudits) {
        this.extractids = extractOrganisationAudits;
    }

    public Set<ExtractAudit> getExtractids() {
        return extractids;
    }

    public ExtractConfig extractids(Set<ExtractAudit> extractAudits) {
        this.extractids = extractAudits;
        return this;
    }

    public ExtractConfig addExtractid(ExtractAudit extractAudit) {
        this.extractids.add(extractAudit);
        extractAudit.setExtractConfig(this);
        return this;
    }

    public ExtractConfig removeExtractid(ExtractAudit extractAudit) {
        this.extractids.remove(extractAudit);
        extractAudit.setExtractConfig(null);
        return this;
    }

    public void setExtractids(Set<ExtractAudit> extractAudits) {
        this.extractids = extractAudits;
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
        ExtractConfig extractConfig = (ExtractConfig) o;
        if (extractConfig.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), extractConfig.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "ExtractConfig{" +
            "id=" + getId() +
            ", extractname='" + getExtractname() + "'" +
            ", type='" + getType() + "'" +
            ", requestingorg='" + getRequestingorg() + "'" +
            ", active='" + isActive() + "'" +
            ", deleted='" + isDeleted() + "'" +
            ", emailContact='" + getEmailContact() + "'" +
            ", createdDate='" + getCreatedDate() + "'" +
            "}";
    }
}
