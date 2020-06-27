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

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.oltpbenchmark.config.Config;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

public class TextXmlRead {

    @Test
     public void testXml() throws IOException {

        loadFile("src/test/resources/new-config/sample_auctionmark_config.xml");
        //loadFile("src/test/resources/new-config/sample_chbenchmark_config.xml");
        loadFile("src/test/resources/new-config/sample_epinions_config.xml");
        loadFile("src/test/resources/new-config/sample_hyadapt_config.xml");
        loadFile("src/test/resources/new-config/sample_noop_config.xml");
        loadFile("src/test/resources/new-config/sample_resourcestresser_config.xml");
        loadFile("src/test/resources/new-config/sample_seats_config.xml");
        loadFile("src/test/resources/new-config/sample_sibench_config.xml");
        loadFile("src/test/resources/new-config/sample_smallbank_config.xml");
        loadFile("src/test/resources/new-config/sample_tatp_config.xml");
        loadFile("src/test/resources/new-config/sample_tpcc_config.xml");
        loadFile("src/test/resources/new-config/sample_tpds_config.xml");
        loadFile("src/test/resources/new-config/sample_tpch_config.xml");
        loadFile("src/test/resources/new-config/sample_twitter_config.xml");
        loadFile("src/test/resources/new-config/sample_voter_config.xml");
        loadFile("src/test/resources/new-config/sample_wikipedia_config.xml");
        loadFile("src/test/resources/new-config/sample_ycsb_config.xml");

    }

    private void loadFile(String pathName) throws IOException {
        File file = new File(pathName);
        XmlMapper xmlMapper = new XmlMapper();

        String xml = IOUtils.toString(new FileInputStream(file), Charset.defaultCharset());
        Config value = xmlMapper.readValue(xml, Config.class);

        System.out.println("got here");
    }

}
