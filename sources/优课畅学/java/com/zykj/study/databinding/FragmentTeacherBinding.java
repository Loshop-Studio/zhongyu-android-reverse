package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.xuexiang.xui.widget.statelayout.MultipleStatusView;
import com.yanzhenjie.recyclerview.SwipeRecyclerView;
import com.zykj.study.R$layout;
import com.zykj.study.viewmodels.MyTeachCourseViewModel;

/* loaded from: classes3.dex */
public abstract class FragmentTeacherBinding extends ViewDataBinding {

    @NonNull
    public final TextView btnCreate;

    @NonNull
    public final RelativeLayout fragmentTeacher;

    @Bindable
    protected MyTeachCourseViewModel mEntity;

    @NonNull
    public final MultipleStatusView msCourse;

    @NonNull
    public final SwipeRecyclerView rvCourse;

    @NonNull
    public final SwipeRefreshLayout sfCourse;

    public FragmentTeacherBinding(Object obj, View view, int i10, TextView textView, RelativeLayout relativeLayout, MultipleStatusView multipleStatusView, SwipeRecyclerView swipeRecyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        super(obj, view, i10);
        this.btnCreate = textView;
        this.fragmentTeacher = relativeLayout;
        this.msCourse = multipleStatusView;
        this.rvCourse = swipeRecyclerView;
        this.sfCourse = swipeRefreshLayout;
    }

    public static FragmentTeacherBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentTeacherBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public MyTeachCourseViewModel getEntity() {
        return this.mEntity;
    }

    public abstract void setEntity(@Nullable MyTeachCourseViewModel myTeachCourseViewModel);

    @Deprecated
    public static FragmentTeacherBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentTeacherBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_teacher);
    }

    @NonNull
    @Deprecated
    public static FragmentTeacherBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentTeacherBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_teacher, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentTeacherBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentTeacherBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentTeacherBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_teacher, null, false, obj);
    }
}
