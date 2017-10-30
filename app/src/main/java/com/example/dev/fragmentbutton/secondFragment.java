package com.example.dev.fragmentbutton;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by dev on 30/10/17.
 */

public class secondFragment extends Fragment {

    View view;
    Button secondButton;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        view = inflater.inflate(R.layout.second_fragment, container, false);

        secondButton = (Button)view.findViewById(R.id.secondButton);
        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "This button in second fragment!", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
