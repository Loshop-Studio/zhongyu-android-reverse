package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.autofill.HintConstants;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import kotlin.jvm.internal.AbstractC9133u;

@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = WorkSpec.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, indices = {@Index({"work_spec_id"})}, primaryKeys = {HintConstants.AUTOFILL_HINT_NAME, "work_spec_id"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class WorkName {

    @ColumnInfo(name = HintConstants.AUTOFILL_HINT_NAME)
    private final String name;

    @ColumnInfo(name = "work_spec_id")
    private final String workSpecId;

    public WorkName(String name, String workSpecId) {
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(workSpecId, "workSpecId");
        this.name = name;
        this.workSpecId = workSpecId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getWorkSpecId() {
        return this.workSpecId;
    }
}
