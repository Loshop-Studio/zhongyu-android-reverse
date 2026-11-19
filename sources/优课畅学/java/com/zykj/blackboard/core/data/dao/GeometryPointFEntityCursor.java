package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.GeometryPointFEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p189n6.InterfaceC9429b;

/* loaded from: classes4.dex */
public final class GeometryPointFEntityCursor extends Cursor<GeometryPointFEntity> {
    private static final GeometryPointFEntity_.GeometryPointFEntityIdGetter ID_GETTER = GeometryPointFEntity_.__ID_GETTER;
    private static final int __ID_x = GeometryPointFEntity_.f8732x.f16872c;
    private static final int __ID_y = GeometryPointFEntity_.f8733y.f16872c;
    private static final int __ID_recordId = GeometryPointFEntity_.recordId.f16872c;

    public static final class Factory implements InterfaceC9429b {
        @Override // p189n6.InterfaceC9429b
        public Cursor<GeometryPointFEntity> createCursor(Transaction transaction, long j10, BoxStore boxStore) {
            return new GeometryPointFEntityCursor(transaction, j10, boxStore);
        }
    }

    public GeometryPointFEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, GeometryPointFEntity_.__INSTANCE, boxStore);
    }

    private void attachEntity(GeometryPointFEntity geometryPointFEntity) {
        geometryPointFEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(GeometryPointFEntity geometryPointFEntity) {
        return ID_GETTER.getId(geometryPointFEntity);
    }

    @Override // io.objectbox.Cursor
    public final long put(GeometryPointFEntity geometryPointFEntity) {
        ToOne<GeometryInfoEntity> toOne = geometryPointFEntity.record;
        if (toOne != null && toOne.m15516i()) {
            Cursor<TARGET> relationTargetCursor = getRelationTargetCursor(GeometryInfoEntity.class);
            try {
                toOne.m15515h(relationTargetCursor);
            } finally {
                relationTargetCursor.close();
            }
        }
        long jCollect002033 = Cursor.collect002033(this.cursor, geometryPointFEntity.getId(), 3, __ID_recordId, geometryPointFEntity.record.m15513e(), 0, 0L, __ID_x, geometryPointFEntity.getX(), __ID_y, geometryPointFEntity.getY(), 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        geometryPointFEntity.setId(jCollect002033);
        attachEntity(geometryPointFEntity);
        return jCollect002033;
    }
}
