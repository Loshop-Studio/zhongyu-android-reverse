package com.friday.document.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes3.dex */
public abstract class FragmentFileListBinding extends ViewDataBinding {

    /* renamed from: c */
    public final TextView f6374c;

    /* renamed from: d */
    public final RecyclerView f6375d;

    /* renamed from: e */
    public final SwipeRefreshLayout f6376e;

    public FragmentFileListBinding(Object obj, View view, int i10, TextView textView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        super(obj, view, i10);
        this.f6374c = textView;
        this.f6375d = recyclerView;
        this.f6376e = swipeRefreshLayout;
    }
}
