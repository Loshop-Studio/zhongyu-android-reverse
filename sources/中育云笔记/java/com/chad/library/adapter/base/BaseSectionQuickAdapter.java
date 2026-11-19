package com.chad.library.adapter.base;

import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p212k.AbstractC9764r;
import p243m1.InterfaceC10192b;

/* loaded from: classes3.dex */
public abstract class BaseSectionQuickAdapter<T extends InterfaceC10192b, VH extends BaseViewHolder> extends BaseMultiItemQuickAdapter<T, VH> {
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public boolean isFixedViewType(int i10) {
        return super.isFixedViewType(i10) || i10 == -99;
    }

    /* renamed from: k */
    public abstract void m4690k(BaseViewHolder baseViewHolder, InterfaceC10192b interfaceC10192b);

    /* renamed from: l */
    public void m4691l(BaseViewHolder helper, InterfaceC10192b item, List payloads) {
        AbstractC9979u.m20294g(helper, "helper");
        AbstractC9979u.m20294g(item, "item");
        AbstractC9979u.m20294g(payloads, "payloads");
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(BaseViewHolder holder, int i10) {
        AbstractC9979u.m20294g(holder, "holder");
        if (holder.getItemViewType() == -99) {
            AbstractC9764r.m19682a(getItem(i10 - getHeaderLayoutCount()));
            m4690k(holder, null);
        } else {
            super.onBindViewHolder((BaseSectionQuickAdapter<T, VH>) holder, i10);
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(BaseViewHolder holder, int i10, List payloads) {
        AbstractC9979u.m20294g(holder, "holder");
        AbstractC9979u.m20294g(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, i10);
        } else if (holder.getItemViewType() == -99) {
            AbstractC9764r.m19682a(getItem(i10 - getHeaderLayoutCount()));
            m4691l(holder, null, payloads);
        } else {
            super.onBindViewHolder((BaseSectionQuickAdapter<T, VH>) holder, i10, (List<Object>) payloads);
        }
    }
}
