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
import com.xuexiang.xui.widget.progress.materialprogressbar.MaterialProgressBar;
import com.zykj.study.R$layout;
import com.zykj.study.bean.teach.SuperviseGroupMember;

/* loaded from: classes3.dex */
public abstract class ItemSuperviseGroupMemberItemBinding extends ViewDataBinding {

    @NonNull
    public final ImageView imageView12;

    @Bindable
    protected SuperviseGroupMember mEntity;

    @Bindable
    protected boolean mIsSelected;

    @Bindable
    protected View.OnClickListener mOnclick;

    @NonNull
    public final MaterialProgressBar progressBar2;

    @NonNull
    public final TextView textView28;

    @NonNull
    public final TextView textView31;

    public ItemSuperviseGroupMemberItemBinding(Object obj, View view, int i10, ImageView imageView, MaterialProgressBar materialProgressBar, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.imageView12 = imageView;
        this.progressBar2 = materialProgressBar;
        this.textView28 = textView;
        this.textView31 = textView2;
    }

    public static ItemSuperviseGroupMemberItemBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemSuperviseGroupMemberItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public SuperviseGroupMember getEntity() {
        return this.mEntity;
    }

    public boolean getIsSelected() {
        return this.mIsSelected;
    }

    @Nullable
    public View.OnClickListener getOnclick() {
        return this.mOnclick;
    }

    public abstract void setEntity(@Nullable SuperviseGroupMember superviseGroupMember);

    public abstract void setIsSelected(boolean z10);

    public abstract void setOnclick(@Nullable View.OnClickListener onClickListener);

    @Deprecated
    public static ItemSuperviseGroupMemberItemBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemSuperviseGroupMemberItemBinding) ViewDataBinding.bind(obj, view, R$layout.item_supervise_group_member_item);
    }

    @NonNull
    @Deprecated
    public static ItemSuperviseGroupMemberItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemSuperviseGroupMemberItemBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_supervise_group_member_item, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemSuperviseGroupMemberItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemSuperviseGroupMemberItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemSuperviseGroupMemberItemBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_supervise_group_member_item, null, false, obj);
    }
}
