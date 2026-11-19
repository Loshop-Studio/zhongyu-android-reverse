package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.MatrixEventEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p189n6.InterfaceC9429b;

/* loaded from: classes4.dex */
public final class MatrixEventEntityCursor extends Cursor<MatrixEventEntity> {
    private static final MatrixEventEntity_.MatrixEventEntityIdGetter ID_GETTER = MatrixEventEntity_.__ID_GETTER;
    private static final int __ID_recordId = MatrixEventEntity_.recordId.f16872c;

    public static final class Factory implements InterfaceC9429b {
        @Override // p189n6.InterfaceC9429b
        public Cursor<MatrixEventEntity> createCursor(Transaction transaction, long j10, BoxStore boxStore) {
            return new MatrixEventEntityCursor(transaction, j10, boxStore);
        }
    }

    public MatrixEventEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, MatrixEventEntity_.__INSTANCE, boxStore);
    }

    private void attachEntity(MatrixEventEntity matrixEventEntity) {
        matrixEventEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(MatrixEventEntity matrixEventEntity) {
        return ID_GETTER.getId(matrixEventEntity);
    }

    @Override // io.objectbox.Cursor
    public final long put(MatrixEventEntity matrixEventEntity) {
        ToOne<MatrixRecordEntity> toOne = matrixEventEntity.record;
        if (toOne != null && toOne.m15516i()) {
            Cursor<TARGET> relationTargetCursor = getRelationTargetCursor(MatrixRecordEntity.class);
            try {
                toOne.m15515h(relationTargetCursor);
            } finally {
                relationTargetCursor.close();
            }
        }
        long jCollect313311 = Cursor.collect313311(this.cursor, matrixEventEntity.getId(), 3, 0, null, 0, null, 0, null, 0, null, __ID_recordId, matrixEventEntity.record.m15513e(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        matrixEventEntity.setId(jCollect313311);
        attachEntity(matrixEventEntity);
        checkApplyToManyToDb(matrixEventEntity.matrixInfo, MatrixInfoEntity.class);
        return jCollect313311;
    }
}
