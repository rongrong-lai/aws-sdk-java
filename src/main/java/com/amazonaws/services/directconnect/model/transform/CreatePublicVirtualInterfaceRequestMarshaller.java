/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directconnect.model.transform;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Create Public Virtual Interface Request Marshaller
 */
public class CreatePublicVirtualInterfaceRequestMarshaller implements Marshaller<Request<CreatePublicVirtualInterfaceRequest>, CreatePublicVirtualInterfaceRequest> {

    

    public Request<CreatePublicVirtualInterfaceRequest> marshall(CreatePublicVirtualInterfaceRequest createPublicVirtualInterfaceRequest) {
    if (createPublicVirtualInterfaceRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<CreatePublicVirtualInterfaceRequest> request = new DefaultRequest<CreatePublicVirtualInterfaceRequest>(createPublicVirtualInterfaceRequest, "AmazonDirectConnect");
        String target = "OvertureService.CreatePublicVirtualInterface";
        request.addHeader("X-Amz-Target", target);
        request.addHeader("Content-Type", "application/x-amz-json-1.1");

        
        request.setHttpMethod(HttpMethodName.POST);


        String uriResourcePath = ""; 

        uriResourcePath = uriResourcePath.replaceAll("//", "/");

        if (uriResourcePath.contains("?")) {
            String queryString = uriResourcePath.substring(uriResourcePath.indexOf("?") + 1);
            uriResourcePath    = uriResourcePath.substring(0, uriResourcePath.indexOf("?"));

            for (String s : queryString.split("[;&]")) {
                String[] nameValuePair = s.split("=");
                if (nameValuePair.length == 2) {
                    request.addParameter(nameValuePair[0], nameValuePair[1]);
                } else {
                    request.addParameter(s, null);
                }
            }
        }

        request.setResourcePath(uriResourcePath);


        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          
            
          jsonWriter.object();
          
            if (createPublicVirtualInterfaceRequest.getConnectionId() != null) {
                jsonWriter.key("connectionId").value(createPublicVirtualInterfaceRequest.getConnectionId());
            }
            NewPublicVirtualInterface newPublicVirtualInterface = createPublicVirtualInterfaceRequest.getNewPublicVirtualInterface();
            if (newPublicVirtualInterface != null) {

                jsonWriter.key("newPublicVirtualInterface");
                jsonWriter.object();

                if (newPublicVirtualInterface.getVirtualInterfaceName() != null) {
                    jsonWriter.key("virtualInterfaceName").value(newPublicVirtualInterface.getVirtualInterfaceName());
                }
                if (newPublicVirtualInterface.getVlan() != null) {
                    jsonWriter.key("vlan").value(newPublicVirtualInterface.getVlan());
                }
                if (newPublicVirtualInterface.getAsn() != null) {
                    jsonWriter.key("asn").value(newPublicVirtualInterface.getAsn());
                }
                if (newPublicVirtualInterface.getAuthKey() != null) {
                    jsonWriter.key("authKey").value(newPublicVirtualInterface.getAuthKey());
                }
                if (newPublicVirtualInterface.getAmazonAddress() != null) {
                    jsonWriter.key("amazonAddress").value(newPublicVirtualInterface.getAmazonAddress());
                }
                if (newPublicVirtualInterface.getCustomerAddress() != null) {
                    jsonWriter.key("customerAddress").value(newPublicVirtualInterface.getCustomerAddress());
                }

                java.util.List<RouteFilterPrefix> routeFilterPrefixesList = newPublicVirtualInterface.getRouteFilterPrefixes();
                if (routeFilterPrefixesList != null && routeFilterPrefixesList.size() > 0) {

                    jsonWriter.key("routeFilterPrefixes");
                    jsonWriter.array();

                    for (RouteFilterPrefix routeFilterPrefixesListValue : routeFilterPrefixesList) {
                        if (routeFilterPrefixesListValue != null) {
                            jsonWriter.object();
                            if (routeFilterPrefixesListValue.getCidr() != null) {
                                jsonWriter.key("cidr").value(routeFilterPrefixesListValue.getCidr());
                            }
                            jsonWriter.endObject();
                        }
                    }
                    jsonWriter.endArray();
                }
                jsonWriter.endObject();
            }

          jsonWriter.endObject();
          

          String snippet = stringWriter.toString();
          byte[] content = snippet.getBytes("UTF-8");
          request.setContent(new StringInputStream(snippet));
          request.addHeader("Content-Length", Integer.toString(content.length));
        } catch(Throwable t) {
          throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        

        return request;
    }

    private String getString(String s) {
        if (s == null) return "";
        return s;
    }
}