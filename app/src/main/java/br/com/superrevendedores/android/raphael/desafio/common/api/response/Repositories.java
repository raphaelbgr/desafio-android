package br.com.superrevendedores.android.raphael.desafio.common.api.response;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

import br.com.superrevendedores.android.raphael.desafio.common.api.model.Items;


public class Repositories implements Parcelable {

    @Expose
    private List<Items> items = new ArrayList<>();
    @Expose
    private int total_count;


    private Repositories(Parcel in) {
        total_count = in.readInt();
    }

    public static final Creator<Repositories> CREATOR = new Creator<Repositories>() {
        @Override
        public Repositories createFromParcel(Parcel in) {
            return new Repositories(in);
        }

        @Override
        public Repositories[] newArray(int size) {
            return new Repositories[size];
        }
    };

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    public int getTotal_count() {
        return total_count;
    }

    @Override
    public String toString() {
        return "Repositories [items = " + items + ", total_count = " + total_count + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Repositories that = (Repositories) o;
        return total_count == that.total_count && items.equals(that.items);

    }

    @Override
    public int hashCode() {
        int result = items.hashCode();
        result = 31 * result + total_count;
        return result;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(total_count);
    }
}