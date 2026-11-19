package com.chad.library.adapter.base;

import android.view.ViewGroup;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p214k1.AbstractC9782a;

/* loaded from: classes3.dex */
public abstract class BaseDelegateMultiAdapter<T, VH extends BaseViewHolder> extends BaseQuickAdapter<T, VH> {
    /* JADX WARN: Multi-variable type inference failed */
    public BaseDelegateMultiAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public int getDefItemViewType(int i10) {
        m4649i();
        throw new IllegalStateException("Please use setMultiTypeDelegate first!");
    }

    /* renamed from: i */
    public final AbstractC9782a m4649i() {
        return null;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public BaseViewHolder onCreateDefViewHolder(ViewGroup parent, int i10) {
        AbstractC9979u.m20294g(parent, "parent");
        m4649i();
        throw new IllegalStateException("Please use setMultiTypeDelegate first!");
    }

    public /* synthetic */ BaseDelegateMultiAdapter(List list, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? null : list);
    }

    public BaseDelegateMultiAdapter(List list) {
        super(0, list);
    }
}
