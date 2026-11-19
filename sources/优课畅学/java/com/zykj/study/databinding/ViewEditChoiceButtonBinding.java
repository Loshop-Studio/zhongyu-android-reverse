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
public abstract class ViewEditChoiceButtonBinding extends ViewDataBinding {

    @NonNull
    public final RoundButton btnComplete;

    @NonNull
    public final RoundButton btnNext;

    @Bindable
    protected BaseTrainViewModel mViewModel;

    public ViewEditChoiceButtonBinding(Object obj, View view, int i10, RoundButton roundButton, RoundButton roundButton2) {
        super(obj, view, i10);
        this.btnComplete = roundButton;
        this.btnNext = roundButton2;
    }

    public static ViewEditChoiceButtonBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ViewEditChoiceButtonBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public BaseTrainViewModel getViewModel() {
        return this.mViewModel;
    }

    public abstract void setViewModel(@Nullable BaseTrainViewModel baseTrainViewModel);

    @Deprecated
    public static ViewEditChoiceButtonBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ViewEditChoiceButtonBinding) ViewDataBinding.bind(obj, view, R$layout.view_edit_choice_button);
    }

    @NonNull
    @Deprecated
    public static ViewEditChoiceButtonBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ViewEditChoiceButtonBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_edit_choice_button, viewGroup, z10, obj);
    }

    @NonNull
    public static ViewEditChoiceButtonBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ViewEditChoiceButtonBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ViewEditChoiceButtonBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_edit_choice_button, null, false, obj);
    }
}
