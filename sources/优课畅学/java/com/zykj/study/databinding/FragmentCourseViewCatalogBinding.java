package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.R$layout;
import com.zykj.study.view.MultipleStatusView;
import com.zykj.study.viewmodels.CourseViewViewModel;

/* loaded from: classes3.dex */
public abstract class FragmentCourseViewCatalogBinding extends ViewDataBinding {

    @NonNull
    public final ConstraintLayout container;

    @NonNull
    public final LinearLayout imageView35;

    @Bindable
    protected View.OnClickListener mOnClick;

    @Bindable
    protected View.OnClickListener mOnClickManage;

    @Bindable
    protected CourseViewViewModel mViewModel;

    @NonNull
    public final MultipleStatusView multipleStatusView;

    @NonNull
    public final RecyclerView recycler;

    @NonNull
    public final TextView textView33;

    public FragmentCourseViewCatalogBinding(Object obj, View view, int i10, ConstraintLayout constraintLayout, LinearLayout linearLayout, MultipleStatusView multipleStatusView, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i10);
        this.container = constraintLayout;
        this.imageView35 = linearLayout;
        this.multipleStatusView = multipleStatusView;
        this.recycler = recyclerView;
        this.textView33 = textView;
    }

    public static FragmentCourseViewCatalogBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentCourseViewCatalogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public View.OnClickListener getOnClick() {
        return this.mOnClick;
    }

    @Nullable
    public View.OnClickListener getOnClickManage() {
        return this.mOnClickManage;
    }

    @Nullable
    public CourseViewViewModel getViewModel() {
        return this.mViewModel;
    }

    public abstract void setOnClick(@Nullable View.OnClickListener onClickListener);

    public abstract void setOnClickManage(@Nullable View.OnClickListener onClickListener);

    public abstract void setViewModel(@Nullable CourseViewViewModel courseViewViewModel);

    @Deprecated
    public static FragmentCourseViewCatalogBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentCourseViewCatalogBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_course_view_catalog);
    }

    @NonNull
    @Deprecated
    public static FragmentCourseViewCatalogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentCourseViewCatalogBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_course_view_catalog, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentCourseViewCatalogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentCourseViewCatalogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentCourseViewCatalogBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_course_view_catalog, null, false, obj);
    }
}
