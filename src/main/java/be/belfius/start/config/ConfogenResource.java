package be.belfius.start.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author tersc
 * first appearance on 01/03/2022
 */

@Data
public class ConfogenResource {
    @JsonProperty("sendMedium")
    private String sendMedium;

    @JsonProperty("srcAppCode")
    private String srcAppCode;

    @JsonProperty("dealEvent")
    private String dealEvent;

    @JsonProperty("boDealNumber")
    private String boDealNumber;

    @JsonProperty("boDealVersion")
    private String boDealVersion;

    @JsonProperty("foDealNumber")
    private String foDealNumber;

    @JsonProperty("foSystem")
    private String foSystem;

    @JsonProperty("productCode")
    private String productCode;

    @JsonProperty("emirUTI")
    private String emirUTI;

    @JsonProperty("documentType")
    private DocumentType documentType;

    @JsonProperty("dexEntity")
    private String dexEntity;

    @JsonProperty("cptyName")
    private String cptyName;

    @JsonProperty("cptyShortName")
    private String cptyShortName;

    @JsonProperty("docLanguage")
    private String docLanguage;

    @JsonProperty("cptyDepartment")
    private String cptyDepartment;

    @JsonProperty("cptyStreetContact")
    private String cptyStreetContact;

    @JsonProperty("cptyZipContact")
    private String cptyZipContact;

    @JsonProperty("cptyCityContact")
    private String cptyCityContact;

    @JsonProperty("cptyCountryContact")
    private String cptyCountryContact;

    @JsonProperty("actorId")
    private String actorId;

    @JsonProperty("maType")
    private String maType;

    @JsonProperty("maDateAsOf")
    private String maDateAsOf;

    @JsonProperty("templateName")
    private String templateName;

    @JsonProperty("productCodeDisplay")
    private String productCodeDisplay;

    @JsonProperty("cptyFax")
    private String cptyFax;

    @JsonProperty("cptyEmail")
    private String cptyEmail;

    @JsonProperty("timestampSent")
    private String timestampSent;

    @JsonProperty("userId")
    private String userId;

    @JsonProperty("swConfoGen")
    private String swConfoGen;

    public ConfogenResource sendMedium(String sendMedium) {
        this.sendMedium = sendMedium;
        return this;
    }
}
