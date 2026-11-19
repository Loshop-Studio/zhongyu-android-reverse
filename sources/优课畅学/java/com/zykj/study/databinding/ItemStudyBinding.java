package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.study.R$layout;
import com.zykj.study.data.CourseStudyEntity;
import com.zykj.study.viewmodels.DictViewModel;

/* loaded from: classes3.dex */
public abstract class ItemStudyBinding extends ViewDataBinding {

    @NonNull
    public final ConstraintLayout container;

    @NonNull
    public final ImageView imageView2;

    @NonNull
    public final ItemCourseTitleBinding itemCourseTitle;

    @Bindable
    protected View.OnClickListener mClickListener;

    @Bindable
    protected DictViewModel mDictViewModel;

    @Bindable
    protected CourseStudyEntity mEntity;

    @Bindable
    protected boolean mIsSelected;

    @NonNull
    public final TextView textView26;

    @NonNull
    public final TextView tvProgress;

    @NonNull
    public final TextView tvTeacherName;

    public ItemStudyBinding(Object obj, View view, int i10, ConstraintLayout constraintLayout, ImageView imageView, ItemCourseTitleBinding itemCourseTitleBinding, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i10);
        this.container = constraintLayout;
        this.imageView2 = imageView;
        this.itemCourseTitle = itemCourseTitleBinding;
        this.textView26 = textView;
        this.tvProgress = textView2;
        this.tvTeacherName = textView3;
    }

    public static ItemStudyBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemStudyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
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
    public CourseStudyEntity getEntity() {
        return this.mEntity;
    }

    public boolean getIsSelected() {
        return this.mIsSelected;
    }

    public abstract void setClickListener(@Nullable View.OnClickListener onClickListener);

    public abstract void setDictViewModel(@Nullable DictViewModel dictViewModel);

    public abstract void setEntity(@Nullable CourseStudyEntity courseStudyEntity);

    public abstract void setIsSelected(boolean z10);

    @Deprecated
    public static ItemStudyBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemStudyBinding) ViewDataBinding.bind(obj, view, R$layout.item_study);
    }

    @NonNull
    @Deprecated
    public static ItemStudyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemStudyBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_study, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemStudyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemStudyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemStudyBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_study, null, false, obj);
    }
}
