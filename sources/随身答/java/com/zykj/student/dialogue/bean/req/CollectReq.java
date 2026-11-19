package com.zykj.student.dialogue.bean.req;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m13412d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0013"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/req/CollectReq;", "", "sessionId", "", "isCollect", "", "<init>", "(Ljava/lang/String;Z)V", "getSessionId", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final /* data */ class CollectReq {
    public static final int $stable = 0;
    private final boolean isCollect;
    private final String sessionId;

    public CollectReq(String sessionId, boolean z9) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.sessionId = sessionId;
        this.isCollect = z9;
    }

    public static /* synthetic */ CollectReq copy$default(CollectReq collectReq, String str, boolean z9, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = collectReq.sessionId;
        }
        if ((i9 & 2) != 0) {
            z9 = collectReq.isCollect;
        }
        return collectReq.copy(str, z9);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsCollect() {
        return this.isCollect;
    }

    public final CollectReq copy(String sessionId, boolean isCollect) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        return new CollectReq(sessionId, isCollect);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollectReq)) {
            return false;
        }
        CollectReq collectReq = (CollectReq) other;
        return Intrinsics.areEqual(this.sessionId, collectReq.sessionId) && this.isCollect == collectReq.isCollect;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return (this.sessionId.hashCode() * 31) + Boolean.hashCode(this.isCollect);
    }

    public final boolean isCollect() {
        return this.isCollect;
    }

    public String toString() {
        return "CollectReq(sessionId=" + this.sessionId + ", isCollect=" + this.isCollect + ")";
    }
}
