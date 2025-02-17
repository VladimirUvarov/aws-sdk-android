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

package com.amazonaws.services.comprehend.model.transform;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DocumentClassifierFilter
 */
class DocumentClassifierFilterJsonMarshaller {

    public void marshall(DocumentClassifierFilter documentClassifierFilter, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (documentClassifierFilter.getStatus() != null) {
            String status = documentClassifierFilter.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (documentClassifierFilter.getDocumentClassifierName() != null) {
            String documentClassifierName = documentClassifierFilter.getDocumentClassifierName();
            jsonWriter.name("DocumentClassifierName");
            jsonWriter.value(documentClassifierName);
        }
        if (documentClassifierFilter.getSubmitTimeBefore() != null) {
            java.util.Date submitTimeBefore = documentClassifierFilter.getSubmitTimeBefore();
            jsonWriter.name("SubmitTimeBefore");
            jsonWriter.value(submitTimeBefore);
        }
        if (documentClassifierFilter.getSubmitTimeAfter() != null) {
            java.util.Date submitTimeAfter = documentClassifierFilter.getSubmitTimeAfter();
            jsonWriter.name("SubmitTimeAfter");
            jsonWriter.value(submitTimeAfter);
        }
        jsonWriter.endObject();
    }

    private static DocumentClassifierFilterJsonMarshaller instance;

    public static DocumentClassifierFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DocumentClassifierFilterJsonMarshaller();
        return instance;
    }
}
