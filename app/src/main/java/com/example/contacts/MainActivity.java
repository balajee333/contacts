package com.example.contacts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import com.example.contacts.adapter.ContactListAdapter;
import com.example.contacts.databinding.ActivityMainBinding;
import com.example.contacts.model.Contact;
import com.example.contacts.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity implements ContactListAdapter.ItemClickListener {


    private static final String TAG = "MainActivity";

    private ContactListAdapter contactListAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MainViewModel vm = new MainViewModel();
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setVm(vm);

        this.getLifecycle().addObserver(vm);

        RecyclerView contactList = binding.contactlist;

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        contactList.setLayoutManager(linearLayoutManager);

        contactListAdapter = vm.getContactListAdapter();
        contactListAdapter.setOnClickListener(this);
        contactList.setAdapter(contactListAdapter);


    }

    @Override
    public void onItemClicked(View view, Contact contact) {
        Log.i(TAG, "onItemClicked: "+contact.getName());
        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle(contact.getContactType().getType());
        alertDialog.setMessage(contact.getData());
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();
    }
}
