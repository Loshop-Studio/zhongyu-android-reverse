package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import io.objectbox.BoxStore;
import io.objectbox.annotation.Entity;
import io.objectbox.relation.ToOne;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p077e5.C7342c;

@Metadata(m13557d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, m13558d2 = {"Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;", "", "", "id", "", "x", "y", "<init>", "(JFF)V", "", "e", "()V", "J", "a", "()J", "f", "(J)V", "F", "c", "()F", "setX", "(F)V", "d", "setY", "Lio/objectbox/relation/ToOne;", "Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;", "record", "Lio/objectbox/relation/ToOne;", "b", "()Lio/objectbox/relation/ToOne;", "setRecord", "(Lio/objectbox/relation/ToOne;)V", "blackboard_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
@Entity
/* loaded from: classes4.dex */
public final class GeometryPointFEntity {
    transient BoxStore __boxStore;
    private long id;
    public ToOne<GeometryInfoEntity> record;
    private float x;
    private float y;

    public GeometryPointFEntity() {
        this(0L, 0.0f, 0.0f, 7, null);
    }

    /* renamed from: a, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: b */
    public final ToOne m6395b() {
        ToOne<GeometryInfoEntity> toOne = this.record;
        if (toOne != null) {
            return toOne;
        }
        Intrinsics.throwUninitializedPropertyAccessException("record");
        return null;
    }

    /* renamed from: c, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* renamed from: d, reason: from getter */
    public final float getY() {
        return this.y;
    }

    /* renamed from: e */
    public final void m6398e() {
        C7342c.f11908a.m11744b().m12981h(GeometryPointFEntity.class).m15045l(this);
    }

    /* renamed from: f */
    public final void m6399f(long j10) {
        this.id = j10;
    }

    public GeometryPointFEntity(long j10, float f10, float f11) {
        this.record = new ToOne<>(this, GeometryPointFEntity_.f7377k);
        this.id = j10;
        this.x = f10;
        this.y = f11;
    }

    public /* synthetic */ GeometryPointFEntity(long j10, float f10, float f11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? 0.0f : f10, (i10 & 4) != 0 ? 0.0f : f11);
    }
}
