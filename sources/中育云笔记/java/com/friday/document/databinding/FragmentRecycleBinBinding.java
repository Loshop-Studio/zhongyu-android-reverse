package com.friday.document.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes3.dex */
public abstract class FragmentRecycleBinBinding extends ViewDataBinding {

    /* renamed from: c */
    public final TextView f6419c;

    /* renamed from: d */
    public final ImageView f6420d;

    /* renamed from: e */
    public final ImageView f6421e;

    /* renamed from: f */
    public final LinearLayoutCompat f6422f;

    /* renamed from: g */
    public final FrameLayout f6423g;

    /* renamed from: h */
    public final RecyclerView f6424h;

    /* renamed from: i */
    public final SwipeRefreshLayout f6425i;

    /* renamed from: j */
    public final TextView f6426j;

    public FragmentRecycleBinBinding(Object obj, View view, int i10, TextView textView, ImageView imageView, ImageView imageView2, LinearLayoutCompat linearLayoutCompat, FrameLayout frameLayout, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, TextView textView2) {
        super(obj, view, i10);
        this.f6419c = textView;
        this.f6420d = imageView;
        this.f6421e = imageView2;
        this.f6422f = linearLayoutCompat;
        this.f6423g = frameLayout;
        this.f6424h = recyclerView;
        this.f6425i = swipeRefreshLayout;
        this.f6426j = textView2;
    }
}
