package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.widget.statelayout.MultipleStatusView;
import com.zykj.study.R$layout;
import com.zykj.study.viewmodels.SearchViewModel;

/* loaded from: classes3.dex */
public abstract class FragmentSearchHistoryBinding extends ViewDataBinding {

    @NonNull
    public final ConstraintLayout fragmentSearchHistory;

    @Bindable
    protected SearchViewModel mSearchViewModel;

    @NonNull
    public final RecyclerView recycleHistory;

    @NonNull
    public final MultipleStatusView statusView;

    @NonNull
    public final TextView tvClear;

    @NonNull
    public final TextView tvRecentSearch;

    @NonNull
    public final View view3;

    public FragmentSearchHistoryBinding(Object obj, View view, int i10, ConstraintLayout constraintLayout, RecyclerView recyclerView, MultipleStatusView multipleStatusView, TextView textView, TextView textView2, View view2) {
        super(obj, view, i10);
        this.fragmentSearchHistory = constraintLayout;
        this.recycleHistory = recyclerView;
        this.statusView = multipleStatusView;
        this.tvClear = textView;
        this.tvRecentSearch = textView2;
        this.view3 = view2;
    }

    public static FragmentSearchHistoryBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentSearchHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public SearchViewModel getSearchViewModel() {
        return this.mSearchViewModel;
    }

    public abstract void setSearchViewModel(@Nullable SearchViewModel searchViewModel);

    @Deprecated
    public static FragmentSearchHistoryBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentSearchHistoryBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_search_history);
    }

    @NonNull
    @Deprecated
    public static FragmentSearchHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentSearchHistoryBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_search_history, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentSearchHistoryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentSearchHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentSearchHistoryBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_search_history, null, false, obj);
    }
}
