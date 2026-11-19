package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.xuexiang.xui.widget.statelayout.MultipleStatusView;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public abstract class FragmentStudyListBinding extends ViewDataBinding {

    @NonNull
    public final MultipleStatusView multipleStatusView;

    @NonNull
    public final RecyclerView recyclerStudy;

    @NonNull
    public final SwipeRefreshLayout swipe;

    public FragmentStudyListBinding(Object obj, View view, int i10, MultipleStatusView multipleStatusView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        super(obj, view, i10);
        this.multipleStatusView = multipleStatusView;
        this.recyclerStudy = recyclerView;
        this.swipe = swipeRefreshLayout;
    }

    public static FragmentStudyListBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentStudyListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentStudyListBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentStudyListBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_study_list);
    }

    @NonNull
    @Deprecated
    public static FragmentStudyListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentStudyListBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_study_list, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentStudyListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentStudyListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentStudyListBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_study_list, null, false, obj);
    }
}
