package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.FileRecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p189n6.InterfaceC9429b;

/* loaded from: classes4.dex */
public final class FileRecordEntityCursor extends Cursor<FileRecordEntity> {
    private static final FileRecordEntity_.FileRecordEntityIdGetter ID_GETTER = FileRecordEntity_.__ID_GETTER;
    private static final int __ID_fileName = FileRecordEntity_.fileName.f16872c;
    private static final int __ID_validate = FileRecordEntity_.validate.f16872c;
    private static final int __ID_recordId = FileRecordEntity_.recordId.f16872c;

    public static final class Factory implements InterfaceC9429b {
        @Override // p189n6.InterfaceC9429b
        public Cursor<FileRecordEntity> createCursor(Transaction transaction, long j10, BoxStore boxStore) {
            return new FileRecordEntityCursor(transaction, j10, boxStore);
        }
    }

    public FileRecordEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, FileRecordEntity_.__INSTANCE, boxStore);
    }

    private void attachEntity(FileRecordEntity fileRecordEntity) {
        fileRecordEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(FileRecordEntity fileRecordEntity) {
        return ID_GETTER.getId(fileRecordEntity);
    }

    @Override // io.objectbox.Cursor
    public final long put(FileRecordEntity fileRecordEntity) {
        ToOne<RecordEntity> toOne = fileRecordEntity.record;
        if (toOne != null && toOne.m15516i()) {
            Cursor<TARGET> relationTargetCursor = getRelationTargetCursor(RecordEntity.class);
            try {
                toOne.m15515h(relationTargetCursor);
            } finally {
                relationTargetCursor.close();
            }
        }
        String fileName = fileRecordEntity.getFileName();
        int i10 = fileName != null ? __ID_fileName : 0;
        String validate = fileRecordEntity.getValidate();
        long jCollect313311 = Cursor.collect313311(this.cursor, fileRecordEntity.getId(), 3, i10, fileName, validate != null ? __ID_validate : 0, validate, 0, null, 0, null, __ID_recordId, fileRecordEntity.record.m15513e(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        fileRecordEntity.setId(jCollect313311);
        attachEntity(fileRecordEntity);
        checkApplyToManyToDb(fileRecordEntity.fileInfoEntity, FileInfoEntity.class);
        return jCollect313311;
    }
}
