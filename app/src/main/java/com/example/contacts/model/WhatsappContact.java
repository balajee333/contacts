package com.example.contacts.model;

import com.example.contacts.constants.ContactType;

public class WhatsappContact extends Contact {

    private boolean online;

    public WhatsappContact(String name, boolean online) {
        super(name);
        this.online = online;
        super.setContactType(ContactType.WHATSAPP);
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    @Override
    public String getData() {
        return super.getData() + "\n\nOnline : " + this.online;
    }
}
