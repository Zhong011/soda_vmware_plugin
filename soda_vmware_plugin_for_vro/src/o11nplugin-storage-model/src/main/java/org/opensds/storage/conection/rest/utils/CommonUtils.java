// Copyright 2019 The OpenSDS Authors.
//
// Licensed under the Apache License, Version 2.0 (the "License"); you may
// not use this file except in compliance with the License. You may obtain
// a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
// WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
// License for the specific language governing permissions and limitations
// under the License.

package org.opensds.storage.conection.rest.utils;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class CommonUtils {

    public static Map<String, String> upperOperationName(
            Map<String, String> dataMap) {
        Map<String, String> newDataMap = new HashMap<String, String>();
        if (dataMap != null) {
            for (Map.Entry<String, String> entry : dataMap.entrySet()) {
                newDataMap.put(entry.getKey().toUpperCase(Locale.US),
                        entry.getValue());
            }
        }
        return newDataMap;
    }

}
