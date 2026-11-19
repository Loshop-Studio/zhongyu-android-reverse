package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.MatrixEventEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225r8.InterfaceC9047b;

/* loaded from: classes4.dex */
public final class MatrixEventEntityCursor extends Cursor<MatrixEventEntity> {

    /* renamed from: j */
    public static final MatrixEventEntity_.C6687a f7439j = MatrixEventEntity_.f7443c;

    /* renamed from: k */
    public static final int f7440k = MatrixEventEntity_.f7446f.f13192c;

    /* renamed from: com.zykj.blackboard.core.data.dao.MatrixEventEntityCursor$a */
    public static final class C6684a implements InterfaceC9047b {
        @Override // p225r8.InterfaceC9047b
        /* renamed from: a */
        public Cursor mo6269a(Transaction transaction, long j10, BoxStore boxStore) {
            return new MatrixEventEntityCursor(transaction, j10, boxStore);
        }
    }

    public MatrixEventEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, MatrixEventEntity_.f7444d, boxStore);
    }

    /* renamed from: r */
    public final void m6456r(MatrixEventEntity matrixEventEntity) {
        matrixEventEntity.__boxStore = this.f13185d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo6264i(MatrixEventEntity matrixEventEntity) {
        return f7439j.mo6279a(matrixEventEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo6265p(MatrixEventEntity matrixEventEntity) {
        ToOne<MatrixRecordEntity> toOne = matrixEventEntity.record;
        if (toOne != null && toOne.m13069r()) {
            Cursor cursorM13003l = m13003l(MatrixRecordEntity.class);
            try {
                toOne.m13068q(cursorM13003l);
            } finally {
                cursorM13003l.close();
            }
        }
        long jCollect313311 = Cursor.collect313311(this.f13183b, matrixEventEntity.getId(), 3, 0, null, 0, null, 0, null, 0, null, f7440k, matrixEventEntity.record.m13066m(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        matrixEventEntity.m6455e(jCollect313311);
        m6456r(matrixEventEntity);
        m12997a(matrixEventEntity.matrixInfo, MatrixInfoEntity.class);
        return jCollect313311;
    }
}
