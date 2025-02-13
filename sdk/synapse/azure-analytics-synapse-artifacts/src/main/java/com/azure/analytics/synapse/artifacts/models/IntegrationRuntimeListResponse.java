// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of integration runtime resources. */
@Fluent
public final class IntegrationRuntimeListResponse {
    /*
     * List of integration runtimes.
     */
    @JsonProperty(value = "value", required = true)
    private List<IntegrationRuntimeResource> value;

    /*
     * The link to the next page of results, if any remaining results exist.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of IntegrationRuntimeListResponse class. */
    public IntegrationRuntimeListResponse() {}

    /**
     * Get the value property: List of integration runtimes.
     *
     * @return the value value.
     */
    public List<IntegrationRuntimeResource> getValue() {
        return this.value;
    }

    /**
     * Set the value property: List of integration runtimes.
     *
     * @param value the value value to set.
     * @return the IntegrationRuntimeListResponse object itself.
     */
    public IntegrationRuntimeListResponse setValue(List<IntegrationRuntimeResource> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link to the next page of results, if any remaining results exist.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to the next page of results, if any remaining results exist.
     *
     * @param nextLink the nextLink value to set.
     * @return the IntegrationRuntimeListResponse object itself.
     */
    public IntegrationRuntimeListResponse setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
