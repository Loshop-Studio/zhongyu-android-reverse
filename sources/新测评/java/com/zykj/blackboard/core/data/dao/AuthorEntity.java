package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.objectbox.annotation.Entity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p077e5.C7342c;

@Metadata(m13557d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011\"\u0004\b \u0010!R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010!R$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010!R$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001e\u001a\u0004\b&\u0010\u0011\"\u0004\b'\u0010!R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010(\u001a\u0004\b-\u0010*\"\u0004\b.\u0010,¨\u0006/"}, m13558d2 = {"Lcom/zykj/blackboard/core/data/dao/AuthorEntity;", "", "", "id", "", "authorName", "authorId", "schoolId", "url", "startTime", TypedValues.TransitionType.S_DURATION, "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "", "h", "()V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "d", "()J", "i", "(J)V", "Ljava/lang/String;", "b", "setAuthorName", "(Ljava/lang/String;)V", "a", "setAuthorId", "e", "setSchoolId", "g", "setUrl", "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", "setStartTime", "(Ljava/lang/Long;)V", "c", "setDuration", "blackboard_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
@Entity
/* loaded from: classes4.dex */
public final /* data */ class AuthorEntity {
    private String authorId;
    private String authorName;
    private Long duration;
    private long id;
    private String schoolId;
    private Long startTime;
    private String url;

    public AuthorEntity() {
        this(0L, null, null, null, null, null, null, 127, null);
    }

    /* renamed from: a, reason: from getter */
    public final String getAuthorId() {
        return this.authorId;
    }

    /* renamed from: b, reason: from getter */
    public final String getAuthorName() {
        return this.authorName;
    }

    /* renamed from: c, reason: from getter */
    public final Long getDuration() {
        return this.duration;
    }

    /* renamed from: d, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: e, reason: from getter */
    public final String getSchoolId() {
        return this.schoolId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthorEntity)) {
            return false;
        }
        AuthorEntity authorEntity = (AuthorEntity) other;
        return this.id == authorEntity.id && Intrinsics.areEqual(this.authorName, authorEntity.authorName) && Intrinsics.areEqual(this.authorId, authorEntity.authorId) && Intrinsics.areEqual(this.schoolId, authorEntity.schoolId) && Intrinsics.areEqual(this.url, authorEntity.url) && Intrinsics.areEqual(this.startTime, authorEntity.startTime) && Intrinsics.areEqual(this.duration, authorEntity.duration);
    }

    /* renamed from: f, reason: from getter */
    public final Long getStartTime() {
        return this.startTime;
    }

    /* renamed from: g, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: h */
    public final void m6301h() {
        C7342c.f11908a.m11744b().m12981h(AuthorEntity.class).m15045l(this);
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
        Long l10 = this.startTime;
        int iHashCode6 = (iHashCode5 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.duration;
        return iHashCode6 + (l11 != null ? l11.hashCode() : 0);
    }

    /* renamed from: i */
    public final void m6302i(long j10) {
        this.id = j10;
    }

    public String toString() {
        return "AuthorEntity(id=" + this.id + ", authorName=" + this.authorName + ", authorId=" + this.authorId + ", schoolId=" + this.schoolId + ", url=" + this.url + ", startTime=" + this.startTime + ", duration=" + this.duration + ')';
    }

    public AuthorEntity(long j10, String str, String str2, String str3, String str4, Long l10, Long l11) {
        this.id = j10;
        this.authorName = str;
        this.authorId = str2;
        this.schoolId = str3;
        this.url = str4;
        this.startTime = l10;
        this.duration = l11;
    }

    public /* synthetic */ AuthorEntity(long j10, String str, String str2, String str3, String str4, Long l10, Long l11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : l10, (i10 & 64) != 0 ? null : l11);
    }
}
