package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.zykj.study.R$layout;
import com.zykj.study.viewmodels.MicroEditViewModel;

/* loaded from: classes3.dex */
public abstract class FragmentMicroEditBinding extends ViewDataBinding {

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final FragmentContainerView fragmentCrop;

    @NonNull
    public final RelativeLayout fragmentMicroEdit;

    @Bindable
    protected MicroEditViewModel mViewModel;

    @NonNull
    public final ImageView menuExtra;

    public FragmentMicroEditBinding(Object obj, View view, int i10, FrameLayout frameLayout, FragmentContainerView fragmentContainerView, RelativeLayout relativeLayout, ImageView imageView) {
        super(obj, view, i10);
        this.container = frameLayout;
        this.fragmentCrop = fragmentContainerView;
        this.fragmentMicroEdit = relativeLayout;
        this.menuExtra = imageView;
    }

    public static FragmentMicroEditBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentMicroEditBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public MicroEditViewModel getViewModel() {
        return this.mViewModel;
    }

    public abstract void setViewModel(@Nullable MicroEditViewModel microEditViewModel);

    @Deprecated
    public static FragmentMicroEditBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentMicroEditBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_micro_edit);
    }

    @NonNull
    @Deprecated
    public static FragmentMicroEditBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentMicroEditBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_micro_edit, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentMicroEditBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentMicroEditBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentMicroEditBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_micro_edit, null, false, obj);
    }
}
