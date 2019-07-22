package com.example.contacts.model;

import com.example.contacts.constants.ContactType;

public class Contact {

    private String name;

    public ContactType getContactType() {
        return contactType;
    }

    public void setContactType(ContactType contactType) {
        this.contactType = contactType;
    }

    private ContactType contactType;

    public Contact(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return this.name;
    }
}
