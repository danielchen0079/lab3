package Entity;

import com.example.lab3.R;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    public List<fragment_item_info> getItemList() {
        List<fragment_item_info> itemList = new ArrayList<>();
        itemList.add(new fragment_item_info("Elegance At 148 On Elles Restaurant", R.drawable.reimg1));
        itemList.add(new fragment_item_info("The Batch Cafe",  R.drawable.reimg2));
        itemList.add(new fragment_item_info("Pinch of Spice",  R.drawable.reimg3));
        itemList.add(new fragment_item_info("The Rocks Cafe",  R.drawable.reimg4));
        itemList.add(new fragment_item_info("The Saucy Chef on St Andrew",  R.drawable.reimg5));
        itemList.add(new fragment_item_info("Buster Crabb",  R.drawable.reimg6));

        return itemList;
    }

    public List<fragment_item_info> getSecondItemList() {
        List<fragment_item_info> itemList = new ArrayList<>();
        itemList.add(new fragment_item_info("Tower Lodge Motel",  R.drawable.hoimg1));
        itemList.add(new fragment_item_info("The Langlands Hotel",  R.drawable.hoimg2));
        itemList.add(new fragment_item_info("Ascot Park Hotel",  R.drawable.hoimg3));
        itemList.add(new fragment_item_info("Shelby Motor Lodge",  R.drawable.hoimg4));
        itemList.add(new fragment_item_info("Queens Park Motels",  R.drawable.hoimg5));
        itemList.add(new fragment_item_info("Bavarian Motel",  R.drawable.hoimg6));
        return itemList;
    }

    public List<fragment_item_info> getThirdItemList() {
        List<fragment_item_info> itemList = new ArrayList<>();
        itemList.add(new fragment_item_info("Southern Scenic Route",  R.drawable.attimg1));
        itemList.add(new fragment_item_info("Dig This Invercargill",  R.drawable.attimg2));
        itemList.add(new fragment_item_info("Classic Motorcycle Mecca",  R.drawable.attimg3));
        itemList.add(new fragment_item_info("E Hayes and Sons - The World's Fastest Indian",  R.drawable.attimg4));
        itemList.add(new fragment_item_info("Queens Park",  R.drawable.attimg5));
        itemList.add(new fragment_item_info("Bill Richardson Transport World",  R.drawable.attimg6));
        return itemList;
    }
}
