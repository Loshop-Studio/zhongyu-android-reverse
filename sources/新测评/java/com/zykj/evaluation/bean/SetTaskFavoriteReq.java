package com.zykj.evaluation.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, m13558d2 = {"Lcom/zykj/evaluation/bean/SetTaskFavoriteReq;", "", "examTaskId", "", "isCollect", "", "<init>", "(JZ)V", "getExamTaskId", "()J", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SetTaskFavoriteReq {
    public static final int $stable = 0;
    private final long examTaskId;
    private final boolean isCollect;

    public SetTaskFavoriteReq(long j10, boolean z9) {
        this.examTaskId = j10;
        this.isCollect = z9;
    }

    public static /* synthetic */ SetTaskFavoriteReq copy$default(SetTaskFavoriteReq setTaskFavoriteReq, long j10, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = setTaskFavoriteReq.examTaskId;
        }
        if ((i10 & 2) != 0) {
            z9 = setTaskFavoriteReq.isCollect;
        }
        return setTaskFavoriteReq.copy(j10, z9);
    }

    /* renamed from: component1, reason: from getter */
    public final long getExamTaskId() {
        return this.examTaskId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsCollect() {
        return this.isCollect;
    }

    public final SetTaskFavoriteReq copy(long examTaskId, boolean isCollect) {
        return new SetTaskFavoriteReq(examTaskId, isCollect);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetTaskFavoriteReq)) {
            return false;
        }
        SetTaskFavoriteReq setTaskFavoriteReq = (SetTaskFavoriteReq) other;
        return this.examTaskId == setTaskFavoriteReq.examTaskId && this.isCollect == setTaskFavoriteReq.isCollect;
    }

    public final long getExamTaskId() {
        return this.examTaskId;
    }

    public int hashCode() {
        return (Long.hashCode(this.examTaskId) * 31) + Boolean.hashCode(this.isCollect);
    }

    public final boolean isCollect() {
        return this.isCollect;
    }

    public String toString() {
        return "SetTaskFavoriteReq(examTaskId=" + this.examTaskId + ", isCollect=" + this.isCollect + ")";
    }
}
