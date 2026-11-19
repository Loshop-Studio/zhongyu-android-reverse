package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.GeometryInfoEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225r8.InterfaceC9047b;

/* loaded from: classes4.dex */
public final class GeometryInfoEntityCursor extends Cursor<GeometryInfoEntity> {

    /* renamed from: j */
    public static final GeometryInfoEntity_.C6668a f7338j = GeometryInfoEntity_.f7347c;

    /* renamed from: k */
    public static final int f7339k = GeometryInfoEntity_.f7350f.f13192c;

    /* renamed from: l */
    public static final int f7340l = GeometryInfoEntity_.f7351g.f13192c;

    /* renamed from: m */
    public static final int f7341m = GeometryInfoEntity_.f7352h.f13192c;

    /* renamed from: n */
    public static final int f7342n = GeometryInfoEntity_.f7353i.f13192c;

    /* renamed from: o */
    public static final int f7343o = GeometryInfoEntity_.f7354j.f13192c;

    /* renamed from: p */
    public static final int f7344p = GeometryInfoEntity_.f7355k.f13192c;

    /* renamed from: com.zykj.blackboard.core.data.dao.GeometryInfoEntityCursor$a */
    public static final class C6665a implements InterfaceC9047b {
        @Override // p225r8.InterfaceC9047b
        /* renamed from: a */
        public Cursor mo6269a(Transaction transaction, long j10, BoxStore boxStore) {
            return new GeometryInfoEntityCursor(transaction, j10, boxStore);
        }
    }

    public GeometryInfoEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, GeometryInfoEntity_.f7348d, boxStore);
    }

    /* renamed from: r */
    public final void m6388r(GeometryInfoEntity geometryInfoEntity) {
        geometryInfoEntity.__boxStore = this.f13185d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo6264i(GeometryInfoEntity geometryInfoEntity) {
        return f7338j.mo6279a(geometryInfoEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo6265p(GeometryInfoEntity geometryInfoEntity) {
        ToOne<GeometryRecordEntity> toOne = geometryInfoEntity.record;
        if (toOne != null && toOne.m13069r()) {
            Cursor cursorM13003l = m13003l(GeometryRecordEntity.class);
            try {
                toOne.m13068q(cursorM13003l);
            } finally {
                cursorM13003l.close();
            }
        }
        Cursor.collect313311(this.f13183b, 0L, 1, 0, null, 0, null, 0, null, 0, null, f7344p, geometryInfoEntity.record.m13066m(), f7340l, geometryInfoEntity.getColor(), f7342n, geometryInfoEntity.getStyle(), f7343o, geometryInfoEntity.getGeometryType(), 0, 0, 0, 0, f7339k, geometryInfoEntity.getWidth(), 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        long jCollect313311 = Cursor.collect313311(this.f13183b, geometryInfoEntity.getId(), 2, 0, null, 0, null, 0, null, 0, null, 0, 0L, 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, f7341m, geometryInfoEntity.getTextSize(), 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        geometryInfoEntity.m6387j(jCollect313311);
        m6388r(geometryInfoEntity);
        m12997a(geometryInfoEntity.pointList, GeometryPointFEntity.class);
        return jCollect313311;
    }
}
