package com.zykj.huiwei.launcher.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public abstract class HwFragmentMainBinding extends ViewDataBinding {

    @NonNull
    public final RecyclerView rvDot;

    @NonNull
    public final ViewPager2 vpMain;

    public HwFragmentMainBinding(Object obj, View view, int i6, RecyclerView recyclerView, ViewPager2 viewPager2) {
        super(obj, view, i6);
        this.rvDot = recyclerView;
        this.vpMain = viewPager2;
    }

    public static HwFragmentMainBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static HwFragmentMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6) {
        return inflate(layoutInflater, viewGroup, z6, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static HwFragmentMainBinding bind(@NonNull View view, @Nullable Object obj) {
        return (HwFragmentMainBinding) ViewDataBinding.bind(obj, view, R.layout.hw_fragment_main);
    }

    @NonNull
    @Deprecated
    public static HwFragmentMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6, @Nullable Object obj) {
        return (HwFragmentMainBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_fragment_main, viewGroup, z6, obj);
    }

    @NonNull
    public static HwFragmentMainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static HwFragmentMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (HwFragmentMainBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_fragment_main, null, false, obj);
    }
}
