package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.TouchEventEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.relation.ToOne;
import java.io.Closeable;
import p116m5.InterfaceC6109a;

/* loaded from: classes3.dex */
public final class TouchEventEntityCursor extends Cursor<TouchEventEntity> {
    private static final TouchEventEntity_.TouchEventEntityIdGetter ID_GETTER = TouchEventEntity_.__ID_GETTER;
    private static final int __ID_width = TouchEventEntity_.width.f8916id;
    private static final int __ID_color = TouchEventEntity_.color.f8916id;
    private static final int __ID_spacing = TouchEventEntity_.spacing.f8916id;
    private static final int __ID_itemLength = TouchEventEntity_.itemLength.f8916id;
    private static final int __ID_style = TouchEventEntity_.style.f8916id;
    private static final int __ID_textSize = TouchEventEntity_.textSize.f8916id;
    private static final int __ID_recordId = TouchEventEntity_.recordId.f8916id;

    @Internal
    public static final class Factory implements InterfaceC6109a {
        @Override // p116m5.InterfaceC6109a
        public Cursor<TouchEventEntity> createCursor(Transaction transaction, long j7, BoxStore boxStore) {
            return new TouchEventEntityCursor(transaction, j7, boxStore);
        }
    }

    public TouchEventEntityCursor(Transaction transaction, long j7, BoxStore boxStore) {
        super(transaction, j7, TouchEventEntity_.__INSTANCE, boxStore);
    }

    private void attachEntity(TouchEventEntity touchEventEntity) {
        touchEventEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(TouchEventEntity touchEventEntity) {
        return ID_GETTER.getId(touchEventEntity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.objectbox.Cursor
    public final long put(TouchEventEntity touchEventEntity) {
        ToOne<TouchRecordEntity> toOne = touchEventEntity.record;
        if (toOne != 0 && toOne.internalRequiresPutTarget()) {
            Closeable relationTargetCursor = getRelationTargetCursor(TouchRecordEntity.class);
            try {
                toOne.internalPutTarget(relationTargetCursor);
            } finally {
                relationTargetCursor.close();
            }
        }
        Cursor.collect002033(this.cursor, 0L, 1, __ID_recordId, touchEventEntity.record.getTargetId(), __ID_color, touchEventEntity.getColor(), __ID_width, touchEventEntity.getWidth(), __ID_spacing, touchEventEntity.getSpacing(), __ID_itemLength, touchEventEntity.getItemLength(), 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        long jCollect313311 = Cursor.collect313311(this.cursor, touchEventEntity.getId(), 2, 0, null, 0, null, 0, null, 0, null, __ID_style, touchEventEntity.getStyle(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, __ID_textSize, touchEventEntity.getTextSize(), 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        touchEventEntity.setId(jCollect313311);
        attachEntity(touchEventEntity);
        checkApplyToManyToDb(touchEventEntity.touchInfoList, TouchInfoEntity.class);
        return jCollect313311;
    }
}
