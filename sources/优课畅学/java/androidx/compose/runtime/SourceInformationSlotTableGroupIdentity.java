package androidx.compose.runtime;

import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes2.dex */
final class SourceInformationSlotTableGroupIdentity {
    private final int index;
    private final Object parentIdentity;

    public SourceInformationSlotTableGroupIdentity(Object obj, int i10) {
        this.parentIdentity = obj;
        this.index = i10;
    }

    public static /* synthetic */ SourceInformationSlotTableGroupIdentity copy$default(SourceInformationSlotTableGroupIdentity sourceInformationSlotTableGroupIdentity, Object obj, int i10, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = sourceInformationSlotTableGroupIdentity.parentIdentity;
        }
        if ((i11 & 2) != 0) {
            i10 = sourceInformationSlotTableGroupIdentity.index;
        }
        return sourceInformationSlotTableGroupIdentity.copy(obj, i10);
    }

    public final Object component1() {
        return this.parentIdentity;
    }

    public final int component2() {
        return this.index;
    }

    public final SourceInformationSlotTableGroupIdentity copy(Object obj, int i10) {
        return new SourceInformationSlotTableGroupIdentity(obj, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SourceInformationSlotTableGroupIdentity)) {
            return false;
        }
        SourceInformationSlotTableGroupIdentity sourceInformationSlotTableGroupIdentity = (SourceInformationSlotTableGroupIdentity) obj;
        return AbstractC9133u.m16128b(this.parentIdentity, sourceInformationSlotTableGroupIdentity.parentIdentity) && this.index == sourceInformationSlotTableGroupIdentity.index;
    }

    public final int getIndex() {
        return this.index;
    }

    public final Object getParentIdentity() {
        return this.parentIdentity;
    }

    public int hashCode() {
        return (this.parentIdentity.hashCode() * 31) + Integer.hashCode(this.index);
    }

    public String toString() {
        return "SourceInformationSlotTableGroupIdentity(parentIdentity=" + this.parentIdentity + ", index=" + this.index + ')';
    }
}
