package com.zykj.http.bean;

import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.umeng.analytics.pro.C3380c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(m5174d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000e\u0010\u0012\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\fJ4\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m5175d2 = {"Lcom/zykj/http/bean/ApiResp;", ExifInterface.GPS_DIRECTION_TRUE, "", "success", "", C3380c.f1962O, "Lcom/zykj/http/bean/ErrorInfo;", "result", "(ZLcom/zykj/http/bean/ErrorInfo;Ljava/lang/Object;)V", "getError", "()Lcom/zykj/http/bean/ErrorInfo;", "getResult", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getSuccess", "()Z", "component1", "component2", "component3", "copy", "(ZLcom/zykj/http/bean/ErrorInfo;Ljava/lang/Object;)Lcom/zykj/http/bean/ApiResp;", "equals", "other", "hashCode", "", "toString", "", "http_release"}, m5176k = 1, m5177mv = {1, 5, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class ApiResp<T> {
    private final ErrorInfo error;
    private final T result;
    private final boolean success;

    public ApiResp(boolean z3, ErrorInfo errorInfo, T t3) {
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

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* renamed from: component2, reason: from getter */
    public final ErrorInfo getError() {
        return this.error;
    }

    public final T component3() {
        return this.result;
    }

    public final ApiResp<T> copy(boolean success, ErrorInfo error, T result) {
        return new ApiResp<>(success, error, result);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiResp)) {
            return false;
        }
        ApiResp apiResp = (ApiResp) other;
        return this.success == apiResp.success && Intrinsics.areEqual(this.error, apiResp.error) && Intrinsics.areEqual(this.result, apiResp.result);
    }

    public final ErrorInfo getError() {
        return this.error;
    }

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

    public String toString() {
        return "ApiResp(success=" + this.success + ", error=" + this.error + ", result=" + this.result + ')';
    }

    public /* synthetic */ ApiResp(boolean z3, ErrorInfo errorInfo, Object obj, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z3, (i4 & 2) != 0 ? new ErrorInfo(null, null, 0, 7, null) : errorInfo, obj);
    }
}
