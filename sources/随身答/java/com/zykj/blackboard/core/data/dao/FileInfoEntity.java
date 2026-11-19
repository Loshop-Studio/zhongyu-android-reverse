package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import androidx.constraintlayout.widget.ConstraintLayout;
import io.objectbox.BoxStore;
import io.objectbox.annotation.Entity;
import io.objectbox.relation.ToOne;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p263u5.C9685d;

@Metadata(m13412d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010#R\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010 \u001a\u0004\b$\u0010\u0012\"\u0004\b%\u0010#R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001c\u001a\u0004\b&\u0010\u0010\"\u0004\b'\u0010\u001fR(\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00060"}, m13413d2 = {"Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;", "", "", "id", "", "fileName", "", "width", "height", "validate", "<init>", "(JLjava/lang/String;IILjava/lang/String;)V", "", "g", "()V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "c", "()J", "h", "(J)V", "Ljava/lang/String;", "a", "setFileName", "(Ljava/lang/String;)V", "I", "f", "setWidth", "(I)V", "b", "setHeight", "e", "setValidate", "Lio/objectbox/relation/ToOne;", "Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;", "record", "Lio/objectbox/relation/ToOne;", "d", "()Lio/objectbox/relation/ToOne;", "setRecord", "(Lio/objectbox/relation/ToOne;)V", "blackboard_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Entity
/* loaded from: classes4.dex */
public final /* data */ class FileInfoEntity {
    transient BoxStore __boxStore;
    private String fileName;
    private int height;
    private long id;
    public ToOne<FileRecordEntity> record;
    private String validate;
    private int width;

    public FileInfoEntity() {
        this(0L, null, 0, 0, null, 31, null);
    }

    /* renamed from: a, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* renamed from: b, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: c, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: d */
    public final ToOne m7454d() {
        ToOne<FileRecordEntity> toOne = this.record;
        if (toOne != null) {
            return toOne;
        }
        Intrinsics.throwUninitializedPropertyAccessException("record");
        return null;
    }

    /* renamed from: e, reason: from getter */
    public final String getValidate() {
        return this.validate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileInfoEntity)) {
            return false;
        }
        FileInfoEntity fileInfoEntity = (FileInfoEntity) other;
        return this.id == fileInfoEntity.id && Intrinsics.areEqual(this.fileName, fileInfoEntity.fileName) && this.width == fileInfoEntity.width && this.height == fileInfoEntity.height && Intrinsics.areEqual(this.validate, fileInfoEntity.validate);
    }

    /* renamed from: f, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: g */
    public final void m7457g() {
        C9685d.f17121a.m16165f().m13101h(FileInfoEntity.class).m2255l(this);
    }

    /* renamed from: h */
    public final void m7458h(long j9) {
        this.id = j9;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.id) * 31) + this.fileName.hashCode()) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + this.validate.hashCode();
    }

    public String toString() {
        return "FileInfoEntity(id=" + this.id + ", fileName=" + this.fileName + ", width=" + this.width + ", height=" + this.height + ", validate=" + this.validate + ')';
    }

    public FileInfoEntity(long j9, String fileName, int i9, int i10, String validate) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(validate, "validate");
        this.record = new ToOne<>(this, FileInfoEntity_.f8601m);
        this.id = j9;
        this.fileName = fileName;
        this.width = i9;
        this.height = i10;
        this.validate = validate;
    }

    public /* synthetic */ FileInfoEntity(long j9, String str, int i9, int i10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j9, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? 0 : i9, (i11 & 8) != 0 ? 0 : i10, (i11 & 16) != 0 ? "" : str2);
    }
}
