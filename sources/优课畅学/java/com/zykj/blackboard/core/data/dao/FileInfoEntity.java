package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import com.zykj.blackboard.utils.BoardBox;
import io.objectbox.BoxStore;
import io.objectbox.annotation.Entity;
import io.objectbox.relation.ToOne;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@Entity
/* loaded from: classes4.dex */
public final class FileInfoEntity {
    transient BoxStore __boxStore;
    private String fileName;
    private int height;

    /* renamed from: id */
    private long f8722id;
    public ToOne<FileRecordEntity> record;
    private String validate;
    private int width;

    public FileInfoEntity() {
        this(0L, null, 0, 0, null, 31, null);
    }

    public static /* synthetic */ FileInfoEntity copy$default(FileInfoEntity fileInfoEntity, long j10, String str, int i10, int i11, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j10 = fileInfoEntity.f8722id;
        }
        long j11 = j10;
        if ((i12 & 2) != 0) {
            str = fileInfoEntity.fileName;
        }
        String str3 = str;
        if ((i12 & 4) != 0) {
            i10 = fileInfoEntity.width;
        }
        int i13 = i10;
        if ((i12 & 8) != 0) {
            i11 = fileInfoEntity.height;
        }
        int i14 = i11;
        if ((i12 & 16) != 0) {
            str2 = fileInfoEntity.validate;
        }
        return fileInfoEntity.copy(j11, str3, i13, i14, str2);
    }

    public final long component1() {
        return this.f8722id;
    }

    public final String component2() {
        return this.fileName;
    }

    public final int component3() {
        return this.width;
    }

    public final int component4() {
        return this.height;
    }

    public final String component5() {
        return this.validate;
    }

    public final FileInfoEntity copy(long j10, String fileName, int i10, int i11, String validate) {
        AbstractC9133u.m16133g(fileName, "fileName");
        AbstractC9133u.m16133g(validate, "validate");
        return new FileInfoEntity(j10, fileName, i10, i11, validate);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileInfoEntity)) {
            return false;
        }
        FileInfoEntity fileInfoEntity = (FileInfoEntity) obj;
        return this.f8722id == fileInfoEntity.f8722id && AbstractC9133u.m16128b(this.fileName, fileInfoEntity.fileName) && this.width == fileInfoEntity.width && this.height == fileInfoEntity.height && AbstractC9133u.m16128b(this.validate, fileInfoEntity.validate);
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final int getHeight() {
        return this.height;
    }

    public final long getId() {
        return this.f8722id;
    }

    public final ToOne<FileRecordEntity> getRecord() {
        ToOne<FileRecordEntity> toOne = this.record;
        if (toOne != null) {
            return toOne;
        }
        AbstractC9133u.m16151y("record");
        return null;
    }

    public final String getValidate() {
        return this.validate;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.f8722id) * 31) + this.fileName.hashCode()) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + this.validate.hashCode();
    }

    public final void put() {
        BoardBox.INSTANCE.getBoxStore().m15370d(FileInfoEntity.class).m15414l(this);
    }

    public final void remove() {
        BoardBox.INSTANCE.getBoxStore().m15370d(FileInfoEntity.class).m15422t(this);
    }

    public final void setFileName(String str) {
        AbstractC9133u.m16133g(str, "<set-?>");
        this.fileName = str;
    }

    public final void setHeight(int i10) {
        this.height = i10;
    }

    public final void setId(long j10) {
        this.f8722id = j10;
    }

    public final void setRecord(ToOne<FileRecordEntity> toOne) {
        AbstractC9133u.m16133g(toOne, "<set-?>");
        this.record = toOne;
    }

    public final void setValidate(String str) {
        AbstractC9133u.m16133g(str, "<set-?>");
        this.validate = str;
    }

    public final void setWidth(int i10) {
        this.width = i10;
    }

    public String toString() {
        return "FileInfoEntity(id=" + this.f8722id + ", fileName=" + this.fileName + ", width=" + this.width + ", height=" + this.height + ", validate=" + this.validate + ')';
    }

    public FileInfoEntity(long j10, String fileName, int i10, int i11, String validate) {
        AbstractC9133u.m16133g(fileName, "fileName");
        AbstractC9133u.m16133g(validate, "validate");
        this.record = new ToOne<>(this, FileInfoEntity_.record);
        this.f8722id = j10;
        this.fileName = fileName;
        this.width = i10;
        this.height = i11;
        this.validate = validate;
    }

    public /* synthetic */ FileInfoEntity(long j10, String str, int i10, int i11, String str2, int i12, AbstractC9126n abstractC9126n) {
        this((i12 & 1) != 0 ? 0L : j10, (i12 & 2) != 0 ? "" : str, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11, (i12 & 16) != 0 ? "" : str2);
    }
}
