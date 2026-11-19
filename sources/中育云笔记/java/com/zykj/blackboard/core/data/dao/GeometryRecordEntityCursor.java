package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.GeometryRecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225kc.InterfaceC9909b;

/* loaded from: classes5.dex */
public final class GeometryRecordEntityCursor extends Cursor<GeometryRecordEntity> {

    /* renamed from: l */
    public static final GeometryRecordEntity_.C8372a f18222l = GeometryRecordEntity_.f18228e;

    /* renamed from: m */
    public static final int f18223m = GeometryRecordEntity_.f18231h.f22265e;

    /* renamed from: n */
    public static final int f18224n = GeometryRecordEntity_.f18232i.f22265e;

    /* renamed from: o */
    public static final int f18225o = GeometryRecordEntity_.f18233j.f22265e;

    /* renamed from: com.zykj.blackboard.core.data.dao.GeometryRecordEntityCursor$a */
    public static final class C8369a implements InterfaceC9909b {
        @Override // p225kc.InterfaceC9909b
        /* renamed from: a */
        public Cursor mo13991a(Transaction transaction, long j10, BoxStore boxStore) {
            return new GeometryRecordEntityCursor(transaction, j10, boxStore);
        }
    }

    public GeometryRecordEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, GeometryRecordEntity_.f18229f, boxStore);
    }

    /* renamed from: u */
    public final void m14138u(GeometryRecordEntity geometryRecordEntity) {
        geometryRecordEntity.__boxStore = this.f22258f;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final long mo13986i(GeometryRecordEntity geometryRecordEntity) {
        return f18222l.mo14001a(geometryRecordEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final long mo13987s(GeometryRecordEntity geometryRecordEntity) {
        ToOne<RecordEntity> toOne = geometryRecordEntity.record;
        if (toOne != null && toOne.m19041m()) {
            Cursor cursorM18975l = m18975l(RecordEntity.class);
            try {
                toOne.m19040k(cursorM18975l);
            } finally {
                cursorM18975l.close();
            }
        }
        String strM14131a = geometryRecordEntity.m14131a();
        int i10 = strM14131a != null ? f18223m : 0;
        String strM14134d = geometryRecordEntity.m14134d();
        long jCollect313311 = Cursor.collect313311(this.f22256d, geometryRecordEntity.m14133c(), 3, i10, strM14131a, strM14134d != null ? f18224n : 0, strM14134d, 0, null, 0, null, f18225o, geometryRecordEntity.record.m19038f(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        geometryRecordEntity.m14136f(jCollect313311);
        m14138u(geometryRecordEntity);
        m18968a(geometryRecordEntity.geometryInfoEntityList, GeometryInfoEntity.class);
        return jCollect313311;
    }
}
