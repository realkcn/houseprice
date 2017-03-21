/*
 * Copyright 2012-2016 the original author or authors.
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

import com.huli.houseprice.service.QuerierFactory;

import org.apache.commons.cli.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private QuerierFactory querierFactoryService;

	public void run(String... args) {
		System.out.println(this.querierFactoryService.getHelloMessage());
		if (args.length > 0 && args[0].equals("exitcode")) {
			System.out.println("exit!");
		}
	}

	public static void main(String[] args) throws Exception {

        CommandLineParser parser = new DefaultParser( );
        Options options = new Options( );
        options.addOption("h", "help", false, "Print help message");
        options.addOption("w", "web", false, "web mode");
        // Parse the program arguments
        CommandLine commandLine = parser.parse( options, args );
        // Set the appropriate variables based on supplied options
        boolean verbose = false;
        boolean startWeb =false;

        if( commandLine.hasOption('h') ) {
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp( "houseprice", options );
            System.exit(0);
        }
        if( commandLine.hasOption('w') ) {
            startWeb = true;
        }

        SpringApplication app = new SpringApplication(Application.class);
        app.setWebEnvironment(startWeb);
        app.run(args);
//		SpringApplication.run(Application.class, args);
	}

}
