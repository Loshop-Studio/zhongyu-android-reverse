package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.GeometryRecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p037c8.InterfaceC5267b;

/* loaded from: classes4.dex */
public final class GeometryRecordEntityCursor extends Cursor<GeometryRecordEntity> {

    /* renamed from: j */
    public static final GeometryRecordEntity_.C6992a f8661j = GeometryRecordEntity_.f8667c;

    /* renamed from: k */
    public static final int f8662k = GeometryRecordEntity_.f8670f.f14006c;

    /* renamed from: l */
    public static final int f8663l = GeometryRecordEntity_.f8671g.f14006c;

    /* renamed from: m */
    public static final int f8664m = GeometryRecordEntity_.f8672h.f14006c;

    /* renamed from: com.zykj.blackboard.core.data.dao.GeometryRecordEntityCursor$a */
    public static final class C6989a implements InterfaceC5267b {
        @Override // p037c8.InterfaceC5267b
        /* renamed from: a */
        public Cursor mo2405a(Transaction transaction, long j9, BoxStore boxStore) {
            return new GeometryRecordEntityCursor(transaction, j9, boxStore);
        }
    }

    public GeometryRecordEntityCursor(Transaction transaction, long j9, BoxStore boxStore) {
        super(transaction, j9, GeometryRecordEntity_.f8668d, boxStore);
    }

    /* renamed from: r */
    public final void m7511r(GeometryRecordEntity geometryRecordEntity) {
        geometryRecordEntity.__boxStore = this.f13999d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo7358i(GeometryRecordEntity geometryRecordEntity) {
        return f8661j.mo2406a(geometryRecordEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo7359p(GeometryRecordEntity geometryRecordEntity) {
        ToOne<RecordEntity> toOne = geometryRecordEntity.record;
        if (toOne != null && toOne.m13188u()) {
            Cursor cursorM13123l = m13123l(RecordEntity.class);
            try {
                toOne.m13187t(cursorM13123l);
            } finally {
                cursorM13123l.close();
            }
        }
        String fileName = geometryRecordEntity.getFileName();
        int i9 = fileName != null ? f8662k : 0;
        String validate = geometryRecordEntity.getValidate();
        long jCollect313311 = Cursor.collect313311(this.f13997b, geometryRecordEntity.getId(), 3, i9, fileName, validate != null ? f8663l : 0, validate, 0, null, 0, null, f8664m, geometryRecordEntity.record.m13185n(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        geometryRecordEntity.m7509f(jCollect313311);
        m7511r(geometryRecordEntity);
        m13117a(geometryRecordEntity.geometryInfoEntityList, GeometryInfoEntity.class);
        return jCollect313311;
    }
}
