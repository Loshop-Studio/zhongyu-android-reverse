package com.zykj.huiwei.launcher.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public abstract class DialogCrashHintBinding extends ViewDataBinding {

    @NonNull
    public final AppCompatTextView tvCancel;

    @NonNull
    public final AppCompatTextView tvConfirm;

    @NonNull
    public final TextView tvContent;

    @NonNull
    public final TextView tvHint;

    public DialogCrashHintBinding(Object obj, View view, int i6, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, TextView textView, TextView textView2) {
        super(obj, view, i6);
        this.tvCancel = appCompatTextView;
        this.tvConfirm = appCompatTextView2;
        this.tvContent = textView;
        this.tvHint = textView2;
    }

    public static DialogCrashHintBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static DialogCrashHintBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6) {
        return inflate(layoutInflater, viewGroup, z6, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogCrashHintBinding bind(@NonNull View view, @Nullable Object obj) {
        return (DialogCrashHintBinding) ViewDataBinding.bind(obj, view, R.layout.dialog_crash_hint);
    }

    @NonNull
    @Deprecated
    public static DialogCrashHintBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6, @Nullable Object obj) {
        return (DialogCrashHintBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_crash_hint, viewGroup, z6, obj);
    }

    @NonNull
    public static DialogCrashHintBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static DialogCrashHintBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (DialogCrashHintBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_crash_hint, null, false, obj);
    }
}
