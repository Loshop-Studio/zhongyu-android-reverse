package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import io.objectbox.BoxStore;
import io.objectbox.annotation.Entity;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import na.C10341d;

@Entity
/* loaded from: classes5.dex */
public final class RecordEntity {
    transient BoxStore __boxStore;
    public ToMany<AudioRecordEntity> audioList;
    public ToMany<CommandRecordEntity> commandList;
    public ToMany<FileRecordEntity> fileList;
    public ToMany<GeometryRecordEntity> geometryList;

    /* renamed from: id */
    private long f18392id;
    public ToMany<MatrixRecordEntity> matrixList;
    public ToOne<PageEntity> page;
    public ToMany<TextRecordEntity> textList;
    public ToMany<TouchRecordEntity> touchList;

    public RecordEntity() {
        this(0L, 1, null);
    }

    /* renamed from: a */
    public final ToMany m14257a() {
        ToMany<AudioRecordEntity> toMany = this.audioList;
        if (toMany != null) {
            return toMany;
        }
        AbstractC9979u.m20312y("audioList");
        return null;
    }

    /* renamed from: b */
    public final ToMany m14258b() {
        ToMany<CommandRecordEntity> toMany = this.commandList;
        if (toMany != null) {
            return toMany;
        }
        AbstractC9979u.m20312y("commandList");
        return null;
    }

    /* renamed from: c */
    public final ToMany m14259c() {
        ToMany<FileRecordEntity> toMany = this.fileList;
        if (toMany != null) {
            return toMany;
        }
        AbstractC9979u.m20312y("fileList");
        return null;
    }

    /* renamed from: d */
    public final ToMany m14260d() {
        ToMany<GeometryRecordEntity> toMany = this.geometryList;
        if (toMany != null) {
            return toMany;
        }
        AbstractC9979u.m20312y("geometryList");
        return null;
    }

    /* renamed from: e */
    public final long m14261e() {
        return this.f18392id;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecordEntity) && this.f18392id == ((RecordEntity) obj).f18392id;
    }

    /* renamed from: f */
    public final ToMany m14262f() {
        ToMany<MatrixRecordEntity> toMany = this.matrixList;
        if (toMany != null) {
            return toMany;
        }
        AbstractC9979u.m20312y("matrixList");
        return null;
    }

    /* renamed from: g */
    public final ToOne m14263g() {
        ToOne<PageEntity> toOne = this.page;
        if (toOne != null) {
            return toOne;
        }
        AbstractC9979u.m20312y("page");
        return null;
    }

    /* renamed from: h */
    public final ToMany m14264h() {
        ToMany<TextRecordEntity> toMany = this.textList;
        if (toMany != null) {
            return toMany;
        }
        AbstractC9979u.m20312y("textList");
        return null;
    }

    public int hashCode() {
        return Long.hashCode(this.f18392id);
    }

    /* renamed from: i */
    public final ToMany m14265i() {
        ToMany<TouchRecordEntity> toMany = this.touchList;
        if (toMany != null) {
            return toMany;
        }
        AbstractC9979u.m20312y("touchList");
        return null;
    }

    /* renamed from: j */
    public final void m14266j() {
        C10341d.f24644a.m21626f().m18954g(RecordEntity.class).m19227m(this);
    }

    /* renamed from: k */
    public final void m14267k(long j10) {
        this.f18392id = j10;
    }

    public String toString() {
        return "RecordEntity(id=" + this.f18392id + ')';
    }

    public RecordEntity(long j10) {
        this.geometryList = new ToMany<>(this, RecordEntity_.f18410r);
        this.textList = new ToMany<>(this, RecordEntity_.f18409q);
        this.audioList = new ToMany<>(this, RecordEntity_.f18408p);
        this.matrixList = new ToMany<>(this, RecordEntity_.f18407o);
        this.touchList = new ToMany<>(this, RecordEntity_.f18406n);
        this.fileList = new ToMany<>(this, RecordEntity_.f18405m);
        this.commandList = new ToMany<>(this, RecordEntity_.f18404l);
        this.page = new ToOne<>(this, RecordEntity_.f18403k);
        this.f18392id = j10;
    }

    public /* synthetic */ RecordEntity(long j10, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? 0L : j10);
    }
}
