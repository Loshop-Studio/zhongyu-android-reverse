package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import androidx.collection.AbstractC0584a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.utils.BoardBox;
import io.objectbox.BoxStore;
import io.objectbox.annotation.Entity;
import io.objectbox.annotation.InterfaceC5697Id;
import io.objectbox.relation.ToOne;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013JB\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0013J\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0013\"\u0004\b&\u0010'R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0015\"\u0004\b*\u0010+R\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010(\u001a\u0004\b,\u0010\u0015\"\u0004\b-\u0010+R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010$\u001a\u0004\b.\u0010\u0013\"\u0004\b/\u0010'R(\u00102\u001a\b\u0012\u0004\u0012\u000201008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u00068"}, m5110d2 = {"Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;", "", "", "id", "", "fileName", "", "width", "height", "validate", "<init>", "(JLjava/lang/String;IILjava/lang/String;)V", "Ld6/s;", "put", "()V", "remove", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "()I", "component4", "component5", "copy", "(JLjava/lang/String;IILjava/lang/String;)Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "setId", "(J)V", "Ljava/lang/String;", "getFileName", "setFileName", "(Ljava/lang/String;)V", "I", "getWidth", "setWidth", "(I)V", "getHeight", "setHeight", "getValidate", "setValidate", "Lio/objectbox/relation/ToOne;", "Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;", "record", "Lio/objectbox/relation/ToOne;", "getRecord", "()Lio/objectbox/relation/ToOne;", "setRecord", "(Lio/objectbox/relation/ToOne;)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Entity
/* loaded from: classes3.dex */
public final /* data */ class FileInfoEntity {
    transient BoxStore __boxStore;

    @NotNull
    private String fileName;
    private int height;

    @InterfaceC5697Id
    private long id;
    public ToOne<FileRecordEntity> record;

    @NotNull
    private String validate;
    private int width;

    public FileInfoEntity() {
        this(0L, null, 0, 0, null, 31, null);
    }

    public static /* synthetic */ FileInfoEntity copy$default(FileInfoEntity fileInfoEntity, long j7, String str, int i, int i8, String str2, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            j7 = fileInfoEntity.id;
        }
        long j8 = j7;
        if ((i9 & 2) != 0) {
            str = fileInfoEntity.fileName;
        }
        String str3 = str;
        if ((i9 & 4) != 0) {
            i = fileInfoEntity.width;
        }
        int i10 = i;
        if ((i9 & 8) != 0) {
            i8 = fileInfoEntity.height;
        }
        int i11 = i8;
        if ((i9 & 16) != 0) {
            str2 = fileInfoEntity.validate;
        }
        return fileInfoEntity.copy(j8, str3, i10, i11, str2);
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

    /* renamed from: component3, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component4, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getValidate() {
        return this.validate;
    }

    @NotNull
    public final FileInfoEntity copy(long id, @NotNull String fileName, int width, int height, @NotNull String validate) {
        AbstractC5830k.m5330g(fileName, "fileName");
        AbstractC5830k.m5330g(validate, "validate");
        return new FileInfoEntity(id, fileName, width, height, validate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileInfoEntity)) {
            return false;
        }
        FileInfoEntity fileInfoEntity = (FileInfoEntity) other;
        return this.id == fileInfoEntity.id && AbstractC5830k.m5325b(this.fileName, fileInfoEntity.fileName) && this.width == fileInfoEntity.width && this.height == fileInfoEntity.height && AbstractC5830k.m5325b(this.validate, fileInfoEntity.validate);
    }

    @NotNull
    public final String getFileName() {
        return this.fileName;
    }

    public final int getHeight() {
        return this.height;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final ToOne<FileRecordEntity> getRecord() {
        ToOne<FileRecordEntity> toOne = this.record;
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

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return this.validate.hashCode() + AbstractC0584a.m902c(this.height, AbstractC0584a.m902c(this.width, AbstractC0584a.m903d(Long.hashCode(this.id) * 31, 31, this.fileName), 31), 31);
    }

    public final void put() {
        BoardBox.INSTANCE.getBoxStore().m5018c(FileInfoEntity.class).m5034e(this);
    }

    public final void remove() {
        BoardBox.INSTANCE.getBoxStore().m5018c(FileInfoEntity.class).m5039j(this);
    }

    public final void setFileName(@NotNull String str) {
        AbstractC5830k.m5330g(str, "<set-?>");
        this.fileName = str;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setRecord(@NotNull ToOne<FileRecordEntity> toOne) {
        AbstractC5830k.m5330g(toOne, "<set-?>");
        this.record = toOne;
    }

    public final void setValidate(@NotNull String str) {
        AbstractC5830k.m5330g(str, "<set-?>");
        this.validate = str;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("FileInfoEntity(id=");
        sb.append(this.id);
        sb.append(", fileName=");
        sb.append(this.fileName);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", validate=");
        return AbstractC0584a.m911l(')', this.validate, sb);
    }

    public FileInfoEntity(long j7, @NotNull String fileName, int i, int i8, @NotNull String validate) {
        AbstractC5830k.m5330g(fileName, "fileName");
        AbstractC5830k.m5330g(validate, "validate");
        this.record = new ToOne<>(this, FileInfoEntity_.record);
        this.id = j7;
        this.fileName = fileName;
        this.width = i;
        this.height = i8;
        this.validate = validate;
    }

    public /* synthetic */ FileInfoEntity(long j7, String str, int i, int i8, String str2, int i9, AbstractC5824e abstractC5824e) {
        this((i9 & 1) != 0 ? 0L : j7, (i9 & 2) != 0 ? "" : str, (i9 & 4) != 0 ? 0 : i, (i9 & 8) != 0 ? 0 : i8, (i9 & 16) != 0 ? "" : str2);
    }
}
