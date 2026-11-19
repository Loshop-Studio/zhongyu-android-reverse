package com.zykj.huiwei.launcher.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.huiwei.launcher.viewmodels.LoginViewModel;
import com.zykj.manage.R;
import com.zykj.policy.p037ui.PolicyCheckView;

/* loaded from: classes4.dex */
public abstract class HwFragmentLoginBinding extends ViewDataBinding {

    /* renamed from: bg */
    @NonNull
    public final View f6075bg;

    @NonNull
    public final AppCompatEditText etPassword;

    @NonNull
    public final AppCompatEditText etSchoolCode;

    @NonNull
    public final AppCompatEditText etUsername;

    @NonNull
    public final AppCompatImageView ivLogo;

    @Bindable
    protected LoginViewModel mVm;

    @NonNull
    public final PolicyCheckView policyCheckView;

    @NonNull
    public final AppCompatTextView tvLogin;

    @NonNull
    public final TextView tvNet;

    @NonNull
    public final TextView tvUpdateTime;

    @NonNull
    public final TextView tvVersion;

    public HwFragmentLoginBinding(Object obj, View view, int i6, View view2, AppCompatEditText appCompatEditText, AppCompatEditText appCompatEditText2, AppCompatEditText appCompatEditText3, AppCompatImageView appCompatImageView, PolicyCheckView policyCheckView, AppCompatTextView appCompatTextView, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i6);
        this.f6075bg = view2;
        this.etPassword = appCompatEditText;
        this.etSchoolCode = appCompatEditText2;
        this.etUsername = appCompatEditText3;
        this.ivLogo = appCompatImageView;
        this.policyCheckView = policyCheckView;
        this.tvLogin = appCompatTextView;
        this.tvNet = textView;
        this.tvUpdateTime = textView2;
        this.tvVersion = textView3;
    }

    public static HwFragmentLoginBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static HwFragmentLoginBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6) {
        return inflate(layoutInflater, viewGroup, z6, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public LoginViewModel getVm() {
        return this.mVm;
    }

    public abstract void setVm(@Nullable LoginViewModel loginViewModel);

    @Deprecated
    public static HwFragmentLoginBinding bind(@NonNull View view, @Nullable Object obj) {
        return (HwFragmentLoginBinding) ViewDataBinding.bind(obj, view, R.layout.hw_fragment_login);
    }

    @NonNull
    @Deprecated
    public static HwFragmentLoginBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6, @Nullable Object obj) {
        return (HwFragmentLoginBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_fragment_login, viewGroup, z6, obj);
    }

    @NonNull
    public static HwFragmentLoginBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static HwFragmentLoginBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (HwFragmentLoginBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_fragment_login, null, false, obj);
    }
}
