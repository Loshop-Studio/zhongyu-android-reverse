package com.xuexiang.xui.widget.imageview.photoview.gestures;

import android.content.Context;

/* loaded from: classes.dex */
public final class VersionedGestureDetector {
    public static IGestureDetector newInstance(Context context, OnGestureListener onGestureListener) {
        FroyoGestureDetector froyoGestureDetector = new FroyoGestureDetector(context);
        froyoGestureDetector.setOnGestureListener(onGestureListener);
        return froyoGestureDetector;
    }
}
