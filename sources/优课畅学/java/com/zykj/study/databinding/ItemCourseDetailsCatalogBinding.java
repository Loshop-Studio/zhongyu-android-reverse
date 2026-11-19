package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.widget.statelayout.MultipleStatusView;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public abstract class ItemCourseDetailsCatalogBinding extends ViewDataBinding {

    @NonNull
    public final MultipleStatusView multipleStatusView;

    @NonNull
    public final RecyclerView recycle;

    @NonNull
    public final TextView textView22;

    public ItemCourseDetailsCatalogBinding(Object obj, View view, int i10, MultipleStatusView multipleStatusView, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i10);
        this.multipleStatusView = multipleStatusView;
        this.recycle = recyclerView;
        this.textView22 = textView;
    }

    public static ItemCourseDetailsCatalogBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemCourseDetailsCatalogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemCourseDetailsCatalogBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemCourseDetailsCatalogBinding) ViewDataBinding.bind(obj, view, R$layout.item_course_details_catalog);
    }

    @NonNull
    @Deprecated
    public static ItemCourseDetailsCatalogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemCourseDetailsCatalogBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_course_details_catalog, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemCourseDetailsCatalogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemCourseDetailsCatalogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemCourseDetailsCatalogBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_course_details_catalog, null, false, obj);
    }
}
