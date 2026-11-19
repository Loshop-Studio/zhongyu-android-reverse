package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public abstract class LayoutStatusErrorBinding extends ViewDataBinding {

    @NonNull
    public final ImageView imageView3;

    @NonNull
    public final ConstraintLayout llStatusCourseNoCatalog;

    @Bindable
    protected String mErrorMessage;

    @NonNull
    public final TextView textView2;

    public LayoutStatusErrorBinding(Object obj, View view, int i10, ImageView imageView, ConstraintLayout constraintLayout, TextView textView) {
        super(obj, view, i10);
        this.imageView3 = imageView;
        this.llStatusCourseNoCatalog = constraintLayout;
        this.textView2 = textView;
    }

    public static LayoutStatusErrorBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static LayoutStatusErrorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public String getErrorMessage() {
        return this.mErrorMessage;
    }

    public abstract void setErrorMessage(@Nullable String str);

    @Deprecated
    public static LayoutStatusErrorBinding bind(@NonNull View view, @Nullable Object obj) {
        return (LayoutStatusErrorBinding) ViewDataBinding.bind(obj, view, R$layout.layout_status_error);
    }

    @NonNull
    @Deprecated
    public static LayoutStatusErrorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (LayoutStatusErrorBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.layout_status_error, viewGroup, z10, obj);
    }

    @NonNull
    public static LayoutStatusErrorBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static LayoutStatusErrorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (LayoutStatusErrorBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.layout_status_error, null, false, obj);
    }
}
