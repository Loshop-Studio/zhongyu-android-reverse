package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.TouchRecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.relation.ToOne;
import java.io.Closeable;
import p116m5.InterfaceC6109a;

/* loaded from: classes3.dex */
public final class TouchRecordEntityCursor extends Cursor<TouchRecordEntity> {
    private static final TouchRecordEntity_.TouchRecordEntityIdGetter ID_GETTER = TouchRecordEntity_.__ID_GETTER;
    private static final int __ID_fileName = TouchRecordEntity_.fileName.f8916id;
    private static final int __ID_validate = TouchRecordEntity_.validate.f8916id;
    private static final int __ID_recordId = TouchRecordEntity_.recordId.f8916id;

    @Internal
    public static final class Factory implements InterfaceC6109a {
        @Override // p116m5.InterfaceC6109a
        public Cursor<TouchRecordEntity> createCursor(Transaction transaction, long j7, BoxStore boxStore) {
            return new TouchRecordEntityCursor(transaction, j7, boxStore);
        }
    }

    public TouchRecordEntityCursor(Transaction transaction, long j7, BoxStore boxStore) {
        super(transaction, j7, TouchRecordEntity_.__INSTANCE, boxStore);
    }

    private void attachEntity(TouchRecordEntity touchRecordEntity) {
        touchRecordEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(TouchRecordEntity touchRecordEntity) {
        return ID_GETTER.getId(touchRecordEntity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.objectbox.Cursor
    public final long put(TouchRecordEntity touchRecordEntity) {
        ToOne<RecordEntity> toOne = touchRecordEntity.record;
        if (toOne != 0 && toOne.internalRequiresPutTarget()) {
            Closeable relationTargetCursor = getRelationTargetCursor(RecordEntity.class);
            try {
                toOne.internalPutTarget(relationTargetCursor);
            } finally {
                relationTargetCursor.close();
            }
        }
        String fileName = touchRecordEntity.getFileName();
        int i = fileName != null ? __ID_fileName : 0;
        String validate = touchRecordEntity.getValidate();
        long jCollect313311 = Cursor.collect313311(this.cursor, touchRecordEntity.getId(), 3, i, fileName, validate != null ? __ID_validate : 0, validate, 0, null, 0, null, __ID_recordId, touchRecordEntity.record.getTargetId(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        touchRecordEntity.setId(jCollect313311);
        attachEntity(touchRecordEntity);
        checkApplyToManyToDb(touchRecordEntity.touchEventList, TouchEventEntity.class);
        return jCollect313311;
    }
}
