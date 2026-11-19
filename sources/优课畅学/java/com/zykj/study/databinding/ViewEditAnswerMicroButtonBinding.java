package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.xuexiang.xui.widget.button.roundbutton.RoundButton;
import com.zykj.study.R$layout;
import com.zykj.study.viewmodels.BaseTrainViewModel;

/* loaded from: classes3.dex */
public abstract class ViewEditAnswerMicroButtonBinding extends ViewDataBinding {

    @NonNull
    public final RoundButton btnComplete;

    @NonNull
    public final RoundButton btnNext;

    @NonNull
    public final RoundButton btnRevision;

    @Bindable
    protected BaseTrainViewModel mViewModel;

    public ViewEditAnswerMicroButtonBinding(Object obj, View view, int i10, RoundButton roundButton, RoundButton roundButton2, RoundButton roundButton3) {
        super(obj, view, i10);
        this.btnComplete = roundButton;
        this.btnNext = roundButton2;
        this.btnRevision = roundButton3;
    }

    public static ViewEditAnswerMicroButtonBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ViewEditAnswerMicroButtonBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public BaseTrainViewModel getViewModel() {
        return this.mViewModel;
    }

    public abstract void setViewModel(@Nullable BaseTrainViewModel baseTrainViewModel);

    @Deprecated
    public static ViewEditAnswerMicroButtonBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ViewEditAnswerMicroButtonBinding) ViewDataBinding.bind(obj, view, R$layout.view_edit_answer_micro_button);
    }

    @NonNull
    @Deprecated
    public static ViewEditAnswerMicroButtonBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ViewEditAnswerMicroButtonBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_edit_answer_micro_button, viewGroup, z10, obj);
    }

    @NonNull
    public static ViewEditAnswerMicroButtonBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ViewEditAnswerMicroButtonBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ViewEditAnswerMicroButtonBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_edit_answer_micro_button, null, false, obj);
    }
}
