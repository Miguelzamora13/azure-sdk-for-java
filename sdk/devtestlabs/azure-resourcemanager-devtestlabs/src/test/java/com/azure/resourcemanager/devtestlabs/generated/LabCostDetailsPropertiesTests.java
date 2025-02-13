// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.models.CostType;
import com.azure.resourcemanager.devtestlabs.models.LabCostDetailsProperties;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class LabCostDetailsPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LabCostDetailsProperties model =
            BinaryData
                .fromString(
                    "{\"date\":\"2021-05-26T19:07:11Z\",\"cost\":29.97563487024707,\"costType\":\"Unavailable\"}")
                .toObject(LabCostDetailsProperties.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-26T19:07:11Z"), model.date());
        Assertions.assertEquals(29.97563487024707D, model.cost());
        Assertions.assertEquals(CostType.UNAVAILABLE, model.costType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LabCostDetailsProperties model =
            new LabCostDetailsProperties()
                .withDate(OffsetDateTime.parse("2021-05-26T19:07:11Z"))
                .withCost(29.97563487024707D)
                .withCostType(CostType.UNAVAILABLE);
        model = BinaryData.fromObject(model).toObject(LabCostDetailsProperties.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-26T19:07:11Z"), model.date());
        Assertions.assertEquals(29.97563487024707D, model.cost());
        Assertions.assertEquals(CostType.UNAVAILABLE, model.costType());
    }
}
