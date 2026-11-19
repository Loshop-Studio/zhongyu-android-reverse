package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import io.objectbox.BoxStore;
import io.objectbox.annotation.Entity;
import io.objectbox.exception.UniqueViolationException;
import io.objectbox.query.Query;
import io.objectbox.query.QueryBuilder;
import io.objectbox.relation.ToOne;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p077e5.C7342c;
import p214q8.C8980a;

@Metadata(m13557d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001c\u001a\u0004\b%\u0010\u0011\"\u0004\b&\u0010\u001fR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0013\"\u0004\b)\u0010*R(\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R(\u00104\u001a\b\u0012\u0004\u0012\u0002030+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010.\u001a\u0004\b5\u00100\"\u0004\b6\u00102R(\u00108\u001a\b\u0012\u0004\u0012\u0002070+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u0010.\u001a\u0004\b9\u00100\"\u0004\b:\u00102¨\u0006;"}, m13558d2 = {"Lcom/zykj/blackboard/core/data/dao/PageEntity;", "", "", "id", "", "dirName", "", "isChange", "commandFileName", "", "commandIndex", "<init>", "(JLjava/lang/String;ZLjava/lang/String;I)V", "", "i", "()V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "f", "()J", "m", "(J)V", "Ljava/lang/String;", "d", "setDirName", "(Ljava/lang/String;)V", "Z", "h", "()Z", "j", "(Z)V", "b", "k", "I", "c", "l", "(I)V", "Lio/objectbox/relation/ToOne;", "Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;", "blackBoardEntity", "Lio/objectbox/relation/ToOne;", "a", "()Lio/objectbox/relation/ToOne;", "setBlackBoardEntity", "(Lio/objectbox/relation/ToOne;)V", "Lcom/zykj/blackboard/core/data/dao/RecordEntity;", "recordEntity", "g", "setRecordEntity", "Lcom/zykj/blackboard/core/data/dao/HeaderEntity;", "headerEntity", "e", "setHeaderEntity", "blackboard_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
@Entity
/* loaded from: classes4.dex */
public final /* data */ class PageEntity {
    transient BoxStore __boxStore;
    public ToOne<BlackBoardEntity> blackBoardEntity;
    private String commandFileName;
    private int commandIndex;
    private String dirName;
    public ToOne<HeaderEntity> headerEntity;
    private long id;
    private boolean isChange;
    public ToOne<RecordEntity> recordEntity;

    public PageEntity() {
        this(0L, null, false, null, 0, 31, null);
    }

    /* renamed from: a */
    public final ToOne m6507a() {
        ToOne<BlackBoardEntity> toOne = this.blackBoardEntity;
        if (toOne != null) {
            return toOne;
        }
        Intrinsics.throwUninitializedPropertyAccessException("blackBoardEntity");
        return null;
    }

    /* renamed from: b, reason: from getter */
    public final String getCommandFileName() {
        return this.commandFileName;
    }

    /* renamed from: c, reason: from getter */
    public final int getCommandIndex() {
        return this.commandIndex;
    }

    /* renamed from: d, reason: from getter */
    public final String getDirName() {
        return this.dirName;
    }

    /* renamed from: e */
    public final ToOne m6511e() {
        ToOne<HeaderEntity> toOne = this.headerEntity;
        if (toOne != null) {
            return toOne;
        }
        Intrinsics.throwUninitializedPropertyAccessException("headerEntity");
        return null;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageEntity)) {
            return false;
        }
        PageEntity pageEntity = (PageEntity) other;
        return this.id == pageEntity.id && Intrinsics.areEqual(this.dirName, pageEntity.dirName) && this.isChange == pageEntity.isChange && Intrinsics.areEqual(this.commandFileName, pageEntity.commandFileName) && this.commandIndex == pageEntity.commandIndex;
    }

    /* renamed from: f, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: g */
    public final ToOne m6513g() {
        ToOne<RecordEntity> toOne = this.recordEntity;
        if (toOne != null) {
            return toOne;
        }
        Intrinsics.throwUninitializedPropertyAccessException("recordEntity");
        return null;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getIsChange() {
        return this.isChange;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.id) * 31) + this.dirName.hashCode()) * 31;
        boolean z9 = this.isChange;
        int i10 = z9;
        if (z9 != 0) {
            i10 = 1;
        }
        return ((((iHashCode + i10) * 31) + this.commandFileName.hashCode()) * 31) + Integer.hashCode(this.commandIndex);
    }

    /* renamed from: i */
    public final void m6515i() {
        C8980a box = C7342c.f11908a.m11744b().m12981h(PageEntity.class);
        try {
            box.m15045l(this);
        } catch (UniqueViolationException unused) {
            Intrinsics.checkNotNullExpressionValue(box, "box");
            QueryBuilder builder = box.m15047n();
            Intrinsics.checkNotNullExpressionValue(builder, "builder");
            builder.m13041g(PageEntity_.f7537f, this.dirName);
            Query queryM13039a = builder.m13039a();
            Intrinsics.checkNotNullExpressionValue(queryM13039a, "builder.build()");
            List listM13031n = queryM13039a.m13031n();
            Intrinsics.checkNotNullExpressionValue(listM13031n, "box.query {\n            …ame)\n            }.find()");
            box.m15051r(listM13031n);
            box.m15045l(this);
        }
    }

    /* renamed from: j */
    public final void m6516j(boolean z9) {
        this.isChange = z9;
    }

    /* renamed from: k */
    public final void m6517k(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.commandFileName = str;
    }

    /* renamed from: l */
    public final void m6518l(int i10) {
        this.commandIndex = i10;
    }

    /* renamed from: m */
    public final void m6519m(long j10) {
        this.id = j10;
    }

    public String toString() {
        return "PageEntity(id=" + this.id + ", dirName=" + this.dirName + ", isChange=" + this.isChange + ", commandFileName=" + this.commandFileName + ", commandIndex=" + this.commandIndex + ')';
    }

    public PageEntity(long j10, String dirName, boolean z9, String commandFileName, int i10) {
        Intrinsics.checkNotNullParameter(dirName, "dirName");
        Intrinsics.checkNotNullParameter(commandFileName, "commandFileName");
        this.headerEntity = new ToOne<>(this, PageEntity_.f7548q);
        this.recordEntity = new ToOne<>(this, PageEntity_.f7547p);
        this.blackBoardEntity = new ToOne<>(this, PageEntity_.f7546o);
        this.id = j10;
        this.dirName = dirName;
        this.isChange = z9;
        this.commandFileName = commandFileName;
        this.commandIndex = i10;
    }

    public /* synthetic */ PageEntity(long j10, String str, boolean z9, String str2, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j10, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? false : z9, (i11 & 8) != 0 ? "" : str2, (i11 & 16) != 0 ? 0 : i10);
    }
}
