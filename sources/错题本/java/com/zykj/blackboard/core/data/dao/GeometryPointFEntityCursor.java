package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.GeometryPointFEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.relation.ToOne;
import java.io.Closeable;
import p116m5.InterfaceC6109a;

/* loaded from: classes3.dex */
public final class GeometryPointFEntityCursor extends Cursor<GeometryPointFEntity> {
    private static final GeometryPointFEntity_.GeometryPointFEntityIdGetter ID_GETTER = GeometryPointFEntity_.__ID_GETTER;
    private static final int __ID_x = GeometryPointFEntity_.f5216x.f8916id;
    private static final int __ID_y = GeometryPointFEntity_.f5217y.f8916id;
    private static final int __ID_recordId = GeometryPointFEntity_.recordId.f8916id;

    @Internal
    public static final class Factory implements InterfaceC6109a {
        @Override // p116m5.InterfaceC6109a
        public Cursor<GeometryPointFEntity> createCursor(Transaction transaction, long j7, BoxStore boxStore) {
            return new GeometryPointFEntityCursor(transaction, j7, boxStore);
        }
    }

    public GeometryPointFEntityCursor(Transaction transaction, long j7, BoxStore boxStore) {
        super(transaction, j7, GeometryPointFEntity_.__INSTANCE, boxStore);
    }

    private void attachEntity(GeometryPointFEntity geometryPointFEntity) {
        geometryPointFEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(GeometryPointFEntity geometryPointFEntity) {
        return ID_GETTER.getId(geometryPointFEntity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.objectbox.Cursor
    public final long put(GeometryPointFEntity geometryPointFEntity) {
        ToOne<GeometryInfoEntity> toOne = geometryPointFEntity.record;
        if (toOne != 0 && toOne.internalRequiresPutTarget()) {
            Closeable relationTargetCursor = getRelationTargetCursor(GeometryInfoEntity.class);
            try {
                toOne.internalPutTarget(relationTargetCursor);
            } finally {
                relationTargetCursor.close();
            }
        }
        long jCollect002033 = Cursor.collect002033(this.cursor, geometryPointFEntity.getId(), 3, __ID_recordId, geometryPointFEntity.record.getTargetId(), 0, 0L, __ID_x, geometryPointFEntity.getX(), __ID_y, geometryPointFEntity.getY(), 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        geometryPointFEntity.setId(jCollect002033);
        attachEntity(geometryPointFEntity);
        return jCollect002033;
    }
}
