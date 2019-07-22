package com.example.contacts.constants;

public enum ContactType {


    EMAIL("Email"),
    WHATSAPP("Whatsapp"),
    DUO("Duo"),
    VIBER("Viber");

    private String type;

    ContactType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
