package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.widget.statelayout.MultipleStatusView;
import com.zykj.study.R$layout;
import com.zykj.study.data.MyCourseEntity;

/* loaded from: classes3.dex */
public abstract class LayoutMyCourseDetailsCatalogBinding extends ViewDataBinding {

    @NonNull
    public final ImageView ivAdd;

    @Bindable
    protected MyCourseEntity mEntity;

    @NonNull
    public final MultipleStatusView multipleStatusView;

    @NonNull
    public final RecyclerView recycle;

    @NonNull
    public final TextView textView22;

    public LayoutMyCourseDetailsCatalogBinding(Object obj, View view, int i10, ImageView imageView, MultipleStatusView multipleStatusView, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i10);
        this.ivAdd = imageView;
        this.multipleStatusView = multipleStatusView;
        this.recycle = recyclerView;
        this.textView22 = textView;
    }

    public static LayoutMyCourseDetailsCatalogBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static LayoutMyCourseDetailsCatalogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public MyCourseEntity getEntity() {
        return this.mEntity;
    }

    public abstract void setEntity(@Nullable MyCourseEntity myCourseEntity);

    @Deprecated
    public static LayoutMyCourseDetailsCatalogBinding bind(@NonNull View view, @Nullable Object obj) {
        return (LayoutMyCourseDetailsCatalogBinding) ViewDataBinding.bind(obj, view, R$layout.layout_my_course_details_catalog);
    }

    @NonNull
    @Deprecated
    public static LayoutMyCourseDetailsCatalogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (LayoutMyCourseDetailsCatalogBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.layout_my_course_details_catalog, viewGroup, z10, obj);
    }

    @NonNull
    public static LayoutMyCourseDetailsCatalogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static LayoutMyCourseDetailsCatalogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (LayoutMyCourseDetailsCatalogBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.layout_my_course_details_catalog, null, false, obj);
    }
}
