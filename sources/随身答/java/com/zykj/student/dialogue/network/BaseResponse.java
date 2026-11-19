package com.zykj.student.dialogue.network;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.google.gson.annotations.SerializedName;
import com.zykj.lib.error.code.ErrorCodeInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Keep
@Metadata(m13412d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u000fJ6\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u0004\u0018\u00018\u00008\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m13413d2 = {"Lcom/zykj/student/dialogue/network/BaseResponse;", ExifInterface.GPS_DIRECTION_TRUE, "", "success", "", "error", "Lcom/zykj/lib/error/code/ErrorCodeInfo;", "result", "<init>", "(ZLcom/zykj/lib/error/code/ErrorCodeInfo;Ljava/lang/Object;)V", "getSuccess", "()Z", "getError", "()Lcom/zykj/lib/error/code/ErrorCodeInfo;", "getResult", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "component3", "copy", "(ZLcom/zykj/lib/error/code/ErrorCodeInfo;Ljava/lang/Object;)Lcom/zykj/student/dialogue/network/BaseResponse;", "equals", "other", "hashCode", "", "toString", "", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final /* data */ class BaseResponse<T> {
    public static final int $stable = 8;

    @SerializedName("error")
    private final ErrorCodeInfo error;

    @SerializedName("result")
    private final T result;

    @SerializedName("success")
    private final boolean success;

    public BaseResponse(boolean z9, ErrorCodeInfo errorCodeInfo, T t9) {
        this.success = z9;
        this.error = errorCodeInfo;
        this.result = t9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BaseResponse copy$default(BaseResponse baseResponse, boolean z9, ErrorCodeInfo errorCodeInfo, Object obj, int i9, Object obj2) {
        if ((i9 & 1) != 0) {
            z9 = baseResponse.success;
        }
        if ((i9 & 2) != 0) {
            errorCodeInfo = baseResponse.error;
        }
        if ((i9 & 4) != 0) {
            obj = baseResponse.result;
        }
        return baseResponse.copy(z9, errorCodeInfo, obj);
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

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        ErrorCodeInfo errorCodeInfo = this.error;
        int iHashCode2 = (iHashCode + (errorCodeInfo == null ? 0 : errorCodeInfo.hashCode())) * 31;
        T t9 = this.result;
        return iHashCode2 + (t9 != null ? t9.hashCode() : 0);
    }

    public String toString() {
        return "BaseResponse(success=" + this.success + ", error=" + this.error + ", result=" + this.result + ")";
    }
}
