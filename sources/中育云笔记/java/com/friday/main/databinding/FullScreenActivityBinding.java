package com.friday.main.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* loaded from: classes4.dex */
public abstract class FullScreenActivityBinding extends ViewDataBinding {

    /* renamed from: c */
    public final ConstraintLayout f9170c;

    /* renamed from: d */
    public final FloatingActionButton f9171d;

    /* renamed from: e */
    public final ImageView f9172e;

    /* renamed from: f */
    public final ImageView f9173f;

    /* renamed from: g */
    public final ImageView f9174g;

    /* renamed from: h */
    public final ImageView f9175h;

    /* renamed from: i */
    public final ImageView f9176i;

    /* renamed from: j */
    public final ImageView f9177j;

    /* renamed from: k */
    public final SwipeRefreshLayout f9178k;

    /* renamed from: l */
    public final RecyclerView f9179l;

    /* renamed from: m */
    public final RecyclerView f9180m;

    /* renamed from: n */
    public final TextView f9181n;

    public FullScreenActivityBinding(Object obj, View view, int i10, ConstraintLayout constraintLayout, FloatingActionButton floatingActionButton, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, SwipeRefreshLayout swipeRefreshLayout, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView) {
        super(obj, view, i10);
        this.f9170c = constraintLayout;
        this.f9171d = floatingActionButton;
        this.f9172e = imageView;
        this.f9173f = imageView2;
        this.f9174g = imageView3;
        this.f9175h = imageView4;
        this.f9176i = imageView5;
        this.f9177j = imageView6;
        this.f9178k = swipeRefreshLayout;
        this.f9179l = recyclerView;
        this.f9180m = recyclerView2;
        this.f9181n = textView;
    }
}
