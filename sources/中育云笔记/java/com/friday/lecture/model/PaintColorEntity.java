package com.friday.lecture.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class PaintColorEntity {
    public static final int $stable = 8;
    private final int color;
    private boolean selected;

    public PaintColorEntity(int i10, boolean z10) {
        this.color = i10;
        this.selected = z10;
    }

    public static /* synthetic */ PaintColorEntity copy$default(PaintColorEntity paintColorEntity, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = paintColorEntity.color;
        }
        if ((i11 & 2) != 0) {
            z10 = paintColorEntity.selected;
        }
        return paintColorEntity.copy(i10, z10);
    }

    public final int component1() {
        return this.color;
    }

    public final boolean component2() {
        return this.selected;
    }

    public final PaintColorEntity copy(int i10, boolean z10) {
        return new PaintColorEntity(i10, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaintColorEntity)) {
            return false;
        }
        PaintColorEntity paintColorEntity = (PaintColorEntity) obj;
        return this.color == paintColorEntity.color && this.selected == paintColorEntity.selected;
    }

    public final int getColor() {
        return this.color;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public int hashCode() {
        return (Integer.hashCode(this.color) * 31) + Boolean.hashCode(this.selected);
    }

    public final void setSelected(boolean z10) {
        this.selected = z10;
    }

    public String toString() {
        return "PaintColorEntity(color=" + this.color + ", selected=" + this.selected + ")";
    }

    public /* synthetic */ PaintColorEntity(int i10, boolean z10, int i11, AbstractC9972n abstractC9972n) {
        this(i10, (i11 & 2) != 0 ? false : z10);
    }
}
