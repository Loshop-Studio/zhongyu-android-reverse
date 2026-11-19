package com.friday.lecture.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes4.dex */
public abstract class LayoutRandomBinding extends ViewDataBinding {

    /* renamed from: c */
    public final ConstraintLayout f8542c;

    /* renamed from: d */
    public final FrameLayout f8543d;

    /* renamed from: e */
    public final ImageView f8544e;

    /* renamed from: f */
    public final ImageView f8545f;

    /* renamed from: g */
    public final LinearLayout f8546g;

    /* renamed from: h */
    public final TextView f8547h;

    public LayoutRandomBinding(Object obj, View view, int i10, ConstraintLayout constraintLayout, FrameLayout frameLayout, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, TextView textView) {
        super(obj, view, i10);
        this.f8542c = constraintLayout;
        this.f8543d = frameLayout;
        this.f8544e = imageView;
        this.f8545f = imageView2;
        this.f8546g = linearLayout;
        this.f8547h = textView;
    }
}
