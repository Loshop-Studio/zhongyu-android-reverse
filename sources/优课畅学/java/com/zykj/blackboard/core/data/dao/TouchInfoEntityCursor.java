package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.TouchInfoEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p189n6.InterfaceC9429b;

/* loaded from: classes4.dex */
public final class TouchInfoEntityCursor extends Cursor<TouchInfoEntity> {
    private static final TouchInfoEntity_.TouchInfoEntityIdGetter ID_GETTER = TouchInfoEntity_.__ID_GETTER;
    private static final int __ID_eventTime = TouchInfoEntity_.eventTime.f16872c;
    private static final int __ID_x = TouchInfoEntity_.f8760x.f16872c;
    private static final int __ID_y = TouchInfoEntity_.f8761y.f16872c;
    private static final int __ID_recordId = TouchInfoEntity_.recordId.f16872c;

    public static final class Factory implements InterfaceC9429b {
        @Override // p189n6.InterfaceC9429b
        public Cursor<TouchInfoEntity> createCursor(Transaction transaction, long j10, BoxStore boxStore) {
            return new TouchInfoEntityCursor(transaction, j10, boxStore);
        }
    }

    public TouchInfoEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, TouchInfoEntity_.__INSTANCE, boxStore);
    }

    private void attachEntity(TouchInfoEntity touchInfoEntity) {
        touchInfoEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(TouchInfoEntity touchInfoEntity) {
        return ID_GETTER.getId(touchInfoEntity);
    }

    @Override // io.objectbox.Cursor
    public final long put(TouchInfoEntity touchInfoEntity) {
        ToOne<TouchEventEntity> toOne = touchInfoEntity.record;
        if (toOne != null && toOne.m15516i()) {
            Cursor<TARGET> relationTargetCursor = getRelationTargetCursor(TouchEventEntity.class);
            try {
                toOne.m15515h(relationTargetCursor);
            } finally {
                relationTargetCursor.close();
            }
        }
        long jCollect002033 = Cursor.collect002033(this.cursor, touchInfoEntity.getId(), 3, __ID_eventTime, touchInfoEntity.getEventTime(), __ID_recordId, touchInfoEntity.record.m15513e(), __ID_x, touchInfoEntity.getX(), __ID_y, touchInfoEntity.getY(), 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        touchInfoEntity.setId(jCollect002033);
        attachEntity(touchInfoEntity);
        return jCollect002033;
    }
}
