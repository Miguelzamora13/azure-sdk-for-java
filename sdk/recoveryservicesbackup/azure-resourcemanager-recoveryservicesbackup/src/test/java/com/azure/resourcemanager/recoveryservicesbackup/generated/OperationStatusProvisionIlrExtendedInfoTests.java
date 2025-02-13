// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.ClientScriptForConnect;
import com.azure.resourcemanager.recoveryservicesbackup.models.InstantItemRecoveryTarget;
import com.azure.resourcemanager.recoveryservicesbackup.models.OperationStatusProvisionIlrExtendedInfo;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class OperationStatusProvisionIlrExtendedInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationStatusProvisionIlrExtendedInfo model =
            BinaryData
                .fromString(
                    "{\"objectType\":\"OperationStatusProvisionILRExtendedInfo\",\"recoveryTarget\":{\"clientScripts\":[{\"scriptContent\":\"hhhqosm\",\"scriptExtension\":\"jkutycyarnr\",\"osType\":\"hguabzoghktdp\",\"url\":\"z\",\"scriptNameSuffix\":\"oeocnhzqrott\"},{\"scriptContent\":\"cfyjzp\",\"scriptExtension\":\"rl\",\"osType\":\"apqinf\",\"url\":\"pyglqdhmrjzral\",\"scriptNameSuffix\":\"pjby\"}]}}")
                .toObject(OperationStatusProvisionIlrExtendedInfo.class);
        Assertions.assertEquals("hhhqosm", model.recoveryTarget().clientScripts().get(0).scriptContent());
        Assertions.assertEquals("jkutycyarnr", model.recoveryTarget().clientScripts().get(0).scriptExtension());
        Assertions.assertEquals("hguabzoghktdp", model.recoveryTarget().clientScripts().get(0).osType());
        Assertions.assertEquals("z", model.recoveryTarget().clientScripts().get(0).url());
        Assertions.assertEquals("oeocnhzqrott", model.recoveryTarget().clientScripts().get(0).scriptNameSuffix());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationStatusProvisionIlrExtendedInfo model =
            new OperationStatusProvisionIlrExtendedInfo()
                .withRecoveryTarget(
                    new InstantItemRecoveryTarget()
                        .withClientScripts(
                            Arrays
                                .asList(
                                    new ClientScriptForConnect()
                                        .withScriptContent("hhhqosm")
                                        .withScriptExtension("jkutycyarnr")
                                        .withOsType("hguabzoghktdp")
                                        .withUrl("z")
                                        .withScriptNameSuffix("oeocnhzqrott"),
                                    new ClientScriptForConnect()
                                        .withScriptContent("cfyjzp")
                                        .withScriptExtension("rl")
                                        .withOsType("apqinf")
                                        .withUrl("pyglqdhmrjzral")
                                        .withScriptNameSuffix("pjby"))));
        model = BinaryData.fromObject(model).toObject(OperationStatusProvisionIlrExtendedInfo.class);
        Assertions.assertEquals("hhhqosm", model.recoveryTarget().clientScripts().get(0).scriptContent());
        Assertions.assertEquals("jkutycyarnr", model.recoveryTarget().clientScripts().get(0).scriptExtension());
        Assertions.assertEquals("hguabzoghktdp", model.recoveryTarget().clientScripts().get(0).osType());
        Assertions.assertEquals("z", model.recoveryTarget().clientScripts().get(0).url());
        Assertions.assertEquals("oeocnhzqrott", model.recoveryTarget().clientScripts().get(0).scriptNameSuffix());
    }
}
