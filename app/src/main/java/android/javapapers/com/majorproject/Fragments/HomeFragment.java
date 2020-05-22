package android.javapapers.com.majorproject.Fragments;

import android.javapapers.com.majorproject.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view=inflater.inflate(R.layout.fragment_home,container,false);

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
        return view;
    }
}
