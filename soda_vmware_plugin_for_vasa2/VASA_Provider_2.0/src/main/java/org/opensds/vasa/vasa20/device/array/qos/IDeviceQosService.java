/*
 * // Copyright 2019 The OpenSDS Authors.
 * //
 * // Licensed under the Apache License, Version 2.0 (the "License"); you may
 * // not use this file except in compliance with the License. You may obtain
 * // a copy of the License at
 * //
 * //     http://www.apache.org/licenses/LICENSE-2.0
 * //
 * // Unless required by applicable law or agreed to in writing, software
 * // distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * // WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * // License for the specific language governing permissions and limitations
 * // under the License.
 *
 */

package org.opensds.vasa.vasa20.device.array.qos;

import java.util.List;

import org.opensds.platform.common.SDKErrorCode;
import org.opensds.platform.common.SDKResult;

public interface IDeviceQosService {

    public SDKResult<QosCreateResBean> createQos(String arrayId, String name,
                                                 String description,
                                                 String iotype,
                                                 Long maxbandwidth,
                                                 Long minbandwidth,
                                                 Long maxiops,
                                                 Long miniops,
                                                 Long latency,
                                                 String classtype, String lunId);


    public SDKErrorCode activeQos(String arrayId, String qosId);

    public SDKErrorCode deactiveQos(String arrayId, String qosId);

    public SDKErrorCode updateQos(String arrayId, String qosId, List<String> luns);

    public SDKErrorCode delQos(String arrayId, String qosId);

    public SDKResult<QosCreateResBean> queryQos(String arrayId, String qosId);
}
