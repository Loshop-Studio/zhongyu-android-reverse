package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import androidx.constraintlayout.widget.ConstraintLayout;
import io.objectbox.BoxStore;
import io.objectbox.annotation.Entity;
import io.objectbox.exception.UniqueViolationException;
import io.objectbox.query.Query;
import io.objectbox.query.QueryBuilder;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p026b8.C5206a;
import p263u5.C9685d;

@Metadata(m13412d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006("}, m13413d2 = {"Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;", "", "", "id", "", "fileName", "validate", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "", "e", "()V", "J", "c", "()J", "f", "(J)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "setFileName", "(Ljava/lang/String;)V", "d", "g", "Lio/objectbox/relation/ToOne;", "Lcom/zykj/blackboard/core/data/dao/RecordEntity;", "record", "Lio/objectbox/relation/ToOne;", "getRecord", "()Lio/objectbox/relation/ToOne;", "setRecord", "(Lio/objectbox/relation/ToOne;)V", "Lio/objectbox/relation/ToMany;", "Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;", "geometryInfoEntityList", "Lio/objectbox/relation/ToMany;", "b", "()Lio/objectbox/relation/ToMany;", "setGeometryInfoEntityList", "(Lio/objectbox/relation/ToMany;)V", "blackboard_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Entity
/* loaded from: classes4.dex */
public final class GeometryRecordEntity {
    transient BoxStore __boxStore;
    private String fileName;
    public ToMany<GeometryInfoEntity> geometryInfoEntityList;
    private long id;
    public ToOne<RecordEntity> record;
    private String validate;

    public GeometryRecordEntity() {
        this(0L, null, null, 7, null);
    }

    /* renamed from: a, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* renamed from: b */
    public final ToMany m7505b() {
        ToMany<GeometryInfoEntity> toMany = this.geometryInfoEntityList;
        if (toMany != null) {
            return toMany;
        }
        Intrinsics.throwUninitializedPropertyAccessException("geometryInfoEntityList");
        return null;
    }

    /* renamed from: c, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: d, reason: from getter */
    public final String getValidate() {
        return this.validate;
    }

    /* renamed from: e */
    public final void m7508e() {
        C5206a box = C9685d.f17121a.m16165f().m13101h(GeometryRecordEntity.class);
        try {
            box.m2255l(this);
        } catch (UniqueViolationException unused) {
            Intrinsics.checkNotNullExpressionValue(box, "box");
            QueryBuilder builder = box.m2257n();
            Intrinsics.checkNotNullExpressionValue(builder, "builder");
            builder.m13160g(GeometryRecordEntity_.f8670f, this.fileName);
            Query queryM13158a = builder.m13158a();
            Intrinsics.checkNotNullExpressionValue(queryM13158a, "builder.build()");
            List listM13150n = queryM13158a.m13150n();
            Intrinsics.checkNotNullExpressionValue(listM13150n, "box.query {\n            …ame)\n            }.find()");
            box.m2261r(listM13150n);
            box.m2255l(this);
        }
    }

    /* renamed from: f */
    public final void m7509f(long j9) {
        this.id = j9;
    }

    /* renamed from: g */
    public final void m7510g(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.validate = str;
    }

    public GeometryRecordEntity(long j9, String fileName, String validate) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(validate, "validate");
        this.geometryInfoEntityList = new ToMany<>(this, GeometryRecordEntity_.f8676l);
        this.record = new ToOne<>(this, GeometryRecordEntity_.f8675k);
        this.id = j9;
        this.fileName = fileName;
        this.validate = validate;
    }

    public /* synthetic */ GeometryRecordEntity(long j9, String str, String str2, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? 0L : j9, (i9 & 2) != 0 ? "" : str, (i9 & 4) != 0 ? "" : str2);
    }
}
