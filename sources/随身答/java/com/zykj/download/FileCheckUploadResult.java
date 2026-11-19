package com.zykj.download;

import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(m13412d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003JT\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\r¨\u0006$"}, m13413d2 = {"Lcom/zykj/download/FileCheckUploadResult;", "", "resultType", "Lcom/zykj/download/UploadResultType;", "serverUrl", "", "url", "localPath", "progress", "", "verifyCode", "(Lcom/zykj/download/UploadResultType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getLocalPath", "()Ljava/lang/String;", "getProgress", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getResultType", "()Lcom/zykj/download/UploadResultType;", "getServerUrl", "getUrl", "getVerifyCode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/zykj/download/UploadResultType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/zykj/download/FileCheckUploadResult;", "equals", "", "other", "hashCode", "", "toString", "download_release"}, m13414k = 1, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final /* data */ class FileCheckUploadResult {
    private final String localPath;
    private final Long progress;
    private final UploadResultType resultType;
    private final String serverUrl;
    private final String url;
    private final String verifyCode;

    public FileCheckUploadResult(UploadResultType resultType, String str, String str2, String str3, Long l9, String str4) {
        Intrinsics.checkNotNullParameter(resultType, "resultType");
        this.resultType = resultType;
        this.serverUrl = str;
        this.url = str2;
        this.localPath = str3;
        this.progress = l9;
        this.verifyCode = str4;
    }

    public static /* synthetic */ FileCheckUploadResult copy$default(FileCheckUploadResult fileCheckUploadResult, UploadResultType uploadResultType, String str, String str2, String str3, Long l9, String str4, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            uploadResultType = fileCheckUploadResult.resultType;
        }
        if ((i9 & 2) != 0) {
            str = fileCheckUploadResult.serverUrl;
        }
        if ((i9 & 4) != 0) {
            str2 = fileCheckUploadResult.url;
        }
        if ((i9 & 8) != 0) {
            str3 = fileCheckUploadResult.localPath;
        }
        if ((i9 & 16) != 0) {
            l9 = fileCheckUploadResult.progress;
        }
        if ((i9 & 32) != 0) {
            str4 = fileCheckUploadResult.verifyCode;
        }
        Long l10 = l9;
        String str5 = str4;
        return fileCheckUploadResult.copy(uploadResultType, str, str2, str3, l10, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final UploadResultType getResultType() {
        return this.resultType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getServerUrl() {
        return this.serverUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLocalPath() {
        return this.localPath;
    }

    /* renamed from: component5, reason: from getter */
    public final Long getProgress() {
        return this.progress;
    }

    /* renamed from: component6, reason: from getter */
    public final String getVerifyCode() {
        return this.verifyCode;
    }

    public final FileCheckUploadResult copy(UploadResultType resultType, String serverUrl, String url, String localPath, Long progress, String verifyCode) {
        Intrinsics.checkNotNullParameter(resultType, "resultType");
        return new FileCheckUploadResult(resultType, serverUrl, url, localPath, progress, verifyCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileCheckUploadResult)) {
            return false;
        }
        FileCheckUploadResult fileCheckUploadResult = (FileCheckUploadResult) other;
        return this.resultType == fileCheckUploadResult.resultType && Intrinsics.areEqual(this.serverUrl, fileCheckUploadResult.serverUrl) && Intrinsics.areEqual(this.url, fileCheckUploadResult.url) && Intrinsics.areEqual(this.localPath, fileCheckUploadResult.localPath) && Intrinsics.areEqual(this.progress, fileCheckUploadResult.progress) && Intrinsics.areEqual(this.verifyCode, fileCheckUploadResult.verifyCode);
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
        Long l9 = this.progress;
        int iHashCode5 = (iHashCode4 + (l9 == null ? 0 : l9.hashCode())) * 31;
        String str4 = this.verifyCode;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "FileCheckUploadResult(resultType=" + this.resultType + ", serverUrl=" + ((Object) this.serverUrl) + ", url=" + ((Object) this.url) + ", localPath=" + ((Object) this.localPath) + ", progress=" + this.progress + ", verifyCode=" + ((Object) this.verifyCode) + ')';
    }

    public /* synthetic */ FileCheckUploadResult(UploadResultType uploadResultType, String str, String str2, String str3, Long l9, String str4, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(uploadResultType, (i9 & 2) != 0 ? null : str, (i9 & 4) != 0 ? null : str2, (i9 & 8) != 0 ? null : str3, (i9 & 16) != 0 ? null : l9, (i9 & 32) != 0 ? null : str4);
    }
}
