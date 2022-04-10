package be.belfius.start.domain;

/**
 * @author tersc
 * first appearance on 14/03/2022
 */

public enum Gender {
    MALE("male"),
    FEMALE("female"),
    CONI("confirmation for Issuer"),
    UNKN("unknown");
    public final String label;

    private Gender(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
