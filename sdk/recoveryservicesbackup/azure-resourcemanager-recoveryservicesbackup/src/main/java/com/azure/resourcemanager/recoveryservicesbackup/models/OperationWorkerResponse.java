// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** This is the base class for operation result responses. */
@Fluent
public class OperationWorkerResponse {
    /*
     * HTTP Status Code of the operation.
     */
    @JsonProperty(value = "statusCode")
    private HttpStatusCode statusCode;

    /*
     * HTTP headers associated with this operation.
     */
    @JsonProperty(value = "headers")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, List<String>> headers;

    /** Creates an instance of OperationWorkerResponse class. */
    public OperationWorkerResponse() {
    }

    /**
     * Get the statusCode property: HTTP Status Code of the operation.
     *
     * @return the statusCode value.
     */
    public HttpStatusCode statusCode() {
        return this.statusCode;
    }

    /**
     * Set the statusCode property: HTTP Status Code of the operation.
     *
     * @param statusCode the statusCode value to set.
     * @return the OperationWorkerResponse object itself.
     */
    public OperationWorkerResponse withStatusCode(HttpStatusCode statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Get the headers property: HTTP headers associated with this operation.
     *
     * @return the headers value.
     */
    public Map<String, List<String>> headers() {
        return this.headers;
    }

    /**
     * Set the headers property: HTTP headers associated with this operation.
     *
     * @param headers the headers value to set.
     * @return the OperationWorkerResponse object itself.
     */
    public OperationWorkerResponse withHeaders(Map<String, List<String>> headers) {
        this.headers = headers;
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
