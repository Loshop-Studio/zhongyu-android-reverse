package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.AudioRecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.relation.ToOne;
import java.io.Closeable;
import p116m5.InterfaceC6109a;

/* loaded from: classes3.dex */
public final class AudioRecordEntityCursor extends Cursor<AudioRecordEntity> {
    private static final AudioRecordEntity_.AudioRecordEntityIdGetter ID_GETTER = AudioRecordEntity_.__ID_GETTER;
    private static final int __ID_fileName = AudioRecordEntity_.fileName.f8916id;
    private static final int __ID_validate = AudioRecordEntity_.validate.f8916id;
    private static final int __ID_recordId = AudioRecordEntity_.recordId.f8916id;

    @Internal
    public static final class Factory implements InterfaceC6109a {
        @Override // p116m5.InterfaceC6109a
        public Cursor<AudioRecordEntity> createCursor(Transaction transaction, long j7, BoxStore boxStore) {
            return new AudioRecordEntityCursor(transaction, j7, boxStore);
        }
    }

    public AudioRecordEntityCursor(Transaction transaction, long j7, BoxStore boxStore) {
        super(transaction, j7, AudioRecordEntity_.__INSTANCE, boxStore);
    }

    private void attachEntity(AudioRecordEntity audioRecordEntity) {
        audioRecordEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(AudioRecordEntity audioRecordEntity) {
        return ID_GETTER.getId(audioRecordEntity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.objectbox.Cursor
    public final long put(AudioRecordEntity audioRecordEntity) {
        ToOne<RecordEntity> toOne = audioRecordEntity.record;
        if (toOne != 0 && toOne.internalRequiresPutTarget()) {
            Closeable relationTargetCursor = getRelationTargetCursor(RecordEntity.class);
            try {
                toOne.internalPutTarget(relationTargetCursor);
            } finally {
                relationTargetCursor.close();
            }
        }
        String fileName = audioRecordEntity.getFileName();
        int i = fileName != null ? __ID_fileName : 0;
        String validate = audioRecordEntity.getValidate();
        long jCollect313311 = Cursor.collect313311(this.cursor, audioRecordEntity.getId(), 3, i, fileName, validate != null ? __ID_validate : 0, validate, 0, null, 0, null, __ID_recordId, audioRecordEntity.record.getTargetId(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        audioRecordEntity.setId(jCollect313311);
        attachEntity(audioRecordEntity);
        checkApplyToManyToDb(audioRecordEntity.audioInfoEntity, AudioInfoEntity.class);
        return jCollect313311;
    }
}
