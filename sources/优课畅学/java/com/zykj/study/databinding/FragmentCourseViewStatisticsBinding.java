package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public abstract class FragmentCourseViewStatisticsBinding extends ViewDataBinding {

    @NonNull
    public final ViewStubProxy emptyViewStub;

    @NonNull
    public final RecyclerView recycler;

    public FragmentCourseViewStatisticsBinding(Object obj, View view, int i10, ViewStubProxy viewStubProxy, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.emptyViewStub = viewStubProxy;
        this.recycler = recyclerView;
    }

    public static FragmentCourseViewStatisticsBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentCourseViewStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCourseViewStatisticsBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentCourseViewStatisticsBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_course_view_statistics);
    }

    @NonNull
    @Deprecated
    public static FragmentCourseViewStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentCourseViewStatisticsBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_course_view_statistics, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentCourseViewStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentCourseViewStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentCourseViewStatisticsBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_course_view_statistics, null, false, obj);
    }
}
