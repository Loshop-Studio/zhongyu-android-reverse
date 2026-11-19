package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import com.tencent.liteav.TXLiteAVCode;
import com.zykj.blackboard.utils.BoardBox;
import io.objectbox.BoxStore;
import io.objectbox.annotation.Entity;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@Entity
/* loaded from: classes4.dex */
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
    private long f8736id;
    private int lastBackgroundColor;
    public ToOne<BackgroundLineConfigEntity> lastBackgroundLineConfig;
    public ToOne<MoveConfigEntity> moveConfig;
    public ToOne<PageEntity> page;
    public ToMany<AuthorEntity> provider;
    private long updateDate;
    private int version;
    private int width;

    public HeaderEntity() {
        this(0L, 0, 0, 0, 0L, 0L, 0L, null, 0, 0, TXLiteAVCode.EVT_CAMERA_REMOVED, null);
    }

    public final long component1() {
        return this.f8736id;
    }

    public final int component10() {
        return this.lastBackgroundColor;
    }

    public final int component2() {
        return this.version;
    }

    public final int component3() {
        return this.width;
    }

    public final int component4() {
        return this.height;
    }

    public final long component5() {
        return this.createDate;
    }

    public final long component6() {
        return this.updateDate;
    }

    public final long component7() {
        return this.duration;
    }

    public final String component8() {
        return this.convertUrl;
    }

    public final int component9() {
        return this.defaultBackgroundColor;
    }

    public final HeaderEntity copy(long j10, int i10, int i11, int i12, long j11, long j12, long j13, String convertUrl, int i13, int i14) {
        AbstractC9133u.m16133g(convertUrl, "convertUrl");
        return new HeaderEntity(j10, i10, i11, i12, j11, j12, j13, convertUrl, i13, i14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderEntity)) {
            return false;
        }
        HeaderEntity headerEntity = (HeaderEntity) obj;
        return this.f8736id == headerEntity.f8736id && this.version == headerEntity.version && this.width == headerEntity.width && this.height == headerEntity.height && this.createDate == headerEntity.createDate && this.updateDate == headerEntity.updateDate && this.duration == headerEntity.duration && AbstractC9133u.m16128b(this.convertUrl, headerEntity.convertUrl) && this.defaultBackgroundColor == headerEntity.defaultBackgroundColor && this.lastBackgroundColor == headerEntity.lastBackgroundColor;
    }

    public final ToOne<AuthorEntity> getAuthor() {
        ToOne<AuthorEntity> toOne = this.author;
        if (toOne != null) {
            return toOne;
        }
        AbstractC9133u.m16151y("author");
        return null;
    }

    public final String getConvertUrl() {
        return this.convertUrl;
    }

    public final long getCreateDate() {
        return this.createDate;
    }

    public final int getDefaultBackgroundColor() {
        return this.defaultBackgroundColor;
    }

    public final ToOne<BackgroundLineConfigEntity> getDefaultBackgroundLineConfig() {
        ToOne<BackgroundLineConfigEntity> toOne = this.defaultBackgroundLineConfig;
        if (toOne != null) {
            return toOne;
        }
        AbstractC9133u.m16151y("defaultBackgroundLineConfig");
        return null;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getHeight() {
        return this.height;
    }

    public final long getId() {
        return this.f8736id;
    }

    public final int getLastBackgroundColor() {
        return this.lastBackgroundColor;
    }

    public final ToOne<BackgroundLineConfigEntity> getLastBackgroundLineConfig() {
        ToOne<BackgroundLineConfigEntity> toOne = this.lastBackgroundLineConfig;
        if (toOne != null) {
            return toOne;
        }
        AbstractC9133u.m16151y("lastBackgroundLineConfig");
        return null;
    }

    public final ToOne<MoveConfigEntity> getMoveConfig() {
        ToOne<MoveConfigEntity> toOne = this.moveConfig;
        if (toOne != null) {
            return toOne;
        }
        AbstractC9133u.m16151y("moveConfig");
        return null;
    }

    public final ToOne<PageEntity> getPage() {
        ToOne<PageEntity> toOne = this.page;
        if (toOne != null) {
            return toOne;
        }
        AbstractC9133u.m16151y("page");
        return null;
    }

    public final ToMany<AuthorEntity> getProvider() {
        ToMany<AuthorEntity> toMany = this.provider;
        if (toMany != null) {
            return toMany;
        }
        AbstractC9133u.m16151y("provider");
        return null;
    }

    public final long getUpdateDate() {
        return this.updateDate;
    }

    public final int getVersion() {
        return this.version;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((((((((((((((((Long.hashCode(this.f8736id) * 31) + Integer.hashCode(this.version)) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + Long.hashCode(this.createDate)) * 31) + Long.hashCode(this.updateDate)) * 31) + Long.hashCode(this.duration)) * 31) + this.convertUrl.hashCode()) * 31) + Integer.hashCode(this.defaultBackgroundColor)) * 31) + Integer.hashCode(this.lastBackgroundColor);
    }

    public final void put() {
        BoardBox.INSTANCE.getBoxStore().m15370d(HeaderEntity.class).m15414l(this);
    }

    public final void remove() {
        BoardBox.INSTANCE.getBoxStore().m15370d(HeaderEntity.class).m15422t(this);
    }

    public final void setAuthor(ToOne<AuthorEntity> toOne) {
        AbstractC9133u.m16133g(toOne, "<set-?>");
        this.author = toOne;
    }

    public final void setConvertUrl(String str) {
        AbstractC9133u.m16133g(str, "<set-?>");
        this.convertUrl = str;
    }

    public final void setCreateDate(long j10) {
        this.createDate = j10;
    }

    public final void setDefaultBackgroundColor(int i10) {
        this.defaultBackgroundColor = i10;
    }

    public final void setDefaultBackgroundLineConfig(ToOne<BackgroundLineConfigEntity> toOne) {
        AbstractC9133u.m16133g(toOne, "<set-?>");
        this.defaultBackgroundLineConfig = toOne;
    }

    public final void setDuration(long j10) {
        this.duration = j10;
    }

    public final void setHeight(int i10) {
        this.height = i10;
    }

    public final void setId(long j10) {
        this.f8736id = j10;
    }

    public final void setLastBackgroundColor(int i10) {
        this.lastBackgroundColor = i10;
    }

    public final void setLastBackgroundLineConfig(ToOne<BackgroundLineConfigEntity> toOne) {
        AbstractC9133u.m16133g(toOne, "<set-?>");
        this.lastBackgroundLineConfig = toOne;
    }

    public final void setMoveConfig(ToOne<MoveConfigEntity> toOne) {
        AbstractC9133u.m16133g(toOne, "<set-?>");
        this.moveConfig = toOne;
    }

    public final void setPage(ToOne<PageEntity> toOne) {
        AbstractC9133u.m16133g(toOne, "<set-?>");
        this.page = toOne;
    }

    public final void setProvider(ToMany<AuthorEntity> toMany) {
        AbstractC9133u.m16133g(toMany, "<set-?>");
        this.provider = toMany;
    }

    public final void setUpdateDate(long j10) {
        this.updateDate = j10;
    }

    public final void setVersion(int i10) {
        this.version = i10;
    }

    public final void setWidth(int i10) {
        this.width = i10;
    }

    public String toString() {
        return "HeaderEntity(id=" + this.f8736id + ", version=" + this.version + ", width=" + this.width + ", height=" + this.height + ", createDate=" + this.createDate + ", updateDate=" + this.updateDate + ", duration=" + this.duration + ", convertUrl=" + this.convertUrl + ", defaultBackgroundColor=" + this.defaultBackgroundColor + ", lastBackgroundColor=" + this.lastBackgroundColor + ')';
    }

    public HeaderEntity(long j10, int i10, int i11, int i12, long j11, long j12, long j13, String convertUrl, int i13, int i14) {
        AbstractC9133u.m16133g(convertUrl, "convertUrl");
        this.provider = new ToMany<>(this, HeaderEntity_.provider);
        this.moveConfig = new ToOne<>(this, HeaderEntity_.moveConfig);
        this.author = new ToOne<>(this, HeaderEntity_.author);
        this.lastBackgroundLineConfig = new ToOne<>(this, HeaderEntity_.lastBackgroundLineConfig);
        this.defaultBackgroundLineConfig = new ToOne<>(this, HeaderEntity_.defaultBackgroundLineConfig);
        this.page = new ToOne<>(this, HeaderEntity_.page);
        this.f8736id = j10;
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

    public /* synthetic */ HeaderEntity(long j10, int i10, int i11, int i12, long j11, long j12, long j13, String str, int i13, int i14, int i15, AbstractC9126n abstractC9126n) {
        this((i15 & 1) != 0 ? 0L : j10, (i15 & 2) != 0 ? 6 : i10, (i15 & 4) != 0 ? 0 : i11, (i15 & 8) != 0 ? 0 : i12, (i15 & 16) != 0 ? 0L : j11, (i15 & 32) != 0 ? 0L : j12, (i15 & 64) == 0 ? j13 : 0L, (i15 & 128) != 0 ? "" : str, (i15 & 256) != 0 ? 0 : i13, (i15 & 512) != 0 ? 0 : i14);
    }
}
