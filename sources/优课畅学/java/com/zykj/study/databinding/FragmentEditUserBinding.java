package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public abstract class FragmentEditUserBinding extends ViewDataBinding {

    @NonNull
    public final ConstraintLayout fragmentEditUser;

    public FragmentEditUserBinding(Object obj, View view, int i10, ConstraintLayout constraintLayout) {
        super(obj, view, i10);
        this.fragmentEditUser = constraintLayout;
    }

    public static FragmentEditUserBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentEditUserBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentEditUserBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentEditUserBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_edit_user);
    }

    @NonNull
    @Deprecated
    public static FragmentEditUserBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentEditUserBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_edit_user, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentEditUserBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentEditUserBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentEditUserBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_edit_user, null, false, obj);
    }
}
