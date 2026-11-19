package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.RecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p189n6.InterfaceC9429b;

/* loaded from: classes4.dex */
public final class RecordEntityCursor extends Cursor<RecordEntity> {
    private static final RecordEntity_.RecordEntityIdGetter ID_GETTER = RecordEntity_.__ID_GETTER;
    private static final int __ID_pageId = RecordEntity_.pageId.f16872c;

    public static final class Factory implements InterfaceC9429b {
        @Override // p189n6.InterfaceC9429b
        public Cursor<RecordEntity> createCursor(Transaction transaction, long j10, BoxStore boxStore) {
            return new RecordEntityCursor(transaction, j10, boxStore);
        }
    }

    public RecordEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, RecordEntity_.__INSTANCE, boxStore);
    }

    private void attachEntity(RecordEntity recordEntity) {
        recordEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(RecordEntity recordEntity) {
        return ID_GETTER.getId(recordEntity);
    }

    @Override // io.objectbox.Cursor
    public final long put(RecordEntity recordEntity) {
        ToOne<PageEntity> toOne = recordEntity.page;
        if (toOne != null && toOne.m15516i()) {
            Cursor<TARGET> relationTargetCursor = getRelationTargetCursor(PageEntity.class);
            try {
                toOne.m15515h(relationTargetCursor);
            } finally {
                relationTargetCursor.close();
            }
        }
        long jCollect313311 = Cursor.collect313311(this.cursor, recordEntity.getId(), 3, 0, null, 0, null, 0, null, 0, null, __ID_pageId, recordEntity.page.m15513e(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
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
