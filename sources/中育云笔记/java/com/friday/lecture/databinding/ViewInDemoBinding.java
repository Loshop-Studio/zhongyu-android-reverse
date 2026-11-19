package com.friday.lecture.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes4.dex */
public abstract class ViewInDemoBinding extends ViewDataBinding {

    /* renamed from: c */
    public final CardView f8626c;

    /* renamed from: d */
    public final ImageView f8627d;

    /* renamed from: e */
    public final ImageView f8628e;

    /* renamed from: f */
    public final ImageView f8629f;

    /* renamed from: g */
    public final ImageView f8630g;

    /* renamed from: h */
    public final TextView f8631h;

    public ViewInDemoBinding(Object obj, View view, int i10, CardView cardView, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, TextView textView) {
        super(obj, view, i10);
        this.f8626c = cardView;
        this.f8627d = imageView;
        this.f8628e = imageView2;
        this.f8629f = imageView3;
        this.f8630g = imageView4;
        this.f8631h = textView;
    }
}
