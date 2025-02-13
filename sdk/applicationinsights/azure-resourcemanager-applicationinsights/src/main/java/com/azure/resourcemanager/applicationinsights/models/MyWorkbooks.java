// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import java.util.List;

/** Resource collection API of MyWorkbooks. */
public interface MyWorkbooks {
    /**
     * Get all private workbooks defined within a specified resource group and category.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param category Category of workbook to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.ErrorDefinitionException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private workbooks defined within a specified resource group and category as paginated response with
     *     {@link PagedIterable}.
     */
    PagedIterable<MyWorkbook> listByResourceGroup(String resourceGroupName, CategoryType category);

    /**
     * Get all private workbooks defined within a specified resource group and category.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param category Category of workbook to return.
     * @param tags Tags presents on each workbook returned.
     * @param sourceId Azure Resource Id that will fetch all linked workbooks.
     * @param canFetchContent Flag indicating whether or not to return the full content for each applicable workbook. If
     *     false, only return summary content for workbooks.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.ErrorDefinitionException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private workbooks defined within a specified resource group and category as paginated response with
     *     {@link PagedIterable}.
     */
    PagedIterable<MyWorkbook> listByResourceGroup(
        String resourceGroupName,
        CategoryType category,
        List<String> tags,
        String sourceId,
        Boolean canFetchContent,
        Context context);

    /**
     * Get all private workbooks defined within a specified subscription and category.
     *
     * @param category Category of workbook to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.ErrorDefinitionException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private workbooks defined within a specified subscription and category as paginated response with
     *     {@link PagedIterable}.
     */
    PagedIterable<MyWorkbook> list(CategoryType category);

    /**
     * Get all private workbooks defined within a specified subscription and category.
     *
     * @param category Category of workbook to return.
     * @param tags Tags presents on each workbook returned.
     * @param canFetchContent Flag indicating whether or not to return the full content for each applicable workbook. If
     *     false, only return summary content for workbooks.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.ErrorDefinitionException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private workbooks defined within a specified subscription and category as paginated response with
     *     {@link PagedIterable}.
     */
    PagedIterable<MyWorkbook> list(CategoryType category, List<String> tags, Boolean canFetchContent, Context context);

    /**
     * Get a single private workbook by its resourceName.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.ErrorDefinitionException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single private workbook by its resourceName.
     */
    MyWorkbook getByResourceGroup(String resourceGroupName, String resourceName);

    /**
     * Get a single private workbook by its resourceName.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.ErrorDefinitionException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single private workbook by its resourceName along with {@link Response}.
     */
    Response<MyWorkbook> getByResourceGroupWithResponse(String resourceGroupName, String resourceName, Context context);

    /**
     * Delete a private workbook.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.ErrorDefinitionException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String resourceName);

    /**
     * Delete a private workbook.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.ErrorDefinitionException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String resourceName, Context context);

    /**
     * Get a single private workbook by its resourceName.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.ErrorDefinitionException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single private workbook by its resourceName along with {@link Response}.
     */
    MyWorkbook getById(String id);

    /**
     * Get a single private workbook by its resourceName.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.ErrorDefinitionException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single private workbook by its resourceName along with {@link Response}.
     */
    Response<MyWorkbook> getByIdWithResponse(String id, Context context);

    /**
     * Delete a private workbook.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.ErrorDefinitionException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a private workbook.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.ErrorDefinitionException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new MyWorkbook resource.
     *
     * @param name resource name.
     * @return the first stage of the new MyWorkbook definition.
     */
    MyWorkbook.DefinitionStages.Blank define(String name);
}
