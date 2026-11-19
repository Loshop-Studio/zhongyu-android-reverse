package com.zykj.huiwei.launcher.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public abstract class HwFragmentAppBinding extends ViewDataBinding {

    @NonNull
    public final RecyclerView rvList;

    public HwFragmentAppBinding(Object obj, View view, int i6, RecyclerView recyclerView) {
        super(obj, view, i6);
        this.rvList = recyclerView;
    }

    public static HwFragmentAppBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static HwFragmentAppBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6) {
        return inflate(layoutInflater, viewGroup, z6, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static HwFragmentAppBinding bind(@NonNull View view, @Nullable Object obj) {
        return (HwFragmentAppBinding) ViewDataBinding.bind(obj, view, R.layout.hw_fragment_app);
    }

    @NonNull
    @Deprecated
    public static HwFragmentAppBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6, @Nullable Object obj) {
        return (HwFragmentAppBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_fragment_app, viewGroup, z6, obj);
    }

    @NonNull
    public static HwFragmentAppBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static HwFragmentAppBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (HwFragmentAppBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_fragment_app, null, false, obj);
    }
}
