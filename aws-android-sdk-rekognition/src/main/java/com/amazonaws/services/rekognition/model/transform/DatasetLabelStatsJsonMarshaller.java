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

package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DatasetLabelStats
 */
class DatasetLabelStatsJsonMarshaller {

    public void marshall(DatasetLabelStats datasetLabelStats, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (datasetLabelStats.getEntryCount() != null) {
            Integer entryCount = datasetLabelStats.getEntryCount();
            jsonWriter.name("EntryCount");
            jsonWriter.value(entryCount);
        }
        if (datasetLabelStats.getBoundingBoxCount() != null) {
            Integer boundingBoxCount = datasetLabelStats.getBoundingBoxCount();
            jsonWriter.name("BoundingBoxCount");
            jsonWriter.value(boundingBoxCount);
        }
        jsonWriter.endObject();
    }

    private static DatasetLabelStatsJsonMarshaller instance;

    public static DatasetLabelStatsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DatasetLabelStatsJsonMarshaller();
        return instance;
    }
}
