package com.friday.common.util;

import androidx.compose.runtime.internal.StabilityInferred;
import com.jeremyliao.liveeventbus.core.LiveEvent;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class ShowStudentState implements LiveEvent {

    /* renamed from: c */
    public final String f6160c;

    /* renamed from: d */
    public final String f6161d;

    /* renamed from: e */
    public final StudentState f6162e;

    public ShowStudentState(String uuid, String userId, StudentState state) {
        AbstractC9979u.m20294g(uuid, "uuid");
        AbstractC9979u.m20294g(userId, "userId");
        AbstractC9979u.m20294g(state, "state");
        this.f6160c = uuid;
        this.f6161d = userId;
        this.f6162e = state;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowStudentState)) {
            return false;
        }
        ShowStudentState showStudentState = (ShowStudentState) obj;
        return AbstractC9979u.m20289b(this.f6160c, showStudentState.f6160c) && AbstractC9979u.m20289b(this.f6161d, showStudentState.f6161d) && this.f6162e == showStudentState.f6162e;
    }

    public int hashCode() {
        return (((this.f6160c.hashCode() * 31) + this.f6161d.hashCode()) * 31) + this.f6162e.hashCode();
    }

    public String toString() {
        return "ShowStudentState(uuid=" + this.f6160c + ", userId=" + this.f6161d + ", state=" + this.f6162e + ")";
    }
}
