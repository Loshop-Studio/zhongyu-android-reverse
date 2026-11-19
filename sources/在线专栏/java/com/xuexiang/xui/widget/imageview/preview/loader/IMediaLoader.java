package com.xuexiang.xui.widget.imageview.preview.loader;

import android.content.Context;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public interface IMediaLoader {
    void clearMemory(Context context);

    void displayGifImage(Fragment fragment, String str, ImageView imageView, ISimpleTarget iSimpleTarget);

    void displayImage(Fragment fragment, String str, ImageView imageView, ISimpleTarget iSimpleTarget);

    void onStop(Fragment fragment);
}
