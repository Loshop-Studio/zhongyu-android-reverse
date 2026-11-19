package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.xuexiang.xui.widget.statelayout.MultipleStatusView;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public abstract class FragmentMyProductBinding extends ViewDataBinding {

    @NonNull
    public final TextView btnCreate;

    @NonNull
    public final RelativeLayout fragmentMyProduct;

    @NonNull
    public final MultipleStatusView msCourse;

    @NonNull
    public final RecyclerView rvCourse;

    @NonNull
    public final SwipeRefreshLayout sfCourse;

    public FragmentMyProductBinding(Object obj, View view, int i10, TextView textView, RelativeLayout relativeLayout, MultipleStatusView multipleStatusView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        super(obj, view, i10);
        this.btnCreate = textView;
        this.fragmentMyProduct = relativeLayout;
        this.msCourse = multipleStatusView;
        this.rvCourse = recyclerView;
        this.sfCourse = swipeRefreshLayout;
    }

    public static FragmentMyProductBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentMyProductBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentMyProductBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentMyProductBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_my_product);
    }

    @NonNull
    @Deprecated
    public static FragmentMyProductBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentMyProductBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_my_product, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentMyProductBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentMyProductBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentMyProductBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_my_product, null, false, obj);
    }
}
