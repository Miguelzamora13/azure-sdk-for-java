// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.administration.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The role type. */
public final class RoleType extends ExpandableStringEnum<RoleType> {
    /** Static value AKVBuiltInRole for RoleType. */
    public static final RoleType BUILT_IN_ROLE = fromString("AKVBuiltInRole");

    /** Static value CustomRole for RoleType. */
    public static final RoleType CUSTOM_ROLE = fromString("CustomRole");

    /**
     * Creates a new instance of RoleType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RoleType() {}

    /**
     * Creates or finds a RoleType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RoleType.
     */
    @JsonCreator
    public static RoleType fromString(String name) {
        return fromString(name, RoleType.class);
    }

    /**
     * Gets known RoleType values.
     *
     * @return known RoleType values.
     */
    public static Collection<RoleType> values() {
        return values(RoleType.class);
    }
}
