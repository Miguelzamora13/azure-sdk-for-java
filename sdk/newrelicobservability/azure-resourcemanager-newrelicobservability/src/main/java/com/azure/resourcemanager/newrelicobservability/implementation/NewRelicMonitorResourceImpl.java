// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.newrelicobservability.fluent.models.NewRelicMonitorResourceInner;
import com.azure.resourcemanager.newrelicobservability.models.AccountCreationSource;
import com.azure.resourcemanager.newrelicobservability.models.AppServiceInfo;
import com.azure.resourcemanager.newrelicobservability.models.AppServicesGetRequest;
import com.azure.resourcemanager.newrelicobservability.models.HostsGetRequest;
import com.azure.resourcemanager.newrelicobservability.models.LiftrResourceCategories;
import com.azure.resourcemanager.newrelicobservability.models.ManagedServiceIdentity;
import com.azure.resourcemanager.newrelicobservability.models.MarketplaceSubscriptionStatus;
import com.azure.resourcemanager.newrelicobservability.models.MetricRules;
import com.azure.resourcemanager.newrelicobservability.models.MetricsRequest;
import com.azure.resourcemanager.newrelicobservability.models.MetricsStatusRequest;
import com.azure.resourcemanager.newrelicobservability.models.MetricsStatusResponse;
import com.azure.resourcemanager.newrelicobservability.models.MonitoredResource;
import com.azure.resourcemanager.newrelicobservability.models.MonitoringStatus;
import com.azure.resourcemanager.newrelicobservability.models.NewRelicAccountProperties;
import com.azure.resourcemanager.newrelicobservability.models.NewRelicMonitorResource;
import com.azure.resourcemanager.newrelicobservability.models.NewRelicMonitorResourceUpdate;
import com.azure.resourcemanager.newrelicobservability.models.OrgCreationSource;
import com.azure.resourcemanager.newrelicobservability.models.PlanData;
import com.azure.resourcemanager.newrelicobservability.models.ProvisioningState;
import com.azure.resourcemanager.newrelicobservability.models.SwitchBillingRequest;
import com.azure.resourcemanager.newrelicobservability.models.UserInfo;
import com.azure.resourcemanager.newrelicobservability.models.VMExtensionPayload;
import com.azure.resourcemanager.newrelicobservability.models.VMInfo;
import java.util.Collections;
import java.util.Map;

public final class NewRelicMonitorResourceImpl
    implements NewRelicMonitorResource, NewRelicMonitorResource.Definition, NewRelicMonitorResource.Update {
    private NewRelicMonitorResourceInner innerObject;

    private final com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ManagedServiceIdentity identity() {
        return this.innerModel().identity();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public MonitoringStatus monitoringStatus() {
        return this.innerModel().monitoringStatus();
    }

    public MarketplaceSubscriptionStatus marketplaceSubscriptionStatus() {
        return this.innerModel().marketplaceSubscriptionStatus();
    }

    public String marketplaceSubscriptionId() {
        return this.innerModel().marketplaceSubscriptionId();
    }

    public NewRelicAccountProperties newRelicAccountProperties() {
        return this.innerModel().newRelicAccountProperties();
    }

    public UserInfo userInfo() {
        return this.innerModel().userInfo();
    }

    public PlanData planData() {
        return this.innerModel().planData();
    }

    public LiftrResourceCategories liftrResourceCategory() {
        return this.innerModel().liftrResourceCategory();
    }

    public Integer liftrResourcePreference() {
        return this.innerModel().liftrResourcePreference();
    }

    public OrgCreationSource orgCreationSource() {
        return this.innerModel().orgCreationSource();
    }

    public AccountCreationSource accountCreationSource() {
        return this.innerModel().accountCreationSource();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public NewRelicMonitorResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String monitorName;

    private NewRelicMonitorResourceUpdate updateProperties;

    public NewRelicMonitorResourceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public NewRelicMonitorResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMonitors()
                .createOrUpdate(resourceGroupName, monitorName, this.innerModel(), Context.NONE);
        return this;
    }

    public NewRelicMonitorResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMonitors()
                .createOrUpdate(resourceGroupName, monitorName, this.innerModel(), context);
        return this;
    }

    NewRelicMonitorResourceImpl(
        String name, com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager serviceManager) {
        this.innerObject = new NewRelicMonitorResourceInner();
        this.serviceManager = serviceManager;
        this.monitorName = name;
    }

    public NewRelicMonitorResourceImpl update() {
        this.updateProperties = new NewRelicMonitorResourceUpdate();
        return this;
    }

    public NewRelicMonitorResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMonitors()
                .updateWithResponse(resourceGroupName, monitorName, updateProperties, Context.NONE)
                .getValue();
        return this;
    }

    public NewRelicMonitorResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMonitors()
                .updateWithResponse(resourceGroupName, monitorName, updateProperties, context)
                .getValue();
        return this;
    }

    NewRelicMonitorResourceImpl(
        NewRelicMonitorResourceInner innerObject,
        com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.monitorName = Utils.getValueFromIdByName(innerObject.id(), "monitors");
    }

    public NewRelicMonitorResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMonitors()
                .getByResourceGroupWithResponse(resourceGroupName, monitorName, Context.NONE)
                .getValue();
        return this;
    }

    public NewRelicMonitorResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMonitors()
                .getByResourceGroupWithResponse(resourceGroupName, monitorName, context)
                .getValue();
        return this;
    }

    public Response<MetricRules> getMetricRulesWithResponse(MetricsRequest request, Context context) {
        return serviceManager.monitors().getMetricRulesWithResponse(resourceGroupName, monitorName, request, context);
    }

    public MetricRules getMetricRules(MetricsRequest request) {
        return serviceManager.monitors().getMetricRules(resourceGroupName, monitorName, request);
    }

    public Response<MetricsStatusResponse> getMetricStatusWithResponse(MetricsStatusRequest request, Context context) {
        return serviceManager.monitors().getMetricStatusWithResponse(resourceGroupName, monitorName, request, context);
    }

    public MetricsStatusResponse getMetricStatus(MetricsStatusRequest request) {
        return serviceManager.monitors().getMetricStatus(resourceGroupName, monitorName, request);
    }

    public PagedIterable<AppServiceInfo> listAppServices(AppServicesGetRequest request) {
        return serviceManager.monitors().listAppServices(resourceGroupName, monitorName, request);
    }

    public PagedIterable<AppServiceInfo> listAppServices(AppServicesGetRequest request, Context context) {
        return serviceManager.monitors().listAppServices(resourceGroupName, monitorName, request, context);
    }

    public Response<Void> switchBillingWithResponse(SwitchBillingRequest request, Context context) {
        return serviceManager.monitors().switchBillingWithResponse(resourceGroupName, monitorName, request, context);
    }

    public void switchBilling(SwitchBillingRequest request) {
        serviceManager.monitors().switchBilling(resourceGroupName, monitorName, request);
    }

    public PagedIterable<VMInfo> listHosts(HostsGetRequest request) {
        return serviceManager.monitors().listHosts(resourceGroupName, monitorName, request);
    }

    public PagedIterable<VMInfo> listHosts(HostsGetRequest request, Context context) {
        return serviceManager.monitors().listHosts(resourceGroupName, monitorName, request, context);
    }

    public PagedIterable<MonitoredResource> listMonitoredResources() {
        return serviceManager.monitors().listMonitoredResources(resourceGroupName, monitorName);
    }

    public PagedIterable<MonitoredResource> listMonitoredResources(Context context) {
        return serviceManager.monitors().listMonitoredResources(resourceGroupName, monitorName, context);
    }

    public Response<VMExtensionPayload> vmHostPayloadWithResponse(Context context) {
        return serviceManager.monitors().vmHostPayloadWithResponse(resourceGroupName, monitorName, context);
    }

    public VMExtensionPayload vmHostPayload() {
        return serviceManager.monitors().vmHostPayload(resourceGroupName, monitorName);
    }

    public NewRelicMonitorResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public NewRelicMonitorResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public NewRelicMonitorResourceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateProperties.withTags(tags);
            return this;
        }
    }

    public NewRelicMonitorResourceImpl withIdentity(ManagedServiceIdentity identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateProperties.withIdentity(identity);
            return this;
        }
    }

    public NewRelicMonitorResourceImpl withNewRelicAccountProperties(
        NewRelicAccountProperties newRelicAccountProperties) {
        if (isInCreateMode()) {
            this.innerModel().withNewRelicAccountProperties(newRelicAccountProperties);
            return this;
        } else {
            this.updateProperties.withNewRelicAccountProperties(newRelicAccountProperties);
            return this;
        }
    }

    public NewRelicMonitorResourceImpl withUserInfo(UserInfo userInfo) {
        if (isInCreateMode()) {
            this.innerModel().withUserInfo(userInfo);
            return this;
        } else {
            this.updateProperties.withUserInfo(userInfo);
            return this;
        }
    }

    public NewRelicMonitorResourceImpl withPlanData(PlanData planData) {
        if (isInCreateMode()) {
            this.innerModel().withPlanData(planData);
            return this;
        } else {
            this.updateProperties.withPlanData(planData);
            return this;
        }
    }

    public NewRelicMonitorResourceImpl withOrgCreationSource(OrgCreationSource orgCreationSource) {
        if (isInCreateMode()) {
            this.innerModel().withOrgCreationSource(orgCreationSource);
            return this;
        } else {
            this.updateProperties.withOrgCreationSource(orgCreationSource);
            return this;
        }
    }

    public NewRelicMonitorResourceImpl withAccountCreationSource(AccountCreationSource accountCreationSource) {
        if (isInCreateMode()) {
            this.innerModel().withAccountCreationSource(accountCreationSource);
            return this;
        } else {
            this.updateProperties.withAccountCreationSource(accountCreationSource);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
