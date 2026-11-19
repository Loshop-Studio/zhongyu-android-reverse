package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public abstract class DialogExerciseFinishBinding extends ViewDataBinding {

    @NonNull
    public final AppCompatImageView ivClose;

    @NonNull
    public final TabLayout tabLayout;

    @NonNull
    public final ViewPager2 viewPagerRead;

    public DialogExerciseFinishBinding(Object obj, View view, int i10, AppCompatImageView appCompatImageView, TabLayout tabLayout, ViewPager2 viewPager2) {
        super(obj, view, i10);
        this.ivClose = appCompatImageView;
        this.tabLayout = tabLayout;
        this.viewPagerRead = viewPager2;
    }

    public static DialogExerciseFinishBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static DialogExerciseFinishBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogExerciseFinishBinding bind(@NonNull View view, @Nullable Object obj) {
        return (DialogExerciseFinishBinding) ViewDataBinding.bind(obj, view, R$layout.dialog_exercise_finish);
    }

    @NonNull
    @Deprecated
    public static DialogExerciseFinishBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (DialogExerciseFinishBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.dialog_exercise_finish, viewGroup, z10, obj);
    }

    @NonNull
    public static DialogExerciseFinishBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static DialogExerciseFinishBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (DialogExerciseFinishBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.dialog_exercise_finish, null, false, obj);
    }
}
