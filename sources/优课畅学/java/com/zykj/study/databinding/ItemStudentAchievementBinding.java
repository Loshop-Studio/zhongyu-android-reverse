package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.study.R$layout;
import com.zykj.study.bean.teach.SuperviseGroupMember;

/* loaded from: classes3.dex */
public abstract class ItemStudentAchievementBinding extends ViewDataBinding {

    @NonNull
    public final AppCompatImageView ivDetail;

    @NonNull
    public final LinearLayout linearLayout3;

    @Bindable
    protected SuperviseGroupMember mEntity;

    @NonNull
    public final View view8;

    public ItemStudentAchievementBinding(Object obj, View view, int i10, AppCompatImageView appCompatImageView, LinearLayout linearLayout, View view2) {
        super(obj, view, i10);
        this.ivDetail = appCompatImageView;
        this.linearLayout3 = linearLayout;
        this.view8 = view2;
    }

    public static ItemStudentAchievementBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemStudentAchievementBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public SuperviseGroupMember getEntity() {
        return this.mEntity;
    }

    public abstract void setEntity(@Nullable SuperviseGroupMember superviseGroupMember);

    @Deprecated
    public static ItemStudentAchievementBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemStudentAchievementBinding) ViewDataBinding.bind(obj, view, R$layout.item_student_achievement);
    }

    @NonNull
    @Deprecated
    public static ItemStudentAchievementBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemStudentAchievementBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_student_achievement, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemStudentAchievementBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemStudentAchievementBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemStudentAchievementBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_student_achievement, null, false, obj);
    }
}
