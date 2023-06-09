package com.example.uts_if9_10121738_rifqisirojulmuzhoffar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ActivityFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ActivityFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ActivityFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ActivityFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ActivityFragment newInstance(String param1, String param2) {
        ActivityFragment fragment = new ActivityFragment();
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

    RecyclerView recyclerViewDaily;
    ArrayList<ActivityModel> ActivityModel;
    RecyclerView recyclerViewFriendlist;
    ArrayList<FriendlistModel> friendlistModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_activity, container, false);

        recyclerViewDaily = root.findViewById(R.id.recview_daily);
        recyclerViewDaily.setLayoutManager(new LinearLayoutManager(getContext()));

        ActivityModel = new ArrayList<>();

        ActivityModel daily1 = new ActivityModel(R.drawable.icon_wakeup, "Wake Up", "Get up early to start the day");
        ActivityModel.add(daily1);
        ActivityModel daily2 = new ActivityModel(R.drawable.icon_tidyup, "Tidy up the room", "Tidy up the room to make it comfortable");
        ActivityModel.add(daily2);
        ActivityModel daily3 = new ActivityModel(R.drawable.icon_shower, "Take a Shower", "Take a shower so you don't stink");
        ActivityModel.add(daily3);
        ActivityModel daily4 = new ActivityModel(R.drawable.icon_eat, "Eat", "Breakfast, lunch, dinner so you don't die");
        ActivityModel.add(daily4);
        ActivityModel daily5 = new ActivityModel(R.drawable.icon_study, "Studying", "Gain new knowledge and insights");
        ActivityModel.add(daily5);
        ActivityModel daily6 = new ActivityModel(R.drawable.icon_hobby, "Doing My Hobby", "Watching movies, playing games, listening to music");
        ActivityModel.add(daily6);
        ActivityModel daily8 = new ActivityModel(R.drawable.icon_sleep, "Sleep", "Sleep to rest from a tiring day");
        ActivityModel.add(daily8);

        recyclerViewDaily.setAdapter(new ActivityAdapter(ActivityModel));

        recyclerViewFriendlist = root.findViewById(R.id.recview_friendlist);
        recyclerViewFriendlist.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        friendlistModel = new ArrayList<>();

        FriendlistModel friendlist1 = new FriendlistModel(R.drawable.profile_kevin, "Kevin");
        friendlistModel.add(friendlist1);
        FriendlistModel friendlist2 = new FriendlistModel(R.drawable.icon_profile, "Nauval");
        friendlistModel.add(friendlist2);
        FriendlistModel friendlist3 = new FriendlistModel(R.drawable.profile_rifa, "Rifa");
        friendlistModel.add(friendlist3);
        FriendlistModel friendlist4 = new FriendlistModel(R.drawable.icon_profile, "Syifaul");
        friendlistModel.add(friendlist4);
        FriendlistModel friendlist5 = new FriendlistModel(R.drawable.profile_farhan, "Farhan");
        friendlistModel.add(friendlist5);
        FriendlistModel friendlist6 = new FriendlistModel(R.drawable.icon_profile, "Yusril");
        friendlistModel.add(friendlist6);

        recyclerViewFriendlist.setAdapter(new FriendlistAdapter(friendlistModel));

        return root;
    }
}