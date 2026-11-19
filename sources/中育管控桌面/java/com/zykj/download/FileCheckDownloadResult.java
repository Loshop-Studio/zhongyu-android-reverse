package com.zykj.download;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p018b3.C4414b;

@Keep
@Metadata(m7879d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, m7880d2 = {"Lcom/zykj/download/FileCheckDownloadResult;", "", "Lcom/zykj/download/FileCheckResultType;", "resultType", "Lb3/b;", "downloadEntity", "<init>", "(Lcom/zykj/download/FileCheckResultType;Lb3/b;)V", "component1", "()Lcom/zykj/download/FileCheckResultType;", "component2", "()Lb3/b;", "copy", "(Lcom/zykj/download/FileCheckResultType;Lb3/b;)Lcom/zykj/download/FileCheckDownloadResult;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/zykj/download/FileCheckResultType;", "getResultType", "Lb3/b;", "getDownloadEntity", "download_release"}, m7881k = 1, m7882mv = {1, 5, 1}, m7884xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FileCheckDownloadResult {
    private final C4414b downloadEntity;
    private final FileCheckResultType resultType;

    public FileCheckDownloadResult(FileCheckResultType resultType, C4414b c4414b) {
        Intrinsics.checkNotNullParameter(resultType, "resultType");
        this.resultType = resultType;
        this.downloadEntity = c4414b;
    }

    public static /* synthetic */ FileCheckDownloadResult copy$default(FileCheckDownloadResult fileCheckDownloadResult, FileCheckResultType fileCheckResultType, C4414b c4414b, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            fileCheckResultType = fileCheckDownloadResult.resultType;
        }
        if ((i6 & 2) != 0) {
            c4414b = fileCheckDownloadResult.downloadEntity;
        }
        return fileCheckDownloadResult.copy(fileCheckResultType, c4414b);
    }

    /* renamed from: component1, reason: from getter */
    public final FileCheckResultType getResultType() {
        return this.resultType;
    }

    /* renamed from: component2, reason: from getter */
    public final C4414b getDownloadEntity() {
        return this.downloadEntity;
    }

    public final FileCheckDownloadResult copy(FileCheckResultType resultType, C4414b downloadEntity) {
        Intrinsics.checkNotNullParameter(resultType, "resultType");
        return new FileCheckDownloadResult(resultType, downloadEntity);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileCheckDownloadResult)) {
            return false;
        }
        FileCheckDownloadResult fileCheckDownloadResult = (FileCheckDownloadResult) other;
        return this.resultType == fileCheckDownloadResult.resultType && Intrinsics.areEqual(this.downloadEntity, fileCheckDownloadResult.downloadEntity);
    }

    public final C4414b getDownloadEntity() {
        return this.downloadEntity;
    }

    public final FileCheckResultType getResultType() {
        return this.resultType;
    }

    public int hashCode() {
        int iHashCode = this.resultType.hashCode() * 31;
        C4414b c4414b = this.downloadEntity;
        return iHashCode + (c4414b == null ? 0 : c4414b.hashCode());
    }

    public String toString() {
        return "FileCheckDownloadResult(resultType=" + this.resultType + ", downloadEntity=" + this.downloadEntity + ')';
    }

    public /* synthetic */ FileCheckDownloadResult(FileCheckResultType fileCheckResultType, C4414b c4414b, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(fileCheckResultType, (i6 & 2) != 0 ? null : c4414b);
    }
}
