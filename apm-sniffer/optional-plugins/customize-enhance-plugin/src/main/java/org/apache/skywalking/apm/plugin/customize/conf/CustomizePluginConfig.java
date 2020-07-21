/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.apache.skywalking.apm.plugin.customize.conf;

import java.util.HashMap;
import java.util.Map;
import org.apache.skywalking.apm.agent.core.boot.PluginConfig;

public class CustomizePluginConfig {
    public static class Plugin {
        @PluginConfig(root = CustomizePluginConfig.class)
        public static class Customize {
            /**
             * Custom enhancement class configuration file path, recommended to use an absolute path.
             */
            public static String ENHANCE_FILE = "";

            /**
             * Some information after custom enhancements, this configuration is used by the custom enhancement plugin.
             * And using Map CONTEXT for avoiding classloader isolation issue.
             */
            public static Map<String, Object> CONTEXT = new HashMap<>();
        }
    }
}
