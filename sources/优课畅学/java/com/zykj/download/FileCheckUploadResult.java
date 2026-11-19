package com.zykj.download;

import androidx.annotation.Keep;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@Keep
/* loaded from: classes4.dex */
public final class FileCheckUploadResult {
    private final String localPath;
    private final Long progress;
    private final UploadResultType resultType;
    private final String serverUrl;
    private final String url;
    private final String verifyCode;

    public FileCheckUploadResult(UploadResultType resultType, String str, String str2, String str3, Long l10, String str4) {
        AbstractC9133u.m16133g(resultType, "resultType");
        this.resultType = resultType;
        this.serverUrl = str;
        this.url = str2;
        this.localPath = str3;
        this.progress = l10;
        this.verifyCode = str4;
    }

    public static /* synthetic */ FileCheckUploadResult copy$default(FileCheckUploadResult fileCheckUploadResult, UploadResultType uploadResultType, String str, String str2, String str3, Long l10, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            uploadResultType = fileCheckUploadResult.resultType;
        }
        if ((i10 & 2) != 0) {
            str = fileCheckUploadResult.serverUrl;
        }
        if ((i10 & 4) != 0) {
            str2 = fileCheckUploadResult.url;
        }
        if ((i10 & 8) != 0) {
            str3 = fileCheckUploadResult.localPath;
        }
        if ((i10 & 16) != 0) {
            l10 = fileCheckUploadResult.progress;
        }
        if ((i10 & 32) != 0) {
            str4 = fileCheckUploadResult.verifyCode;
        }
        Long l11 = l10;
        String str5 = str4;
        return fileCheckUploadResult.copy(uploadResultType, str, str2, str3, l11, str5);
    }

    public final UploadResultType component1() {
        return this.resultType;
    }

    public final String component2() {
        return this.serverUrl;
    }

    public final String component3() {
        return this.url;
    }

    public final String component4() {
        return this.localPath;
    }

    public final Long component5() {
        return this.progress;
    }

    public final String component6() {
        return this.verifyCode;
    }

    public final FileCheckUploadResult copy(UploadResultType resultType, String str, String str2, String str3, Long l10, String str4) {
        AbstractC9133u.m16133g(resultType, "resultType");
        return new FileCheckUploadResult(resultType, str, str2, str3, l10, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileCheckUploadResult)) {
            return false;
        }
        FileCheckUploadResult fileCheckUploadResult = (FileCheckUploadResult) obj;
        return this.resultType == fileCheckUploadResult.resultType && AbstractC9133u.m16128b(this.serverUrl, fileCheckUploadResult.serverUrl) && AbstractC9133u.m16128b(this.url, fileCheckUploadResult.url) && AbstractC9133u.m16128b(this.localPath, fileCheckUploadResult.localPath) && AbstractC9133u.m16128b(this.progress, fileCheckUploadResult.progress) && AbstractC9133u.m16128b(this.verifyCode, fileCheckUploadResult.verifyCode);
    }

    public final String getLocalPath() {
        return this.localPath;
    }

    public final Long getProgress() {
        return this.progress;
    }

    public final UploadResultType getResultType() {
        return this.resultType;
    }

    public final String getServerUrl() {
        return this.serverUrl;
    }

    public final String getUrl() {
        return this.url;
    }

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
        Long l10 = this.progress;
        int iHashCode5 = (iHashCode4 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str4 = this.verifyCode;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "FileCheckUploadResult(resultType=" + this.resultType + ", serverUrl=" + ((Object) this.serverUrl) + ", url=" + ((Object) this.url) + ", localPath=" + ((Object) this.localPath) + ", progress=" + this.progress + ", verifyCode=" + ((Object) this.verifyCode) + ')';
    }

    public /* synthetic */ FileCheckUploadResult(UploadResultType uploadResultType, String str, String str2, String str3, Long l10, String str4, int i10, AbstractC9126n abstractC9126n) {
        this(uploadResultType, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : l10, (i10 & 32) != 0 ? null : str4);
    }
}
