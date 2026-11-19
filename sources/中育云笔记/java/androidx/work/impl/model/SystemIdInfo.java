package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import kotlin.jvm.internal.AbstractC9979u;
import org.android.agoo.common.AgooConstants;

@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = WorkSpec.class, onDelete = 5, onUpdate = 5, parentColumns = {AgooConstants.MESSAGE_ID})}, primaryKeys = {"work_spec_id", "generation"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class SystemIdInfo {

    @ColumnInfo(defaultValue = "0")
    private final int generation;

    @ColumnInfo(name = "system_id")
    public final int systemId;

    @ColumnInfo(name = "work_spec_id")
    public final String workSpecId;

    public SystemIdInfo(String workSpecId, int i10, int i11) {
        AbstractC9979u.m20294g(workSpecId, "workSpecId");
        this.workSpecId = workSpecId;
        this.generation = i10;
        this.systemId = i11;
    }

    public static /* synthetic */ SystemIdInfo copy$default(SystemIdInfo systemIdInfo, String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = systemIdInfo.workSpecId;
        }
        if ((i12 & 2) != 0) {
            i10 = systemIdInfo.generation;
        }
        if ((i12 & 4) != 0) {
            i11 = systemIdInfo.systemId;
        }
        return systemIdInfo.copy(str, i10, i11);
    }

    public final String component1() {
        return this.workSpecId;
    }

    public final int component2() {
        return this.generation;
    }

    public final int component3() {
        return this.systemId;
    }

    public final SystemIdInfo copy(String workSpecId, int i10, int i11) {
        AbstractC9979u.m20294g(workSpecId, "workSpecId");
        return new SystemIdInfo(workSpecId, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SystemIdInfo)) {
            return false;
        }
        SystemIdInfo systemIdInfo = (SystemIdInfo) obj;
        return AbstractC9979u.m20289b(this.workSpecId, systemIdInfo.workSpecId) && this.generation == systemIdInfo.generation && this.systemId == systemIdInfo.systemId;
    }

    public final int getGeneration() {
        return this.generation;
    }

    public int hashCode() {
        return (((this.workSpecId.hashCode() * 31) + Integer.hashCode(this.generation)) * 31) + Integer.hashCode(this.systemId);
    }

    public String toString() {
        return "SystemIdInfo(workSpecId=" + this.workSpecId + ", generation=" + this.generation + ", systemId=" + this.systemId + ')';
    }
}
