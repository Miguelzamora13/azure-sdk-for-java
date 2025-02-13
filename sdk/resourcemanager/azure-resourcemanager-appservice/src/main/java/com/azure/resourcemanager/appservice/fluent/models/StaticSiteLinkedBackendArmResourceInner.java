// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Static Site Linked Backend ARM resource. */
@Fluent
public final class StaticSiteLinkedBackendArmResourceInner extends ProxyOnlyResource {
    /*
     * StaticSiteLinkedBackendARMResource resource specific properties
     */
    @JsonProperty(value = "properties")
    private StaticSiteLinkedBackendArmResourceProperties innerProperties;

    /** Creates an instance of StaticSiteLinkedBackendArmResourceInner class. */
    public StaticSiteLinkedBackendArmResourceInner() {
    }

    /**
     * Get the innerProperties property: StaticSiteLinkedBackendARMResource resource specific properties.
     *
     * @return the innerProperties value.
     */
    private StaticSiteLinkedBackendArmResourceProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public StaticSiteLinkedBackendArmResourceInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the backendResourceId property: The resource id of the backend linked to the static site.
     *
     * @return the backendResourceId value.
     */
    public String backendResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().backendResourceId();
    }

    /**
     * Set the backendResourceId property: The resource id of the backend linked to the static site.
     *
     * @param backendResourceId the backendResourceId value to set.
     * @return the StaticSiteLinkedBackendArmResourceInner object itself.
     */
    public StaticSiteLinkedBackendArmResourceInner withBackendResourceId(String backendResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StaticSiteLinkedBackendArmResourceProperties();
        }
        this.innerProperties().withBackendResourceId(backendResourceId);
        return this;
    }

    /**
     * Get the region property: The region of the backend linked to the static site.
     *
     * @return the region value.
     */
    public String region() {
        return this.innerProperties() == null ? null : this.innerProperties().region();
    }

    /**
     * Set the region property: The region of the backend linked to the static site.
     *
     * @param region the region value to set.
     * @return the StaticSiteLinkedBackendArmResourceInner object itself.
     */
    public StaticSiteLinkedBackendArmResourceInner withRegion(String region) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StaticSiteLinkedBackendArmResourceProperties();
        }
        this.innerProperties().withRegion(region);
        return this;
    }

    /**
     * Get the createdOn property: The date and time on which the backend was linked to the static site.
     *
     * @return the createdOn value.
     */
    public OffsetDateTime createdOn() {
        return this.innerProperties() == null ? null : this.innerProperties().createdOn();
    }

    /**
     * Get the provisioningState property: The provisioning state of the linking process.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
