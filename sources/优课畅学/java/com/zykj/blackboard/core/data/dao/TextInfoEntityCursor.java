package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.TextInfoEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p189n6.InterfaceC9429b;

/* loaded from: classes4.dex */
public final class TextInfoEntityCursor extends Cursor<TextInfoEntity> {
    private static final TextInfoEntity_.TextInfoEntityIdGetter ID_GETTER = TextInfoEntity_.__ID_GETTER;
    private static final int __ID_width = TextInfoEntity_.width.f16872c;
    private static final int __ID_color = TextInfoEntity_.color.f16872c;
    private static final int __ID_textSize = TextInfoEntity_.textSize.f16872c;
    private static final int __ID_style = TextInfoEntity_.style.f16872c;
    private static final int __ID_content = TextInfoEntity_.content.f16872c;
    private static final int __ID_recordId = TextInfoEntity_.recordId.f16872c;

    public static final class Factory implements InterfaceC9429b {
        @Override // p189n6.InterfaceC9429b
        public Cursor<TextInfoEntity> createCursor(Transaction transaction, long j10, BoxStore boxStore) {
            return new TextInfoEntityCursor(transaction, j10, boxStore);
        }
    }

    public TextInfoEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, TextInfoEntity_.__INSTANCE, boxStore);
    }

    private void attachEntity(TextInfoEntity textInfoEntity) {
        textInfoEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(TextInfoEntity textInfoEntity) {
        return ID_GETTER.getId(textInfoEntity);
    }

    @Override // io.objectbox.Cursor
    public final long put(TextInfoEntity textInfoEntity) {
        ToOne<TextRecordEntity> toOne = textInfoEntity.record;
        if (toOne != null && toOne.m15516i()) {
            Cursor<TARGET> relationTargetCursor = getRelationTargetCursor(TextRecordEntity.class);
            try {
                toOne.m15515h(relationTargetCursor);
            } finally {
                relationTargetCursor.close();
            }
        }
        String content = textInfoEntity.getContent();
        Cursor.collect313311(this.cursor, 0L, 1, content != null ? __ID_content : 0, content, 0, null, 0, null, 0, null, __ID_recordId, textInfoEntity.record.m15513e(), __ID_color, textInfoEntity.getColor(), __ID_style, textInfoEntity.getStyle(), 0, 0, 0, 0, 0, 0, __ID_width, textInfoEntity.getWidth(), 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        long jCollect313311 = Cursor.collect313311(this.cursor, textInfoEntity.getId(), 2, 0, null, 0, null, 0, null, 0, null, 0, 0L, 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, __ID_textSize, textInfoEntity.getTextSize(), 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        textInfoEntity.setId(jCollect313311);
        attachEntity(textInfoEntity);
        return jCollect313311;
    }
}
