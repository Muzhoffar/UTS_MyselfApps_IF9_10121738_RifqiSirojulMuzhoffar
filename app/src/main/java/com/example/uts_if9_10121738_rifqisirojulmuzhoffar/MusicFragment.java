package com.example.uts_if9_10121738_rifqisirojulmuzhoffar;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MusicFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MusicFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MusicFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MusicFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MusicFragment newInstance(String param1, String param2) {
        MusicFragment fragment = new MusicFragment();
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

    RecyclerView recyclerViewMusic;
    ArrayList<MusicModel> musicModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_music, container, false);

        recyclerViewMusic = root.findViewById(R.id.recview_music);
        recyclerViewMusic.setLayoutManager(new LinearLayoutManager(getContext()));

        musicModel = new ArrayList<>();

        MusicModel music1 = new MusicModel(R.drawable.cover_fine, "Fine", "Taeyeon");
        musicModel.add(music1);
        MusicModel music2 = new MusicModel(R.drawable.cover_goodday, "Good Day", "IU");
        musicModel.add(music2);
        MusicModel music3 = new MusicModel(R.drawable.cover_psycho, "Psycho", "Red Velvet");
        musicModel.add(music3);
        MusicModel music4 = new MusicModel(R.drawable.cover_eldorado, "El Dorado", "EXO");
        musicModel.add(music4);
        MusicModel music5 = new MusicModel(R.drawable.cover_rose, "Rose", "D.O");
        musicModel.add(music5);
        MusicModel music6 = new MusicModel(R.drawable.cover_thatsokay, "That's Okay", "D.O");
        musicModel.add(music6);
        MusicModel music7 = new MusicModel(R.drawable.cover_gravity, "Gravity", "Taeyeon");
        musicModel.add(music7);
        MusicModel music8 = new MusicModel(R.drawable.cover_some, "Some", "BOL4");
        musicModel.add(music8);
        MusicModel music9 = new MusicModel(R.drawable.cover_eight, "Eight", "IU");
        musicModel.add(music9);
        MusicModel music10 = new MusicModel(R.drawable.cover_backintime, "Back In Time", "Lyn");
        musicModel.add(music10);

        recyclerViewMusic.setAdapter(new MusicAdapter(musicModel));

        VideoView vvVideo = root.findViewById(R.id.vv_video);
        String videoPath = "android.resource://" + getContext().getPackageName() + "/" + R.raw.video;
        Uri uri = Uri.parse(videoPath);
        vvVideo.setVideoURI(uri);

        MediaController mediaController = new MediaController(getContext());
        vvVideo.setMediaController(mediaController);
        mediaController.setAnchorView(vvVideo);

        return root;
    }
}