// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PlaySourceTypeInternal. */
public final class PlaySourceTypeInternal extends ExpandableStringEnum<PlaySourceTypeInternal> {
    /** Static value file for PlaySourceTypeInternal. */
    public static final PlaySourceTypeInternal FILE = fromString("file");

    /** Static value text for PlaySourceTypeInternal. */
    public static final PlaySourceTypeInternal TEXT = fromString("text");

    /** Static value ssml for PlaySourceTypeInternal. */
    public static final PlaySourceTypeInternal SSML = fromString("ssml");

    /**
     * Creates or finds a PlaySourceTypeInternal from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PlaySourceTypeInternal.
     */
    @JsonCreator
    public static PlaySourceTypeInternal fromString(String name) {
        return fromString(name, PlaySourceTypeInternal.class);
    }

    /**
     * Gets known PlaySourceTypeInternal values.
     *
     * @return known PlaySourceTypeInternal values.
     */
    public static Collection<PlaySourceTypeInternal> values() {
        return values(PlaySourceTypeInternal.class);
    }
}
