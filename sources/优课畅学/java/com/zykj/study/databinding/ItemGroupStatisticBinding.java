package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.study.R$layout;
import com.zykj.study.bean.exercise.QuestionBean;

/* loaded from: classes3.dex */
public abstract class ItemGroupStatisticBinding extends ViewDataBinding {

    @NonNull
    public final ImageView imageView19;

    @Bindable
    protected QuestionBean mBean;

    @Bindable
    protected int mIndex;

    @Bindable
    protected View.OnClickListener mOnClick;

    @NonNull
    public final TextView textView42;

    @NonNull
    public final TextView textView43;

    @NonNull
    public final TextView textView44;

    @NonNull
    public final View view6;

    public ItemGroupStatisticBinding(Object obj, View view, int i10, ImageView imageView, TextView textView, TextView textView2, TextView textView3, View view2) {
        super(obj, view, i10);
        this.imageView19 = imageView;
        this.textView42 = textView;
        this.textView43 = textView2;
        this.textView44 = textView3;
        this.view6 = view2;
    }

    public static ItemGroupStatisticBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemGroupStatisticBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public QuestionBean getBean() {
        return this.mBean;
    }

    public int getIndex() {
        return this.mIndex;
    }

    @Nullable
    public View.OnClickListener getOnClick() {
        return this.mOnClick;
    }

    public abstract void setBean(@Nullable QuestionBean questionBean);

    public abstract void setIndex(int i10);

    public abstract void setOnClick(@Nullable View.OnClickListener onClickListener);

    @Deprecated
    public static ItemGroupStatisticBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemGroupStatisticBinding) ViewDataBinding.bind(obj, view, R$layout.item_group_statistic);
    }

    @NonNull
    @Deprecated
    public static ItemGroupStatisticBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemGroupStatisticBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_group_statistic, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemGroupStatisticBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemGroupStatisticBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemGroupStatisticBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_group_statistic, null, false, obj);
    }
}
