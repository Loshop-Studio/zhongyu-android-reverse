package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.bean.MoveActionConfig;
import com.zykj.blackboard.utils.BoardBox;
import io.objectbox.annotation.Entity;
import io.objectbox.annotation.InterfaceC5697Id;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0007\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u0005\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001b\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001b\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001eR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\f\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010'\u001a\u0004\b,\u0010)\"\u0004\b-\u0010+¨\u0006."}, m5110d2 = {"Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;", "", "", "id", "", "isEnable", "verticalTranslate", "horizontalTranslate", "scale", "rotate", "", "maxHeightTimes", "maxWidthTimes", "<init>", "(JZZZZZII)V", "Ld6/s;", "put", "()V", "Lcom/zykj/blackboard/bean/MoveActionConfig;", "moveActionConfig", "set", "(Lcom/zykj/blackboard/bean/MoveActionConfig;)V", "J", "getId", "()J", "setId", "(J)V", "Z", "()Z", "setEnable", "(Z)V", "getVerticalTranslate", "setVerticalTranslate", "getHorizontalTranslate", "setHorizontalTranslate", "getScale", "setScale", "getRotate", "setRotate", "I", "getMaxHeightTimes", "()I", "setMaxHeightTimes", "(I)V", "getMaxWidthTimes", "setMaxWidthTimes", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Entity
/* loaded from: classes3.dex */
public final class MoveConfigEntity {
    private boolean horizontalTranslate;

    @InterfaceC5697Id
    private long id;
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
        return this.id;
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

    /* renamed from: isEnable, reason: from getter */
    public final boolean getIsEnable() {
        return this.isEnable;
    }

    public final void put() {
        BoardBox.INSTANCE.getBoxStore().m5018c(MoveConfigEntity.class).m5034e(this);
    }

    public final void set(@NotNull MoveActionConfig moveActionConfig) {
        AbstractC5830k.m5330g(moveActionConfig, "moveActionConfig");
        this.isEnable = moveActionConfig.isMoveActionEnable();
        this.verticalTranslate = moveActionConfig.getVerticalTranslate();
        this.horizontalTranslate = moveActionConfig.getHorizontalTranslate();
        this.scale = moveActionConfig.getScale();
        this.rotate = moveActionConfig.getRotate();
        this.maxWidthTimes = moveActionConfig.getMaxWidthTimes();
        this.maxHeightTimes = moveActionConfig.getMaxHeightTimes();
    }

    public final void setEnable(boolean z8) {
        this.isEnable = z8;
    }

    public final void setHorizontalTranslate(boolean z8) {
        this.horizontalTranslate = z8;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setMaxHeightTimes(int i) {
        this.maxHeightTimes = i;
    }

    public final void setMaxWidthTimes(int i) {
        this.maxWidthTimes = i;
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

    public MoveConfigEntity(long j7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i, int i8) {
        this.id = j7;
        this.isEnable = z8;
        this.verticalTranslate = z9;
        this.horizontalTranslate = z10;
        this.scale = z11;
        this.rotate = z12;
        this.maxHeightTimes = i;
        this.maxWidthTimes = i8;
    }

    public /* synthetic */ MoveConfigEntity(long j7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i, int i8, int i9, AbstractC5824e abstractC5824e) {
        this((i9 & 1) != 0 ? 0L : j7, (i9 & 2) != 0 ? false : z8, (i9 & 4) != 0 ? false : z9, (i9 & 8) != 0 ? false : z10, (i9 & 16) != 0 ? false : z11, (i9 & 32) != 0 ? false : z12, (i9 & 64) != 0 ? 0 : i, (i9 & 128) != 0 ? 0 : i8);
    }
}
