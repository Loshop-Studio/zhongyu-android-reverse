package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.GeometryRecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225r8.InterfaceC9047b;

/* loaded from: classes4.dex */
public final class GeometryRecordEntityCursor extends Cursor<GeometryRecordEntity> {

    /* renamed from: j */
    public static final GeometryRecordEntity_.C6675a f7379j = GeometryRecordEntity_.f7385c;

    /* renamed from: k */
    public static final int f7380k = GeometryRecordEntity_.f7388f.f13192c;

    /* renamed from: l */
    public static final int f7381l = GeometryRecordEntity_.f7389g.f13192c;

    /* renamed from: m */
    public static final int f7382m = GeometryRecordEntity_.f7390h.f13192c;

    /* renamed from: com.zykj.blackboard.core.data.dao.GeometryRecordEntityCursor$a */
    public static final class C6672a implements InterfaceC9047b {
        @Override // p225r8.InterfaceC9047b
        /* renamed from: a */
        public Cursor mo6269a(Transaction transaction, long j10, BoxStore boxStore) {
            return new GeometryRecordEntityCursor(transaction, j10, boxStore);
        }
    }

    public GeometryRecordEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, GeometryRecordEntity_.f7386d, boxStore);
    }

    /* renamed from: r */
    public final void m6411r(GeometryRecordEntity geometryRecordEntity) {
        geometryRecordEntity.__boxStore = this.f13185d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo6264i(GeometryRecordEntity geometryRecordEntity) {
        return f7379j.mo6279a(geometryRecordEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo6265p(GeometryRecordEntity geometryRecordEntity) {
        ToOne<RecordEntity> toOne = geometryRecordEntity.record;
        if (toOne != null && toOne.m13069r()) {
            Cursor cursorM13003l = m13003l(RecordEntity.class);
            try {
                toOne.m13068q(cursorM13003l);
            } finally {
                cursorM13003l.close();
            }
        }
        String fileName = geometryRecordEntity.getFileName();
        int i10 = fileName != null ? f7380k : 0;
        String validate = geometryRecordEntity.getValidate();
        long jCollect313311 = Cursor.collect313311(this.f13183b, geometryRecordEntity.getId(), 3, i10, fileName, validate != null ? f7381l : 0, validate, 0, null, 0, null, f7382m, geometryRecordEntity.record.m13066m(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        geometryRecordEntity.m6410f(jCollect313311);
        m6411r(geometryRecordEntity);
        m12997a(geometryRecordEntity.geometryInfoEntityList, GeometryInfoEntity.class);
        return jCollect313311;
    }
}
