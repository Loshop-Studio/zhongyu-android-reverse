package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.xuexiang.xui.widget.statelayout.MultipleStatusView;
import com.zykj.study.R$layout;
import com.zykj.study.viewmodels.SearchViewModel;

/* loaded from: classes3.dex */
public abstract class FragmentSearchResultBinding extends ViewDataBinding {

    @Bindable
    protected SearchViewModel mSearchViewModel;

    @NonNull
    public final MultipleStatusView msCourse;

    @NonNull
    public final RecyclerView recycleView;

    @NonNull
    public final SwipeRefreshLayout swipe;

    public FragmentSearchResultBinding(Object obj, View view, int i10, MultipleStatusView multipleStatusView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        super(obj, view, i10);
        this.msCourse = multipleStatusView;
        this.recycleView = recyclerView;
        this.swipe = swipeRefreshLayout;
    }

    public static FragmentSearchResultBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentSearchResultBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public SearchViewModel getSearchViewModel() {
        return this.mSearchViewModel;
    }

    public abstract void setSearchViewModel(@Nullable SearchViewModel searchViewModel);

    @Deprecated
    public static FragmentSearchResultBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentSearchResultBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_search_result);
    }

    @NonNull
    @Deprecated
    public static FragmentSearchResultBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentSearchResultBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_search_result, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentSearchResultBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentSearchResultBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentSearchResultBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_search_result, null, false, obj);
    }
}
