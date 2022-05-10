package io.trino.plugin.redshift;

import com.google.common.collect.ImmutableMap;
import io.trino.spi.Plugin;
import io.trino.spi.connector.ConnectorFactory;

import static com.google.common.collect.Iterables.getOnlyElement;

// Need to create jdbc connection to redshift cheezit-stage
public class RedshiftCheezitStage {
    Plugin plugin = new RedshiftPlugin();
//    ConnectorFactory factory = getOnlyElement(plugin.getConnectorFactories());

}
