package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.xuexiang.xui.widget.actionbar.TitleBar;
import com.zykj.study.R$layout;
import com.zykj.study.view.MultipleStatusView;
import com.zykj.study.viewmodels.ExerciseTrainViewModel;
import com.zykj.study.viewmodels.WebViewControlViewModel;

/* loaded from: classes3.dex */
public abstract class FragmentExerciseTrainBinding extends ViewDataBinding {

    @NonNull
    public final LinearLayout container;

    @NonNull
    public final LayoutExerciseSubjectBinding exerciseSubject;

    @NonNull
    public final ConstraintLayout fragmentTrain;

    @NonNull
    public final FrameLayout frameLayout;

    @Bindable
    protected ExerciseTrainViewModel mEntity;

    @Bindable
    protected WebViewControlViewModel mWebViewControlViewModel;

    @NonNull
    public final MultipleStatusView multipleStatusView;

    @NonNull
    public final FragmentContainerView navAnswerFragment;

    @NonNull
    public final RelativeLayout rlTitle;

    @NonNull
    public final TitleBar toolbar;

    @NonNull
    public final TextView tvPageMovingProgress;

    public FragmentExerciseTrainBinding(Object obj, View view, int i10, LinearLayout linearLayout, LayoutExerciseSubjectBinding layoutExerciseSubjectBinding, ConstraintLayout constraintLayout, FrameLayout frameLayout, MultipleStatusView multipleStatusView, FragmentContainerView fragmentContainerView, RelativeLayout relativeLayout, TitleBar titleBar, TextView textView) {
        super(obj, view, i10);
        this.container = linearLayout;
        this.exerciseSubject = layoutExerciseSubjectBinding;
        this.fragmentTrain = constraintLayout;
        this.frameLayout = frameLayout;
        this.multipleStatusView = multipleStatusView;
        this.navAnswerFragment = fragmentContainerView;
        this.rlTitle = relativeLayout;
        this.toolbar = titleBar;
        this.tvPageMovingProgress = textView;
    }

    public static FragmentExerciseTrainBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentExerciseTrainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public ExerciseTrainViewModel getEntity() {
        return this.mEntity;
    }

    @Nullable
    public WebViewControlViewModel getWebViewControlViewModel() {
        return this.mWebViewControlViewModel;
    }

    public abstract void setEntity(@Nullable ExerciseTrainViewModel exerciseTrainViewModel);

    public abstract void setWebViewControlViewModel(@Nullable WebViewControlViewModel webViewControlViewModel);

    @Deprecated
    public static FragmentExerciseTrainBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentExerciseTrainBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_exercise_train);
    }

    @NonNull
    @Deprecated
    public static FragmentExerciseTrainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentExerciseTrainBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_exercise_train, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentExerciseTrainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentExerciseTrainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentExerciseTrainBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_exercise_train, null, false, obj);
    }
}
