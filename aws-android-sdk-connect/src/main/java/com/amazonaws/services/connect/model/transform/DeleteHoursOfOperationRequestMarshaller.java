/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import android.text.TextUtils;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for DeleteHoursOfOperationRequest
 */
public class DeleteHoursOfOperationRequestMarshaller implements
        Marshaller<Request<DeleteHoursOfOperationRequest>, DeleteHoursOfOperationRequest> {

    public Request<DeleteHoursOfOperationRequest> marshall(
            DeleteHoursOfOperationRequest deleteHoursOfOperationRequest) {
        if (deleteHoursOfOperationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DeleteHoursOfOperationRequest)");
        }

        Request<DeleteHoursOfOperationRequest> request = new DefaultRequest<DeleteHoursOfOperationRequest>(
                deleteHoursOfOperationRequest, "AmazonConnect");
        request.setHttpMethod(HttpMethodName.DELETE);

        String uriResourcePath = "/hours-of-operations/{InstanceId}/{HoursOfOperationId}";
        uriResourcePath = uriResourcePath.replace(
                "{InstanceId}",
                (deleteHoursOfOperationRequest.getInstanceId() == null) ? "" : StringUtils
                        .fromString(deleteHoursOfOperationRequest.getInstanceId()));
        uriResourcePath = uriResourcePath.replace(
                "{HoursOfOperationId}",
                (deleteHoursOfOperationRequest.getHoursOfOperationId() == null) ? "" : StringUtils
                        .fromString(deleteHoursOfOperationRequest.getHoursOfOperationId()));
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
