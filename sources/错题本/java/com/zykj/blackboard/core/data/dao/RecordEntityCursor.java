package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.RecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.relation.ToOne;
import java.io.Closeable;
import p116m5.InterfaceC6109a;

/* loaded from: classes3.dex */
public final class RecordEntityCursor extends Cursor<RecordEntity> {
    private static final RecordEntity_.RecordEntityIdGetter ID_GETTER = RecordEntity_.__ID_GETTER;
    private static final int __ID_pageId = RecordEntity_.pageId.f8916id;

    @Internal
    public static final class Factory implements InterfaceC6109a {
        @Override // p116m5.InterfaceC6109a
        public Cursor<RecordEntity> createCursor(Transaction transaction, long j7, BoxStore boxStore) {
            return new RecordEntityCursor(transaction, j7, boxStore);
        }
    }

    public RecordEntityCursor(Transaction transaction, long j7, BoxStore boxStore) {
        super(transaction, j7, RecordEntity_.__INSTANCE, boxStore);
    }

    private void attachEntity(RecordEntity recordEntity) {
        recordEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(RecordEntity recordEntity) {
        return ID_GETTER.getId(recordEntity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.objectbox.Cursor
    public final long put(RecordEntity recordEntity) {
        ToOne<PageEntity> toOne = recordEntity.page;
        if (toOne != 0 && toOne.internalRequiresPutTarget()) {
            Closeable relationTargetCursor = getRelationTargetCursor(PageEntity.class);
            try {
                toOne.internalPutTarget(relationTargetCursor);
            } finally {
                relationTargetCursor.close();
            }
        }
        long jCollect313311 = Cursor.collect313311(this.cursor, recordEntity.getId(), 3, 0, null, 0, null, 0, null, 0, null, __ID_pageId, recordEntity.page.getTargetId(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        recordEntity.setId(jCollect313311);
        attachEntity(recordEntity);
        checkApplyToManyToDb(recordEntity.commandList, CommandRecordEntity.class);
        checkApplyToManyToDb(recordEntity.fileList, FileRecordEntity.class);
        checkApplyToManyToDb(recordEntity.touchList, TouchRecordEntity.class);
        checkApplyToManyToDb(recordEntity.matrixList, MatrixRecordEntity.class);
        checkApplyToManyToDb(recordEntity.audioList, AudioRecordEntity.class);
        checkApplyToManyToDb(recordEntity.textList, TextRecordEntity.class);
        checkApplyToManyToDb(recordEntity.geometryList, GeometryRecordEntity.class);
        return jCollect313311;
    }
}
