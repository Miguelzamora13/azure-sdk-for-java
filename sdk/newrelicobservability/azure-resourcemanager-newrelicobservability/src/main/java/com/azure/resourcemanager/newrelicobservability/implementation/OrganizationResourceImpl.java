// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.newrelicobservability.fluent.models.OrganizationResourceInner;
import com.azure.resourcemanager.newrelicobservability.models.BillingSource;
import com.azure.resourcemanager.newrelicobservability.models.OrganizationResource;

public final class OrganizationResourceImpl implements OrganizationResource {
    private OrganizationResourceInner innerObject;

    private final com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager serviceManager;

    OrganizationResourceImpl(
        OrganizationResourceInner innerObject,
        com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String organizationId() {
        return this.innerModel().organizationId();
    }

    public String organizationName() {
        return this.innerModel().organizationName();
    }

    public BillingSource billingSource() {
        return this.innerModel().billingSource();
    }

    public OrganizationResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager manager() {
        return this.serviceManager;
    }
}
