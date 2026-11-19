package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import io.objectbox.BoxStore;
import io.objectbox.annotation.Entity;
import io.objectbox.relation.ToOne;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import na.C10341d;

@Entity
/* loaded from: classes5.dex */
public final class TextInfoEntity {
    transient BoxStore __boxStore;
    private int color;
    private String content;

    /* renamed from: id */
    private long f18411id;
    public ToOne<TextRecordEntity> record;
    private int style;
    private float textSize;
    private float width;

    public TextInfoEntity() {
        this(0L, 0.0f, 0, 0.0f, 0, null, 63, null);
    }

    /* renamed from: a */
    public final int m14287a() {
        return this.color;
    }

    /* renamed from: b */
    public final String m14288b() {
        return this.content;
    }

    /* renamed from: c */
    public final long m14289c() {
        return this.f18411id;
    }

    /* renamed from: d */
    public final ToOne m14290d() {
        ToOne<TextRecordEntity> toOne = this.record;
        if (toOne != null) {
            return toOne;
        }
        AbstractC9979u.m20312y("record");
        return null;
    }

    /* renamed from: e */
    public final int m14291e() {
        return this.style;
    }

    /* renamed from: f */
    public final float m14292f() {
        return this.textSize;
    }

    /* renamed from: g */
    public final float m14293g() {
        return this.width;
    }

    /* renamed from: h */
    public final void m14294h() {
        C10341d.f24644a.m21626f().m18954g(TextInfoEntity.class).m19227m(this);
    }

    /* renamed from: i */
    public final void m14295i(long j10) {
        this.f18411id = j10;
    }

    public TextInfoEntity(long j10, float f10, int i10, float f11, int i11, String content) {
        AbstractC9979u.m20294g(content, "content");
        this.record = new ToOne<>(this, TextInfoEntity_.f18432p);
        this.f18411id = j10;
        this.width = f10;
        this.color = i10;
        this.textSize = f11;
        this.style = i11;
        this.content = content;
    }

    public /* synthetic */ TextInfoEntity(long j10, float f10, int i10, float f11, int i11, String str, int i12, AbstractC9972n abstractC9972n) {
        this((i12 & 1) != 0 ? 0L : j10, (i12 & 2) != 0 ? 0.0f : f10, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) == 0 ? f11 : 0.0f, (i12 & 16) == 0 ? i11 : 0, (i12 & 32) != 0 ? "" : str);
    }
}
