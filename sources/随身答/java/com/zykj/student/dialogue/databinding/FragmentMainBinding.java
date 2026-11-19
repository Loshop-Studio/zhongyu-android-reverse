package com.zykj.student.dialogue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.p012ui.platform.ComposeView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.zykj.student.dialogue.R;

/* loaded from: classes5.dex */
public final class FragmentMainBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f10522a;

    /* renamed from: b */
    public final ComposeView f10523b;

    /* renamed from: c */
    public final ComposeView f10524c;

    /* renamed from: d */
    public final ComposeView f10525d;

    /* renamed from: e */
    public final ComposeView f10526e;

    /* renamed from: f */
    public final ComposeView f10527f;

    /* renamed from: g */
    public final ComposeView f10528g;

    /* renamed from: h */
    public final DrawerLayout f10529h;

    /* renamed from: i */
    public final FrameLayout f10530i;

    /* renamed from: j */
    public final ImageView f10531j;

    /* renamed from: k */
    public final SwipeRefreshLayout f10532k;

    /* renamed from: l */
    public final ViewPager2 f10533l;

    public FragmentMainBinding(FrameLayout frameLayout, ComposeView composeView, ComposeView composeView2, ComposeView composeView3, ComposeView composeView4, ComposeView composeView5, ComposeView composeView6, DrawerLayout drawerLayout, FrameLayout frameLayout2, ImageView imageView, SwipeRefreshLayout swipeRefreshLayout, ViewPager2 viewPager2) {
        this.f10522a = frameLayout;
        this.f10523b = composeView;
        this.f10524c = composeView2;
        this.f10525d = composeView3;
        this.f10526e = composeView4;
        this.f10527f = composeView5;
        this.f10528g = composeView6;
        this.f10529h = drawerLayout;
        this.f10530i = frameLayout2;
        this.f10531j = imageView;
        this.f10532k = swipeRefreshLayout;
        this.f10533l = viewPager2;
    }

    /* renamed from: a */
    public static FragmentMainBinding m9962a(View view) {
        int i9 = R.id.compose_drawer_favorite_filter;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i9);
        if (composeView != null) {
            i9 = R.id.compose_drawer_filter;
            ComposeView composeView2 = (ComposeView) ViewBindings.findChildViewById(view, i9);
            if (composeView2 != null) {
                i9 = R.id.compose_drawer_sort;
                ComposeView composeView3 = (ComposeView) ViewBindings.findChildViewById(view, i9);
                if (composeView3 != null) {
                    i9 = R.id.compose_drawer_subject;
                    ComposeView composeView4 = (ComposeView) ViewBindings.findChildViewById(view, i9);
                    if (composeView4 != null) {
                        i9 = R.id.compose_tab;
                        ComposeView composeView5 = (ComposeView) ViewBindings.findChildViewById(view, i9);
                        if (composeView5 != null) {
                            i9 = R.id.compose_title;
                            ComposeView composeView6 = (ComposeView) ViewBindings.findChildViewById(view, i9);
                            if (composeView6 != null) {
                                i9 = R.id.drawer_layout;
                                DrawerLayout drawerLayout = (DrawerLayout) ViewBindings.findChildViewById(view, i9);
                                if (drawerLayout != null) {
                                    i9 = R.id.fl_drawer;
                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i9);
                                    if (frameLayout != null) {
                                        i9 = R.id.iv_ask;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i9);
                                        if (imageView != null) {
                                            i9 = R.id.swipe_refresh_layout;
                                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(view, i9);
                                            if (swipeRefreshLayout != null) {
                                                i9 = R.id.view_pager2;
                                                ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i9);
                                                if (viewPager2 != null) {
                                                    return new FragmentMainBinding((FrameLayout) view, composeView, composeView2, composeView3, composeView4, composeView5, composeView6, drawerLayout, frameLayout, imageView, swipeRefreshLayout, viewPager2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i9)));
    }

    /* renamed from: c */
    public static FragmentMainBinding m9963c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_main, viewGroup, false);
        if (z9) {
            viewGroup.addView(viewInflate);
        }
        return m9962a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f10522a;
    }
}
