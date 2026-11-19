package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.GeometryRecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.relation.ToOne;
import java.io.Closeable;
import p116m5.InterfaceC6109a;

/* loaded from: classes3.dex */
public final class GeometryRecordEntityCursor extends Cursor<GeometryRecordEntity> {
    private static final GeometryRecordEntity_.GeometryRecordEntityIdGetter ID_GETTER = GeometryRecordEntity_.__ID_GETTER;
    private static final int __ID_fileName = GeometryRecordEntity_.fileName.f8916id;
    private static final int __ID_validate = GeometryRecordEntity_.validate.f8916id;
    private static final int __ID_recordId = GeometryRecordEntity_.recordId.f8916id;

    @Internal
    public static final class Factory implements InterfaceC6109a {
        @Override // p116m5.InterfaceC6109a
        public Cursor<GeometryRecordEntity> createCursor(Transaction transaction, long j7, BoxStore boxStore) {
            return new GeometryRecordEntityCursor(transaction, j7, boxStore);
        }
    }

    public GeometryRecordEntityCursor(Transaction transaction, long j7, BoxStore boxStore) {
        super(transaction, j7, GeometryRecordEntity_.__INSTANCE, boxStore);
    }

    private void attachEntity(GeometryRecordEntity geometryRecordEntity) {
        geometryRecordEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(GeometryRecordEntity geometryRecordEntity) {
        return ID_GETTER.getId(geometryRecordEntity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.objectbox.Cursor
    public final long put(GeometryRecordEntity geometryRecordEntity) {
        ToOne<RecordEntity> toOne = geometryRecordEntity.record;
        if (toOne != 0 && toOne.internalRequiresPutTarget()) {
            Closeable relationTargetCursor = getRelationTargetCursor(RecordEntity.class);
            try {
                toOne.internalPutTarget(relationTargetCursor);
            } finally {
                relationTargetCursor.close();
            }
        }
        String fileName = geometryRecordEntity.getFileName();
        int i = fileName != null ? __ID_fileName : 0;
        String validate = geometryRecordEntity.getValidate();
        long jCollect313311 = Cursor.collect313311(this.cursor, geometryRecordEntity.getId(), 3, i, fileName, validate != null ? __ID_validate : 0, validate, 0, null, 0, null, __ID_recordId, geometryRecordEntity.record.getTargetId(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        geometryRecordEntity.setId(jCollect313311);
        attachEntity(geometryRecordEntity);
        checkApplyToManyToDb(geometryRecordEntity.geometryInfoEntityList, GeometryInfoEntity.class);
        return jCollect313311;
    }
}
