package com.chad.library.adapter.base.binder;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class QuickViewBindingItemBinder$BinderVBHolder<VB extends ViewBinding> extends BaseViewHolder {

    /* renamed from: c */
    public final ViewBinding f5421c;

    /* JADX WARN: Illegal instructions before constructor call */
    public QuickViewBindingItemBinder$BinderVBHolder(VB viewBinding) {
        AbstractC9979u.m20294g(viewBinding, "viewBinding");
        View root = viewBinding.getRoot();
        AbstractC9979u.m20293f(root, "viewBinding.root");
        super(root);
        this.f5421c = viewBinding;
    }
}
