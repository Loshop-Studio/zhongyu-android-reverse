package com.zykj.lib.error.code;

import androidx.annotation.Keep;
import androidx.annotation.StringRes;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@Keep
/* loaded from: classes6.dex */
public final class ErrorCodeInfo {
    private final int code;
    private final String desc;
    private final String message;
    private final Integer messageResId;

    public ErrorCodeInfo(int i10, String desc, @StringRes Integer num, String str) {
        AbstractC9979u.m20294g(desc, "desc");
        this.code = i10;
        this.desc = desc;
        this.messageResId = num;
        this.message = str;
    }

    public static /* synthetic */ ErrorCodeInfo copy$default(ErrorCodeInfo errorCodeInfo, int i10, String str, Integer num, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = errorCodeInfo.code;
        }
        if ((i11 & 2) != 0) {
            str = errorCodeInfo.desc;
        }
        if ((i11 & 4) != 0) {
            num = errorCodeInfo.messageResId;
        }
        if ((i11 & 8) != 0) {
            str2 = errorCodeInfo.message;
        }
        return errorCodeInfo.copy(i10, str, num, str2);
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.desc;
    }

    public final Integer component3() {
        return this.messageResId;
    }

    public final String component4() {
        return this.message;
    }

    public final ErrorCodeInfo copy(int i10, String desc, @StringRes Integer num, String str) {
        AbstractC9979u.m20294g(desc, "desc");
        return new ErrorCodeInfo(i10, desc, num, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorCodeInfo)) {
            return false;
        }
        ErrorCodeInfo errorCodeInfo = (ErrorCodeInfo) obj;
        return this.code == errorCodeInfo.code && AbstractC9979u.m20289b(this.desc, errorCodeInfo.desc) && AbstractC9979u.m20289b(this.messageResId, errorCodeInfo.messageResId) && AbstractC9979u.m20289b(this.message, errorCodeInfo.message);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Integer getMessageResId() {
        return this.messageResId;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.code) * 31) + this.desc.hashCode()) * 31;
        Integer num = this.messageResId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.message;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ErrorCodeInfo(code=" + this.code + ", desc=" + this.desc + ", messageResId=" + this.messageResId + ", message=" + ((Object) this.message) + ')';
    }

    public /* synthetic */ ErrorCodeInfo(int i10, String str, Integer num, String str2, int i11, AbstractC9972n abstractC9972n) {
        this(i10, str, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? null : str2);
    }
}
