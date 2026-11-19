package com.zykj.blackboard.bean;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.data.dao.MoveConfigEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0010\u0010\u0018\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019JV\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u001a\u0010\"\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010$\u001a\u0004\b\u0003\u0010\u0013\"\u0004\b%\u0010&R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010$\u001a\u0004\b'\u0010\u0013\"\u0004\b(\u0010&R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010$\u001a\u0004\b)\u0010\u0013\"\u0004\b*\u0010&R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010$\u001a\u0004\b+\u0010\u0013\"\u0004\b,\u0010&R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010$\u001a\u0004\b-\u0010\u0013\"\u0004\b.\u0010&R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u0019\"\u0004\b1\u00102R\"\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010/\u001a\u0004\b3\u0010\u0019\"\u0004\b4\u00102¨\u00065"}, m5110d2 = {"Lcom/zykj/blackboard/bean/MoveActionConfig;", "", "", "isMoveActionEnable", "verticalTranslate", "horizontalTranslate", "scale", "rotate", "", "maxWidthTimes", "maxHeightTimes", "<init>", "(ZZZZZII)V", "Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;", "moveConfigEntity", "Ld6/s;", "set", "(Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;)V", "component1", "()Z", "component2", "component3", "component4", "component5", "component6", "()I", "component7", "copy", "(ZZZZZII)Lcom/zykj/blackboard/bean/MoveActionConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "setMoveActionEnable", "(Z)V", "getVerticalTranslate", "setVerticalTranslate", "getHorizontalTranslate", "setHorizontalTranslate", "getScale", "setScale", "getRotate", "setRotate", "I", "getMaxWidthTimes", "setMaxWidthTimes", "(I)V", "getMaxHeightTimes", "setMaxHeightTimes", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class MoveActionConfig {
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

    public static /* synthetic */ MoveActionConfig copy$default(MoveActionConfig moveActionConfig, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z8 = moveActionConfig.isMoveActionEnable;
        }
        if ((i9 & 2) != 0) {
            z9 = moveActionConfig.verticalTranslate;
        }
        if ((i9 & 4) != 0) {
            z10 = moveActionConfig.horizontalTranslate;
        }
        if ((i9 & 8) != 0) {
            z11 = moveActionConfig.scale;
        }
        if ((i9 & 16) != 0) {
            z12 = moveActionConfig.rotate;
        }
        if ((i9 & 32) != 0) {
            i = moveActionConfig.maxWidthTimes;
        }
        if ((i9 & 64) != 0) {
            i8 = moveActionConfig.maxHeightTimes;
        }
        int i10 = i;
        int i11 = i8;
        boolean z13 = z12;
        boolean z14 = z10;
        return moveActionConfig.copy(z8, z9, z14, z11, z13, i10, i11);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsMoveActionEnable() {
        return this.isMoveActionEnable;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getVerticalTranslate() {
        return this.verticalTranslate;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHorizontalTranslate() {
        return this.horizontalTranslate;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getScale() {
        return this.scale;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getRotate() {
        return this.rotate;
    }

    /* renamed from: component6, reason: from getter */
    public final int getMaxWidthTimes() {
        return this.maxWidthTimes;
    }

    /* renamed from: component7, reason: from getter */
    public final int getMaxHeightTimes() {
        return this.maxHeightTimes;
    }

    @NotNull
    public final MoveActionConfig copy(boolean isMoveActionEnable, boolean verticalTranslate, boolean horizontalTranslate, boolean scale, boolean rotate, int maxWidthTimes, int maxHeightTimes) {
        return new MoveActionConfig(isMoveActionEnable, verticalTranslate, horizontalTranslate, scale, rotate, maxWidthTimes, maxHeightTimes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MoveActionConfig)) {
            return false;
        }
        MoveActionConfig moveActionConfig = (MoveActionConfig) other;
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
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean] */
    public int hashCode() {
        boolean z8 = this.isMoveActionEnable;
        ?? r02 = z8;
        if (z8) {
            r02 = 1;
        }
        int i = r02 * 31;
        ?? r32 = this.verticalTranslate;
        int i8 = r32;
        if (r32 != 0) {
            i8 = 1;
        }
        int i9 = (i + i8) * 31;
        ?? r33 = this.horizontalTranslate;
        int i10 = r33;
        if (r33 != 0) {
            i10 = 1;
        }
        int i11 = (i9 + i10) * 31;
        ?? r34 = this.scale;
        int i12 = r34;
        if (r34 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z9 = this.rotate;
        return Integer.hashCode(this.maxHeightTimes) + AbstractC0584a.m902c(this.maxWidthTimes, (i13 + (z9 ? 1 : z9 ? 1 : 0)) * 31, 31);
    }

    public final boolean isMoveActionEnable() {
        return this.isMoveActionEnable;
    }

    public final void set(@NotNull MoveConfigEntity moveConfigEntity) {
        AbstractC5830k.m5330g(moveConfigEntity, "moveConfigEntity");
        this.isMoveActionEnable = moveConfigEntity.getIsEnable();
        this.verticalTranslate = moveConfigEntity.getVerticalTranslate();
        this.horizontalTranslate = moveConfigEntity.getHorizontalTranslate();
        this.scale = moveConfigEntity.getScale();
        this.rotate = moveConfigEntity.getRotate();
        this.maxWidthTimes = moveConfigEntity.getMaxWidthTimes();
        this.maxHeightTimes = moveConfigEntity.getMaxHeightTimes();
    }

    public final void setHorizontalTranslate(boolean z8) {
        this.horizontalTranslate = z8;
    }

    public final void setMaxHeightTimes(int i) {
        this.maxHeightTimes = i;
    }

    public final void setMaxWidthTimes(int i) {
        this.maxWidthTimes = i;
    }

    public final void setMoveActionEnable(boolean z8) {
        this.isMoveActionEnable = z8;
    }

    public final void setRotate(boolean z8) {
        this.rotate = z8;
    }

    public final void setScale(boolean z8) {
        this.scale = z8;
    }

    public final void setVerticalTranslate(boolean z8) {
        this.verticalTranslate = z8;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("MoveActionConfig(isMoveActionEnable=");
        sb.append(this.isMoveActionEnable);
        sb.append(", verticalTranslate=");
        sb.append(this.verticalTranslate);
        sb.append(", horizontalTranslate=");
        sb.append(this.horizontalTranslate);
        sb.append(", scale=");
        sb.append(this.scale);
        sb.append(", rotate=");
        sb.append(this.rotate);
        sb.append(", maxWidthTimes=");
        sb.append(this.maxWidthTimes);
        sb.append(", maxHeightTimes=");
        return AbstractC0037f.m88m(sb, this.maxHeightTimes, ')');
    }

    public MoveActionConfig(boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i, int i8) {
        this.isMoveActionEnable = z8;
        this.verticalTranslate = z9;
        this.horizontalTranslate = z10;
        this.scale = z11;
        this.rotate = z12;
        this.maxWidthTimes = i;
        this.maxHeightTimes = i8;
    }

    public /* synthetic */ MoveActionConfig(boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i, int i8, int i9, AbstractC5824e abstractC5824e) {
        this((i9 & 1) != 0 ? false : z8, (i9 & 2) != 0 ? false : z9, (i9 & 4) != 0 ? false : z10, (i9 & 8) != 0 ? false : z11, (i9 & 16) != 0 ? false : z12, (i9 & 32) != 0 ? 1 : i, (i9 & 64) != 0 ? 1 : i8);
    }
}
