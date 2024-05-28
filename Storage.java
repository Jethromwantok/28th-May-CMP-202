public class Storage {

    String type ="SSD";

    String manufacturer = "Samsung";

    @Override
    public String toString() {
        return "Storage{" +
                "type='" + type + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    int capacity = 512;
}
