package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.GeometryInfoEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225kc.InterfaceC9909b;

/* loaded from: classes5.dex */
public final class GeometryInfoEntityCursor extends Cursor<GeometryInfoEntity> {

    /* renamed from: l */
    public static final GeometryInfoEntity_.C8365a f18181l = GeometryInfoEntity_.f18190e;

    /* renamed from: m */
    public static final int f18182m = GeometryInfoEntity_.f18193h.f22265e;

    /* renamed from: n */
    public static final int f18183n = GeometryInfoEntity_.f18194i.f22265e;

    /* renamed from: o */
    public static final int f18184o = GeometryInfoEntity_.f18195j.f22265e;

    /* renamed from: p */
    public static final int f18185p = GeometryInfoEntity_.f18196k.f22265e;

    /* renamed from: q */
    public static final int f18186q = GeometryInfoEntity_.f18197l.f22265e;

    /* renamed from: r */
    public static final int f18187r = GeometryInfoEntity_.f18198m.f22265e;

    /* renamed from: com.zykj.blackboard.core.data.dao.GeometryInfoEntityCursor$a */
    public static final class C8362a implements InterfaceC9909b {
        @Override // p225kc.InterfaceC9909b
        /* renamed from: a */
        public Cursor mo13991a(Transaction transaction, long j10, BoxStore boxStore) {
            return new GeometryInfoEntityCursor(transaction, j10, boxStore);
        }
    }

    public GeometryInfoEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, GeometryInfoEntity_.f18191f, boxStore);
    }

    /* renamed from: u */
    public final void m14114u(GeometryInfoEntity geometryInfoEntity) {
        geometryInfoEntity.__boxStore = this.f22258f;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final long mo13986i(GeometryInfoEntity geometryInfoEntity) {
        return f18181l.mo14001a(geometryInfoEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final long mo13987s(GeometryInfoEntity geometryInfoEntity) {
        ToOne<GeometryRecordEntity> toOne = geometryInfoEntity.record;
        if (toOne != null && toOne.m19041m()) {
            Cursor cursorM18975l = m18975l(GeometryRecordEntity.class);
            try {
                toOne.m19040k(cursorM18975l);
            } finally {
                cursorM18975l.close();
            }
        }
        Cursor.collect313311(this.f22256d, 0L, 1, 0, null, 0, null, 0, null, 0, null, f18187r, geometryInfoEntity.record.m19038f(), f18183n, geometryInfoEntity.m14104a(), f18185p, geometryInfoEntity.m14109f(), f18186q, geometryInfoEntity.m14105b(), 0, 0, 0, 0, f18182m, geometryInfoEntity.m14111h(), 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        long jCollect313311 = Cursor.collect313311(this.f22256d, geometryInfoEntity.m14106c(), 2, 0, null, 0, null, 0, null, 0, null, 0, 0L, 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, f18184o, geometryInfoEntity.m14110g(), 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        geometryInfoEntity.m14113j(jCollect313311);
        m14114u(geometryInfoEntity);
        m18968a(geometryInfoEntity.pointList, GeometryPointFEntity.class);
        return jCollect313311;
    }
}
