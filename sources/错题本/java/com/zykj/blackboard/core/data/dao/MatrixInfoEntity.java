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

@Metadata(m5109d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J~\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0016\"\u0004\b0\u00101R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010.\u001a\u0004\b2\u0010\u0016\"\u0004\b3\u00101R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u00104\u001a\u0004\b5\u0010\u0019\"\u0004\b6\u00107R\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u00104\u001a\u0004\b8\u0010\u0019\"\u0004\b9\u00107R\"\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u00104\u001a\u0004\b:\u0010\u0019\"\u0004\b;\u00107R\"\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u00104\u001a\u0004\b<\u0010\u0019\"\u0004\b=\u00107R\"\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u00104\u001a\u0004\b>\u0010\u0019\"\u0004\b?\u00107R\"\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u00104\u001a\u0004\b@\u0010\u0019\"\u0004\bA\u00107R\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u00104\u001a\u0004\bB\u0010\u0019\"\u0004\bC\u00107R\"\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u00104\u001a\u0004\bD\u0010\u0019\"\u0004\bE\u00107R\"\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u00104\u001a\u0004\bF\u0010\u0019\"\u0004\bG\u00107R(\u0010J\u001a\b\u0012\u0004\u0012\u00020I0H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010O¨\u0006P"}, m5110d2 = {"Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;", "", "", "id", "eventTime", "", "scaleX", "skewX", "transX", "skewY", "scaleY", "transY", "perSp0", "perSp1", "perSp2", "<init>", "(JJFFFFFFFFF)V", "Ld6/s;", "put", "()V", "remove", "component1", "()J", "component2", "component3", "()F", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(JJFFFFFFFFF)Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "setId", "(J)V", "getEventTime", "setEventTime", "F", "getScaleX", "setScaleX", "(F)V", "getSkewX", "setSkewX", "getTransX", "setTransX", "getSkewY", "setSkewY", "getScaleY", "setScaleY", "getTransY", "setTransY", "getPerSp0", "setPerSp0", "getPerSp1", "setPerSp1", "getPerSp2", "setPerSp2", "Lio/objectbox/relation/ToOne;", "Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;", "record", "Lio/objectbox/relation/ToOne;", "getRecord", "()Lio/objectbox/relation/ToOne;", "setRecord", "(Lio/objectbox/relation/ToOne;)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Entity
/* loaded from: classes3.dex */
public final /* data */ class MatrixInfoEntity {
    transient BoxStore __boxStore;
    private long eventTime;

    @InterfaceC5697Id
    private long id;
    private float perSp0;
    private float perSp1;
    private float perSp2;
    public ToOne<MatrixEventEntity> record;
    private float scaleX;
    private float scaleY;
    private float skewX;
    private float skewY;
    private float transX;
    private float transY;

    public MatrixInfoEntity() {
        this(0L, 0L, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2047, null);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final float getPerSp1() {
        return this.perSp1;
    }

    /* renamed from: component11, reason: from getter */
    public final float getPerSp2() {
        return this.perSp2;
    }

    /* renamed from: component2, reason: from getter */
    public final long getEventTime() {
        return this.eventTime;
    }

    /* renamed from: component3, reason: from getter */
    public final float getScaleX() {
        return this.scaleX;
    }

    /* renamed from: component4, reason: from getter */
    public final float getSkewX() {
        return this.skewX;
    }

    /* renamed from: component5, reason: from getter */
    public final float getTransX() {
        return this.transX;
    }

    /* renamed from: component6, reason: from getter */
    public final float getSkewY() {
        return this.skewY;
    }

    /* renamed from: component7, reason: from getter */
    public final float getScaleY() {
        return this.scaleY;
    }

    /* renamed from: component8, reason: from getter */
    public final float getTransY() {
        return this.transY;
    }

    /* renamed from: component9, reason: from getter */
    public final float getPerSp0() {
        return this.perSp0;
    }

    @NotNull
    public final MatrixInfoEntity copy(long id, long eventTime, float scaleX, float skewX, float transX, float skewY, float scaleY, float transY, float perSp0, float perSp1, float perSp2) {
        return new MatrixInfoEntity(id, eventTime, scaleX, skewX, transX, skewY, scaleY, transY, perSp0, perSp1, perSp2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatrixInfoEntity)) {
            return false;
        }
        MatrixInfoEntity matrixInfoEntity = (MatrixInfoEntity) other;
        return this.id == matrixInfoEntity.id && this.eventTime == matrixInfoEntity.eventTime && Float.valueOf(this.scaleX).equals(Float.valueOf(matrixInfoEntity.scaleX)) && Float.valueOf(this.skewX).equals(Float.valueOf(matrixInfoEntity.skewX)) && Float.valueOf(this.transX).equals(Float.valueOf(matrixInfoEntity.transX)) && Float.valueOf(this.skewY).equals(Float.valueOf(matrixInfoEntity.skewY)) && Float.valueOf(this.scaleY).equals(Float.valueOf(matrixInfoEntity.scaleY)) && Float.valueOf(this.transY).equals(Float.valueOf(matrixInfoEntity.transY)) && Float.valueOf(this.perSp0).equals(Float.valueOf(matrixInfoEntity.perSp0)) && Float.valueOf(this.perSp1).equals(Float.valueOf(matrixInfoEntity.perSp1)) && Float.valueOf(this.perSp2).equals(Float.valueOf(matrixInfoEntity.perSp2));
    }

    public final long getEventTime() {
        return this.eventTime;
    }

    public final long getId() {
        return this.id;
    }

    public final float getPerSp0() {
        return this.perSp0;
    }

    public final float getPerSp1() {
        return this.perSp1;
    }

    public final float getPerSp2() {
        return this.perSp2;
    }

    @NotNull
    public final ToOne<MatrixEventEntity> getRecord() {
        ToOne<MatrixEventEntity> toOne = this.record;
        if (toOne != null) {
            return toOne;
        }
        AbstractC5830k.m5339p("record");
        throw null;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final float getSkewX() {
        return this.skewX;
    }

    public final float getSkewY() {
        return this.skewY;
    }

    public final float getTransX() {
        return this.transX;
    }

    public final float getTransY() {
        return this.transY;
    }

    public int hashCode() {
        return Float.hashCode(this.perSp2) + AbstractC0584a.m901b(this.perSp1, AbstractC0584a.m901b(this.perSp0, AbstractC0584a.m901b(this.transY, AbstractC0584a.m901b(this.scaleY, AbstractC0584a.m901b(this.skewY, AbstractC0584a.m901b(this.transX, AbstractC0584a.m901b(this.skewX, AbstractC0584a.m901b(this.scaleX, AbstractC0584a.m897B(this.eventTime, Long.hashCode(this.id) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final void put() {
        BoardBox.INSTANCE.getBoxStore().m5018c(MatrixInfoEntity.class).m5034e(this);
    }

    public final void remove() {
        BoardBox.INSTANCE.getBoxStore().m5018c(MatrixInfoEntity.class).m5039j(this);
    }

    public final void setEventTime(long j7) {
        this.eventTime = j7;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setPerSp0(float f) {
        this.perSp0 = f;
    }

    public final void setPerSp1(float f) {
        this.perSp1 = f;
    }

    public final void setPerSp2(float f) {
        this.perSp2 = f;
    }

    public final void setRecord(@NotNull ToOne<MatrixEventEntity> toOne) {
        AbstractC5830k.m5330g(toOne, "<set-?>");
        this.record = toOne;
    }

    public final void setScaleX(float f) {
        this.scaleX = f;
    }

    public final void setScaleY(float f) {
        this.scaleY = f;
    }

    public final void setSkewX(float f) {
        this.skewX = f;
    }

    public final void setSkewY(float f) {
        this.skewY = f;
    }

    public final void setTransX(float f) {
        this.transX = f;
    }

    public final void setTransY(float f) {
        this.transY = f;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("MatrixInfoEntity(id=");
        sb.append(this.id);
        sb.append(", eventTime=");
        sb.append(this.eventTime);
        sb.append(", scaleX=");
        sb.append(this.scaleX);
        sb.append(", skewX=");
        sb.append(this.skewX);
        sb.append(", transX=");
        sb.append(this.transX);
        sb.append(", skewY=");
        sb.append(this.skewY);
        sb.append(", scaleY=");
        sb.append(this.scaleY);
        sb.append(", transY=");
        sb.append(this.transY);
        sb.append(", perSp0=");
        sb.append(this.perSp0);
        sb.append(", perSp1=");
        sb.append(this.perSp1);
        sb.append(", perSp2=");
        return AbstractC0584a.m915p(sb, this.perSp2, ')');
    }

    public MatrixInfoEntity(long j7, long j8, float f, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14) {
        this.record = new ToOne<>(this, MatrixInfoEntity_.record);
        this.id = j7;
        this.eventTime = j8;
        this.scaleX = f;
        this.skewX = f7;
        this.transX = f8;
        this.skewY = f9;
        this.scaleY = f10;
        this.transY = f11;
        this.perSp0 = f12;
        this.perSp1 = f13;
        this.perSp2 = f14;
    }

    public /* synthetic */ MatrixInfoEntity(long j7, long j8, float f, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? 0L : j7, (i & 2) == 0 ? j8 : 0L, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? 0.0f : f7, (i & 16) != 0 ? 0.0f : f8, (i & 32) != 0 ? 0.0f : f9, (i & 64) != 0 ? 0.0f : f10, (i & 128) != 0 ? 0.0f : f11, (i & 256) != 0 ? 0.0f : f12, (i & 512) != 0 ? 0.0f : f13, (i & 1024) != 0 ? 0.0f : f14);
    }
}
