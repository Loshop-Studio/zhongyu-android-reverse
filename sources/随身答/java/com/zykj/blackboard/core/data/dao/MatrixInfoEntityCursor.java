package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.MatrixInfoEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p037c8.InterfaceC5267b;

/* loaded from: classes4.dex */
public final class MatrixInfoEntityCursor extends Cursor<MatrixInfoEntity> {

    /* renamed from: j */
    public static final MatrixInfoEntity_.C7007a f8734j = MatrixInfoEntity_.f8748c;

    /* renamed from: k */
    public static final int f8735k = MatrixInfoEntity_.f8751f.f14006c;

    /* renamed from: l */
    public static final int f8736l = MatrixInfoEntity_.f8752g.f14006c;

    /* renamed from: m */
    public static final int f8737m = MatrixInfoEntity_.f8753h.f14006c;

    /* renamed from: n */
    public static final int f8738n = MatrixInfoEntity_.f8754i.f14006c;

    /* renamed from: o */
    public static final int f8739o = MatrixInfoEntity_.f8755j.f14006c;

    /* renamed from: p */
    public static final int f8740p = MatrixInfoEntity_.f8756k.f14006c;

    /* renamed from: q */
    public static final int f8741q = MatrixInfoEntity_.f8757l.f14006c;

    /* renamed from: r */
    public static final int f8742r = MatrixInfoEntity_.f8758m.f14006c;

    /* renamed from: s */
    public static final int f8743s = MatrixInfoEntity_.f8759n.f14006c;

    /* renamed from: t */
    public static final int f8744t = MatrixInfoEntity_.f8760o.f14006c;

    /* renamed from: u */
    public static final int f8745u = MatrixInfoEntity_.f8761p.f14006c;

    /* renamed from: com.zykj.blackboard.core.data.dao.MatrixInfoEntityCursor$a */
    public static final class C7005a implements InterfaceC5267b {
        @Override // p037c8.InterfaceC5267b
        /* renamed from: a */
        public Cursor mo2405a(Transaction transaction, long j9, BoxStore boxStore) {
            return new MatrixInfoEntityCursor(transaction, j9, boxStore);
        }
    }

    public MatrixInfoEntityCursor(Transaction transaction, long j9, BoxStore boxStore) {
        super(transaction, j9, MatrixInfoEntity_.f8749d, boxStore);
    }

    /* renamed from: r */
    public final void m7577r(MatrixInfoEntity matrixInfoEntity) {
        matrixInfoEntity.__boxStore = this.f13999d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo7358i(MatrixInfoEntity matrixInfoEntity) {
        return f8734j.mo2406a(matrixInfoEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo7359p(MatrixInfoEntity matrixInfoEntity) {
        ToOne<MatrixEventEntity> toOne = matrixInfoEntity.record;
        if (toOne != null && toOne.m13188u()) {
            Cursor cursorM13123l = m13123l(MatrixEventEntity.class);
            try {
                toOne.m13187t(cursorM13123l);
            } finally {
                cursorM13123l.close();
            }
        }
        Cursor.collect002033(this.f13997b, 0L, 1, f8735k, matrixInfoEntity.getEventTime(), f8745u, matrixInfoEntity.record.m13185n(), f8736l, matrixInfoEntity.getScaleX(), f8737m, matrixInfoEntity.getSkewX(), f8738n, matrixInfoEntity.getTransX(), 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        Cursor.collect002033(this.f13997b, 0L, 0, 0, 0L, 0, 0L, f8739o, matrixInfoEntity.getSkewY(), f8740p, matrixInfoEntity.getScaleY(), f8741q, matrixInfoEntity.getTransY(), 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        long jCollect002033 = Cursor.collect002033(this.f13997b, matrixInfoEntity.getId(), 2, 0, 0L, 0, 0L, f8742r, matrixInfoEntity.getPerSp0(), f8743s, matrixInfoEntity.getPerSp1(), f8744t, matrixInfoEntity.getPerSp2(), 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        matrixInfoEntity.m7576n(jCollect002033);
        m7577r(matrixInfoEntity);
        return jCollect002033;
    }
}
