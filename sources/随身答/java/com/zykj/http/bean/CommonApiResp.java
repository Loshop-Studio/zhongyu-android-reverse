package com.zykj.http.bean;

import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(m13412d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u000eJ6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0007\u001a\u0004\u0018\u00018\u00008\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m13413d2 = {"Lcom/zykj/http/bean/CommonApiResp;", ExifInterface.GPS_DIRECTION_TRUE, "", "code", "", "message", "", "result", "(ILjava/lang/String;Ljava/lang/Object;)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "getResult", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "component3", "copy", "(ILjava/lang/String;Ljava/lang/Object;)Lcom/zykj/http/bean/CommonApiResp;", "equals", "", "other", "hashCode", "toString", "http_release"}, m13414k = 1, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final /* data */ class CommonApiResp<T> {
    private final int code;

    @SerializedName(alternate = {NotificationCompat.CATEGORY_MESSAGE}, value = "message")
    private final String message;

    @SerializedName(alternate = {"result"}, value = "data")
    private final T result;

    public CommonApiResp(int i9, String str, T t9) {
        this.code = i9;
        this.message = str;
        this.result = t9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommonApiResp copy$default(CommonApiResp commonApiResp, int i9, String str, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            i9 = commonApiResp.code;
        }
        if ((i10 & 2) != 0) {
            str = commonApiResp.message;
        }
        if ((i10 & 4) != 0) {
            obj = commonApiResp.result;
        }
        return commonApiResp.copy(i9, str, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final T component3() {
        return this.result;
    }

    public final CommonApiResp<T> copy(int code, String message, T result) {
        return new CommonApiResp<>(code, message, result);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonApiResp)) {
            return false;
        }
        CommonApiResp commonApiResp = (CommonApiResp) other;
        return this.code == commonApiResp.code && Intrinsics.areEqual(this.message, commonApiResp.message) && Intrinsics.areEqual(this.result, commonApiResp.result);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final T getResult() {
        return this.result;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.code) * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        T t9 = this.result;
        return iHashCode2 + (t9 != null ? t9.hashCode() : 0);
    }

    public String toString() {
        return "CommonApiResp(code=" + this.code + ", message=" + ((Object) this.message) + ", result=" + this.result + ')';
    }

    public /* synthetic */ CommonApiResp(int i9, String str, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0 : i9, str, obj);
    }
}
