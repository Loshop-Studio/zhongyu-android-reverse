package com.zykj.view.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.C5280R;

/* loaded from: classes3.dex */
public abstract class ViewIncludeMenuBinding extends ViewDataBinding {

    @NonNull
    public final AppCompatImageView ivBackgroundColor;

    @NonNull
    public final AppCompatImageView ivDelete;

    @NonNull
    public final AppCompatImageView ivEnlarge;

    @NonNull
    public final AppCompatImageView ivEraser;

    @NonNull
    public final AppCompatImageView ivImageAdd;

    @NonNull
    public final AppCompatImageView ivPen;

    @NonNull
    public final AppCompatImageView ivRecover;

    @NonNull
    public final AppCompatImageView ivReduce;

    @NonNull
    public final AppCompatImageView ivSelect;

    @NonNull
    public final AppCompatImageView ivTouch;

    @NonNull
    public final AppCompatImageView ivWithdraw;

    public ViewIncludeMenuBinding(Object obj, View view, int i, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, AppCompatImageView appCompatImageView5, AppCompatImageView appCompatImageView6, AppCompatImageView appCompatImageView7, AppCompatImageView appCompatImageView8, AppCompatImageView appCompatImageView9, AppCompatImageView appCompatImageView10, AppCompatImageView appCompatImageView11) {
        super(obj, view, i);
        this.ivBackgroundColor = appCompatImageView;
        this.ivDelete = appCompatImageView2;
        this.ivEnlarge = appCompatImageView3;
        this.ivEraser = appCompatImageView4;
        this.ivImageAdd = appCompatImageView5;
        this.ivPen = appCompatImageView6;
        this.ivRecover = appCompatImageView7;
        this.ivReduce = appCompatImageView8;
        this.ivSelect = appCompatImageView9;
        this.ivTouch = appCompatImageView10;
        this.ivWithdraw = appCompatImageView11;
    }

    public static ViewIncludeMenuBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ViewIncludeMenuBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8) {
        return inflate(layoutInflater, viewGroup, z8, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewIncludeMenuBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ViewIncludeMenuBinding) ViewDataBinding.bind(obj, view, C5280R.layout.view_include_menu);
    }

    @NonNull
    @Deprecated
    public static ViewIncludeMenuBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8, @Nullable Object obj) {
        return (ViewIncludeMenuBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_include_menu, viewGroup, z8, obj);
    }

    @NonNull
    public static ViewIncludeMenuBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ViewIncludeMenuBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ViewIncludeMenuBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_include_menu, null, false, obj);
    }
}
