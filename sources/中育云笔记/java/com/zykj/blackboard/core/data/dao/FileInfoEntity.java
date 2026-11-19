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
public final class FileInfoEntity {
    transient BoxStore __boxStore;
    private String fileName;
    private int height;

    /* renamed from: id */
    private long f18143id;
    public ToOne<FileRecordEntity> record;
    private String validate;
    private int width;

    public FileInfoEntity() {
        this(0L, null, 0, 0, null, 31, null);
    }

    /* renamed from: a */
    public final String m14078a() {
        return this.fileName;
    }

    /* renamed from: b */
    public final int m14079b() {
        return this.height;
    }

    /* renamed from: c */
    public final long m14080c() {
        return this.f18143id;
    }

    /* renamed from: d */
    public final ToOne m14081d() {
        ToOne<FileRecordEntity> toOne = this.record;
        if (toOne != null) {
            return toOne;
        }
        AbstractC9979u.m20312y("record");
        return null;
    }

    /* renamed from: e */
    public final String m14082e() {
        return this.validate;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileInfoEntity)) {
            return false;
        }
        FileInfoEntity fileInfoEntity = (FileInfoEntity) obj;
        return this.f18143id == fileInfoEntity.f18143id && AbstractC9979u.m20289b(this.fileName, fileInfoEntity.fileName) && this.width == fileInfoEntity.width && this.height == fileInfoEntity.height && AbstractC9979u.m20289b(this.validate, fileInfoEntity.validate);
    }

    /* renamed from: f */
    public final int m14083f() {
        return this.width;
    }

    /* renamed from: g */
    public final void m14084g() {
        C10341d.f24644a.m21626f().m18954g(FileInfoEntity.class).m19227m(this);
    }

    /* renamed from: h */
    public final void m14085h(long j10) {
        this.f18143id = j10;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.f18143id) * 31) + this.fileName.hashCode()) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + this.validate.hashCode();
    }

    public String toString() {
        return "FileInfoEntity(id=" + this.f18143id + ", fileName=" + this.fileName + ", width=" + this.width + ", height=" + this.height + ", validate=" + this.validate + ')';
    }

    public FileInfoEntity(long j10, String fileName, int i10, int i11, String validate) {
        AbstractC9979u.m20294g(fileName, "fileName");
        AbstractC9979u.m20294g(validate, "validate");
        this.record = new ToOne<>(this, FileInfoEntity_.f18162o);
        this.f18143id = j10;
        this.fileName = fileName;
        this.width = i10;
        this.height = i11;
        this.validate = validate;
    }

    public /* synthetic */ FileInfoEntity(long j10, String str, int i10, int i11, String str2, int i12, AbstractC9972n abstractC9972n) {
        this((i12 & 1) != 0 ? 0L : j10, (i12 & 2) != 0 ? "" : str, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11, (i12 & 16) != 0 ? "" : str2);
    }
}
