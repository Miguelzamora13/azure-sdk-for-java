// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.fluent.models.AutoscaleProfileInner;
import com.azure.resourcemanager.monitor.fluent.models.AutoscaleSettingResourceInner;
import com.azure.resourcemanager.monitor.fluent.models.ScaleRuleInner;
import com.azure.resourcemanager.monitor.models.AutoscaleNotification;
import com.azure.resourcemanager.monitor.models.ComparisonOperationType;
import com.azure.resourcemanager.monitor.models.EmailNotification;
import com.azure.resourcemanager.monitor.models.MetricStatisticType;
import com.azure.resourcemanager.monitor.models.MetricTrigger;
import com.azure.resourcemanager.monitor.models.PredictiveAutoscalePolicy;
import com.azure.resourcemanager.monitor.models.PredictiveAutoscalePolicyScaleMode;
import com.azure.resourcemanager.monitor.models.Recurrence;
import com.azure.resourcemanager.monitor.models.RecurrenceFrequency;
import com.azure.resourcemanager.monitor.models.RecurrentSchedule;
import com.azure.resourcemanager.monitor.models.ScaleAction;
import com.azure.resourcemanager.monitor.models.ScaleCapacity;
import com.azure.resourcemanager.monitor.models.ScaleDirection;
import com.azure.resourcemanager.monitor.models.ScaleType;
import com.azure.resourcemanager.monitor.models.TimeAggregationType;
import com.azure.resourcemanager.monitor.models.TimeWindow;
import com.azure.resourcemanager.monitor.models.WebhookNotification;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for AutoscaleSettings CreateOrUpdate. */
public final class AutoscaleSettingsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/stable/2022-10-01/examples/createOrUpdateAutoscaleSetting.json
     */
    /**
     * Sample code: Create or update an autoscale setting.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createOrUpdateAnAutoscaleSetting(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .diagnosticSettings()
            .manager()
            .serviceClient()
            .getAutoscaleSettings()
            .createOrUpdateWithResponse(
                "TestingMetricsScaleSet",
                "MySetting",
                new AutoscaleSettingResourceInner()
                    .withLocation("West US")
                    .withTags(mapOf("key1", "value1", "key2", "value2"))
                    .withProfiles(
                        Arrays
                            .asList(
                                new AutoscaleProfileInner()
                                    .withName("adios")
                                    .withCapacity(
                                        new ScaleCapacity().withMinimum("1").withMaximum("10").withDefaultProperty("1"))
                                    .withRules(
                                        Arrays
                                            .asList(
                                                new ScaleRuleInner()
                                                    .withMetricTrigger(
                                                        new MetricTrigger()
                                                            .withMetricName("Percentage CPU")
                                                            .withMetricResourceUri(
                                                                "/subscriptions/b67f7fec-69fc-4974-9099-a26bd6ffeda3/resourceGroups/TestingMetricsScaleSet/providers/Microsoft.Compute/virtualMachineScaleSets/testingsc")
                                                            .withTimeGrain(Duration.parse("PT1M"))
                                                            .withStatistic(MetricStatisticType.AVERAGE)
                                                            .withTimeWindow(Duration.parse("PT5M"))
                                                            .withTimeAggregation(TimeAggregationType.AVERAGE)
                                                            .withOperator(ComparisonOperationType.GREATER_THAN)
                                                            .withThreshold(10.0)
                                                            .withDividePerInstance(false))
                                                    .withScaleAction(
                                                        new ScaleAction()
                                                            .withDirection(ScaleDirection.INCREASE)
                                                            .withType(ScaleType.CHANGE_COUNT)
                                                            .withValue("1")
                                                            .withCooldown(Duration.parse("PT5M"))),
                                                new ScaleRuleInner()
                                                    .withMetricTrigger(
                                                        new MetricTrigger()
                                                            .withMetricName("Percentage CPU")
                                                            .withMetricResourceUri(
                                                                "/subscriptions/b67f7fec-69fc-4974-9099-a26bd6ffeda3/resourceGroups/TestingMetricsScaleSet/providers/Microsoft.Compute/virtualMachineScaleSets/testingsc")
                                                            .withTimeGrain(Duration.parse("PT2M"))
                                                            .withStatistic(MetricStatisticType.AVERAGE)
                                                            .withTimeWindow(Duration.parse("PT5M"))
                                                            .withTimeAggregation(TimeAggregationType.AVERAGE)
                                                            .withOperator(ComparisonOperationType.GREATER_THAN)
                                                            .withThreshold(15.0)
                                                            .withDividePerInstance(false))
                                                    .withScaleAction(
                                                        new ScaleAction()
                                                            .withDirection(ScaleDirection.DECREASE)
                                                            .withType(ScaleType.CHANGE_COUNT)
                                                            .withValue("2")
                                                            .withCooldown(Duration.parse("PT6M")))))
                                    .withFixedDate(
                                        new TimeWindow()
                                            .withTimeZone("UTC")
                                            .withStart(OffsetDateTime.parse("2015-03-05T14:00:00Z"))
                                            .withEnd(OffsetDateTime.parse("2015-03-05T14:30:00Z"))),
                                new AutoscaleProfileInner()
                                    .withName("saludos")
                                    .withCapacity(
                                        new ScaleCapacity().withMinimum("1").withMaximum("10").withDefaultProperty("1"))
                                    .withRules(
                                        Arrays
                                            .asList(
                                                new ScaleRuleInner()
                                                    .withMetricTrigger(
                                                        new MetricTrigger()
                                                            .withMetricName("Percentage CPU")
                                                            .withMetricResourceUri(
                                                                "/subscriptions/b67f7fec-69fc-4974-9099-a26bd6ffeda3/resourceGroups/TestingMetricsScaleSet/providers/Microsoft.Compute/virtualMachineScaleSets/testingsc")
                                                            .withTimeGrain(Duration.parse("PT1M"))
                                                            .withStatistic(MetricStatisticType.AVERAGE)
                                                            .withTimeWindow(Duration.parse("PT5M"))
                                                            .withTimeAggregation(TimeAggregationType.AVERAGE)
                                                            .withOperator(ComparisonOperationType.GREATER_THAN)
                                                            .withThreshold(10.0)
                                                            .withDividePerInstance(false))
                                                    .withScaleAction(
                                                        new ScaleAction()
                                                            .withDirection(ScaleDirection.INCREASE)
                                                            .withType(ScaleType.CHANGE_COUNT)
                                                            .withValue("1")
                                                            .withCooldown(Duration.parse("PT5M"))),
                                                new ScaleRuleInner()
                                                    .withMetricTrigger(
                                                        new MetricTrigger()
                                                            .withMetricName("Percentage CPU")
                                                            .withMetricResourceUri(
                                                                "/subscriptions/b67f7fec-69fc-4974-9099-a26bd6ffeda3/resourceGroups/TestingMetricsScaleSet/providers/Microsoft.Compute/virtualMachineScaleSets/testingsc")
                                                            .withTimeGrain(Duration.parse("PT2M"))
                                                            .withStatistic(MetricStatisticType.AVERAGE)
                                                            .withTimeWindow(Duration.parse("PT5M"))
                                                            .withTimeAggregation(TimeAggregationType.AVERAGE)
                                                            .withOperator(ComparisonOperationType.GREATER_THAN)
                                                            .withThreshold(15.0)
                                                            .withDividePerInstance(false))
                                                    .withScaleAction(
                                                        new ScaleAction()
                                                            .withDirection(ScaleDirection.DECREASE)
                                                            .withType(ScaleType.CHANGE_COUNT)
                                                            .withValue("2")
                                                            .withCooldown(Duration.parse("PT6M")))))
                                    .withRecurrence(
                                        new Recurrence()
                                            .withFrequency(RecurrenceFrequency.WEEK)
                                            .withSchedule(
                                                new RecurrentSchedule()
                                                    .withTimeZone("UTC")
                                                    .withDays(Arrays.asList("1"))
                                                    .withHours(Arrays.asList(5))
                                                    .withMinutes(Arrays.asList(15))))))
                    .withNotifications(
                        Arrays
                            .asList(
                                new AutoscaleNotification()
                                    .withEmail(
                                        new EmailNotification()
                                            .withSendToSubscriptionAdministrator(true)
                                            .withSendToSubscriptionCoAdministrators(true)
                                            .withCustomEmails(Arrays.asList("gu@ms.com", "ge@ns.net")))
                                    .withWebhooks(
                                        Arrays
                                            .asList(
                                                new WebhookNotification()
                                                    .withServiceUri("http://myservice.com")
                                                    .withProperties(mapOf())))))
                    .withEnabled(true)
                    .withPredictiveAutoscalePolicy(
                        new PredictiveAutoscalePolicy().withScaleMode(PredictiveAutoscalePolicyScaleMode.ENABLED))
                    .withTargetResourceUri(
                        "/subscriptions/b67f7fec-69fc-4974-9099-a26bd6ffeda3/resourceGroups/TestingMetricsScaleSet/providers/Microsoft.Compute/virtualMachineScaleSets/testingsc"),
                Context.NONE);
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
