package com.zykj.study.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class AttachmentInput {
    public static final int $stable = 0;
    private final String code;
    private final int codeType;
    private final String extra;

    public AttachmentInput(String code, int i10, String extra) {
        AbstractC9133u.m16133g(code, "code");
        AbstractC9133u.m16133g(extra, "extra");
        this.code = code;
        this.codeType = i10;
        this.extra = extra;
    }

    public static /* synthetic */ AttachmentInput copy$default(AttachmentInput attachmentInput, String str, int i10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = attachmentInput.code;
        }
        if ((i11 & 2) != 0) {
            i10 = attachmentInput.codeType;
        }
        if ((i11 & 4) != 0) {
            str2 = attachmentInput.extra;
        }
        return attachmentInput.copy(str, i10, str2);
    }

    public final String component1() {
        return this.code;
    }

    public final int component2() {
        return this.codeType;
    }

    public final String component3() {
        return this.extra;
    }

    public final AttachmentInput copy(String code, int i10, String extra) {
        AbstractC9133u.m16133g(code, "code");
        AbstractC9133u.m16133g(extra, "extra");
        return new AttachmentInput(code, i10, extra);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachmentInput)) {
            return false;
        }
        AttachmentInput attachmentInput = (AttachmentInput) obj;
        return AbstractC9133u.m16128b(this.code, attachmentInput.code) && this.codeType == attachmentInput.codeType && AbstractC9133u.m16128b(this.extra, attachmentInput.extra);
    }

    public final String getCode() {
        return this.code;
    }

    public final int getCodeType() {
        return this.codeType;
    }

    public final String getExtra() {
        return this.extra;
    }

    public int hashCode() {
        return (((this.code.hashCode() * 31) + Integer.hashCode(this.codeType)) * 31) + this.extra.hashCode();
    }

    public String toString() {
        return "AttachmentInput(code=" + this.code + ", codeType=" + this.codeType + ", extra=" + this.extra + ")";
    }

    public /* synthetic */ AttachmentInput(String str, int i10, String str2, int i11, AbstractC9126n abstractC9126n) {
        this(str, (i11 & 2) != 0 ? 1 : i10, str2);
    }
}
