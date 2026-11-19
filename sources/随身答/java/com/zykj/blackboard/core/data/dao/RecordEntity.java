package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import androidx.constraintlayout.widget.ConstraintLayout;
import io.objectbox.BoxStore;
import io.objectbox.annotation.Entity;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p263u5.C9685d;

@Metadata(m13412d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0005R(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R(\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u001f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R(\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u001f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010$\"\u0004\b.\u0010&R(\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u001f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b0\u0010\"\u001a\u0004\b1\u0010$\"\u0004\b2\u0010&R(\u00104\u001a\b\u0012\u0004\u0012\u0002030\u001f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b4\u0010\"\u001a\u0004\b5\u0010$\"\u0004\b6\u0010&R(\u00108\u001a\b\u0012\u0004\u0012\u0002070\u001f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b8\u0010\"\u001a\u0004\b9\u0010$\"\u0004\b:\u0010&R(\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u001f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b<\u0010\"\u001a\u0004\b=\u0010$\"\u0004\b>\u0010&¨\u0006?"}, m13413d2 = {"Lcom/zykj/blackboard/core/data/dao/RecordEntity;", "", "", "id", "<init>", "(J)V", "", "j", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "e", "()J", "k", "Lio/objectbox/relation/ToOne;", "Lcom/zykj/blackboard/core/data/dao/PageEntity;", "page", "Lio/objectbox/relation/ToOne;", "g", "()Lio/objectbox/relation/ToOne;", "setPage", "(Lio/objectbox/relation/ToOne;)V", "Lio/objectbox/relation/ToMany;", "Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;", "commandList", "Lio/objectbox/relation/ToMany;", "b", "()Lio/objectbox/relation/ToMany;", "setCommandList", "(Lio/objectbox/relation/ToMany;)V", "Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;", "fileList", "c", "setFileList", "Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;", "touchList", "i", "setTouchList", "Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;", "matrixList", "f", "setMatrixList", "Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;", "audioList", "a", "setAudioList", "Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;", "textList", "h", "setTextList", "Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;", "geometryList", "d", "setGeometryList", "blackboard_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Entity
/* loaded from: classes4.dex */
public final /* data */ class RecordEntity {
    transient BoxStore __boxStore;
    public ToMany<AudioRecordEntity> audioList;
    public ToMany<CommandRecordEntity> commandList;
    public ToMany<FileRecordEntity> fileList;
    public ToMany<GeometryRecordEntity> geometryList;
    private long id;
    public ToMany<MatrixRecordEntity> matrixList;
    public ToOne<PageEntity> page;
    public ToMany<TextRecordEntity> textList;
    public ToMany<TouchRecordEntity> touchList;

    public RecordEntity() {
        this(0L, 1, null);
    }

    /* renamed from: a */
    public final ToMany m7629a() {
        ToMany<AudioRecordEntity> toMany = this.audioList;
        if (toMany != null) {
            return toMany;
        }
        Intrinsics.throwUninitializedPropertyAccessException("audioList");
        return null;
    }

    /* renamed from: b */
    public final ToMany m7630b() {
        ToMany<CommandRecordEntity> toMany = this.commandList;
        if (toMany != null) {
            return toMany;
        }
        Intrinsics.throwUninitializedPropertyAccessException("commandList");
        return null;
    }

    /* renamed from: c */
    public final ToMany m7631c() {
        ToMany<FileRecordEntity> toMany = this.fileList;
        if (toMany != null) {
            return toMany;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fileList");
        return null;
    }

    /* renamed from: d */
    public final ToMany m7632d() {
        ToMany<GeometryRecordEntity> toMany = this.geometryList;
        if (toMany != null) {
            return toMany;
        }
        Intrinsics.throwUninitializedPropertyAccessException("geometryList");
        return null;
    }

    /* renamed from: e, reason: from getter */
    public final long getId() {
        return this.id;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RecordEntity) && this.id == ((RecordEntity) other).id;
    }

    /* renamed from: f */
    public final ToMany m7634f() {
        ToMany<MatrixRecordEntity> toMany = this.matrixList;
        if (toMany != null) {
            return toMany;
        }
        Intrinsics.throwUninitializedPropertyAccessException("matrixList");
        return null;
    }

    /* renamed from: g */
    public final ToOne m7635g() {
        ToOne<PageEntity> toOne = this.page;
        if (toOne != null) {
            return toOne;
        }
        Intrinsics.throwUninitializedPropertyAccessException("page");
        return null;
    }

    /* renamed from: h */
    public final ToMany m7636h() {
        ToMany<TextRecordEntity> toMany = this.textList;
        if (toMany != null) {
            return toMany;
        }
        Intrinsics.throwUninitializedPropertyAccessException("textList");
        return null;
    }

    public int hashCode() {
        return Long.hashCode(this.id);
    }

    /* renamed from: i */
    public final ToMany m7637i() {
        ToMany<TouchRecordEntity> toMany = this.touchList;
        if (toMany != null) {
            return toMany;
        }
        Intrinsics.throwUninitializedPropertyAccessException("touchList");
        return null;
    }

    /* renamed from: j */
    public final void m7638j() {
        C9685d.f17121a.m16165f().m13101h(RecordEntity.class).m2255l(this);
    }

    /* renamed from: k */
    public final void m7639k(long j9) {
        this.id = j9;
    }

    public String toString() {
        return "RecordEntity(id=" + this.id + ')';
    }

    public RecordEntity(long j9) {
        this.geometryList = new ToMany<>(this, RecordEntity_.f8849p);
        this.textList = new ToMany<>(this, RecordEntity_.f8848o);
        this.audioList = new ToMany<>(this, RecordEntity_.f8847n);
        this.matrixList = new ToMany<>(this, RecordEntity_.f8846m);
        this.touchList = new ToMany<>(this, RecordEntity_.f8845l);
        this.fileList = new ToMany<>(this, RecordEntity_.f8844k);
        this.commandList = new ToMany<>(this, RecordEntity_.f8843j);
        this.page = new ToOne<>(this, RecordEntity_.f8842i);
        this.id = j9;
    }

    public /* synthetic */ RecordEntity(long j9, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? 0L : j9);
    }
}
