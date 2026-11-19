package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public abstract class FragmentMessageBinding extends ViewDataBinding {

    @NonNull
    public final ConstraintLayout fragmentMessage;

    @NonNull
    public final ImageView imageView3;

    @NonNull
    public final TextView textView2;

    public FragmentMessageBinding(Object obj, View view, int i10, ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        super(obj, view, i10);
        this.fragmentMessage = constraintLayout;
        this.imageView3 = imageView;
        this.textView2 = textView;
    }

    public static FragmentMessageBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentMessageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentMessageBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentMessageBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_message);
    }

    @NonNull
    @Deprecated
    public static FragmentMessageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentMessageBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_message, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentMessageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentMessageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentMessageBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_message, null, false, obj);
    }
}
