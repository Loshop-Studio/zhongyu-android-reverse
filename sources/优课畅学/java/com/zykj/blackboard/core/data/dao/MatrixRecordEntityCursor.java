package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.MatrixRecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p189n6.InterfaceC9429b;

/* loaded from: classes4.dex */
public final class MatrixRecordEntityCursor extends Cursor<MatrixRecordEntity> {
    private static final MatrixRecordEntity_.MatrixRecordEntityIdGetter ID_GETTER = MatrixRecordEntity_.__ID_GETTER;
    private static final int __ID_fileName = MatrixRecordEntity_.fileName.f16872c;
    private static final int __ID_validate = MatrixRecordEntity_.validate.f16872c;
    private static final int __ID_recordId = MatrixRecordEntity_.recordId.f16872c;

    public static final class Factory implements InterfaceC9429b {
        @Override // p189n6.InterfaceC9429b
        public Cursor<MatrixRecordEntity> createCursor(Transaction transaction, long j10, BoxStore boxStore) {
            return new MatrixRecordEntityCursor(transaction, j10, boxStore);
        }
    }

    public MatrixRecordEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, MatrixRecordEntity_.__INSTANCE, boxStore);
    }

    private void attachEntity(MatrixRecordEntity matrixRecordEntity) {
        matrixRecordEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(MatrixRecordEntity matrixRecordEntity) {
        return ID_GETTER.getId(matrixRecordEntity);
    }

    @Override // io.objectbox.Cursor
    public final long put(MatrixRecordEntity matrixRecordEntity) {
        ToOne<RecordEntity> toOne = matrixRecordEntity.record;
        if (toOne != null && toOne.m15516i()) {
            Cursor<TARGET> relationTargetCursor = getRelationTargetCursor(RecordEntity.class);
            try {
                toOne.m15515h(relationTargetCursor);
            } finally {
                relationTargetCursor.close();
            }
        }
        String fileName = matrixRecordEntity.getFileName();
        int i10 = fileName != null ? __ID_fileName : 0;
        String validate = matrixRecordEntity.getValidate();
        long jCollect313311 = Cursor.collect313311(this.cursor, matrixRecordEntity.getId(), 3, i10, fileName, validate != null ? __ID_validate : 0, validate, 0, null, 0, null, __ID_recordId, matrixRecordEntity.record.m15513e(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        matrixRecordEntity.setId(jCollect313311);
        attachEntity(matrixRecordEntity);
        checkApplyToManyToDb(matrixRecordEntity.matrixEventEntity, MatrixEventEntity.class);
        return jCollect313311;
    }
}
