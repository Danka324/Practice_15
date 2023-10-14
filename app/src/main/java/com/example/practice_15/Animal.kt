package com.example.practice_15

import android.os.Parcel
import android.os.Parcelable

class Animal() : Parcelable {

    private var weather: String = " "
    private var year: Int = 0
    private var datahp: Int = 1

    constructor(parcel: Parcel) : this() {
        weather = parcel.readString().toString()
        year = parcel.readInt()
        datahp = parcel.readInt()
    }


    companion object CREATOR : Parcelable.Creator<Animal> {
        override fun createFromParcel(parcel: Parcel): Animal {
            return Animal(parcel)
        }


        override fun newArray(size: Int): Array<Animal?> {
            return arrayOfNulls(size)
        }

    }

    constructor(_weather: String, _year: Int, _datahp: Int) : this() {
       weather = _weather
        year = _year
        datahp = _datahp

    }
    fun setWeather(_weather: String) {
        weather = _weather

    }
    fun getWeather() : String{
        return weather
    }
    fun setYear(_year: Int) {
        year = _year
    }

    fun getYear() : Int{
        return year
    }
    fun setDatahp(_datahp: Int) {
        datahp = _datahp

    }
    fun getDatahp(): Int{
        return datahp
    }
    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(p0: Parcel, p1: Int) {
        p0?.writeString(weather)
        p0?.writeInt(year)
        p0?.writeInt(datahp)

    }

}