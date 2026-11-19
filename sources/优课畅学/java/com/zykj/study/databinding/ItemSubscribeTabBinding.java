package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public abstract class ItemSubscribeTabBinding extends ViewDataBinding {

    @Bindable
    protected Boolean mIsSelected;

    @Bindable
    protected View.OnClickListener mOnClick;

    @Bindable
    protected String mTitle;

    @NonNull
    public final AppCompatTextView tvTitle;

    public ItemSubscribeTabBinding(Object obj, View view, int i10, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.tvTitle = appCompatTextView;
    }

    public static ItemSubscribeTabBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemSubscribeTabBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public Boolean getIsSelected() {
        return this.mIsSelected;
    }

    @Nullable
    public View.OnClickListener getOnClick() {
        return this.mOnClick;
    }

    @Nullable
    public String getTitle() {
        return this.mTitle;
    }

    public abstract void setIsSelected(@Nullable Boolean bool);

    public abstract void setOnClick(@Nullable View.OnClickListener onClickListener);

    public abstract void setTitle(@Nullable String str);

    @Deprecated
    public static ItemSubscribeTabBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemSubscribeTabBinding) ViewDataBinding.bind(obj, view, R$layout.item_subscribe_tab);
    }

    @NonNull
    @Deprecated
    public static ItemSubscribeTabBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemSubscribeTabBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_subscribe_tab, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemSubscribeTabBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemSubscribeTabBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemSubscribeTabBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_subscribe_tab, null, false, obj);
    }
}
