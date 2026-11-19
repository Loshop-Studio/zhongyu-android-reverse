package com.friday.document.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class TchListEntity {
    public static final int $stable = 8;
    private final List<TchByCloudEntity> teachers;

    public TchListEntity(List<TchByCloudEntity> teachers) {
        AbstractC9979u.m20294g(teachers, "teachers");
        this.teachers = teachers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TchListEntity copy$default(TchListEntity tchListEntity, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = tchListEntity.teachers;
        }
        return tchListEntity.copy(list);
    }

    public final List<TchByCloudEntity> component1() {
        return this.teachers;
    }

    public final TchListEntity copy(List<TchByCloudEntity> teachers) {
        AbstractC9979u.m20294g(teachers, "teachers");
        return new TchListEntity(teachers);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TchListEntity) && AbstractC9979u.m20289b(this.teachers, ((TchListEntity) obj).teachers);
    }

    public final List<TchByCloudEntity> getTeachers() {
        return this.teachers;
    }

    public int hashCode() {
        return this.teachers.hashCode();
    }

    public String toString() {
        return "TchListEntity(teachers=" + this.teachers + ")";
    }
}
