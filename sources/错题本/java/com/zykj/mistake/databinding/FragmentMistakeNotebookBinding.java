package com.zykj.mistake.databinding;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* loaded from: classes3.dex */
public abstract class FragmentMistakeNotebookBinding extends ViewDataBinding {

    /* renamed from: a */
    public final FloatingActionButton f6135a;

    /* renamed from: b */
    public final LinearLayout f6136b;

    /* renamed from: c */
    public final RecyclerView f6137c;

    /* renamed from: d */
    public final SwipeRefreshLayout f6138d;

    public FragmentMistakeNotebookBinding(DataBindingComponent dataBindingComponent, View view, FloatingActionButton floatingActionButton, LinearLayout linearLayout, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        super((Object) dataBindingComponent, view, 0);
        this.f6135a = floatingActionButton;
        this.f6136b = linearLayout;
        this.f6137c = recyclerView;
        this.f6138d = swipeRefreshLayout;
    }
}
