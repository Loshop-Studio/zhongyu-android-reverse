package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.TextRecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p189n6.InterfaceC9429b;

/* loaded from: classes4.dex */
public final class TextRecordEntityCursor extends Cursor<TextRecordEntity> {
    private static final TextRecordEntity_.TextRecordEntityIdGetter ID_GETTER = TextRecordEntity_.__ID_GETTER;
    private static final int __ID_fileName = TextRecordEntity_.fileName.f16872c;
    private static final int __ID_validate = TextRecordEntity_.validate.f16872c;
    private static final int __ID_recordId = TextRecordEntity_.recordId.f16872c;

    public static final class Factory implements InterfaceC9429b {
        @Override // p189n6.InterfaceC9429b
        public Cursor<TextRecordEntity> createCursor(Transaction transaction, long j10, BoxStore boxStore) {
            return new TextRecordEntityCursor(transaction, j10, boxStore);
        }
    }

    public TextRecordEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, TextRecordEntity_.__INSTANCE, boxStore);
    }

    private void attachEntity(TextRecordEntity textRecordEntity) {
        textRecordEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(TextRecordEntity textRecordEntity) {
        return ID_GETTER.getId(textRecordEntity);
    }

    @Override // io.objectbox.Cursor
    public final long put(TextRecordEntity textRecordEntity) {
        ToOne<RecordEntity> toOne = textRecordEntity.record;
        if (toOne != null && toOne.m15516i()) {
            Cursor<TARGET> relationTargetCursor = getRelationTargetCursor(RecordEntity.class);
            try {
                toOne.m15515h(relationTargetCursor);
            } finally {
                relationTargetCursor.close();
            }
        }
        String fileName = textRecordEntity.getFileName();
        int i10 = fileName != null ? __ID_fileName : 0;
        String validate = textRecordEntity.getValidate();
        long jCollect313311 = Cursor.collect313311(this.cursor, textRecordEntity.getId(), 3, i10, fileName, validate != null ? __ID_validate : 0, validate, 0, null, 0, null, __ID_recordId, textRecordEntity.record.m15513e(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        textRecordEntity.setId(jCollect313311);
        attachEntity(textRecordEntity);
        checkApplyToManyToDb(textRecordEntity.textInfoEntityList, TextInfoEntity.class);
        return jCollect313311;
    }
}
