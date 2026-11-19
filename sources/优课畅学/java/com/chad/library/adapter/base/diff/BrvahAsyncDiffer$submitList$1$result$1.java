package com.chad.library.adapter.base.diff;

import androidx.recyclerview.widget.DiffUtil;
import java.util.List;
import p205p0.C9634a;

/* loaded from: classes3.dex */
public final class BrvahAsyncDiffer$submitList$1$result$1 extends DiffUtil.Callback {

    /* renamed from: a */
    public final /* synthetic */ List f3666a;

    /* renamed from: b */
    public final /* synthetic */ List f3667b;

    /* renamed from: c */
    public final /* synthetic */ C9634a f3668c;

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areContentsTheSame(int i10, int i11) {
        Object obj = this.f3666a.get(i10);
        Object obj2 = this.f3667b.get(i11);
        if (obj != null && obj2 != null) {
            return this.f3668c.f19279b.m18198a().areContentsTheSame(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areItemsTheSame(int i10, int i11) {
        Object obj = this.f3666a.get(i10);
        Object obj2 = this.f3667b.get(i11);
        return (obj == null || obj2 == null) ? obj == null && obj2 == null : this.f3668c.f19279b.m18198a().areItemsTheSame(obj, obj2);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public Object getChangePayload(int i10, int i11) {
        Object obj = this.f3666a.get(i10);
        Object obj2 = this.f3667b.get(i11);
        if (obj == null || obj2 == null) {
            throw new AssertionError();
        }
        return this.f3668c.f19279b.m18198a().getChangePayload(obj, obj2);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getNewListSize() {
        return this.f3667b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getOldListSize() {
        return this.f3666a.size();
    }
}
