package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.utils.BoardBox;
import io.objectbox.BoxStore;
import io.objectbox.C5696a;
import io.objectbox.annotation.Entity;
import io.objectbox.annotation.InterfaceC5697Id;
import io.objectbox.annotation.Unique;
import io.objectbox.exception.UniqueViolationException;
import io.objectbox.query.QueryBuilder;
import io.objectbox.relation.ToOne;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JB\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0014J\u0010\u0010\u001d\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0019J\u001a\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010$R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0014\"\u0004\b'\u0010(R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010)\u001a\u0004\b\u0007\u0010\u0016\"\u0004\b*\u0010+R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010%\u001a\u0004\b,\u0010\u0014\"\u0004\b-\u0010(R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010.\u001a\u0004\b/\u0010\u0019\"\u0004\b0\u00101R(\u00104\u001a\b\u0012\u0004\u0012\u000203028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R(\u0010;\u001a\b\u0012\u0004\u0012\u00020:028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u00105\u001a\u0004\b<\u00107\"\u0004\b=\u00109R(\u0010?\u001a\b\u0012\u0004\u0012\u00020>028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u00105\u001a\u0004\b@\u00107\"\u0004\bA\u00109¨\u0006B"}, m5110d2 = {"Lcom/zykj/blackboard/core/data/dao/PageEntity;", "", "", "id", "", "dirName", "", "isChange", "commandFileName", "", "commandIndex", "<init>", "(JLjava/lang/String;ZLjava/lang/String;I)V", "Ld6/s;", "put", "()V", "remove", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "()Z", "component4", "component5", "()I", "copy", "(JLjava/lang/String;ZLjava/lang/String;I)Lcom/zykj/blackboard/core/data/dao/PageEntity;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "setId", "(J)V", "Ljava/lang/String;", "getDirName", "setDirName", "(Ljava/lang/String;)V", "Z", "setChange", "(Z)V", "getCommandFileName", "setCommandFileName", "I", "getCommandIndex", "setCommandIndex", "(I)V", "Lio/objectbox/relation/ToOne;", "Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;", "blackBoardEntity", "Lio/objectbox/relation/ToOne;", "getBlackBoardEntity", "()Lio/objectbox/relation/ToOne;", "setBlackBoardEntity", "(Lio/objectbox/relation/ToOne;)V", "Lcom/zykj/blackboard/core/data/dao/RecordEntity;", "recordEntity", "getRecordEntity", "setRecordEntity", "Lcom/zykj/blackboard/core/data/dao/HeaderEntity;", "headerEntity", "getHeaderEntity", "setHeaderEntity", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Entity
/* loaded from: classes3.dex */
public final /* data */ class PageEntity {
    transient BoxStore __boxStore;
    public ToOne<BlackBoardEntity> blackBoardEntity;

    @NotNull
    private String commandFileName;
    private int commandIndex;

    @Unique
    @NotNull
    private String dirName;
    public ToOne<HeaderEntity> headerEntity;

    @InterfaceC5697Id
    private long id;
    private boolean isChange;
    public ToOne<RecordEntity> recordEntity;

    public PageEntity() {
        this(0L, null, false, null, 0, 31, null);
    }

    public static /* synthetic */ PageEntity copy$default(PageEntity pageEntity, long j7, String str, boolean z8, String str2, int i, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j7 = pageEntity.id;
        }
        long j8 = j7;
        if ((i8 & 2) != 0) {
            str = pageEntity.dirName;
        }
        String str3 = str;
        if ((i8 & 4) != 0) {
            z8 = pageEntity.isChange;
        }
        boolean z9 = z8;
        if ((i8 & 8) != 0) {
            str2 = pageEntity.commandFileName;
        }
        String str4 = str2;
        if ((i8 & 16) != 0) {
            i = pageEntity.commandIndex;
        }
        return pageEntity.copy(j8, str3, z9, str4, i);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDirName() {
        return this.dirName;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsChange() {
        return this.isChange;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getCommandFileName() {
        return this.commandFileName;
    }

    /* renamed from: component5, reason: from getter */
    public final int getCommandIndex() {
        return this.commandIndex;
    }

    @NotNull
    public final PageEntity copy(long id, @NotNull String dirName, boolean isChange, @NotNull String commandFileName, int commandIndex) {
        AbstractC5830k.m5330g(dirName, "dirName");
        AbstractC5830k.m5330g(commandFileName, "commandFileName");
        return new PageEntity(id, dirName, isChange, commandFileName, commandIndex);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageEntity)) {
            return false;
        }
        PageEntity pageEntity = (PageEntity) other;
        return this.id == pageEntity.id && AbstractC5830k.m5325b(this.dirName, pageEntity.dirName) && this.isChange == pageEntity.isChange && AbstractC5830k.m5325b(this.commandFileName, pageEntity.commandFileName) && this.commandIndex == pageEntity.commandIndex;
    }

    @NotNull
    public final ToOne<BlackBoardEntity> getBlackBoardEntity() {
        ToOne<BlackBoardEntity> toOne = this.blackBoardEntity;
        if (toOne != null) {
            return toOne;
        }
        AbstractC5830k.m5339p("blackBoardEntity");
        throw null;
    }

    @NotNull
    public final String getCommandFileName() {
        return this.commandFileName;
    }

    public final int getCommandIndex() {
        return this.commandIndex;
    }

    @NotNull
    public final String getDirName() {
        return this.dirName;
    }

    @NotNull
    public final ToOne<HeaderEntity> getHeaderEntity() {
        ToOne<HeaderEntity> toOne = this.headerEntity;
        if (toOne != null) {
            return toOne;
        }
        AbstractC5830k.m5339p("headerEntity");
        throw null;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final ToOne<RecordEntity> getRecordEntity() {
        ToOne<RecordEntity> toOne = this.recordEntity;
        if (toOne != null) {
            return toOne;
        }
        AbstractC5830k.m5339p("recordEntity");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iM903d = AbstractC0584a.m903d(Long.hashCode(this.id) * 31, 31, this.dirName);
        boolean z8 = this.isChange;
        int i = z8;
        if (z8 != 0) {
            i = 1;
        }
        return Integer.hashCode(this.commandIndex) + AbstractC0584a.m903d((iM903d + i) * 31, 31, this.commandFileName);
    }

    public final boolean isChange() {
        return this.isChange;
    }

    public final void put() {
        C5696a c5696aM5018c = BoardBox.INSTANCE.getBoxStore().m5018c(PageEntity.class);
        try {
            c5696aM5018c.m5034e(this);
        } catch (UniqueViolationException unused) {
            QueryBuilder queryBuilderM5036g = c5696aM5018c.m5036g();
            queryBuilderM5036g.m5064b(PageEntity_.dirName, this.dirName);
            List listM5061b = queryBuilderM5036g.m5063a().m5061b();
            AbstractC5830k.m5329f(listM5061b, "box.query {\n            …ame)\n            }.find()");
            c5696aM5018c.m5040k(listM5061b);
            c5696aM5018c.m5034e(this);
        }
    }

    public final void remove() {
        BoardBox.INSTANCE.getBoxStore().m5018c(PageEntity.class).m5039j(this);
    }

    public final void setBlackBoardEntity(@NotNull ToOne<BlackBoardEntity> toOne) {
        AbstractC5830k.m5330g(toOne, "<set-?>");
        this.blackBoardEntity = toOne;
    }

    public final void setChange(boolean z8) {
        this.isChange = z8;
    }

    public final void setCommandFileName(@NotNull String str) {
        AbstractC5830k.m5330g(str, "<set-?>");
        this.commandFileName = str;
    }

    public final void setCommandIndex(int i) {
        this.commandIndex = i;
    }

    public final void setDirName(@NotNull String str) {
        AbstractC5830k.m5330g(str, "<set-?>");
        this.dirName = str;
    }

    public final void setHeaderEntity(@NotNull ToOne<HeaderEntity> toOne) {
        AbstractC5830k.m5330g(toOne, "<set-?>");
        this.headerEntity = toOne;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setRecordEntity(@NotNull ToOne<RecordEntity> toOne) {
        AbstractC5830k.m5330g(toOne, "<set-?>");
        this.recordEntity = toOne;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("PageEntity(id=");
        sb.append(this.id);
        sb.append(", dirName=");
        sb.append(this.dirName);
        sb.append(", isChange=");
        sb.append(this.isChange);
        sb.append(", commandFileName=");
        sb.append(this.commandFileName);
        sb.append(", commandIndex=");
        return AbstractC0037f.m88m(sb, this.commandIndex, ')');
    }

    public PageEntity(long j7, @NotNull String dirName, boolean z8, @NotNull String commandFileName, int i) {
        AbstractC5830k.m5330g(dirName, "dirName");
        AbstractC5830k.m5330g(commandFileName, "commandFileName");
        this.headerEntity = new ToOne<>(this, PageEntity_.headerEntity);
        this.recordEntity = new ToOne<>(this, PageEntity_.recordEntity);
        this.blackBoardEntity = new ToOne<>(this, PageEntity_.blackBoardEntity);
        this.id = j7;
        this.dirName = dirName;
        this.isChange = z8;
        this.commandFileName = commandFileName;
        this.commandIndex = i;
    }

    public /* synthetic */ PageEntity(long j7, String str, boolean z8, String str2, int i, int i8, AbstractC5824e abstractC5824e) {
        this((i8 & 1) != 0 ? 0L : j7, (i8 & 2) != 0 ? "" : str, (i8 & 4) != 0 ? false : z8, (i8 & 8) != 0 ? "" : str2, (i8 & 16) != 0 ? 0 : i);
    }
}
