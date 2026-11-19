package com.friday.common.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class OptionListEntity {
    public static final int $stable = 8;
    private final int index;
    private final List<OptionEntity> list;

    public OptionListEntity(int i10, List<OptionEntity> list) {
        AbstractC9979u.m20294g(list, "list");
        this.index = i10;
        this.list = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OptionListEntity copy$default(OptionListEntity optionListEntity, int i10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = optionListEntity.index;
        }
        if ((i11 & 2) != 0) {
            list = optionListEntity.list;
        }
        return optionListEntity.copy(i10, list);
    }

    public final int component1() {
        return this.index;
    }

    public final List<OptionEntity> component2() {
        return this.list;
    }

    public final OptionListEntity copy(int i10, List<OptionEntity> list) {
        AbstractC9979u.m20294g(list, "list");
        return new OptionListEntity(i10, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionListEntity)) {
            return false;
        }
        OptionListEntity optionListEntity = (OptionListEntity) obj;
        return this.index == optionListEntity.index && AbstractC9979u.m20289b(this.list, optionListEntity.list);
    }

    public final int getIndex() {
        return this.index;
    }

    public final List<OptionEntity> getList() {
        return this.list;
    }

    public int hashCode() {
        return (Integer.hashCode(this.index) * 31) + this.list.hashCode();
    }

    public String toString() {
        return "OptionListEntity(index=" + this.index + ", list=" + this.list + ")";
    }
}
