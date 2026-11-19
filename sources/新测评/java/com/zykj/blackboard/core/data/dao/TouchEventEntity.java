package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.objectbox.BoxStore;
import io.objectbox.annotation.Entity;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p077e5.C7342c;

@Metadata(m13557d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010'R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001f\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001f\u001a\u0004\b*\u0010!\"\u0004\b+\u0010#R\"\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010$\u001a\u0004\b,\u0010\u0015\"\u0004\b-\u0010'R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b.\u0010!\"\u0004\b/\u0010#R(\u00102\u001a\b\u0012\u0004\u0012\u000201008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R(\u0010:\u001a\b\u0012\u0004\u0012\u000209088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006@"}, m13558d2 = {"Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;", "", "", "id", "", "width", "", TypedValues.Custom.S_COLOR, "spacing", "itemLength", "style", "textSize", "<init>", "(JFIFFIF)V", "", "j", "()V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "b", "()J", "k", "(J)V", "F", "i", "()F", "setWidth", "(F)V", "I", "a", "setColor", "(I)V", "e", "setSpacing", "c", "setItemLength", "f", "setStyle", "g", "setTextSize", "Lio/objectbox/relation/ToOne;", "Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;", "record", "Lio/objectbox/relation/ToOne;", "d", "()Lio/objectbox/relation/ToOne;", "setRecord", "(Lio/objectbox/relation/ToOne;)V", "Lio/objectbox/relation/ToMany;", "Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;", "touchInfoList", "Lio/objectbox/relation/ToMany;", "h", "()Lio/objectbox/relation/ToMany;", "setTouchInfoList", "(Lio/objectbox/relation/ToMany;)V", "blackboard_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
@Entity
/* loaded from: classes4.dex */
public final /* data */ class TouchEventEntity {
    transient BoxStore __boxStore;
    private int color;
    private long id;
    private float itemLength;
    public ToOne<TouchRecordEntity> record;
    private float spacing;
    private int style;
    private float textSize;
    public ToMany<TouchInfoEntity> touchInfoList;
    private float width;

    public TouchEventEntity() {
        this(0L, 0.0f, 0, 0.0f, 0.0f, 0, 0.0f, 127, null);
    }

    /* renamed from: a, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* renamed from: b, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: c, reason: from getter */
    public final float getItemLength() {
        return this.itemLength;
    }

    /* renamed from: d */
    public final ToOne m6586d() {
        ToOne<TouchRecordEntity> toOne = this.record;
        if (toOne != null) {
            return toOne;
        }
        Intrinsics.throwUninitializedPropertyAccessException("record");
        return null;
    }

    /* renamed from: e, reason: from getter */
    public final float getSpacing() {
        return this.spacing;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TouchEventEntity)) {
            return false;
        }
        TouchEventEntity touchEventEntity = (TouchEventEntity) other;
        return this.id == touchEventEntity.id && Intrinsics.areEqual((Object) Float.valueOf(this.width), (Object) Float.valueOf(touchEventEntity.width)) && this.color == touchEventEntity.color && Intrinsics.areEqual((Object) Float.valueOf(this.spacing), (Object) Float.valueOf(touchEventEntity.spacing)) && Intrinsics.areEqual((Object) Float.valueOf(this.itemLength), (Object) Float.valueOf(touchEventEntity.itemLength)) && this.style == touchEventEntity.style && Intrinsics.areEqual((Object) Float.valueOf(this.textSize), (Object) Float.valueOf(touchEventEntity.textSize));
    }

    /* renamed from: f, reason: from getter */
    public final int getStyle() {
        return this.style;
    }

    /* renamed from: g, reason: from getter */
    public final float getTextSize() {
        return this.textSize;
    }

    /* renamed from: h */
    public final ToMany m6590h() {
        ToMany<TouchInfoEntity> toMany = this.touchInfoList;
        if (toMany != null) {
            return toMany;
        }
        Intrinsics.throwUninitializedPropertyAccessException("touchInfoList");
        return null;
    }

    public int hashCode() {
        return (((((((((((Long.hashCode(this.id) * 31) + Float.hashCode(this.width)) * 31) + Integer.hashCode(this.color)) * 31) + Float.hashCode(this.spacing)) * 31) + Float.hashCode(this.itemLength)) * 31) + Integer.hashCode(this.style)) * 31) + Float.hashCode(this.textSize);
    }

    /* renamed from: i, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    /* renamed from: j */
    public final void m6592j() {
        C7342c.f11908a.m11744b().m12981h(TouchEventEntity.class).m15045l(this);
    }

    /* renamed from: k */
    public final void m6593k(long j10) {
        this.id = j10;
    }

    public String toString() {
        return "TouchEventEntity(id=" + this.id + ", width=" + this.width + ", color=" + this.color + ", spacing=" + this.spacing + ", itemLength=" + this.itemLength + ", style=" + this.style + ", textSize=" + this.textSize + ')';
    }

    public TouchEventEntity(long j10, float f10, int i10, float f11, float f12, int i11, float f13) {
        this.touchInfoList = new ToMany<>(this, TouchEventEntity_.f7631p);
        this.record = new ToOne<>(this, TouchEventEntity_.f7630o);
        this.id = j10;
        this.width = f10;
        this.color = i10;
        this.spacing = f11;
        this.itemLength = f12;
        this.style = i11;
        this.textSize = f13;
    }

    public /* synthetic */ TouchEventEntity(long j10, float f10, int i10, float f11, float f12, int i11, float f13, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0L : j10, (i12 & 2) != 0 ? 0.0f : f10, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0.0f : f11, (i12 & 16) != 0 ? 0.0f : f12, (i12 & 32) != 0 ? 0 : i11, (i12 & 64) != 0 ? 0.0f : f13);
    }
}
