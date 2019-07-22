package com.example.contacts.model;

import com.example.contacts.constants.ContactType;

public class DuoContact extends Contact {

    private boolean online;

    public DuoContact(String name, boolean online) {
        super(name);
        super.setContactType(ContactType.DUO);
        this.online = online;
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
