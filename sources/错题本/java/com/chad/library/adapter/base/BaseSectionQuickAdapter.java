package com.chad.library.adapter.base;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;

@Metadata(m5109d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¨\u0006\u0006"}, m5110d2 = {"Lcom/chad/library/adapter/base/BaseSectionQuickAdapter;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "VH", "Lcom/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "com.github.CymChad.brvah"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public abstract class BaseSectionQuickAdapter<T, VH extends BaseViewHolder> extends BaseMultiItemQuickAdapter<T, VH> {
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: e */
    public final boolean mo2500e(int i) {
        return super.mo2500e(i) || i == -99;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: f */
    public final void onBindViewHolder(BaseViewHolder holder, int i) {
        AbstractC5830k.m5330g(holder, "holder");
        if (holder.getItemViewType() != -99) {
            super.onBindViewHolder(holder, i);
        } else {
            if (this.f2645b.get(i) != null) {
                throw new ClassCastException();
            }
            m2505j();
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: g */
    public final void onBindViewHolder(BaseViewHolder holder, int i, List payloads) {
        AbstractC5830k.m5330g(holder, "holder");
        AbstractC5830k.m5330g(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, i);
        } else if (holder.getItemViewType() != -99) {
            super.onBindViewHolder(holder, i, payloads);
        } else {
            if (this.f2645b.get(i) != null) {
                throw new ClassCastException();
            }
            AbstractC5830k.m5330g(null, "item");
        }
    }

    /* renamed from: j */
    public abstract void m2505j();
}
