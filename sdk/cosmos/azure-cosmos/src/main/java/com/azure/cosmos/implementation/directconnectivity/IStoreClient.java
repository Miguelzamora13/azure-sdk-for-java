// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation.directconnectivity;

import com.azure.cosmos.CosmosContainerProactiveInitConfig;
import com.azure.cosmos.implementation.IRetryPolicy;
import com.azure.cosmos.implementation.RxDocumentServiceRequest;
import com.azure.cosmos.implementation.RxDocumentServiceResponse;
import com.azure.cosmos.implementation.OpenConnectionResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.function.Function;

public interface IStoreClient {

    Mono<RxDocumentServiceResponse> processMessageAsync(
            RxDocumentServiceRequest request,
            IRetryPolicy retryPolicy,
            Function<RxDocumentServiceRequest, Mono<RxDocumentServiceRequest>> prepareRequestAsyncDelegate);

    default Mono<RxDocumentServiceResponse> processMessageAsync(
            RxDocumentServiceRequest request,
            Function<RxDocumentServiceRequest, Mono<RxDocumentServiceRequest>> prepareRequestAsyncDelegate) {
        return processMessageAsync(request, null, prepareRequestAsyncDelegate);
    }

    default Mono<RxDocumentServiceResponse> processMessageAsync(
            RxDocumentServiceRequest request,
            IRetryPolicy retryPolicy) {
        return processMessageAsync(request, retryPolicy, null);
    }

    default Mono<RxDocumentServiceResponse> processMessageAsync(
            RxDocumentServiceRequest request) {
        return processMessageAsync(request, null, null);
    }

    Flux<OpenConnectionResponse> openConnectionsAndInitCaches(CosmosContainerProactiveInitConfig proactiveContainerInitConfig);
}
