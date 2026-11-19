package com.chad.library.adapter.base.binder;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class QuickViewBindingItemBinder$BinderVBHolder<VB extends ViewBinding> extends BaseViewHolder {

    /* renamed from: a */
    public final ViewBinding f3665a;

    /* JADX WARN: Illegal instructions before constructor call */
    public QuickViewBindingItemBinder$BinderVBHolder(VB viewBinding) {
        AbstractC9133u.m16133g(viewBinding, "viewBinding");
        View root = viewBinding.getRoot();
        AbstractC9133u.m16132f(root, "viewBinding.root");
        super(root);
        this.f3665a = viewBinding;
    }
}
