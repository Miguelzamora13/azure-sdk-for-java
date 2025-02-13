// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.DatabaseProperties;
import org.junit.jupiter.api.Assertions;

public final class DatabasePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DatabaseProperties model =
            BinaryData
                .fromString("{\"charset\":\"iksqr\",\"collation\":\"ssainqpjwnzll\"}")
                .toObject(DatabaseProperties.class);
        Assertions.assertEquals("iksqr", model.charset());
        Assertions.assertEquals("ssainqpjwnzll", model.collation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DatabaseProperties model = new DatabaseProperties().withCharset("iksqr").withCollation("ssainqpjwnzll");
        model = BinaryData.fromObject(model).toObject(DatabaseProperties.class);
        Assertions.assertEquals("iksqr", model.charset());
        Assertions.assertEquals("ssainqpjwnzll", model.collation());
    }
}
