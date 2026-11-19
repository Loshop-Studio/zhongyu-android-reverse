package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.FileInfoEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.relation.ToOne;
import java.io.Closeable;
import p116m5.InterfaceC6109a;

/* loaded from: classes3.dex */
public final class FileInfoEntityCursor extends Cursor<FileInfoEntity> {
    private static final FileInfoEntity_.FileInfoEntityIdGetter ID_GETTER = FileInfoEntity_.__ID_GETTER;
    private static final int __ID_fileName = FileInfoEntity_.fileName.f8916id;
    private static final int __ID_width = FileInfoEntity_.width.f8916id;
    private static final int __ID_height = FileInfoEntity_.height.f8916id;
    private static final int __ID_validate = FileInfoEntity_.validate.f8916id;
    private static final int __ID_recordId = FileInfoEntity_.recordId.f8916id;

    @Internal
    public static final class Factory implements InterfaceC6109a {
        @Override // p116m5.InterfaceC6109a
        public Cursor<FileInfoEntity> createCursor(Transaction transaction, long j7, BoxStore boxStore) {
            return new FileInfoEntityCursor(transaction, j7, boxStore);
        }
    }

    public FileInfoEntityCursor(Transaction transaction, long j7, BoxStore boxStore) {
        super(transaction, j7, FileInfoEntity_.__INSTANCE, boxStore);
    }

    private void attachEntity(FileInfoEntity fileInfoEntity) {
        fileInfoEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(FileInfoEntity fileInfoEntity) {
        return ID_GETTER.getId(fileInfoEntity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.objectbox.Cursor
    public final long put(FileInfoEntity fileInfoEntity) {
        ToOne<FileRecordEntity> toOne = fileInfoEntity.record;
        if (toOne != 0 && toOne.internalRequiresPutTarget()) {
            Closeable relationTargetCursor = getRelationTargetCursor(FileRecordEntity.class);
            try {
                toOne.internalPutTarget(relationTargetCursor);
            } finally {
                relationTargetCursor.close();
            }
        }
        String fileName = fileInfoEntity.getFileName();
        int i = fileName != null ? __ID_fileName : 0;
        String validate = fileInfoEntity.getValidate();
        long jCollect313311 = Cursor.collect313311(this.cursor, fileInfoEntity.getId(), 3, i, fileName, validate != null ? __ID_validate : 0, validate, 0, null, 0, null, __ID_recordId, fileInfoEntity.record.getTargetId(), __ID_width, fileInfoEntity.getWidth(), __ID_height, fileInfoEntity.getHeight(), 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        fileInfoEntity.setId(jCollect313311);
        attachEntity(fileInfoEntity);
        return jCollect313311;
    }
}
