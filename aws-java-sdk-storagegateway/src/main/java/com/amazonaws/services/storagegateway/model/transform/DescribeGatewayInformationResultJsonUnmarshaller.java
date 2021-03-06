/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.storagegateway.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Describe Gateway Information Result JSON Unmarshaller
 */
public class DescribeGatewayInformationResultJsonUnmarshaller implements Unmarshaller<DescribeGatewayInformationResult, JsonUnmarshallerContext> {

    public DescribeGatewayInformationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeGatewayInformationResult describeGatewayInformationResult = new DescribeGatewayInformationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("GatewayARN", targetDepth)) {
                    context.nextToken();
                    describeGatewayInformationResult.setGatewayARN(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GatewayId", targetDepth)) {
                    context.nextToken();
                    describeGatewayInformationResult.setGatewayId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GatewayTimezone", targetDepth)) {
                    context.nextToken();
                    describeGatewayInformationResult.setGatewayTimezone(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GatewayState", targetDepth)) {
                    context.nextToken();
                    describeGatewayInformationResult.setGatewayState(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GatewayNetworkInterfaces", targetDepth)) {
                    context.nextToken();
                    describeGatewayInformationResult.setGatewayNetworkInterfaces(new ListUnmarshaller<NetworkInterface>(NetworkInterfaceJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("GatewayType", targetDepth)) {
                    context.nextToken();
                    describeGatewayInformationResult.setGatewayType(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NextUpdateAvailabilityDate", targetDepth)) {
                    context.nextToken();
                    describeGatewayInformationResult.setNextUpdateAvailabilityDate(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }

            token = context.nextToken();
        }
        
        return describeGatewayInformationResult;
    }

    private static DescribeGatewayInformationResultJsonUnmarshaller instance;
    public static DescribeGatewayInformationResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new DescribeGatewayInformationResultJsonUnmarshaller();
        return instance;
    }
}
    