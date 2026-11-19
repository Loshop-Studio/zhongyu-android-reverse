package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.TextInfoEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.relation.ToOne;
import java.io.Closeable;
import p116m5.InterfaceC6109a;

/* loaded from: classes3.dex */
public final class TextInfoEntityCursor extends Cursor<TextInfoEntity> {
    private static final TextInfoEntity_.TextInfoEntityIdGetter ID_GETTER = TextInfoEntity_.__ID_GETTER;
    private static final int __ID_width = TextInfoEntity_.width.f8916id;
    private static final int __ID_color = TextInfoEntity_.color.f8916id;
    private static final int __ID_textSize = TextInfoEntity_.textSize.f8916id;
    private static final int __ID_style = TextInfoEntity_.style.f8916id;
    private static final int __ID_content = TextInfoEntity_.content.f8916id;
    private static final int __ID_recordId = TextInfoEntity_.recordId.f8916id;

    @Internal
    public static final class Factory implements InterfaceC6109a {
        @Override // p116m5.InterfaceC6109a
        public Cursor<TextInfoEntity> createCursor(Transaction transaction, long j7, BoxStore boxStore) {
            return new TextInfoEntityCursor(transaction, j7, boxStore);
        }
    }

    public TextInfoEntityCursor(Transaction transaction, long j7, BoxStore boxStore) {
        super(transaction, j7, TextInfoEntity_.__INSTANCE, boxStore);
    }

    private void attachEntity(TextInfoEntity textInfoEntity) {
        textInfoEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(TextInfoEntity textInfoEntity) {
        return ID_GETTER.getId(textInfoEntity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.objectbox.Cursor
    public final long put(TextInfoEntity textInfoEntity) {
        ToOne<TextRecordEntity> toOne = textInfoEntity.record;
        if (toOne != 0 && toOne.internalRequiresPutTarget()) {
            Closeable relationTargetCursor = getRelationTargetCursor(TextRecordEntity.class);
            try {
                toOne.internalPutTarget(relationTargetCursor);
            } finally {
                relationTargetCursor.close();
            }
        }
        String content = textInfoEntity.getContent();
        Cursor.collect313311(this.cursor, 0L, 1, content != null ? __ID_content : 0, content, 0, null, 0, null, 0, null, __ID_recordId, textInfoEntity.record.getTargetId(), __ID_color, textInfoEntity.getColor(), __ID_style, textInfoEntity.getStyle(), 0, 0, 0, 0, 0, 0, __ID_width, textInfoEntity.getWidth(), 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        long jCollect313311 = Cursor.collect313311(this.cursor, textInfoEntity.getId(), 2, 0, null, 0, null, 0, null, 0, null, 0, 0L, 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, __ID_textSize, textInfoEntity.getTextSize(), 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        textInfoEntity.setId(jCollect313311);
        attachEntity(textInfoEntity);
        return jCollect313311;
    }
}
