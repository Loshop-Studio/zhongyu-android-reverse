package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import com.zykj.blackboard.bean.MoveActionConfig;
import com.zykj.blackboard.utils.BoardBox;
import io.objectbox.annotation.Entity;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@Entity
/* loaded from: classes4.dex */
public final class MoveConfigEntity {
    private boolean horizontalTranslate;

    /* renamed from: id */
    private long f8744id;
    private boolean isEnable;
    private int maxHeightTimes;
    private int maxWidthTimes;
    private boolean rotate;
    private boolean scale;
    private boolean verticalTranslate;

    public MoveConfigEntity() {
        this(0L, false, false, false, false, false, 0, 0, 255, null);
    }

    public final boolean getHorizontalTranslate() {
        return this.horizontalTranslate;
    }

    public final long getId() {
        return this.f8744id;
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

    public final boolean isEnable() {
        return this.isEnable;
    }

    public final void put() {
        BoardBox.INSTANCE.getBoxStore().m15370d(MoveConfigEntity.class).m15414l(this);
    }

    public final void set(MoveActionConfig moveActionConfig) {
        AbstractC9133u.m16133g(moveActionConfig, "moveActionConfig");
        this.isEnable = moveActionConfig.isMoveActionEnable();
        this.verticalTranslate = moveActionConfig.getVerticalTranslate();
        this.horizontalTranslate = moveActionConfig.getHorizontalTranslate();
        this.scale = moveActionConfig.getScale();
        this.rotate = moveActionConfig.getRotate();
        this.maxWidthTimes = moveActionConfig.getMaxWidthTimes();
        this.maxHeightTimes = moveActionConfig.getMaxHeightTimes();
    }

    public final void setEnable(boolean z10) {
        this.isEnable = z10;
    }

    public final void setHorizontalTranslate(boolean z10) {
        this.horizontalTranslate = z10;
    }

    public final void setId(long j10) {
        this.f8744id = j10;
    }

    public final void setMaxHeightTimes(int i10) {
        this.maxHeightTimes = i10;
    }

    public final void setMaxWidthTimes(int i10) {
        this.maxWidthTimes = i10;
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

    public MoveConfigEntity(long j10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i10, int i11) {
        this.f8744id = j10;
        this.isEnable = z10;
        this.verticalTranslate = z11;
        this.horizontalTranslate = z12;
        this.scale = z13;
        this.rotate = z14;
        this.maxHeightTimes = i10;
        this.maxWidthTimes = i11;
    }

    public /* synthetic */ MoveConfigEntity(long j10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i10, int i11, int i12, AbstractC9126n abstractC9126n) {
        this((i12 & 1) != 0 ? 0L : j10, (i12 & 2) != 0 ? false : z10, (i12 & 4) != 0 ? false : z11, (i12 & 8) != 0 ? false : z12, (i12 & 16) != 0 ? false : z13, (i12 & 32) != 0 ? false : z14, (i12 & 64) != 0 ? 0 : i10, (i12 & 128) != 0 ? 0 : i11);
    }
}
