package com.example.uts_if9_10121738_rifqisirojulmuzhoffar;

/*  Tanggal Pengerjaan  : 10 Juli 2023
    Nama                : Rifqi Sirojul Muzhoffar
    NIM                 : 10121738
    Kelas               : IF-9 */

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class AboutDialog extends DialogFragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.custom_about_dialog,container,false);
    }
}
