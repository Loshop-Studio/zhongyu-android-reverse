package com.friday.document.adapter;

import android.graphics.Color;
import androidx.compose.runtime.internal.StabilityInferred;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.friday.document.R$id;
import com.friday.document.R$layout;
import com.friday.document.model.ManualSyncEntity;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class SyncFileAdapter extends BaseQuickAdapter<ManualSyncEntity, BaseViewHolder> {
    public SyncFileAdapter() {
        super(R$layout.item_sync_file, null, 2, null);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder holder, ManualSyncEntity item) {
        AbstractC9979u.m20294g(holder, "holder");
        AbstractC9979u.m20294g(item, "item");
        holder.setText(R$id.tv_filename, item.getFileEntity().getFileName()).setText(R$id.tv_modify_time, item.getFileEntity().getUpdateTime());
        int syncState = item.getSyncState();
        if (syncState == 0) {
            holder.setText(R$id.tv_status, "即将同步");
            holder.setTextColor(R$id.tv_status, Color.parseColor("#494949"));
            return;
        }
        if (syncState == 1) {
            holder.setText(R$id.tv_status, "正在同步");
            holder.setTextColor(R$id.tv_status, Color.parseColor("#4797F3"));
        } else if (syncState == 2) {
            holder.setText(R$id.tv_status, "同步失败,请联系实施人员");
            holder.setTextColor(R$id.tv_status, Color.parseColor("#FF6B57"));
        } else {
            if (syncState != 3) {
                return;
            }
            holder.setText(R$id.tv_status, "同步成功");
            holder.setTextColor(R$id.tv_status, Color.parseColor("#3EDBAA"));
        }
    }
}
