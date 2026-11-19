package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.MatrixRecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.relation.ToOne;
import java.io.Closeable;
import p116m5.InterfaceC6109a;

/* loaded from: classes3.dex */
public final class MatrixRecordEntityCursor extends Cursor<MatrixRecordEntity> {
    private static final MatrixRecordEntity_.MatrixRecordEntityIdGetter ID_GETTER = MatrixRecordEntity_.__ID_GETTER;
    private static final int __ID_fileName = MatrixRecordEntity_.fileName.f8916id;
    private static final int __ID_validate = MatrixRecordEntity_.validate.f8916id;
    private static final int __ID_recordId = MatrixRecordEntity_.recordId.f8916id;

    @Internal
    public static final class Factory implements InterfaceC6109a {
        @Override // p116m5.InterfaceC6109a
        public Cursor<MatrixRecordEntity> createCursor(Transaction transaction, long j7, BoxStore boxStore) {
            return new MatrixRecordEntityCursor(transaction, j7, boxStore);
        }
    }

    public MatrixRecordEntityCursor(Transaction transaction, long j7, BoxStore boxStore) {
        super(transaction, j7, MatrixRecordEntity_.__INSTANCE, boxStore);
    }

    private void attachEntity(MatrixRecordEntity matrixRecordEntity) {
        matrixRecordEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(MatrixRecordEntity matrixRecordEntity) {
        return ID_GETTER.getId(matrixRecordEntity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.objectbox.Cursor
    public final long put(MatrixRecordEntity matrixRecordEntity) {
        ToOne<RecordEntity> toOne = matrixRecordEntity.record;
        if (toOne != 0 && toOne.internalRequiresPutTarget()) {
            Closeable relationTargetCursor = getRelationTargetCursor(RecordEntity.class);
            try {
                toOne.internalPutTarget(relationTargetCursor);
            } finally {
                relationTargetCursor.close();
            }
        }
        String fileName = matrixRecordEntity.getFileName();
        int i = fileName != null ? __ID_fileName : 0;
        String validate = matrixRecordEntity.getValidate();
        long jCollect313311 = Cursor.collect313311(this.cursor, matrixRecordEntity.getId(), 3, i, fileName, validate != null ? __ID_validate : 0, validate, 0, null, 0, null, __ID_recordId, matrixRecordEntity.record.getTargetId(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        matrixRecordEntity.setId(jCollect313311);
        attachEntity(matrixRecordEntity);
        checkApplyToManyToDb(matrixRecordEntity.matrixEventEntity, MatrixEventEntity.class);
        return jCollect313311;
    }
}
