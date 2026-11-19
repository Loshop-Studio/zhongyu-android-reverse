package com.zykj.study.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class ScanResult {
    public static final int $stable = 0;
    private final String code;
    private final int codeType;

    public ScanResult(String code, int i10) {
        AbstractC9133u.m16133g(code, "code");
        this.code = code;
        this.codeType = i10;
    }

    public static /* synthetic */ ScanResult copy$default(ScanResult scanResult, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = scanResult.code;
        }
        if ((i11 & 2) != 0) {
            i10 = scanResult.codeType;
        }
        return scanResult.copy(str, i10);
    }

    public final String component1() {
        return this.code;
    }

    public final int component2() {
        return this.codeType;
    }

    public final ScanResult copy(String code, int i10) {
        AbstractC9133u.m16133g(code, "code");
        return new ScanResult(code, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScanResult)) {
            return false;
        }
        ScanResult scanResult = (ScanResult) obj;
        return AbstractC9133u.m16128b(this.code, scanResult.code) && this.codeType == scanResult.codeType;
    }

    public final String getCode() {
        return this.code;
    }

    public final int getCodeType() {
        return this.codeType;
    }

    public int hashCode() {
        return (this.code.hashCode() * 31) + Integer.hashCode(this.codeType);
    }

    public String toString() {
        return "ScanResult(code=" + this.code + ", codeType=" + this.codeType + ")";
    }

    public /* synthetic */ ScanResult(String str, int i10, int i11, AbstractC9126n abstractC9126n) {
        this(str, (i11 & 2) != 0 ? 1 : i10);
    }
}
