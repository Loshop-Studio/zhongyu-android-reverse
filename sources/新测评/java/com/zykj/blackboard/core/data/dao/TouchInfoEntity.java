package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import io.objectbox.BoxStore;
import io.objectbox.annotation.Entity;
import io.objectbox.relation.ToOne;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p077e5.C7342c;

@Metadata(m13557d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R(\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006-"}, m13558d2 = {"Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;", "", "", "id", "eventTime", "", "x", "y", "<init>", "(JJFF)V", "", "f", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "b", "()J", "g", "(J)V", "a", "setEventTime", "F", "d", "()F", "setX", "(F)V", "e", "setY", "Lio/objectbox/relation/ToOne;", "Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;", "record", "Lio/objectbox/relation/ToOne;", "c", "()Lio/objectbox/relation/ToOne;", "setRecord", "(Lio/objectbox/relation/ToOne;)V", "blackboard_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
@Entity
/* loaded from: classes4.dex */
public final /* data */ class TouchInfoEntity {
    transient BoxStore __boxStore;
    private long eventTime;
    private long id;
    public ToOne<TouchEventEntity> record;
    private float x;
    private float y;

    public TouchInfoEntity() {
        this(0L, 0L, 0.0f, 0.0f, 15, null);
    }

    /* renamed from: a, reason: from getter */
    public final long getEventTime() {
        return this.eventTime;
    }

    /* renamed from: b, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: c */
    public final ToOne m6602c() {
        ToOne<TouchEventEntity> toOne = this.record;
        if (toOne != null) {
            return toOne;
        }
        Intrinsics.throwUninitializedPropertyAccessException("record");
        return null;
    }

    /* renamed from: d, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* renamed from: e, reason: from getter */
    public final float getY() {
        return this.y;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TouchInfoEntity)) {
            return false;
        }
        TouchInfoEntity touchInfoEntity = (TouchInfoEntity) other;
        return this.id == touchInfoEntity.id && this.eventTime == touchInfoEntity.eventTime && Intrinsics.areEqual((Object) Float.valueOf(this.x), (Object) Float.valueOf(touchInfoEntity.x)) && Intrinsics.areEqual((Object) Float.valueOf(this.y), (Object) Float.valueOf(touchInfoEntity.y));
    }

    /* renamed from: f */
    public final void m6605f() {
        C7342c.f11908a.m11744b().m12981h(TouchInfoEntity.class).m15045l(this);
    }

    /* renamed from: g */
    public final void m6606g(long j10) {
        this.id = j10;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.id) * 31) + Long.hashCode(this.eventTime)) * 31) + Float.hashCode(this.x)) * 31) + Float.hashCode(this.y);
    }

    public String toString() {
        return "TouchInfoEntity(id=" + this.id + ", eventTime=" + this.eventTime + ", x=" + this.x + ", y=" + this.y + ')';
    }

    public TouchInfoEntity(long j10, long j11, float f10, float f11) {
        this.record = new ToOne<>(this, TouchInfoEntity_.f7651l);
        this.id = j10;
        this.eventTime = j11;
        this.x = f10;
        this.y = f11;
    }

    public /* synthetic */ TouchInfoEntity(long j10, long j11, float f10, float f11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? 0L : j11, (i10 & 4) != 0 ? 0.0f : f10, (i10 & 8) != 0 ? 0.0f : f11);
    }
}
