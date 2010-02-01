/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.empire.db.examples.codegen;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;


public class ValidatePluginRunTest {
	
	@Test
	public void testTargetFolder(){
		File file = new File("target/generated-sources/empiredb");
		assertTrue("No sources generated", file.exists());
		// TODO add extra validation for the real generated sources
	}
	
	@Test
	public void testGeneratedClass() throws ClassNotFoundException{
		Class<?> cls = Class.forName("org.apache.empire.db.example.MyDB");
		assertNotNull("Could not load generated class.", cls);
	}

}