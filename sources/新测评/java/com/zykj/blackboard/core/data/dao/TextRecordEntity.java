package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

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
import p077e5.C7342c;
import p214q8.C8980a;

@Metadata(m13557d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006("}, m13558d2 = {"Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;", "", "", "id", "", "fileName", "validate", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "", "e", "()V", "J", "b", "()J", "f", "(J)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "setFileName", "(Ljava/lang/String;)V", "d", "setValidate", "Lio/objectbox/relation/ToOne;", "Lcom/zykj/blackboard/core/data/dao/RecordEntity;", "record", "Lio/objectbox/relation/ToOne;", "getRecord", "()Lio/objectbox/relation/ToOne;", "setRecord", "(Lio/objectbox/relation/ToOne;)V", "Lio/objectbox/relation/ToMany;", "Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;", "textInfoEntityList", "Lio/objectbox/relation/ToMany;", "c", "()Lio/objectbox/relation/ToMany;", "setTextInfoEntityList", "(Lio/objectbox/relation/ToMany;)V", "blackboard_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
@Entity
/* loaded from: classes4.dex */
public final class TextRecordEntity {
    transient BoxStore __boxStore;
    private String fileName;
    private long id;
    public ToOne<RecordEntity> record;
    public ToMany<TextInfoEntity> textInfoEntityList;
    private String validate;

    public TextRecordEntity() {
        this(0L, null, null, 7, null);
    }

    /* renamed from: a, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* renamed from: b, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: c */
    public final ToMany m6573c() {
        ToMany<TextInfoEntity> toMany = this.textInfoEntityList;
        if (toMany != null) {
            return toMany;
        }
        Intrinsics.throwUninitializedPropertyAccessException("textInfoEntityList");
        return null;
    }

    /* renamed from: d, reason: from getter */
    public final String getValidate() {
        return this.validate;
    }

    /* renamed from: e */
    public final void m6575e() {
        C8980a box = C7342c.f11908a.m11744b().m12981h(TextRecordEntity.class);
        try {
            box.m15045l(this);
        } catch (UniqueViolationException unused) {
            Intrinsics.checkNotNullExpressionValue(box, "box");
            QueryBuilder builder = box.m15047n();
            Intrinsics.checkNotNullExpressionValue(builder, "builder");
            builder.m13041g(TextRecordEntity_.f7600f, this.fileName);
            Query queryM13039a = builder.m13039a();
            Intrinsics.checkNotNullExpressionValue(queryM13039a, "builder.build()");
            List listM13031n = queryM13039a.m13031n();
            Intrinsics.checkNotNullExpressionValue(listM13031n, "box.query {\n            …ame)\n            }.find()");
            box.m15051r(listM13031n);
            box.m15045l(this);
        }
    }

    /* renamed from: f */
    public final void m6576f(long j10) {
        this.id = j10;
    }

    public TextRecordEntity(long j10, String fileName, String validate) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(validate, "validate");
        this.textInfoEntityList = new ToMany<>(this, TextRecordEntity_.f7606l);
        this.record = new ToOne<>(this, TextRecordEntity_.f7605k);
        this.id = j10;
        this.fileName = fileName;
        this.validate = validate;
    }

    public /* synthetic */ TextRecordEntity(long j10, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? "" : str2);
    }
}
