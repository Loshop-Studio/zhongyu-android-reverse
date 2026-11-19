package com.friday.lecture.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.friday.lecture.R$id;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CodeAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    public CodeAdapter(int i10) {
        super(i10, null, 2, null);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder holder, String item) {
        AbstractC9979u.m20294g(holder, "holder");
        AbstractC9979u.m20294g(item, "item");
        holder.setText(R$id.tv_code, item);
    }
}
