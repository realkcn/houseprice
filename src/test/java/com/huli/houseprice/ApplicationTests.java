/*
 * Copyright 2012-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.huli.houseprice;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import org.springframework.boot.test.rule.OutputCapture;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Application}.
 *
 * @author Dave Syer
 * @author Phillip Webb
 */
public class ApplicationTests {

	@Rule
	public OutputCapture outputCapture = new OutputCapture();

	private String profiles;

	@Before
	public void init() {
		this.profiles = System.getProperty("spring.profiles.active");
	}

	@After
	public void after() {
		if (this.profiles != null) {
			System.setProperty("spring.profiles.active", this.profiles);
		}
		else {
			System.clearProperty("spring.profiles.active");
		}
	}

//	@Test
//	public void testDefaultSettings() throws Exception {
//		Application.main(new String[0]);
//		String output = this.outputCapture.toString();
//		assertThat(output).contains("Hello Phil");
//		assertThat(output).contains("The @ConfigurationProperties bean class "
//				+ "SampleConfigurationProperties contains "
//				+ "validation constraints but had not been annotated "
//				+ "with @Validated");
//	}
//
//	@Test
//	public void testCommandLineOverrides() throws Exception {
//		Application.main(new String[] { "--name=Gordon" });
//		String output = this.outputCapture.toString();
//		assertThat(output).contains("Hello Gordon");
//	}
//
}