package com.friday.document.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.DiffUtil;
import com.friday.document.adapter.MultiModeFileEntity;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class FileDiffCallback extends DiffUtil.ItemCallback<MultiModeFileEntity> {
    public static final int $stable = 8;

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public boolean areContentsTheSame(MultiModeFileEntity oldItem, MultiModeFileEntity newItem) {
        AbstractC9979u.m20294g(oldItem, "oldItem");
        AbstractC9979u.m20294g(newItem, "newItem");
        return AbstractC9979u.m20289b(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public boolean areItemsTheSame(MultiModeFileEntity oldItem, MultiModeFileEntity newItem) {
        AbstractC9979u.m20294g(oldItem, "oldItem");
        AbstractC9979u.m20294g(newItem, "newItem");
        return AbstractC9979u.m20289b(oldItem.getEntity().getFileId(), newItem.getEntity().getFileId()) && oldItem.getEntity().getSyncStatus() == newItem.getEntity().getSyncStatus();
    }
}
