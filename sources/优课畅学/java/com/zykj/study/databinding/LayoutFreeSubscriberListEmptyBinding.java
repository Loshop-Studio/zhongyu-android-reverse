package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public abstract class LayoutFreeSubscriberListEmptyBinding extends ViewDataBinding {
    public LayoutFreeSubscriberListEmptyBinding(Object obj, View view, int i10) {
        super(obj, view, i10);
    }

    public static LayoutFreeSubscriberListEmptyBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static LayoutFreeSubscriberListEmptyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutFreeSubscriberListEmptyBinding bind(@NonNull View view, @Nullable Object obj) {
        return (LayoutFreeSubscriberListEmptyBinding) ViewDataBinding.bind(obj, view, R$layout.layout_free_subscriber_list_empty);
    }

    @NonNull
    @Deprecated
    public static LayoutFreeSubscriberListEmptyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (LayoutFreeSubscriberListEmptyBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.layout_free_subscriber_list_empty, viewGroup, z10, obj);
    }

    @NonNull
    public static LayoutFreeSubscriberListEmptyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static LayoutFreeSubscriberListEmptyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (LayoutFreeSubscriberListEmptyBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.layout_free_subscriber_list_empty, null, false, obj);
    }
}
