package com.zykj.download;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p162v1.C3419b;

@Keep
/* loaded from: classes.dex */
public final class FileCheckDownloadResult {

    @Nullable
    private final C3419b downloadEntity;

    @NotNull
    private final FileCheckResultType resultType;

    public FileCheckDownloadResult(@NotNull FileCheckResultType resultType, @Nullable C3419b c3419b) {
        C2769l.m9241e(resultType, "resultType");
        this.resultType = resultType;
        this.downloadEntity = c3419b;
    }

    public static /* synthetic */ FileCheckDownloadResult copy$default(FileCheckDownloadResult fileCheckDownloadResult, FileCheckResultType fileCheckResultType, C3419b c3419b, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            fileCheckResultType = fileCheckDownloadResult.resultType;
        }
        if ((i4 & 2) != 0) {
            c3419b = fileCheckDownloadResult.downloadEntity;
        }
        return fileCheckDownloadResult.copy(fileCheckResultType, c3419b);
    }

    @NotNull
    public final FileCheckResultType component1() {
        return this.resultType;
    }

    @Nullable
    public final C3419b component2() {
        return this.downloadEntity;
    }

    @NotNull
    public final FileCheckDownloadResult copy(@NotNull FileCheckResultType resultType, @Nullable C3419b c3419b) {
        C2769l.m9241e(resultType, "resultType");
        return new FileCheckDownloadResult(resultType, c3419b);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileCheckDownloadResult)) {
            return false;
        }
        FileCheckDownloadResult fileCheckDownloadResult = (FileCheckDownloadResult) obj;
        return this.resultType == fileCheckDownloadResult.resultType && C2769l.m9237a(this.downloadEntity, fileCheckDownloadResult.downloadEntity);
    }

    @Nullable
    public final C3419b getDownloadEntity() {
        return this.downloadEntity;
    }

    @NotNull
    public final FileCheckResultType getResultType() {
        return this.resultType;
    }

    public int hashCode() {
        int iHashCode = this.resultType.hashCode() * 31;
        C3419b c3419b = this.downloadEntity;
        return iHashCode + (c3419b == null ? 0 : c3419b.hashCode());
    }

    @NotNull
    public String toString() {
        return "FileCheckDownloadResult(resultType=" + this.resultType + ", downloadEntity=" + this.downloadEntity + ')';
    }

    public /* synthetic */ FileCheckDownloadResult(FileCheckResultType fileCheckResultType, C3419b c3419b, int i4, C2764g c2764g) {
        this(fileCheckResultType, (i4 & 2) != 0 ? null : c3419b);
    }
}
