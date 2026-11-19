package com.chad.library.adapter.base.diff;

import androidx.recyclerview.widget.ListUpdateCallback;
import com.chad.library.adapter.base.BaseQuickAdapter;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class BrvahListUpdateCallback implements ListUpdateCallback {

    /* renamed from: a */
    public final BaseQuickAdapter f3669a;

    public BrvahListUpdateCallback(BaseQuickAdapter mAdapter) {
        AbstractC9133u.m16133g(mAdapter, "mAdapter");
        this.f3669a = mAdapter;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onChanged(int i10, int i11, Object obj) {
        BaseQuickAdapter baseQuickAdapter = this.f3669a;
        baseQuickAdapter.notifyItemRangeChanged(i10 + baseQuickAdapter.m3514u(), i11, obj);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onInserted(int i10, int i11) {
        BaseQuickAdapter baseQuickAdapter = this.f3669a;
        baseQuickAdapter.notifyItemRangeInserted(i10 + baseQuickAdapter.m3514u(), i11);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onMoved(int i10, int i11) {
        BaseQuickAdapter baseQuickAdapter = this.f3669a;
        baseQuickAdapter.notifyItemMoved(i10 + baseQuickAdapter.m3514u(), i11 + this.f3669a.m3514u());
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onRemoved(int i10, int i11) {
        this.f3669a.m3518y();
        BaseQuickAdapter baseQuickAdapter = this.f3669a;
        baseQuickAdapter.notifyItemRangeRemoved(i10 + baseQuickAdapter.m3514u(), i11);
    }
}
