package com.friday.common.base;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
@Keep
/* loaded from: classes3.dex */
public final class BaseCameraResponse {
    public static final int $stable = 8;
    private final boolean __abp;
    private final ErrorMessage error;
    private final Object result;
    private final boolean success;
    private final String targetUrl;
    private final boolean unAuthorizedRequest;

    public BaseCameraResponse(Object result, String str, boolean z10, ErrorMessage error, boolean z11, boolean z12) {
        AbstractC9979u.m20294g(result, "result");
        AbstractC9979u.m20294g(error, "error");
        this.result = result;
        this.targetUrl = str;
        this.success = z10;
        this.error = error;
        this.unAuthorizedRequest = z11;
        this.__abp = z12;
    }

    public static /* synthetic */ BaseCameraResponse copy$default(BaseCameraResponse baseCameraResponse, Object obj, String str, boolean z10, ErrorMessage errorMessage, boolean z11, boolean z12, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = baseCameraResponse.result;
        }
        if ((i10 & 2) != 0) {
            str = baseCameraResponse.targetUrl;
        }
        if ((i10 & 4) != 0) {
            z10 = baseCameraResponse.success;
        }
        if ((i10 & 8) != 0) {
            errorMessage = baseCameraResponse.error;
        }
        if ((i10 & 16) != 0) {
            z11 = baseCameraResponse.unAuthorizedRequest;
        }
        if ((i10 & 32) != 0) {
            z12 = baseCameraResponse.__abp;
        }
        boolean z13 = z11;
        boolean z14 = z12;
        return baseCameraResponse.copy(obj, str, z10, errorMessage, z13, z14);
    }

    public final Object component1() {
        return this.result;
    }

    public final String component2() {
        return this.targetUrl;
    }

    public final boolean component3() {
        return this.success;
    }

    public final ErrorMessage component4() {
        return this.error;
    }

    public final boolean component5() {
        return this.unAuthorizedRequest;
    }

    public final boolean component6() {
        return this.__abp;
    }

    public final BaseCameraResponse copy(Object result, String str, boolean z10, ErrorMessage error, boolean z11, boolean z12) {
        AbstractC9979u.m20294g(result, "result");
        AbstractC9979u.m20294g(error, "error");
        return new BaseCameraResponse(result, str, z10, error, z11, z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseCameraResponse)) {
            return false;
        }
        BaseCameraResponse baseCameraResponse = (BaseCameraResponse) obj;
        return AbstractC9979u.m20289b(this.result, baseCameraResponse.result) && AbstractC9979u.m20289b(this.targetUrl, baseCameraResponse.targetUrl) && this.success == baseCameraResponse.success && AbstractC9979u.m20289b(this.error, baseCameraResponse.error) && this.unAuthorizedRequest == baseCameraResponse.unAuthorizedRequest && this.__abp == baseCameraResponse.__abp;
    }

    public final ErrorMessage getError() {
        return this.error;
    }

    public final Object getResult() {
        return this.result;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final String getTargetUrl() {
        return this.targetUrl;
    }

    public final boolean getUnAuthorizedRequest() {
        return this.unAuthorizedRequest;
    }

    public final boolean get__abp() {
        return this.__abp;
    }

    public int hashCode() {
        int iHashCode = this.result.hashCode() * 31;
        String str = this.targetUrl;
        return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.success)) * 31) + this.error.hashCode()) * 31) + Boolean.hashCode(this.unAuthorizedRequest)) * 31) + Boolean.hashCode(this.__abp);
    }

    public String toString() {
        return "BaseCameraResponse(result=" + this.result + ", targetUrl=" + this.targetUrl + ", success=" + this.success + ", error=" + this.error + ", unAuthorizedRequest=" + this.unAuthorizedRequest + ", __abp=" + this.__abp + ")";
    }

    public /* synthetic */ BaseCameraResponse(Object obj, String str, boolean z10, ErrorMessage errorMessage, boolean z11, boolean z12, int i10, AbstractC9972n abstractC9972n) {
        this(obj, (i10 & 2) != 0 ? null : str, z10, errorMessage, z11, z12);
    }
}
