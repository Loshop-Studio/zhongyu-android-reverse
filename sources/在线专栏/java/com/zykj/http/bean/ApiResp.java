package com.zykj.http.bean;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
/* loaded from: classes.dex */
public final class ApiResp<T> {

    @Nullable
    private final ErrorInfo error;

    @Nullable
    private final T result;
    private final boolean success;

    public ApiResp(boolean z3, @Nullable ErrorInfo errorInfo, @Nullable T t3) {
        this.success = z3;
        this.error = errorInfo;
        this.result = t3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiResp copy$default(ApiResp apiResp, boolean z3, ErrorInfo errorInfo, Object obj, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            z3 = apiResp.success;
        }
        if ((i4 & 2) != 0) {
            errorInfo = apiResp.error;
        }
        if ((i4 & 4) != 0) {
            obj = apiResp.result;
        }
        return apiResp.copy(z3, errorInfo, obj);
    }

    public final boolean component1() {
        return this.success;
    }

    @Nullable
    public final ErrorInfo component2() {
        return this.error;
    }

    @Nullable
    public final T component3() {
        return this.result;
    }

    @NotNull
    public final ApiResp<T> copy(boolean z3, @Nullable ErrorInfo errorInfo, @Nullable T t3) {
        return new ApiResp<>(z3, errorInfo, t3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiResp)) {
            return false;
        }
        ApiResp apiResp = (ApiResp) obj;
        return this.success == apiResp.success && C2769l.m9237a(this.error, apiResp.error) && C2769l.m9237a(this.result, apiResp.result);
    }

    @Nullable
    public final ErrorInfo getError() {
        return this.error;
    }

    @Nullable
    public final T getResult() {
        return this.result;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z3 = this.success;
        ?? r02 = z3;
        if (z3) {
            r02 = 1;
        }
        int i4 = r02 * 31;
        ErrorInfo errorInfo = this.error;
        int iHashCode = (i4 + (errorInfo == null ? 0 : errorInfo.hashCode())) * 31;
        T t3 = this.result;
        return iHashCode + (t3 != null ? t3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ApiResp(success=" + this.success + ", error=" + this.error + ", result=" + this.result + ')';
    }

    public /* synthetic */ ApiResp(boolean z3, ErrorInfo errorInfo, Object obj, int i4, C2764g c2764g) {
        this((i4 & 1) != 0 ? false : z3, errorInfo, obj);
    }
}
