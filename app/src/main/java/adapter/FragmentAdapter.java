package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lab3.R;

import java.util.List;

import Entity.fragment_item_info;

public class FragmentAdapter extends RecyclerView.Adapter<FragmentAdapter.ViewHolder> {

    private List<fragment_item_info> dataList;
    private LayoutInflater layoutInflater;

    public FragmentAdapter(Context context, List<fragment_item_info> data) {
        this.dataList = data;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.fragment_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        fragment_item_info item = dataList.get(position);
        holder.itemTitle.setText(item.getItem_name());
        holder.itemImage.setImageResource(item.getImg());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView itemImage;
        TextView itemTitle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.shop_kart_item_image);
            itemTitle = itemView.findViewById(R.id.shop_kart_item_title);
        }
    }
}
