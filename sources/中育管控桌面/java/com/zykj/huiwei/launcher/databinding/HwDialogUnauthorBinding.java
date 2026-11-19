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
import com.zykj.huiwei.launcher.viewmodels.UnAuthorViewModel;
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public abstract class HwDialogUnauthorBinding extends ViewDataBinding {

    @Bindable
    protected View.OnClickListener mOnClickListener;

    @Bindable
    protected UnAuthorViewModel mVm;

    @NonNull
    public final AppCompatTextView tvConfirm;

    @NonNull
    public final TextView tvTitle;

    public HwDialogUnauthorBinding(Object obj, View view, int i6, AppCompatTextView appCompatTextView, TextView textView) {
        super(obj, view, i6);
        this.tvConfirm = appCompatTextView;
        this.tvTitle = textView;
    }

    public static HwDialogUnauthorBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static HwDialogUnauthorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6) {
        return inflate(layoutInflater, viewGroup, z6, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public View.OnClickListener getOnClickListener() {
        return this.mOnClickListener;
    }

    @Nullable
    public UnAuthorViewModel getVm() {
        return this.mVm;
    }

    public abstract void setOnClickListener(@Nullable View.OnClickListener onClickListener);

    public abstract void setVm(@Nullable UnAuthorViewModel unAuthorViewModel);

    @Deprecated
    public static HwDialogUnauthorBinding bind(@NonNull View view, @Nullable Object obj) {
        return (HwDialogUnauthorBinding) ViewDataBinding.bind(obj, view, R.layout.hw_dialog_unauthor);
    }

    @NonNull
    @Deprecated
    public static HwDialogUnauthorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6, @Nullable Object obj) {
        return (HwDialogUnauthorBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_dialog_unauthor, viewGroup, z6, obj);
    }

    @NonNull
    public static HwDialogUnauthorBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static HwDialogUnauthorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (HwDialogUnauthorBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_dialog_unauthor, null, false, obj);
    }
}
