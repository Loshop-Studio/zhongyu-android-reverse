package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.MatrixInfoEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225r8.InterfaceC9047b;

/* loaded from: classes4.dex */
public final class MatrixInfoEntityCursor extends Cursor<MatrixInfoEntity> {

    /* renamed from: j */
    public static final MatrixInfoEntity_.C6690a f7452j = MatrixInfoEntity_.f7466c;

    /* renamed from: k */
    public static final int f7453k = MatrixInfoEntity_.f7469f.f13192c;

    /* renamed from: l */
    public static final int f7454l = MatrixInfoEntity_.f7470g.f13192c;

    /* renamed from: m */
    public static final int f7455m = MatrixInfoEntity_.f7471h.f13192c;

    /* renamed from: n */
    public static final int f7456n = MatrixInfoEntity_.f7472i.f13192c;

    /* renamed from: o */
    public static final int f7457o = MatrixInfoEntity_.f7473j.f13192c;

    /* renamed from: p */
    public static final int f7458p = MatrixInfoEntity_.f7474k.f13192c;

    /* renamed from: q */
    public static final int f7459q = MatrixInfoEntity_.f7475l.f13192c;

    /* renamed from: r */
    public static final int f7460r = MatrixInfoEntity_.f7476m.f13192c;

    /* renamed from: s */
    public static final int f7461s = MatrixInfoEntity_.f7477n.f13192c;

    /* renamed from: t */
    public static final int f7462t = MatrixInfoEntity_.f7478o.f13192c;

    /* renamed from: u */
    public static final int f7463u = MatrixInfoEntity_.f7479p.f13192c;

    /* renamed from: com.zykj.blackboard.core.data.dao.MatrixInfoEntityCursor$a */
    public static final class C6688a implements InterfaceC9047b {
        @Override // p225r8.InterfaceC9047b
        /* renamed from: a */
        public Cursor mo6269a(Transaction transaction, long j10, BoxStore boxStore) {
            return new MatrixInfoEntityCursor(transaction, j10, boxStore);
        }
    }

    public MatrixInfoEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, MatrixInfoEntity_.f7467d, boxStore);
    }

    /* renamed from: r */
    public final void m6476r(MatrixInfoEntity matrixInfoEntity) {
        matrixInfoEntity.__boxStore = this.f13185d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo6264i(MatrixInfoEntity matrixInfoEntity) {
        return f7452j.mo6279a(matrixInfoEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo6265p(MatrixInfoEntity matrixInfoEntity) {
        ToOne<MatrixEventEntity> toOne = matrixInfoEntity.record;
        if (toOne != null && toOne.m13069r()) {
            Cursor cursorM13003l = m13003l(MatrixEventEntity.class);
            try {
                toOne.m13068q(cursorM13003l);
            } finally {
                cursorM13003l.close();
            }
        }
        Cursor.collect002033(this.f13183b, 0L, 1, f7453k, matrixInfoEntity.getEventTime(), f7463u, matrixInfoEntity.record.m13066m(), f7454l, matrixInfoEntity.getScaleX(), f7455m, matrixInfoEntity.getSkewX(), f7456n, matrixInfoEntity.getTransX(), 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        Cursor.collect002033(this.f13183b, 0L, 0, 0, 0L, 0, 0L, f7457o, matrixInfoEntity.getSkewY(), f7458p, matrixInfoEntity.getScaleY(), f7459q, matrixInfoEntity.getTransY(), 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        long jCollect002033 = Cursor.collect002033(this.f13183b, matrixInfoEntity.getId(), 2, 0, 0L, 0, 0L, f7460r, matrixInfoEntity.getPerSp0(), f7461s, matrixInfoEntity.getPerSp1(), f7462t, matrixInfoEntity.getPerSp2(), 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        matrixInfoEntity.m6475n(jCollect002033);
        m6476r(matrixInfoEntity);
        return jCollect002033;
    }
}
