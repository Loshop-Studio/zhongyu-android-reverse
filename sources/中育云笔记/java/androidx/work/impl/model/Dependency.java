package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import kotlin.jvm.internal.AbstractC9979u;
import org.android.agoo.common.AgooConstants;

@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = WorkSpec.class, onDelete = 5, onUpdate = 5, parentColumns = {AgooConstants.MESSAGE_ID}), @ForeignKey(childColumns = {"prerequisite_id"}, entity = WorkSpec.class, onDelete = 5, onUpdate = 5, parentColumns = {AgooConstants.MESSAGE_ID})}, indices = {@Index({"work_spec_id"}), @Index({"prerequisite_id"})}, primaryKeys = {"work_spec_id", "prerequisite_id"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class Dependency {

    @ColumnInfo(name = "prerequisite_id")
    private final String prerequisiteId;

    @ColumnInfo(name = "work_spec_id")
    private final String workSpecId;

    public Dependency(String workSpecId, String prerequisiteId) {
        AbstractC9979u.m20294g(workSpecId, "workSpecId");
        AbstractC9979u.m20294g(prerequisiteId, "prerequisiteId");
        this.workSpecId = workSpecId;
        this.prerequisiteId = prerequisiteId;
    }

    public final String getPrerequisiteId() {
        return this.prerequisiteId;
    }

    public final String getWorkSpecId() {
        return this.workSpecId;
    }
}
