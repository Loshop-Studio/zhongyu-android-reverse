package com.friday.lecture.model;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class PolicyEntity {
    public static final int $stable = 0;
    private final boolean isCanLive;

    public PolicyEntity(boolean z10) {
        this.isCanLive = z10;
    }

    public static /* synthetic */ PolicyEntity copy$default(PolicyEntity policyEntity, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = policyEntity.isCanLive;
        }
        return policyEntity.copy(z10);
    }

    public final boolean component1() {
        return this.isCanLive;
    }

    public final PolicyEntity copy(boolean z10) {
        return new PolicyEntity(z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PolicyEntity) && this.isCanLive == ((PolicyEntity) obj).isCanLive;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isCanLive);
    }

    public final boolean isCanLive() {
        return this.isCanLive;
    }

    public String toString() {
        return "PolicyEntity(isCanLive=" + this.isCanLive + ")";
    }
}
