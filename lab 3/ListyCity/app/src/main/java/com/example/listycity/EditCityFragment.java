package com.example.listycity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class EditCityFragment extends DialogFragment {

    interface EditCityDialogListener{
        void editCity();
    }

    private EditCityFragment.EditCityDialogListener listener;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        if (context instanceof EditCityFragment.EditCityDialogListener) {
            listener = (EditCityFragment.EditCityDialogListener) context;
        } else {
            throw new RuntimeException(context + " must implement EditCityDialogListener");
        }
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_edit_city, null);

        MainActivity activity = (MainActivity) getActivity();
        assert activity != null;

        City city = activity.getCity();

        EditText editCityEditText = view.findViewById(R.id.edit_text_edit_city);
        EditText editProvinceEditText = view.findViewById(R.id.edit_text_edit_prov);

        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());

        return builder
                .setView(view)
                .setTitle("Edit a city")
                .setNegativeButton("Cancel", null)
                .setPositiveButton("Edit", (dialog, which) -> {
                    city.setName(editCityEditText.getText().toString());
                    city.setProvince(editProvinceEditText.getText().toString());
                    listener.editCity();
                })
                .create();
    }
}
