package com.zykj.insight.network;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.google.gson.annotations.SerializedName;
import com.umeng.analytics.pro.C3380c;
import com.zykj.lib.error.code.ErrorCodeInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Keep
@Metadata(m5174d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\fJ6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0007\u001a\u0004\u0018\u00018\u00008\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m5175d2 = {"Lcom/zykj/insight/network/BaseResponse;", ExifInterface.GPS_DIRECTION_TRUE, "", "success", "", C3380c.f1962O, "Lcom/zykj/lib/error/code/ErrorCodeInfo;", "result", "(ZLcom/zykj/lib/error/code/ErrorCodeInfo;Ljava/lang/Object;)V", "getError", "()Lcom/zykj/lib/error/code/ErrorCodeInfo;", "getResult", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getSuccess", "()Z", "component1", "component2", "component3", "copy", "(ZLcom/zykj/lib/error/code/ErrorCodeInfo;Ljava/lang/Object;)Lcom/zykj/insight/network/BaseResponse;", "equals", "other", "hashCode", "", "toString", "", "app_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class BaseResponse<T> {
    public static final int $stable = 8;

    @SerializedName(C3380c.f1962O)
    private final ErrorCodeInfo error;

    @SerializedName("result")
    private final T result;

    @SerializedName("success")
    private final boolean success;

    public BaseResponse(boolean z3, ErrorCodeInfo errorCodeInfo, T t3) {
        this.success = z3;
        this.error = errorCodeInfo;
        this.result = t3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BaseResponse copy$default(BaseResponse baseResponse, boolean z3, ErrorCodeInfo errorCodeInfo, Object obj, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            z3 = baseResponse.success;
        }
        if ((i4 & 2) != 0) {
            errorCodeInfo = baseResponse.error;
        }
        if ((i4 & 4) != 0) {
            obj = baseResponse.result;
        }
        return baseResponse.copy(z3, errorCodeInfo, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* renamed from: component2, reason: from getter */
    public final ErrorCodeInfo getError() {
        return this.error;
    }

    public final T component3() {
        return this.result;
    }

    public final BaseResponse<T> copy(boolean success, ErrorCodeInfo error, T result) {
        return new BaseResponse<>(success, error, result);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseResponse)) {
            return false;
        }
        BaseResponse baseResponse = (BaseResponse) other;
        return this.success == baseResponse.success && Intrinsics.areEqual(this.error, baseResponse.error) && Intrinsics.areEqual(this.result, baseResponse.result);
    }

    public final ErrorCodeInfo getError() {
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
        ErrorCodeInfo errorCodeInfo = this.error;
        int iHashCode = (i4 + (errorCodeInfo == null ? 0 : errorCodeInfo.hashCode())) * 31;
        T t3 = this.result;
        return iHashCode + (t3 != null ? t3.hashCode() : 0);
    }

    public String toString() {
        return "BaseResponse(success=" + this.success + ", error=" + this.error + ", result=" + this.result + ")";
    }
}
