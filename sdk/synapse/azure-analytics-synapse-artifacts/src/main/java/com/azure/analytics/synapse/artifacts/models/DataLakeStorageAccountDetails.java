// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Details of the data lake storage account associated with the workspace. */
@Fluent
public final class DataLakeStorageAccountDetails {
    /*
     * Account URL
     */
    @JsonProperty(value = "accountUrl")
    private String accountUrl;

    /*
     * Filesystem name
     */
    @JsonProperty(value = "filesystem")
    private String filesystem;

    /** Creates an instance of DataLakeStorageAccountDetails class. */
    public DataLakeStorageAccountDetails() {}

    /**
     * Get the accountUrl property: Account URL.
     *
     * @return the accountUrl value.
     */
    public String getAccountUrl() {
        return this.accountUrl;
    }

    /**
     * Set the accountUrl property: Account URL.
     *
     * @param accountUrl the accountUrl value to set.
     * @return the DataLakeStorageAccountDetails object itself.
     */
    public DataLakeStorageAccountDetails setAccountUrl(String accountUrl) {
        this.accountUrl = accountUrl;
        return this;
    }

    /**
     * Get the filesystem property: Filesystem name.
     *
     * @return the filesystem value.
     */
    public String getFilesystem() {
        return this.filesystem;
    }

    /**
     * Set the filesystem property: Filesystem name.
     *
     * @param filesystem the filesystem value to set.
     * @return the DataLakeStorageAccountDetails object itself.
     */
    public DataLakeStorageAccountDetails setFilesystem(String filesystem) {
        this.filesystem = filesystem;
        return this;
    }
}
