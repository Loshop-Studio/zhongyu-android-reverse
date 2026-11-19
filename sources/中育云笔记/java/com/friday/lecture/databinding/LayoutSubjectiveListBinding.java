package com.friday.lecture.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public abstract class LayoutSubjectiveListBinding extends ViewDataBinding {

    /* renamed from: c */
    public final TextView f8581c;

    /* renamed from: d */
    public final TextView f8582d;

    /* renamed from: e */
    public final TextView f8583e;

    /* renamed from: f */
    public final ImageView f8584f;

    /* renamed from: g */
    public final RecyclerView f8585g;

    /* renamed from: h */
    public final TextView f8586h;

    public LayoutSubjectiveListBinding(Object obj, View view, int i10, TextView textView, TextView textView2, TextView textView3, ImageView imageView, RecyclerView recyclerView, TextView textView4) {
        super(obj, view, i10);
        this.f8581c = textView;
        this.f8582d = textView2;
        this.f8583e = textView3;
        this.f8584f = imageView;
        this.f8585g = recyclerView;
        this.f8586h = textView4;
    }
}
