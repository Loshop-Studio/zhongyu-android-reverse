package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import io.objectbox.annotation.Entity;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import na.C10341d;

@Entity
/* loaded from: classes5.dex */
public final class AuthorEntity {
    private String authorId;
    private String authorName;
    private Long duration;

    /* renamed from: id */
    private long f18052id;
    private String schoolId;
    private Long startTime;
    private String url;

    public AuthorEntity() {
        this(0L, null, null, null, null, null, null, 127, null);
    }

    /* renamed from: a */
    public final String m14017a() {
        return this.authorId;
    }

    /* renamed from: b */
    public final String m14018b() {
        return this.authorName;
    }

    /* renamed from: c */
    public final Long m14019c() {
        return this.duration;
    }

    /* renamed from: d */
    public final long m14020d() {
        return this.f18052id;
    }

    /* renamed from: e */
    public final String m14021e() {
        return this.schoolId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthorEntity)) {
            return false;
        }
        AuthorEntity authorEntity = (AuthorEntity) obj;
        return this.f18052id == authorEntity.f18052id && AbstractC9979u.m20289b(this.authorName, authorEntity.authorName) && AbstractC9979u.m20289b(this.authorId, authorEntity.authorId) && AbstractC9979u.m20289b(this.schoolId, authorEntity.schoolId) && AbstractC9979u.m20289b(this.url, authorEntity.url) && AbstractC9979u.m20289b(this.startTime, authorEntity.startTime) && AbstractC9979u.m20289b(this.duration, authorEntity.duration);
    }

    /* renamed from: f */
    public final Long m14022f() {
        return this.startTime;
    }

    /* renamed from: g */
    public final String m14023g() {
        return this.url;
    }

    /* renamed from: h */
    public final void m14024h() {
        C10341d.f24644a.m21626f().m18954g(AuthorEntity.class).m19227m(this);
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.f18052id) * 31;
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

    /* renamed from: i */
    public final void m14025i(long j10) {
        this.f18052id = j10;
    }

    public String toString() {
        return "AuthorEntity(id=" + this.f18052id + ", authorName=" + this.authorName + ", authorId=" + this.authorId + ", schoolId=" + this.schoolId + ", url=" + this.url + ", startTime=" + this.startTime + ", duration=" + this.duration + ')';
    }

    public AuthorEntity(long j10, String str, String str2, String str3, String str4, Long l10, Long l11) {
        this.f18052id = j10;
        this.authorName = str;
        this.authorId = str2;
        this.schoolId = str3;
        this.url = str4;
        this.startTime = l10;
        this.duration = l11;
    }

    public /* synthetic */ AuthorEntity(long j10, String str, String str2, String str3, String str4, Long l10, Long l11, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : l10, (i10 & 64) != 0 ? null : l11);
    }
}
