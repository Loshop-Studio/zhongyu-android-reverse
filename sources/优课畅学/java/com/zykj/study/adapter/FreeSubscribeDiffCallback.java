package com.zykj.study.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.DiffUtil;
import com.zykj.study.bean.FreeSubscribe;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class FreeSubscribeDiffCallback extends DiffUtil.ItemCallback<FreeSubscribe> {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(FreeSubscribe oldItem, FreeSubscribe newItem) {
        AbstractC9133u.m16133g(oldItem, "oldItem");
        AbstractC9133u.m16133g(newItem, "newItem");
        return AbstractC9133u.m16128b(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(FreeSubscribe oldItem, FreeSubscribe newItem) {
        AbstractC9133u.m16133g(oldItem, "oldItem");
        AbstractC9133u.m16133g(newItem, "newItem");
        return AbstractC9133u.m16128b(oldItem.getId(), newItem.getId());
    }
}
