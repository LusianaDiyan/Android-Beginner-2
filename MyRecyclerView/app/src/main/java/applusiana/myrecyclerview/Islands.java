package applusiana.myrecyclerview;


import android.os.Parcel;
import android.os.Parcelable;

public class Islands implements Parcelable {
    private String name, other, photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.other);
        dest.writeString(this.photo);
    }

    public Islands() {
    }

    protected Islands(Parcel in) {
        this.name = in.readString();
        this.other = in.readString();
        this.photo = in.readString();
    }

    public static final Parcelable.Creator<Islands> CREATOR = new Parcelable.Creator<Islands>() {
        @Override
        public Islands createFromParcel(Parcel source) {
            return new Islands(source);
        }

        @Override
        public Islands[] newArray(int size) {
            return new Islands[size];
        }
    };
}
