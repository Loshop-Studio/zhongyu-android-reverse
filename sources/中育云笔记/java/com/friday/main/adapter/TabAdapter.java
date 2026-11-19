package com.friday.main.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blankj.utilcode.util.ClickUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.friday.main.R$color;
import com.friday.main.R$id;
import com.friday.main.R$layout;
import com.friday.main.adapter.TabAdapter;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p331s3.C11053a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class TabAdapter extends BaseQuickAdapter<C11053a, BaseViewHolder> {

    /* renamed from: a */
    public Integer f9149a;

    /* renamed from: b */
    public InterfaceC9544p f9150b;

    /* JADX WARN: Multi-variable type inference failed */
    public TabAdapter() {
        super(R$layout.item_tab, null, 2, null == true ? 1 : 0);
        this.f9149a = 0;
    }

    /* renamed from: k */
    public static final void m6934k(TabAdapter tabAdapter, int i10, View view) {
        tabAdapter.m6937l(i10, true);
    }

    /* renamed from: n */
    public static /* synthetic */ void m6935n(TabAdapter tabAdapter, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = true;
        }
        tabAdapter.m6938m(i10, z10);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder holder, C11053a item) {
        AbstractC9979u.m20294g(holder, "holder");
        AbstractC9979u.m20294g(item, "item");
        final int itemPosition = getItemPosition(item);
        ImageView imageView = (ImageView) holder.getView(R$id.iv_icon);
        Integer num = this.f9149a;
        int iM24510c = (num == null || num == null || num.intValue() != itemPosition) ? item.m24510c() : item.m24511d();
        imageView.setImageResource(iM24510c);
        if (item.m24508a() && itemPosition == 3) {
            holder.getView(R$id.view_connect).setVisibility(0);
        } else {
            holder.getView(R$id.view_connect).setVisibility(8);
        }
        ((TextView) holder.getView(R$id.tv_label)).setText(item.m24509b());
        Integer num2 = this.f9149a;
        if (num2 != null && num2.intValue() == itemPosition) {
            ((TextView) holder.getView(R$id.tv_label)).setTextColor(imageView.getResources().getColor(R$color.colorPrimary));
        } else {
            ((TextView) holder.getView(R$id.tv_label)).setTextColor(imageView.getResources().getColor(R$color.date_time));
        }
        ClickUtils.applySingleDebouncing(holder.itemView, 500L, new View.OnClickListener() { // from class: s3.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TabAdapter.m6934k(this.f26686c, itemPosition, view);
            }
        });
    }

    /* renamed from: l */
    public final void m6937l(int i10, boolean z10) {
        this.f9149a = Integer.valueOf(i10);
        InterfaceC9544p interfaceC9544p = this.f9150b;
        if (interfaceC9544p != null) {
            interfaceC9544p.invoke(Integer.valueOf(i10), Boolean.valueOf(z10));
        }
        notifyDataSetChanged();
    }

    /* renamed from: m */
    public final void m6938m(int i10, boolean z10) {
        m6937l(i10, z10);
    }

    /* renamed from: o */
    public final void m6939o(InterfaceC9544p onTabSelectListener) {
        AbstractC9979u.m20294g(onTabSelectListener, "onTabSelectListener");
        this.f9150b = onTabSelectListener;
    }

    /* renamed from: p */
    public final void m6940p() {
        this.f9149a = null;
        notifyDataSetChanged();
    }
}
