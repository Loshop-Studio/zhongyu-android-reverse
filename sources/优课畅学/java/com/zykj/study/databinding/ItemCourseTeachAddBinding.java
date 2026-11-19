package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.study.R$layout;
import com.zykj.study.data.MyCourseEntity;
import com.zykj.study.viewmodels.DictViewModel;

/* loaded from: classes3.dex */
public abstract class ItemCourseTeachAddBinding extends ViewDataBinding {

    @NonNull
    public final ItemCourseStatusBinding itemCourseStatus;

    @NonNull
    public final ItemCourseTitleBinding itemCourseTitle;

    @NonNull
    public final ImageView ivCover;

    @Bindable
    protected View.OnClickListener mClickListener;

    @Bindable
    protected DictViewModel mDictViewModel;

    @Bindable
    protected MyCourseEntity mEntity;

    @Bindable
    protected boolean mIsSelected;

    public ItemCourseTeachAddBinding(Object obj, View view, int i10, ItemCourseStatusBinding itemCourseStatusBinding, ItemCourseTitleBinding itemCourseTitleBinding, ImageView imageView) {
        super(obj, view, i10);
        this.itemCourseStatus = itemCourseStatusBinding;
        this.itemCourseTitle = itemCourseTitleBinding;
        this.ivCover = imageView;
    }

    public static ItemCourseTeachAddBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemCourseTeachAddBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
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
    public MyCourseEntity getEntity() {
        return this.mEntity;
    }

    public boolean getIsSelected() {
        return this.mIsSelected;
    }

    public abstract void setClickListener(@Nullable View.OnClickListener onClickListener);

    public abstract void setDictViewModel(@Nullable DictViewModel dictViewModel);

    public abstract void setEntity(@Nullable MyCourseEntity myCourseEntity);

    public abstract void setIsSelected(boolean z10);

    @Deprecated
    public static ItemCourseTeachAddBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemCourseTeachAddBinding) ViewDataBinding.bind(obj, view, R$layout.item_course_teach_add);
    }

    @NonNull
    @Deprecated
    public static ItemCourseTeachAddBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemCourseTeachAddBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_course_teach_add, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemCourseTeachAddBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemCourseTeachAddBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemCourseTeachAddBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_course_teach_add, null, false, obj);
    }
}
