package com.zykj.huiwei.launcher.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public abstract class HwDialogModifyGestureBinding extends ViewDataBinding {

    @NonNull
    public final AppCompatImageView ivClose;

    @Bindable
    protected View.OnClickListener mOnClickListener;

    @NonNull
    public final TextView tvCancel;

    @NonNull
    public final TextView tvContent1;

    @NonNull
    public final TextView tvContent2;

    @NonNull
    public final TextView tvReset;

    @NonNull
    public final TextView tvTitle;

    public HwDialogModifyGestureBinding(Object obj, View view, int i6, AppCompatImageView appCompatImageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i6);
        this.ivClose = appCompatImageView;
        this.tvCancel = textView;
        this.tvContent1 = textView2;
        this.tvContent2 = textView3;
        this.tvReset = textView4;
        this.tvTitle = textView5;
    }

    public static HwDialogModifyGestureBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static HwDialogModifyGestureBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6) {
        return inflate(layoutInflater, viewGroup, z6, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public View.OnClickListener getOnClickListener() {
        return this.mOnClickListener;
    }

    public abstract void setOnClickListener(@Nullable View.OnClickListener onClickListener);

    @Deprecated
    public static HwDialogModifyGestureBinding bind(@NonNull View view, @Nullable Object obj) {
        return (HwDialogModifyGestureBinding) ViewDataBinding.bind(obj, view, R.layout.hw_dialog_modify_gesture);
    }

    @NonNull
    @Deprecated
    public static HwDialogModifyGestureBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6, @Nullable Object obj) {
        return (HwDialogModifyGestureBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_dialog_modify_gesture, viewGroup, z6, obj);
    }

    @NonNull
    public static HwDialogModifyGestureBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static HwDialogModifyGestureBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (HwDialogModifyGestureBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_dialog_modify_gesture, null, false, obj);
    }
}
