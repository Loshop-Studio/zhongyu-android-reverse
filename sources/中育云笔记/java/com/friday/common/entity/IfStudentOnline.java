package com.friday.common.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class IfStudentOnline {
    public static final int $stable = 0;
    private final String userId;
    private final String uuid;

    public IfStudentOnline(String uuid, String userId) {
        AbstractC9979u.m20294g(uuid, "uuid");
        AbstractC9979u.m20294g(userId, "userId");
        this.uuid = uuid;
        this.userId = userId;
    }

    public static /* synthetic */ IfStudentOnline copy$default(IfStudentOnline ifStudentOnline, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = ifStudentOnline.uuid;
        }
        if ((i10 & 2) != 0) {
            str2 = ifStudentOnline.userId;
        }
        return ifStudentOnline.copy(str, str2);
    }

    public final String component1() {
        return this.uuid;
    }

    public final String component2() {
        return this.userId;
    }

    public final IfStudentOnline copy(String uuid, String userId) {
        AbstractC9979u.m20294g(uuid, "uuid");
        AbstractC9979u.m20294g(userId, "userId");
        return new IfStudentOnline(uuid, userId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IfStudentOnline)) {
            return false;
        }
        IfStudentOnline ifStudentOnline = (IfStudentOnline) obj;
        return AbstractC9979u.m20289b(this.uuid, ifStudentOnline.uuid) && AbstractC9979u.m20289b(this.userId, ifStudentOnline.userId);
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return (this.uuid.hashCode() * 31) + this.userId.hashCode();
    }

    public String toString() {
        return "IfStudentOnline(uuid=" + this.uuid + ", userId=" + this.userId + ")";
    }
}
