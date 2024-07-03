/*
 * Copyright 2023 Ant Group Co., Ltd.
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

package org.secretflow.secretpad.common.dto;

import lombok.*;

/**
 * SecretPad common response
 *
 * @author yansi
 * @date 2023/5/10
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SecretPadResponse<T> {
    private SecretPadResponseStatus status;
    private T data;

    /**
     * Build successful secretPad response with data
     *
     * @param data return data
     * @param <T>
     * @return successful secretPad response with data
     */
    public static <T> SecretPadResponse<T> success(T data) {
        return new SecretPadResponse<>(new SecretPadResponseStatus(0, "success"), data);
    }

    /**
     * Build successful SecretPad response
     *
     * @param <T>
     * @return successful SecretPad response
     */
    public static <T> SecretPadResponse<T> success() {
        return success(null);
    }

    /**
     * SecretPad response status class
     */
    @Builder
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    public static class SecretPadResponseStatus {
        /**
         * Status code
         */
        private Integer code;
        /**
         * Status message
         */
        private String msg;
    }
}
