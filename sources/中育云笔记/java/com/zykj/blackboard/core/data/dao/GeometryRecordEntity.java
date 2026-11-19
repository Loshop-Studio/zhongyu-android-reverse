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
public final class GeometryRecordEntity {
    transient BoxStore __boxStore;
    private String fileName;
    public ToMany<GeometryInfoEntity> geometryInfoEntityList;

    /* renamed from: id */
    private long f18221id;
    public ToOne<RecordEntity> record;
    private String validate;

    public GeometryRecordEntity() {
        this(0L, null, null, 7, null);
    }

    /* renamed from: a */
    public final String m14131a() {
        return this.fileName;
    }

    /* renamed from: b */
    public final ToMany m14132b() {
        ToMany<GeometryInfoEntity> toMany = this.geometryInfoEntityList;
        if (toMany != null) {
            return toMany;
        }
        AbstractC9979u.m20312y("geometryInfoEntityList");
        return null;
    }

    /* renamed from: c */
    public final long m14133c() {
        return this.f18221id;
    }

    /* renamed from: d */
    public final String m14134d() {
        return this.validate;
    }

    /* renamed from: e */
    public final void m14135e() {
        C9710a box = C10341d.f24644a.m21626f().m18954g(GeometryRecordEntity.class);
        try {
            box.m19227m(this);
        } catch (UniqueViolationException unused) {
            AbstractC9979u.m20293f(box, "box");
            QueryBuilder builder = box.m19229o();
            AbstractC9979u.m20293f(builder, "builder");
            builder.m19013g(GeometryRecordEntity_.f18231h, this.fileName);
            Query queryM19011e = builder.m19011e();
            AbstractC9979u.m20293f(queryM19011e, "builder.build()");
            List listM19003l = queryM19011e.m19003l();
            AbstractC9979u.m20293f(listM19003l, "box.query {\n            …ame)\n            }.find()");
            box.m19233s(listM19003l);
            box.m19227m(this);
        }
    }

    /* renamed from: f */
    public final void m14136f(long j10) {
        this.f18221id = j10;
    }

    /* renamed from: g */
    public final void m14137g(String str) {
        AbstractC9979u.m20294g(str, "<set-?>");
        this.validate = str;
    }

    public GeometryRecordEntity(long j10, String fileName, String validate) {
        AbstractC9979u.m20294g(fileName, "fileName");
        AbstractC9979u.m20294g(validate, "validate");
        this.geometryInfoEntityList = new ToMany<>(this, GeometryRecordEntity_.f18237n);
        this.record = new ToOne<>(this, GeometryRecordEntity_.f18236m);
        this.f18221id = j10;
        this.fileName = fileName;
        this.validate = validate;
    }

    public /* synthetic */ GeometryRecordEntity(long j10, String str, String str2, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? "" : str2);
    }
}
