package com.example.contacts.model;

import com.example.contacts.constants.ContactType;

public class ViberContact extends Contact {


    private String viberID;

    private String lastSeenTime;

    private String imageUrl;

    public ViberContact(String name, String viberID, String lastSeenTime, String imageUrl) {
        super(name);
        super.setContactType(ContactType.VIBER);
        this.viberID = viberID;
        this.lastSeenTime = lastSeenTime;
        this.imageUrl = imageUrl;
    }

    public String getViberID() {
        return viberID;
    }

    public void setViberID(String viberID) {
        this.viberID = viberID;
    }

    public String getLastSeenTime() {
        return lastSeenTime;
    }

    public void setLastSeenTime(String lastSeenTime) {
        this.lastSeenTime = lastSeenTime;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String getData() {
        return super.getData() + "\n\n" + this.viberID + "\n\n" + this.lastSeenTime;
    }
}
