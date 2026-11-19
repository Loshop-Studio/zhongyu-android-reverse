package com.xuexiang.xui.widget.imageview.preview.loader;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public interface ISimpleTarget {
    void onLoadFailed(Drawable drawable);

    void onResourceReady();
}
