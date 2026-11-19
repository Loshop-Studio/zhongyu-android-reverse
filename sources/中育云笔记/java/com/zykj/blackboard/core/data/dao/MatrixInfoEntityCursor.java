package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.MatrixInfoEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225kc.InterfaceC9909b;

/* loaded from: classes5.dex */
public final class MatrixInfoEntityCursor extends Cursor<MatrixInfoEntity> {

    /* renamed from: l */
    public static final MatrixInfoEntity_.C8387a f18295l = MatrixInfoEntity_.f18309e;

    /* renamed from: m */
    public static final int f18296m = MatrixInfoEntity_.f18312h.f22265e;

    /* renamed from: n */
    public static final int f18297n = MatrixInfoEntity_.f18313i.f22265e;

    /* renamed from: o */
    public static final int f18298o = MatrixInfoEntity_.f18314j.f22265e;

    /* renamed from: p */
    public static final int f18299p = MatrixInfoEntity_.f18315k.f22265e;

    /* renamed from: q */
    public static final int f18300q = MatrixInfoEntity_.f18316l.f22265e;

    /* renamed from: r */
    public static final int f18301r = MatrixInfoEntity_.f18317m.f22265e;

    /* renamed from: s */
    public static final int f18302s = MatrixInfoEntity_.f18318n.f22265e;

    /* renamed from: t */
    public static final int f18303t = MatrixInfoEntity_.f18319o.f22265e;

    /* renamed from: u */
    public static final int f18304u = MatrixInfoEntity_.f18320p.f22265e;

    /* renamed from: v */
    public static final int f18305v = MatrixInfoEntity_.f18321q.f22265e;

    /* renamed from: w */
    public static final int f18306w = MatrixInfoEntity_.f18322r.f22265e;

    /* renamed from: com.zykj.blackboard.core.data.dao.MatrixInfoEntityCursor$a */
    public static final class C8385a implements InterfaceC9909b {
        @Override // p225kc.InterfaceC9909b
        /* renamed from: a */
        public Cursor mo13991a(Transaction transaction, long j10, BoxStore boxStore) {
            return new MatrixInfoEntityCursor(transaction, j10, boxStore);
        }
    }

    public MatrixInfoEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, MatrixInfoEntity_.f18310f, boxStore);
    }

    /* renamed from: u */
    public final void m14204u(MatrixInfoEntity matrixInfoEntity) {
        matrixInfoEntity.__boxStore = this.f22258f;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final long mo13986i(MatrixInfoEntity matrixInfoEntity) {
        return f18295l.mo14001a(matrixInfoEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final long mo13987s(MatrixInfoEntity matrixInfoEntity) {
        ToOne<MatrixEventEntity> toOne = matrixInfoEntity.record;
        if (toOne != null && toOne.m19041m()) {
            Cursor cursorM18975l = m18975l(MatrixEventEntity.class);
            try {
                toOne.m19040k(cursorM18975l);
            } finally {
                cursorM18975l.close();
            }
        }
        Cursor.collect002033(this.f22256d, 0L, 1, f18296m, matrixInfoEntity.m14190a(), f18306w, matrixInfoEntity.record.m19038f(), f18297n, matrixInfoEntity.m14196g(), f18298o, matrixInfoEntity.m14198i(), f18299p, matrixInfoEntity.m14200k(), 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        Cursor.collect002033(this.f22256d, 0L, 0, 0, 0L, 0, 0L, f18300q, matrixInfoEntity.m14199j(), f18301r, matrixInfoEntity.m14197h(), f18302s, matrixInfoEntity.m14201l(), 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        long jCollect002033 = Cursor.collect002033(this.f22256d, matrixInfoEntity.m14191b(), 2, 0, 0L, 0, 0L, f18303t, matrixInfoEntity.m14192c(), f18304u, matrixInfoEntity.m14193d(), f18305v, matrixInfoEntity.m14194e(), 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        matrixInfoEntity.m14203n(jCollect002033);
        m14204u(matrixInfoEntity);
        return jCollect002033;
    }
}
