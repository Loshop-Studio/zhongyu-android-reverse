package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public abstract class ActivityMainBinding extends ViewDataBinding {

    @NonNull
    public final ConstraintLayout activityMain;

    @NonNull
    public final FragmentContainerView navHostFragment;

    public ActivityMainBinding(Object obj, View view, int i10, ConstraintLayout constraintLayout, FragmentContainerView fragmentContainerView) {
        super(obj, view, i10);
        this.activityMain = constraintLayout;
        this.navHostFragment = fragmentContainerView;
    }

    public static ActivityMainBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ActivityMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityMainBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ActivityMainBinding) ViewDataBinding.bind(obj, view, R$layout.activity_main);
    }

    @NonNull
    @Deprecated
    public static ActivityMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ActivityMainBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.activity_main, viewGroup, z10, obj);
    }

    @NonNull
    public static ActivityMainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ActivityMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ActivityMainBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.activity_main, null, false, obj);
    }
}
