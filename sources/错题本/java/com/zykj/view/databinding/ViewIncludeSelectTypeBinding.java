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
public abstract class ViewIncludeSelectTypeBinding extends ViewDataBinding {

    @NonNull
    public final AppCompatImageView ivSelectGeometry;

    @NonNull
    public final AppCompatImageView ivSelectHighlighter;

    @NonNull
    public final AppCompatImageView ivSelectImage;

    @NonNull
    public final AppCompatImageView ivSelectPen;

    @NonNull
    public final AppCompatImageView ivSelectText;

    public ViewIncludeSelectTypeBinding(Object obj, View view, int i, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, AppCompatImageView appCompatImageView5) {
        super(obj, view, i);
        this.ivSelectGeometry = appCompatImageView;
        this.ivSelectHighlighter = appCompatImageView2;
        this.ivSelectImage = appCompatImageView3;
        this.ivSelectPen = appCompatImageView4;
        this.ivSelectText = appCompatImageView5;
    }

    public static ViewIncludeSelectTypeBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ViewIncludeSelectTypeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8) {
        return inflate(layoutInflater, viewGroup, z8, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewIncludeSelectTypeBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ViewIncludeSelectTypeBinding) ViewDataBinding.bind(obj, view, C5280R.layout.view_include_select_type);
    }

    @NonNull
    @Deprecated
    public static ViewIncludeSelectTypeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8, @Nullable Object obj) {
        return (ViewIncludeSelectTypeBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_include_select_type, viewGroup, z8, obj);
    }

    @NonNull
    public static ViewIncludeSelectTypeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ViewIncludeSelectTypeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ViewIncludeSelectTypeBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_include_select_type, null, false, obj);
    }
}
