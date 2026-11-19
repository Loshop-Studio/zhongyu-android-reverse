package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.xuexiang.xui.widget.statelayout.MultipleStatusView;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public abstract class FragmentCourseBinding extends ViewDataBinding {

    @NonNull
    public final MultipleStatusView msCourse;

    @NonNull
    public final RecyclerView recycleView;

    @NonNull
    public final SwipeRefreshLayout swipe;

    public FragmentCourseBinding(Object obj, View view, int i10, MultipleStatusView multipleStatusView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        super(obj, view, i10);
        this.msCourse = multipleStatusView;
        this.recycleView = recyclerView;
        this.swipe = swipeRefreshLayout;
    }

    public static FragmentCourseBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentCourseBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCourseBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentCourseBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_course);
    }

    @NonNull
    @Deprecated
    public static FragmentCourseBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentCourseBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_course, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentCourseBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentCourseBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentCourseBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_course, null, false, obj);
    }
}
