package proto.jcwu.restValidation;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name="meh")
@XmlAccessorType(XmlAccessType.NONE)
public class SomeClass implements Serializable {
    @XmlElement
    @NullOrNotBlankConstraint
    private String stringParameter;
    @XmlElement
    @NotNull
    private Long longParameter;
    @XmlElement
    @NotNull
    private Boolean boolParameter;

    public SomeClass(){
    }

    public SomeClass(String s, Long l, Boolean b){
        stringParameter = s;
        longParameter = l;
        boolParameter = b;
    }

    public String getStringParameter() {
        return stringParameter;
    }

    public void setStringParameter(String stringParameter) {
        this.stringParameter = stringParameter;
    }

    public Long getLongParameter() {
        return longParameter;
    }

    public void setLongParameter(Long longParameter) {
        this.longParameter = longParameter;
    }

    public Boolean getBoolParameter() {
        return boolParameter;
    }

    public void setBoolParameter(Boolean boolParameter) {
        this.boolParameter = boolParameter;
    }
}
