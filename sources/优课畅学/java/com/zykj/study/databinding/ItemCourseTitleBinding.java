package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.study.R$layout;
import com.zykj.study.bean.course.CourseBean;
import com.zykj.study.viewmodels.DictViewModel;

/* loaded from: classes3.dex */
public abstract class ItemCourseTitleBinding extends ViewDataBinding {

    @NonNull
    public final View divider;

    @NonNull
    public final TextView grade;

    @Bindable
    protected DictViewModel mDictViewModel;

    @Bindable
    protected CourseBean mEntity;

    @NonNull
    public final TextView title;

    @NonNull
    public final TextView tvSubject;

    public ItemCourseTitleBinding(Object obj, View view, int i10, View view2, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i10);
        this.divider = view2;
        this.grade = textView;
        this.title = textView2;
        this.tvSubject = textView3;
    }

    public static ItemCourseTitleBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemCourseTitleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public DictViewModel getDictViewModel() {
        return this.mDictViewModel;
    }

    @Nullable
    public CourseBean getEntity() {
        return this.mEntity;
    }

    public abstract void setDictViewModel(@Nullable DictViewModel dictViewModel);

    public abstract void setEntity(@Nullable CourseBean courseBean);

    @Deprecated
    public static ItemCourseTitleBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemCourseTitleBinding) ViewDataBinding.bind(obj, view, R$layout.item_course_title);
    }

    @NonNull
    @Deprecated
    public static ItemCourseTitleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemCourseTitleBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_course_title, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemCourseTitleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemCourseTitleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemCourseTitleBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_course_title, null, false, obj);
    }
}
