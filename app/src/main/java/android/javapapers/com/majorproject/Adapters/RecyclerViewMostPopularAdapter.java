package android.javapapers.com.majorproject.Adapters;

import android.content.Context;
import android.javapapers.com.majorproject.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerViewMostPopularAdapter extends RecyclerView.Adapter<RecyclerViewMostPopularAdapter.ViewHolder>{

    private ArrayList<String> mImageurls=new ArrayList<>();
    private Context context;

    public RecyclerViewMostPopularAdapter(Context context,ArrayList<String> mImageurls) {
        this.mImageurls = mImageurls;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.most_popular,parent,false);
       return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        Glide.with(context)
                .asBitmap()
                .load(mImageurls.get(position))
                .into(holder.images);

        holder.images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "position "+position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mImageurls.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView images;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            images=itemView.findViewById(R.id.mostpopularimages);
        }
    }
}
