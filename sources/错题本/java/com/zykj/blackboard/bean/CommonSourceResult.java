package com.zykj.blackboard.bean;

import android.support.v4.media.AbstractC0037f;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m5110d2 = {"Lcom/zykj/blackboard/bean/CommonSourceResult;", "", "sourceFileName", "", "sourceId", "", "(Ljava/lang/String;I)V", "getSourceFileName", "()Ljava/lang/String;", "getSourceId", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class CommonSourceResult {

    @NotNull
    private final String sourceFileName;
    private final int sourceId;

    public CommonSourceResult(@NotNull String sourceFileName, int i) {
        AbstractC5830k.m5330g(sourceFileName, "sourceFileName");
        this.sourceFileName = sourceFileName;
        this.sourceId = i;
    }

    public static /* synthetic */ CommonSourceResult copy$default(CommonSourceResult commonSourceResult, String str, int i, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = commonSourceResult.sourceFileName;
        }
        if ((i8 & 2) != 0) {
            i = commonSourceResult.sourceId;
        }
        return commonSourceResult.copy(str, i);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSourceFileName() {
        return this.sourceFileName;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSourceId() {
        return this.sourceId;
    }

    @NotNull
    public final CommonSourceResult copy(@NotNull String sourceFileName, int sourceId) {
        AbstractC5830k.m5330g(sourceFileName, "sourceFileName");
        return new CommonSourceResult(sourceFileName, sourceId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonSourceResult)) {
            return false;
        }
        CommonSourceResult commonSourceResult = (CommonSourceResult) other;
        return AbstractC5830k.m5325b(this.sourceFileName, commonSourceResult.sourceFileName) && this.sourceId == commonSourceResult.sourceId;
    }

    @NotNull
    public final String getSourceFileName() {
        return this.sourceFileName;
    }

    public final int getSourceId() {
        return this.sourceId;
    }

    public int hashCode() {
        return Integer.hashCode(this.sourceId) + (this.sourceFileName.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("CommonSourceResult(sourceFileName=");
        sb.append(this.sourceFileName);
        sb.append(", sourceId=");
        return AbstractC0037f.m88m(sb, this.sourceId, ')');
    }
}
