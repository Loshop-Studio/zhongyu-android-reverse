package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.xuexiang.xui.widget.edittext.ClearEditText;
import com.zykj.study.R$layout;
import com.zykj.study.viewmodels.SearchViewModel;

/* loaded from: classes3.dex */
public abstract class FragmentSearchBinding extends ViewDataBinding {

    @NonNull
    public final ClearEditText etSearch;

    @NonNull
    public final FrameLayout fragmentContainer;

    @NonNull
    public final ConstraintLayout fragmentSearch;

    @Bindable
    protected SearchViewModel mSearchViewModel;

    @NonNull
    public final TextView tvCancel;

    public FragmentSearchBinding(Object obj, View view, int i10, ClearEditText clearEditText, FrameLayout frameLayout, ConstraintLayout constraintLayout, TextView textView) {
        super(obj, view, i10);
        this.etSearch = clearEditText;
        this.fragmentContainer = frameLayout;
        this.fragmentSearch = constraintLayout;
        this.tvCancel = textView;
    }

    public static FragmentSearchBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentSearchBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public SearchViewModel getSearchViewModel() {
        return this.mSearchViewModel;
    }

    public abstract void setSearchViewModel(@Nullable SearchViewModel searchViewModel);

    @Deprecated
    public static FragmentSearchBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentSearchBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_search);
    }

    @NonNull
    @Deprecated
    public static FragmentSearchBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentSearchBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_search, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentSearchBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentSearchBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentSearchBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_search, null, false, obj);
    }
}
