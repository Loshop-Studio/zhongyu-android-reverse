package com.zykj.evaluation.version;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Keep
@Metadata(m13557d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m13558d2 = {"Lcom/zykj/evaluation/version/VersionResp;", "", "result", "Lcom/zykj/evaluation/version/VersionResult;", "success", "", "error", "Lcom/zykj/evaluation/version/ErrorInfo;", "<init>", "(Lcom/zykj/evaluation/version/VersionResult;ZLcom/zykj/evaluation/version/ErrorInfo;)V", "getResult", "()Lcom/zykj/evaluation/version/VersionResult;", "getSuccess", "()Z", "getError", "()Lcom/zykj/evaluation/version/ErrorInfo;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class VersionResp {
    public static final int $stable = 0;
    private final ErrorInfo error;
    private final VersionResult result;
    private final boolean success;

    public VersionResp(VersionResult versionResult, boolean z9, ErrorInfo errorInfo) {
        this.result = versionResult;
        this.success = z9;
        this.error = errorInfo;
    }

    public static /* synthetic */ VersionResp copy$default(VersionResp versionResp, VersionResult versionResult, boolean z9, ErrorInfo errorInfo, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            versionResult = versionResp.result;
        }
        if ((i10 & 2) != 0) {
            z9 = versionResp.success;
        }
        if ((i10 & 4) != 0) {
            errorInfo = versionResp.error;
        }
        return versionResp.copy(versionResult, z9, errorInfo);
    }

    /* renamed from: component1, reason: from getter */
    public final VersionResult getResult() {
        return this.result;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* renamed from: component3, reason: from getter */
    public final ErrorInfo getError() {
        return this.error;
    }

    public final VersionResp copy(VersionResult result, boolean success, ErrorInfo error) {
        return new VersionResp(result, success, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VersionResp)) {
            return false;
        }
        VersionResp versionResp = (VersionResp) other;
        return Intrinsics.areEqual(this.result, versionResp.result) && this.success == versionResp.success && Intrinsics.areEqual(this.error, versionResp.error);
    }

    public final ErrorInfo getError() {
        return this.error;
    }

    public final VersionResult getResult() {
        return this.result;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        VersionResult versionResult = this.result;
        int iHashCode = (((versionResult == null ? 0 : versionResult.hashCode()) * 31) + Boolean.hashCode(this.success)) * 31;
        ErrorInfo errorInfo = this.error;
        return iHashCode + (errorInfo != null ? errorInfo.hashCode() : 0);
    }

    public String toString() {
        return "VersionResp(result=" + this.result + ", success=" + this.success + ", error=" + this.error + ")";
    }
}
