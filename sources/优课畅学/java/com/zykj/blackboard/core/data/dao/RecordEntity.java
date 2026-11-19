package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import com.zykj.blackboard.utils.BoardBox;
import io.objectbox.BoxStore;
import io.objectbox.annotation.Entity;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@Entity
/* loaded from: classes4.dex */
public final class RecordEntity {
    transient BoxStore __boxStore;
    public ToMany<AudioRecordEntity> audioList;
    public ToMany<CommandRecordEntity> commandList;
    public ToMany<FileRecordEntity> fileList;
    public ToMany<GeometryRecordEntity> geometryList;

    /* renamed from: id */
    private long f8748id;
    public ToMany<MatrixRecordEntity> matrixList;
    public ToOne<PageEntity> page;
    public ToMany<TextRecordEntity> textList;
    public ToMany<TouchRecordEntity> touchList;

    public RecordEntity() {
        this(0L, 1, null);
    }

    public static /* synthetic */ RecordEntity copy$default(RecordEntity recordEntity, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = recordEntity.f8748id;
        }
        return recordEntity.copy(j10);
    }

    public final long component1() {
        return this.f8748id;
    }

    public final RecordEntity copy(long j10) {
        return new RecordEntity(j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecordEntity) && this.f8748id == ((RecordEntity) obj).f8748id;
    }

    public final ToMany<AudioRecordEntity> getAudioList() {
        ToMany<AudioRecordEntity> toMany = this.audioList;
        if (toMany != null) {
            return toMany;
        }
        AbstractC9133u.m16151y("audioList");
        return null;
    }

    public final ToMany<CommandRecordEntity> getCommandList() {
        ToMany<CommandRecordEntity> toMany = this.commandList;
        if (toMany != null) {
            return toMany;
        }
        AbstractC9133u.m16151y("commandList");
        return null;
    }

    public final ToMany<FileRecordEntity> getFileList() {
        ToMany<FileRecordEntity> toMany = this.fileList;
        if (toMany != null) {
            return toMany;
        }
        AbstractC9133u.m16151y("fileList");
        return null;
    }

    public final ToMany<GeometryRecordEntity> getGeometryList() {
        ToMany<GeometryRecordEntity> toMany = this.geometryList;
        if (toMany != null) {
            return toMany;
        }
        AbstractC9133u.m16151y("geometryList");
        return null;
    }

    public final long getId() {
        return this.f8748id;
    }

    public final ToMany<MatrixRecordEntity> getMatrixList() {
        ToMany<MatrixRecordEntity> toMany = this.matrixList;
        if (toMany != null) {
            return toMany;
        }
        AbstractC9133u.m16151y("matrixList");
        return null;
    }

    public final ToOne<PageEntity> getPage() {
        ToOne<PageEntity> toOne = this.page;
        if (toOne != null) {
            return toOne;
        }
        AbstractC9133u.m16151y("page");
        return null;
    }

    public final ToMany<TextRecordEntity> getTextList() {
        ToMany<TextRecordEntity> toMany = this.textList;
        if (toMany != null) {
            return toMany;
        }
        AbstractC9133u.m16151y("textList");
        return null;
    }

    public final ToMany<TouchRecordEntity> getTouchList() {
        ToMany<TouchRecordEntity> toMany = this.touchList;
        if (toMany != null) {
            return toMany;
        }
        AbstractC9133u.m16151y("touchList");
        return null;
    }

    public int hashCode() {
        return Long.hashCode(this.f8748id);
    }

    public final void put() {
        BoardBox.INSTANCE.getBoxStore().m15370d(RecordEntity.class).m15414l(this);
    }

    public final void remove() {
        BoardBox.INSTANCE.getBoxStore().m15370d(RecordEntity.class).m15422t(this);
    }

    public final void setAudioList(ToMany<AudioRecordEntity> toMany) {
        AbstractC9133u.m16133g(toMany, "<set-?>");
        this.audioList = toMany;
    }

    public final void setCommandList(ToMany<CommandRecordEntity> toMany) {
        AbstractC9133u.m16133g(toMany, "<set-?>");
        this.commandList = toMany;
    }

    public final void setFileList(ToMany<FileRecordEntity> toMany) {
        AbstractC9133u.m16133g(toMany, "<set-?>");
        this.fileList = toMany;
    }

    public final void setGeometryList(ToMany<GeometryRecordEntity> toMany) {
        AbstractC9133u.m16133g(toMany, "<set-?>");
        this.geometryList = toMany;
    }

    public final void setId(long j10) {
        this.f8748id = j10;
    }

    public final void setMatrixList(ToMany<MatrixRecordEntity> toMany) {
        AbstractC9133u.m16133g(toMany, "<set-?>");
        this.matrixList = toMany;
    }

    public final void setPage(ToOne<PageEntity> toOne) {
        AbstractC9133u.m16133g(toOne, "<set-?>");
        this.page = toOne;
    }

    public final void setTextList(ToMany<TextRecordEntity> toMany) {
        AbstractC9133u.m16133g(toMany, "<set-?>");
        this.textList = toMany;
    }

    public final void setTouchList(ToMany<TouchRecordEntity> toMany) {
        AbstractC9133u.m16133g(toMany, "<set-?>");
        this.touchList = toMany;
    }

    public String toString() {
        return "RecordEntity(id=" + this.f8748id + ')';
    }

    public RecordEntity(long j10) {
        this.geometryList = new ToMany<>(this, RecordEntity_.geometryList);
        this.textList = new ToMany<>(this, RecordEntity_.textList);
        this.audioList = new ToMany<>(this, RecordEntity_.audioList);
        this.matrixList = new ToMany<>(this, RecordEntity_.matrixList);
        this.touchList = new ToMany<>(this, RecordEntity_.touchList);
        this.fileList = new ToMany<>(this, RecordEntity_.fileList);
        this.commandList = new ToMany<>(this, RecordEntity_.commandList);
        this.page = new ToOne<>(this, RecordEntity_.page);
        this.f8748id = j10;
    }

    public /* synthetic */ RecordEntity(long j10, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? 0L : j10);
    }
}
