package com.sap.cloud.lm.sl.mta.handlers.v3_1;

import java.io.InputStream;
import java.util.Map;

import com.sap.cloud.lm.sl.common.ParsingException;
import com.sap.cloud.lm.sl.mta.model.v3_1.DeploymentDescriptor;
import com.sap.cloud.lm.sl.mta.model.v3_1.ExtensionDescriptor;
import com.sap.cloud.lm.sl.mta.parsers.v3_1.DeploymentDescriptorParser;
import com.sap.cloud.lm.sl.mta.parsers.v3_1.ExtensionDescriptorParser;
import com.sap.cloud.lm.sl.mta.schema.SchemaValidator;

public class DescriptorParser extends com.sap.cloud.lm.sl.mta.handlers.v3_0.DescriptorParser {

    public DescriptorParser() {
        super(new SchemaValidator(Schemas.MTAD), new SchemaValidator(Schemas.MTAEXT));
    }

    protected DescriptorParser(SchemaValidator mtadValidator, SchemaValidator mtaextValidator) {
        super(mtadValidator, mtaextValidator);
    }

    @Override
    public ExtensionDescriptor parseExtensionDescriptorYaml(InputStream yaml) throws ParsingException {
        return (ExtensionDescriptor) super.parseExtensionDescriptorYaml(yaml);
    }

    @Override
    public ExtensionDescriptor parseExtensionDescriptorYaml(String yaml) throws ParsingException {
        return (ExtensionDescriptor) super.parseExtensionDescriptorYaml(yaml);
    }

    @Override
    protected ExtensionDescriptorParser getExtensionDescriptorParser(Map<String, Object> map) {
        return new com.sap.cloud.lm.sl.mta.parsers.v3_1.ExtensionDescriptorParser(map);
    }

    @Override
    public DeploymentDescriptor parseDeploymentDescriptorYaml(InputStream yaml) throws ParsingException {
        return (DeploymentDescriptor) super.parseDeploymentDescriptorYaml(yaml);
    }

    @Override
    public DeploymentDescriptor parseDeploymentDescriptorYaml(String yaml) throws ParsingException {
        return (DeploymentDescriptor) super.parseDeploymentDescriptorYaml(yaml);
    }

    @Override
    protected DeploymentDescriptorParser getDeploymentDescriptorParser(Map<String, Object> map) {
        return new com.sap.cloud.lm.sl.mta.parsers.v3_1.DeploymentDescriptorParser(map);
    }

}
