package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import androidx.collection.AbstractC0584a;
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
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015JV\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b!\u0010\u0017J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0013\"\u0004\b(\u0010)R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0015\"\u0004\b,\u0010-R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u0017\"\u0004\b0\u00101R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010*\u001a\u0004\b2\u0010\u0015\"\u0004\b3\u0010-R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010*\u001a\u0004\b4\u0010\u0015\"\u0004\b5\u0010-R\"\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010.\u001a\u0004\b6\u0010\u0017\"\u0004\b7\u00101R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010*\u001a\u0004\b8\u0010\u0015\"\u0004\b9\u0010-R(\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR(\u0010D\u001a\b\u0012\u0004\u0012\u00020C0B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010I¨\u0006J"}, m5110d2 = {"Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;", "", "", "id", "", "width", "", TypedValues.Custom.S_COLOR, "spacing", "itemLength", "style", "textSize", "<init>", "(JFIFFIF)V", "Ld6/s;", "put", "()V", "remove", "component1", "()J", "component2", "()F", "component3", "()I", "component4", "component5", "component6", "component7", "copy", "(JFIFFIF)Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "setId", "(J)V", "F", "getWidth", "setWidth", "(F)V", "I", "getColor", "setColor", "(I)V", "getSpacing", "setSpacing", "getItemLength", "setItemLength", "getStyle", "setStyle", "getTextSize", "setTextSize", "Lio/objectbox/relation/ToOne;", "Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;", "record", "Lio/objectbox/relation/ToOne;", "getRecord", "()Lio/objectbox/relation/ToOne;", "setRecord", "(Lio/objectbox/relation/ToOne;)V", "Lio/objectbox/relation/ToMany;", "Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;", "touchInfoList", "Lio/objectbox/relation/ToMany;", "getTouchInfoList", "()Lio/objectbox/relation/ToMany;", "setTouchInfoList", "(Lio/objectbox/relation/ToMany;)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Entity
/* loaded from: classes3.dex */
public final /* data */ class TouchEventEntity {
    transient BoxStore __boxStore;
    private int color;

    @InterfaceC5697Id
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

    public static /* synthetic */ TouchEventEntity copy$default(TouchEventEntity touchEventEntity, long j7, float f, int i, float f7, float f8, int i8, float f9, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            j7 = touchEventEntity.id;
        }
        long j8 = j7;
        if ((i9 & 2) != 0) {
            f = touchEventEntity.width;
        }
        float f10 = f;
        if ((i9 & 4) != 0) {
            i = touchEventEntity.color;
        }
        int i10 = i;
        if ((i9 & 8) != 0) {
            f7 = touchEventEntity.spacing;
        }
        float f11 = f7;
        if ((i9 & 16) != 0) {
            f8 = touchEventEntity.itemLength;
        }
        return touchEventEntity.copy(j8, f10, i10, f11, f8, (i9 & 32) != 0 ? touchEventEntity.style : i8, (i9 & 64) != 0 ? touchEventEntity.textSize : f9);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    /* renamed from: component3, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* renamed from: component4, reason: from getter */
    public final float getSpacing() {
        return this.spacing;
    }

    /* renamed from: component5, reason: from getter */
    public final float getItemLength() {
        return this.itemLength;
    }

    /* renamed from: component6, reason: from getter */
    public final int getStyle() {
        return this.style;
    }

    /* renamed from: component7, reason: from getter */
    public final float getTextSize() {
        return this.textSize;
    }

    @NotNull
    public final TouchEventEntity copy(long id, float width, int color, float spacing, float itemLength, int style, float textSize) {
        return new TouchEventEntity(id, width, color, spacing, itemLength, style, textSize);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TouchEventEntity)) {
            return false;
        }
        TouchEventEntity touchEventEntity = (TouchEventEntity) other;
        return this.id == touchEventEntity.id && Float.valueOf(this.width).equals(Float.valueOf(touchEventEntity.width)) && this.color == touchEventEntity.color && Float.valueOf(this.spacing).equals(Float.valueOf(touchEventEntity.spacing)) && Float.valueOf(this.itemLength).equals(Float.valueOf(touchEventEntity.itemLength)) && this.style == touchEventEntity.style && Float.valueOf(this.textSize).equals(Float.valueOf(touchEventEntity.textSize));
    }

    public final int getColor() {
        return this.color;
    }

    public final long getId() {
        return this.id;
    }

    public final float getItemLength() {
        return this.itemLength;
    }

    @NotNull
    public final ToOne<TouchRecordEntity> getRecord() {
        ToOne<TouchRecordEntity> toOne = this.record;
        if (toOne != null) {
            return toOne;
        }
        AbstractC5830k.m5339p("record");
        throw null;
    }

    public final float getSpacing() {
        return this.spacing;
    }

    public final int getStyle() {
        return this.style;
    }

    public final float getTextSize() {
        return this.textSize;
    }

    @NotNull
    public final ToMany<TouchInfoEntity> getTouchInfoList() {
        ToMany<TouchInfoEntity> toMany = this.touchInfoList;
        if (toMany != null) {
            return toMany;
        }
        AbstractC5830k.m5339p("touchInfoList");
        throw null;
    }

    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Float.hashCode(this.textSize) + AbstractC0584a.m902c(this.style, AbstractC0584a.m901b(this.itemLength, AbstractC0584a.m901b(this.spacing, AbstractC0584a.m902c(this.color, AbstractC0584a.m901b(this.width, Long.hashCode(this.id) * 31, 31), 31), 31), 31), 31);
    }

    public final void put() {
        BoardBox.INSTANCE.getBoxStore().m5018c(TouchEventEntity.class).m5034e(this);
    }

    public final void remove() {
        BoardBox.INSTANCE.getBoxStore().m5018c(TouchEventEntity.class).m5039j(this);
    }

    public final void setColor(int i) {
        this.color = i;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setItemLength(float f) {
        this.itemLength = f;
    }

    public final void setRecord(@NotNull ToOne<TouchRecordEntity> toOne) {
        AbstractC5830k.m5330g(toOne, "<set-?>");
        this.record = toOne;
    }

    public final void setSpacing(float f) {
        this.spacing = f;
    }

    public final void setStyle(int i) {
        this.style = i;
    }

    public final void setTextSize(float f) {
        this.textSize = f;
    }

    public final void setTouchInfoList(@NotNull ToMany<TouchInfoEntity> toMany) {
        AbstractC5830k.m5330g(toMany, "<set-?>");
        this.touchInfoList = toMany;
    }

    public final void setWidth(float f) {
        this.width = f;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("TouchEventEntity(id=");
        sb.append(this.id);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", color=");
        sb.append(this.color);
        sb.append(", spacing=");
        sb.append(this.spacing);
        sb.append(", itemLength=");
        sb.append(this.itemLength);
        sb.append(", style=");
        sb.append(this.style);
        sb.append(", textSize=");
        return AbstractC0584a.m915p(sb, this.textSize, ')');
    }

    public TouchEventEntity(long j7, float f, int i, float f7, float f8, int i8, float f9) {
        this.touchInfoList = new ToMany<>(this, TouchEventEntity_.touchInfoList);
        this.record = new ToOne<>(this, TouchEventEntity_.record);
        this.id = j7;
        this.width = f;
        this.color = i;
        this.spacing = f7;
        this.itemLength = f8;
        this.style = i8;
        this.textSize = f9;
    }

    public /* synthetic */ TouchEventEntity(long j7, float f, int i, float f7, float f8, int i8, float f9, int i9, AbstractC5824e abstractC5824e) {
        this((i9 & 1) != 0 ? 0L : j7, (i9 & 2) != 0 ? 0.0f : f, (i9 & 4) != 0 ? 0 : i, (i9 & 8) != 0 ? 0.0f : f7, (i9 & 16) != 0 ? 0.0f : f8, (i9 & 32) != 0 ? 0 : i8, (i9 & 64) != 0 ? 0.0f : f9);
    }
}
