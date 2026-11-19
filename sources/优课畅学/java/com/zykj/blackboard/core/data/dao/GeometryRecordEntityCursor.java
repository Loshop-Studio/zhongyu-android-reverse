package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.GeometryRecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p189n6.InterfaceC9429b;

/* loaded from: classes4.dex */
public final class GeometryRecordEntityCursor extends Cursor<GeometryRecordEntity> {
    private static final GeometryRecordEntity_.GeometryRecordEntityIdGetter ID_GETTER = GeometryRecordEntity_.__ID_GETTER;
    private static final int __ID_fileName = GeometryRecordEntity_.fileName.f16872c;
    private static final int __ID_validate = GeometryRecordEntity_.validate.f16872c;
    private static final int __ID_recordId = GeometryRecordEntity_.recordId.f16872c;

    public static final class Factory implements InterfaceC9429b {
        @Override // p189n6.InterfaceC9429b
        public Cursor<GeometryRecordEntity> createCursor(Transaction transaction, long j10, BoxStore boxStore) {
            return new GeometryRecordEntityCursor(transaction, j10, boxStore);
        }
    }

    public GeometryRecordEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, GeometryRecordEntity_.__INSTANCE, boxStore);
    }

    private void attachEntity(GeometryRecordEntity geometryRecordEntity) {
        geometryRecordEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(GeometryRecordEntity geometryRecordEntity) {
        return ID_GETTER.getId(geometryRecordEntity);
    }

    @Override // io.objectbox.Cursor
    public final long put(GeometryRecordEntity geometryRecordEntity) {
        ToOne<RecordEntity> toOne = geometryRecordEntity.record;
        if (toOne != null && toOne.m15516i()) {
            Cursor<TARGET> relationTargetCursor = getRelationTargetCursor(RecordEntity.class);
            try {
                toOne.m15515h(relationTargetCursor);
            } finally {
                relationTargetCursor.close();
            }
        }
        String fileName = geometryRecordEntity.getFileName();
        int i10 = fileName != null ? __ID_fileName : 0;
        String validate = geometryRecordEntity.getValidate();
        long jCollect313311 = Cursor.collect313311(this.cursor, geometryRecordEntity.getId(), 3, i10, fileName, validate != null ? __ID_validate : 0, validate, 0, null, 0, null, __ID_recordId, geometryRecordEntity.record.m15513e(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        geometryRecordEntity.setId(jCollect313311);
        attachEntity(geometryRecordEntity);
        checkApplyToManyToDb(geometryRecordEntity.geometryInfoEntityList, GeometryInfoEntity.class);
        return jCollect313311;
    }
}
