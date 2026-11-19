package com.friday.main.adapter;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.friday.common.entity.FileEntity;
import com.friday.main.R$color;
import com.friday.main.R$id;
import com.friday.main.R$layout;
import com.friday.main.R$mipmap;
import kotlin.jvm.internal.AbstractC9979u;
import p429z1.AbstractC11958b;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class PathNameAdapter extends BaseQuickAdapter<FileEntity, BaseViewHolder> {
    public PathNameAdapter() {
        super(R$layout.item_path_name, null, 2, null);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder holder, FileEntity item) {
        AbstractC9979u.m20294g(holder, "holder");
        AbstractC9979u.m20294g(item, "item");
        int itemPosition = getItemPosition(item);
        ((ImageView) holder.getView(R$id.folder)).setImageResource(getItemCount() + (-1) == itemPosition ? R$mipmap.icon_folder_notopen : R$mipmap.icon_folder_open);
        ((TextView) holder.getView(R$id.mTvPathName)).setTextColor(AbstractC11958b.m26580a(getItemCount() + (-1) != itemPosition ? R$color.date_time : R$color.colorAccent));
        ((TextView) holder.getView(R$id.mTvPathName)).setText(item.getFileName());
    }
}
