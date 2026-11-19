package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.GeometryInfoEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.relation.ToOne;
import java.io.Closeable;
import p116m5.InterfaceC6109a;

/* loaded from: classes3.dex */
public final class GeometryInfoEntityCursor extends Cursor<GeometryInfoEntity> {
    private static final GeometryInfoEntity_.GeometryInfoEntityIdGetter ID_GETTER = GeometryInfoEntity_.__ID_GETTER;
    private static final int __ID_width = GeometryInfoEntity_.width.f8916id;
    private static final int __ID_color = GeometryInfoEntity_.color.f8916id;
    private static final int __ID_textSize = GeometryInfoEntity_.textSize.f8916id;
    private static final int __ID_style = GeometryInfoEntity_.style.f8916id;
    private static final int __ID_geometryType = GeometryInfoEntity_.geometryType.f8916id;
    private static final int __ID_recordId = GeometryInfoEntity_.recordId.f8916id;

    @Internal
    public static final class Factory implements InterfaceC6109a {
        @Override // p116m5.InterfaceC6109a
        public Cursor<GeometryInfoEntity> createCursor(Transaction transaction, long j7, BoxStore boxStore) {
            return new GeometryInfoEntityCursor(transaction, j7, boxStore);
        }
    }

    public GeometryInfoEntityCursor(Transaction transaction, long j7, BoxStore boxStore) {
        super(transaction, j7, GeometryInfoEntity_.__INSTANCE, boxStore);
    }

    private void attachEntity(GeometryInfoEntity geometryInfoEntity) {
        geometryInfoEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(GeometryInfoEntity geometryInfoEntity) {
        return ID_GETTER.getId(geometryInfoEntity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.objectbox.Cursor
    public final long put(GeometryInfoEntity geometryInfoEntity) {
        ToOne<GeometryRecordEntity> toOne = geometryInfoEntity.record;
        if (toOne != 0 && toOne.internalRequiresPutTarget()) {
            Closeable relationTargetCursor = getRelationTargetCursor(GeometryRecordEntity.class);
            try {
                toOne.internalPutTarget(relationTargetCursor);
            } finally {
                relationTargetCursor.close();
            }
        }
        Cursor.collect313311(this.cursor, 0L, 1, 0, null, 0, null, 0, null, 0, null, __ID_recordId, geometryInfoEntity.record.getTargetId(), __ID_color, geometryInfoEntity.getColor(), __ID_style, geometryInfoEntity.getStyle(), __ID_geometryType, geometryInfoEntity.getGeometryType(), 0, 0, 0, 0, __ID_width, geometryInfoEntity.getWidth(), 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        long jCollect313311 = Cursor.collect313311(this.cursor, geometryInfoEntity.getId(), 2, 0, null, 0, null, 0, null, 0, null, 0, 0L, 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, __ID_textSize, geometryInfoEntity.getTextSize(), 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        geometryInfoEntity.setId(jCollect313311);
        attachEntity(geometryInfoEntity);
        checkApplyToManyToDb(geometryInfoEntity.pointList, GeometryPointFEntity.class);
        return jCollect313311;
    }
}
