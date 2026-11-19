package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.R$layout;
import com.zykj.study.viewmodels.CatalogViewModel;

/* loaded from: classes3.dex */
public abstract class DialogCatalogBinding extends ViewDataBinding {

    @Bindable
    protected View.OnClickListener mClickListener;

    @Bindable
    protected CatalogViewModel mEntity;

    @NonNull
    public final NestedScrollView nested;

    @NonNull
    public final RecyclerView recyclerViewGrade;

    @NonNull
    public final RecyclerView recyclerViewPeriod;

    @NonNull
    public final RecyclerView recyclerViewSubject;

    @NonNull
    public final TextView textView16;

    @NonNull
    public final TextView textView17;

    @NonNull
    public final TextView textView18;

    @NonNull
    public final TextView textView19;

    @NonNull
    public final TextView textView20;

    @NonNull
    public final TextView textView21;

    @NonNull
    public final TextView tvCatalogTitle;

    @NonNull
    public final TextView tvSure;

    @NonNull
    public final View view;

    public DialogCatalogBinding(Object obj, View view, int i10, NestedScrollView nestedScrollView, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, View view2) {
        super(obj, view, i10);
        this.nested = nestedScrollView;
        this.recyclerViewGrade = recyclerView;
        this.recyclerViewPeriod = recyclerView2;
        this.recyclerViewSubject = recyclerView3;
        this.textView16 = textView;
        this.textView17 = textView2;
        this.textView18 = textView3;
        this.textView19 = textView4;
        this.textView20 = textView5;
        this.textView21 = textView6;
        this.tvCatalogTitle = textView7;
        this.tvSure = textView8;
        this.view = view2;
    }

    public static DialogCatalogBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static DialogCatalogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public View.OnClickListener getClickListener() {
        return this.mClickListener;
    }

    @Nullable
    public CatalogViewModel getEntity() {
        return this.mEntity;
    }

    public abstract void setClickListener(@Nullable View.OnClickListener onClickListener);

    public abstract void setEntity(@Nullable CatalogViewModel catalogViewModel);

    @Deprecated
    public static DialogCatalogBinding bind(@NonNull View view, @Nullable Object obj) {
        return (DialogCatalogBinding) ViewDataBinding.bind(obj, view, R$layout.dialog_catalog);
    }

    @NonNull
    @Deprecated
    public static DialogCatalogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (DialogCatalogBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.dialog_catalog, viewGroup, z10, obj);
    }

    @NonNull
    public static DialogCatalogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static DialogCatalogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (DialogCatalogBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.dialog_catalog, null, false, obj);
    }
}
