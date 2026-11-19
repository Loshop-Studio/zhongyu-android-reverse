package com.friday.common.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class OssTokenResult {
    public static final int $stable = 0;
    private final OssTokenResponse result;
    private final boolean success;

    public OssTokenResult(OssTokenResponse result, boolean z10) {
        AbstractC9979u.m20294g(result, "result");
        this.result = result;
        this.success = z10;
    }

    public static /* synthetic */ OssTokenResult copy$default(OssTokenResult ossTokenResult, OssTokenResponse ossTokenResponse, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            ossTokenResponse = ossTokenResult.result;
        }
        if ((i10 & 2) != 0) {
            z10 = ossTokenResult.success;
        }
        return ossTokenResult.copy(ossTokenResponse, z10);
    }

    public final OssTokenResponse component1() {
        return this.result;
    }

    public final boolean component2() {
        return this.success;
    }

    public final OssTokenResult copy(OssTokenResponse result, boolean z10) {
        AbstractC9979u.m20294g(result, "result");
        return new OssTokenResult(result, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OssTokenResult)) {
            return false;
        }
        OssTokenResult ossTokenResult = (OssTokenResult) obj;
        return AbstractC9979u.m20289b(this.result, ossTokenResult.result) && this.success == ossTokenResult.success;
    }

    public final OssTokenResponse getResult() {
        return this.result;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return (this.result.hashCode() * 31) + Boolean.hashCode(this.success);
    }

    public String toString() {
        return "OssTokenResult(result=" + this.result + ", success=" + this.success + ")";
    }
}
