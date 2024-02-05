package com.example.solidprinciples.SOLID;

import android.view.View;
//interfaces segmentations
public interface OnClickListner {
/*
    void onClick(View v);
    boolean onLongClick(View v);
    void onTouch(View v);


 */
}

//Use multiple interfaces instead of one big.
interface OnClickListener{

    void onClick(View v);
}
interface OnLongClickListener{

    boolean onLongClick(View v);
}
interface OnTouchListener{

    void onTouch(View v);
}