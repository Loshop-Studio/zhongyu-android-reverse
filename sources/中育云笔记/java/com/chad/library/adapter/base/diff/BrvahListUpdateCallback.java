package com.chad.library.adapter.base.diff;

import androidx.recyclerview.widget.ListUpdateCallback;
import com.chad.library.adapter.base.BaseQuickAdapter;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class BrvahListUpdateCallback implements ListUpdateCallback {

    /* renamed from: c */
    public final BaseQuickAdapter f5433c;

    public BrvahListUpdateCallback(BaseQuickAdapter mAdapter) {
        AbstractC9979u.m20294g(mAdapter, "mAdapter");
        this.f5433c = mAdapter;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onChanged(int i10, int i11, Object obj) {
        BaseQuickAdapter baseQuickAdapter = this.f5433c;
        baseQuickAdapter.notifyItemRangeChanged(i10 + baseQuickAdapter.getHeaderLayoutCount(), i11, obj);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onInserted(int i10, int i11) {
        BaseQuickAdapter baseQuickAdapter = this.f5433c;
        baseQuickAdapter.notifyItemRangeInserted(i10 + baseQuickAdapter.getHeaderLayoutCount(), i11);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onMoved(int i10, int i11) {
        BaseQuickAdapter baseQuickAdapter = this.f5433c;
        baseQuickAdapter.notifyItemMoved(i10 + baseQuickAdapter.getHeaderLayoutCount(), i11 + this.f5433c.getHeaderLayoutCount());
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onRemoved(int i10, int i11) {
        this.f5433c.getMLoadMoreModule$com_github_CymChad_brvah();
        BaseQuickAdapter baseQuickAdapter = this.f5433c;
        baseQuickAdapter.notifyItemRangeRemoved(i10 + baseQuickAdapter.getHeaderLayoutCount(), i11);
    }
}
