package com.chad.library.adapter.base;

import android.view.ViewGroup;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p194o0.AbstractC9510a;

/* loaded from: classes3.dex */
public abstract class BaseDelegateMultiAdapter<T, VH extends BaseViewHolder> extends BaseQuickAdapter<T, VH> {
    /* JADX WARN: Multi-variable type inference failed */
    public BaseDelegateMultiAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: K */
    public BaseViewHolder mo3440K(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        m3453V();
        throw new IllegalStateException("Please use setMultiTypeDelegate first!");
    }

    /* renamed from: V */
    public final AbstractC9510a m3453V() {
        return null;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: q */
    public int mo3452q(int i10) {
        m3453V();
        throw new IllegalStateException("Please use setMultiTypeDelegate first!");
    }

    public /* synthetic */ BaseDelegateMultiAdapter(List list, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? null : list);
    }

    public BaseDelegateMultiAdapter(List list) {
        super(0, list);
    }
}
