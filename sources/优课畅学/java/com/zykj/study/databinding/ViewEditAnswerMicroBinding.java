package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;
import com.zykj.study.R$layout;
import com.zykj.study.viewmodels.ExerciseTrainViewModel;

/* loaded from: classes3.dex */
public abstract class ViewEditAnswerMicroBinding extends ViewDataBinding {

    @NonNull
    public final ImageView ivHint;

    @NonNull
    public final ImageView ivLabelIcon;

    @NonNull
    public final ImageView ivMicroDismissOrShow;

    @NonNull
    public final ShapeableImageView ivSnapshot;

    @Bindable
    protected ExerciseTrainViewModel mExerciseTrainViewModel;

    @Bindable
    protected String mSnapshotUrl;

    @NonNull
    public final RelativeLayout rlMicroEdit;

    @NonNull
    public final TextView tvMicroExerciseLabel;

    public ViewEditAnswerMicroBinding(Object obj, View view, int i10, ImageView imageView, ImageView imageView2, ImageView imageView3, ShapeableImageView shapeableImageView, RelativeLayout relativeLayout, TextView textView) {
        super(obj, view, i10);
        this.ivHint = imageView;
        this.ivLabelIcon = imageView2;
        this.ivMicroDismissOrShow = imageView3;
        this.ivSnapshot = shapeableImageView;
        this.rlMicroEdit = relativeLayout;
        this.tvMicroExerciseLabel = textView;
    }

    public static ViewEditAnswerMicroBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ViewEditAnswerMicroBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public ExerciseTrainViewModel getExerciseTrainViewModel() {
        return this.mExerciseTrainViewModel;
    }

    @Nullable
    public String getSnapshotUrl() {
        return this.mSnapshotUrl;
    }

    public abstract void setExerciseTrainViewModel(@Nullable ExerciseTrainViewModel exerciseTrainViewModel);

    public abstract void setSnapshotUrl(@Nullable String str);

    @Deprecated
    public static ViewEditAnswerMicroBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ViewEditAnswerMicroBinding) ViewDataBinding.bind(obj, view, R$layout.view_edit_answer_micro);
    }

    @NonNull
    @Deprecated
    public static ViewEditAnswerMicroBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ViewEditAnswerMicroBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_edit_answer_micro, viewGroup, z10, obj);
    }

    @NonNull
    public static ViewEditAnswerMicroBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ViewEditAnswerMicroBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ViewEditAnswerMicroBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_edit_answer_micro, null, false, obj);
    }
}
