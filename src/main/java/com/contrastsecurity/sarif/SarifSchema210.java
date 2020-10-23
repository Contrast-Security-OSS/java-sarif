
package com.contrastsecurity.sarif;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Static Analysis Results Format (SARIF) Version 2.1.0 JSON Schema
 * <p>
 * Static Analysis Results Format (SARIF) Version 2.1.0 JSON Schema: a standard format for the output of static analysis tools.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "$schema",
    "version",
    "runs",
    "inlineExternalProperties",
    "properties"
})
public class SarifSchema210 {

    /**
     * The URI of the JSON schema corresponding to the version.
     * 
     */
    @JsonProperty("$schema")
    @JsonPropertyDescription("The URI of the JSON schema corresponding to the version.")
    private URI $schema;
    /**
     * The SARIF format version of this log file.
     * (Required)
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("The SARIF format version of this log file.")
    private SarifSchema210 .Version version;
    /**
     * The set of runs contained in this log file.
     * (Required)
     * 
     */
    @JsonProperty("runs")
    @JsonPropertyDescription("The set of runs contained in this log file.")
    private List<Run> runs = new ArrayList<Run>();
    /**
     * References to external property files that share data between runs.
     * 
     */
    @JsonProperty("inlineExternalProperties")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("References to external property files that share data between runs.")
    private Set<ExternalProperties> inlineExternalProperties = new LinkedHashSet<ExternalProperties>();
    /**
     * Key/value pairs that provide additional information about the object.
     * 
     */
    @JsonProperty("properties")
    @JsonPropertyDescription("Key/value pairs that provide additional information about the object.")
    private PropertyBag properties;

    /**
     * The URI of the JSON schema corresponding to the version.
     * 
     */
    @JsonProperty("$schema")
    public URI get$schema() {
        return $schema;
    }

    /**
     * The URI of the JSON schema corresponding to the version.
     * 
     */
    @JsonProperty("$schema")
    public void set$schema(URI $schema) {
        this.$schema = $schema;
    }

    public SarifSchema210 with$schema(URI $schema) {
        this.$schema = $schema;
        return this;
    }

    /**
     * The SARIF format version of this log file.
     * (Required)
     * 
     */
    @JsonProperty("version")
    public SarifSchema210 .Version getVersion() {
        return version;
    }

    /**
     * The SARIF format version of this log file.
     * (Required)
     * 
     */
    @JsonProperty("version")
    public void setVersion(SarifSchema210 .Version version) {
        this.version = version;
    }

    public SarifSchema210 withVersion(SarifSchema210 .Version version) {
        this.version = version;
        return this;
    }

    /**
     * The set of runs contained in this log file.
     * (Required)
     * 
     */
    @JsonProperty("runs")
    public List<Run> getRuns() {
        return runs;
    }

    /**
     * The set of runs contained in this log file.
     * (Required)
     * 
     */
    @JsonProperty("runs")
    public void setRuns(List<Run> runs) {
        this.runs = runs;
    }

    public SarifSchema210 withRuns(List<Run> runs) {
        this.runs = runs;
        return this;
    }

    /**
     * References to external property files that share data between runs.
     * 
     */
    @JsonProperty("inlineExternalProperties")
    public Set<ExternalProperties> getInlineExternalProperties() {
        return inlineExternalProperties;
    }

    /**
     * References to external property files that share data between runs.
     * 
     */
    @JsonProperty("inlineExternalProperties")
    public void setInlineExternalProperties(Set<ExternalProperties> inlineExternalProperties) {
        this.inlineExternalProperties = inlineExternalProperties;
    }

    public SarifSchema210 withInlineExternalProperties(Set<ExternalProperties> inlineExternalProperties) {
        this.inlineExternalProperties = inlineExternalProperties;
        return this;
    }

    /**
     * Key/value pairs that provide additional information about the object.
     * 
     */
    @JsonProperty("properties")
    public PropertyBag getProperties() {
        return properties;
    }

    /**
     * Key/value pairs that provide additional information about the object.
     * 
     */
    @JsonProperty("properties")
    public void setProperties(PropertyBag properties) {
        this.properties = properties;
    }

    public SarifSchema210 withProperties(PropertyBag properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SarifSchema210 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("$schema");
        sb.append('=');
        sb.append(((this.$schema == null)?"<null>":this.$schema));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("runs");
        sb.append('=');
        sb.append(((this.runs == null)?"<null>":this.runs));
        sb.append(',');
        sb.append("inlineExternalProperties");
        sb.append('=');
        sb.append(((this.inlineExternalProperties == null)?"<null>":this.inlineExternalProperties));
        sb.append(',');
        sb.append("properties");
        sb.append('=');
        sb.append(((this.properties == null)?"<null>":this.properties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.inlineExternalProperties == null)? 0 :this.inlineExternalProperties.hashCode()));
        result = ((result* 31)+((this.$schema == null)? 0 :this.$schema.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.runs == null)? 0 :this.runs.hashCode()));
        result = ((result* 31)+((this.properties == null)? 0 :this.properties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SarifSchema210) == false) {
            return false;
        }
        SarifSchema210 rhs = ((SarifSchema210) other);
        return ((((((this.inlineExternalProperties == rhs.inlineExternalProperties)||((this.inlineExternalProperties!= null)&&this.inlineExternalProperties.equals(rhs.inlineExternalProperties)))&&((this.$schema == rhs.$schema)||((this.$schema!= null)&&this.$schema.equals(rhs.$schema))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.runs == rhs.runs)||((this.runs!= null)&&this.runs.equals(rhs.runs))))&&((this.properties == rhs.properties)||((this.properties!= null)&&this.properties.equals(rhs.properties))));
    }


    /**
     * The SARIF format version of this log file.
     * 
     */
    public enum Version {

        _2_1_0("2.1.0");
        private final String value;
        private final static Map<String, SarifSchema210 .Version> CONSTANTS = new HashMap<String, SarifSchema210 .Version>();

        static {
            for (SarifSchema210 .Version c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Version(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static SarifSchema210 .Version fromValue(String value) {
            SarifSchema210 .Version constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
