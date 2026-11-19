package com.friday.document.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes3.dex */
public abstract class FragmentShareFileBinding extends ViewDataBinding {

    /* renamed from: c */
    public final LayoutEmptyNoShareBinding f6439c;

    /* renamed from: d */
    public final ImageView f6440d;

    /* renamed from: e */
    public final ImageView f6441e;

    /* renamed from: f */
    public final LinearLayoutCompat f6442f;

    /* renamed from: g */
    public final SwipeRefreshLayout f6443g;

    /* renamed from: h */
    public final RecyclerView f6444h;

    /* renamed from: i */
    public final TextView f6445i;

    public FragmentShareFileBinding(Object obj, View view, int i10, LayoutEmptyNoShareBinding layoutEmptyNoShareBinding, ImageView imageView, ImageView imageView2, LinearLayoutCompat linearLayoutCompat, SwipeRefreshLayout swipeRefreshLayout, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i10);
        this.f6439c = layoutEmptyNoShareBinding;
        this.f6440d = imageView;
        this.f6441e = imageView2;
        this.f6442f = linearLayoutCompat;
        this.f6443g = swipeRefreshLayout;
        this.f6444h = recyclerView;
        this.f6445i = textView;
    }
}
