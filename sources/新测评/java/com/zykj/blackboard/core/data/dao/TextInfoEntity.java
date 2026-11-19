package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.objectbox.BoxStore;
import io.objectbox.annotation.Entity;
import io.objectbox.relation.ToOne;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p077e5.C7342c;

@Metadata(m13557d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0016\u001a\u0004\b \u0010\u0018\"\u0004\b!\u0010\u001aR\"\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00061"}, m13558d2 = {"Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;", "", "", "id", "", "width", "", TypedValues.Custom.S_COLOR, "textSize", "style", "", "content", "<init>", "(JFIFILjava/lang/String;)V", "", "h", "()V", "J", "c", "()J", "i", "(J)V", "F", "g", "()F", "setWidth", "(F)V", "I", "a", "()I", "setColor", "(I)V", "f", "setTextSize", "e", "setStyle", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "Lio/objectbox/relation/ToOne;", "Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;", "record", "Lio/objectbox/relation/ToOne;", "d", "()Lio/objectbox/relation/ToOne;", "setRecord", "(Lio/objectbox/relation/ToOne;)V", "blackboard_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
@Entity
/* loaded from: classes4.dex */
public final class TextInfoEntity {
    transient BoxStore __boxStore;
    private int color;
    private String content;
    private long id;
    public ToOne<TextRecordEntity> record;
    private int style;
    private float textSize;
    private float width;

    public TextInfoEntity() {
        this(0L, 0.0f, 0, 0.0f, 0, null, 63, null);
    }

    /* renamed from: a, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* renamed from: b, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: c, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: d */
    public final ToOne m6560d() {
        ToOne<TextRecordEntity> toOne = this.record;
        if (toOne != null) {
            return toOne;
        }
        Intrinsics.throwUninitializedPropertyAccessException("record");
        return null;
    }

    /* renamed from: e, reason: from getter */
    public final int getStyle() {
        return this.style;
    }

    /* renamed from: f, reason: from getter */
    public final float getTextSize() {
        return this.textSize;
    }

    /* renamed from: g, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    /* renamed from: h */
    public final void m6564h() {
        C7342c.f11908a.m11744b().m12981h(TextInfoEntity.class).m15045l(this);
    }

    /* renamed from: i */
    public final void m6565i(long j10) {
        this.id = j10;
    }

    public TextInfoEntity(long j10, float f10, int i10, float f11, int i11, String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.record = new ToOne<>(this, TextInfoEntity_.f7589n);
        this.id = j10;
        this.width = f10;
        this.color = i10;
        this.textSize = f11;
        this.style = i11;
        this.content = content;
    }

    public /* synthetic */ TextInfoEntity(long j10, float f10, int i10, float f11, int i11, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0L : j10, (i12 & 2) != 0 ? 0.0f : f10, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) == 0 ? f11 : 0.0f, (i12 & 16) == 0 ? i11 : 0, (i12 & 32) != 0 ? "" : str);
    }
}
