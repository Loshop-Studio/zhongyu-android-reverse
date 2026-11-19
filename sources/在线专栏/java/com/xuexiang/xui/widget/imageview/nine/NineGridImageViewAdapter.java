package com.xuexiang.xui.widget.imageview.nine;

import android.content.Context;
import android.widget.ImageView;
import java.util.List;

/* loaded from: classes.dex */
public abstract class NineGridImageViewAdapter<T> {
    protected ImageView generateImageView(Context context) {
        GridImageView gridImageView = new GridImageView(context);
        gridImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return gridImageView;
    }

    protected abstract void onDisplayImage(Context context, ImageView imageView, T t3);

    protected void onItemImageClick(ImageView imageView, int i4, List<T> list) {
    }

    protected boolean onItemImageLongClick(ImageView imageView, int i4, List<T> list) {
        return false;
    }
}
