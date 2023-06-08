package com.example.uts_if9_10121738_rifqisirojulmuzhoffar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.uts_if9_10121738_rifqisirojulmuzhoffar.AboutDialog;
import com.example.uts_if9_10121738_rifqisirojulmuzhoffar.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfileFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfileFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ProfileFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ProfileFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ProfileFragment newInstance(String param1, String param2) {
        ProfileFragment fragment = new ProfileFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    ImageView email, instagram, address;
    TextView about;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_profile, container, false);

        email = root.findViewById(R.id.icon_email);
        instagram = root.findViewById(R.id.icon_instagram);
        address = root.findViewById(R.id.icon_address);
        about = root.findViewById(R.id.about_app);

        email.setOnClickListener(v -> {
            Intent gm = new Intent();
            gm.setAction(Intent.ACTION_VIEW);
            gm.addCategory(Intent.CATEGORY_BROWSABLE);
            gm.setData(Uri.parse("mailto:rmuzhoffar@gmail.com"));
            startActivity(gm);
        });

        instagram.setOnClickListener(v -> {
            Intent ig = new Intent();
            ig.setAction(Intent.ACTION_VIEW);
            ig.addCategory(Intent.CATEGORY_BROWSABLE);
            ig.setData(Uri.parse("https://www.instagram.com/rfq.sm/"));
            startActivity(ig);
        });

        address.setOnClickListener(v -> {
            Intent map = new Intent();
            map.setAction(Intent.ACTION_VIEW);
            map.addCategory(Intent.CATEGORY_BROWSABLE);
            map.setData(Uri.parse("https://goo.gl/maps/dUQ1NJ2p3GdCgLFc8"));
            startActivity(map);
        });

        about.setOnClickListener(v -> {
            AboutDialog aboutDialog = new AboutDialog();
            aboutDialog.show(getFragmentManager(),"AboutDialogFragment");
        });

        return root;

    }
}