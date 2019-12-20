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

package org.opensds.vasa.vasa.db.dao;

import java.util.List;
import java.util.Map;

import org.opensds.vasa.vasa.db.model.NVasaServiceCenter;

public interface VasaServiceCenterDao {

    List<NVasaServiceCenter> queryVasaService(String serviceIp);

    List<NVasaServiceCenter> queryCurrentMaster();

    void completeMaster(Map<String, Object> params);

    void updateMaster(Map<String, Object> params);

    List<NVasaServiceCenter> queryAllService();

    void addVasaService(NVasaServiceCenter center);

    List<NVasaServiceCenter> getVasaServiceByServiceIp(String serviceIp);
}