package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public abstract class DialogSingleSubscribeDeleteBinding extends ViewDataBinding {

    @NonNull
    public final AppCompatTextView tvCancel;

    @NonNull
    public final AppCompatTextView tvMessage;

    @NonNull
    public final AppCompatTextView tvSure;

    @NonNull
    public final AppCompatTextView tvTitle;

    public DialogSingleSubscribeDeleteBinding(Object obj, View view, int i10, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4) {
        super(obj, view, i10);
        this.tvCancel = appCompatTextView;
        this.tvMessage = appCompatTextView2;
        this.tvSure = appCompatTextView3;
        this.tvTitle = appCompatTextView4;
    }

    public static DialogSingleSubscribeDeleteBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static DialogSingleSubscribeDeleteBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogSingleSubscribeDeleteBinding bind(@NonNull View view, @Nullable Object obj) {
        return (DialogSingleSubscribeDeleteBinding) ViewDataBinding.bind(obj, view, R$layout.dialog_single_subscribe_delete);
    }

    @NonNull
    @Deprecated
    public static DialogSingleSubscribeDeleteBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (DialogSingleSubscribeDeleteBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.dialog_single_subscribe_delete, viewGroup, z10, obj);
    }

    @NonNull
    public static DialogSingleSubscribeDeleteBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static DialogSingleSubscribeDeleteBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (DialogSingleSubscribeDeleteBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.dialog_single_subscribe_delete, null, false, obj);
    }
}
