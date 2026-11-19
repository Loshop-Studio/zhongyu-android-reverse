package com.friday.document.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* loaded from: classes3.dex */
public abstract class LayoutShareNotePreviewBinding extends ViewDataBinding {

    /* renamed from: c */
    public final FloatingActionButton f6592c;

    /* renamed from: d */
    public final ImageView f6593d;

    /* renamed from: e */
    public final ImageView f6594e;

    /* renamed from: f */
    public final ImageView f6595f;

    /* renamed from: g */
    public final SwipeRefreshLayout f6596g;

    /* renamed from: h */
    public final RecyclerView f6597h;

    /* renamed from: i */
    public final NestedScrollView f6598i;

    /* renamed from: j */
    public final TextView f6599j;

    /* renamed from: k */
    public final TextView f6600k;

    public LayoutShareNotePreviewBinding(Object obj, View view, int i10, FloatingActionButton floatingActionButton, ImageView imageView, ImageView imageView2, ImageView imageView3, SwipeRefreshLayout swipeRefreshLayout, RecyclerView recyclerView, NestedScrollView nestedScrollView, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f6592c = floatingActionButton;
        this.f6593d = imageView;
        this.f6594e = imageView2;
        this.f6595f = imageView3;
        this.f6596g = swipeRefreshLayout;
        this.f6597h = recyclerView;
        this.f6598i = nestedScrollView;
        this.f6599j = textView;
        this.f6600k = textView2;
    }
}
