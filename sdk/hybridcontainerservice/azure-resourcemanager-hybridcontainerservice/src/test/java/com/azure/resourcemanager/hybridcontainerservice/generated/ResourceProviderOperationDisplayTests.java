// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.models.ResourceProviderOperationDisplay;
import org.junit.jupiter.api.Assertions;

public final class ResourceProviderOperationDisplayTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceProviderOperationDisplay model =
            BinaryData
                .fromString(
                    "{\"provider\":\"jrjxgciqibrhosx\",\"resource\":\"qrhzoymibmrqyib\",\"operation\":\"wfluszdt\",\"description\":\"rkwofyyvoqa\"}")
                .toObject(ResourceProviderOperationDisplay.class);
        Assertions.assertEquals("jrjxgciqibrhosx", model.provider());
        Assertions.assertEquals("qrhzoymibmrqyib", model.resource());
        Assertions.assertEquals("wfluszdt", model.operation());
        Assertions.assertEquals("rkwofyyvoqa", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceProviderOperationDisplay model =
            new ResourceProviderOperationDisplay()
                .withProvider("jrjxgciqibrhosx")
                .withResource("qrhzoymibmrqyib")
                .withOperation("wfluszdt")
                .withDescription("rkwofyyvoqa");
        model = BinaryData.fromObject(model).toObject(ResourceProviderOperationDisplay.class);
        Assertions.assertEquals("jrjxgciqibrhosx", model.provider());
        Assertions.assertEquals("qrhzoymibmrqyib", model.resource());
        Assertions.assertEquals("wfluszdt", model.operation());
        Assertions.assertEquals("rkwofyyvoqa", model.description());
    }
}
