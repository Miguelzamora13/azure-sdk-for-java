// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.GovernanceEmailNotification;
import org.junit.jupiter.api.Assertions;

public final class GovernanceEmailNotificationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GovernanceEmailNotification model =
            BinaryData
                .fromString("{\"disableManagerEmailNotification\":true,\"disableOwnerEmailNotification\":false}")
                .toObject(GovernanceEmailNotification.class);
        Assertions.assertEquals(true, model.disableManagerEmailNotification());
        Assertions.assertEquals(false, model.disableOwnerEmailNotification());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GovernanceEmailNotification model =
            new GovernanceEmailNotification()
                .withDisableManagerEmailNotification(true)
                .withDisableOwnerEmailNotification(false);
        model = BinaryData.fromObject(model).toObject(GovernanceEmailNotification.class);
        Assertions.assertEquals(true, model.disableManagerEmailNotification());
        Assertions.assertEquals(false, model.disableOwnerEmailNotification());
    }
}
