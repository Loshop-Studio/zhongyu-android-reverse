package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.MatrixEventEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.relation.ToOne;
import java.io.Closeable;
import p116m5.InterfaceC6109a;

/* loaded from: classes3.dex */
public final class MatrixEventEntityCursor extends Cursor<MatrixEventEntity> {
    private static final MatrixEventEntity_.MatrixEventEntityIdGetter ID_GETTER = MatrixEventEntity_.__ID_GETTER;
    private static final int __ID_recordId = MatrixEventEntity_.recordId.f8916id;

    @Internal
    public static final class Factory implements InterfaceC6109a {
        @Override // p116m5.InterfaceC6109a
        public Cursor<MatrixEventEntity> createCursor(Transaction transaction, long j7, BoxStore boxStore) {
            return new MatrixEventEntityCursor(transaction, j7, boxStore);
        }
    }

    public MatrixEventEntityCursor(Transaction transaction, long j7, BoxStore boxStore) {
        super(transaction, j7, MatrixEventEntity_.__INSTANCE, boxStore);
    }

    private void attachEntity(MatrixEventEntity matrixEventEntity) {
        matrixEventEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(MatrixEventEntity matrixEventEntity) {
        return ID_GETTER.getId(matrixEventEntity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.objectbox.Cursor
    public final long put(MatrixEventEntity matrixEventEntity) {
        ToOne<MatrixRecordEntity> toOne = matrixEventEntity.record;
        if (toOne != 0 && toOne.internalRequiresPutTarget()) {
            Closeable relationTargetCursor = getRelationTargetCursor(MatrixRecordEntity.class);
            try {
                toOne.internalPutTarget(relationTargetCursor);
            } finally {
                relationTargetCursor.close();
            }
        }
        long jCollect313311 = Cursor.collect313311(this.cursor, matrixEventEntity.getId(), 3, 0, null, 0, null, 0, null, 0, null, __ID_recordId, matrixEventEntity.record.getTargetId(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        matrixEventEntity.setId(jCollect313311);
        attachEntity(matrixEventEntity);
        checkApplyToManyToDb(matrixEventEntity.matrixInfo, MatrixInfoEntity.class);
        return jCollect313311;
    }
}
