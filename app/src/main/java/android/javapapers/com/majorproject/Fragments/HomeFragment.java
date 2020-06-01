package android.javapapers.com.majorproject.Fragments;

import android.javapapers.com.majorproject.Adapters.RecyclerViewCentralGovernmentAdapter;
import android.javapapers.com.majorproject.Adapters.RecyclerViewEducationAdapter;
import android.javapapers.com.majorproject.Adapters.RecyclerViewMostPopularAdapter;
import android.javapapers.com.majorproject.Adapters.SlideViewAdapter;
import android.javapapers.com.majorproject.Data.ImageDatas;
import android.javapapers.com.majorproject.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private ImageView[] mDots;
    private SlideViewAdapter slideViewAdapter;
    private ArrayList<String> mostpopularimages=new ArrayList<>();
    private ArrayList<String> centralgovernment=new ArrayList<>();
    private int length;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         View view=inflater.inflate(R.layout.fragment_home,container,false);
        mostpopularimages=new ImageDatas().getMostpopularimageurls();
        centralgovernment=new ImageDatas().getCentralgovernment();
        // Button load=view.findViewById(R.id.load_fragment);
        //load.setOnClickListener(this);
        //Button next=view.findViewById(R.id.nextactivity);
        //next.setOnClickListener(this);
        //load.setOnClickListener(new View.OnClickListener() {
        //  @Override
        //public void onClick(View v) {
        //  listener.onButtonClicked(v);
        //}
        //});



        slideViewAdapter=new SlideViewAdapter(getActivity());

        ViewPager viewPager=view.findViewById(R.id.informationimagesview);
        viewPager.setAdapter(slideViewAdapter);

        TabLayout tabLayout=view.findViewById(R.id.DotItem);
        tabLayout.setupWithViewPager(viewPager,true);

        //addDotsIndicator();

        //viewPager.addOnPageChangeListener(viewlistener);

       getRecyclerView(view);


        return view;
    }

    private void getRecyclerView(View v) {
        LinearLayoutManager layoutManager=new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL,false);
        RecyclerView recyclerView=v.findViewById(R.id.recyclerview_mostpopular);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewMostPopularAdapter adapter=new RecyclerViewMostPopularAdapter(getContext(),mostpopularimages);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager1=new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL,false);
        RecyclerView recyclerView1=v.findViewById(R.id.recyclerview_centralgovernment);
        recyclerView1.setLayoutManager(layoutManager1);
        RecyclerViewCentralGovernmentAdapter adapter1=new RecyclerViewCentralGovernmentAdapter(getContext(),centralgovernment);
        recyclerView1.setAdapter(adapter1);

    }


}
