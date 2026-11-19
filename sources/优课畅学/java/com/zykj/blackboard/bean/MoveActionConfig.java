package com.zykj.blackboard.bean;

import com.zykj.blackboard.core.data.dao.MoveConfigEntity;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class MoveActionConfig {
    private boolean horizontalTranslate;
    private boolean isMoveActionEnable;
    private int maxHeightTimes;
    private int maxWidthTimes;
    private boolean rotate;
    private boolean scale;
    private boolean verticalTranslate;

    public MoveActionConfig() {
        this(false, false, false, false, false, 0, 0, 127, null);
    }

    public static /* synthetic */ MoveActionConfig copy$default(MoveActionConfig moveActionConfig, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z10 = moveActionConfig.isMoveActionEnable;
        }
        if ((i12 & 2) != 0) {
            z11 = moveActionConfig.verticalTranslate;
        }
        if ((i12 & 4) != 0) {
            z12 = moveActionConfig.horizontalTranslate;
        }
        if ((i12 & 8) != 0) {
            z13 = moveActionConfig.scale;
        }
        if ((i12 & 16) != 0) {
            z14 = moveActionConfig.rotate;
        }
        if ((i12 & 32) != 0) {
            i10 = moveActionConfig.maxWidthTimes;
        }
        if ((i12 & 64) != 0) {
            i11 = moveActionConfig.maxHeightTimes;
        }
        int i13 = i10;
        int i14 = i11;
        boolean z15 = z14;
        boolean z16 = z12;
        return moveActionConfig.copy(z10, z11, z16, z13, z15, i13, i14);
    }

    public final boolean component1() {
        return this.isMoveActionEnable;
    }

    public final boolean component2() {
        return this.verticalTranslate;
    }

    public final boolean component3() {
        return this.horizontalTranslate;
    }

    public final boolean component4() {
        return this.scale;
    }

    public final boolean component5() {
        return this.rotate;
    }

    public final int component6() {
        return this.maxWidthTimes;
    }

    public final int component7() {
        return this.maxHeightTimes;
    }

    public final MoveActionConfig copy(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i10, int i11) {
        return new MoveActionConfig(z10, z11, z12, z13, z14, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoveActionConfig)) {
            return false;
        }
        MoveActionConfig moveActionConfig = (MoveActionConfig) obj;
        return this.isMoveActionEnable == moveActionConfig.isMoveActionEnable && this.verticalTranslate == moveActionConfig.verticalTranslate && this.horizontalTranslate == moveActionConfig.horizontalTranslate && this.scale == moveActionConfig.scale && this.rotate == moveActionConfig.rotate && this.maxWidthTimes == moveActionConfig.maxWidthTimes && this.maxHeightTimes == moveActionConfig.maxHeightTimes;
    }

    public final boolean getHorizontalTranslate() {
        return this.horizontalTranslate;
    }

    public final int getMaxHeightTimes() {
        return this.maxHeightTimes;
    }

    public final int getMaxWidthTimes() {
        return this.maxWidthTimes;
    }

    public final boolean getRotate() {
        return this.rotate;
    }

    public final boolean getScale() {
        return this.scale;
    }

    public final boolean getVerticalTranslate() {
        return this.verticalTranslate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    public int hashCode() {
        boolean z10 = this.isMoveActionEnable;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        ?? r22 = this.verticalTranslate;
        int i11 = r22;
        if (r22 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        ?? r23 = this.horizontalTranslate;
        int i13 = r23;
        if (r23 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        ?? r24 = this.scale;
        int i15 = r24;
        if (r24 != 0) {
            i15 = 1;
        }
        int i16 = (i14 + i15) * 31;
        boolean z11 = this.rotate;
        return ((((i16 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + Integer.hashCode(this.maxWidthTimes)) * 31) + Integer.hashCode(this.maxHeightTimes);
    }

    public final boolean isMoveActionEnable() {
        return this.isMoveActionEnable;
    }

    public final void set(MoveConfigEntity moveConfigEntity) {
        AbstractC9133u.m16133g(moveConfigEntity, "moveConfigEntity");
        this.isMoveActionEnable = moveConfigEntity.isEnable();
        this.verticalTranslate = moveConfigEntity.getVerticalTranslate();
        this.horizontalTranslate = moveConfigEntity.getHorizontalTranslate();
        this.scale = moveConfigEntity.getScale();
        this.rotate = moveConfigEntity.getRotate();
        this.maxWidthTimes = moveConfigEntity.getMaxWidthTimes();
        this.maxHeightTimes = moveConfigEntity.getMaxHeightTimes();
    }

    public final void setHorizontalTranslate(boolean z10) {
        this.horizontalTranslate = z10;
    }

    public final void setMaxHeightTimes(int i10) {
        this.maxHeightTimes = i10;
    }

    public final void setMaxWidthTimes(int i10) {
        this.maxWidthTimes = i10;
    }

    public final void setMoveActionEnable(boolean z10) {
        this.isMoveActionEnable = z10;
    }

    public final void setRotate(boolean z10) {
        this.rotate = z10;
    }

    public final void setScale(boolean z10) {
        this.scale = z10;
    }

    public final void setVerticalTranslate(boolean z10) {
        this.verticalTranslate = z10;
    }

    public String toString() {
        return "MoveActionConfig(isMoveActionEnable=" + this.isMoveActionEnable + ", verticalTranslate=" + this.verticalTranslate + ", horizontalTranslate=" + this.horizontalTranslate + ", scale=" + this.scale + ", rotate=" + this.rotate + ", maxWidthTimes=" + this.maxWidthTimes + ", maxHeightTimes=" + this.maxHeightTimes + ')';
    }

    public MoveActionConfig(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i10, int i11) {
        this.isMoveActionEnable = z10;
        this.verticalTranslate = z11;
        this.horizontalTranslate = z12;
        this.scale = z13;
        this.rotate = z14;
        this.maxWidthTimes = i10;
        this.maxHeightTimes = i11;
    }

    public /* synthetic */ MoveActionConfig(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i10, int i11, int i12, AbstractC9126n abstractC9126n) {
        this((i12 & 1) != 0 ? false : z10, (i12 & 2) != 0 ? false : z11, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? false : z13, (i12 & 16) != 0 ? false : z14, (i12 & 32) != 0 ? 1 : i10, (i12 & 64) != 0 ? 1 : i11);
    }
}
