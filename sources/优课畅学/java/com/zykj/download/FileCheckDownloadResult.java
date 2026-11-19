package com.zykj.download;

import androidx.annotation.Keep;
import com.zykj.download.data.DownloadEntity;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@Keep
/* loaded from: classes4.dex */
public final class FileCheckDownloadResult {
    private final DownloadEntity downloadEntity;
    private final FileCheckResultType resultType;

    public FileCheckDownloadResult(FileCheckResultType resultType, DownloadEntity downloadEntity) {
        AbstractC9133u.m16133g(resultType, "resultType");
        this.resultType = resultType;
        this.downloadEntity = downloadEntity;
    }

    public static /* synthetic */ FileCheckDownloadResult copy$default(FileCheckDownloadResult fileCheckDownloadResult, FileCheckResultType fileCheckResultType, DownloadEntity downloadEntity, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fileCheckResultType = fileCheckDownloadResult.resultType;
        }
        if ((i10 & 2) != 0) {
            downloadEntity = fileCheckDownloadResult.downloadEntity;
        }
        return fileCheckDownloadResult.copy(fileCheckResultType, downloadEntity);
    }

    public final FileCheckResultType component1() {
        return this.resultType;
    }

    public final DownloadEntity component2() {
        return this.downloadEntity;
    }

    public final FileCheckDownloadResult copy(FileCheckResultType resultType, DownloadEntity downloadEntity) {
        AbstractC9133u.m16133g(resultType, "resultType");
        return new FileCheckDownloadResult(resultType, downloadEntity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileCheckDownloadResult)) {
            return false;
        }
        FileCheckDownloadResult fileCheckDownloadResult = (FileCheckDownloadResult) obj;
        return this.resultType == fileCheckDownloadResult.resultType && AbstractC9133u.m16128b(this.downloadEntity, fileCheckDownloadResult.downloadEntity);
    }

    public final DownloadEntity getDownloadEntity() {
        return this.downloadEntity;
    }

    public final FileCheckResultType getResultType() {
        return this.resultType;
    }

    public int hashCode() {
        int iHashCode = this.resultType.hashCode() * 31;
        DownloadEntity downloadEntity = this.downloadEntity;
        return iHashCode + (downloadEntity == null ? 0 : downloadEntity.hashCode());
    }

    public String toString() {
        return "FileCheckDownloadResult(resultType=" + this.resultType + ", downloadEntity=" + this.downloadEntity + ')';
    }

    public /* synthetic */ FileCheckDownloadResult(FileCheckResultType fileCheckResultType, DownloadEntity downloadEntity, int i10, AbstractC9126n abstractC9126n) {
        this(fileCheckResultType, (i10 & 2) != 0 ? null : downloadEntity);
    }
}
