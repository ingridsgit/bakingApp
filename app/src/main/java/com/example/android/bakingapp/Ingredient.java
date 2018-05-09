package com.example.android.bakingapp;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/**
 * Created by Ingrid on 3/11/2018.
 */

public class Ingredient implements Parcelable{
    private int quantity;

    private String measure;
    private String name;

    public Ingredient(int quantity, String measure, String name){
        this.quantity = quantity;
        this.measure = measure;
        this.name = name;
    }

    protected Ingredient(Parcel in) {
        quantity = in.readInt();
        measure = in.readString();
        name = in.readString();
    }

    public static final Creator<Ingredient> CREATOR = new Creator<Ingredient>() {
        @Override
        public Ingredient createFromParcel(Parcel in) {
            return new Ingredient(in);
        }

        @Override
        public Ingredient[] newArray(int size) {
            return new Ingredient[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(quantity);
        parcel.writeString(measure);
        parcel.writeString(name);

    }

    public int getQuantity() {
        return quantity;
    }

    public String getMeasure() {
        return measure;
    }

    public String getName() {
        return name;
    }

}