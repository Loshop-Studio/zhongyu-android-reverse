package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.zykj.study.R$layout;
import com.zykj.study.viewmodels.MicroCodeViewModel;

/* loaded from: classes3.dex */
public abstract class FragmentFindBinding extends ViewDataBinding {

    @NonNull
    public final AppBarLayout appbar;

    @NonNull
    public final CoordinatorLayout fragmentFind;

    @NonNull
    public final ImageView ivScan;

    @Bindable
    protected MicroCodeViewModel mMicroViewModel;

    @NonNull
    public final TabLayout tabLayout;

    @NonNull
    public final TextView tvSearch;

    @NonNull
    public final ViewPager2 viewPager;

    public FragmentFindBinding(Object obj, View view, int i10, AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout, ImageView imageView, TabLayout tabLayout, TextView textView, ViewPager2 viewPager2) {
        super(obj, view, i10);
        this.appbar = appBarLayout;
        this.fragmentFind = coordinatorLayout;
        this.ivScan = imageView;
        this.tabLayout = tabLayout;
        this.tvSearch = textView;
        this.viewPager = viewPager2;
    }

    public static FragmentFindBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentFindBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public MicroCodeViewModel getMicroViewModel() {
        return this.mMicroViewModel;
    }

    public abstract void setMicroViewModel(@Nullable MicroCodeViewModel microCodeViewModel);

    @Deprecated
    public static FragmentFindBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentFindBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_find);
    }

    @NonNull
    @Deprecated
    public static FragmentFindBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentFindBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_find, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentFindBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentFindBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentFindBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_find, null, false, obj);
    }
}
