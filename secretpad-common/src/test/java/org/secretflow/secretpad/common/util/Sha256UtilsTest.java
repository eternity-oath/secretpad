/*
 * Copyright 2024 Ant Group Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.secretflow.secretpad.common.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author yutu
 * @date 2024/04/22
 */
public class Sha256UtilsTest {

    @Test
    void hash() {
        String hash = Sha256Utils.hash("12#$qwER");
        Assertions.assertEquals(hash, "b524e25cf0067afea0fba7329d76a06950ab24175269383f1611a8a9dfb0d322", "not support");
    }
}