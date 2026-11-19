package com.friday.main.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.DiffUtil;
import com.friday.common.entity.FileEntity;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class FileDiffCallback extends DiffUtil.ItemCallback<FileEntity> {
    public static final int $stable = 8;

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public boolean areContentsTheSame(FileEntity oldItem, FileEntity newItem) {
        AbstractC9979u.m20294g(oldItem, "oldItem");
        AbstractC9979u.m20294g(newItem, "newItem");
        return AbstractC9979u.m20289b(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public boolean areItemsTheSame(FileEntity oldItem, FileEntity newItem) {
        AbstractC9979u.m20294g(oldItem, "oldItem");
        AbstractC9979u.m20294g(newItem, "newItem");
        return AbstractC9979u.m20289b(oldItem.getFileId(), newItem.getFileId());
    }
}
