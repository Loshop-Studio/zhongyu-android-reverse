package com.zykj.blackboard.bean;

import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class CommonSourceResult {
    private final String sourceFileName;
    private final int sourceId;

    public CommonSourceResult(String sourceFileName, int i10) {
        AbstractC9133u.m16133g(sourceFileName, "sourceFileName");
        this.sourceFileName = sourceFileName;
        this.sourceId = i10;
    }

    public static /* synthetic */ CommonSourceResult copy$default(CommonSourceResult commonSourceResult, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = commonSourceResult.sourceFileName;
        }
        if ((i11 & 2) != 0) {
            i10 = commonSourceResult.sourceId;
        }
        return commonSourceResult.copy(str, i10);
    }

    public final String component1() {
        return this.sourceFileName;
    }

    public final int component2() {
        return this.sourceId;
    }

    public final CommonSourceResult copy(String sourceFileName, int i10) {
        AbstractC9133u.m16133g(sourceFileName, "sourceFileName");
        return new CommonSourceResult(sourceFileName, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonSourceResult)) {
            return false;
        }
        CommonSourceResult commonSourceResult = (CommonSourceResult) obj;
        return AbstractC9133u.m16128b(this.sourceFileName, commonSourceResult.sourceFileName) && this.sourceId == commonSourceResult.sourceId;
    }

    public final String getSourceFileName() {
        return this.sourceFileName;
    }

    public final int getSourceId() {
        return this.sourceId;
    }

    public int hashCode() {
        return (this.sourceFileName.hashCode() * 31) + Integer.hashCode(this.sourceId);
    }

    public String toString() {
        return "CommonSourceResult(sourceFileName=" + this.sourceFileName + ", sourceId=" + this.sourceId + ')';
    }
}
