package com.zykj.http.bean;

import androidx.annotation.Keep;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@Keep
/* loaded from: classes4.dex */
public final class ErrorInfo {
    private final int code;
    private final String details;
    private final String message;

    public ErrorInfo(String str, String str2, int i10) {
        this.message = str;
        this.details = str2;
        this.code = i10;
    }

    public static /* synthetic */ ErrorInfo copy$default(ErrorInfo errorInfo, String str, String str2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = errorInfo.message;
        }
        if ((i11 & 2) != 0) {
            str2 = errorInfo.details;
        }
        if ((i11 & 4) != 0) {
            i10 = errorInfo.code;
        }
        return errorInfo.copy(str, str2, i10);
    }

    public final String component1() {
        return this.message;
    }

    public final String component2() {
        return this.details;
    }

    public final int component3() {
        return this.code;
    }

    public final ErrorInfo copy(String str, String str2, int i10) {
        return new ErrorInfo(str, str2, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorInfo)) {
            return false;
        }
        ErrorInfo errorInfo = (ErrorInfo) obj;
        return AbstractC9133u.m16128b(this.message, errorInfo.message) && AbstractC9133u.m16128b(this.details, errorInfo.details) && this.code == errorInfo.code;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getDetails() {
        return this.details;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String str = this.message;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.details;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.code);
    }

    public String toString() {
        return "ErrorInfo(message=" + this.message + ", details=" + this.details + ", code=" + this.code + ")";
    }

    public /* synthetic */ ErrorInfo(String str, String str2, int i10, int i11, AbstractC9126n abstractC9126n) {
        this(str, str2, (i11 & 4) != 0 ? 0 : i10);
    }
}
