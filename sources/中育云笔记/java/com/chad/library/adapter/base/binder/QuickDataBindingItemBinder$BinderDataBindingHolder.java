package com.chad.library.adapter.base.binder;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class QuickDataBindingItemBinder$BinderDataBindingHolder<DB extends ViewDataBinding> extends BaseViewHolder {

    /* renamed from: c */
    public final ViewDataBinding f5420c;

    /* JADX WARN: Illegal instructions before constructor call */
    public QuickDataBindingItemBinder$BinderDataBindingHolder(DB dataBinding) {
        AbstractC9979u.m20294g(dataBinding, "dataBinding");
        View root = dataBinding.getRoot();
        AbstractC9979u.m20293f(root, "dataBinding.root");
        super(root);
        this.f5420c = dataBinding;
    }
}
