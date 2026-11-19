package com.chad.library.adapter.base;

import android.util.SparseIntArray;
import android.view.ViewGroup;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.util.List;
import kotlin.AbstractC9923a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p243m1.InterfaceC10191a;
import p309qc.InterfaceC10773d;

/* loaded from: classes3.dex */
public abstract class BaseMultiItemQuickAdapter<T extends InterfaceC10191a, VH extends BaseViewHolder> extends BaseQuickAdapter<T, VH> {

    /* renamed from: a */
    public final InterfaceC10773d f5405a;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseMultiItemQuickAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public int getDefItemViewType(int i10) {
        return getData().get(i10).getItemType();
    }

    /* renamed from: i */
    public final void m4650i(int i10, int i11) {
        m4651j().put(i10, i11);
    }

    /* renamed from: j */
    public final SparseIntArray m4651j() {
        return (SparseIntArray) this.f5405a.getValue();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public BaseViewHolder onCreateDefViewHolder(ViewGroup parent, int i10) {
        AbstractC9979u.m20294g(parent, "parent");
        int i11 = m4651j().get(i10);
        if (i11 != 0) {
            return createBaseViewHolder(parent, i11);
        }
        throw new IllegalArgumentException(("ViewType: " + i10 + " found layoutResId，please use addItemType() first!").toString());
    }

    public /* synthetic */ BaseMultiItemQuickAdapter(List list, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? null : list);
    }

    public BaseMultiItemQuickAdapter(List list) {
        super(0, list);
        this.f5405a = AbstractC9923a.m20069b(LazyThreadSafetyMode.f23258e, new InterfaceC9529a() { // from class: com.chad.library.adapter.base.BaseMultiItemQuickAdapter$layouts$2
            @Override // p181hd.InterfaceC9529a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SparseIntArray invoke() {
                return new SparseIntArray();
            }
        });
    }
}
