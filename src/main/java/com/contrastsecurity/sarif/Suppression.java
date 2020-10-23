
package com.contrastsecurity.sarif;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * A suppression that is relevant to a result.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "guid",
    "kind",
    "status",
    "justification",
    "location",
    "properties"
})
public class Suppression {

    /**
     * A stable, unique identifer for the suprression in the form of a GUID.
     * 
     */
    @JsonProperty("guid")
    @JsonPropertyDescription("A stable, unique identifer for the suprression in the form of a GUID.")
    private String guid;
    /**
     * A string that indicates where the suppression is persisted.
     * (Required)
     * 
     */
    @JsonProperty("kind")
    @JsonPropertyDescription("A string that indicates where the suppression is persisted.")
    private Suppression.Kind kind;
    /**
     * A string that indicates the review status of the suppression.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("A string that indicates the review status of the suppression.")
    private Suppression.Status status;
    /**
     * A string representing the justification for the suppression.
     * 
     */
    @JsonProperty("justification")
    @JsonPropertyDescription("A string representing the justification for the suppression.")
    private String justification;
    /**
     * A location within a programming artifact.
     * 
     */
    @JsonProperty("location")
    @JsonPropertyDescription("A location within a programming artifact.")
    private Location location;
    /**
     * Key/value pairs that provide additional information about the object.
     * 
     */
    @JsonProperty("properties")
    @JsonPropertyDescription("Key/value pairs that provide additional information about the object.")
    private PropertyBag properties;

    /**
     * A stable, unique identifer for the suprression in the form of a GUID.
     * 
     */
    @JsonProperty("guid")
    public String getGuid() {
        return guid;
    }

    /**
     * A stable, unique identifer for the suprression in the form of a GUID.
     * 
     */
    @JsonProperty("guid")
    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Suppression withGuid(String guid) {
        this.guid = guid;
        return this;
    }

    /**
     * A string that indicates where the suppression is persisted.
     * (Required)
     * 
     */
    @JsonProperty("kind")
    public Suppression.Kind getKind() {
        return kind;
    }

    /**
     * A string that indicates where the suppression is persisted.
     * (Required)
     * 
     */
    @JsonProperty("kind")
    public void setKind(Suppression.Kind kind) {
        this.kind = kind;
    }

    public Suppression withKind(Suppression.Kind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * A string that indicates the review status of the suppression.
     * 
     */
    @JsonProperty("status")
    public Suppression.Status getStatus() {
        return status;
    }

    /**
     * A string that indicates the review status of the suppression.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Suppression.Status status) {
        this.status = status;
    }

    public Suppression withStatus(Suppression.Status status) {
        this.status = status;
        return this;
    }

    /**
     * A string representing the justification for the suppression.
     * 
     */
    @JsonProperty("justification")
    public String getJustification() {
        return justification;
    }

    /**
     * A string representing the justification for the suppression.
     * 
     */
    @JsonProperty("justification")
    public void setJustification(String justification) {
        this.justification = justification;
    }

    public Suppression withJustification(String justification) {
        this.justification = justification;
        return this;
    }

    /**
     * A location within a programming artifact.
     * 
     */
    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    /**
     * A location within a programming artifact.
     * 
     */
    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    public Suppression withLocation(Location location) {
        this.location = location;
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

    public Suppression withProperties(PropertyBag properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Suppression.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("guid");
        sb.append('=');
        sb.append(((this.guid == null)?"<null>":this.guid));
        sb.append(',');
        sb.append("kind");
        sb.append('=');
        sb.append(((this.kind == null)?"<null>":this.kind));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("justification");
        sb.append('=');
        sb.append(((this.justification == null)?"<null>":this.justification));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
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
        result = ((result* 31)+((this.kind == null)? 0 :this.kind.hashCode()));
        result = ((result* 31)+((this.guid == null)? 0 :this.guid.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.justification == null)? 0 :this.justification.hashCode()));
        result = ((result* 31)+((this.properties == null)? 0 :this.properties.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Suppression) == false) {
            return false;
        }
        Suppression rhs = ((Suppression) other);
        return (((((((this.kind == rhs.kind)||((this.kind!= null)&&this.kind.equals(rhs.kind)))&&((this.guid == rhs.guid)||((this.guid!= null)&&this.guid.equals(rhs.guid))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.justification == rhs.justification)||((this.justification!= null)&&this.justification.equals(rhs.justification))))&&((this.properties == rhs.properties)||((this.properties!= null)&&this.properties.equals(rhs.properties))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * A string that indicates where the suppression is persisted.
     * 
     */
    public enum Kind {

        IN_SOURCE("inSource"),
        EXTERNAL("external");
        private final String value;
        private final static Map<String, Suppression.Kind> CONSTANTS = new HashMap<String, Suppression.Kind>();

        static {
            for (Suppression.Kind c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Kind(String value) {
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
        public static Suppression.Kind fromValue(String value) {
            Suppression.Kind constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * A string that indicates the review status of the suppression.
     * 
     */
    public enum Status {

        ACCEPTED("accepted"),
        UNDER_REVIEW("underReview"),
        REJECTED("rejected");
        private final String value;
        private final static Map<String, Suppression.Status> CONSTANTS = new HashMap<String, Suppression.Status>();

        static {
            for (Suppression.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Status(String value) {
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
        public static Suppression.Status fromValue(String value) {
            Suppression.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
