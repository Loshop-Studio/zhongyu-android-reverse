package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import android.support.v4.media.AbstractC0037f;
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

@Metadata(m5109d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0010\u0010\u001e\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u0018J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u0018Jt\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010\u0018J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0016\"\u0004\b,\u0010-R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u0018\"\u0004\b0\u00101R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010.\u001a\u0004\b2\u0010\u0018\"\u0004\b3\u00101R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010.\u001a\u0004\b4\u0010\u0018\"\u0004\b5\u00101R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010*\u001a\u0004\b6\u0010\u0016\"\u0004\b7\u0010-R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010*\u001a\u0004\b8\u0010\u0016\"\u0004\b9\u0010-R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010*\u001a\u0004\b:\u0010\u0016\"\u0004\b;\u0010-R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010\u001f\"\u0004\b>\u0010?R\"\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010.\u001a\u0004\b@\u0010\u0018\"\u0004\bA\u00101R\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010.\u001a\u0004\bB\u0010\u0018\"\u0004\bC\u00101R(\u0010F\u001a\b\u0012\u0004\u0012\u00020E0D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR(\u0010M\u001a\b\u0012\u0004\u0012\u00020L0D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010G\u001a\u0004\bN\u0010I\"\u0004\bO\u0010KR(\u0010P\u001a\b\u0012\u0004\u0012\u00020L0D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010G\u001a\u0004\bQ\u0010I\"\u0004\bR\u0010KR(\u0010T\u001a\b\u0012\u0004\u0012\u00020S0D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010G\u001a\u0004\bU\u0010I\"\u0004\bV\u0010KR(\u0010X\u001a\b\u0012\u0004\u0012\u00020S0W8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R(\u0010_\u001a\b\u0012\u0004\u0012\u00020^0D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u0010G\u001a\u0004\b`\u0010I\"\u0004\ba\u0010K¨\u0006b"}, m5110d2 = {"Lcom/zykj/blackboard/core/data/dao/HeaderEntity;", "", "", "id", "", "version", "width", "height", "createDate", "updateDate", TypedValues.TransitionType.S_DURATION, "", "convertUrl", "defaultBackgroundColor", "lastBackgroundColor", "<init>", "(JIIIJJJLjava/lang/String;II)V", "Ld6/s;", "put", "()V", "remove", "component1", "()J", "component2", "()I", "component3", "component4", "component5", "component6", "component7", "component8", "()Ljava/lang/String;", "component9", "component10", "copy", "(JIIIJJJLjava/lang/String;II)Lcom/zykj/blackboard/core/data/dao/HeaderEntity;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "setId", "(J)V", "I", "getVersion", "setVersion", "(I)V", "getWidth", "setWidth", "getHeight", "setHeight", "getCreateDate", "setCreateDate", "getUpdateDate", "setUpdateDate", "getDuration", "setDuration", "Ljava/lang/String;", "getConvertUrl", "setConvertUrl", "(Ljava/lang/String;)V", "getDefaultBackgroundColor", "setDefaultBackgroundColor", "getLastBackgroundColor", "setLastBackgroundColor", "Lio/objectbox/relation/ToOne;", "Lcom/zykj/blackboard/core/data/dao/PageEntity;", "page", "Lio/objectbox/relation/ToOne;", "getPage", "()Lio/objectbox/relation/ToOne;", "setPage", "(Lio/objectbox/relation/ToOne;)V", "Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;", "defaultBackgroundLineConfig", "getDefaultBackgroundLineConfig", "setDefaultBackgroundLineConfig", "lastBackgroundLineConfig", "getLastBackgroundLineConfig", "setLastBackgroundLineConfig", "Lcom/zykj/blackboard/core/data/dao/AuthorEntity;", "author", "getAuthor", "setAuthor", "Lio/objectbox/relation/ToMany;", "provider", "Lio/objectbox/relation/ToMany;", "getProvider", "()Lio/objectbox/relation/ToMany;", "setProvider", "(Lio/objectbox/relation/ToMany;)V", "Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;", "moveConfig", "getMoveConfig", "setMoveConfig", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Entity
/* loaded from: classes3.dex */
public final /* data */ class HeaderEntity {
    transient BoxStore __boxStore;
    public ToOne<AuthorEntity> author;

    @NotNull
    private String convertUrl;
    private long createDate;
    private int defaultBackgroundColor;
    public ToOne<BackgroundLineConfigEntity> defaultBackgroundLineConfig;
    private long duration;
    private int height;

    @InterfaceC5697Id
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

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final int getLastBackgroundColor() {
        return this.lastBackgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* renamed from: component3, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component4, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: component5, reason: from getter */
    public final long getCreateDate() {
        return this.createDate;
    }

    /* renamed from: component6, reason: from getter */
    public final long getUpdateDate() {
        return this.updateDate;
    }

    /* renamed from: component7, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getConvertUrl() {
        return this.convertUrl;
    }

    /* renamed from: component9, reason: from getter */
    public final int getDefaultBackgroundColor() {
        return this.defaultBackgroundColor;
    }

    @NotNull
    public final HeaderEntity copy(long id, int version, int width, int height, long createDate, long updateDate, long duration, @NotNull String convertUrl, int defaultBackgroundColor, int lastBackgroundColor) {
        AbstractC5830k.m5330g(convertUrl, "convertUrl");
        return new HeaderEntity(id, version, width, height, createDate, updateDate, duration, convertUrl, defaultBackgroundColor, lastBackgroundColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderEntity)) {
            return false;
        }
        HeaderEntity headerEntity = (HeaderEntity) other;
        return this.id == headerEntity.id && this.version == headerEntity.version && this.width == headerEntity.width && this.height == headerEntity.height && this.createDate == headerEntity.createDate && this.updateDate == headerEntity.updateDate && this.duration == headerEntity.duration && AbstractC5830k.m5325b(this.convertUrl, headerEntity.convertUrl) && this.defaultBackgroundColor == headerEntity.defaultBackgroundColor && this.lastBackgroundColor == headerEntity.lastBackgroundColor;
    }

    @NotNull
    public final ToOne<AuthorEntity> getAuthor() {
        ToOne<AuthorEntity> toOne = this.author;
        if (toOne != null) {
            return toOne;
        }
        AbstractC5830k.m5339p("author");
        throw null;
    }

    @NotNull
    public final String getConvertUrl() {
        return this.convertUrl;
    }

    public final long getCreateDate() {
        return this.createDate;
    }

    public final int getDefaultBackgroundColor() {
        return this.defaultBackgroundColor;
    }

    @NotNull
    public final ToOne<BackgroundLineConfigEntity> getDefaultBackgroundLineConfig() {
        ToOne<BackgroundLineConfigEntity> toOne = this.defaultBackgroundLineConfig;
        if (toOne != null) {
            return toOne;
        }
        AbstractC5830k.m5339p("defaultBackgroundLineConfig");
        throw null;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getHeight() {
        return this.height;
    }

    public final long getId() {
        return this.id;
    }

    public final int getLastBackgroundColor() {
        return this.lastBackgroundColor;
    }

    @NotNull
    public final ToOne<BackgroundLineConfigEntity> getLastBackgroundLineConfig() {
        ToOne<BackgroundLineConfigEntity> toOne = this.lastBackgroundLineConfig;
        if (toOne != null) {
            return toOne;
        }
        AbstractC5830k.m5339p("lastBackgroundLineConfig");
        throw null;
    }

    @NotNull
    public final ToOne<MoveConfigEntity> getMoveConfig() {
        ToOne<MoveConfigEntity> toOne = this.moveConfig;
        if (toOne != null) {
            return toOne;
        }
        AbstractC5830k.m5339p("moveConfig");
        throw null;
    }

    @NotNull
    public final ToOne<PageEntity> getPage() {
        ToOne<PageEntity> toOne = this.page;
        if (toOne != null) {
            return toOne;
        }
        AbstractC5830k.m5339p("page");
        throw null;
    }

    @NotNull
    public final ToMany<AuthorEntity> getProvider() {
        ToMany<AuthorEntity> toMany = this.provider;
        if (toMany != null) {
            return toMany;
        }
        AbstractC5830k.m5339p("provider");
        throw null;
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
        return Integer.hashCode(this.lastBackgroundColor) + AbstractC0584a.m902c(this.defaultBackgroundColor, AbstractC0584a.m903d(AbstractC0584a.m897B(this.duration, AbstractC0584a.m897B(this.updateDate, AbstractC0584a.m897B(this.createDate, AbstractC0584a.m902c(this.height, AbstractC0584a.m902c(this.width, AbstractC0584a.m902c(this.version, Long.hashCode(this.id) * 31, 31), 31), 31), 31), 31), 31), 31, this.convertUrl), 31);
    }

    public final void put() {
        BoardBox.INSTANCE.getBoxStore().m5018c(HeaderEntity.class).m5034e(this);
    }

    public final void remove() {
        BoardBox.INSTANCE.getBoxStore().m5018c(HeaderEntity.class).m5039j(this);
    }

    public final void setAuthor(@NotNull ToOne<AuthorEntity> toOne) {
        AbstractC5830k.m5330g(toOne, "<set-?>");
        this.author = toOne;
    }

    public final void setConvertUrl(@NotNull String str) {
        AbstractC5830k.m5330g(str, "<set-?>");
        this.convertUrl = str;
    }

    public final void setCreateDate(long j7) {
        this.createDate = j7;
    }

    public final void setDefaultBackgroundColor(int i) {
        this.defaultBackgroundColor = i;
    }

    public final void setDefaultBackgroundLineConfig(@NotNull ToOne<BackgroundLineConfigEntity> toOne) {
        AbstractC5830k.m5330g(toOne, "<set-?>");
        this.defaultBackgroundLineConfig = toOne;
    }

    public final void setDuration(long j7) {
        this.duration = j7;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setLastBackgroundColor(int i) {
        this.lastBackgroundColor = i;
    }

    public final void setLastBackgroundLineConfig(@NotNull ToOne<BackgroundLineConfigEntity> toOne) {
        AbstractC5830k.m5330g(toOne, "<set-?>");
        this.lastBackgroundLineConfig = toOne;
    }

    public final void setMoveConfig(@NotNull ToOne<MoveConfigEntity> toOne) {
        AbstractC5830k.m5330g(toOne, "<set-?>");
        this.moveConfig = toOne;
    }

    public final void setPage(@NotNull ToOne<PageEntity> toOne) {
        AbstractC5830k.m5330g(toOne, "<set-?>");
        this.page = toOne;
    }

    public final void setProvider(@NotNull ToMany<AuthorEntity> toMany) {
        AbstractC5830k.m5330g(toMany, "<set-?>");
        this.provider = toMany;
    }

    public final void setUpdateDate(long j7) {
        this.updateDate = j7;
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("HeaderEntity(id=");
        sb.append(this.id);
        sb.append(", version=");
        sb.append(this.version);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", createDate=");
        sb.append(this.createDate);
        sb.append(", updateDate=");
        sb.append(this.updateDate);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", convertUrl=");
        sb.append(this.convertUrl);
        sb.append(", defaultBackgroundColor=");
        sb.append(this.defaultBackgroundColor);
        sb.append(", lastBackgroundColor=");
        return AbstractC0037f.m88m(sb, this.lastBackgroundColor, ')');
    }

    public HeaderEntity(long j7, int i, int i8, int i9, long j8, long j9, long j10, @NotNull String convertUrl, int i10, int i11) {
        AbstractC5830k.m5330g(convertUrl, "convertUrl");
        this.provider = new ToMany<>(this, HeaderEntity_.provider);
        this.moveConfig = new ToOne<>(this, HeaderEntity_.moveConfig);
        this.author = new ToOne<>(this, HeaderEntity_.author);
        this.lastBackgroundLineConfig = new ToOne<>(this, HeaderEntity_.lastBackgroundLineConfig);
        this.defaultBackgroundLineConfig = new ToOne<>(this, HeaderEntity_.defaultBackgroundLineConfig);
        this.page = new ToOne<>(this, HeaderEntity_.page);
        this.id = j7;
        this.version = i;
        this.width = i8;
        this.height = i9;
        this.createDate = j8;
        this.updateDate = j9;
        this.duration = j10;
        this.convertUrl = convertUrl;
        this.defaultBackgroundColor = i10;
        this.lastBackgroundColor = i11;
    }

    public /* synthetic */ HeaderEntity(long j7, int i, int i8, int i9, long j8, long j9, long j10, String str, int i10, int i11, int i12, AbstractC5824e abstractC5824e) {
        this((i12 & 1) != 0 ? 0L : j7, (i12 & 2) != 0 ? 6 : i, (i12 & 4) != 0 ? 0 : i8, (i12 & 8) != 0 ? 0 : i9, (i12 & 16) != 0 ? 0L : j8, (i12 & 32) != 0 ? 0L : j9, (i12 & 64) == 0 ? j10 : 0L, (i12 & 128) != 0 ? "" : str, (i12 & 256) != 0 ? 0 : i10, (i12 & 512) != 0 ? 0 : i11);
    }
}
