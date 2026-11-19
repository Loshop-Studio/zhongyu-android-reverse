package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.MatrixRecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225kc.InterfaceC9909b;

/* loaded from: classes5.dex */
public final class MatrixRecordEntityCursor extends Cursor<MatrixRecordEntity> {

    /* renamed from: l */
    public static final MatrixRecordEntity_.C8391a f18327l = MatrixRecordEntity_.f18333e;

    /* renamed from: m */
    public static final int f18328m = MatrixRecordEntity_.f18336h.f22265e;

    /* renamed from: n */
    public static final int f18329n = MatrixRecordEntity_.f18337i.f22265e;

    /* renamed from: o */
    public static final int f18330o = MatrixRecordEntity_.f18338j.f22265e;

    /* renamed from: com.zykj.blackboard.core.data.dao.MatrixRecordEntityCursor$a */
    public static final class C8388a implements InterfaceC9909b {
        @Override // p225kc.InterfaceC9909b
        /* renamed from: a */
        public Cursor mo13991a(Transaction transaction, long j10, BoxStore boxStore) {
            return new MatrixRecordEntityCursor(transaction, j10, boxStore);
        }
    }

    public MatrixRecordEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, MatrixRecordEntity_.f18334f, boxStore);
    }

    /* renamed from: u */
    public final void m14216u(MatrixRecordEntity matrixRecordEntity) {
        matrixRecordEntity.__boxStore = this.f22258f;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final long mo13986i(MatrixRecordEntity matrixRecordEntity) {
        return f18327l.mo14001a(matrixRecordEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final long mo13987s(MatrixRecordEntity matrixRecordEntity) {
        ToOne<RecordEntity> toOne = matrixRecordEntity.record;
        if (toOne != null && toOne.m19041m()) {
            Cursor cursorM18975l = m18975l(RecordEntity.class);
            try {
                toOne.m19040k(cursorM18975l);
            } finally {
                cursorM18975l.close();
            }
        }
        String strM14209a = matrixRecordEntity.m14209a();
        int i10 = strM14209a != null ? f18328m : 0;
        String strM14212d = matrixRecordEntity.m14212d();
        long jCollect313311 = Cursor.collect313311(this.f22256d, matrixRecordEntity.m14210b(), 3, i10, strM14209a, strM14212d != null ? f18329n : 0, strM14212d, 0, null, 0, null, f18330o, matrixRecordEntity.record.m19038f(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        matrixRecordEntity.m14214f(jCollect313311);
        m14216u(matrixRecordEntity);
        m18968a(matrixRecordEntity.matrixEventEntity, MatrixEventEntity.class);
        return jCollect313311;
    }
}
