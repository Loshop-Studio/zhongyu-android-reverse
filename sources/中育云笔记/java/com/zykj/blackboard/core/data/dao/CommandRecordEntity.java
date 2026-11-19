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
public final class CommandRecordEntity {
    transient BoxStore __boxStore;
    public ToMany<CommandInfoEntity> commandInfoEntity;
    private String fileName;

    /* renamed from: id */
    private long f18126id;
    public ToOne<RecordEntity> record;
    private String validate;

    public CommandRecordEntity() {
        this(0L, null, null, 7, null);
    }

    /* renamed from: a */
    public final ToMany m14065a() {
        ToMany<CommandInfoEntity> toMany = this.commandInfoEntity;
        if (toMany != null) {
            return toMany;
        }
        AbstractC9979u.m20312y("commandInfoEntity");
        return null;
    }

    /* renamed from: b */
    public final String m14066b() {
        return this.fileName;
    }

    /* renamed from: c */
    public final long m14067c() {
        return this.f18126id;
    }

    /* renamed from: d */
    public final String m14068d() {
        return this.validate;
    }

    /* renamed from: e */
    public final void m14069e() {
        C9710a box = C10341d.f24644a.m21626f().m18954g(CommandRecordEntity.class);
        try {
            box.m19227m(this);
        } catch (UniqueViolationException unused) {
            AbstractC9979u.m20293f(box, "box");
            QueryBuilder builder = box.m19229o();
            AbstractC9979u.m20293f(builder, "builder");
            builder.m19013g(CommandRecordEntity_.f18136h, this.fileName);
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
        if (!(obj instanceof CommandRecordEntity)) {
            return false;
        }
        CommandRecordEntity commandRecordEntity = (CommandRecordEntity) obj;
        return this.f18126id == commandRecordEntity.f18126id && AbstractC9979u.m20289b(this.fileName, commandRecordEntity.fileName) && AbstractC9979u.m20289b(this.validate, commandRecordEntity.validate);
    }

    /* renamed from: f */
    public final void m14070f(long j10) {
        this.f18126id = j10;
    }

    /* renamed from: g */
    public final void m14071g(String str) {
        AbstractC9979u.m20294g(str, "<set-?>");
        this.validate = str;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f18126id) * 31) + this.fileName.hashCode()) * 31) + this.validate.hashCode();
    }

    public String toString() {
        return "CommandRecordEntity(id=" + this.f18126id + ", fileName=" + this.fileName + ", validate=" + this.validate + ')';
    }

    public CommandRecordEntity(long j10, String fileName, String validate) {
        AbstractC9979u.m20294g(fileName, "fileName");
        AbstractC9979u.m20294g(validate, "validate");
        this.commandInfoEntity = new ToMany<>(this, CommandRecordEntity_.f18142n);
        this.record = new ToOne<>(this, CommandRecordEntity_.f18141m);
        this.f18126id = j10;
        this.fileName = fileName;
        this.validate = validate;
    }

    public /* synthetic */ CommandRecordEntity(long j10, String str, String str2, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? "" : str2);
    }
}
