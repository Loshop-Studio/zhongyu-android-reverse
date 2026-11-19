package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import com.zykj.blackboard.utils.BoardBox;
import io.objectbox.annotation.Entity;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@Entity
/* loaded from: classes4.dex */
public final class AuthorEntity {
    private String authorId;
    private String authorName;
    private Long duration;

    /* renamed from: id */
    private long f8712id;
    private String schoolId;
    private Long startTime;
    private String url;

    public AuthorEntity() {
        this(0L, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ AuthorEntity copy$default(AuthorEntity authorEntity, long j10, String str, String str2, String str3, String str4, Long l10, Long l11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = authorEntity.f8712id;
        }
        long j11 = j10;
        if ((i10 & 2) != 0) {
            str = authorEntity.authorName;
        }
        String str5 = str;
        if ((i10 & 4) != 0) {
            str2 = authorEntity.authorId;
        }
        String str6 = str2;
        if ((i10 & 8) != 0) {
            str3 = authorEntity.schoolId;
        }
        String str7 = str3;
        if ((i10 & 16) != 0) {
            str4 = authorEntity.url;
        }
        return authorEntity.copy(j11, str5, str6, str7, str4, (i10 & 32) != 0 ? authorEntity.startTime : l10, (i10 & 64) != 0 ? authorEntity.duration : l11);
    }

    public final long component1() {
        return this.f8712id;
    }

    public final String component2() {
        return this.authorName;
    }

    public final String component3() {
        return this.authorId;
    }

    public final String component4() {
        return this.schoolId;
    }

    public final String component5() {
        return this.url;
    }

    public final Long component6() {
        return this.startTime;
    }

    public final Long component7() {
        return this.duration;
    }

    public final AuthorEntity copy(long j10, String str, String str2, String str3, String str4, Long l10, Long l11) {
        return new AuthorEntity(j10, str, str2, str3, str4, l10, l11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthorEntity)) {
            return false;
        }
        AuthorEntity authorEntity = (AuthorEntity) obj;
        return this.f8712id == authorEntity.f8712id && AbstractC9133u.m16128b(this.authorName, authorEntity.authorName) && AbstractC9133u.m16128b(this.authorId, authorEntity.authorId) && AbstractC9133u.m16128b(this.schoolId, authorEntity.schoolId) && AbstractC9133u.m16128b(this.url, authorEntity.url) && AbstractC9133u.m16128b(this.startTime, authorEntity.startTime) && AbstractC9133u.m16128b(this.duration, authorEntity.duration);
    }

    public final String getAuthorId() {
        return this.authorId;
    }

    public final String getAuthorName() {
        return this.authorName;
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final long getId() {
        return this.f8712id;
    }

    public final String getSchoolId() {
        return this.schoolId;
    }

    public final Long getStartTime() {
        return this.startTime;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.f8712id) * 31;
        String str = this.authorName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.authorId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.schoolId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.url;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l10 = this.startTime;
        int iHashCode6 = (iHashCode5 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.duration;
        return iHashCode6 + (l11 != null ? l11.hashCode() : 0);
    }

    public final void put() {
        BoardBox.INSTANCE.getBoxStore().m15370d(AuthorEntity.class).m15414l(this);
    }

    public final void remove() {
        BoardBox.INSTANCE.getBoxStore().m15370d(AuthorEntity.class).m15422t(this);
    }

    public final void setAuthorId(String str) {
        this.authorId = str;
    }

    public final void setAuthorName(String str) {
        this.authorName = str;
    }

    public final void setDuration(Long l10) {
        this.duration = l10;
    }

    public final void setId(long j10) {
        this.f8712id = j10;
    }

    public final void setSchoolId(String str) {
        this.schoolId = str;
    }

    public final void setStartTime(Long l10) {
        this.startTime = l10;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        return "AuthorEntity(id=" + this.f8712id + ", authorName=" + this.authorName + ", authorId=" + this.authorId + ", schoolId=" + this.schoolId + ", url=" + this.url + ", startTime=" + this.startTime + ", duration=" + this.duration + ')';
    }

    public AuthorEntity(long j10, String str, String str2, String str3, String str4, Long l10, Long l11) {
        this.f8712id = j10;
        this.authorName = str;
        this.authorId = str2;
        this.schoolId = str3;
        this.url = str4;
        this.startTime = l10;
        this.duration = l11;
    }

    public /* synthetic */ AuthorEntity(long j10, String str, String str2, String str3, String str4, Long l10, Long l11, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : l10, (i10 & 64) != 0 ? null : l11);
    }
}
