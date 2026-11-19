package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.objectbox.BoxStore;
import io.objectbox.annotation.Entity;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p077e5.C7342c;

@Metadata(m13557d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010$R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010!\u001a\u0004\b%\u0010\u0017\"\u0004\b&\u0010$R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010!\u001a\u0004\b'\u0010\u0017\"\u0004\b(\u0010$R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001c\u001a\u0004\b)\u0010\u001e\"\u0004\b*\u0010 R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001c\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010 R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001c\u001a\u0004\b-\u0010\u001e\"\u0004\b.\u0010 R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010/\u001a\u0004\b0\u0010\u0015\"\u0004\b1\u00102R\"\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010!\u001a\u0004\b3\u0010\u0017\"\u0004\b4\u0010$R\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010!\u001a\u0004\b5\u0010\u0017\"\u0004\b6\u0010$R(\u00109\u001a\b\u0012\u0004\u0012\u000208078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R(\u0010@\u001a\b\u0012\u0004\u0012\u00020?078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010:\u001a\u0004\bA\u0010<\"\u0004\bB\u0010>R(\u0010C\u001a\b\u0012\u0004\u0012\u00020?078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010:\u001a\u0004\bD\u0010<\"\u0004\bE\u0010>R(\u0010G\u001a\b\u0012\u0004\u0012\u00020F078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010:\u001a\u0004\bH\u0010<\"\u0004\bI\u0010>R(\u0010K\u001a\b\u0012\u0004\u0012\u00020F0J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR(\u0010R\u001a\b\u0012\u0004\u0012\u00020Q078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010:\u001a\u0004\bS\u0010<\"\u0004\bT\u0010>¨\u0006U"}, m13558d2 = {"Lcom/zykj/blackboard/core/data/dao/HeaderEntity;", "", "", "id", "", "version", "width", "height", "createDate", "updateDate", TypedValues.TransitionType.S_DURATION, "", "convertUrl", "defaultBackgroundColor", "lastBackgroundColor", "<init>", "(JIIIJJJLjava/lang/String;II)V", "", "q", "()V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "h", "()J", "v", "(J)V", "I", "o", "setVersion", "(I)V", "p", "x", "g", "u", "c", "r", "n", "setUpdateDate", "f", "t", "Ljava/lang/String;", "b", "setConvertUrl", "(Ljava/lang/String;)V", "d", "s", "i", "w", "Lio/objectbox/relation/ToOne;", "Lcom/zykj/blackboard/core/data/dao/PageEntity;", "page", "Lio/objectbox/relation/ToOne;", "l", "()Lio/objectbox/relation/ToOne;", "setPage", "(Lio/objectbox/relation/ToOne;)V", "Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;", "defaultBackgroundLineConfig", "e", "setDefaultBackgroundLineConfig", "lastBackgroundLineConfig", "j", "setLastBackgroundLineConfig", "Lcom/zykj/blackboard/core/data/dao/AuthorEntity;", "author", "a", "setAuthor", "Lio/objectbox/relation/ToMany;", "provider", "Lio/objectbox/relation/ToMany;", "m", "()Lio/objectbox/relation/ToMany;", "setProvider", "(Lio/objectbox/relation/ToMany;)V", "Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;", "moveConfig", "k", "setMoveConfig", "blackboard_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
@Entity
/* loaded from: classes4.dex */
public final /* data */ class HeaderEntity {
    transient BoxStore __boxStore;
    public ToOne<AuthorEntity> author;
    private String convertUrl;
    private long createDate;
    private int defaultBackgroundColor;
    public ToOne<BackgroundLineConfigEntity> defaultBackgroundLineConfig;
    private long duration;
    private int height;
    private long id;
    private int lastBackgroundColor;
    public ToOne<BackgroundLineConfigEntity> lastBackgroundLineConfig;
    public ToOne<MoveConfigEntity> moveConfig;
    public ToOne<PageEntity> page;
    public ToMany<AuthorEntity> provider;
    private long updateDate;
    private int version;
    private int width;

    public HeaderEntity() {
        this(0L, 0, 0, 0, 0L, 0L, 0L, null, 0, 0, 1023, null);
    }

    /* renamed from: a */
    public final ToOne m6417a() {
        ToOne<AuthorEntity> toOne = this.author;
        if (toOne != null) {
            return toOne;
        }
        Intrinsics.throwUninitializedPropertyAccessException("author");
        return null;
    }

    /* renamed from: b, reason: from getter */
    public final String getConvertUrl() {
        return this.convertUrl;
    }

    /* renamed from: c, reason: from getter */
    public final long getCreateDate() {
        return this.createDate;
    }

    /* renamed from: d, reason: from getter */
    public final int getDefaultBackgroundColor() {
        return this.defaultBackgroundColor;
    }

    /* renamed from: e */
    public final ToOne m6421e() {
        ToOne<BackgroundLineConfigEntity> toOne = this.defaultBackgroundLineConfig;
        if (toOne != null) {
            return toOne;
        }
        Intrinsics.throwUninitializedPropertyAccessException("defaultBackgroundLineConfig");
        return null;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderEntity)) {
            return false;
        }
        HeaderEntity headerEntity = (HeaderEntity) other;
        return this.id == headerEntity.id && this.version == headerEntity.version && this.width == headerEntity.width && this.height == headerEntity.height && this.createDate == headerEntity.createDate && this.updateDate == headerEntity.updateDate && this.duration == headerEntity.duration && Intrinsics.areEqual(this.convertUrl, headerEntity.convertUrl) && this.defaultBackgroundColor == headerEntity.defaultBackgroundColor && this.lastBackgroundColor == headerEntity.lastBackgroundColor;
    }

    /* renamed from: f, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* renamed from: g, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: h, reason: from getter */
    public final long getId() {
        return this.id;
    }

    public int hashCode() {
        return (((((((((((((((((Long.hashCode(this.id) * 31) + Integer.hashCode(this.version)) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + Long.hashCode(this.createDate)) * 31) + Long.hashCode(this.updateDate)) * 31) + Long.hashCode(this.duration)) * 31) + this.convertUrl.hashCode()) * 31) + Integer.hashCode(this.defaultBackgroundColor)) * 31) + Integer.hashCode(this.lastBackgroundColor);
    }

    /* renamed from: i, reason: from getter */
    public final int getLastBackgroundColor() {
        return this.lastBackgroundColor;
    }

    /* renamed from: j */
    public final ToOne m6426j() {
        ToOne<BackgroundLineConfigEntity> toOne = this.lastBackgroundLineConfig;
        if (toOne != null) {
            return toOne;
        }
        Intrinsics.throwUninitializedPropertyAccessException("lastBackgroundLineConfig");
        return null;
    }

    /* renamed from: k */
    public final ToOne m6427k() {
        ToOne<MoveConfigEntity> toOne = this.moveConfig;
        if (toOne != null) {
            return toOne;
        }
        Intrinsics.throwUninitializedPropertyAccessException("moveConfig");
        return null;
    }

    /* renamed from: l */
    public final ToOne m6428l() {
        ToOne<PageEntity> toOne = this.page;
        if (toOne != null) {
            return toOne;
        }
        Intrinsics.throwUninitializedPropertyAccessException("page");
        return null;
    }

    /* renamed from: m */
    public final ToMany m6429m() {
        ToMany<AuthorEntity> toMany = this.provider;
        if (toMany != null) {
            return toMany;
        }
        Intrinsics.throwUninitializedPropertyAccessException("provider");
        return null;
    }

    /* renamed from: n, reason: from getter */
    public final long getUpdateDate() {
        return this.updateDate;
    }

    /* renamed from: o, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* renamed from: p, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: q */
    public final void m6433q() {
        C7342c.f11908a.m11744b().m12981h(HeaderEntity.class).m15045l(this);
    }

    /* renamed from: r */
    public final void m6434r(long j10) {
        this.createDate = j10;
    }

    /* renamed from: s */
    public final void m6435s(int i10) {
        this.defaultBackgroundColor = i10;
    }

    /* renamed from: t */
    public final void m6436t(long j10) {
        this.duration = j10;
    }

    public String toString() {
        return "HeaderEntity(id=" + this.id + ", version=" + this.version + ", width=" + this.width + ", height=" + this.height + ", createDate=" + this.createDate + ", updateDate=" + this.updateDate + ", duration=" + this.duration + ", convertUrl=" + this.convertUrl + ", defaultBackgroundColor=" + this.defaultBackgroundColor + ", lastBackgroundColor=" + this.lastBackgroundColor + ')';
    }

    /* renamed from: u */
    public final void m6437u(int i10) {
        this.height = i10;
    }

    /* renamed from: v */
    public final void m6438v(long j10) {
        this.id = j10;
    }

    /* renamed from: w */
    public final void m6439w(int i10) {
        this.lastBackgroundColor = i10;
    }

    /* renamed from: x */
    public final void m6440x(int i10) {
        this.width = i10;
    }

    public HeaderEntity(long j10, int i10, int i11, int i12, long j11, long j12, long j13, String convertUrl, int i13, int i14) {
        Intrinsics.checkNotNullParameter(convertUrl, "convertUrl");
        this.provider = new ToMany<>(this, HeaderEntity_.f7411A);
        this.moveConfig = new ToOne<>(this, HeaderEntity_.f7437z);
        this.author = new ToOne<>(this, HeaderEntity_.f7436y);
        this.lastBackgroundLineConfig = new ToOne<>(this, HeaderEntity_.f7435x);
        this.defaultBackgroundLineConfig = new ToOne<>(this, HeaderEntity_.f7434w);
        this.page = new ToOne<>(this, HeaderEntity_.f7433v);
        this.id = j10;
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

    public /* synthetic */ HeaderEntity(long j10, int i10, int i11, int i12, long j11, long j12, long j13, String str, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? 0L : j10, (i15 & 2) != 0 ? 6 : i10, (i15 & 4) != 0 ? 0 : i11, (i15 & 8) != 0 ? 0 : i12, (i15 & 16) != 0 ? 0L : j11, (i15 & 32) != 0 ? 0L : j12, (i15 & 64) == 0 ? j13 : 0L, (i15 & 128) != 0 ? "" : str, (i15 & 256) != 0 ? 0 : i13, (i15 & 512) != 0 ? 0 : i14);
    }
}
