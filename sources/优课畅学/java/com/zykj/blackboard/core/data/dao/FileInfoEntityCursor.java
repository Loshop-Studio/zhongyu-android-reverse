package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.FileInfoEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p189n6.InterfaceC9429b;

/* loaded from: classes4.dex */
public final class FileInfoEntityCursor extends Cursor<FileInfoEntity> {
    private static final FileInfoEntity_.FileInfoEntityIdGetter ID_GETTER = FileInfoEntity_.__ID_GETTER;
    private static final int __ID_fileName = FileInfoEntity_.fileName.f16872c;
    private static final int __ID_width = FileInfoEntity_.width.f16872c;
    private static final int __ID_height = FileInfoEntity_.height.f16872c;
    private static final int __ID_validate = FileInfoEntity_.validate.f16872c;
    private static final int __ID_recordId = FileInfoEntity_.recordId.f16872c;

    public static final class Factory implements InterfaceC9429b {
        @Override // p189n6.InterfaceC9429b
        public Cursor<FileInfoEntity> createCursor(Transaction transaction, long j10, BoxStore boxStore) {
            return new FileInfoEntityCursor(transaction, j10, boxStore);
        }
    }

    public FileInfoEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, FileInfoEntity_.__INSTANCE, boxStore);
    }

    private void attachEntity(FileInfoEntity fileInfoEntity) {
        fileInfoEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(FileInfoEntity fileInfoEntity) {
        return ID_GETTER.getId(fileInfoEntity);
    }

    @Override // io.objectbox.Cursor
    public final long put(FileInfoEntity fileInfoEntity) {
        ToOne<FileRecordEntity> toOne = fileInfoEntity.record;
        if (toOne != null && toOne.m15516i()) {
            Cursor<TARGET> relationTargetCursor = getRelationTargetCursor(FileRecordEntity.class);
            try {
                toOne.m15515h(relationTargetCursor);
            } finally {
                relationTargetCursor.close();
            }
        }
        String fileName = fileInfoEntity.getFileName();
        int i10 = fileName != null ? __ID_fileName : 0;
        String validate = fileInfoEntity.getValidate();
        long jCollect313311 = Cursor.collect313311(this.cursor, fileInfoEntity.getId(), 3, i10, fileName, validate != null ? __ID_validate : 0, validate, 0, null, 0, null, __ID_recordId, fileInfoEntity.record.m15513e(), __ID_width, fileInfoEntity.getWidth(), __ID_height, fileInfoEntity.getHeight(), 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        fileInfoEntity.setId(jCollect313311);
        attachEntity(fileInfoEntity);
        return jCollect313311;
    }
}
