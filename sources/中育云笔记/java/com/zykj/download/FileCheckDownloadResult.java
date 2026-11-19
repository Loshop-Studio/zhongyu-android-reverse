package com.zykj.download;

import androidx.annotation.Keep;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p407xa.C11817b;

@Keep
/* loaded from: classes6.dex */
public final class FileCheckDownloadResult {
    private final C11817b downloadEntity;
    private final FileCheckResultType resultType;

    public FileCheckDownloadResult(FileCheckResultType resultType, C11817b c11817b) {
        AbstractC9979u.m20294g(resultType, "resultType");
        this.resultType = resultType;
        this.downloadEntity = c11817b;
    }

    public static /* synthetic */ FileCheckDownloadResult copy$default(FileCheckDownloadResult fileCheckDownloadResult, FileCheckResultType fileCheckResultType, C11817b c11817b, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fileCheckResultType = fileCheckDownloadResult.resultType;
        }
        if ((i10 & 2) != 0) {
            c11817b = fileCheckDownloadResult.downloadEntity;
        }
        return fileCheckDownloadResult.copy(fileCheckResultType, c11817b);
    }

    public final FileCheckResultType component1() {
        return this.resultType;
    }

    public final C11817b component2() {
        return this.downloadEntity;
    }

    public final FileCheckDownloadResult copy(FileCheckResultType resultType, C11817b c11817b) {
        AbstractC9979u.m20294g(resultType, "resultType");
        return new FileCheckDownloadResult(resultType, c11817b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileCheckDownloadResult)) {
            return false;
        }
        FileCheckDownloadResult fileCheckDownloadResult = (FileCheckDownloadResult) obj;
        return this.resultType == fileCheckDownloadResult.resultType && AbstractC9979u.m20289b(this.downloadEntity, fileCheckDownloadResult.downloadEntity);
    }

    public final C11817b getDownloadEntity() {
        return this.downloadEntity;
    }

    public final FileCheckResultType getResultType() {
        return this.resultType;
    }

    public int hashCode() {
        int iHashCode = this.resultType.hashCode() * 31;
        C11817b c11817b = this.downloadEntity;
        return iHashCode + (c11817b == null ? 0 : c11817b.hashCode());
    }

    public String toString() {
        return "FileCheckDownloadResult(resultType=" + this.resultType + ", downloadEntity=" + this.downloadEntity + ')';
    }

    public /* synthetic */ FileCheckDownloadResult(FileCheckResultType fileCheckResultType, C11817b c11817b, int i10, AbstractC9972n abstractC9972n) {
        this(fileCheckResultType, (i10 & 2) != 0 ? null : c11817b);
    }
}
