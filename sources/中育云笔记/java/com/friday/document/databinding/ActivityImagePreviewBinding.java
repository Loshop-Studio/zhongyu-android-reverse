package com.friday.document.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.luck.picture.lib.photoview.PhotoView;

/* loaded from: classes3.dex */
public abstract class ActivityImagePreviewBinding extends ViewDataBinding {

    /* renamed from: c */
    public final ImageView f6286c;

    /* renamed from: d */
    public final PhotoView f6287d;

    /* renamed from: e */
    public final LinearLayout f6288e;

    public ActivityImagePreviewBinding(Object obj, View view, int i10, ImageView imageView, PhotoView photoView, LinearLayout linearLayout) {
        super(obj, view, i10);
        this.f6286c = imageView;
        this.f6287d = photoView;
        this.f6288e = linearLayout;
    }
}
