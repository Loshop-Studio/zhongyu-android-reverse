package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import io.objectbox.annotation.Entity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p077e5.C7342c;
import p087f4.C7438c;

@Metadata(m13557d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001b\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001b\u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010\u001fR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\f\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010(\u001a\u0004\b-\u0010*\"\u0004\b.\u0010,¨\u0006/"}, m13558d2 = {"Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;", "", "", "id", "", "isEnable", "verticalTranslate", "horizontalTranslate", "scale", "rotate", "", "maxHeightTimes", "maxWidthTimes", "<init>", "(JZZZZZII)V", "", "i", "()V", "Lf4/c;", "moveActionConfig", "j", "(Lf4/c;)V", "J", "b", "()J", "k", "(J)V", "Z", "h", "()Z", "setEnable", "(Z)V", "g", "setVerticalTranslate", "a", "setHorizontalTranslate", "f", "setScale", "e", "setRotate", "I", "c", "()I", "setMaxHeightTimes", "(I)V", "d", "setMaxWidthTimes", "blackboard_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
@Entity
/* loaded from: classes4.dex */
public final class MoveConfigEntity {
    private boolean horizontalTranslate;
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

    /* renamed from: a, reason: from getter */
    public final boolean getHorizontalTranslate() {
        return this.horizontalTranslate;
    }

    /* renamed from: b, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: c, reason: from getter */
    public final int getMaxHeightTimes() {
        return this.maxHeightTimes;
    }

    /* renamed from: d, reason: from getter */
    public final int getMaxWidthTimes() {
        return this.maxWidthTimes;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getRotate() {
        return this.rotate;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getScale() {
        return this.scale;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getVerticalTranslate() {
        return this.verticalTranslate;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getIsEnable() {
        return this.isEnable;
    }

    /* renamed from: i */
    public final void m6501i() {
        C7342c.f11908a.m11744b().m12981h(MoveConfigEntity.class).m15045l(this);
    }

    /* renamed from: j */
    public final void m6502j(C7438c moveActionConfig) {
        Intrinsics.checkNotNullParameter(moveActionConfig, "moveActionConfig");
        this.isEnable = moveActionConfig.m11999g();
        this.verticalTranslate = moveActionConfig.m11998f();
        this.horizontalTranslate = moveActionConfig.m11993a();
        this.scale = moveActionConfig.m11997e();
        this.rotate = moveActionConfig.m11996d();
        this.maxWidthTimes = moveActionConfig.m11995c();
        this.maxHeightTimes = moveActionConfig.m11994b();
    }

    /* renamed from: k */
    public final void m6503k(long j10) {
        this.id = j10;
    }

    public MoveConfigEntity(long j10, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int i10, int i11) {
        this.id = j10;
        this.isEnable = z9;
        this.verticalTranslate = z10;
        this.horizontalTranslate = z11;
        this.scale = z12;
        this.rotate = z13;
        this.maxHeightTimes = i10;
        this.maxWidthTimes = i11;
    }

    public /* synthetic */ MoveConfigEntity(long j10, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0L : j10, (i12 & 2) != 0 ? false : z9, (i12 & 4) != 0 ? false : z10, (i12 & 8) != 0 ? false : z11, (i12 & 16) != 0 ? false : z12, (i12 & 32) != 0 ? false : z13, (i12 & 64) != 0 ? 0 : i10, (i12 & 128) != 0 ? 0 : i11);
    }
}
