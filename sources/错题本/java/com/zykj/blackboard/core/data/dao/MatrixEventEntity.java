package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.utils.BoardBox;
import io.objectbox.BoxStore;
import io.objectbox.annotation.Entity;
import io.objectbox.annotation.InterfaceC5697Id;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b\"\u0004\b\u001a\u0010\u0005R(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006+"}, m5110d2 = {"Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;", "", "", "id", "<init>", "(J)V", "Ld6/s;", "put", "()V", "remove", "component1", "()J", "copy", "(J)Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "setId", "Lio/objectbox/relation/ToOne;", "Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;", "record", "Lio/objectbox/relation/ToOne;", "getRecord", "()Lio/objectbox/relation/ToOne;", "setRecord", "(Lio/objectbox/relation/ToOne;)V", "Lio/objectbox/relation/ToMany;", "Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;", "matrixInfo", "Lio/objectbox/relation/ToMany;", "getMatrixInfo", "()Lio/objectbox/relation/ToMany;", "setMatrixInfo", "(Lio/objectbox/relation/ToMany;)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Entity
/* loaded from: classes3.dex */
public final /* data */ class MatrixEventEntity {
    transient BoxStore __boxStore;

    @InterfaceC5697Id
    private long id;
    public ToMany<MatrixInfoEntity> matrixInfo;
    public ToOne<MatrixRecordEntity> record;

    public MatrixEventEntity() {
        this(0L, 1, null);
    }

    public static /* synthetic */ MatrixEventEntity copy$default(MatrixEventEntity matrixEventEntity, long j7, int i, Object obj) {
        if ((i & 1) != 0) {
            j7 = matrixEventEntity.id;
        }
        return matrixEventEntity.copy(j7);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    public final MatrixEventEntity copy(long id) {
        return new MatrixEventEntity(id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MatrixEventEntity) && this.id == ((MatrixEventEntity) other).id;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final ToMany<MatrixInfoEntity> getMatrixInfo() {
        ToMany<MatrixInfoEntity> toMany = this.matrixInfo;
        if (toMany != null) {
            return toMany;
        }
        AbstractC5830k.m5339p("matrixInfo");
        throw null;
    }

    @NotNull
    public final ToOne<MatrixRecordEntity> getRecord() {
        ToOne<MatrixRecordEntity> toOne = this.record;
        if (toOne != null) {
            return toOne;
        }
        AbstractC5830k.m5339p("record");
        throw null;
    }

    public int hashCode() {
        return Long.hashCode(this.id);
    }

    public final void put() {
        BoardBox.INSTANCE.getBoxStore().m5018c(MatrixEventEntity.class).m5034e(this);
    }

    public final void remove() {
        BoardBox.INSTANCE.getBoxStore().m5018c(MatrixEventEntity.class).m5039j(this);
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setMatrixInfo(@NotNull ToMany<MatrixInfoEntity> toMany) {
        AbstractC5830k.m5330g(toMany, "<set-?>");
        this.matrixInfo = toMany;
    }

    public final void setRecord(@NotNull ToOne<MatrixRecordEntity> toOne) {
        AbstractC5830k.m5330g(toOne, "<set-?>");
        this.record = toOne;
    }

    @NotNull
    public String toString() {
        return "MatrixEventEntity(id=" + this.id + ')';
    }

    public MatrixEventEntity(long j7) {
        this.matrixInfo = new ToMany<>(this, MatrixEventEntity_.matrixInfo);
        this.record = new ToOne<>(this, MatrixEventEntity_.record);
        this.id = j7;
    }

    public /* synthetic */ MatrixEventEntity(long j7, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? 0L : j7);
    }
}
