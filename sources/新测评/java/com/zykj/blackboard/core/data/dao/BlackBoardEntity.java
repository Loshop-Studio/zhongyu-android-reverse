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
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p077e5.C7342c;
import p214q8.C8980a;

@Metadata(m13557d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u001cR(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006%"}, m13558d2 = {"Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;", "", "", "id", "", "dir", "<init>", "(JLjava/lang/String;)V", "", "d", "()V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "b", "()J", "e", "(J)V", "Ljava/lang/String;", "a", "setDir", "(Ljava/lang/String;)V", "Lio/objectbox/relation/ToMany;", "Lcom/zykj/blackboard/core/data/dao/PageEntity;", "pages", "Lio/objectbox/relation/ToMany;", "c", "()Lio/objectbox/relation/ToMany;", "setPages", "(Lio/objectbox/relation/ToMany;)V", "blackboard_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
@Entity
/* loaded from: classes4.dex */
public final /* data */ class BlackBoardEntity {
    transient BoxStore __boxStore;
    private String dir;
    private long id;
    public ToMany<PageEntity> pages;

    public BlackBoardEntity() {
        this(0L, null, 3, null);
    }

    /* renamed from: a, reason: from getter */
    public final String getDir() {
        return this.dir;
    }

    /* renamed from: b, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: c */
    public final ToMany m6318c() {
        ToMany<PageEntity> toMany = this.pages;
        if (toMany != null) {
            return toMany;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pages");
        return null;
    }

    /* renamed from: d */
    public final void m6319d() {
        if (this.dir != null) {
            C8980a box = C7342c.f11908a.m11744b().m12981h(BlackBoardEntity.class);
            try {
                box.m15045l(this);
            } catch (UniqueViolationException unused) {
                Intrinsics.checkNotNullExpressionValue(box, "box");
                QueryBuilder builder = box.m15047n();
                Intrinsics.checkNotNullExpressionValue(builder, "builder");
                Property property = BlackBoardEntity_.f7256f;
                String str = this.dir;
                Intrinsics.checkNotNull(str);
                builder.m13041g(property, str);
                Query queryM13039a = builder.m13039a();
                Intrinsics.checkNotNullExpressionValue(queryM13039a, "builder.build()");
                List listM13031n = queryM13039a.m13031n();
                Intrinsics.checkNotNullExpressionValue(listM13031n, "box.query {\n            …\n                }.find()");
                box.m15051r(listM13031n);
                box.m15045l(this);
            }
        }
    }

    /* renamed from: e */
    public final void m6320e(long j10) {
        this.id = j10;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlackBoardEntity)) {
            return false;
        }
        BlackBoardEntity blackBoardEntity = (BlackBoardEntity) other;
        return this.id == blackBoardEntity.id && Intrinsics.areEqual(this.dir, blackBoardEntity.dir);
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.id) * 31;
        String str = this.dir;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BlackBoardEntity(id=" + this.id + ", dir=" + this.dir + ')';
    }

    public BlackBoardEntity(long j10, String str) {
        this.pages = new ToMany<>(this, BlackBoardEntity_.f7259i);
        this.id = j10;
        this.dir = str;
    }

    public /* synthetic */ BlackBoardEntity(long j10, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? null : str);
    }
}
