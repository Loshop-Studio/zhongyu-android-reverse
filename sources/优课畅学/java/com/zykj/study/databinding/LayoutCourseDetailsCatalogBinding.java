package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.widget.statelayout.MultipleStatusView;
import com.zykj.study.R$layout;
import com.zykj.study.bean.course.CourseDetailsBean;

/* loaded from: classes3.dex */
public abstract class LayoutCourseDetailsCatalogBinding extends ViewDataBinding {

    @NonNull
    public final FrameLayout container;

    @Bindable
    protected CourseDetailsBean mEntity;

    @NonNull
    public final MultipleStatusView multipleStatusView;

    @NonNull
    public final RecyclerView recycle;

    @NonNull
    public final RecyclerView recycleProgress;

    @NonNull
    public final TextView textView22;

    public LayoutCourseDetailsCatalogBinding(Object obj, View view, int i10, FrameLayout frameLayout, MultipleStatusView multipleStatusView, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView) {
        super(obj, view, i10);
        this.container = frameLayout;
        this.multipleStatusView = multipleStatusView;
        this.recycle = recyclerView;
        this.recycleProgress = recyclerView2;
        this.textView22 = textView;
    }

    public static LayoutCourseDetailsCatalogBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static LayoutCourseDetailsCatalogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public CourseDetailsBean getEntity() {
        return this.mEntity;
    }

    public abstract void setEntity(@Nullable CourseDetailsBean courseDetailsBean);

    @Deprecated
    public static LayoutCourseDetailsCatalogBinding bind(@NonNull View view, @Nullable Object obj) {
        return (LayoutCourseDetailsCatalogBinding) ViewDataBinding.bind(obj, view, R$layout.layout_course_details_catalog);
    }

    @NonNull
    @Deprecated
    public static LayoutCourseDetailsCatalogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (LayoutCourseDetailsCatalogBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.layout_course_details_catalog, viewGroup, z10, obj);
    }

    @NonNull
    public static LayoutCourseDetailsCatalogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static LayoutCourseDetailsCatalogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (LayoutCourseDetailsCatalogBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.layout_course_details_catalog, null, false, obj);
    }
}
