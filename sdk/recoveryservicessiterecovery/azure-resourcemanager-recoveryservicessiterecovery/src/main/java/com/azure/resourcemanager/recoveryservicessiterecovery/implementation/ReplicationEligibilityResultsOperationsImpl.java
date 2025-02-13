// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.ReplicationEligibilityResultsOperationsClient;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.ReplicationEligibilityResultsCollectionInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.ReplicationEligibilityResultsInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationEligibilityResults;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationEligibilityResultsCollection;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationEligibilityResultsOperations;

public final class ReplicationEligibilityResultsOperationsImpl implements ReplicationEligibilityResultsOperations {
    private static final ClientLogger LOGGER = new ClientLogger(ReplicationEligibilityResultsOperationsImpl.class);

    private final ReplicationEligibilityResultsOperationsClient innerClient;

    private final com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager;

    public ReplicationEligibilityResultsOperationsImpl(
        ReplicationEligibilityResultsOperationsClient innerClient,
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<ReplicationEligibilityResultsCollection> listWithResponse(
        String resourceGroupName, String virtualMachineName, Context context) {
        Response<ReplicationEligibilityResultsCollectionInner> inner =
            this.serviceClient().listWithResponse(resourceGroupName, virtualMachineName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ReplicationEligibilityResultsCollectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ReplicationEligibilityResultsCollection list(String resourceGroupName, String virtualMachineName) {
        ReplicationEligibilityResultsCollectionInner inner =
            this.serviceClient().list(resourceGroupName, virtualMachineName);
        if (inner != null) {
            return new ReplicationEligibilityResultsCollectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ReplicationEligibilityResults> getWithResponse(
        String resourceGroupName, String virtualMachineName, Context context) {
        Response<ReplicationEligibilityResultsInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, virtualMachineName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ReplicationEligibilityResultsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ReplicationEligibilityResults get(String resourceGroupName, String virtualMachineName) {
        ReplicationEligibilityResultsInner inner = this.serviceClient().get(resourceGroupName, virtualMachineName);
        if (inner != null) {
            return new ReplicationEligibilityResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private ReplicationEligibilityResultsOperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager() {
        return this.serviceManager;
    }
}
