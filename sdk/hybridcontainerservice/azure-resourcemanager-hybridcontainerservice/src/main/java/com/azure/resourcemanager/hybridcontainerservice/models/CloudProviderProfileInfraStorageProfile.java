// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** InfraStorageProfile - List of infra storage profiles for the provisioned cluster. */
@Fluent
public final class CloudProviderProfileInfraStorageProfile {
    /*
     * Reference to azure resource corresponding to the new HybridAKSStorage object e.g.
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.HybridContainerService/storageSpaces/{storageSpaceName}
     */
    @JsonProperty(value = "storageSpaceIds")
    private List<String> storageSpaceIds;

    /** Creates an instance of CloudProviderProfileInfraStorageProfile class. */
    public CloudProviderProfileInfraStorageProfile() {
    }

    /**
     * Get the storageSpaceIds property: Reference to azure resource corresponding to the new HybridAKSStorage object
     * e.g.
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.HybridContainerService/storageSpaces/{storageSpaceName}.
     *
     * @return the storageSpaceIds value.
     */
    public List<String> storageSpaceIds() {
        return this.storageSpaceIds;
    }

    /**
     * Set the storageSpaceIds property: Reference to azure resource corresponding to the new HybridAKSStorage object
     * e.g.
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.HybridContainerService/storageSpaces/{storageSpaceName}.
     *
     * @param storageSpaceIds the storageSpaceIds value to set.
     * @return the CloudProviderProfileInfraStorageProfile object itself.
     */
    public CloudProviderProfileInfraStorageProfile withStorageSpaceIds(List<String> storageSpaceIds) {
        this.storageSpaceIds = storageSpaceIds;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
