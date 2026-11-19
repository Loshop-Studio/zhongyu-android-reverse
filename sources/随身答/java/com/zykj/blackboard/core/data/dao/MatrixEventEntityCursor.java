package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.MatrixEventEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p037c8.InterfaceC5267b;

/* loaded from: classes4.dex */
public final class MatrixEventEntityCursor extends Cursor<MatrixEventEntity> {

    /* renamed from: j */
    public static final MatrixEventEntity_.C7004a f8721j = MatrixEventEntity_.f8725c;

    /* renamed from: k */
    public static final int f8722k = MatrixEventEntity_.f8728f.f14006c;

    /* renamed from: com.zykj.blackboard.core.data.dao.MatrixEventEntityCursor$a */
    public static final class C7001a implements InterfaceC5267b {
        @Override // p037c8.InterfaceC5267b
        /* renamed from: a */
        public Cursor mo2405a(Transaction transaction, long j9, BoxStore boxStore) {
            return new MatrixEventEntityCursor(transaction, j9, boxStore);
        }
    }

    public MatrixEventEntityCursor(Transaction transaction, long j9, BoxStore boxStore) {
        super(transaction, j9, MatrixEventEntity_.f8726d, boxStore);
    }

    /* renamed from: r */
    public final void m7557r(MatrixEventEntity matrixEventEntity) {
        matrixEventEntity.__boxStore = this.f13999d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo7358i(MatrixEventEntity matrixEventEntity) {
        return f8721j.mo2406a(matrixEventEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo7359p(MatrixEventEntity matrixEventEntity) {
        ToOne<MatrixRecordEntity> toOne = matrixEventEntity.record;
        if (toOne != null && toOne.m13188u()) {
            Cursor cursorM13123l = m13123l(MatrixRecordEntity.class);
            try {
                toOne.m13187t(cursorM13123l);
            } finally {
                cursorM13123l.close();
            }
        }
        long jCollect313311 = Cursor.collect313311(this.f13997b, matrixEventEntity.getId(), 3, 0, null, 0, null, 0, null, 0, null, f8722k, matrixEventEntity.record.m13185n(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        matrixEventEntity.m7556e(jCollect313311);
        m7557r(matrixEventEntity);
        m13117a(matrixEventEntity.matrixInfo, MatrixInfoEntity.class);
        return jCollect313311;
    }
}
