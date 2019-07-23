package com.example.contacts.viewmodel;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

import com.example.contacts.adapter.ContactListAdapter;
import com.example.contacts.factory.ContactsFactory;
import com.example.contacts.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class MainViewModel implements LifecycleObserver {

    private ContactListAdapter contactListAdapter;

    private List<ContactListViewModel> contactListViewModels = new ArrayList<>();


    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        prepareContactListViewModel();
    }

    private void prepareContactListViewModel() {

        List<Contact> contactList = ContactsFactory.getContacts();
        for(Contact contact:contactList) {
            ContactListViewModel contactListViewModel = new ContactListViewModel(contact);
            contactListViewModels.add(contactListViewModel);
            contactListAdapter.notifyDataSetChanged();
        }
    }

    public ContactListAdapter getContactListAdapter() {
        contactListAdapter = new ContactListAdapter(contactListViewModels);
        return contactListAdapter;
    }
}
