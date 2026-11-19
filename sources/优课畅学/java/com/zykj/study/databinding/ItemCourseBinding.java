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
import com.zykj.study.R$layout;
import com.zykj.study.bean.course.CourseSimpleBean;
import com.zykj.study.viewmodels.DictViewModel;

/* loaded from: classes3.dex */
public abstract class ItemCourseBinding extends ViewDataBinding {

    @NonNull
    public final ItemCourseTitleBinding itemCourseTitle;

    @NonNull
    public final ImageView ivCover;

    @NonNull
    public final ImageView ivLike;

    @NonNull
    public final ImageView ivStudy;

    @Bindable
    protected View.OnClickListener mClickListener;

    @Bindable
    protected DictViewModel mDictViewModel;

    @Bindable
    protected CourseSimpleBean mEntity;

    @NonNull
    public final TextView tvLike;

    @NonNull
    public final TextView tvStudyNumber;

    @NonNull
    public final TextView tvTeacherName;

    @NonNull
    public final View vHint;

    public ItemCourseBinding(Object obj, View view, int i10, ItemCourseTitleBinding itemCourseTitleBinding, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, TextView textView2, TextView textView3, View view2) {
        super(obj, view, i10);
        this.itemCourseTitle = itemCourseTitleBinding;
        this.ivCover = imageView;
        this.ivLike = imageView2;
        this.ivStudy = imageView3;
        this.tvLike = textView;
        this.tvStudyNumber = textView2;
        this.tvTeacherName = textView3;
        this.vHint = view2;
    }

    public static ItemCourseBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemCourseBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public View.OnClickListener getClickListener() {
        return this.mClickListener;
    }

    @Nullable
    public DictViewModel getDictViewModel() {
        return this.mDictViewModel;
    }

    @Nullable
    public CourseSimpleBean getEntity() {
        return this.mEntity;
    }

    public abstract void setClickListener(@Nullable View.OnClickListener onClickListener);

    public abstract void setDictViewModel(@Nullable DictViewModel dictViewModel);

    public abstract void setEntity(@Nullable CourseSimpleBean courseSimpleBean);

    @Deprecated
    public static ItemCourseBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemCourseBinding) ViewDataBinding.bind(obj, view, R$layout.item_course);
    }

    @NonNull
    @Deprecated
    public static ItemCourseBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemCourseBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_course, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemCourseBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemCourseBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemCourseBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_course, null, false, obj);
    }
}
