package com.friday.document.adapter;

import android.graphics.Color;
import androidx.compose.runtime.internal.StabilityInferred;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.friday.common.entity.FileEntity;
import com.friday.document.R$id;
import com.friday.document.R$layout;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class SyncFailedAdapter extends BaseQuickAdapter<FileEntity, BaseViewHolder> {
    public SyncFailedAdapter() {
        super(R$layout.item_sync_file_for_teacher, null, 2, null);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder holder, FileEntity item) {
        AbstractC9979u.m20294g(holder, "holder");
        AbstractC9979u.m20294g(item, "item");
        holder.setText(R$id.tv_filename, item.getFileName()).setText(R$id.tv_modify_time, item.getUpdateTime());
        holder.setText(R$id.tv_status, "同步失败,请联系实施人员");
        holder.setTextColor(R$id.tv_status, Color.parseColor("#FF6B57"));
    }
}
