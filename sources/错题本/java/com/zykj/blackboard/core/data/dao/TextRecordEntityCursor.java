package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.TextRecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.relation.ToOne;
import java.io.Closeable;
import p116m5.InterfaceC6109a;

/* loaded from: classes3.dex */
public final class TextRecordEntityCursor extends Cursor<TextRecordEntity> {
    private static final TextRecordEntity_.TextRecordEntityIdGetter ID_GETTER = TextRecordEntity_.__ID_GETTER;
    private static final int __ID_fileName = TextRecordEntity_.fileName.f8916id;
    private static final int __ID_validate = TextRecordEntity_.validate.f8916id;
    private static final int __ID_recordId = TextRecordEntity_.recordId.f8916id;

    @Internal
    public static final class Factory implements InterfaceC6109a {
        @Override // p116m5.InterfaceC6109a
        public Cursor<TextRecordEntity> createCursor(Transaction transaction, long j7, BoxStore boxStore) {
            return new TextRecordEntityCursor(transaction, j7, boxStore);
        }
    }

    public TextRecordEntityCursor(Transaction transaction, long j7, BoxStore boxStore) {
        super(transaction, j7, TextRecordEntity_.__INSTANCE, boxStore);
    }

    private void attachEntity(TextRecordEntity textRecordEntity) {
        textRecordEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(TextRecordEntity textRecordEntity) {
        return ID_GETTER.getId(textRecordEntity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.objectbox.Cursor
    public final long put(TextRecordEntity textRecordEntity) {
        ToOne<RecordEntity> toOne = textRecordEntity.record;
        if (toOne != 0 && toOne.internalRequiresPutTarget()) {
            Closeable relationTargetCursor = getRelationTargetCursor(RecordEntity.class);
            try {
                toOne.internalPutTarget(relationTargetCursor);
            } finally {
                relationTargetCursor.close();
            }
        }
        String fileName = textRecordEntity.getFileName();
        int i = fileName != null ? __ID_fileName : 0;
        String validate = textRecordEntity.getValidate();
        long jCollect313311 = Cursor.collect313311(this.cursor, textRecordEntity.getId(), 3, i, fileName, validate != null ? __ID_validate : 0, validate, 0, null, 0, null, __ID_recordId, textRecordEntity.record.getTargetId(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        textRecordEntity.setId(jCollect313311);
        attachEntity(textRecordEntity);
        checkApplyToManyToDb(textRecordEntity.textInfoEntityList, TextInfoEntity.class);
        return jCollect313311;
    }
}
