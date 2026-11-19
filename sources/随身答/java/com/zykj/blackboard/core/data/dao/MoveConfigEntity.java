package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import androidx.constraintlayout.widget.ConstraintLayout;
import io.objectbox.annotation.Entity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p263u5.C9685d;
import p272v4.C9765d;

@Metadata(m13412d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001b\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001b\u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010\u001fR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\f\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010(\u001a\u0004\b-\u0010*\"\u0004\b.\u0010,¨\u0006/"}, m13413d2 = {"Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;", "", "", "id", "", "isEnable", "verticalTranslate", "horizontalTranslate", "scale", "rotate", "", "maxHeightTimes", "maxWidthTimes", "<init>", "(JZZZZZII)V", "", "i", "()V", "Lv4/d;", "moveActionConfig", "j", "(Lv4/d;)V", "J", "b", "()J", "k", "(J)V", "Z", "h", "()Z", "setEnable", "(Z)V", "g", "setVerticalTranslate", "a", "setHorizontalTranslate", "f", "setScale", "e", "setRotate", "I", "c", "()I", "setMaxHeightTimes", "(I)V", "d", "setMaxWidthTimes", "blackboard_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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
    public final void m7603i() {
        C9685d.f17121a.m16165f().m13101h(MoveConfigEntity.class).m2255l(this);
    }

    /* renamed from: j */
    public final void m7604j(C9765d moveActionConfig) {
        Intrinsics.checkNotNullParameter(moveActionConfig, "moveActionConfig");
        this.isEnable = moveActionConfig.m16528g();
        this.verticalTranslate = moveActionConfig.m16527f();
        this.horizontalTranslate = moveActionConfig.m16522a();
        this.scale = moveActionConfig.m16526e();
        this.rotate = moveActionConfig.m16525d();
        this.maxWidthTimes = moveActionConfig.m16524c();
        this.maxHeightTimes = moveActionConfig.m16523b();
    }

    /* renamed from: k */
    public final void m7605k(long j9) {
        this.id = j9;
    }

    public MoveConfigEntity(long j9, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int i9, int i10) {
        this.id = j9;
        this.isEnable = z9;
        this.verticalTranslate = z10;
        this.horizontalTranslate = z11;
        this.scale = z12;
        this.rotate = z13;
        this.maxHeightTimes = i9;
        this.maxWidthTimes = i10;
    }

    public /* synthetic */ MoveConfigEntity(long j9, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int i9, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j9, (i11 & 2) != 0 ? false : z9, (i11 & 4) != 0 ? false : z10, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? false : z12, (i11 & 32) != 0 ? false : z13, (i11 & 64) != 0 ? 0 : i9, (i11 & 128) != 0 ? 0 : i10);
    }
}
