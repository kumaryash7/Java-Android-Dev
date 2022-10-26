package com.example.viewpagerapp;

public enum ModelObject {

    RED(R.string.red,R.layout.view_red),
    BLUE(R.string.blue,R.layout.view_blue),
    GREEN(R.string.green,R.layout.view_green);



    private int mTitleResId;
    private  int mLayoutResId;


    ModelObject(int TitleResId,int LayoutResId){
        mLayoutResId=LayoutResId;
        mLayoutResId = TitleResId;

    }

    public int getmTitleResId() {
        return mTitleResId;
    }

    public int getmLayoutResId() {
        return mLayoutResId;
    }
}
