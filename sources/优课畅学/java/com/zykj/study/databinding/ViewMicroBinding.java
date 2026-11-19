package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public abstract class ViewMicroBinding extends ViewDataBinding {

    @NonNull
    public final LayoutChartDetailsBinding includeChartDetails;

    @NonNull
    public final ImageView ivLabelIcon;

    @NonNull
    public final ImageView ivMicroDismissOrShow;

    @NonNull
    public final LinearLayout llMicroEmpty;

    @NonNull
    public final RecyclerView recycler;

    @NonNull
    public final TextView tvMicroExerciseLabel;

    public ViewMicroBinding(Object obj, View view, int i10, LayoutChartDetailsBinding layoutChartDetailsBinding, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i10);
        this.includeChartDetails = layoutChartDetailsBinding;
        this.ivLabelIcon = imageView;
        this.ivMicroDismissOrShow = imageView2;
        this.llMicroEmpty = linearLayout;
        this.recycler = recyclerView;
        this.tvMicroExerciseLabel = textView;
    }

    public static ViewMicroBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ViewMicroBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewMicroBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ViewMicroBinding) ViewDataBinding.bind(obj, view, R$layout.view_micro);
    }

    @NonNull
    @Deprecated
    public static ViewMicroBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ViewMicroBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_micro, viewGroup, z10, obj);
    }

    @NonNull
    public static ViewMicroBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ViewMicroBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ViewMicroBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_micro, null, false, obj);
    }
}
