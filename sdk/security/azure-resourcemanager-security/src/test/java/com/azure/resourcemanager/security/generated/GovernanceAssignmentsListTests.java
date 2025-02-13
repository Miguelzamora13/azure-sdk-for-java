// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.GovernanceAssignmentsList;

public final class GovernanceAssignmentsListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GovernanceAssignmentsList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"owner\":\"qtlffhzbk\",\"remediationDueDate\":\"2021-02-09T15:59:01Z\",\"isGracePeriod\":false},\"id\":\"fqnvhnqoewdogi\",\"name\":\"etesypvidbztjhqt\",\"type\":\"b\"},{\"properties\":{\"owner\":\"ynkbwetnju\",\"remediationDueDate\":\"2021-07-10T00:36:33Z\",\"isGracePeriod\":true},\"id\":\"yaupia\",\"name\":\"cxnafbwqrooh\",\"type\":\"uovmaonurjt\"},{\"properties\":{\"owner\":\"hihpvecmsl\",\"remediationDueDate\":\"2021-01-23T19:57:44Z\",\"isGracePeriod\":true},\"id\":\"lt\",\"name\":\"sjuscvsfxigctmg\",\"type\":\"uupb\"}],\"nextLink\":\"qccydrtceukdq\"}")
                .toObject(GovernanceAssignmentsList.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GovernanceAssignmentsList model = new GovernanceAssignmentsList();
        model = BinaryData.fromObject(model).toObject(GovernanceAssignmentsList.class);
    }
}
