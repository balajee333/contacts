package com.example.contacts.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.contacts.R;
import com.example.contacts.databinding.ContactItemBinding;
import com.example.contacts.model.Contact;
import com.example.contacts.viewmodel.ContactListViewModel;

import java.util.List;

public class ContactListAdapter extends RecyclerView.Adapter<ContactListAdapter.ContactViewHolder> {

    List<ContactListViewModel> contactListViewModels;

    private static final String TAG = "ContactListAdapter";

    public ItemClickListener onClickListener;

    public ContactListAdapter(List<ContactListViewModel> contactListViewModels) {
        this.contactListViewModels = contactListViewModels;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ContactItemBinding binding = DataBindingUtil.inflate(inflater, R.layout.contact_item,parent,false);
        return new ContactViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {

        ContactListViewModel vm = contactListViewModels.get(position);
        holder.binding.setVm(vm);
    }

    @Override
    public int getItemCount() {
        return contactListViewModels.size();
    }

    public void setOnClickListener(ItemClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ContactItemBinding binding;

        ContactViewHolder(ContactItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
            this.binding.getRoot().setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            onClickListener.onItemClicked(view,contactListViewModels.get(getAdapterPosition()).contact.get());
        }
    }

    public interface ItemClickListener{

        void onItemClicked(View view, Contact contact);
    }

}
