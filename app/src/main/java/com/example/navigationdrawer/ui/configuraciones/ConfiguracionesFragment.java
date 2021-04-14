package com.example.navigationdrawer.ui.configuraciones;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.navigationdrawer.R;

public class ConfiguracionesFragment extends Fragment {

    private ConfiguracionesViewModel configuracionesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        configuracionesViewModel =
                new ViewModelProvider(this).get(ConfiguracionesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_configuraciones, container, false);
        final TextView textView = root.findViewById(R.id.text_configuraciones);
        configuracionesViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}