package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.TouchRecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p189n6.InterfaceC9429b;

/* loaded from: classes4.dex */
public final class TouchRecordEntityCursor extends Cursor<TouchRecordEntity> {
    private static final TouchRecordEntity_.TouchRecordEntityIdGetter ID_GETTER = TouchRecordEntity_.__ID_GETTER;
    private static final int __ID_fileName = TouchRecordEntity_.fileName.f16872c;
    private static final int __ID_validate = TouchRecordEntity_.validate.f16872c;
    private static final int __ID_recordId = TouchRecordEntity_.recordId.f16872c;

    public static final class Factory implements InterfaceC9429b {
        @Override // p189n6.InterfaceC9429b
        public Cursor<TouchRecordEntity> createCursor(Transaction transaction, long j10, BoxStore boxStore) {
            return new TouchRecordEntityCursor(transaction, j10, boxStore);
        }
    }

    public TouchRecordEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, TouchRecordEntity_.__INSTANCE, boxStore);
    }

    private void attachEntity(TouchRecordEntity touchRecordEntity) {
        touchRecordEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(TouchRecordEntity touchRecordEntity) {
        return ID_GETTER.getId(touchRecordEntity);
    }

    @Override // io.objectbox.Cursor
    public final long put(TouchRecordEntity touchRecordEntity) {
        ToOne<RecordEntity> toOne = touchRecordEntity.record;
        if (toOne != null && toOne.m15516i()) {
            Cursor<TARGET> relationTargetCursor = getRelationTargetCursor(RecordEntity.class);
            try {
                toOne.m15515h(relationTargetCursor);
            } finally {
                relationTargetCursor.close();
            }
        }
        String fileName = touchRecordEntity.getFileName();
        int i10 = fileName != null ? __ID_fileName : 0;
        String validate = touchRecordEntity.getValidate();
        long jCollect313311 = Cursor.collect313311(this.cursor, touchRecordEntity.getId(), 3, i10, fileName, validate != null ? __ID_validate : 0, validate, 0, null, 0, null, __ID_recordId, touchRecordEntity.record.m15513e(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        touchRecordEntity.setId(jCollect313311);
        attachEntity(touchRecordEntity);
        checkApplyToManyToDb(touchRecordEntity.touchEventList, TouchEventEntity.class);
        return jCollect313311;
    }
}
