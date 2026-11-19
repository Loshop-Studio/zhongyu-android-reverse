package com.zykj.http.bean;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(m7879d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m7880d2 = {"Lcom/zykj/http/bean/ErrorInfo;", "", "message", "", "details", "code", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getMessage", "()Ljava/lang/String;", "getDetails", "getCode", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "http_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ErrorInfo {
    private final int code;
    private final String details;
    private final String message;

    public ErrorInfo(String str, String str2, int i6) {
        this.message = str;
        this.details = str2;
        this.code = i6;
    }

    public static /* synthetic */ ErrorInfo copy$default(ErrorInfo errorInfo, String str, String str2, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = errorInfo.message;
        }
        if ((i7 & 2) != 0) {
            str2 = errorInfo.details;
        }
        if ((i7 & 4) != 0) {
            i6 = errorInfo.code;
        }
        return errorInfo.copy(str, str2, i6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDetails() {
        return this.details;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    public final ErrorInfo copy(String message, String details, int code) {
        return new ErrorInfo(message, details, code);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorInfo)) {
            return false;
        }
        ErrorInfo errorInfo = (ErrorInfo) other;
        return Intrinsics.areEqual(this.message, errorInfo.message) && Intrinsics.areEqual(this.details, errorInfo.details) && this.code == errorInfo.code;
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

    public /* synthetic */ ErrorInfo(String str, String str2, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i7 & 4) != 0 ? 0 : i6);
    }
}
