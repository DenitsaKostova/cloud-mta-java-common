package com.sap.cloud.lm.sl.mta.parsers.v1_0;

import static com.sap.cloud.lm.sl.mta.handlers.v1_0.Schemas.PTF_RESOURCE_TYPE;

import java.util.Map;

import com.sap.cloud.lm.sl.common.ParsingException;
import com.sap.cloud.lm.sl.mta.model.v1_0.PlatformResourceType;
import com.sap.cloud.lm.sl.mta.model.v1_0.PlatformResourceType.PlatformResourceTypeBuilder;
import com.sap.cloud.lm.sl.mta.parsers.ModelParser;
import com.sap.cloud.lm.sl.mta.schema.MapElement;

public class PlatformResourceTypeParser extends ModelParser<PlatformResourceType> {

    protected static final String PROCESSED_OBJECT_NAME = "MTA platform resource type";

    public static final String NAME = "name";
    public static final String PROPERTIES = "properties";

    public PlatformResourceTypeParser(Map<String, Object> source) {
        this(PTF_RESOURCE_TYPE, source);
    }

    protected PlatformResourceTypeParser(MapElement schema, Map<String, Object> source) {
        super(PROCESSED_OBJECT_NAME, schema, source);
    }

    @Override
    public PlatformResourceType parse() throws ParsingException {
        PlatformResourceTypeBuilder builder = new PlatformResourceTypeBuilder();
        builder.setName(getName());
        builder.setProperties(getProperties());
        return builder.build();
    }

    protected String getName() throws ParsingException {
        return getStringElement(NAME);
    }

    protected Map<String, Object> getProperties() {
        return getMapElement(PROPERTIES);
    }

}
