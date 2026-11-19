package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.GeometryPointFEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225r8.InterfaceC9047b;

/* loaded from: classes4.dex */
public final class GeometryPointFEntityCursor extends Cursor<GeometryPointFEntity> {

    /* renamed from: j */
    public static final GeometryPointFEntity_.C6671a f7363j = GeometryPointFEntity_.f7369c;

    /* renamed from: k */
    public static final int f7364k = GeometryPointFEntity_.f7372f.f13192c;

    /* renamed from: l */
    public static final int f7365l = GeometryPointFEntity_.f7373g.f13192c;

    /* renamed from: m */
    public static final int f7366m = GeometryPointFEntity_.f7374h.f13192c;

    /* renamed from: com.zykj.blackboard.core.data.dao.GeometryPointFEntityCursor$a */
    public static final class C6669a implements InterfaceC9047b {
        @Override // p225r8.InterfaceC9047b
        /* renamed from: a */
        public Cursor mo6269a(Transaction transaction, long j10, BoxStore boxStore) {
            return new GeometryPointFEntityCursor(transaction, j10, boxStore);
        }
    }

    public GeometryPointFEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, GeometryPointFEntity_.f7370d, boxStore);
    }

    /* renamed from: r */
    public final void m6400r(GeometryPointFEntity geometryPointFEntity) {
        geometryPointFEntity.__boxStore = this.f13185d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo6264i(GeometryPointFEntity geometryPointFEntity) {
        return f7363j.mo6279a(geometryPointFEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo6265p(GeometryPointFEntity geometryPointFEntity) {
        ToOne<GeometryInfoEntity> toOne = geometryPointFEntity.record;
        if (toOne != null && toOne.m13069r()) {
            Cursor cursorM13003l = m13003l(GeometryInfoEntity.class);
            try {
                toOne.m13068q(cursorM13003l);
            } finally {
                cursorM13003l.close();
            }
        }
        long jCollect002033 = Cursor.collect002033(this.f13183b, geometryPointFEntity.getId(), 3, f7366m, geometryPointFEntity.record.m13066m(), 0, 0L, f7364k, geometryPointFEntity.getX(), f7365l, geometryPointFEntity.getY(), 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        geometryPointFEntity.m6399f(jCollect002033);
        m6400r(geometryPointFEntity);
        return jCollect002033;
    }
}
