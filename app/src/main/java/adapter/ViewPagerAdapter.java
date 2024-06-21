package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lab3.MainActivity;
import com.example.lab3.R;

import fragment.AttractionFragment;
import fragment.HotelFragment;
import fragment.RestaurantFragment;

public class ViewPagerAdapter extends RecyclerView.Adapter<ViewPagerAdapter.ViewHolder> {

    private int[] images;
    private LayoutInflater layoutInflater;
    private Context context;

    public ViewPagerAdapter(Context context, int[] images){
        this.images = images;
        this.layoutInflater = LayoutInflater.from(context);
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_view_pager, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(images[position]);
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentPosition = holder.getAdapterPosition();
                Fragment fragment = null;
                switch (currentPosition) {
                    case 0:
                        fragment = new AttractionFragment();
                        break;
                    case 1:
                        fragment = new RestaurantFragment();
                        break;
                    case 2:
                        fragment = new HotelFragment();
                        break;
                }
                if (fragment != null && context instanceof MainActivity) {
                    ((MainActivity) context).openFragment(fragment);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view);
        }
    }
}
