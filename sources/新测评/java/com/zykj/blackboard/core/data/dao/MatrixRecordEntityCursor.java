package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.MatrixRecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225r8.InterfaceC9047b;

/* loaded from: classes4.dex */
public final class MatrixRecordEntityCursor extends Cursor<MatrixRecordEntity> {

    /* renamed from: j */
    public static final MatrixRecordEntity_.C6694a f7484j = MatrixRecordEntity_.f7490c;

    /* renamed from: k */
    public static final int f7485k = MatrixRecordEntity_.f7493f.f13192c;

    /* renamed from: l */
    public static final int f7486l = MatrixRecordEntity_.f7494g.f13192c;

    /* renamed from: m */
    public static final int f7487m = MatrixRecordEntity_.f7495h.f13192c;

    /* renamed from: com.zykj.blackboard.core.data.dao.MatrixRecordEntityCursor$a */
    public static final class C6691a implements InterfaceC9047b {
        @Override // p225r8.InterfaceC9047b
        /* renamed from: a */
        public Cursor mo6269a(Transaction transaction, long j10, BoxStore boxStore) {
            return new MatrixRecordEntityCursor(transaction, j10, boxStore);
        }
    }

    public MatrixRecordEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, MatrixRecordEntity_.f7491d, boxStore);
    }

    /* renamed from: r */
    public final void m6487r(MatrixRecordEntity matrixRecordEntity) {
        matrixRecordEntity.__boxStore = this.f13185d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo6264i(MatrixRecordEntity matrixRecordEntity) {
        return f7484j.mo6279a(matrixRecordEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo6265p(MatrixRecordEntity matrixRecordEntity) {
        ToOne<RecordEntity> toOne = matrixRecordEntity.record;
        if (toOne != null && toOne.m13069r()) {
            Cursor cursorM13003l = m13003l(RecordEntity.class);
            try {
                toOne.m13068q(cursorM13003l);
            } finally {
                cursorM13003l.close();
            }
        }
        String fileName = matrixRecordEntity.getFileName();
        int i10 = fileName != null ? f7485k : 0;
        String validate = matrixRecordEntity.getValidate();
        long jCollect313311 = Cursor.collect313311(this.f13183b, matrixRecordEntity.getId(), 3, i10, fileName, validate != null ? f7486l : 0, validate, 0, null, 0, null, f7487m, matrixRecordEntity.record.m13066m(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        matrixRecordEntity.m6486f(jCollect313311);
        m6487r(matrixRecordEntity);
        m12997a(matrixRecordEntity.matrixEventEntity, MatrixEventEntity.class);
        return jCollect313311;
    }
}
