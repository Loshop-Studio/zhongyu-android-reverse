package com.friday.document.databinding;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes3.dex */
public abstract class FragmentShareByTeacherBinding extends ViewDataBinding {

    /* renamed from: c */
    public final LayoutEmptyNoShareBinding f6431c;

    /* renamed from: d */
    public final FragmentContainerView f6432d;

    /* renamed from: e */
    public final SwipeRefreshLayout f6433e;

    /* renamed from: f */
    public final RecyclerView f6434f;

    public FragmentShareByTeacherBinding(Object obj, View view, int i10, LayoutEmptyNoShareBinding layoutEmptyNoShareBinding, FragmentContainerView fragmentContainerView, SwipeRefreshLayout swipeRefreshLayout, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.f6431c = layoutEmptyNoShareBinding;
        this.f6432d = fragmentContainerView;
        this.f6433e = swipeRefreshLayout;
        this.f6434f = recyclerView;
    }
}
