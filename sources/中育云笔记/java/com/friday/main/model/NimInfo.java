package com.friday.main.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class NimInfo {
    public static final int $stable = 0;
    private final String nimId;
    private final String nimRoomName;
    private final String nimToken;
    private final String userId;

    public NimInfo(String nimId, String nimToken, String userId, String nimRoomName) {
        AbstractC9979u.m20294g(nimId, "nimId");
        AbstractC9979u.m20294g(nimToken, "nimToken");
        AbstractC9979u.m20294g(userId, "userId");
        AbstractC9979u.m20294g(nimRoomName, "nimRoomName");
        this.nimId = nimId;
        this.nimToken = nimToken;
        this.userId = userId;
        this.nimRoomName = nimRoomName;
    }

    public static /* synthetic */ NimInfo copy$default(NimInfo nimInfo, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = nimInfo.nimId;
        }
        if ((i10 & 2) != 0) {
            str2 = nimInfo.nimToken;
        }
        if ((i10 & 4) != 0) {
            str3 = nimInfo.userId;
        }
        if ((i10 & 8) != 0) {
            str4 = nimInfo.nimRoomName;
        }
        return nimInfo.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.nimId;
    }

    public final String component2() {
        return this.nimToken;
    }

    public final String component3() {
        return this.userId;
    }

    public final String component4() {
        return this.nimRoomName;
    }

    public final NimInfo copy(String nimId, String nimToken, String userId, String nimRoomName) {
        AbstractC9979u.m20294g(nimId, "nimId");
        AbstractC9979u.m20294g(nimToken, "nimToken");
        AbstractC9979u.m20294g(userId, "userId");
        AbstractC9979u.m20294g(nimRoomName, "nimRoomName");
        return new NimInfo(nimId, nimToken, userId, nimRoomName);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NimInfo)) {
            return false;
        }
        NimInfo nimInfo = (NimInfo) obj;
        return AbstractC9979u.m20289b(this.nimId, nimInfo.nimId) && AbstractC9979u.m20289b(this.nimToken, nimInfo.nimToken) && AbstractC9979u.m20289b(this.userId, nimInfo.userId) && AbstractC9979u.m20289b(this.nimRoomName, nimInfo.nimRoomName);
    }

    public final String getNimId() {
        return this.nimId;
    }

    public final String getNimRoomName() {
        return this.nimRoomName;
    }

    public final String getNimToken() {
        return this.nimToken;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((this.nimId.hashCode() * 31) + this.nimToken.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.nimRoomName.hashCode();
    }

    public String toString() {
        return "NimInfo(nimId=" + this.nimId + ", nimToken=" + this.nimToken + ", userId=" + this.userId + ", nimRoomName=" + this.nimRoomName + ")";
    }
}
