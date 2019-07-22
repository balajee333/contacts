package com.example.contacts.model;

import com.example.contacts.constants.ContactType;

public class EmailContact extends Contact {

    private String emailId;

    public EmailContact(String name , String emailId) {
        super(name);
        super.setContactType(ContactType.EMAIL);
        this.emailId = emailId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String getData() {
        return super.getData() + "\n\n" + this.emailId;
    }
}
