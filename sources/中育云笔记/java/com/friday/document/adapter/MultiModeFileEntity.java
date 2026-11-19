package com.friday.document.adapter;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.friday.common.entity.FileEntity;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
@Keep
/* loaded from: classes3.dex */
public final class MultiModeFileEntity {
    public static final int $stable = FileEntity.$stable;
    private final FileEntity entity;
    private final boolean isInMultiSelectMode;
    private final boolean isSelected;

    public MultiModeFileEntity(boolean z10, boolean z11, FileEntity entity) {
        AbstractC9979u.m20294g(entity, "entity");
        this.isInMultiSelectMode = z10;
        this.isSelected = z11;
        this.entity = entity;
    }

    public static /* synthetic */ MultiModeFileEntity copy$default(MultiModeFileEntity multiModeFileEntity, boolean z10, boolean z11, FileEntity fileEntity, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = multiModeFileEntity.isInMultiSelectMode;
        }
        if ((i10 & 2) != 0) {
            z11 = multiModeFileEntity.isSelected;
        }
        if ((i10 & 4) != 0) {
            fileEntity = multiModeFileEntity.entity;
        }
        return multiModeFileEntity.copy(z10, z11, fileEntity);
    }

    public final boolean component1() {
        return this.isInMultiSelectMode;
    }

    public final boolean component2() {
        return this.isSelected;
    }

    public final FileEntity component3() {
        return this.entity;
    }

    public final MultiModeFileEntity copy(boolean z10, boolean z11, FileEntity entity) {
        AbstractC9979u.m20294g(entity, "entity");
        return new MultiModeFileEntity(z10, z11, entity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiModeFileEntity)) {
            return false;
        }
        MultiModeFileEntity multiModeFileEntity = (MultiModeFileEntity) obj;
        return this.isInMultiSelectMode == multiModeFileEntity.isInMultiSelectMode && this.isSelected == multiModeFileEntity.isSelected && AbstractC9979u.m20289b(this.entity, multiModeFileEntity.entity);
    }

    public final FileEntity getEntity() {
        return this.entity;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isInMultiSelectMode) * 31) + Boolean.hashCode(this.isSelected)) * 31) + this.entity.hashCode();
    }

    public final boolean isInMultiSelectMode() {
        return this.isInMultiSelectMode;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public String toString() {
        return "MultiModeFileEntity(isInMultiSelectMode=" + this.isInMultiSelectMode + ", isSelected=" + this.isSelected + ", entity=" + this.entity + ")";
    }

    public /* synthetic */ MultiModeFileEntity(boolean z10, boolean z11, FileEntity fileEntity, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, fileEntity);
    }
}
