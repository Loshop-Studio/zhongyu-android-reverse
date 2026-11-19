package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.utils.BoardBox;
import io.objectbox.annotation.Entity;
import io.objectbox.annotation.InterfaceC5697Id;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019Jb\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0014J\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0012\"\u0004\b'\u0010(R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0014\"\u0004\b+\u0010,R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010,R$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010)\u001a\u0004\b/\u0010\u0014\"\u0004\b0\u0010,R$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010)\u001a\u0004\b1\u0010\u0014\"\u0004\b2\u0010,R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\u0019\"\u0004\b5\u00106R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u00103\u001a\u0004\b7\u0010\u0019\"\u0004\b8\u00106¨\u00069"}, m5110d2 = {"Lcom/zykj/blackboard/core/data/dao/AuthorEntity;", "", "", "id", "", "authorName", "authorId", "schoolId", "url", "startTime", TypedValues.TransitionType.S_DURATION, "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "Ld6/s;", "put", "()V", "remove", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Ljava/lang/Long;", "component7", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Lcom/zykj/blackboard/core/data/dao/AuthorEntity;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "setId", "(J)V", "Ljava/lang/String;", "getAuthorName", "setAuthorName", "(Ljava/lang/String;)V", "getAuthorId", "setAuthorId", "getSchoolId", "setSchoolId", "getUrl", "setUrl", "Ljava/lang/Long;", "getStartTime", "setStartTime", "(Ljava/lang/Long;)V", "getDuration", "setDuration", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Entity
/* loaded from: classes3.dex */
public final /* data */ class AuthorEntity {

    @Nullable
    private String authorId;

    @Nullable
    private String authorName;

    @Nullable
    private Long duration;

    @InterfaceC5697Id
    private long id;

    @Nullable
    private String schoolId;

    @Nullable
    private Long startTime;

    @Nullable
    private String url;

    public AuthorEntity() {
        this(0L, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ AuthorEntity copy$default(AuthorEntity authorEntity, long j7, String str, String str2, String str3, String str4, Long l, Long l3, int i, Object obj) {
        if ((i & 1) != 0) {
            j7 = authorEntity.id;
        }
        long j8 = j7;
        if ((i & 2) != 0) {
            str = authorEntity.authorName;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = authorEntity.authorId;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = authorEntity.schoolId;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = authorEntity.url;
        }
        return authorEntity.copy(j8, str5, str6, str7, str4, (i & 32) != 0 ? authorEntity.startTime : l, (i & 64) != 0 ? authorEntity.duration : l3);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getAuthorName() {
        return this.authorName;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getAuthorId() {
        return this.authorId;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getSchoolId() {
        return this.schoolId;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Long getStartTime() {
        return this.startTime;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Long getDuration() {
        return this.duration;
    }

    @NotNull
    public final AuthorEntity copy(long id, @Nullable String authorName, @Nullable String authorId, @Nullable String schoolId, @Nullable String url, @Nullable Long startTime, @Nullable Long duration) {
        return new AuthorEntity(id, authorName, authorId, schoolId, url, startTime, duration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthorEntity)) {
            return false;
        }
        AuthorEntity authorEntity = (AuthorEntity) other;
        return this.id == authorEntity.id && AbstractC5830k.m5325b(this.authorName, authorEntity.authorName) && AbstractC5830k.m5325b(this.authorId, authorEntity.authorId) && AbstractC5830k.m5325b(this.schoolId, authorEntity.schoolId) && AbstractC5830k.m5325b(this.url, authorEntity.url) && AbstractC5830k.m5325b(this.startTime, authorEntity.startTime) && AbstractC5830k.m5325b(this.duration, authorEntity.duration);
    }

    @Nullable
    public final String getAuthorId() {
        return this.authorId;
    }

    @Nullable
    public final String getAuthorName() {
        return this.authorName;
    }

    @Nullable
    public final Long getDuration() {
        return this.duration;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final String getSchoolId() {
        return this.schoolId;
    }

    @Nullable
    public final Long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.id) * 31;
        String str = this.authorName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.authorId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.schoolId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.url;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.startTime;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Long l3 = this.duration;
        return iHashCode6 + (l3 != null ? l3.hashCode() : 0);
    }

    public final void put() {
        BoardBox.INSTANCE.getBoxStore().m5018c(AuthorEntity.class).m5034e(this);
    }

    public final void remove() {
        BoardBox.INSTANCE.getBoxStore().m5018c(AuthorEntity.class).m5039j(this);
    }

    public final void setAuthorId(@Nullable String str) {
        this.authorId = str;
    }

    public final void setAuthorName(@Nullable String str) {
        this.authorName = str;
    }

    public final void setDuration(@Nullable Long l) {
        this.duration = l;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setSchoolId(@Nullable String str) {
        this.schoolId = str;
    }

    public final void setStartTime(@Nullable Long l) {
        this.startTime = l;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    @NotNull
    public String toString() {
        return "AuthorEntity(id=" + this.id + ", authorName=" + this.authorName + ", authorId=" + this.authorId + ", schoolId=" + this.schoolId + ", url=" + this.url + ", startTime=" + this.startTime + ", duration=" + this.duration + ')';
    }

    public AuthorEntity(long j7, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Long l, @Nullable Long l3) {
        this.id = j7;
        this.authorName = str;
        this.authorId = str2;
        this.schoolId = str3;
        this.url = str4;
        this.startTime = l;
        this.duration = l3;
    }

    public /* synthetic */ AuthorEntity(long j7, String str, String str2, String str3, String str4, Long l, Long l3, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? 0L : j7, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : l3);
    }
}
