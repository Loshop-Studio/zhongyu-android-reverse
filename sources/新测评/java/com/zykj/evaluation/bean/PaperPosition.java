package com.zykj.evaluation.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m13558d2 = {"Lcom/zykj/evaluation/bean/PaperPosition;", "", "start", "Lcom/zykj/evaluation/bean/PaperPoint;", "end", "<init>", "(Lcom/zykj/evaluation/bean/PaperPoint;Lcom/zykj/evaluation/bean/PaperPoint;)V", "getStart", "()Lcom/zykj/evaluation/bean/PaperPoint;", "getEnd", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaperPosition {
    public static final int $stable = 0;

    @SerializedName("End")
    private final PaperPoint end;

    @SerializedName("Start")
    private final PaperPoint start;

    public PaperPosition(PaperPoint start, PaperPoint end) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        this.start = start;
        this.end = end;
    }

    public static /* synthetic */ PaperPosition copy$default(PaperPosition paperPosition, PaperPoint paperPoint, PaperPoint paperPoint2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            paperPoint = paperPosition.start;
        }
        if ((i10 & 2) != 0) {
            paperPoint2 = paperPosition.end;
        }
        return paperPosition.copy(paperPoint, paperPoint2);
    }

    /* renamed from: component1, reason: from getter */
    public final PaperPoint getStart() {
        return this.start;
    }

    /* renamed from: component2, reason: from getter */
    public final PaperPoint getEnd() {
        return this.end;
    }

    public final PaperPosition copy(PaperPoint start, PaperPoint end) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        return new PaperPosition(start, end);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaperPosition)) {
            return false;
        }
        PaperPosition paperPosition = (PaperPosition) other;
        return Intrinsics.areEqual(this.start, paperPosition.start) && Intrinsics.areEqual(this.end, paperPosition.end);
    }

    public final PaperPoint getEnd() {
        return this.end;
    }

    public final PaperPoint getStart() {
        return this.start;
    }

    public int hashCode() {
        return (this.start.hashCode() * 31) + this.end.hashCode();
    }

    public String toString() {
        return "PaperPosition(start=" + this.start + ", end=" + this.end + ")";
    }
}
