package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import androidx.collection.AbstractC0584a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.utils.BoardBox;
import io.objectbox.BoxStore;
import io.objectbox.C5696a;
import io.objectbox.Property;
import io.objectbox.annotation.Backlink;
import io.objectbox.annotation.Entity;
import io.objectbox.annotation.InterfaceC5697Id;
import io.objectbox.annotation.Unique;
import io.objectbox.exception.UniqueViolationException;
import io.objectbox.query.QueryBuilder;
import io.objectbox.relation.ToMany;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u001dR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010!R(\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006*"}, m5110d2 = {"Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;", "", "", "id", "", "dir", "<init>", "(JLjava/lang/String;)V", "Ld6/s;", "put", "()V", "remove", "component1", "()J", "component2", "()Ljava/lang/String;", "copy", "(JLjava/lang/String;)Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "setId", "(J)V", "Ljava/lang/String;", "getDir", "setDir", "(Ljava/lang/String;)V", "Lio/objectbox/relation/ToMany;", "Lcom/zykj/blackboard/core/data/dao/PageEntity;", "pages", "Lio/objectbox/relation/ToMany;", "getPages", "()Lio/objectbox/relation/ToMany;", "setPages", "(Lio/objectbox/relation/ToMany;)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Entity
/* loaded from: classes3.dex */
public final /* data */ class BlackBoardEntity {
    transient BoxStore __boxStore;

    @Unique
    @Nullable
    private String dir;

    @InterfaceC5697Id
    private long id;

    @Backlink(m5042to = "blackBoardEntity")
    public ToMany<PageEntity> pages;

    public BlackBoardEntity() {
        this(0L, null, 3, null);
    }

    public static /* synthetic */ BlackBoardEntity copy$default(BlackBoardEntity blackBoardEntity, long j7, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j7 = blackBoardEntity.id;
        }
        if ((i & 2) != 0) {
            str = blackBoardEntity.dir;
        }
        return blackBoardEntity.copy(j7, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getDir() {
        return this.dir;
    }

    @NotNull
    public final BlackBoardEntity copy(long id, @Nullable String dir) {
        return new BlackBoardEntity(id, dir);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlackBoardEntity)) {
            return false;
        }
        BlackBoardEntity blackBoardEntity = (BlackBoardEntity) other;
        return this.id == blackBoardEntity.id && AbstractC5830k.m5325b(this.dir, blackBoardEntity.dir);
    }

    @Nullable
    public final String getDir() {
        return this.dir;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final ToMany<PageEntity> getPages() {
        ToMany<PageEntity> toMany = this.pages;
        if (toMany != null) {
            return toMany;
        }
        AbstractC5830k.m5339p("pages");
        throw null;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.id) * 31;
        String str = this.dir;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void put() {
        if (this.dir != null) {
            C5696a c5696aM5018c = BoardBox.INSTANCE.getBoxStore().m5018c(BlackBoardEntity.class);
            try {
                c5696aM5018c.m5034e(this);
            } catch (UniqueViolationException unused) {
                QueryBuilder queryBuilderM5036g = c5696aM5018c.m5036g();
                Property<BlackBoardEntity> property = BlackBoardEntity_.dir;
                String str = this.dir;
                AbstractC5830k.m5327d(str);
                queryBuilderM5036g.m5064b(property, str);
                List listM5061b = queryBuilderM5036g.m5063a().m5061b();
                AbstractC5830k.m5329f(listM5061b, "box.query {\n            …\n                }.find()");
                c5696aM5018c.m5040k(listM5061b);
                c5696aM5018c.m5034e(this);
            }
        }
    }

    public final void remove() {
        BoardBox.INSTANCE.getBoxStore().m5018c(BlackBoardEntity.class).m5039j(this);
    }

    public final void setDir(@Nullable String str) {
        this.dir = str;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setPages(@NotNull ToMany<PageEntity> toMany) {
        AbstractC5830k.m5330g(toMany, "<set-?>");
        this.pages = toMany;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BlackBoardEntity(id=");
        sb.append(this.id);
        sb.append(", dir=");
        return AbstractC0584a.m911l(')', this.dir, sb);
    }

    public BlackBoardEntity(long j7, @Nullable String str) {
        this.pages = new ToMany<>(this, BlackBoardEntity_.pages);
        this.id = j7;
        this.dir = str;
    }

    public /* synthetic */ BlackBoardEntity(long j7, String str, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? 0L : j7, (i & 2) != 0 ? null : str);
    }
}
