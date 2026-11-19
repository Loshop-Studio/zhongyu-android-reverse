package com.zykj.huiwei.launcher.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.huiwei.launcher.viewmodels.CustomerServiceViewModel;
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public abstract class HwDialogCustomerServiceBinding extends ViewDataBinding {

    @NonNull
    public final AppCompatImageView ivClose;

    @NonNull
    public final LinearLayout llContent;

    @Bindable
    protected View.OnClickListener mOnClickListener;

    @Bindable
    protected CustomerServiceViewModel mVm;

    @NonNull
    public final AppCompatTextView tvCustomerChat;

    @NonNull
    public final AppCompatTextView tvCustomerEmail;

    @NonNull
    public final AppCompatTextView tvCustomerMobile;

    @NonNull
    public final TextView tvTitle;

    public HwDialogCustomerServiceBinding(Object obj, View view, int i6, AppCompatImageView appCompatImageView, LinearLayout linearLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, TextView textView) {
        super(obj, view, i6);
        this.ivClose = appCompatImageView;
        this.llContent = linearLayout;
        this.tvCustomerChat = appCompatTextView;
        this.tvCustomerEmail = appCompatTextView2;
        this.tvCustomerMobile = appCompatTextView3;
        this.tvTitle = textView;
    }

    public static HwDialogCustomerServiceBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static HwDialogCustomerServiceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6) {
        return inflate(layoutInflater, viewGroup, z6, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public View.OnClickListener getOnClickListener() {
        return this.mOnClickListener;
    }

    @Nullable
    public CustomerServiceViewModel getVm() {
        return this.mVm;
    }

    public abstract void setOnClickListener(@Nullable View.OnClickListener onClickListener);

    public abstract void setVm(@Nullable CustomerServiceViewModel customerServiceViewModel);

    @Deprecated
    public static HwDialogCustomerServiceBinding bind(@NonNull View view, @Nullable Object obj) {
        return (HwDialogCustomerServiceBinding) ViewDataBinding.bind(obj, view, R.layout.hw_dialog_customer_service);
    }

    @NonNull
    @Deprecated
    public static HwDialogCustomerServiceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6, @Nullable Object obj) {
        return (HwDialogCustomerServiceBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_dialog_customer_service, viewGroup, z6, obj);
    }

    @NonNull
    public static HwDialogCustomerServiceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static HwDialogCustomerServiceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (HwDialogCustomerServiceBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_dialog_customer_service, null, false, obj);
    }
}
