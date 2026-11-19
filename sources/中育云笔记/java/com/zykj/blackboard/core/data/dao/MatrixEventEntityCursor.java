package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.MatrixEventEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225kc.InterfaceC9909b;

/* loaded from: classes5.dex */
public final class MatrixEventEntityCursor extends Cursor<MatrixEventEntity> {

    /* renamed from: l */
    public static final MatrixEventEntity_.C8384a f18282l = MatrixEventEntity_.f18286e;

    /* renamed from: m */
    public static final int f18283m = MatrixEventEntity_.f18289h.f22265e;

    /* renamed from: com.zykj.blackboard.core.data.dao.MatrixEventEntityCursor$a */
    public static final class C8381a implements InterfaceC9909b {
        @Override // p225kc.InterfaceC9909b
        /* renamed from: a */
        public Cursor mo13991a(Transaction transaction, long j10, BoxStore boxStore) {
            return new MatrixEventEntityCursor(transaction, j10, boxStore);
        }
    }

    public MatrixEventEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, MatrixEventEntity_.f18287f, boxStore);
    }

    /* renamed from: u */
    public final void m14184u(MatrixEventEntity matrixEventEntity) {
        matrixEventEntity.__boxStore = this.f22258f;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final long mo13986i(MatrixEventEntity matrixEventEntity) {
        return f18282l.mo14001a(matrixEventEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final long mo13987s(MatrixEventEntity matrixEventEntity) {
        ToOne<MatrixRecordEntity> toOne = matrixEventEntity.record;
        if (toOne != null && toOne.m19041m()) {
            Cursor cursorM18975l = m18975l(MatrixRecordEntity.class);
            try {
                toOne.m19040k(cursorM18975l);
            } finally {
                cursorM18975l.close();
            }
        }
        long jCollect313311 = Cursor.collect313311(this.f22256d, matrixEventEntity.m14179a(), 3, 0, null, 0, null, 0, null, 0, null, f18283m, matrixEventEntity.record.m19038f(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        matrixEventEntity.m14183e(jCollect313311);
        m14184u(matrixEventEntity);
        m18968a(matrixEventEntity.matrixInfo, MatrixInfoEntity.class);
        return jCollect313311;
    }
}
