package com.zykj.http.bean;

import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import com.taobao.accs.common.Constants;
import com.taobao.agoo.p087a.p088a.AbstractC7706b;
import kotlin.jvm.internal.AbstractC9979u;

@Keep
/* loaded from: classes6.dex */
public final class ApiResp<T> {

    @SerializedName(Constants.KEY_HTTP_CODE)
    private final int code;

    @SerializedName("error")
    private final ErrorInfo error;

    @SerializedName(NotificationCompat.CATEGORY_MESSAGE)
    private final String msg;

    @SerializedName(alternate = {"result"}, value = "data")
    private final T result;

    @SerializedName(AbstractC7706b.JSON_SUCCESS)
    private final boolean success;

    public ApiResp(int i10, String msg, boolean z10, ErrorInfo errorInfo, T t10) {
        AbstractC9979u.m20294g(msg, "msg");
        this.code = i10;
        this.msg = msg;
        this.success = z10;
        this.error = errorInfo;
        this.result = t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiResp copy$default(ApiResp apiResp, int i10, String str, boolean z10, ErrorInfo errorInfo, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            i10 = apiResp.code;
        }
        if ((i11 & 2) != 0) {
            str = apiResp.msg;
        }
        if ((i11 & 4) != 0) {
            z10 = apiResp.success;
        }
        if ((i11 & 8) != 0) {
            errorInfo = apiResp.error;
        }
        T t10 = obj;
        if ((i11 & 16) != 0) {
            t10 = apiResp.result;
        }
        T t11 = t10;
        boolean z11 = z10;
        return apiResp.copy(i10, str, z11, errorInfo, t11);
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.msg;
    }

    public final boolean component3() {
        return this.success;
    }

    public final ErrorInfo component4() {
        return this.error;
    }

    public final T component5() {
        return this.result;
    }

    public final ApiResp<T> copy(int i10, String msg, boolean z10, ErrorInfo errorInfo, T t10) {
        AbstractC9979u.m20294g(msg, "msg");
        return new ApiResp<>(i10, msg, z10, errorInfo, t10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiResp)) {
            return false;
        }
        ApiResp apiResp = (ApiResp) obj;
        return this.code == apiResp.code && AbstractC9979u.m20289b(this.msg, apiResp.msg) && this.success == apiResp.success && AbstractC9979u.m20289b(this.error, apiResp.error) && AbstractC9979u.m20289b(this.result, apiResp.result);
    }

    public final int getCode() {
        return this.code;
    }

    public final ErrorInfo getError() {
        return this.error;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final T getResult() {
        return this.result;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.code) * 31) + this.msg.hashCode()) * 31) + Boolean.hashCode(this.success)) * 31;
        ErrorInfo errorInfo = this.error;
        int iHashCode2 = (iHashCode + (errorInfo == null ? 0 : errorInfo.hashCode())) * 31;
        T t10 = this.result;
        return iHashCode2 + (t10 != null ? t10.hashCode() : 0);
    }

    public String toString() {
        return "ApiResp(code=" + this.code + ", msg=" + this.msg + ", success=" + this.success + ", error=" + this.error + ", result=" + this.result + ")";
    }
}
