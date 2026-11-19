package com.zykj.study.bean.teach;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class SuperviseGroupRemoveInput {
    public static final int $stable = 0;
    private final int groupId;
    private final int superviseId;

    public SuperviseGroupRemoveInput(int i10, int i11) {
        this.superviseId = i10;
        this.groupId = i11;
    }

    public static /* synthetic */ SuperviseGroupRemoveInput copy$default(SuperviseGroupRemoveInput superviseGroupRemoveInput, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = superviseGroupRemoveInput.superviseId;
        }
        if ((i12 & 2) != 0) {
            i11 = superviseGroupRemoveInput.groupId;
        }
        return superviseGroupRemoveInput.copy(i10, i11);
    }

    public final int component1() {
        return this.superviseId;
    }

    public final int component2() {
        return this.groupId;
    }

    public final SuperviseGroupRemoveInput copy(int i10, int i11) {
        return new SuperviseGroupRemoveInput(i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperviseGroupRemoveInput)) {
            return false;
        }
        SuperviseGroupRemoveInput superviseGroupRemoveInput = (SuperviseGroupRemoveInput) obj;
        return this.superviseId == superviseGroupRemoveInput.superviseId && this.groupId == superviseGroupRemoveInput.groupId;
    }

    public final int getGroupId() {
        return this.groupId;
    }

    public final int getSuperviseId() {
        return this.superviseId;
    }

    public int hashCode() {
        return (Integer.hashCode(this.superviseId) * 31) + Integer.hashCode(this.groupId);
    }

    public String toString() {
        return "SuperviseGroupRemoveInput(superviseId=" + this.superviseId + ", groupId=" + this.groupId + ")";
    }
}
