package com.zykj.student.dialogue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.p012ui.platform.ComposeView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.zykj.student.dialogue.R;

/* loaded from: classes5.dex */
public final class FragmentCollectHistoryBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f10507a;

    /* renamed from: b */
    public final ComposeView f10508b;

    /* renamed from: c */
    public final DrawerLayout f10509c;

    /* renamed from: d */
    public final LinearLayout f10510d;

    /* renamed from: e */
    public final RecyclerView f10511e;

    /* renamed from: f */
    public final SwipeRefreshLayout f10512f;

    public FragmentCollectHistoryBinding(FrameLayout frameLayout, ComposeView composeView, DrawerLayout drawerLayout, LinearLayout linearLayout, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        this.f10507a = frameLayout;
        this.f10508b = composeView;
        this.f10509c = drawerLayout;
        this.f10510d = linearLayout;
        this.f10511e = recyclerView;
        this.f10512f = swipeRefreshLayout;
    }

    /* renamed from: a */
    public static FragmentCollectHistoryBinding m9956a(View view) {
        int i9 = R.id.compose_title;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i9);
        if (composeView != null) {
            i9 = R.id.drawer_layout;
            DrawerLayout drawerLayout = (DrawerLayout) ViewBindings.findChildViewById(view, i9);
            if (drawerLayout != null) {
                i9 = R.id.ll_empty;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i9);
                if (linearLayout != null) {
                    i9 = R.id.recycler_view;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i9);
                    if (recyclerView != null) {
                        i9 = R.id.swipe_refresh_layout;
                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(view, i9);
                        if (swipeRefreshLayout != null) {
                            return new FragmentCollectHistoryBinding((FrameLayout) view, composeView, drawerLayout, linearLayout, recyclerView, swipeRefreshLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i9)));
    }

    /* renamed from: c */
    public static FragmentCollectHistoryBinding m9957c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_collect_history, viewGroup, false);
        if (z9) {
            viewGroup.addView(viewInflate);
        }
        return m9956a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f10507a;
    }
}
