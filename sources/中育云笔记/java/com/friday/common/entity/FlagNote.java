package com.friday.common.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class FlagNote {
    public static final int $stable = 0;
    private final String userId;

    public FlagNote(String userId) {
        AbstractC9979u.m20294g(userId, "userId");
        this.userId = userId;
    }

    public static /* synthetic */ FlagNote copy$default(FlagNote flagNote, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = flagNote.userId;
        }
        return flagNote.copy(str);
    }

    public final String component1() {
        return this.userId;
    }

    public final FlagNote copy(String userId) {
        AbstractC9979u.m20294g(userId, "userId");
        return new FlagNote(userId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FlagNote) && AbstractC9979u.m20289b(this.userId, ((FlagNote) obj).userId);
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.userId.hashCode();
    }

    public String toString() {
        return "FlagNote(userId=" + this.userId + ")";
    }
}
