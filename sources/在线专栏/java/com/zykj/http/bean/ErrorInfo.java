package com.zykj.http.bean;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
/* loaded from: classes.dex */
public final class ErrorInfo {
    private final int code;

    @Nullable
    private final String details;

    @Nullable
    private final String message;

    public ErrorInfo(@Nullable String str, @Nullable String str2, int i4) {
        this.message = str;
        this.details = str2;
        this.code = i4;
    }

    public static /* synthetic */ ErrorInfo copy$default(ErrorInfo errorInfo, String str, String str2, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = errorInfo.message;
        }
        if ((i5 & 2) != 0) {
            str2 = errorInfo.details;
        }
        if ((i5 & 4) != 0) {
            i4 = errorInfo.code;
        }
        return errorInfo.copy(str, str2, i4);
    }

    @Nullable
    public final String component1() {
        return this.message;
    }

    @Nullable
    public final String component2() {
        return this.details;
    }

    public final int component3() {
        return this.code;
    }

    @NotNull
    public final ErrorInfo copy(@Nullable String str, @Nullable String str2, int i4) {
        return new ErrorInfo(str, str2, i4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorInfo)) {
            return false;
        }
        ErrorInfo errorInfo = (ErrorInfo) obj;
        return C2769l.m9237a(this.message, errorInfo.message) && C2769l.m9237a(this.details, errorInfo.details) && this.code == errorInfo.code;
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final String getDetails() {
        return this.details;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String str = this.message;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.details;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.code;
    }

    @NotNull
    public String toString() {
        return "ErrorInfo(message=" + ((Object) this.message) + ", details=" + ((Object) this.details) + ", code=" + this.code + ')';
    }

    public /* synthetic */ ErrorInfo(String str, String str2, int i4, int i5, C2764g c2764g) {
        this((i5 & 1) != 0 ? null : str, (i5 & 2) != 0 ? null : str2, i4);
    }
}
