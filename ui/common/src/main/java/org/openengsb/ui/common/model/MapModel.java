/**
 * Licensed to the Austrian Association for Software Tool Integration (AASTI)
 * under one or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information regarding copyright
 * ownership. The AASTI licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openengsb.ui.common.model;

import java.util.Map;

import org.apache.wicket.model.IModel;

/**
 * Model that represents a specific entry "key" in a map "map"
 */
@SuppressWarnings("serial")
public class MapModel<K, V> implements IModel<V> {
    private final Map<K, V> map;
    private final K key;

    public MapModel(Map<K, V> map, K key) {
        this.map = map;
        this.key = key;

    }

    @Override
    public V getObject() {
        return map.get(key);
    }

    @Override
    public void setObject(V object) {
        map.put(key, object);
    }

    @Override
    public void detach() {
        // nop
    }
}
