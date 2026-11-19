package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

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
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J.\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010#R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\u0010\"\u0004\b%\u0010#R(\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R(\u00100\u001a\b\u0012\u0004\u0012\u00020/0.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00066"}, m5110d2 = {"Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;", "", "", "id", "", "fileName", "validate", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "Ld6/s;", "put", "()V", "remove", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "copy", "(JLjava/lang/String;Ljava/lang/String;)Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "setId", "(J)V", "Ljava/lang/String;", "getFileName", "setFileName", "(Ljava/lang/String;)V", "getValidate", "setValidate", "Lio/objectbox/relation/ToOne;", "Lcom/zykj/blackboard/core/data/dao/RecordEntity;", "record", "Lio/objectbox/relation/ToOne;", "getRecord", "()Lio/objectbox/relation/ToOne;", "setRecord", "(Lio/objectbox/relation/ToOne;)V", "Lio/objectbox/relation/ToMany;", "Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;", "fileInfoEntity", "Lio/objectbox/relation/ToMany;", "getFileInfoEntity", "()Lio/objectbox/relation/ToMany;", "setFileInfoEntity", "(Lio/objectbox/relation/ToMany;)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Entity
/* loaded from: classes3.dex */
public final /* data */ class FileRecordEntity {
    transient BoxStore __boxStore;
    public ToMany<FileInfoEntity> fileInfoEntity;

    @Unique
    @NotNull
    private String fileName;

    @InterfaceC5697Id
    private long id;
    public ToOne<RecordEntity> record;

    @NotNull
    private String validate;

    public FileRecordEntity() {
        this(0L, null, null, 7, null);
    }

    public static /* synthetic */ FileRecordEntity copy$default(FileRecordEntity fileRecordEntity, long j7, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j7 = fileRecordEntity.id;
        }
        if ((i & 2) != 0) {
            str = fileRecordEntity.fileName;
        }
        if ((i & 4) != 0) {
            str2 = fileRecordEntity.validate;
        }
        return fileRecordEntity.copy(j7, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getValidate() {
        return this.validate;
    }

    @NotNull
    public final FileRecordEntity copy(long id, @NotNull String fileName, @NotNull String validate) {
        AbstractC5830k.m5330g(fileName, "fileName");
        AbstractC5830k.m5330g(validate, "validate");
        return new FileRecordEntity(id, fileName, validate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileRecordEntity)) {
            return false;
        }
        FileRecordEntity fileRecordEntity = (FileRecordEntity) other;
        return this.id == fileRecordEntity.id && AbstractC5830k.m5325b(this.fileName, fileRecordEntity.fileName) && AbstractC5830k.m5325b(this.validate, fileRecordEntity.validate);
    }

    @NotNull
    public final ToMany<FileInfoEntity> getFileInfoEntity() {
        ToMany<FileInfoEntity> toMany = this.fileInfoEntity;
        if (toMany != null) {
            return toMany;
        }
        AbstractC5830k.m5339p("fileInfoEntity");
        throw null;
    }

    @NotNull
    public final String getFileName() {
        return this.fileName;
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

    public int hashCode() {
        return this.validate.hashCode() + AbstractC0584a.m903d(Long.hashCode(this.id) * 31, 31, this.fileName);
    }

    public final void put() {
        C5696a c5696aM5018c = BoardBox.INSTANCE.getBoxStore().m5018c(FileRecordEntity.class);
        try {
            c5696aM5018c.m5034e(this);
        } catch (UniqueViolationException unused) {
            QueryBuilder queryBuilderM5036g = c5696aM5018c.m5036g();
            queryBuilderM5036g.m5064b(FileRecordEntity_.fileName, this.fileName);
            List listM5061b = queryBuilderM5036g.m5063a().m5061b();
            AbstractC5830k.m5329f(listM5061b, "box.query {\n            …ame)\n            }.find()");
            c5696aM5018c.m5040k(listM5061b);
            c5696aM5018c.m5034e(this);
        }
    }

    public final void remove() {
        BoardBox.INSTANCE.getBoxStore().m5018c(FileRecordEntity.class).m5039j(this);
    }

    public final void setFileInfoEntity(@NotNull ToMany<FileInfoEntity> toMany) {
        AbstractC5830k.m5330g(toMany, "<set-?>");
        this.fileInfoEntity = toMany;
    }

    public final void setFileName(@NotNull String str) {
        AbstractC5830k.m5330g(str, "<set-?>");
        this.fileName = str;
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

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("FileRecordEntity(id=");
        sb.append(this.id);
        sb.append(", fileName=");
        sb.append(this.fileName);
        sb.append(", validate=");
        return AbstractC0584a.m911l(')', this.validate, sb);
    }

    public FileRecordEntity(long j7, @NotNull String fileName, @NotNull String validate) {
        AbstractC5830k.m5330g(fileName, "fileName");
        AbstractC5830k.m5330g(validate, "validate");
        this.fileInfoEntity = new ToMany<>(this, FileRecordEntity_.fileInfoEntity);
        this.record = new ToOne<>(this, FileRecordEntity_.record);
        this.id = j7;
        this.fileName = fileName;
        this.validate = validate;
    }

    public /* synthetic */ FileRecordEntity(long j7, String str, String str2, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? 0L : j7, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }
}
