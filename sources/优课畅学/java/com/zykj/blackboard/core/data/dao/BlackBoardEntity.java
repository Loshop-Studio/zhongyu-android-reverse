package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import com.zykj.blackboard.utils.BoardBox;
import io.objectbox.BoxStore;
import io.objectbox.C8957a;
import io.objectbox.Property;
import io.objectbox.annotation.Entity;
import io.objectbox.exception.UniqueViolationException;
import io.objectbox.query.Query;
import io.objectbox.query.QueryBuilder;
import io.objectbox.relation.ToMany;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@Entity
/* loaded from: classes4.dex */
public final class BlackBoardEntity {
    transient BoxStore __boxStore;
    private String dir;

    /* renamed from: id */
    private long f8716id;
    public ToMany<PageEntity> pages;

    public BlackBoardEntity() {
        this(0L, null, 3, null);
    }

    public static /* synthetic */ BlackBoardEntity copy$default(BlackBoardEntity blackBoardEntity, long j10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = blackBoardEntity.f8716id;
        }
        if ((i10 & 2) != 0) {
            str = blackBoardEntity.dir;
        }
        return blackBoardEntity.copy(j10, str);
    }

    public final long component1() {
        return this.f8716id;
    }

    public final String component2() {
        return this.dir;
    }

    public final BlackBoardEntity copy(long j10, String str) {
        return new BlackBoardEntity(j10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlackBoardEntity)) {
            return false;
        }
        BlackBoardEntity blackBoardEntity = (BlackBoardEntity) obj;
        return this.f8716id == blackBoardEntity.f8716id && AbstractC9133u.m16128b(this.dir, blackBoardEntity.dir);
    }

    public final String getDir() {
        return this.dir;
    }

    public final long getId() {
        return this.f8716id;
    }

    public final ToMany<PageEntity> getPages() {
        ToMany<PageEntity> toMany = this.pages;
        if (toMany != null) {
            return toMany;
        }
        AbstractC9133u.m16151y("pages");
        return null;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.f8716id) * 31;
        String str = this.dir;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void put() {
        if (this.dir != null) {
            C8957a box = BoardBox.INSTANCE.getBoxStore().m15370d(BlackBoardEntity.class);
            try {
                box.m15414l(this);
            } catch (UniqueViolationException unused) {
                AbstractC9133u.m16132f(box, "box");
                QueryBuilder builder = box.m15416n();
                AbstractC9133u.m16132f(builder, "builder");
                Property<BlackBoardEntity> property = BlackBoardEntity_.dir;
                String str = this.dir;
                AbstractC9133u.m16130d(str);
                builder.m15488c(property, str);
                Query queryM15486a = builder.m15486a();
                AbstractC9133u.m16132f(queryM15486a, "builder.build()");
                List listM15478j = queryM15486a.m15478j();
                AbstractC9133u.m16132f(listM15478j, "box.query {\n            …\n                }.find()");
                box.m15420r(listM15478j);
                box.m15414l(this);
            }
        }
    }

    public final void remove() {
        BoardBox.INSTANCE.getBoxStore().m15370d(BlackBoardEntity.class).m15422t(this);
    }

    public final void setDir(String str) {
        this.dir = str;
    }

    public final void setId(long j10) {
        this.f8716id = j10;
    }

    public final void setPages(ToMany<PageEntity> toMany) {
        AbstractC9133u.m16133g(toMany, "<set-?>");
        this.pages = toMany;
    }

    public String toString() {
        return "BlackBoardEntity(id=" + this.f8716id + ", dir=" + this.dir + ')';
    }

    public BlackBoardEntity(long j10, String str) {
        this.pages = new ToMany<>(this, BlackBoardEntity_.pages);
        this.f8716id = j10;
        this.dir = str;
    }

    public /* synthetic */ BlackBoardEntity(long j10, String str, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? null : str);
    }
}
