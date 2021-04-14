
package com.contrastsecurity.sarif;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Encapsulates a message intended to be read by the end user.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonPropertyOrder({
    "text",
    "markdown",
    "id",
    "arguments",
    "properties"
})
public class Message {

    /**
     * A plain text message string.
     * 
     */
    @JsonProperty("text")
    @JsonPropertyDescription("A plain text message string.")
    private String text;
    /**
     * A Markdown message string.
     * 
     */
    @JsonProperty("markdown")
    @JsonPropertyDescription("A Markdown message string.")
    private String markdown;
    /**
     * The identifier for this message.
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The identifier for this message.")
    private String id;
    /**
     * An array of strings to substitute into the message string.
     * 
     */
    @JsonProperty("arguments")
    @JsonPropertyDescription("An array of strings to substitute into the message string.")
    private List<String> arguments = null;
    /**
     * Key/value pairs that provide additional information about the object.
     * 
     */
    @JsonProperty("properties")
    @JsonPropertyDescription("Key/value pairs that provide additional information about the object.")
    private PropertyBag properties;

    /**
     * A plain text message string.
     * 
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * A plain text message string.
     * 
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    public Message withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * A Markdown message string.
     * 
     */
    @JsonProperty("markdown")
    public String getMarkdown() {
        return markdown;
    }

    /**
     * A Markdown message string.
     * 
     */
    @JsonProperty("markdown")
    public void setMarkdown(String markdown) {
        this.markdown = markdown;
    }

    public Message withMarkdown(String markdown) {
        this.markdown = markdown;
        return this;
    }

    /**
     * The identifier for this message.
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * The identifier for this message.
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Message withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * An array of strings to substitute into the message string.
     * 
     */
    @JsonProperty("arguments")
    public List<String> getArguments() {
        return arguments;
    }

    /**
     * An array of strings to substitute into the message string.
     * 
     */
    @JsonProperty("arguments")
    public void setArguments(List<String> arguments) {
        this.arguments = arguments;
    }

    public Message withArguments(List<String> arguments) {
        this.arguments = arguments;
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

    public Message withProperties(PropertyBag properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Message.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("markdown");
        sb.append('=');
        sb.append(((this.markdown == null)?"<null>":this.markdown));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("arguments");
        sb.append('=');
        sb.append(((this.arguments == null)?"<null>":this.arguments));
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
        result = ((result* 31)+((this.markdown == null)? 0 :this.markdown.hashCode()));
        result = ((result* 31)+((this.arguments == null)? 0 :this.arguments.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.properties == null)? 0 :this.properties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Message) == false) {
            return false;
        }
        Message rhs = ((Message) other);
        return ((((((this.markdown == rhs.markdown)||((this.markdown!= null)&&this.markdown.equals(rhs.markdown)))&&((this.arguments == rhs.arguments)||((this.arguments!= null)&&this.arguments.equals(rhs.arguments))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.properties == rhs.properties)||((this.properties!= null)&&this.properties.equals(rhs.properties))));
    }

}
