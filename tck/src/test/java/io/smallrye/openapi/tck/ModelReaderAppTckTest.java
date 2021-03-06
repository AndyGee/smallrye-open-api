/**
 * Copyright 2018 Red Hat, Inc, and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.smallrye.openapi.tck;

import org.eclipse.microprofile.openapi.tck.ModelReaderAppTest;

import io.restassured.response.ValidatableResponse;
import test.io.smallrye.openapi.tck.BaseTckTest;
import test.io.smallrye.openapi.tck.TckTest;

/**
 * @author eric.wittmann@gmail.com
 */
@TckTest(test=ModelReaderAppTest.class, configProperties="microprofile-reader.properties")
public class ModelReaderAppTckTest extends BaseTckTest {

    @Override
    public ModelReaderAppTest getDelegate() {
        return new ModelReaderAppTest() {
            @Override
            public ValidatableResponse callEndpoint(String format) {
                return doCallEndpoint(format);
            }
        };
    }

    @Override
    public Object[] getTestArguments() {
        return new String[] { "JSON" };
    }

}
