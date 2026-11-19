package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.GeometryInfoEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p189n6.InterfaceC9429b;

/* loaded from: classes4.dex */
public final class GeometryInfoEntityCursor extends Cursor<GeometryInfoEntity> {
    private static final GeometryInfoEntity_.GeometryInfoEntityIdGetter ID_GETTER = GeometryInfoEntity_.__ID_GETTER;
    private static final int __ID_width = GeometryInfoEntity_.width.f16872c;
    private static final int __ID_color = GeometryInfoEntity_.color.f16872c;
    private static final int __ID_textSize = GeometryInfoEntity_.textSize.f16872c;
    private static final int __ID_style = GeometryInfoEntity_.style.f16872c;
    private static final int __ID_geometryType = GeometryInfoEntity_.geometryType.f16872c;
    private static final int __ID_recordId = GeometryInfoEntity_.recordId.f16872c;

    public static final class Factory implements InterfaceC9429b {
        @Override // p189n6.InterfaceC9429b
        public Cursor<GeometryInfoEntity> createCursor(Transaction transaction, long j10, BoxStore boxStore) {
            return new GeometryInfoEntityCursor(transaction, j10, boxStore);
        }
    }

    public GeometryInfoEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, GeometryInfoEntity_.__INSTANCE, boxStore);
    }

    private void attachEntity(GeometryInfoEntity geometryInfoEntity) {
        geometryInfoEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(GeometryInfoEntity geometryInfoEntity) {
        return ID_GETTER.getId(geometryInfoEntity);
    }

    @Override // io.objectbox.Cursor
    public final long put(GeometryInfoEntity geometryInfoEntity) {
        ToOne<GeometryRecordEntity> toOne = geometryInfoEntity.record;
        if (toOne != null && toOne.m15516i()) {
            Cursor<TARGET> relationTargetCursor = getRelationTargetCursor(GeometryRecordEntity.class);
            try {
                toOne.m15515h(relationTargetCursor);
            } finally {
                relationTargetCursor.close();
            }
        }
        Cursor.collect313311(this.cursor, 0L, 1, 0, null, 0, null, 0, null, 0, null, __ID_recordId, geometryInfoEntity.record.m15513e(), __ID_color, geometryInfoEntity.getColor(), __ID_style, geometryInfoEntity.getStyle(), __ID_geometryType, geometryInfoEntity.getGeometryType(), 0, 0, 0, 0, __ID_width, geometryInfoEntity.getWidth(), 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        long jCollect313311 = Cursor.collect313311(this.cursor, geometryInfoEntity.getId(), 2, 0, null, 0, null, 0, null, 0, null, 0, 0L, 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, __ID_textSize, geometryInfoEntity.getTextSize(), 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        geometryInfoEntity.setId(jCollect313311);
        attachEntity(geometryInfoEntity);
        checkApplyToManyToDb(geometryInfoEntity.pointList, GeometryPointFEntity.class);
        return jCollect313311;
    }
}
