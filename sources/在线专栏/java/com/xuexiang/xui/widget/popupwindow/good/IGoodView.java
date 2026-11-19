package com.xuexiang.xui.widget.popupwindow.good;

import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes.dex */
public interface IGoodView {
    public static final int DEFAULT_DISTANCE = 60;
    public static final int DEFAULT_DURATION = 800;
    public static final float DEFAULT_FROM_ALPHA = 1.0f;
    public static final int DEFAULT_FROM_Y_DELTA = 0;
    public static final String DEFAULT_TEXT = "";
    public static final int DEFAULT_TEXT_COLOR = -16777216;
    public static final int DEFAULT_TEXT_SIZE = 16;
    public static final float DEFAULT_TO_ALPHA = 0.0f;
    public static final int DEFAULT_TO_Y_DELTA = 60;

    void reset();

    IGoodView setAlpha(float f4, float f5);

    IGoodView setDistance(int i4);

    IGoodView setDuration(int i4);

    IGoodView setImageDrawable(Drawable drawable);

    IGoodView setImageResource(int i4);

    IGoodView setText(String str);

    IGoodView setTextColor(int i4);

    IGoodView setTextInfo(String str, int i4, int i5);

    IGoodView setTextSize(int i4);

    IGoodView setTranslateY(int i4, int i5);

    void show(View view);
}
