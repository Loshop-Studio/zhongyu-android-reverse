package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import androidx.collection.AbstractC0584a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.utils.BoardBox;
import io.objectbox.BoxStore;
import io.objectbox.annotation.Entity;
import io.objectbox.annotation.InterfaceC5697Id;
import io.objectbox.relation.ToOne;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010#R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010 \u001a\u0004\b$\u0010\u000f\"\u0004\b%\u0010#R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0012\"\u0004\b(\u0010)R\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010&\u001a\u0004\b*\u0010\u0012\"\u0004\b+\u0010)R(\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00064"}, m5110d2 = {"Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;", "", "", "id", "eventTime", "", "x", "y", "<init>", "(JJFF)V", "Ld6/s;", "put", "()V", "remove", "component1", "()J", "component2", "component3", "()F", "component4", "copy", "(JJFF)Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "setId", "(J)V", "getEventTime", "setEventTime", "F", "getX", "setX", "(F)V", "getY", "setY", "Lio/objectbox/relation/ToOne;", "Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;", "record", "Lio/objectbox/relation/ToOne;", "getRecord", "()Lio/objectbox/relation/ToOne;", "setRecord", "(Lio/objectbox/relation/ToOne;)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Entity
/* loaded from: classes3.dex */
public final /* data */ class TouchInfoEntity {
    transient BoxStore __boxStore;
    private long eventTime;

    @InterfaceC5697Id
    private long id;
    public ToOne<TouchEventEntity> record;
    private float x;
    private float y;

    public TouchInfoEntity() {
        this(0L, 0L, 0.0f, 0.0f, 15, null);
    }

    public static /* synthetic */ TouchInfoEntity copy$default(TouchInfoEntity touchInfoEntity, long j7, long j8, float f, float f7, int i, Object obj) {
        if ((i & 1) != 0) {
            j7 = touchInfoEntity.id;
        }
        long j9 = j7;
        if ((i & 2) != 0) {
            j8 = touchInfoEntity.eventTime;
        }
        long j10 = j8;
        if ((i & 4) != 0) {
            f = touchInfoEntity.x;
        }
        float f8 = f;
        if ((i & 8) != 0) {
            f7 = touchInfoEntity.y;
        }
        return touchInfoEntity.copy(j9, j10, f8, f7);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getEventTime() {
        return this.eventTime;
    }

    /* renamed from: component3, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* renamed from: component4, reason: from getter */
    public final float getY() {
        return this.y;
    }

    @NotNull
    public final TouchInfoEntity copy(long id, long eventTime, float x3, float y2) {
        return new TouchInfoEntity(id, eventTime, x3, y2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TouchInfoEntity)) {
            return false;
        }
        TouchInfoEntity touchInfoEntity = (TouchInfoEntity) other;
        return this.id == touchInfoEntity.id && this.eventTime == touchInfoEntity.eventTime && Float.valueOf(this.x).equals(Float.valueOf(touchInfoEntity.x)) && Float.valueOf(this.y).equals(Float.valueOf(touchInfoEntity.y));
    }

    public final long getEventTime() {
        return this.eventTime;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final ToOne<TouchEventEntity> getRecord() {
        ToOne<TouchEventEntity> toOne = this.record;
        if (toOne != null) {
            return toOne;
        }
        AbstractC5830k.m5339p("record");
        throw null;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public int hashCode() {
        return Float.hashCode(this.y) + AbstractC0584a.m901b(this.x, AbstractC0584a.m897B(this.eventTime, Long.hashCode(this.id) * 31, 31), 31);
    }

    public final void put() {
        BoardBox.INSTANCE.getBoxStore().m5018c(TouchInfoEntity.class).m5034e(this);
    }

    public final void remove() {
        BoardBox.INSTANCE.getBoxStore().m5018c(TouchInfoEntity.class).m5039j(this);
    }

    public final void setEventTime(long j7) {
        this.eventTime = j7;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setRecord(@NotNull ToOne<TouchEventEntity> toOne) {
        AbstractC5830k.m5330g(toOne, "<set-?>");
        this.record = toOne;
    }

    public final void setX(float f) {
        this.x = f;
    }

    public final void setY(float f) {
        this.y = f;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("TouchInfoEntity(id=");
        sb.append(this.id);
        sb.append(", eventTime=");
        sb.append(this.eventTime);
        sb.append(", x=");
        sb.append(this.x);
        sb.append(", y=");
        return AbstractC0584a.m915p(sb, this.y, ')');
    }

    public TouchInfoEntity(long j7, long j8, float f, float f7) {
        this.record = new ToOne<>(this, TouchInfoEntity_.record);
        this.id = j7;
        this.eventTime = j8;
        this.x = f;
        this.y = f7;
    }

    public /* synthetic */ TouchInfoEntity(long j7, long j8, float f, float f7, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? 0L : j7, (i & 2) != 0 ? 0L : j8, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? 0.0f : f7);
    }
}
