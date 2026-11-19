package com.zykj.download;

import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p283w5.C9827b;

@Keep
@Metadata(m13412d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, m13413d2 = {"Lcom/zykj/download/FileCheckDownloadResult;", "", "Lcom/zykj/download/FileCheckResultType;", "resultType", "Lw5/b;", "downloadEntity", "<init>", "(Lcom/zykj/download/FileCheckResultType;Lw5/b;)V", "component1", "()Lcom/zykj/download/FileCheckResultType;", "component2", "()Lw5/b;", "copy", "(Lcom/zykj/download/FileCheckResultType;Lw5/b;)Lcom/zykj/download/FileCheckDownloadResult;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/zykj/download/FileCheckResultType;", "getResultType", "Lw5/b;", "getDownloadEntity", "download_release"}, m13414k = 1, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final /* data */ class FileCheckDownloadResult {
    private final C9827b downloadEntity;
    private final FileCheckResultType resultType;

    public FileCheckDownloadResult(FileCheckResultType resultType, C9827b c9827b) {
        Intrinsics.checkNotNullParameter(resultType, "resultType");
        this.resultType = resultType;
        this.downloadEntity = c9827b;
    }

    public static /* synthetic */ FileCheckDownloadResult copy$default(FileCheckDownloadResult fileCheckDownloadResult, FileCheckResultType fileCheckResultType, C9827b c9827b, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            fileCheckResultType = fileCheckDownloadResult.resultType;
        }
        if ((i9 & 2) != 0) {
            c9827b = fileCheckDownloadResult.downloadEntity;
        }
        return fileCheckDownloadResult.copy(fileCheckResultType, c9827b);
    }

    /* renamed from: component1, reason: from getter */
    public final FileCheckResultType getResultType() {
        return this.resultType;
    }

    /* renamed from: component2, reason: from getter */
    public final C9827b getDownloadEntity() {
        return this.downloadEntity;
    }

    public final FileCheckDownloadResult copy(FileCheckResultType resultType, C9827b downloadEntity) {
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

    public final C9827b getDownloadEntity() {
        return this.downloadEntity;
    }

    public final FileCheckResultType getResultType() {
        return this.resultType;
    }

    public int hashCode() {
        int iHashCode = this.resultType.hashCode() * 31;
        C9827b c9827b = this.downloadEntity;
        return iHashCode + (c9827b == null ? 0 : c9827b.hashCode());
    }

    public String toString() {
        return "FileCheckDownloadResult(resultType=" + this.resultType + ", downloadEntity=" + this.downloadEntity + ')';
    }

    public /* synthetic */ FileCheckDownloadResult(FileCheckResultType fileCheckResultType, C9827b c9827b, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(fileCheckResultType, (i9 & 2) != 0 ? null : c9827b);
    }
}
