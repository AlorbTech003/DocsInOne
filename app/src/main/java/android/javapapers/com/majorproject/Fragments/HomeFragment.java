package android.javapapers.com.majorproject.Fragments;

import android.content.Context;
import android.javapapers.com.majorproject.Adapters.SlideViewAdapter;
import android.javapapers.com.majorproject.R;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.text.HtmlCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class HomeFragment extends Fragment {

    private ImageView[] mDots;
    private SlideViewAdapter slideViewAdapter;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         View view=inflater.inflate(R.layout.fragment_home,container,false);

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

        return view;
    }


}
