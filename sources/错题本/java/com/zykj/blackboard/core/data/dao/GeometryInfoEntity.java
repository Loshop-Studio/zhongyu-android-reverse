package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.utils.BoardBox;
import io.objectbox.BoxStore;
import io.objectbox.annotation.Entity;
import io.objectbox.annotation.InterfaceC5697Id;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0016\u001a\u0004\b \u0010\u0018\"\u0004\b!\u0010\u001aR\"\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\"\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001b\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR(\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R(\u00100\u001a\b\u0012\u0004\u0012\u00020/0.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00066"}, m5110d2 = {"Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;", "", "", "id", "", "width", "", TypedValues.Custom.S_COLOR, "textSize", "style", "geometryType", "<init>", "(JFIFII)V", "Ld6/s;", "put", "()V", "remove", "J", "getId", "()J", "setId", "(J)V", "F", "getWidth", "()F", "setWidth", "(F)V", "I", "getColor", "()I", "setColor", "(I)V", "getTextSize", "setTextSize", "getStyle", "setStyle", "getGeometryType", "setGeometryType", "Lio/objectbox/relation/ToOne;", "Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;", "record", "Lio/objectbox/relation/ToOne;", "getRecord", "()Lio/objectbox/relation/ToOne;", "setRecord", "(Lio/objectbox/relation/ToOne;)V", "Lio/objectbox/relation/ToMany;", "Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;", "pointList", "Lio/objectbox/relation/ToMany;", "getPointList", "()Lio/objectbox/relation/ToMany;", "setPointList", "(Lio/objectbox/relation/ToMany;)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Entity
/* loaded from: classes3.dex */
public final class GeometryInfoEntity {
    transient BoxStore __boxStore;
    private int color;
    private int geometryType;

    @InterfaceC5697Id
    private long id;
    public ToMany<GeometryPointFEntity> pointList;
    public ToOne<GeometryRecordEntity> record;
    private int style;
    private float textSize;
    private float width;

    public GeometryInfoEntity() {
        this(0L, 0.0f, 0, 0.0f, 0, 0, 63, null);
    }

    public final int getColor() {
        return this.color;
    }

    public final int getGeometryType() {
        return this.geometryType;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final ToMany<GeometryPointFEntity> getPointList() {
        ToMany<GeometryPointFEntity> toMany = this.pointList;
        if (toMany != null) {
            return toMany;
        }
        AbstractC5830k.m5339p("pointList");
        throw null;
    }

    @NotNull
    public final ToOne<GeometryRecordEntity> getRecord() {
        ToOne<GeometryRecordEntity> toOne = this.record;
        if (toOne != null) {
            return toOne;
        }
        AbstractC5830k.m5339p("record");
        throw null;
    }

    public final int getStyle() {
        return this.style;
    }

    public final float getTextSize() {
        return this.textSize;
    }

    public final float getWidth() {
        return this.width;
    }

    public final void put() {
        BoardBox.INSTANCE.getBoxStore().m5018c(GeometryInfoEntity.class).m5034e(this);
    }

    public final void remove() {
        BoardBox.INSTANCE.getBoxStore().m5018c(GeometryInfoEntity.class).m5039j(this);
    }

    public final void setColor(int i) {
        this.color = i;
    }

    public final void setGeometryType(int i) {
        this.geometryType = i;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setPointList(@NotNull ToMany<GeometryPointFEntity> toMany) {
        AbstractC5830k.m5330g(toMany, "<set-?>");
        this.pointList = toMany;
    }

    public final void setRecord(@NotNull ToOne<GeometryRecordEntity> toOne) {
        AbstractC5830k.m5330g(toOne, "<set-?>");
        this.record = toOne;
    }

    public final void setStyle(int i) {
        this.style = i;
    }

    public final void setTextSize(float f) {
        this.textSize = f;
    }

    public final void setWidth(float f) {
        this.width = f;
    }

    public GeometryInfoEntity(long j7, float f, int i, float f7, int i8, int i9) {
        this.pointList = new ToMany<>(this, GeometryInfoEntity_.pointList);
        this.record = new ToOne<>(this, GeometryInfoEntity_.record);
        this.id = j7;
        this.width = f;
        this.color = i;
        this.textSize = f7;
        this.style = i8;
        this.geometryType = i9;
    }

    public /* synthetic */ GeometryInfoEntity(long j7, float f, int i, float f7, int i8, int i9, int i10, AbstractC5824e abstractC5824e) {
        this((i10 & 1) != 0 ? 0L : j7, (i10 & 2) != 0 ? 0.0f : f, (i10 & 4) != 0 ? 0 : i, (i10 & 8) != 0 ? 0.0f : f7, (i10 & 16) != 0 ? 0 : i8, (i10 & 32) != 0 ? 0 : i9);
    }
}
