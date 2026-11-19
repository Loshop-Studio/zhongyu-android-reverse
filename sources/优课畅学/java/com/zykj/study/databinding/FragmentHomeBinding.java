package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.zykj.study.R$layout;
import com.zykj.study.viewmodels.HomeViewModel;

/* loaded from: classes3.dex */
public abstract class FragmentHomeBinding extends ViewDataBinding {

    @NonNull
    public final LinearLayout fragmentHome;

    @NonNull
    public final ImageView ivFind;

    @NonNull
    public final ImageView ivMessage;

    @NonNull
    public final ImageView ivMy;

    @NonNull
    public final ImageView ivStudy;

    @NonNull
    public final LinearLayout llFind;

    @NonNull
    public final LinearLayout llMessage;

    @NonNull
    public final LinearLayout llMy;

    @NonNull
    public final LinearLayout llStudy;

    @Bindable
    protected HomeViewModel mViewModel;

    @NonNull
    public final TextView tvFind;

    @NonNull
    public final TextView tvMessage;

    @NonNull
    public final TextView tvMy;

    @NonNull
    public final TextView tvStudy;

    @NonNull
    public final ViewPager2 viewPager;

    public FragmentHomeBinding(Object obj, View view, int i10, LinearLayout linearLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, TextView textView, TextView textView2, TextView textView3, TextView textView4, ViewPager2 viewPager2) {
        super(obj, view, i10);
        this.fragmentHome = linearLayout;
        this.ivFind = imageView;
        this.ivMessage = imageView2;
        this.ivMy = imageView3;
        this.ivStudy = imageView4;
        this.llFind = linearLayout2;
        this.llMessage = linearLayout3;
        this.llMy = linearLayout4;
        this.llStudy = linearLayout5;
        this.tvFind = textView;
        this.tvMessage = textView2;
        this.tvMy = textView3;
        this.tvStudy = textView4;
        this.viewPager = viewPager2;
    }

    public static FragmentHomeBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentHomeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public HomeViewModel getViewModel() {
        return this.mViewModel;
    }

    public abstract void setViewModel(@Nullable HomeViewModel homeViewModel);

    @Deprecated
    public static FragmentHomeBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentHomeBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_home);
    }

    @NonNull
    @Deprecated
    public static FragmentHomeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentHomeBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_home, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentHomeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentHomeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentHomeBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_home, null, false, obj);
    }
}
