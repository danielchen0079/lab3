package Entity;

public class fragment_item_info {
    private String item_name;
    private int img;

    public fragment_item_info(String item_name, int img) {
        this.item_name = item_name;
        this.img = img;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
