package org.herring.manager;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URL;
import java.util.List;

/**
 * @author Chiwan Park
 * @since 0.1
 */
@Service
public class ConfigurationService {

    private XMLConfiguration configuration;

    public ConfigurationService() {
        configuration = null;
    }

    public void setConfigurationURL(Resource url) throws ConfigurationException, IOException {
        configuration = new XMLConfiguration(url.getURL());
    }

    public String getZookeeperConnectionString() {
        List<Object> hosts = configuration.getList("zookeepers.zookeeper[@host]");
        List<Object> ports = configuration.getList("zookeepers.zookeeper[@port]");
        StringBuilder builder = new StringBuilder();

        for (int i = 0, length = hosts.size(); i < length; ++i) {
            builder.append(hosts.get(i));
            builder.append(":");
            builder.append(ports.get(i));

            if (i != length - 1)
                builder.append(",");
        }

        return builder.toString();
    }

    public int getZookeeperTimeout() {
        return configuration.getInt("zookeepers[@timeout]");
    }

    public String getJassConfiguration() {
        String configurationString = configuration.getString("zookeepers[@jassConfiguration]");
        URL jassURL = this.getClass().getClassLoader().getResource(configurationString);

        if (jassURL != null)
            return jassURL.toString();
        return "";
    }
}
