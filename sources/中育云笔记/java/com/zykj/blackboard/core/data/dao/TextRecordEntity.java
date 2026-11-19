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
public final class TextRecordEntity {
    transient BoxStore __boxStore;
    private String fileName;

    /* renamed from: id */
    private long f18433id;
    public ToOne<RecordEntity> record;
    public ToMany<TextInfoEntity> textInfoEntityList;
    private String validate;

    public TextRecordEntity() {
        this(0L, null, null, 7, null);
    }

    /* renamed from: a */
    public final String m14301a() {
        return this.fileName;
    }

    /* renamed from: b */
    public final long m14302b() {
        return this.f18433id;
    }

    /* renamed from: c */
    public final ToMany m14303c() {
        ToMany<TextInfoEntity> toMany = this.textInfoEntityList;
        if (toMany != null) {
            return toMany;
        }
        AbstractC9979u.m20312y("textInfoEntityList");
        return null;
    }

    /* renamed from: d */
    public final String m14304d() {
        return this.validate;
    }

    /* renamed from: e */
    public final void m14305e() {
        C9710a box = C10341d.f24644a.m21626f().m18954g(TextRecordEntity.class);
        try {
            box.m19227m(this);
        } catch (UniqueViolationException unused) {
            AbstractC9979u.m20293f(box, "box");
            QueryBuilder builder = box.m19229o();
            AbstractC9979u.m20293f(builder, "builder");
            builder.m19013g(TextRecordEntity_.f18443h, this.fileName);
            Query queryM19011e = builder.m19011e();
            AbstractC9979u.m20293f(queryM19011e, "builder.build()");
            List listM19003l = queryM19011e.m19003l();
            AbstractC9979u.m20293f(listM19003l, "box.query {\n            …ame)\n            }.find()");
            box.m19233s(listM19003l);
            box.m19227m(this);
        }
    }

    /* renamed from: f */
    public final void m14306f(long j10) {
        this.f18433id = j10;
    }

    /* renamed from: g */
    public final void m14307g(String str) {
        AbstractC9979u.m20294g(str, "<set-?>");
        this.validate = str;
    }

    public TextRecordEntity(long j10, String fileName, String validate) {
        AbstractC9979u.m20294g(fileName, "fileName");
        AbstractC9979u.m20294g(validate, "validate");
        this.textInfoEntityList = new ToMany<>(this, TextRecordEntity_.f18449n);
        this.record = new ToOne<>(this, TextRecordEntity_.f18448m);
        this.f18433id = j10;
        this.fileName = fileName;
        this.validate = validate;
    }

    public /* synthetic */ TextRecordEntity(long j10, String str, String str2, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? "" : str2);
    }
}
