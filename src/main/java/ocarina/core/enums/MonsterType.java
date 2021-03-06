package ocarina.core.enums;

/**
 * ******************************************************************
 * Copyright ProjectOcarina (c) 2015. All Rights Reserved.
 * Any code contained within this document, and any associated APIs with similar branding
 * are the sole property of ProjectOcarina. Distribution, reproduction, taking snippets, or
 * claiming any contents as your will break the terms of the license, and void any
 * agreements with you, the third party.
 * ******************************************************************
 **/
public enum MonsterType {

    BLANK("BLANK");

    String name;

    MonsterType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
