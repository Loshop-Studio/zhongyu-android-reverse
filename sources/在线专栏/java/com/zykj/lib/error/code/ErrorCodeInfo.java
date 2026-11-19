package com.zykj.lib.error.code;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
/* loaded from: classes.dex */
public final class ErrorCodeInfo {
    private final int code;

    @NotNull
    private final String desc;

    @Nullable
    private final String message;

    @Nullable
    private final Integer messageResId;

    public ErrorCodeInfo(int i4, @NotNull String desc, @Nullable Integer num, @Nullable String str) {
        C2769l.m9241e(desc, "desc");
        this.code = i4;
        this.desc = desc;
        this.messageResId = num;
        this.message = str;
    }

    public /* synthetic */ ErrorCodeInfo(int i4, String str, Integer num, String str2, int i5, C2764g c2764g) {
        this(i4, str, (i5 & 4) != 0 ? null : num, (i5 & 8) != 0 ? null : str2);
    }

    public static /* synthetic */ ErrorCodeInfo copy$default(ErrorCodeInfo errorCodeInfo, int i4, String str, Integer num, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = errorCodeInfo.code;
        }
        if ((i5 & 2) != 0) {
            str = errorCodeInfo.desc;
        }
        if ((i5 & 4) != 0) {
            num = errorCodeInfo.messageResId;
        }
        if ((i5 & 8) != 0) {
            str2 = errorCodeInfo.message;
        }
        return errorCodeInfo.copy(i4, str, num, str2);
    }

    public final int component1() {
        return this.code;
    }

    @NotNull
    public final String component2() {
        return this.desc;
    }

    @Nullable
    public final Integer component3() {
        return this.messageResId;
    }

    @Nullable
    public final String component4() {
        return this.message;
    }

    @NotNull
    public final ErrorCodeInfo copy(int i4, @NotNull String desc, @Nullable Integer num, @Nullable String str) {
        C2769l.m9241e(desc, "desc");
        return new ErrorCodeInfo(i4, desc, num, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorCodeInfo)) {
            return false;
        }
        ErrorCodeInfo errorCodeInfo = (ErrorCodeInfo) obj;
        return this.code == errorCodeInfo.code && C2769l.m9237a(this.desc, errorCodeInfo.desc) && C2769l.m9237a(this.messageResId, errorCodeInfo.messageResId) && C2769l.m9237a(this.message, errorCodeInfo.message);
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final Integer getMessageResId() {
        return this.messageResId;
    }

    public int hashCode() {
        int iHashCode = ((this.code * 31) + this.desc.hashCode()) * 31;
        Integer num = this.messageResId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.message;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ErrorCodeInfo(code=" + this.code + ", desc=" + this.desc + ", messageResId=" + this.messageResId + ", message=" + ((Object) this.message) + ')';
    }
}
