package com.example.viewmodelandlivedataapp;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private int counter =0;

 private MutableLiveData<Integer> countLiveData = new MutableLiveData<>();


    public  MutableLiveData<Integer> getInitialCcounter(){
        countLiveData.setValue(counter);

        return countLiveData;
    }

    public void getCounter(){

        counter++;
        countLiveData.setValue(counter);
    }
}
