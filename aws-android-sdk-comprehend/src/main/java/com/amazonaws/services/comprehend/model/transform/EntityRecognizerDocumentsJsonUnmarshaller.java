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
 * JSON unmarshaller for POJO EntityRecognizerDocuments
 */
class EntityRecognizerDocumentsJsonUnmarshaller implements
        Unmarshaller<EntityRecognizerDocuments, JsonUnmarshallerContext> {

    public EntityRecognizerDocuments unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EntityRecognizerDocuments entityRecognizerDocuments = new EntityRecognizerDocuments();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("S3Uri")) {
                entityRecognizerDocuments.setS3Uri(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TestS3Uri")) {
                entityRecognizerDocuments.setTestS3Uri(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InputFormat")) {
                entityRecognizerDocuments.setInputFormat(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return entityRecognizerDocuments;
    }

    private static EntityRecognizerDocumentsJsonUnmarshaller instance;

    public static EntityRecognizerDocumentsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EntityRecognizerDocumentsJsonUnmarshaller();
        return instance;
    }
}
