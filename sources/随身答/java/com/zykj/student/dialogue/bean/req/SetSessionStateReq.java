package com.zykj.student.dialogue.bean.req;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m13412d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/req/SetSessionStateReq;", "", "sessionId", "", "state", "", "<init>", "(Ljava/lang/String;I)V", "getSessionId", "()Ljava/lang/String;", "getState", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final /* data */ class SetSessionStateReq {
    public static final int $stable = 0;
    private final String sessionId;
    private final int state;

    public SetSessionStateReq(String sessionId, int i9) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.sessionId = sessionId;
        this.state = i9;
    }

    public static /* synthetic */ SetSessionStateReq copy$default(SetSessionStateReq setSessionStateReq, String str, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = setSessionStateReq.sessionId;
        }
        if ((i10 & 2) != 0) {
            i9 = setSessionStateReq.state;
        }
        return setSessionStateReq.copy(str, i9);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getState() {
        return this.state;
    }

    public final SetSessionStateReq copy(String sessionId, int state) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        return new SetSessionStateReq(sessionId, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetSessionStateReq)) {
            return false;
        }
        SetSessionStateReq setSessionStateReq = (SetSessionStateReq) other;
        return Intrinsics.areEqual(this.sessionId, setSessionStateReq.sessionId) && this.state == setSessionStateReq.state;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getState() {
        return this.state;
    }

    public int hashCode() {
        return (this.sessionId.hashCode() * 31) + Integer.hashCode(this.state);
    }

    public String toString() {
        return "SetSessionStateReq(sessionId=" + this.sessionId + ", state=" + this.state + ")";
    }
}
