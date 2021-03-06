/*
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package io.selendroid.directory;

import org.apache.cordova.Config;
import org.apache.cordova.CordovaActivity;

import android.os.Bundle;

public class EmployeeDirectory extends CordovaActivity {
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    super.init();
    String data = null;
    if (getIntent().getData() != null) {

      data = getIntent().getData().toString();
      if (data.contains("#")) {
        data = data.split("#")[1];
      }
    }
    String url = Config.getStartUrl();
    if (data != null && data.isEmpty() == false) {
      System.out.println("Additional intent data: " + data);
      url = url + "#" + data;
    }
    System.out.println("using url: " + url);
    super.loadUrl(url);

  }
}
