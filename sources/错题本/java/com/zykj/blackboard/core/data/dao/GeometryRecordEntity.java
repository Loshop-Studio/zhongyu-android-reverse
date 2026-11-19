package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.utils.BoardBox;
import io.objectbox.BoxStore;
import io.objectbox.C5696a;
import io.objectbox.annotation.Entity;
import io.objectbox.annotation.InterfaceC5697Id;
import io.objectbox.annotation.Unique;
import io.objectbox.exception.UniqueViolationException;
import io.objectbox.query.QueryBuilder;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006)"}, m5110d2 = {"Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;", "", "", "id", "", "fileName", "validate", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "Ld6/s;", "put", "()V", "remove", "J", "getId", "()J", "setId", "(J)V", "Ljava/lang/String;", "getFileName", "()Ljava/lang/String;", "setFileName", "(Ljava/lang/String;)V", "getValidate", "setValidate", "Lio/objectbox/relation/ToOne;", "Lcom/zykj/blackboard/core/data/dao/RecordEntity;", "record", "Lio/objectbox/relation/ToOne;", "getRecord", "()Lio/objectbox/relation/ToOne;", "setRecord", "(Lio/objectbox/relation/ToOne;)V", "Lio/objectbox/relation/ToMany;", "Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;", "geometryInfoEntityList", "Lio/objectbox/relation/ToMany;", "getGeometryInfoEntityList", "()Lio/objectbox/relation/ToMany;", "setGeometryInfoEntityList", "(Lio/objectbox/relation/ToMany;)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Entity
/* loaded from: classes3.dex */
public final class GeometryRecordEntity {
    transient BoxStore __boxStore;

    @Unique
    @NotNull
    private String fileName;
    public ToMany<GeometryInfoEntity> geometryInfoEntityList;

    @InterfaceC5697Id
    private long id;
    public ToOne<RecordEntity> record;

    @NotNull
    private String validate;

    public GeometryRecordEntity() {
        this(0L, null, null, 7, null);
    }

    @NotNull
    public final String getFileName() {
        return this.fileName;
    }

    @NotNull
    public final ToMany<GeometryInfoEntity> getGeometryInfoEntityList() {
        ToMany<GeometryInfoEntity> toMany = this.geometryInfoEntityList;
        if (toMany != null) {
            return toMany;
        }
        AbstractC5830k.m5339p("geometryInfoEntityList");
        throw null;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final ToOne<RecordEntity> getRecord() {
        ToOne<RecordEntity> toOne = this.record;
        if (toOne != null) {
            return toOne;
        }
        AbstractC5830k.m5339p("record");
        throw null;
    }

    @NotNull
    public final String getValidate() {
        return this.validate;
    }

    public final void put() {
        C5696a c5696aM5018c = BoardBox.INSTANCE.getBoxStore().m5018c(GeometryRecordEntity.class);
        try {
            c5696aM5018c.m5034e(this);
        } catch (UniqueViolationException unused) {
            QueryBuilder queryBuilderM5036g = c5696aM5018c.m5036g();
            queryBuilderM5036g.m5064b(GeometryRecordEntity_.fileName, this.fileName);
            List listM5061b = queryBuilderM5036g.m5063a().m5061b();
            AbstractC5830k.m5329f(listM5061b, "box.query {\n            …ame)\n            }.find()");
            c5696aM5018c.m5040k(listM5061b);
            c5696aM5018c.m5034e(this);
        }
    }

    public final void remove() {
        BoardBox.INSTANCE.getBoxStore().m5018c(GeometryRecordEntity.class).m5039j(this);
    }

    public final void setFileName(@NotNull String str) {
        AbstractC5830k.m5330g(str, "<set-?>");
        this.fileName = str;
    }

    public final void setGeometryInfoEntityList(@NotNull ToMany<GeometryInfoEntity> toMany) {
        AbstractC5830k.m5330g(toMany, "<set-?>");
        this.geometryInfoEntityList = toMany;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setRecord(@NotNull ToOne<RecordEntity> toOne) {
        AbstractC5830k.m5330g(toOne, "<set-?>");
        this.record = toOne;
    }

    public final void setValidate(@NotNull String str) {
        AbstractC5830k.m5330g(str, "<set-?>");
        this.validate = str;
    }

    public GeometryRecordEntity(long j7, @NotNull String fileName, @NotNull String validate) {
        AbstractC5830k.m5330g(fileName, "fileName");
        AbstractC5830k.m5330g(validate, "validate");
        this.geometryInfoEntityList = new ToMany<>(this, GeometryRecordEntity_.geometryInfoEntityList);
        this.record = new ToOne<>(this, GeometryRecordEntity_.record);
        this.id = j7;
        this.fileName = fileName;
        this.validate = validate;
    }

    public /* synthetic */ GeometryRecordEntity(long j7, String str, String str2, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? 0L : j7, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }
}
