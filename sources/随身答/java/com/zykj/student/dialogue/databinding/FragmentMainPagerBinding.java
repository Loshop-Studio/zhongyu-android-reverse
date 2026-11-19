package com.zykj.student.dialogue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.zykj.student.dialogue.R;

/* loaded from: classes5.dex */
public final class FragmentMainPagerBinding implements ViewBinding {

    /* renamed from: a */
    public final SwipeRefreshLayout f10534a;

    /* renamed from: b */
    public final LinearLayout f10535b;

    /* renamed from: c */
    public final RecyclerView f10536c;

    /* renamed from: d */
    public final SwipeRefreshLayout f10537d;

    public FragmentMainPagerBinding(SwipeRefreshLayout swipeRefreshLayout, LinearLayout linearLayout, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout2) {
        this.f10534a = swipeRefreshLayout;
        this.f10535b = linearLayout;
        this.f10536c = recyclerView;
        this.f10537d = swipeRefreshLayout2;
    }

    /* renamed from: a */
    public static FragmentMainPagerBinding m9965a(View view) {
        int i9 = R.id.ll_empty;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i9);
        if (linearLayout != null) {
            i9 = R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i9);
            if (recyclerView != null) {
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view;
                return new FragmentMainPagerBinding(swipeRefreshLayout, linearLayout, recyclerView, swipeRefreshLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i9)));
    }

    /* renamed from: c */
    public static FragmentMainPagerBinding m9966c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_main_pager, viewGroup, false);
        if (z9) {
            viewGroup.addView(viewInflate);
        }
        return m9965a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public SwipeRefreshLayout getRoot() {
        return this.f10534a;
    }
}
