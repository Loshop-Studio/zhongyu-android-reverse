package com.zykj.huiwei.launcher.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.huiwei.launcher.viewmodels.TipsViewModel;
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public abstract class HwDialogTipsBinding extends ViewDataBinding {

    @Bindable
    protected View.OnClickListener mOnClickListener;

    @Bindable
    protected TipsViewModel mVm;

    @NonNull
    public final AppCompatTextView tvCancel;

    @NonNull
    public final AppCompatTextView tvConfirm;

    @NonNull
    public final TextView tvTitle;

    public HwDialogTipsBinding(Object obj, View view, int i6, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, TextView textView) {
        super(obj, view, i6);
        this.tvCancel = appCompatTextView;
        this.tvConfirm = appCompatTextView2;
        this.tvTitle = textView;
    }

    public static HwDialogTipsBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static HwDialogTipsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6) {
        return inflate(layoutInflater, viewGroup, z6, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public View.OnClickListener getOnClickListener() {
        return this.mOnClickListener;
    }

    @Nullable
    public TipsViewModel getVm() {
        return this.mVm;
    }

    public abstract void setOnClickListener(@Nullable View.OnClickListener onClickListener);

    public abstract void setVm(@Nullable TipsViewModel tipsViewModel);

    @Deprecated
    public static HwDialogTipsBinding bind(@NonNull View view, @Nullable Object obj) {
        return (HwDialogTipsBinding) ViewDataBinding.bind(obj, view, R.layout.hw_dialog_tips);
    }

    @NonNull
    @Deprecated
    public static HwDialogTipsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6, @Nullable Object obj) {
        return (HwDialogTipsBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_dialog_tips, viewGroup, z6, obj);
    }

    @NonNull
    public static HwDialogTipsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static HwDialogTipsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (HwDialogTipsBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_dialog_tips, null, false, obj);
    }
}
