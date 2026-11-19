package com.zykj.download;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
/* loaded from: classes.dex */
public final class FileCheckUploadResult {

    @Nullable
    private final String localPath;

    @Nullable
    private final Long progress;

    @NotNull
    private final UploadResultType resultType;

    @Nullable
    private final String serverUrl;

    @Nullable
    private final String url;

    @Nullable
    private final String verifyCode;

    public FileCheckUploadResult(@NotNull UploadResultType resultType, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Long l3, @Nullable String str4) {
        C2769l.m9241e(resultType, "resultType");
        this.resultType = resultType;
        this.serverUrl = str;
        this.url = str2;
        this.localPath = str3;
        this.progress = l3;
        this.verifyCode = str4;
    }

    public static /* synthetic */ FileCheckUploadResult copy$default(FileCheckUploadResult fileCheckUploadResult, UploadResultType uploadResultType, String str, String str2, String str3, Long l3, String str4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            uploadResultType = fileCheckUploadResult.resultType;
        }
        if ((i4 & 2) != 0) {
            str = fileCheckUploadResult.serverUrl;
        }
        String str5 = str;
        if ((i4 & 4) != 0) {
            str2 = fileCheckUploadResult.url;
        }
        String str6 = str2;
        if ((i4 & 8) != 0) {
            str3 = fileCheckUploadResult.localPath;
        }
        String str7 = str3;
        if ((i4 & 16) != 0) {
            l3 = fileCheckUploadResult.progress;
        }
        Long l4 = l3;
        if ((i4 & 32) != 0) {
            str4 = fileCheckUploadResult.verifyCode;
        }
        return fileCheckUploadResult.copy(uploadResultType, str5, str6, str7, l4, str4);
    }

    @NotNull
    public final UploadResultType component1() {
        return this.resultType;
    }

    @Nullable
    public final String component2() {
        return this.serverUrl;
    }

    @Nullable
    public final String component3() {
        return this.url;
    }

    @Nullable
    public final String component4() {
        return this.localPath;
    }

    @Nullable
    public final Long component5() {
        return this.progress;
    }

    @Nullable
    public final String component6() {
        return this.verifyCode;
    }

    @NotNull
    public final FileCheckUploadResult copy(@NotNull UploadResultType resultType, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Long l3, @Nullable String str4) {
        C2769l.m9241e(resultType, "resultType");
        return new FileCheckUploadResult(resultType, str, str2, str3, l3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileCheckUploadResult)) {
            return false;
        }
        FileCheckUploadResult fileCheckUploadResult = (FileCheckUploadResult) obj;
        return this.resultType == fileCheckUploadResult.resultType && C2769l.m9237a(this.serverUrl, fileCheckUploadResult.serverUrl) && C2769l.m9237a(this.url, fileCheckUploadResult.url) && C2769l.m9237a(this.localPath, fileCheckUploadResult.localPath) && C2769l.m9237a(this.progress, fileCheckUploadResult.progress) && C2769l.m9237a(this.verifyCode, fileCheckUploadResult.verifyCode);
    }

    @Nullable
    public final String getLocalPath() {
        return this.localPath;
    }

    @Nullable
    public final Long getProgress() {
        return this.progress;
    }

    @NotNull
    public final UploadResultType getResultType() {
        return this.resultType;
    }

    @Nullable
    public final String getServerUrl() {
        return this.serverUrl;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final String getVerifyCode() {
        return this.verifyCode;
    }

    public int hashCode() {
        int iHashCode = this.resultType.hashCode() * 31;
        String str = this.serverUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.url;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.localPath;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l3 = this.progress;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str4 = this.verifyCode;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FileCheckUploadResult(resultType=" + this.resultType + ", serverUrl=" + ((Object) this.serverUrl) + ", url=" + ((Object) this.url) + ", localPath=" + ((Object) this.localPath) + ", progress=" + this.progress + ", verifyCode=" + ((Object) this.verifyCode) + ')';
    }

    public /* synthetic */ FileCheckUploadResult(UploadResultType uploadResultType, String str, String str2, String str3, Long l3, String str4, int i4, C2764g c2764g) {
        this(uploadResultType, (i4 & 2) != 0 ? null : str, (i4 & 4) != 0 ? null : str2, (i4 & 8) != 0 ? null : str3, (i4 & 16) != 0 ? null : l3, (i4 & 32) == 0 ? str4 : null);
    }
}
