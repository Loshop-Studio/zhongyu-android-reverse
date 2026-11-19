package com.zykj.evaluation.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p167m5.AbstractC8555e;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m13558d2 = {"Lcom/zykj/evaluation/bean/UploadData;", "", "uuid", "", "localPath", "uploadUrl", "commitState", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getUuid", "()Ljava/lang/String;", "getLocalPath", "getUploadUrl", "getCommitState", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UploadData {
    public static final int $stable = 0;
    private final int commitState;
    private final String localPath;
    private final String uploadUrl;
    private final String uuid;

    public UploadData(String uuid, String localPath, String uploadUrl, int i10) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(localPath, "localPath");
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        this.uuid = uuid;
        this.localPath = localPath;
        this.uploadUrl = uploadUrl;
        this.commitState = i10;
    }

    public static /* synthetic */ UploadData copy$default(UploadData uploadData, String str, String str2, String str3, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = uploadData.uuid;
        }
        if ((i11 & 2) != 0) {
            str2 = uploadData.localPath;
        }
        if ((i11 & 4) != 0) {
            str3 = uploadData.uploadUrl;
        }
        if ((i11 & 8) != 0) {
            i10 = uploadData.commitState;
        }
        return uploadData.copy(str, str2, str3, i10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLocalPath() {
        return this.localPath;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUploadUrl() {
        return this.uploadUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCommitState() {
        return this.commitState;
    }

    public final UploadData copy(String uuid, String localPath, String uploadUrl, int commitState) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(localPath, "localPath");
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        return new UploadData(uuid, localPath, uploadUrl, commitState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadData)) {
            return false;
        }
        UploadData uploadData = (UploadData) other;
        return Intrinsics.areEqual(this.uuid, uploadData.uuid) && Intrinsics.areEqual(this.localPath, uploadData.localPath) && Intrinsics.areEqual(this.uploadUrl, uploadData.uploadUrl) && this.commitState == uploadData.commitState;
    }

    public final int getCommitState() {
        return this.commitState;
    }

    public final String getLocalPath() {
        return this.localPath;
    }

    public final String getUploadUrl() {
        return this.uploadUrl;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return (((((this.uuid.hashCode() * 31) + this.localPath.hashCode()) * 31) + this.uploadUrl.hashCode()) * 31) + Integer.hashCode(this.commitState);
    }

    public String toString() {
        return "UploadData(uuid=" + this.uuid + ", localPath=" + this.localPath + ", uploadUrl=" + this.uploadUrl + ", commitState=" + this.commitState + ")";
    }

    public /* synthetic */ UploadData(String str, String str2, String str3, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? AbstractC8555e.d.f14192b.m14097a() : i10);
    }
}
