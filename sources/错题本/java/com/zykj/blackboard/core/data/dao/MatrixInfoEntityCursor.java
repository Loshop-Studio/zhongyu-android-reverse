package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.MatrixInfoEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.relation.ToOne;
import java.io.Closeable;
import p116m5.InterfaceC6109a;

/* loaded from: classes3.dex */
public final class MatrixInfoEntityCursor extends Cursor<MatrixInfoEntity> {
    private static final MatrixInfoEntity_.MatrixInfoEntityIdGetter ID_GETTER = MatrixInfoEntity_.__ID_GETTER;
    private static final int __ID_eventTime = MatrixInfoEntity_.eventTime.f8916id;
    private static final int __ID_scaleX = MatrixInfoEntity_.scaleX.f8916id;
    private static final int __ID_skewX = MatrixInfoEntity_.skewX.f8916id;
    private static final int __ID_transX = MatrixInfoEntity_.transX.f8916id;
    private static final int __ID_skewY = MatrixInfoEntity_.skewY.f8916id;
    private static final int __ID_scaleY = MatrixInfoEntity_.scaleY.f8916id;
    private static final int __ID_transY = MatrixInfoEntity_.transY.f8916id;
    private static final int __ID_perSp0 = MatrixInfoEntity_.perSp0.f8916id;
    private static final int __ID_perSp1 = MatrixInfoEntity_.perSp1.f8916id;
    private static final int __ID_perSp2 = MatrixInfoEntity_.perSp2.f8916id;
    private static final int __ID_recordId = MatrixInfoEntity_.recordId.f8916id;

    @Internal
    public static final class Factory implements InterfaceC6109a {
        @Override // p116m5.InterfaceC6109a
        public Cursor<MatrixInfoEntity> createCursor(Transaction transaction, long j7, BoxStore boxStore) {
            return new MatrixInfoEntityCursor(transaction, j7, boxStore);
        }
    }

    public MatrixInfoEntityCursor(Transaction transaction, long j7, BoxStore boxStore) {
        super(transaction, j7, MatrixInfoEntity_.__INSTANCE, boxStore);
    }

    private void attachEntity(MatrixInfoEntity matrixInfoEntity) {
        matrixInfoEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(MatrixInfoEntity matrixInfoEntity) {
        return ID_GETTER.getId(matrixInfoEntity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.objectbox.Cursor
    public final long put(MatrixInfoEntity matrixInfoEntity) {
        ToOne<MatrixEventEntity> toOne = matrixInfoEntity.record;
        if (toOne != 0 && toOne.internalRequiresPutTarget()) {
            Closeable relationTargetCursor = getRelationTargetCursor(MatrixEventEntity.class);
            try {
                toOne.internalPutTarget(relationTargetCursor);
            } finally {
                relationTargetCursor.close();
            }
        }
        Cursor.collect002033(this.cursor, 0L, 1, __ID_eventTime, matrixInfoEntity.getEventTime(), __ID_recordId, matrixInfoEntity.record.getTargetId(), __ID_scaleX, matrixInfoEntity.getScaleX(), __ID_skewX, matrixInfoEntity.getSkewX(), __ID_transX, matrixInfoEntity.getTransX(), 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        Cursor.collect002033(this.cursor, 0L, 0, 0, 0L, 0, 0L, __ID_skewY, matrixInfoEntity.getSkewY(), __ID_scaleY, matrixInfoEntity.getScaleY(), __ID_transY, matrixInfoEntity.getTransY(), 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        long jCollect002033 = Cursor.collect002033(this.cursor, matrixInfoEntity.getId(), 2, 0, 0L, 0, 0L, __ID_perSp0, matrixInfoEntity.getPerSp0(), __ID_perSp1, matrixInfoEntity.getPerSp1(), __ID_perSp2, matrixInfoEntity.getPerSp2(), 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        matrixInfoEntity.setId(jCollect002033);
        attachEntity(matrixInfoEntity);
        return jCollect002033;
    }
}
