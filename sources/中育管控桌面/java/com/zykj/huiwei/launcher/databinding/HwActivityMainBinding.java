package com.zykj.huiwei.launcher.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public abstract class HwActivityMainBinding extends ViewDataBinding {

    @NonNull
    public final FragmentContainerView navHostFragmentContainer;

    public HwActivityMainBinding(Object obj, View view, int i6, FragmentContainerView fragmentContainerView) {
        super(obj, view, i6);
        this.navHostFragmentContainer = fragmentContainerView;
    }

    public static HwActivityMainBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static HwActivityMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6) {
        return inflate(layoutInflater, viewGroup, z6, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static HwActivityMainBinding bind(@NonNull View view, @Nullable Object obj) {
        return (HwActivityMainBinding) ViewDataBinding.bind(obj, view, R.layout.hw_activity_main);
    }

    @NonNull
    @Deprecated
    public static HwActivityMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6, @Nullable Object obj) {
        return (HwActivityMainBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_activity_main, viewGroup, z6, obj);
    }

    @NonNull
    public static HwActivityMainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static HwActivityMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (HwActivityMainBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_activity_main, null, false, obj);
    }
}
