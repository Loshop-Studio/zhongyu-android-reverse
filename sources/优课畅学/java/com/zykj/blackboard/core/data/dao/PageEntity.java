package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import com.zykj.blackboard.utils.BoardBox;
import io.objectbox.BoxStore;
import io.objectbox.C8957a;
import io.objectbox.annotation.Entity;
import io.objectbox.exception.UniqueViolationException;
import io.objectbox.query.Query;
import io.objectbox.query.QueryBuilder;
import io.objectbox.relation.ToOne;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@Entity
/* loaded from: classes4.dex */
public final class PageEntity {
    transient BoxStore __boxStore;
    public ToOne<BlackBoardEntity> blackBoardEntity;
    private String commandFileName;
    private int commandIndex;
    private String dirName;
    public ToOne<HeaderEntity> headerEntity;

    /* renamed from: id */
    private long f8746id;
    private boolean isChange;
    public ToOne<RecordEntity> recordEntity;

    public PageEntity() {
        this(0L, null, false, null, 0, 31, null);
    }

    public static /* synthetic */ PageEntity copy$default(PageEntity pageEntity, long j10, String str, boolean z10, String str2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = pageEntity.f8746id;
        }
        long j11 = j10;
        if ((i11 & 2) != 0) {
            str = pageEntity.dirName;
        }
        String str3 = str;
        if ((i11 & 4) != 0) {
            z10 = pageEntity.isChange;
        }
        boolean z11 = z10;
        if ((i11 & 8) != 0) {
            str2 = pageEntity.commandFileName;
        }
        String str4 = str2;
        if ((i11 & 16) != 0) {
            i10 = pageEntity.commandIndex;
        }
        return pageEntity.copy(j11, str3, z11, str4, i10);
    }

    public final long component1() {
        return this.f8746id;
    }

    public final String component2() {
        return this.dirName;
    }

    public final boolean component3() {
        return this.isChange;
    }

    public final String component4() {
        return this.commandFileName;
    }

    public final int component5() {
        return this.commandIndex;
    }

    public final PageEntity copy(long j10, String dirName, boolean z10, String commandFileName, int i10) {
        AbstractC9133u.m16133g(dirName, "dirName");
        AbstractC9133u.m16133g(commandFileName, "commandFileName");
        return new PageEntity(j10, dirName, z10, commandFileName, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PageEntity)) {
            return false;
        }
        PageEntity pageEntity = (PageEntity) obj;
        return this.f8746id == pageEntity.f8746id && AbstractC9133u.m16128b(this.dirName, pageEntity.dirName) && this.isChange == pageEntity.isChange && AbstractC9133u.m16128b(this.commandFileName, pageEntity.commandFileName) && this.commandIndex == pageEntity.commandIndex;
    }

    public final ToOne<BlackBoardEntity> getBlackBoardEntity() {
        ToOne<BlackBoardEntity> toOne = this.blackBoardEntity;
        if (toOne != null) {
            return toOne;
        }
        AbstractC9133u.m16151y("blackBoardEntity");
        return null;
    }

    public final String getCommandFileName() {
        return this.commandFileName;
    }

    public final int getCommandIndex() {
        return this.commandIndex;
    }

    public final String getDirName() {
        return this.dirName;
    }

    public final ToOne<HeaderEntity> getHeaderEntity() {
        ToOne<HeaderEntity> toOne = this.headerEntity;
        if (toOne != null) {
            return toOne;
        }
        AbstractC9133u.m16151y("headerEntity");
        return null;
    }

    public final long getId() {
        return this.f8746id;
    }

    public final ToOne<RecordEntity> getRecordEntity() {
        ToOne<RecordEntity> toOne = this.recordEntity;
        if (toOne != null) {
            return toOne;
        }
        AbstractC9133u.m16151y("recordEntity");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.f8746id) * 31) + this.dirName.hashCode()) * 31;
        boolean z10 = this.isChange;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((((iHashCode + i10) * 31) + this.commandFileName.hashCode()) * 31) + Integer.hashCode(this.commandIndex);
    }

    public final boolean isChange() {
        return this.isChange;
    }

    public final void put() {
        C8957a box = BoardBox.INSTANCE.getBoxStore().m15370d(PageEntity.class);
        try {
            box.m15414l(this);
        } catch (UniqueViolationException unused) {
            AbstractC9133u.m16132f(box, "box");
            QueryBuilder builder = box.m15416n();
            AbstractC9133u.m16132f(builder, "builder");
            builder.m15488c(PageEntity_.dirName, this.dirName);
            Query queryM15486a = builder.m15486a();
            AbstractC9133u.m16132f(queryM15486a, "builder.build()");
            List listM15478j = queryM15486a.m15478j();
            AbstractC9133u.m16132f(listM15478j, "box.query {\n            …ame)\n            }.find()");
            box.m15420r(listM15478j);
            box.m15414l(this);
        }
    }

    public final void remove() {
        BoardBox.INSTANCE.getBoxStore().m15370d(PageEntity.class).m15422t(this);
    }

    public final void setBlackBoardEntity(ToOne<BlackBoardEntity> toOne) {
        AbstractC9133u.m16133g(toOne, "<set-?>");
        this.blackBoardEntity = toOne;
    }

    public final void setChange(boolean z10) {
        this.isChange = z10;
    }

    public final void setCommandFileName(String str) {
        AbstractC9133u.m16133g(str, "<set-?>");
        this.commandFileName = str;
    }

    public final void setCommandIndex(int i10) {
        this.commandIndex = i10;
    }

    public final void setDirName(String str) {
        AbstractC9133u.m16133g(str, "<set-?>");
        this.dirName = str;
    }

    public final void setHeaderEntity(ToOne<HeaderEntity> toOne) {
        AbstractC9133u.m16133g(toOne, "<set-?>");
        this.headerEntity = toOne;
    }

    public final void setId(long j10) {
        this.f8746id = j10;
    }

    public final void setRecordEntity(ToOne<RecordEntity> toOne) {
        AbstractC9133u.m16133g(toOne, "<set-?>");
        this.recordEntity = toOne;
    }

    public String toString() {
        return "PageEntity(id=" + this.f8746id + ", dirName=" + this.dirName + ", isChange=" + this.isChange + ", commandFileName=" + this.commandFileName + ", commandIndex=" + this.commandIndex + ')';
    }

    public PageEntity(long j10, String dirName, boolean z10, String commandFileName, int i10) {
        AbstractC9133u.m16133g(dirName, "dirName");
        AbstractC9133u.m16133g(commandFileName, "commandFileName");
        this.headerEntity = new ToOne<>(this, PageEntity_.headerEntity);
        this.recordEntity = new ToOne<>(this, PageEntity_.recordEntity);
        this.blackBoardEntity = new ToOne<>(this, PageEntity_.blackBoardEntity);
        this.f8746id = j10;
        this.dirName = dirName;
        this.isChange = z10;
        this.commandFileName = commandFileName;
        this.commandIndex = i10;
    }

    public /* synthetic */ PageEntity(long j10, String str, boolean z10, String str2, int i10, int i11, AbstractC9126n abstractC9126n) {
        this((i11 & 1) != 0 ? 0L : j10, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? false : z10, (i11 & 8) != 0 ? "" : str2, (i11 & 16) != 0 ? 0 : i10);
    }
}
