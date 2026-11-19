package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.xuexiang.xui.widget.actionbar.TitleBar;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public abstract class FragmentOpenFileBinding extends ViewDataBinding {

    @NonNull
    public final LinearLayout fragmentOpenFile;

    @NonNull
    public final FragmentContainerView navFileFragment;

    @NonNull
    public final TitleBar toolbar;

    public FragmentOpenFileBinding(Object obj, View view, int i10, LinearLayout linearLayout, FragmentContainerView fragmentContainerView, TitleBar titleBar) {
        super(obj, view, i10);
        this.fragmentOpenFile = linearLayout;
        this.navFileFragment = fragmentContainerView;
        this.toolbar = titleBar;
    }

    public static FragmentOpenFileBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentOpenFileBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentOpenFileBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentOpenFileBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_open_file);
    }

    @NonNull
    @Deprecated
    public static FragmentOpenFileBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentOpenFileBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_open_file, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentOpenFileBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentOpenFileBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentOpenFileBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_open_file, null, false, obj);
    }
}
