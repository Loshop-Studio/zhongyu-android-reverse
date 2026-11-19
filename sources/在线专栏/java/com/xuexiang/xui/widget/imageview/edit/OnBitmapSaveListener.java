package com.xuexiang.xui.widget.imageview.edit;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public interface OnBitmapSaveListener {
    void onBitmapReady(Bitmap bitmap);

    void onFailure(Exception exc);
}
