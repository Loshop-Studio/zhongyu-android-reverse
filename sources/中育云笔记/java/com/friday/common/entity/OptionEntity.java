package com.friday.common.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class OptionEntity {
    public static final int $stable = 8;
    private boolean isSelected;
    private final boolean isSingle;
    private final String option;

    public OptionEntity(boolean z10, String option, boolean z11) {
        AbstractC9979u.m20294g(option, "option");
        this.isSingle = z10;
        this.option = option;
        this.isSelected = z11;
    }

    public static /* synthetic */ OptionEntity copy$default(OptionEntity optionEntity, boolean z10, String str, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = optionEntity.isSingle;
        }
        if ((i10 & 2) != 0) {
            str = optionEntity.option;
        }
        if ((i10 & 4) != 0) {
            z11 = optionEntity.isSelected;
        }
        return optionEntity.copy(z10, str, z11);
    }

    public final boolean component1() {
        return this.isSingle;
    }

    public final String component2() {
        return this.option;
    }

    public final boolean component3() {
        return this.isSelected;
    }

    public final OptionEntity copy(boolean z10, String option, boolean z11) {
        AbstractC9979u.m20294g(option, "option");
        return new OptionEntity(z10, option, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionEntity)) {
            return false;
        }
        OptionEntity optionEntity = (OptionEntity) obj;
        return this.isSingle == optionEntity.isSingle && AbstractC9979u.m20289b(this.option, optionEntity.option) && this.isSelected == optionEntity.isSelected;
    }

    public final String getOption() {
        return this.option;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isSingle) * 31) + this.option.hashCode()) * 31) + Boolean.hashCode(this.isSelected);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final boolean isSingle() {
        return this.isSingle;
    }

    public final void setSelected(boolean z10) {
        this.isSelected = z10;
    }

    public String toString() {
        return "OptionEntity(isSingle=" + this.isSingle + ", option=" + this.option + ", isSelected=" + this.isSelected + ")";
    }

    public /* synthetic */ OptionEntity(boolean z10, String str, boolean z11, int i10, AbstractC9972n abstractC9972n) {
        this(z10, str, (i10 & 4) != 0 ? false : z11);
    }
}
