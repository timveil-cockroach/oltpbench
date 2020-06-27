/*
 * Copyright 2020 by OLTPBenchmark Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
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

package com.oltpbenchmark.config;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.oltpbenchmark.types.DatabaseType;
import com.zaxxer.hikari.util.IsolationLevel;

import java.io.Serializable;
import java.util.List;

public class Config implements Serializable {

    //@JsonDeserialize(using = DatabaseTypeDeserializer.class)
    @JacksonXmlProperty(localName = "type")
    private DatabaseType databaseType;

    @JacksonXmlProperty(localName = "driver")
    private String driverClassName;

    @JacksonXmlProperty(localName = "url")
    private String url;

    @JacksonXmlProperty(localName = "username")
    private String username;

    @JacksonXmlProperty(localName = "password")
    private String password;

    @JacksonXmlProperty(localName = "isolation")
    private IsolationLevel isolationLevel;

    @JacksonXmlProperty(localName = "batchsize")
    private int batchSize;

    @JacksonXmlProperty(localName = "scalefactor")
    private int scaleFactor;

    @JacksonXmlProperty(localName = "terminals")
    private int terminals;

    @JacksonXmlProperty(localName = "works")
    private List<Work> works;

    @JacksonXmlProperty(localName = "transactiontypes")
    private List<TransactionType> transactionTypes;

}


