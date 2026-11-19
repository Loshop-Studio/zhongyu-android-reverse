package com.friday.main.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class VersionUpdate {
    public static final int $stable = 8;
    private final boolean __abp;
    private final Object error;
    private final Result result;
    private final boolean success;
    private final Object targetUrl;
    private final boolean unAuthorizedRequest;

    public VersionUpdate(boolean z10, Object error, Result result, boolean z11, Object targetUrl, boolean z12) {
        AbstractC9979u.m20294g(error, "error");
        AbstractC9979u.m20294g(result, "result");
        AbstractC9979u.m20294g(targetUrl, "targetUrl");
        this.__abp = z10;
        this.error = error;
        this.result = result;
        this.success = z11;
        this.targetUrl = targetUrl;
        this.unAuthorizedRequest = z12;
    }

    public static /* synthetic */ VersionUpdate copy$default(VersionUpdate versionUpdate, boolean z10, Object obj, Result result, boolean z11, Object obj2, boolean z12, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            z10 = versionUpdate.__abp;
        }
        if ((i10 & 2) != 0) {
            obj = versionUpdate.error;
        }
        if ((i10 & 4) != 0) {
            result = versionUpdate.result;
        }
        if ((i10 & 8) != 0) {
            z11 = versionUpdate.success;
        }
        if ((i10 & 16) != 0) {
            obj2 = versionUpdate.targetUrl;
        }
        if ((i10 & 32) != 0) {
            z12 = versionUpdate.unAuthorizedRequest;
        }
        Object obj4 = obj2;
        boolean z13 = z12;
        return versionUpdate.copy(z10, obj, result, z11, obj4, z13);
    }

    public final boolean component1() {
        return this.__abp;
    }

    public final Object component2() {
        return this.error;
    }

    public final Result component3() {
        return this.result;
    }

    public final boolean component4() {
        return this.success;
    }

    public final Object component5() {
        return this.targetUrl;
    }

    public final boolean component6() {
        return this.unAuthorizedRequest;
    }

    public final VersionUpdate copy(boolean z10, Object error, Result result, boolean z11, Object targetUrl, boolean z12) {
        AbstractC9979u.m20294g(error, "error");
        AbstractC9979u.m20294g(result, "result");
        AbstractC9979u.m20294g(targetUrl, "targetUrl");
        return new VersionUpdate(z10, error, result, z11, targetUrl, z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VersionUpdate)) {
            return false;
        }
        VersionUpdate versionUpdate = (VersionUpdate) obj;
        return this.__abp == versionUpdate.__abp && AbstractC9979u.m20289b(this.error, versionUpdate.error) && AbstractC9979u.m20289b(this.result, versionUpdate.result) && this.success == versionUpdate.success && AbstractC9979u.m20289b(this.targetUrl, versionUpdate.targetUrl) && this.unAuthorizedRequest == versionUpdate.unAuthorizedRequest;
    }

    public final Object getError() {
        return this.error;
    }

    public final Result getResult() {
        return this.result;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final Object getTargetUrl() {
        return this.targetUrl;
    }

    public final boolean getUnAuthorizedRequest() {
        return this.unAuthorizedRequest;
    }

    public final boolean get__abp() {
        return this.__abp;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.__abp) * 31) + this.error.hashCode()) * 31) + this.result.hashCode()) * 31) + Boolean.hashCode(this.success)) * 31) + this.targetUrl.hashCode()) * 31) + Boolean.hashCode(this.unAuthorizedRequest);
    }

    public String toString() {
        return "VersionUpdate(__abp=" + this.__abp + ", error=" + this.error + ", result=" + this.result + ", success=" + this.success + ", targetUrl=" + this.targetUrl + ", unAuthorizedRequest=" + this.unAuthorizedRequest + ")";
    }
}
