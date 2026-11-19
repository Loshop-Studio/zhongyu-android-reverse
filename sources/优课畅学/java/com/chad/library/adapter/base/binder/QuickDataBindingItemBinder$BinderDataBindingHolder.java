package com.chad.library.adapter.base.binder;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class QuickDataBindingItemBinder$BinderDataBindingHolder<DB extends ViewDataBinding> extends BaseViewHolder {

    /* renamed from: a */
    public final ViewDataBinding f3664a;

    /* JADX WARN: Illegal instructions before constructor call */
    public QuickDataBindingItemBinder$BinderDataBindingHolder(DB dataBinding) {
        AbstractC9133u.m16133g(dataBinding, "dataBinding");
        View root = dataBinding.getRoot();
        AbstractC9133u.m16132f(root, "dataBinding.root");
        super(root);
        this.f3664a = dataBinding;
    }
}
