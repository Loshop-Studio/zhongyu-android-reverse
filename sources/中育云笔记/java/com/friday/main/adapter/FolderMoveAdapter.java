package com.friday.main.adapter;

import android.graphics.Color;
import androidx.compose.runtime.internal.StabilityInferred;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.friday.common.entity.FileEntity;
import com.friday.main.R$drawable;
import com.friday.main.R$id;
import com.friday.main.R$layout;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class FolderMoveAdapter extends BaseQuickAdapter<FileEntity, BaseViewHolder> {

    /* renamed from: a */
    public FileEntity f9137a;

    public FolderMoveAdapter() {
        super(R$layout.res_item_folder, null, 2, null);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder holder, FileEntity item) {
        AbstractC9979u.m20294g(holder, "holder");
        AbstractC9979u.m20294g(item, "item");
        holder.setImageResource(R$id.ivFolder, m6915j(item));
        holder.setText(R$id.tvFolderName, item.getFileName());
        holder.setTextColor(R$id.tvFolderName, Color.parseColor((item.getCached() || item.isFolder()) ? "#323233" : "#C8C9CC"));
        holder.setText(R$id.tvUpdateTime, item.getUpdateTime());
        holder.itemView.setSelected(AbstractC9979u.m20289b(item, this.f9137a));
    }

    /* renamed from: j */
    public final int m6915j(FileEntity fileEntity) {
        String fileType = fileEntity.getFileType();
        return AbstractC9979u.m20289b(fileType, "0") ? R$drawable.res_icon_item_folder : AbstractC9979u.m20289b(fileType, "1") ? fileEntity.getCached() ? R$drawable.res_file_type_note : R$drawable.res_file_type_note_gray : fileEntity.getCached() ? R$drawable.res_file_type_new_note : R$drawable.res_file_type_new_note_gray;
    }

    /* renamed from: k */
    public final FileEntity m6916k() {
        return this.f9137a;
    }

    /* renamed from: l */
    public final void m6917l(FileEntity fileEntity) {
        this.f9137a = fileEntity;
    }
}
