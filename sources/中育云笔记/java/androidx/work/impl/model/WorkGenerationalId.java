package androidx.work.impl.model;

import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class WorkGenerationalId {
    private final int generation;
    private final String workSpecId;

    public WorkGenerationalId(String workSpecId, int i10) {
        AbstractC9979u.m20294g(workSpecId, "workSpecId");
        this.workSpecId = workSpecId;
        this.generation = i10;
    }

    public static /* synthetic */ WorkGenerationalId copy$default(WorkGenerationalId workGenerationalId, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = workGenerationalId.workSpecId;
        }
        if ((i11 & 2) != 0) {
            i10 = workGenerationalId.generation;
        }
        return workGenerationalId.copy(str, i10);
    }

    public final String component1() {
        return this.workSpecId;
    }

    public final int component2() {
        return this.generation;
    }

    public final WorkGenerationalId copy(String workSpecId, int i10) {
        AbstractC9979u.m20294g(workSpecId, "workSpecId");
        return new WorkGenerationalId(workSpecId, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkGenerationalId)) {
            return false;
        }
        WorkGenerationalId workGenerationalId = (WorkGenerationalId) obj;
        return AbstractC9979u.m20289b(this.workSpecId, workGenerationalId.workSpecId) && this.generation == workGenerationalId.generation;
    }

    public final int getGeneration() {
        return this.generation;
    }

    public final String getWorkSpecId() {
        return this.workSpecId;
    }

    public int hashCode() {
        return (this.workSpecId.hashCode() * 31) + Integer.hashCode(this.generation);
    }

    public String toString() {
        return "WorkGenerationalId(workSpecId=" + this.workSpecId + ", generation=" + this.generation + ')';
    }
}
