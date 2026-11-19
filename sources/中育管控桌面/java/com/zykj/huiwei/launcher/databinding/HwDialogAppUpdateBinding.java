package com.zykj.huiwei.launcher.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.huiwei.launcher.p035ui.view.BubbleProgressView;
import com.zykj.huiwei.launcher.viewmodels.AppUpdateViewModel;
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public abstract class HwDialogAppUpdateBinding extends ViewDataBinding {

    @NonNull
    public final BubbleProgressView bubbleProgress;

    @NonNull
    public final View divider;

    @NonNull
    public final AppCompatImageView ivClose;

    @NonNull
    public final ImageView ivIcon;

    @Bindable
    protected View.OnClickListener mOnClickListener;

    @Bindable
    protected AppUpdateViewModel mVm;

    @NonNull
    public final View spacer;

    @NonNull
    public final AppCompatTextView tvCancel;

    @NonNull
    public final AppCompatTextView tvConfirm;

    @NonNull
    public final AppCompatTextView tvContent;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final AppCompatTextView tvVersion;

    public HwDialogAppUpdateBinding(Object obj, View view, int i6, BubbleProgressView bubbleProgressView, View view2, AppCompatImageView appCompatImageView, ImageView imageView, View view3, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, TextView textView, AppCompatTextView appCompatTextView4) {
        super(obj, view, i6);
        this.bubbleProgress = bubbleProgressView;
        this.divider = view2;
        this.ivClose = appCompatImageView;
        this.ivIcon = imageView;
        this.spacer = view3;
        this.tvCancel = appCompatTextView;
        this.tvConfirm = appCompatTextView2;
        this.tvContent = appCompatTextView3;
        this.tvTitle = textView;
        this.tvVersion = appCompatTextView4;
    }

    public static HwDialogAppUpdateBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static HwDialogAppUpdateBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6) {
        return inflate(layoutInflater, viewGroup, z6, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public View.OnClickListener getOnClickListener() {
        return this.mOnClickListener;
    }

    @Nullable
    public AppUpdateViewModel getVm() {
        return this.mVm;
    }

    public abstract void setOnClickListener(@Nullable View.OnClickListener onClickListener);

    public abstract void setVm(@Nullable AppUpdateViewModel appUpdateViewModel);

    @Deprecated
    public static HwDialogAppUpdateBinding bind(@NonNull View view, @Nullable Object obj) {
        return (HwDialogAppUpdateBinding) ViewDataBinding.bind(obj, view, R.layout.hw_dialog_app_update);
    }

    @NonNull
    @Deprecated
    public static HwDialogAppUpdateBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6, @Nullable Object obj) {
        return (HwDialogAppUpdateBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_dialog_app_update, viewGroup, z6, obj);
    }

    @NonNull
    public static HwDialogAppUpdateBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static HwDialogAppUpdateBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (HwDialogAppUpdateBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_dialog_app_update, null, false, obj);
    }
}
