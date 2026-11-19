package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import com.zykj.blackboard.utils.BoardBox;
import io.objectbox.BoxStore;
import io.objectbox.annotation.Entity;
import io.objectbox.relation.ToOne;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@Entity
/* loaded from: classes4.dex */
public final class TextInfoEntity {
    transient BoxStore __boxStore;
    private int color;
    private String content;

    /* renamed from: id */
    private long f8750id;
    public ToOne<TextRecordEntity> record;
    private int style;
    private float textSize;
    private float width;

    public TextInfoEntity() {
        this(0L, 0.0f, 0, 0.0f, 0, null, 63, null);
    }

    public final int getColor() {
        return this.color;
    }

    public final String getContent() {
        return this.content;
    }

    public final long getId() {
        return this.f8750id;
    }

    public final ToOne<TextRecordEntity> getRecord() {
        ToOne<TextRecordEntity> toOne = this.record;
        if (toOne != null) {
            return toOne;
        }
        AbstractC9133u.m16151y("record");
        return null;
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
        BoardBox.INSTANCE.getBoxStore().m15370d(TextInfoEntity.class).m15414l(this);
    }

    public final void remove() {
        BoardBox.INSTANCE.getBoxStore().m15370d(TextInfoEntity.class).m15422t(this);
    }

    public final void setColor(int i10) {
        this.color = i10;
    }

    public final void setContent(String str) {
        AbstractC9133u.m16133g(str, "<set-?>");
        this.content = str;
    }

    public final void setId(long j10) {
        this.f8750id = j10;
    }

    public final void setRecord(ToOne<TextRecordEntity> toOne) {
        AbstractC9133u.m16133g(toOne, "<set-?>");
        this.record = toOne;
    }

    public final void setStyle(int i10) {
        this.style = i10;
    }

    public final void setTextSize(float f10) {
        this.textSize = f10;
    }

    public final void setWidth(float f10) {
        this.width = f10;
    }

    public TextInfoEntity(long j10, float f10, int i10, float f11, int i11, String content) {
        AbstractC9133u.m16133g(content, "content");
        this.record = new ToOne<>(this, TextInfoEntity_.record);
        this.f8750id = j10;
        this.width = f10;
        this.color = i10;
        this.textSize = f11;
        this.style = i11;
        this.content = content;
    }

    public /* synthetic */ TextInfoEntity(long j10, float f10, int i10, float f11, int i11, String str, int i12, AbstractC9126n abstractC9126n) {
        this((i12 & 1) != 0 ? 0L : j10, (i12 & 2) != 0 ? 0.0f : f10, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) == 0 ? f11 : 0.0f, (i12 & 16) == 0 ? i11 : 0, (i12 & 32) != 0 ? "" : str);
    }
}
