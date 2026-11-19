package com.friday.paint.adapter;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.utils.Consts;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.friday.common.entity.OptionEntity;
import com.friday.common.entity.OptionListEntity;
import com.friday.common.helper.GridSpacingItemDecoration;
import com.friday.paint.R$dimen;
import com.friday.paint.R$id;
import com.friday.paint.R$layout;
import com.friday.paint.adapter.OptionsListAdapter;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9979u;
import p268o1.InterfaceC10427d;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class OptionsListAdapter extends BaseQuickAdapter<OptionListEntity, BaseViewHolder> {

    /* renamed from: a */
    public final int f9760a;

    /* renamed from: b */
    public final boolean f9761b;

    /* renamed from: c */
    public boolean f9762c;

    public OptionsListAdapter(int i10, int i11, boolean z10) {
        super(i10, null, 2, null);
        this.f9760a = i11;
        this.f9761b = z10;
    }

    /* renamed from: k */
    public static final void m7303k(OptionsListAdapter optionsListAdapter, OptionsAdapter optionsAdapter, BaseQuickAdapter baseQuickAdapter, View view, int i10) {
        AbstractC9979u.m20294g(baseQuickAdapter, "<unused var>");
        AbstractC9979u.m20294g(view, "<unused var>");
        if (optionsListAdapter.f9762c) {
            return;
        }
        OptionEntity item = optionsAdapter.getItem(i10);
        if (optionsListAdapter.f9761b) {
            Iterator<T> it = optionsAdapter.getData().iterator();
            while (it.hasNext()) {
                ((OptionEntity) it.next()).setSelected(false);
            }
            item.setSelected(true);
        } else {
            item.setSelected(!item.isSelected());
        }
        optionsAdapter.notifyDataSetChanged();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder holder, OptionListEntity item) {
        AbstractC9979u.m20294g(holder, "holder");
        AbstractC9979u.m20294g(item, "item");
        holder.setText(R$id.tv_qst_num, item.getIndex() + Consts.DOT);
        RecyclerView recyclerView = (RecyclerView) holder.getView(R$id.rv_option);
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), this.f9760a > 5 ? 4 : 5));
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new GridSpacingItemDecoration(this.f9760a > 5 ? 4 : 5, (int) recyclerView.getContext().getResources().getDimension(R$dimen.view_2), true, false, 8, null));
        }
        final OptionsAdapter optionsAdapter = this.f9760a > 5 ? new OptionsAdapter(R$layout.item_option_less_than_five) : new OptionsAdapter(R$layout.item_option_more_than_four);
        recyclerView.setAdapter(optionsAdapter);
        optionsAdapter.setOnItemClickListener(new InterfaceC10427d() { // from class: y3.a
            @Override // p268o1.InterfaceC10427d
            /* renamed from: a */
            public final void mo2825a(BaseQuickAdapter baseQuickAdapter, View view, int i10) {
                OptionsListAdapter.m7303k(this.f28221a, optionsAdapter, baseQuickAdapter, view, i10);
            }
        });
        optionsAdapter.setList(item.getList());
    }

    /* renamed from: l */
    public final void m7305l(boolean z10) {
        this.f9762c = z10;
    }
}
