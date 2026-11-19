package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.xuexiang.xui.widget.actionbar.TitleBar;
import com.xuexiang.xui.widget.statelayout.MultipleStatusView;
import com.zykj.study.R$layout;
import com.zykj.study.viewmodels.MyCourseViewModel;

/* loaded from: classes3.dex */
public abstract class FragmentTeacherCourseAddBinding extends ViewDataBinding {

    @NonNull
    public final ConstraintLayout fragmentTeacherCourseAdd;

    @Bindable
    protected MyCourseViewModel mEntity;

    @NonNull
    public final MultipleStatusView msCourse;

    @NonNull
    public final RecyclerView rvCourse;

    @NonNull
    public final SwipeRefreshLayout sfCourse;

    @NonNull
    public final TitleBar toolbar;

    public FragmentTeacherCourseAddBinding(Object obj, View view, int i10, ConstraintLayout constraintLayout, MultipleStatusView multipleStatusView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, TitleBar titleBar) {
        super(obj, view, i10);
        this.fragmentTeacherCourseAdd = constraintLayout;
        this.msCourse = multipleStatusView;
        this.rvCourse = recyclerView;
        this.sfCourse = swipeRefreshLayout;
        this.toolbar = titleBar;
    }

    public static FragmentTeacherCourseAddBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentTeacherCourseAddBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public MyCourseViewModel getEntity() {
        return this.mEntity;
    }

    public abstract void setEntity(@Nullable MyCourseViewModel myCourseViewModel);

    @Deprecated
    public static FragmentTeacherCourseAddBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentTeacherCourseAddBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_teacher_course_add);
    }

    @NonNull
    @Deprecated
    public static FragmentTeacherCourseAddBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentTeacherCourseAddBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_teacher_course_add, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentTeacherCourseAddBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentTeacherCourseAddBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentTeacherCourseAddBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_teacher_course_add, null, false, obj);
    }
}
