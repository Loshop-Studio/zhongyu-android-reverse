package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import androidx.constraintlayout.core.motion.utils.TypedValues;
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

@Metadata(m5109d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0017\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010\u001bR\"\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001c\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R(\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00062"}, m5110d2 = {"Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;", "", "", "id", "", "width", "", TypedValues.Custom.S_COLOR, "textSize", "style", "", "content", "<init>", "(JFIFILjava/lang/String;)V", "Ld6/s;", "put", "()V", "remove", "J", "getId", "()J", "setId", "(J)V", "F", "getWidth", "()F", "setWidth", "(F)V", "I", "getColor", "()I", "setColor", "(I)V", "getTextSize", "setTextSize", "getStyle", "setStyle", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "Lio/objectbox/relation/ToOne;", "Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;", "record", "Lio/objectbox/relation/ToOne;", "getRecord", "()Lio/objectbox/relation/ToOne;", "setRecord", "(Lio/objectbox/relation/ToOne;)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Entity
/* loaded from: classes3.dex */
public final class TextInfoEntity {
    transient BoxStore __boxStore;
    private int color;

    @NotNull
    private String content;

    @InterfaceC5697Id
    private long id;
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

    @NotNull
    public final String getContent() {
        return this.content;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final ToOne<TextRecordEntity> getRecord() {
        ToOne<TextRecordEntity> toOne = this.record;
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
        BoardBox.INSTANCE.getBoxStore().m5018c(TextInfoEntity.class).m5034e(this);
    }

    public final void remove() {
        BoardBox.INSTANCE.getBoxStore().m5018c(TextInfoEntity.class).m5039j(this);
    }

    public final void setColor(int i) {
        this.color = i;
    }

    public final void setContent(@NotNull String str) {
        AbstractC5830k.m5330g(str, "<set-?>");
        this.content = str;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setRecord(@NotNull ToOne<TextRecordEntity> toOne) {
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

    public TextInfoEntity(long j7, float f, int i, float f7, int i8, @NotNull String content) {
        AbstractC5830k.m5330g(content, "content");
        this.record = new ToOne<>(this, TextInfoEntity_.record);
        this.id = j7;
        this.width = f;
        this.color = i;
        this.textSize = f7;
        this.style = i8;
        this.content = content;
    }

    public /* synthetic */ TextInfoEntity(long j7, float f, int i, float f7, int i8, String str, int i9, AbstractC5824e abstractC5824e) {
        this((i9 & 1) != 0 ? 0L : j7, (i9 & 2) != 0 ? 0.0f : f, (i9 & 4) != 0 ? 0 : i, (i9 & 8) == 0 ? f7 : 0.0f, (i9 & 16) == 0 ? i8 : 0, (i9 & 32) != 0 ? "" : str);
    }
}
