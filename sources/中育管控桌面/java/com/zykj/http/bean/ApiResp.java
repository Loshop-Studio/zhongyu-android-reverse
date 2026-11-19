package com.zykj.http.bean;

import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(m7879d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u0017JJ\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\"\u001a\u00020\u0004HÖ\u0001J\t\u0010#\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u000b\u001a\u0004\u0018\u00018\u00008\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, m7880d2 = {"Lcom/zykj/http/bean/ApiResp;", ExifInterface.GPS_DIRECTION_TRUE, "", "code", "", NotificationCompat.CATEGORY_MESSAGE, "", "success", "", "error", "Lcom/zykj/http/bean/ErrorInfo;", "result", "<init>", "(ILjava/lang/String;ZLcom/zykj/http/bean/ErrorInfo;Ljava/lang/Object;)V", "getCode", "()I", "getMsg", "()Ljava/lang/String;", "getSuccess", "()Z", "getError", "()Lcom/zykj/http/bean/ErrorInfo;", "getResult", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/lang/String;ZLcom/zykj/http/bean/ErrorInfo;Ljava/lang/Object;)Lcom/zykj/http/bean/ApiResp;", "equals", "other", "hashCode", "toString", "http_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ApiResp<T> {

    @SerializedName("code")
    private final int code;

    @SerializedName("error")
    private final ErrorInfo error;

    @SerializedName(NotificationCompat.CATEGORY_MESSAGE)
    private final String msg;

    @SerializedName(alternate = {"result"}, value = "data")
    private final T result;

    @SerializedName("success")
    private final boolean success;

    public ApiResp(int i6, String msg, boolean z6, ErrorInfo errorInfo, T t6) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.code = i6;
        this.msg = msg;
        this.success = z6;
        this.error = errorInfo;
        this.result = t6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiResp copy$default(ApiResp apiResp, int i6, String str, boolean z6, ErrorInfo errorInfo, Object obj, int i7, Object obj2) {
        if ((i7 & 1) != 0) {
            i6 = apiResp.code;
        }
        if ((i7 & 2) != 0) {
            str = apiResp.msg;
        }
        if ((i7 & 4) != 0) {
            z6 = apiResp.success;
        }
        if ((i7 & 8) != 0) {
            errorInfo = apiResp.error;
        }
        T t6 = obj;
        if ((i7 & 16) != 0) {
            t6 = apiResp.result;
        }
        T t7 = t6;
        boolean z7 = z6;
        return apiResp.copy(i6, str, z7, errorInfo, t7);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* renamed from: component4, reason: from getter */
    public final ErrorInfo getError() {
        return this.error;
    }

    public final T component5() {
        return this.result;
    }

    public final ApiResp<T> copy(int code, String msg, boolean success, ErrorInfo error, T result) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return new ApiResp<>(code, msg, success, error, result);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiResp)) {
            return false;
        }
        ApiResp apiResp = (ApiResp) other;
        return this.code == apiResp.code && Intrinsics.areEqual(this.msg, apiResp.msg) && this.success == apiResp.success && Intrinsics.areEqual(this.error, apiResp.error) && Intrinsics.areEqual(this.result, apiResp.result);
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
        T t6 = this.result;
        return iHashCode2 + (t6 != null ? t6.hashCode() : 0);
    }

    public String toString() {
        return "ApiResp(code=" + this.code + ", msg=" + this.msg + ", success=" + this.success + ", error=" + this.error + ", result=" + this.result + ")";
    }
}
