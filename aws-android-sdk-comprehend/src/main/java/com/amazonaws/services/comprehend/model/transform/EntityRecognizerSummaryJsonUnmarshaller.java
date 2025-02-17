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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO EntityRecognizerSummary
 */
class EntityRecognizerSummaryJsonUnmarshaller implements
        Unmarshaller<EntityRecognizerSummary, JsonUnmarshallerContext> {

    public EntityRecognizerSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EntityRecognizerSummary entityRecognizerSummary = new EntityRecognizerSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("RecognizerName")) {
                entityRecognizerSummary.setRecognizerName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NumberOfVersions")) {
                entityRecognizerSummary.setNumberOfVersions(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LatestVersionCreatedAt")) {
                entityRecognizerSummary.setLatestVersionCreatedAt(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LatestVersionName")) {
                entityRecognizerSummary.setLatestVersionName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LatestVersionStatus")) {
                entityRecognizerSummary.setLatestVersionStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return entityRecognizerSummary;
    }

    private static EntityRecognizerSummaryJsonUnmarshaller instance;

    public static EntityRecognizerSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EntityRecognizerSummaryJsonUnmarshaller();
        return instance;
    }
}
