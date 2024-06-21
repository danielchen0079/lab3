package fragment;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lab3.R;

import java.util.List;

import Entity.DataService;
import Entity.fragment_item_info;
import adapter.FragmentAdapter;

public class RestaurantFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_restaurant, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recycler_view_restaurant);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        DataService dataService = new DataService();
        List<fragment_item_info> dataList = dataService.getItemList();
        FragmentAdapter adapter = new FragmentAdapter(getContext(), dataList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
