package applusiana.kamusbahasa;

/**
 * Created by USER on 04/05/2018.
 */

public class dbTranslate {

    private int id;
    private  String indonesia;
    private  String inggris;

    public dbTranslate(){
    }

    public dbTranslate(int id, String indonesia, String inggris) {
        this.id = id;
        this.indonesia = indonesia;
        this.inggris = inggris;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIndonesia() {
        return indonesia;
    }

    public void setIndonesia(String indonesia) {
        this.indonesia = indonesia;
    }

    public String getInggris() {
        return inggris;
    }

    public void setInggris(String inggris) {
        this.inggris = inggris;
    }
}
