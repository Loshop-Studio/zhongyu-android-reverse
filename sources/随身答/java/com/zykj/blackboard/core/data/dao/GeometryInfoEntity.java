package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.objectbox.BoxStore;
import io.objectbox.annotation.Entity;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p263u5.C9685d;

@Metadata(m13412d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017\"\u0004\b \u0010\u0019R\"\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\"\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001a\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR(\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R(\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00065"}, m13413d2 = {"Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;", "", "", "id", "", "width", "", TypedValues.Custom.S_COLOR, "textSize", "style", "geometryType", "<init>", "(JFIFII)V", "", "i", "()V", "J", "c", "()J", "j", "(J)V", "F", "h", "()F", "setWidth", "(F)V", "I", "a", "()I", "setColor", "(I)V", "g", "setTextSize", "f", "setStyle", "b", "setGeometryType", "Lio/objectbox/relation/ToOne;", "Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;", "record", "Lio/objectbox/relation/ToOne;", "e", "()Lio/objectbox/relation/ToOne;", "setRecord", "(Lio/objectbox/relation/ToOne;)V", "Lio/objectbox/relation/ToMany;", "Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;", "pointList", "Lio/objectbox/relation/ToMany;", "d", "()Lio/objectbox/relation/ToMany;", "setPointList", "(Lio/objectbox/relation/ToMany;)V", "blackboard_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Entity
/* loaded from: classes4.dex */
public final class GeometryInfoEntity {
    transient BoxStore __boxStore;
    private int color;
    private int geometryType;
    private long id;
    public ToMany<GeometryPointFEntity> pointList;
    public ToOne<GeometryRecordEntity> record;
    private int style;
    private float textSize;
    private float width;

    public GeometryInfoEntity() {
        this(0L, 0.0f, 0, 0.0f, 0, 0, 63, null);
    }

    /* renamed from: a, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* renamed from: b, reason: from getter */
    public final int getGeometryType() {
        return this.geometryType;
    }

    /* renamed from: c, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: d */
    public final ToMany m7480d() {
        ToMany<GeometryPointFEntity> toMany = this.pointList;
        if (toMany != null) {
            return toMany;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pointList");
        return null;
    }

    /* renamed from: e */
    public final ToOne m7481e() {
        ToOne<GeometryRecordEntity> toOne = this.record;
        if (toOne != null) {
            return toOne;
        }
        Intrinsics.throwUninitializedPropertyAccessException("record");
        return null;
    }

    /* renamed from: f, reason: from getter */
    public final int getStyle() {
        return this.style;
    }

    /* renamed from: g, reason: from getter */
    public final float getTextSize() {
        return this.textSize;
    }

    /* renamed from: h, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    /* renamed from: i */
    public final void m7485i() {
        C9685d.f17121a.m16165f().m13101h(GeometryInfoEntity.class).m2255l(this);
    }

    /* renamed from: j */
    public final void m7486j(long j9) {
        this.id = j9;
    }

    public GeometryInfoEntity(long j9, float f10, int i9, float f11, int i10, int i11) {
        this.pointList = new ToMany<>(this, GeometryInfoEntity_.f8641o);
        this.record = new ToOne<>(this, GeometryInfoEntity_.f8640n);
        this.id = j9;
        this.width = f10;
        this.color = i9;
        this.textSize = f11;
        this.style = i10;
        this.geometryType = i11;
    }

    public /* synthetic */ GeometryInfoEntity(long j9, float f10, int i9, float f11, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0L : j9, (i12 & 2) != 0 ? 0.0f : f10, (i12 & 4) != 0 ? 0 : i9, (i12 & 8) != 0 ? 0.0f : f11, (i12 & 16) != 0 ? 0 : i10, (i12 & 32) != 0 ? 0 : i11);
    }
}
