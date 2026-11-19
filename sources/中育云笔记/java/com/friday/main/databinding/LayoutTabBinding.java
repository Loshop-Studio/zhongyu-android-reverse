package com.friday.main.databinding;

import android.view.View;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public abstract class LayoutTabBinding extends ViewDataBinding {

    /* renamed from: c */
    public final CardView f9201c;

    /* renamed from: d */
    public final CardView f9202d;

    /* renamed from: e */
    public final ImageView f9203e;

    /* renamed from: f */
    public final ImageView f9204f;

    /* renamed from: g */
    public final RecyclerView f9205g;

    public LayoutTabBinding(Object obj, View view, int i10, CardView cardView, CardView cardView2, ImageView imageView, ImageView imageView2, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.f9201c = cardView;
        this.f9202d = cardView2;
        this.f9203e = imageView;
        this.f9204f = imageView2;
        this.f9205g = recyclerView;
    }
}
