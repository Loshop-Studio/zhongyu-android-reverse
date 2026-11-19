package com.zykj.view.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.C5280R;

/* loaded from: classes3.dex */
public abstract class ViewDialogCommonTipBinding extends ViewDataBinding {

    @NonNull
    public final Guideline guideLine;

    @NonNull
    public final TextView tvCancel;

    @NonNull
    public final TextView tvConfirm;

    @NonNull
    public final TextView tvContent;

    public ViewDialogCommonTipBinding(Object obj, View view, int i, Guideline guideline, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.guideLine = guideline;
        this.tvCancel = textView;
        this.tvConfirm = textView2;
        this.tvContent = textView3;
    }

    public static ViewDialogCommonTipBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ViewDialogCommonTipBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8) {
        return inflate(layoutInflater, viewGroup, z8, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewDialogCommonTipBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ViewDialogCommonTipBinding) ViewDataBinding.bind(obj, view, C5280R.layout.view_dialog_common_tip);
    }

    @NonNull
    @Deprecated
    public static ViewDialogCommonTipBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8, @Nullable Object obj) {
        return (ViewDialogCommonTipBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_dialog_common_tip, viewGroup, z8, obj);
    }

    @NonNull
    public static ViewDialogCommonTipBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ViewDialogCommonTipBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ViewDialogCommonTipBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_dialog_common_tip, null, false, obj);
    }
}
