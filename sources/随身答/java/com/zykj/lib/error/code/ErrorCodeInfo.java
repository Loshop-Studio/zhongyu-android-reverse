package com.zykj.lib.error.code;

import androidx.annotation.Keep;
import androidx.annotation.StringRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(m13412d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J:\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m13413d2 = {"Lcom/zykj/lib/error/code/ErrorCodeInfo;", "", "code", "", "desc", "", "messageResId", "message", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getCode", "()I", "getDesc", "()Ljava/lang/String;", "getMessage", "getMessageResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/zykj/lib/error/code/ErrorCodeInfo;", "equals", "", "other", "hashCode", "toString", "code_release"}, m13414k = 1, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final /* data */ class ErrorCodeInfo {
    private final int code;
    private final String desc;
    private final String message;
    private final Integer messageResId;

    public ErrorCodeInfo(int i9, String desc, @StringRes Integer num, String str) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        this.code = i9;
        this.desc = desc;
        this.messageResId = num;
        this.message = str;
    }

    public static /* synthetic */ ErrorCodeInfo copy$default(ErrorCodeInfo errorCodeInfo, int i9, String str, Integer num, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i9 = errorCodeInfo.code;
        }
        if ((i10 & 2) != 0) {
            str = errorCodeInfo.desc;
        }
        if ((i10 & 4) != 0) {
            num = errorCodeInfo.messageResId;
        }
        if ((i10 & 8) != 0) {
            str2 = errorCodeInfo.message;
        }
        return errorCodeInfo.copy(i9, str, num, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getMessageResId() {
        return this.messageResId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final ErrorCodeInfo copy(int code, String desc, @StringRes Integer messageResId, String message) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        return new ErrorCodeInfo(code, desc, messageResId, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorCodeInfo)) {
            return false;
        }
        ErrorCodeInfo errorCodeInfo = (ErrorCodeInfo) other;
        return this.code == errorCodeInfo.code && Intrinsics.areEqual(this.desc, errorCodeInfo.desc) && Intrinsics.areEqual(this.messageResId, errorCodeInfo.messageResId) && Intrinsics.areEqual(this.message, errorCodeInfo.message);
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

    public /* synthetic */ ErrorCodeInfo(int i9, String str, Integer num, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i9, str, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? null : str2);
    }
}
