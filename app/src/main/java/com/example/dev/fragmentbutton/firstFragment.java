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

public class firstFragment extends Fragment {

    View view;
    Button firstButton;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        view = inflater.inflate(R.layout.first_fragment, container, false);

        firstButton = (Button)view.findViewById(R.id.firstButton);
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "This button in first fragment!", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
