package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import com.taobao.accs.data.Message;
import io.objectbox.BoxStore;
import io.objectbox.annotation.Entity;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import na.C10341d;

@Entity
/* loaded from: classes5.dex */
public final class HeaderEntity {
    transient BoxStore __boxStore;
    public ToOne<AuthorEntity> author;
    private String convertUrl;
    private long createDate;
    private int defaultBackgroundColor;
    public ToOne<BackgroundLineConfigEntity> defaultBackgroundLineConfig;
    private long duration;
    private int height;

    /* renamed from: id */
    private long f18238id;
    private int lastBackgroundColor;
    public ToOne<BackgroundLineConfigEntity> lastBackgroundLineConfig;
    public ToOne<MoveConfigEntity> moveConfig;
    public ToOne<PageEntity> page;
    public ToMany<AuthorEntity> provider;
    private long updateDate;
    private int version;
    private int width;

    public HeaderEntity() {
        this(0L, 0, 0, 0, 0L, 0L, 0L, null, 0, 0, Message.EXT_HEADER_VALUE_MAX_LEN, null);
    }

    /* renamed from: a */
    public final ToOne m14144a() {
        ToOne<AuthorEntity> toOne = this.author;
        if (toOne != null) {
            return toOne;
        }
        AbstractC9979u.m20312y("author");
        return null;
    }

    /* renamed from: b */
    public final String m14145b() {
        return this.convertUrl;
    }

    /* renamed from: c */
    public final long m14146c() {
        return this.createDate;
    }

    /* renamed from: d */
    public final int m14147d() {
        return this.defaultBackgroundColor;
    }

    /* renamed from: e */
    public final ToOne m14148e() {
        ToOne<BackgroundLineConfigEntity> toOne = this.defaultBackgroundLineConfig;
        if (toOne != null) {
            return toOne;
        }
        AbstractC9979u.m20312y("defaultBackgroundLineConfig");
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderEntity)) {
            return false;
        }
        HeaderEntity headerEntity = (HeaderEntity) obj;
        return this.f18238id == headerEntity.f18238id && this.version == headerEntity.version && this.width == headerEntity.width && this.height == headerEntity.height && this.createDate == headerEntity.createDate && this.updateDate == headerEntity.updateDate && this.duration == headerEntity.duration && AbstractC9979u.m20289b(this.convertUrl, headerEntity.convertUrl) && this.defaultBackgroundColor == headerEntity.defaultBackgroundColor && this.lastBackgroundColor == headerEntity.lastBackgroundColor;
    }

    /* renamed from: f */
    public final long m14149f() {
        return this.duration;
    }

    /* renamed from: g */
    public final int m14150g() {
        return this.height;
    }

    /* renamed from: h */
    public final long m14151h() {
        return this.f18238id;
    }

    public int hashCode() {
        return (((((((((((((((((Long.hashCode(this.f18238id) * 31) + Integer.hashCode(this.version)) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + Long.hashCode(this.createDate)) * 31) + Long.hashCode(this.updateDate)) * 31) + Long.hashCode(this.duration)) * 31) + this.convertUrl.hashCode()) * 31) + Integer.hashCode(this.defaultBackgroundColor)) * 31) + Integer.hashCode(this.lastBackgroundColor);
    }

    /* renamed from: i */
    public final int m14152i() {
        return this.lastBackgroundColor;
    }

    /* renamed from: j */
    public final ToOne m14153j() {
        ToOne<BackgroundLineConfigEntity> toOne = this.lastBackgroundLineConfig;
        if (toOne != null) {
            return toOne;
        }
        AbstractC9979u.m20312y("lastBackgroundLineConfig");
        return null;
    }

    /* renamed from: k */
    public final ToOne m14154k() {
        ToOne<MoveConfigEntity> toOne = this.moveConfig;
        if (toOne != null) {
            return toOne;
        }
        AbstractC9979u.m20312y("moveConfig");
        return null;
    }

    /* renamed from: l */
    public final ToOne m14155l() {
        ToOne<PageEntity> toOne = this.page;
        if (toOne != null) {
            return toOne;
        }
        AbstractC9979u.m20312y("page");
        return null;
    }

    /* renamed from: m */
    public final ToMany m14156m() {
        ToMany<AuthorEntity> toMany = this.provider;
        if (toMany != null) {
            return toMany;
        }
        AbstractC9979u.m20312y("provider");
        return null;
    }

    /* renamed from: n */
    public final long m14157n() {
        return this.updateDate;
    }

    /* renamed from: o */
    public final int m14158o() {
        return this.version;
    }

    /* renamed from: p */
    public final int m14159p() {
        return this.width;
    }

    /* renamed from: q */
    public final void m14160q() {
        C10341d.f24644a.m21626f().m18954g(HeaderEntity.class).m19227m(this);
    }

    /* renamed from: r */
    public final void m14161r(long j10) {
        this.createDate = j10;
    }

    /* renamed from: s */
    public final void m14162s(int i10) {
        this.defaultBackgroundColor = i10;
    }

    /* renamed from: t */
    public final void m14163t(long j10) {
        this.duration = j10;
    }

    public String toString() {
        return "HeaderEntity(id=" + this.f18238id + ", version=" + this.version + ", width=" + this.width + ", height=" + this.height + ", createDate=" + this.createDate + ", updateDate=" + this.updateDate + ", duration=" + this.duration + ", convertUrl=" + this.convertUrl + ", defaultBackgroundColor=" + this.defaultBackgroundColor + ", lastBackgroundColor=" + this.lastBackgroundColor + ')';
    }

    /* renamed from: u */
    public final void m14164u(int i10) {
        this.height = i10;
    }

    /* renamed from: v */
    public final void m14165v(long j10) {
        this.f18238id = j10;
    }

    /* renamed from: w */
    public final void m14166w(int i10) {
        this.lastBackgroundColor = i10;
    }

    /* renamed from: x */
    public final void m14167x(long j10) {
        this.updateDate = j10;
    }

    /* renamed from: y */
    public final void m14168y(int i10) {
        this.width = i10;
    }

    public HeaderEntity(long j10, int i10, int i11, int i12, long j11, long j12, long j13, String convertUrl, int i13, int i14) {
        AbstractC9979u.m20294g(convertUrl, "convertUrl");
        this.provider = new ToMany<>(this, HeaderEntity_.f18256C);
        this.moveConfig = new ToOne<>(this, HeaderEntity_.f18255B);
        this.author = new ToOne<>(this, HeaderEntity_.f18254A);
        this.lastBackgroundLineConfig = new ToOne<>(this, HeaderEntity_.f18280z);
        this.defaultBackgroundLineConfig = new ToOne<>(this, HeaderEntity_.f18279y);
        this.page = new ToOne<>(this, HeaderEntity_.f18278x);
        this.f18238id = j10;
        this.version = i10;
        this.width = i11;
        this.height = i12;
        this.createDate = j11;
        this.updateDate = j12;
        this.duration = j13;
        this.convertUrl = convertUrl;
        this.defaultBackgroundColor = i13;
        this.lastBackgroundColor = i14;
    }

    public /* synthetic */ HeaderEntity(long j10, int i10, int i11, int i12, long j11, long j12, long j13, String str, int i13, int i14, int i15, AbstractC9972n abstractC9972n) {
        this((i15 & 1) != 0 ? 0L : j10, (i15 & 2) != 0 ? 6 : i10, (i15 & 4) != 0 ? 0 : i11, (i15 & 8) != 0 ? 0 : i12, (i15 & 16) != 0 ? 0L : j11, (i15 & 32) != 0 ? 0L : j12, (i15 & 64) == 0 ? j13 : 0L, (i15 & 128) != 0 ? "" : str, (i15 & 256) != 0 ? 0 : i13, (i15 & 512) != 0 ? 0 : i14);
    }
}
