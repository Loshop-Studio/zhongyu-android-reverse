package com.chad.library.adapter.base;

import android.util.SparseIntArray;
import android.view.ViewGroup;
import com.blankj.utilcode.util.AbstractC5379p;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.util.List;
import kotlin.AbstractC9078a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8724d;
import p300x7.InterfaceC10559a;

/* loaded from: classes3.dex */
public abstract class BaseMultiItemQuickAdapter<T, VH extends BaseViewHolder> extends BaseQuickAdapter<T, VH> {

    /* renamed from: v */
    public final InterfaceC8724d f3635v;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseMultiItemQuickAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: K */
    public BaseViewHolder mo3440K(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        int i11 = m3454V().get(i10);
        if (i11 != 0) {
            return m3507m(parent, i11);
        }
        throw new IllegalArgumentException(("ViewType: " + i10 + " found layoutResId，please use addItemType() first!").toString());
    }

    /* renamed from: V */
    public final SparseIntArray m3454V() {
        return (SparseIntArray) this.f3635v.getValue();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: q */
    public int mo3452q(int i10) {
        AbstractC5379p.m2596a(m3509o().get(i10));
        throw null;
    }

    public /* synthetic */ BaseMultiItemQuickAdapter(List list, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? null : list);
    }

    public BaseMultiItemQuickAdapter(List list) {
        super(0, list);
        this.f3635v = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.chad.library.adapter.base.BaseMultiItemQuickAdapter$layouts$2
            @Override // p300x7.InterfaceC10559a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SparseIntArray invoke() {
                return new SparseIntArray();
            }
        });
    }
}
