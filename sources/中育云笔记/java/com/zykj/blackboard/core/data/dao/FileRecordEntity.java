package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import io.objectbox.BoxStore;
import io.objectbox.annotation.Entity;
import io.objectbox.exception.UniqueViolationException;
import io.objectbox.query.Query;
import io.objectbox.query.QueryBuilder;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import na.C10341d;
import p210jc.C9710a;

@Entity
/* loaded from: classes5.dex */
public final class FileRecordEntity {
    transient BoxStore __boxStore;
    public ToMany<FileInfoEntity> fileInfoEntity;
    private String fileName;

    /* renamed from: id */
    private long f18163id;
    public ToOne<RecordEntity> record;
    private String validate;

    public FileRecordEntity() {
        this(0L, null, null, 7, null);
    }

    /* renamed from: a */
    public final ToMany m14091a() {
        ToMany<FileInfoEntity> toMany = this.fileInfoEntity;
        if (toMany != null) {
            return toMany;
        }
        AbstractC9979u.m20312y("fileInfoEntity");
        return null;
    }

    /* renamed from: b */
    public final String m14092b() {
        return this.fileName;
    }

    /* renamed from: c */
    public final long m14093c() {
        return this.f18163id;
    }

    /* renamed from: d */
    public final String m14094d() {
        return this.validate;
    }

    /* renamed from: e */
    public final void m14095e() {
        C9710a box = C10341d.f24644a.m21626f().m18954g(FileRecordEntity.class);
        try {
            box.m19227m(this);
        } catch (UniqueViolationException unused) {
            AbstractC9979u.m20293f(box, "box");
            QueryBuilder builder = box.m19229o();
            AbstractC9979u.m20293f(builder, "builder");
            builder.m19013g(FileRecordEntity_.f18173h, this.fileName);
            Query queryM19011e = builder.m19011e();
            AbstractC9979u.m20293f(queryM19011e, "builder.build()");
            List listM19003l = queryM19011e.m19003l();
            AbstractC9979u.m20293f(listM19003l, "box.query {\n            …ame)\n            }.find()");
            box.m19233s(listM19003l);
            box.m19227m(this);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileRecordEntity)) {
            return false;
        }
        FileRecordEntity fileRecordEntity = (FileRecordEntity) obj;
        return this.f18163id == fileRecordEntity.f18163id && AbstractC9979u.m20289b(this.fileName, fileRecordEntity.fileName) && AbstractC9979u.m20289b(this.validate, fileRecordEntity.validate);
    }

    /* renamed from: f */
    public final void m14096f(long j10) {
        this.f18163id = j10;
    }

    /* renamed from: g */
    public final void m14097g(String str) {
        AbstractC9979u.m20294g(str, "<set-?>");
        this.validate = str;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f18163id) * 31) + this.fileName.hashCode()) * 31) + this.validate.hashCode();
    }

    public String toString() {
        return "FileRecordEntity(id=" + this.f18163id + ", fileName=" + this.fileName + ", validate=" + this.validate + ')';
    }

    public FileRecordEntity(long j10, String fileName, String validate) {
        AbstractC9979u.m20294g(fileName, "fileName");
        AbstractC9979u.m20294g(validate, "validate");
        this.fileInfoEntity = new ToMany<>(this, FileRecordEntity_.f18179n);
        this.record = new ToOne<>(this, FileRecordEntity_.f18178m);
        this.f18163id = j10;
        this.fileName = fileName;
        this.validate = validate;
    }

    public /* synthetic */ FileRecordEntity(long j10, String str, String str2, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? "" : str2);
    }
}
