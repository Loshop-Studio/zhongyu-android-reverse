package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.TouchInfoEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.relation.ToOne;
import java.io.Closeable;
import p116m5.InterfaceC6109a;

/* loaded from: classes3.dex */
public final class TouchInfoEntityCursor extends Cursor<TouchInfoEntity> {
    private static final TouchInfoEntity_.TouchInfoEntityIdGetter ID_GETTER = TouchInfoEntity_.__ID_GETTER;
    private static final int __ID_eventTime = TouchInfoEntity_.eventTime.f8916id;
    private static final int __ID_x = TouchInfoEntity_.f5244x.f8916id;
    private static final int __ID_y = TouchInfoEntity_.f5245y.f8916id;
    private static final int __ID_recordId = TouchInfoEntity_.recordId.f8916id;

    @Internal
    public static final class Factory implements InterfaceC6109a {
        @Override // p116m5.InterfaceC6109a
        public Cursor<TouchInfoEntity> createCursor(Transaction transaction, long j7, BoxStore boxStore) {
            return new TouchInfoEntityCursor(transaction, j7, boxStore);
        }
    }

    public TouchInfoEntityCursor(Transaction transaction, long j7, BoxStore boxStore) {
        super(transaction, j7, TouchInfoEntity_.__INSTANCE, boxStore);
    }

    private void attachEntity(TouchInfoEntity touchInfoEntity) {
        touchInfoEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(TouchInfoEntity touchInfoEntity) {
        return ID_GETTER.getId(touchInfoEntity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.objectbox.Cursor
    public final long put(TouchInfoEntity touchInfoEntity) {
        ToOne<TouchEventEntity> toOne = touchInfoEntity.record;
        if (toOne != 0 && toOne.internalRequiresPutTarget()) {
            Closeable relationTargetCursor = getRelationTargetCursor(TouchEventEntity.class);
            try {
                toOne.internalPutTarget(relationTargetCursor);
            } finally {
                relationTargetCursor.close();
            }
        }
        long jCollect002033 = Cursor.collect002033(this.cursor, touchInfoEntity.getId(), 3, __ID_eventTime, touchInfoEntity.getEventTime(), __ID_recordId, touchInfoEntity.record.getTargetId(), __ID_x, touchInfoEntity.getX(), __ID_y, touchInfoEntity.getY(), 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        touchInfoEntity.setId(jCollect002033);
        attachEntity(touchInfoEntity);
        return jCollect002033;
    }
}
