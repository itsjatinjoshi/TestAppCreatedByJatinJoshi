package com.example.testappcreatedbyjatinjoshi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ContactsAdapter extends ArrayAdapter {

    private Context context;
    private List<Contact> contacts;

    public ContactsAdapter (Context context, List<Contact> list){

        super ( context, R.layout.row_layout, list);
        this.context = context;
        this.contacts= list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.row_layout, parent, false);

        TextView tvChar= convertView.findViewById(R.id.tvChar);
        TextView tvName= convertView.findViewById(R.id.tvName);
        TextView tvMail= convertView.findViewById(R.id.tvMail);

        tvChar.setText(contacts.get(position).getName().toUpperCase().charAt(0)+ "");
        tvName.setText(contacts.get(position).getName());
        tvMail.setText(contacts.get(position).getEmail());

        return convertView;
    }
}
