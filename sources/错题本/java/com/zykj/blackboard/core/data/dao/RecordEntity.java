package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.utils.BoardBox;
import io.objectbox.BoxStore;
import io.objectbox.annotation.Backlink;
import io.objectbox.annotation.Entity;
import io.objectbox.annotation.InterfaceC5697Id;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b\"\u0004\b\u001a\u0010\u0005R(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R(\u0010,\u001a\b\u0012\u0004\u0012\u00020+0#8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R(\u00100\u001a\b\u0012\u0004\u0012\u00020/0#8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b0\u0010&\u001a\u0004\b1\u0010(\"\u0004\b2\u0010*R(\u00104\u001a\b\u0012\u0004\u0012\u0002030#8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b4\u0010&\u001a\u0004\b5\u0010(\"\u0004\b6\u0010*R(\u00108\u001a\b\u0012\u0004\u0012\u0002070#8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b8\u0010&\u001a\u0004\b9\u0010(\"\u0004\b:\u0010*R(\u0010<\u001a\b\u0012\u0004\u0012\u00020;0#8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b<\u0010&\u001a\u0004\b=\u0010(\"\u0004\b>\u0010*R(\u0010@\u001a\b\u0012\u0004\u0012\u00020?0#8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b@\u0010&\u001a\u0004\bA\u0010(\"\u0004\bB\u0010*¨\u0006C"}, m5110d2 = {"Lcom/zykj/blackboard/core/data/dao/RecordEntity;", "", "", "id", "<init>", "(J)V", "Ld6/s;", "put", "()V", "remove", "component1", "()J", "copy", "(J)Lcom/zykj/blackboard/core/data/dao/RecordEntity;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "setId", "Lio/objectbox/relation/ToOne;", "Lcom/zykj/blackboard/core/data/dao/PageEntity;", "page", "Lio/objectbox/relation/ToOne;", "getPage", "()Lio/objectbox/relation/ToOne;", "setPage", "(Lio/objectbox/relation/ToOne;)V", "Lio/objectbox/relation/ToMany;", "Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;", "commandList", "Lio/objectbox/relation/ToMany;", "getCommandList", "()Lio/objectbox/relation/ToMany;", "setCommandList", "(Lio/objectbox/relation/ToMany;)V", "Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;", "fileList", "getFileList", "setFileList", "Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;", "touchList", "getTouchList", "setTouchList", "Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;", "matrixList", "getMatrixList", "setMatrixList", "Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;", "audioList", "getAudioList", "setAudioList", "Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;", "textList", "getTextList", "setTextList", "Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;", "geometryList", "getGeometryList", "setGeometryList", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Entity
/* loaded from: classes3.dex */
public final /* data */ class RecordEntity {
    transient BoxStore __boxStore;

    @Backlink(m5042to = "record")
    public ToMany<AudioRecordEntity> audioList;

    @Backlink(m5042to = "record")
    public ToMany<CommandRecordEntity> commandList;

    @Backlink(m5042to = "record")
    public ToMany<FileRecordEntity> fileList;

    @Backlink(m5042to = "record")
    public ToMany<GeometryRecordEntity> geometryList;

    @InterfaceC5697Id
    private long id;

    @Backlink(m5042to = "record")
    public ToMany<MatrixRecordEntity> matrixList;
    public ToOne<PageEntity> page;

    @Backlink(m5042to = "record")
    public ToMany<TextRecordEntity> textList;

    @Backlink(m5042to = "record")
    public ToMany<TouchRecordEntity> touchList;

    public RecordEntity() {
        this(0L, 1, null);
    }

    public static /* synthetic */ RecordEntity copy$default(RecordEntity recordEntity, long j7, int i, Object obj) {
        if ((i & 1) != 0) {
            j7 = recordEntity.id;
        }
        return recordEntity.copy(j7);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    public final RecordEntity copy(long id) {
        return new RecordEntity(id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RecordEntity) && this.id == ((RecordEntity) other).id;
    }

    @NotNull
    public final ToMany<AudioRecordEntity> getAudioList() {
        ToMany<AudioRecordEntity> toMany = this.audioList;
        if (toMany != null) {
            return toMany;
        }
        AbstractC5830k.m5339p("audioList");
        throw null;
    }

    @NotNull
    public final ToMany<CommandRecordEntity> getCommandList() {
        ToMany<CommandRecordEntity> toMany = this.commandList;
        if (toMany != null) {
            return toMany;
        }
        AbstractC5830k.m5339p("commandList");
        throw null;
    }

    @NotNull
    public final ToMany<FileRecordEntity> getFileList() {
        ToMany<FileRecordEntity> toMany = this.fileList;
        if (toMany != null) {
            return toMany;
        }
        AbstractC5830k.m5339p("fileList");
        throw null;
    }

    @NotNull
    public final ToMany<GeometryRecordEntity> getGeometryList() {
        ToMany<GeometryRecordEntity> toMany = this.geometryList;
        if (toMany != null) {
            return toMany;
        }
        AbstractC5830k.m5339p("geometryList");
        throw null;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final ToMany<MatrixRecordEntity> getMatrixList() {
        ToMany<MatrixRecordEntity> toMany = this.matrixList;
        if (toMany != null) {
            return toMany;
        }
        AbstractC5830k.m5339p("matrixList");
        throw null;
    }

    @NotNull
    public final ToOne<PageEntity> getPage() {
        ToOne<PageEntity> toOne = this.page;
        if (toOne != null) {
            return toOne;
        }
        AbstractC5830k.m5339p("page");
        throw null;
    }

    @NotNull
    public final ToMany<TextRecordEntity> getTextList() {
        ToMany<TextRecordEntity> toMany = this.textList;
        if (toMany != null) {
            return toMany;
        }
        AbstractC5830k.m5339p("textList");
        throw null;
    }

    @NotNull
    public final ToMany<TouchRecordEntity> getTouchList() {
        ToMany<TouchRecordEntity> toMany = this.touchList;
        if (toMany != null) {
            return toMany;
        }
        AbstractC5830k.m5339p("touchList");
        throw null;
    }

    public int hashCode() {
        return Long.hashCode(this.id);
    }

    public final void put() {
        BoardBox.INSTANCE.getBoxStore().m5018c(RecordEntity.class).m5034e(this);
    }

    public final void remove() {
        BoardBox.INSTANCE.getBoxStore().m5018c(RecordEntity.class).m5039j(this);
    }

    public final void setAudioList(@NotNull ToMany<AudioRecordEntity> toMany) {
        AbstractC5830k.m5330g(toMany, "<set-?>");
        this.audioList = toMany;
    }

    public final void setCommandList(@NotNull ToMany<CommandRecordEntity> toMany) {
        AbstractC5830k.m5330g(toMany, "<set-?>");
        this.commandList = toMany;
    }

    public final void setFileList(@NotNull ToMany<FileRecordEntity> toMany) {
        AbstractC5830k.m5330g(toMany, "<set-?>");
        this.fileList = toMany;
    }

    public final void setGeometryList(@NotNull ToMany<GeometryRecordEntity> toMany) {
        AbstractC5830k.m5330g(toMany, "<set-?>");
        this.geometryList = toMany;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setMatrixList(@NotNull ToMany<MatrixRecordEntity> toMany) {
        AbstractC5830k.m5330g(toMany, "<set-?>");
        this.matrixList = toMany;
    }

    public final void setPage(@NotNull ToOne<PageEntity> toOne) {
        AbstractC5830k.m5330g(toOne, "<set-?>");
        this.page = toOne;
    }

    public final void setTextList(@NotNull ToMany<TextRecordEntity> toMany) {
        AbstractC5830k.m5330g(toMany, "<set-?>");
        this.textList = toMany;
    }

    public final void setTouchList(@NotNull ToMany<TouchRecordEntity> toMany) {
        AbstractC5830k.m5330g(toMany, "<set-?>");
        this.touchList = toMany;
    }

    @NotNull
    public String toString() {
        return "RecordEntity(id=" + this.id + ')';
    }

    public RecordEntity(long j7) {
        this.geometryList = new ToMany<>(this, RecordEntity_.geometryList);
        this.textList = new ToMany<>(this, RecordEntity_.textList);
        this.audioList = new ToMany<>(this, RecordEntity_.audioList);
        this.matrixList = new ToMany<>(this, RecordEntity_.matrixList);
        this.touchList = new ToMany<>(this, RecordEntity_.touchList);
        this.fileList = new ToMany<>(this, RecordEntity_.fileList);
        this.commandList = new ToMany<>(this, RecordEntity_.commandList);
        this.page = new ToOne<>(this, RecordEntity_.page);
        this.id = j7;
    }

    public /* synthetic */ RecordEntity(long j7, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? 0L : j7);
    }
}
