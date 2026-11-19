package com.chad.library.adapter.base;

import com.blankj.utilcode.util.AbstractC5379p;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p216q0.InterfaceC9778a;

/* loaded from: classes3.dex */
public abstract class BaseSectionQuickAdapter<T extends InterfaceC9778a, VH extends BaseViewHolder> extends BaseMultiItemQuickAdapter<T, VH> {
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: H */
    public boolean mo3458H(int i10) {
        return super.mo3458H(i10) || i10 == -99;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: I */
    public void onBindViewHolder(BaseViewHolder holder, int i10) {
        AbstractC9133u.m16133g(holder, "holder");
        if (holder.getItemViewType() != -99) {
            super.onBindViewHolder(holder, i10);
        } else {
            AbstractC5379p.m2596a(getItem(i10 - m3514u()));
            m3520W(holder, null);
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: J */
    public void onBindViewHolder(BaseViewHolder holder, int i10, List payloads) {
        AbstractC9133u.m16133g(holder, "holder");
        AbstractC9133u.m16133g(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, i10);
        } else if (holder.getItemViewType() != -99) {
            super.onBindViewHolder(holder, i10, payloads);
        } else {
            AbstractC5379p.m2596a(getItem(i10 - m3514u()));
            m3521X(holder, null, payloads);
        }
    }

    /* renamed from: W */
    public abstract void m3520W(BaseViewHolder baseViewHolder, InterfaceC9778a interfaceC9778a);

    /* renamed from: X */
    public void m3521X(BaseViewHolder helper, InterfaceC9778a item, List payloads) {
        AbstractC9133u.m16133g(helper, "helper");
        AbstractC9133u.m16133g(item, "item");
        AbstractC9133u.m16133g(payloads, "payloads");
    }
}
