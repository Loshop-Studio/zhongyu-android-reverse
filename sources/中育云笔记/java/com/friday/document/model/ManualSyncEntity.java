package com.friday.document.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.friday.common.entity.FileEntity;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class ManualSyncEntity {
    public static final int $stable = 8;
    private final FileEntity fileEntity;
    private int syncState;

    public ManualSyncEntity(FileEntity fileEntity, int i10) {
        AbstractC9979u.m20294g(fileEntity, "fileEntity");
        this.fileEntity = fileEntity;
        this.syncState = i10;
    }

    public static /* synthetic */ ManualSyncEntity copy$default(ManualSyncEntity manualSyncEntity, FileEntity fileEntity, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            fileEntity = manualSyncEntity.fileEntity;
        }
        if ((i11 & 2) != 0) {
            i10 = manualSyncEntity.syncState;
        }
        return manualSyncEntity.copy(fileEntity, i10);
    }

    public final FileEntity component1() {
        return this.fileEntity;
    }

    public final int component2() {
        return this.syncState;
    }

    public final ManualSyncEntity copy(FileEntity fileEntity, int i10) {
        AbstractC9979u.m20294g(fileEntity, "fileEntity");
        return new ManualSyncEntity(fileEntity, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ManualSyncEntity)) {
            return false;
        }
        ManualSyncEntity manualSyncEntity = (ManualSyncEntity) obj;
        return AbstractC9979u.m20289b(this.fileEntity, manualSyncEntity.fileEntity) && this.syncState == manualSyncEntity.syncState;
    }

    public final FileEntity getFileEntity() {
        return this.fileEntity;
    }

    public final int getSyncState() {
        return this.syncState;
    }

    public int hashCode() {
        return (this.fileEntity.hashCode() * 31) + Integer.hashCode(this.syncState);
    }

    public final void setSyncState(int i10) {
        this.syncState = i10;
    }

    public String toString() {
        return "ManualSyncEntity(fileEntity=" + this.fileEntity + ", syncState=" + this.syncState + ")";
    }

    public /* synthetic */ ManualSyncEntity(FileEntity fileEntity, int i10, int i11, AbstractC9972n abstractC9972n) {
        this(fileEntity, (i11 & 2) != 0 ? 0 : i10);
    }
}
