package com.example.contacts.viewmodel;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.ObservableField;

import com.example.contacts.model.Contact;

public class ContactListViewModel extends BaseObservable {

    public ObservableField<Contact> contact = new ObservableField<>();

    public ContactListViewModel(Contact contact) {
        this.contact.set(contact);
    }

    @Bindable
    public String getName() {
        return this.contact.get().getName();
    }

}
