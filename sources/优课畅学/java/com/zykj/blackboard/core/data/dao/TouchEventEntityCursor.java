package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.TouchEventEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p189n6.InterfaceC9429b;

/* loaded from: classes4.dex */
public final class TouchEventEntityCursor extends Cursor<TouchEventEntity> {
    private static final TouchEventEntity_.TouchEventEntityIdGetter ID_GETTER = TouchEventEntity_.__ID_GETTER;
    private static final int __ID_width = TouchEventEntity_.width.f16872c;
    private static final int __ID_color = TouchEventEntity_.color.f16872c;
    private static final int __ID_spacing = TouchEventEntity_.spacing.f16872c;
    private static final int __ID_itemLength = TouchEventEntity_.itemLength.f16872c;
    private static final int __ID_style = TouchEventEntity_.style.f16872c;
    private static final int __ID_textSize = TouchEventEntity_.textSize.f16872c;
    private static final int __ID_recordId = TouchEventEntity_.recordId.f16872c;

    public static final class Factory implements InterfaceC9429b {
        @Override // p189n6.InterfaceC9429b
        public Cursor<TouchEventEntity> createCursor(Transaction transaction, long j10, BoxStore boxStore) {
            return new TouchEventEntityCursor(transaction, j10, boxStore);
        }
    }

    public TouchEventEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, TouchEventEntity_.__INSTANCE, boxStore);
    }

    private void attachEntity(TouchEventEntity touchEventEntity) {
        touchEventEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(TouchEventEntity touchEventEntity) {
        return ID_GETTER.getId(touchEventEntity);
    }

    @Override // io.objectbox.Cursor
    public final long put(TouchEventEntity touchEventEntity) {
        ToOne<TouchRecordEntity> toOne = touchEventEntity.record;
        if (toOne != null && toOne.m15516i()) {
            Cursor<TARGET> relationTargetCursor = getRelationTargetCursor(TouchRecordEntity.class);
            try {
                toOne.m15515h(relationTargetCursor);
            } finally {
                relationTargetCursor.close();
            }
        }
        Cursor.collect002033(this.cursor, 0L, 1, __ID_recordId, touchEventEntity.record.m15513e(), __ID_color, touchEventEntity.getColor(), __ID_width, touchEventEntity.getWidth(), __ID_spacing, touchEventEntity.getSpacing(), __ID_itemLength, touchEventEntity.getItemLength(), 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        long jCollect313311 = Cursor.collect313311(this.cursor, touchEventEntity.getId(), 2, 0, null, 0, null, 0, null, 0, null, __ID_style, touchEventEntity.getStyle(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, __ID_textSize, touchEventEntity.getTextSize(), 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        touchEventEntity.setId(jCollect313311);
        attachEntity(touchEventEntity);
        checkApplyToManyToDb(touchEventEntity.touchInfoList, TouchInfoEntity.class);
        return jCollect313311;
    }
}
