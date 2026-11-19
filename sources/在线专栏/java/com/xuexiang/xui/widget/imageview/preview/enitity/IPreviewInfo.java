package com.xuexiang.xui.widget.imageview.preview.enitity;

import android.graphics.Rect;
import android.os.Parcelable;

/* loaded from: classes.dex */
public interface IPreviewInfo extends Parcelable {
    Rect getBounds();

    String getUrl();

    String getVideoUrl();
}
