/*
 * Copyright 2017 Huawei Technologies Co., Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.servicecomb.springboot.pojo.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.servicecomb.foundation.common.utils.Log4jUtils;
import io.servicecomb.springboot.starter.provider.EnableServiceComb;

/**
 * SpringmvcClient
 *
 *
 */
@SpringBootApplication
@EnableServiceComb
public class PojoClient {

  public static void main(final String[] args) throws Exception {
    Log4jUtils.init();
    SpringApplication.run(PojoClient.class, args);

    io.servicecomb.demo.pojo.client.PojoClientTest.runTest();
  }
}
