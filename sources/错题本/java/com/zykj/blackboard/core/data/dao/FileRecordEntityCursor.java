package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.FileRecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.relation.ToOne;
import java.io.Closeable;
import p116m5.InterfaceC6109a;

/* loaded from: classes3.dex */
public final class FileRecordEntityCursor extends Cursor<FileRecordEntity> {
    private static final FileRecordEntity_.FileRecordEntityIdGetter ID_GETTER = FileRecordEntity_.__ID_GETTER;
    private static final int __ID_fileName = FileRecordEntity_.fileName.f8916id;
    private static final int __ID_validate = FileRecordEntity_.validate.f8916id;
    private static final int __ID_recordId = FileRecordEntity_.recordId.f8916id;

    @Internal
    public static final class Factory implements InterfaceC6109a {
        @Override // p116m5.InterfaceC6109a
        public Cursor<FileRecordEntity> createCursor(Transaction transaction, long j7, BoxStore boxStore) {
            return new FileRecordEntityCursor(transaction, j7, boxStore);
        }
    }

    public FileRecordEntityCursor(Transaction transaction, long j7, BoxStore boxStore) {
        super(transaction, j7, FileRecordEntity_.__INSTANCE, boxStore);
    }

    private void attachEntity(FileRecordEntity fileRecordEntity) {
        fileRecordEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(FileRecordEntity fileRecordEntity) {
        return ID_GETTER.getId(fileRecordEntity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.objectbox.Cursor
    public final long put(FileRecordEntity fileRecordEntity) {
        ToOne<RecordEntity> toOne = fileRecordEntity.record;
        if (toOne != 0 && toOne.internalRequiresPutTarget()) {
            Closeable relationTargetCursor = getRelationTargetCursor(RecordEntity.class);
            try {
                toOne.internalPutTarget(relationTargetCursor);
            } finally {
                relationTargetCursor.close();
            }
        }
        String fileName = fileRecordEntity.getFileName();
        int i = fileName != null ? __ID_fileName : 0;
        String validate = fileRecordEntity.getValidate();
        long jCollect313311 = Cursor.collect313311(this.cursor, fileRecordEntity.getId(), 3, i, fileName, validate != null ? __ID_validate : 0, validate, 0, null, 0, null, __ID_recordId, fileRecordEntity.record.getTargetId(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        fileRecordEntity.setId(jCollect313311);
        attachEntity(fileRecordEntity);
        checkApplyToManyToDb(fileRecordEntity.fileInfoEntity, FileInfoEntity.class);
        return jCollect313311;
    }
}
