package com.friday.document.databinding;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes3.dex */
public abstract class FragmentPreviewNoteBinding extends ViewDataBinding {

    /* renamed from: c */
    public final SwipeRefreshLayout f6392c;

    /* renamed from: d */
    public final RecyclerView f6393d;

    public FragmentPreviewNoteBinding(Object obj, View view, int i10, SwipeRefreshLayout swipeRefreshLayout, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.f6392c = swipeRefreshLayout;
        this.f6393d = recyclerView;
    }
}
