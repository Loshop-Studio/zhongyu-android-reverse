package com.friday.common.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class FileDownloadEntity {
    public static final int $stable = 0;
    private final String fileName;
    private final boolean isSuccess;

    public FileDownloadEntity(String str, boolean z10) {
        this.fileName = str;
        this.isSuccess = z10;
    }

    public static /* synthetic */ FileDownloadEntity copy$default(FileDownloadEntity fileDownloadEntity, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = fileDownloadEntity.fileName;
        }
        if ((i10 & 2) != 0) {
            z10 = fileDownloadEntity.isSuccess;
        }
        return fileDownloadEntity.copy(str, z10);
    }

    public final String component1() {
        return this.fileName;
    }

    public final boolean component2() {
        return this.isSuccess;
    }

    public final FileDownloadEntity copy(String str, boolean z10) {
        return new FileDownloadEntity(str, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileDownloadEntity)) {
            return false;
        }
        FileDownloadEntity fileDownloadEntity = (FileDownloadEntity) obj;
        return AbstractC9979u.m20289b(this.fileName, fileDownloadEntity.fileName) && this.isSuccess == fileDownloadEntity.isSuccess;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public int hashCode() {
        String str = this.fileName;
        return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.isSuccess);
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    public String toString() {
        return "FileDownloadEntity(fileName=" + this.fileName + ", isSuccess=" + this.isSuccess + ")";
    }
}
