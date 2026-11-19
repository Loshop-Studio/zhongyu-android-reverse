package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.xuexiang.xui.widget.actionbar.TitleBar;
import com.zykj.study.R$layout;
import com.zykj.study.view.MultipleStatusView;
import com.zykj.study.viewmodels.StudentExercisesViewModel;

/* loaded from: classes3.dex */
public abstract class FragmentStudentExercisesBinding extends ViewDataBinding {

    @NonNull
    public final FragmentContainerView fragmentStudentExercise;

    @NonNull
    public final ConstraintLayout fragmentStudentExercises;

    @NonNull
    public final ImageView imageView17;

    @NonNull
    public final AppCompatImageView ivLast;

    @NonNull
    public final AppCompatImageView ivNext;

    @NonNull
    public final LinearLayout llGroupSelect;

    @NonNull
    public final LinearLayout llUserSelect;

    @Bindable
    protected boolean mEnable;

    @Bindable
    protected View.OnClickListener mExamClickListener;

    @Bindable
    protected boolean mFromScore;

    @Bindable
    protected StudentExercisesViewModel mViewModel;

    @NonNull
    public final MultipleStatusView multipleStatusView;

    @NonNull
    public final TitleBar toolbar;

    @NonNull
    public final TextView tvCourseProgress;

    @NonNull
    public final AppCompatTextView tvUserName;

    public FragmentStudentExercisesBinding(Object obj, View view, int i10, FragmentContainerView fragmentContainerView, ConstraintLayout constraintLayout, ImageView imageView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, LinearLayout linearLayout, LinearLayout linearLayout2, MultipleStatusView multipleStatusView, TitleBar titleBar, TextView textView, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.fragmentStudentExercise = fragmentContainerView;
        this.fragmentStudentExercises = constraintLayout;
        this.imageView17 = imageView;
        this.ivLast = appCompatImageView;
        this.ivNext = appCompatImageView2;
        this.llGroupSelect = linearLayout;
        this.llUserSelect = linearLayout2;
        this.multipleStatusView = multipleStatusView;
        this.toolbar = titleBar;
        this.tvCourseProgress = textView;
        this.tvUserName = appCompatTextView;
    }

    public static FragmentStudentExercisesBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentStudentExercisesBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    public boolean getEnable() {
        return this.mEnable;
    }

    @Nullable
    public View.OnClickListener getExamClickListener() {
        return this.mExamClickListener;
    }

    public boolean getFromScore() {
        return this.mFromScore;
    }

    @Nullable
    public StudentExercisesViewModel getViewModel() {
        return this.mViewModel;
    }

    public abstract void setEnable(boolean z10);

    public abstract void setExamClickListener(@Nullable View.OnClickListener onClickListener);

    public abstract void setFromScore(boolean z10);

    public abstract void setViewModel(@Nullable StudentExercisesViewModel studentExercisesViewModel);

    @Deprecated
    public static FragmentStudentExercisesBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentStudentExercisesBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_student_exercises);
    }

    @NonNull
    @Deprecated
    public static FragmentStudentExercisesBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentStudentExercisesBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_student_exercises, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentStudentExercisesBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentStudentExercisesBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentStudentExercisesBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_student_exercises, null, false, obj);
    }
}
