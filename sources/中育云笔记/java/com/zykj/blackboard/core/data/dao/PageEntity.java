package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import io.objectbox.BoxStore;
import io.objectbox.annotation.Entity;
import io.objectbox.exception.UniqueViolationException;
import io.objectbox.query.Query;
import io.objectbox.query.QueryBuilder;
import io.objectbox.relation.ToOne;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import na.C10341d;
import p210jc.C9710a;

@Entity
/* loaded from: classes5.dex */
public final class PageEntity {
    transient BoxStore __boxStore;
    public ToOne<BlackBoardEntity> blackBoardEntity;
    private String commandFileName;
    private int commandIndex;
    private String dirName;
    public ToOne<HeaderEntity> headerEntity;

    /* renamed from: id */
    private long f18366id;
    private boolean isChange;
    public ToOne<RecordEntity> recordEntity;

    public PageEntity() {
        this(0L, null, false, null, 0, 31, null);
    }

    /* renamed from: a */
    public final ToOne m14236a() {
        ToOne<BlackBoardEntity> toOne = this.blackBoardEntity;
        if (toOne != null) {
            return toOne;
        }
        AbstractC9979u.m20312y("blackBoardEntity");
        return null;
    }

    /* renamed from: b */
    public final String m14237b() {
        return this.commandFileName;
    }

    /* renamed from: c */
    public final int m14238c() {
        return this.commandIndex;
    }

    /* renamed from: d */
    public final String m14239d() {
        return this.dirName;
    }

    /* renamed from: e */
    public final ToOne m14240e() {
        ToOne<HeaderEntity> toOne = this.headerEntity;
        if (toOne != null) {
            return toOne;
        }
        AbstractC9979u.m20312y("headerEntity");
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PageEntity)) {
            return false;
        }
        PageEntity pageEntity = (PageEntity) obj;
        return this.f18366id == pageEntity.f18366id && AbstractC9979u.m20289b(this.dirName, pageEntity.dirName) && this.isChange == pageEntity.isChange && AbstractC9979u.m20289b(this.commandFileName, pageEntity.commandFileName) && this.commandIndex == pageEntity.commandIndex;
    }

    /* renamed from: f */
    public final long m14241f() {
        return this.f18366id;
    }

    /* renamed from: g */
    public final ToOne m14242g() {
        ToOne<RecordEntity> toOne = this.recordEntity;
        if (toOne != null) {
            return toOne;
        }
        AbstractC9979u.m20312y("recordEntity");
        return null;
    }

    /* renamed from: h */
    public final boolean m14243h() {
        return this.isChange;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.f18366id) * 31) + this.dirName.hashCode()) * 31;
        boolean z10 = this.isChange;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((((iHashCode + i10) * 31) + this.commandFileName.hashCode()) * 31) + Integer.hashCode(this.commandIndex);
    }

    /* renamed from: i */
    public final void m14244i() {
        C9710a box = C10341d.f24644a.m21626f().m18954g(PageEntity.class);
        try {
            box.m19227m(this);
        } catch (UniqueViolationException unused) {
            AbstractC9979u.m20293f(box, "box");
            QueryBuilder builder = box.m19229o();
            AbstractC9979u.m20293f(builder, "builder");
            builder.m19013g(PageEntity_.f18380h, this.dirName);
            Query queryM19011e = builder.m19011e();
            AbstractC9979u.m20293f(queryM19011e, "builder.build()");
            List listM19003l = queryM19011e.m19003l();
            AbstractC9979u.m20293f(listM19003l, "box.query {\n            …ame)\n            }.find()");
            box.m19233s(listM19003l);
            box.m19227m(this);
        }
    }

    /* renamed from: j */
    public final void m14245j(boolean z10) {
        this.isChange = z10;
    }

    /* renamed from: k */
    public final void m14246k(String str) {
        AbstractC9979u.m20294g(str, "<set-?>");
        this.commandFileName = str;
    }

    /* renamed from: l */
    public final void m14247l(int i10) {
        this.commandIndex = i10;
    }

    /* renamed from: m */
    public final void m14248m(String str) {
        AbstractC9979u.m20294g(str, "<set-?>");
        this.dirName = str;
    }

    /* renamed from: n */
    public final void m14249n(long j10) {
        this.f18366id = j10;
    }

    public String toString() {
        return "PageEntity(id=" + this.f18366id + ", dirName=" + this.dirName + ", isChange=" + this.isChange + ", commandFileName=" + this.commandFileName + ", commandIndex=" + this.commandIndex + ')';
    }

    public PageEntity(long j10, String dirName, boolean z10, String commandFileName, int i10) {
        AbstractC9979u.m20294g(dirName, "dirName");
        AbstractC9979u.m20294g(commandFileName, "commandFileName");
        this.headerEntity = new ToOne<>(this, PageEntity_.f18391s);
        this.recordEntity = new ToOne<>(this, PageEntity_.f18390r);
        this.blackBoardEntity = new ToOne<>(this, PageEntity_.f18389q);
        this.f18366id = j10;
        this.dirName = dirName;
        this.isChange = z10;
        this.commandFileName = commandFileName;
        this.commandIndex = i10;
    }

    public /* synthetic */ PageEntity(long j10, String str, boolean z10, String str2, int i10, int i11, AbstractC9972n abstractC9972n) {
        this((i11 & 1) != 0 ? 0L : j10, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? false : z10, (i11 & 8) != 0 ? "" : str2, (i11 & 16) != 0 ? 0 : i10);
    }
}
