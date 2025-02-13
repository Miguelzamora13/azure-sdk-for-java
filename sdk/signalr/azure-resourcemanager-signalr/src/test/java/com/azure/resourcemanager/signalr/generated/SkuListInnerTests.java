// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.signalr.fluent.models.SkuListInner;

public final class SkuListInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SkuListInner model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"resourceType\":\"ipfpubji\",\"sku\":{\"name\":\"wifto\",\"tier\":\"Premium\",\"size\":\"puvks\",\"family\":\"lsa\",\"capacity\":931393503},\"capacity\":{\"minimum\":1486406311,\"maximum\":10368328,\"default\":962840058,\"allowedValues\":[],\"scaleType\":\"Automatic\"}},{\"resourceType\":\"pxodlqiyntorzih\",\"sku\":{\"name\":\"osjswsr\",\"tier\":\"Premium\",\"size\":\"zrpzb\",\"family\":\"ckqqzqioxiysui\",\"capacity\":2121235922},\"capacity\":{\"minimum\":2066516032,\"maximum\":1368967398,\"default\":2903501,\"allowedValues\":[],\"scaleType\":\"Manual\"}}],\"nextLink\":\"q\"}")
                .toObject(SkuListInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SkuListInner model = new SkuListInner();
        model = BinaryData.fromObject(model).toObject(SkuListInner.class);
    }
}
