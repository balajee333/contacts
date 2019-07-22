package com.example.contacts.factory;

import com.example.contacts.model.Contact;
import com.example.contacts.model.DuoContact;
import com.example.contacts.model.EmailContact;
import com.example.contacts.model.ViberContact;
import com.example.contacts.model.WhatsappContact;

import java.util.ArrayList;
import java.util.List;

public class ContactsFactory {


    public static List<Contact> getContacts() {

        List<Contact> contactList = new ArrayList<>();
        Contact sureshwhatsapp = new WhatsappContact("Suresh (W)", false);
        Contact rameshemail = new EmailContact("Ramesh(E)","ramesh@gmail.com");
        Contact rameshDuo = new DuoContact("Ramesh(D)",true);
        Contact ramviber = new ViberContact("Ram(V)","ram@viber","Today, 07:19 PM","Imageurl");
        contactList.add(rameshemail);
        contactList.add(ramviber);
        contactList.add(sureshwhatsapp);
        contactList.add(rameshDuo);
        return contactList;
    }
}
