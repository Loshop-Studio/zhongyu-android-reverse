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
public abstract class LayoutNotePreviewBinding extends ViewDataBinding {

    /* renamed from: c */
    public final FloatingActionButton f6568c;

    /* renamed from: d */
    public final ImageView f6569d;

    /* renamed from: e */
    public final ImageView f6570e;

    /* renamed from: f */
    public final SwipeRefreshLayout f6571f;

    /* renamed from: g */
    public final RecyclerView f6572g;

    /* renamed from: h */
    public final NestedScrollView f6573h;

    /* renamed from: i */
    public final TextView f6574i;

    /* renamed from: j */
    public final TextView f6575j;

    public LayoutNotePreviewBinding(Object obj, View view, int i10, FloatingActionButton floatingActionButton, ImageView imageView, ImageView imageView2, SwipeRefreshLayout swipeRefreshLayout, RecyclerView recyclerView, NestedScrollView nestedScrollView, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f6568c = floatingActionButton;
        this.f6569d = imageView;
        this.f6570e = imageView2;
        this.f6571f = swipeRefreshLayout;
        this.f6572g = recyclerView;
        this.f6573h = nestedScrollView;
        this.f6574i = textView;
        this.f6575j = textView2;
    }
}
