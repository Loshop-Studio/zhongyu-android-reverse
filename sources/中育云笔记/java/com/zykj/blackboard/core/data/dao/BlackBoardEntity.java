package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import io.objectbox.BoxStore;
import io.objectbox.Property;
import io.objectbox.annotation.Entity;
import io.objectbox.exception.UniqueViolationException;
import io.objectbox.query.Query;
import io.objectbox.query.QueryBuilder;
import io.objectbox.relation.ToMany;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import na.C10341d;
import p210jc.C9710a;

@Entity
/* loaded from: classes5.dex */
public final class BlackBoardEntity {
    transient BoxStore __boxStore;
    private String dir;

    /* renamed from: id */
    private long f18091id;
    public ToMany<PageEntity> pages;

    public BlackBoardEntity() {
        this(0L, null, 3, null);
    }

    /* renamed from: a */
    public final String m14039a() {
        return this.dir;
    }

    /* renamed from: b */
    public final long m14040b() {
        return this.f18091id;
    }

    /* renamed from: c */
    public final ToMany m14041c() {
        ToMany<PageEntity> toMany = this.pages;
        if (toMany != null) {
            return toMany;
        }
        AbstractC9979u.m20312y("pages");
        return null;
    }

    /* renamed from: d */
    public final void m14042d() {
        if (this.dir != null) {
            C9710a box = C10341d.f24644a.m21626f().m18954g(BlackBoardEntity.class);
            try {
                box.m19227m(this);
            } catch (UniqueViolationException unused) {
                AbstractC9979u.m20293f(box, "box");
                QueryBuilder builder = box.m19229o();
                AbstractC9979u.m20293f(builder, "builder");
                Property property = BlackBoardEntity_.f18099h;
                String str = this.dir;
                AbstractC9979u.m20291d(str);
                builder.m19013g(property, str);
                Query queryM19011e = builder.m19011e();
                AbstractC9979u.m20293f(queryM19011e, "builder.build()");
                List listM19003l = queryM19011e.m19003l();
                AbstractC9979u.m20293f(listM19003l, "box.query {\n            …\n                }.find()");
                box.m19233s(listM19003l);
                box.m19227m(this);
            }
        }
    }

    /* renamed from: e */
    public final void m14043e(String str) {
        this.dir = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlackBoardEntity)) {
            return false;
        }
        BlackBoardEntity blackBoardEntity = (BlackBoardEntity) obj;
        return this.f18091id == blackBoardEntity.f18091id && AbstractC9979u.m20289b(this.dir, blackBoardEntity.dir);
    }

    /* renamed from: f */
    public final void m14044f(long j10) {
        this.f18091id = j10;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.f18091id) * 31;
        String str = this.dir;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BlackBoardEntity(id=" + this.f18091id + ", dir=" + this.dir + ')';
    }

    public BlackBoardEntity(long j10, String str) {
        this.pages = new ToMany<>(this, BlackBoardEntity_.f18102k);
        this.f18091id = j10;
        this.dir = str;
    }

    public /* synthetic */ BlackBoardEntity(long j10, String str, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? null : str);
    }
}
