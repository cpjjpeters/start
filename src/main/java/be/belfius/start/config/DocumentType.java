package be.belfius.start.config;

/**
 * @author tersc
 * first appearance on 01/03/2022
 */


public enum DocumentType {
    CERT("cert"),
    CONF("confirmation"),
    CONI("confirmation for Issuer"),
    COND("confirmation for Domiciliary agent"),
    CHAS("chaser"),
    FIXI("fixing"), //release december 2021
    ISSU("information letter"), // komt later
    UNKN("unknown");
    public final String label;

    private DocumentType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

}
