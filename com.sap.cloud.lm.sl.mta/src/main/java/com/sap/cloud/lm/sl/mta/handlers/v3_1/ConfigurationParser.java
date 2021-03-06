package com.sap.cloud.lm.sl.mta.handlers.v3_1;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import com.sap.cloud.lm.sl.common.ParsingException;
import com.sap.cloud.lm.sl.common.util.ListUtil;
import com.sap.cloud.lm.sl.mta.model.v3_1.Target;
import com.sap.cloud.lm.sl.mta.model.v3_1.Platform;
import com.sap.cloud.lm.sl.mta.parsers.v3_1.TargetParser;
import com.sap.cloud.lm.sl.mta.parsers.v3_1.PlatformParser;
import com.sap.cloud.lm.sl.mta.schema.SchemaValidator;

public class ConfigurationParser extends com.sap.cloud.lm.sl.mta.handlers.v3_0.ConfigurationParser {

    public ConfigurationParser() {
        super(new SchemaValidator(Schemas.PLATFORM_TYPES), new SchemaValidator(Schemas.PLATFORMS), new SchemaValidator(Schemas.PLATFORM));
    }

    protected ConfigurationParser(SchemaValidator platformTypesValidator, SchemaValidator platformsValidator,
        SchemaValidator platformValidator) {
        super(platformTypesValidator, platformsValidator, platformValidator);
    }

    public List<Platform> parsePlatformTypesJson3_1(String json) throws ParsingException {
        return ListUtil.cast(super.parsePlatformsJson(json));
    }

    public List<Platform> parsePlatformTypesJson3_1(InputStream json) throws ParsingException {
        return ListUtil.cast(super.parsePlatformsJson(json));
    }

    @Override
    protected PlatformParser getPlatformParser(Map<String, Object> source) {
        return new com.sap.cloud.lm.sl.mta.parsers.v3_1.PlatformParser(source);
    }

    public List<Target> parsePlatformsJson3_1(String json) throws ParsingException {
        return ListUtil.cast(super.parseTargetsJson(json));
    }

    public List<Target> parsePlatformsJson3_1(InputStream json) throws ParsingException {
        return ListUtil.cast(super.parseTargetsJson(json));
    }

    @Override
    public Target parseTargetJson(InputStream json) throws ParsingException {
        return (Target) super.parseTargetJson(json);
    }

    @Override
    public Target parseTargetJson(String json) throws ParsingException {
        return (Target) super.parseTargetJson(json);
    }

    @Override
    protected TargetParser getDeployTargetParser(Map<String, Object> source) {
        return new com.sap.cloud.lm.sl.mta.parsers.v3_1.TargetParser(source);
    }

}
