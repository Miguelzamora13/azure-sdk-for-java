// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Describes operator to be matched. */
public final class SslProtocolOperator extends ExpandableStringEnum<SslProtocolOperator> {
    /** Static value Equal for SslProtocolOperator. */
    public static final SslProtocolOperator EQUAL = fromString("Equal");

    /**
     * Creates or finds a SslProtocolOperator from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SslProtocolOperator.
     */
    @JsonCreator
    public static SslProtocolOperator fromString(String name) {
        return fromString(name, SslProtocolOperator.class);
    }

    /**
     * Gets known SslProtocolOperator values.
     *
     * @return known SslProtocolOperator values.
     */
    public static Collection<SslProtocolOperator> values() {
        return values(SslProtocolOperator.class);
    }
}
