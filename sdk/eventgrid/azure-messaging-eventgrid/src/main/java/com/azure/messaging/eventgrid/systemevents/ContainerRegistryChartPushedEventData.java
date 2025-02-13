// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import java.time.OffsetDateTime;

/** Schema of the Data property of an EventGridEvent for a Microsoft.ContainerRegistry.ChartPushed event. */
@Fluent
public final class ContainerRegistryChartPushedEventData extends ContainerRegistryArtifactEventData {
    /** {@inheritDoc} */
    @Override
    public ContainerRegistryChartPushedEventData setId(String id) {
        super.setId(id);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ContainerRegistryChartPushedEventData setTimestamp(OffsetDateTime timestamp) {
        super.setTimestamp(timestamp);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ContainerRegistryChartPushedEventData setAction(String action) {
        super.setAction(action);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ContainerRegistryChartPushedEventData setLocation(String location) {
        super.setLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ContainerRegistryChartPushedEventData setTarget(ContainerRegistryArtifactEventTarget target) {
        super.setTarget(target);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ContainerRegistryChartPushedEventData setConnectedRegistry(
            ContainerRegistryEventConnectedRegistry connectedRegistry) {
        super.setConnectedRegistry(connectedRegistry);
        return this;
    }
}
