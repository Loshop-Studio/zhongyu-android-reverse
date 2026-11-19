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
import com.zykj.study.bean.teach.ChoiceChartData;

/* loaded from: classes3.dex */
public abstract class ItemChoiceByOptionsBinding extends ViewDataBinding {

    @NonNull
    public final ImageView ivBubble;

    @Bindable
    protected ChoiceChartData mData;

    @Bindable
    protected Boolean mIsSelected;

    @NonNull
    public final TextView tvName;

    @NonNull
    public final View viewBackground;

    @NonNull
    public final View viewContent;

    @NonNull
    public final View viewLine;

    public ItemChoiceByOptionsBinding(Object obj, View view, int i10, ImageView imageView, TextView textView, View view2, View view3, View view4) {
        super(obj, view, i10);
        this.ivBubble = imageView;
        this.tvName = textView;
        this.viewBackground = view2;
        this.viewContent = view3;
        this.viewLine = view4;
    }

    public static ItemChoiceByOptionsBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemChoiceByOptionsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public ChoiceChartData getData() {
        return this.mData;
    }

    @Nullable
    public Boolean getIsSelected() {
        return this.mIsSelected;
    }

    public abstract void setData(@Nullable ChoiceChartData choiceChartData);

    public abstract void setIsSelected(@Nullable Boolean bool);

    @Deprecated
    public static ItemChoiceByOptionsBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemChoiceByOptionsBinding) ViewDataBinding.bind(obj, view, R$layout.item_choice_by_options);
    }

    @NonNull
    @Deprecated
    public static ItemChoiceByOptionsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemChoiceByOptionsBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_choice_by_options, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemChoiceByOptionsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemChoiceByOptionsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemChoiceByOptionsBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_choice_by_options, null, false, obj);
    }
}
