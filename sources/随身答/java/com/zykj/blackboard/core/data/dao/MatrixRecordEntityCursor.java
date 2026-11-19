package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.MatrixRecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p037c8.InterfaceC5267b;

/* loaded from: classes4.dex */
public final class MatrixRecordEntityCursor extends Cursor<MatrixRecordEntity> {

    /* renamed from: j */
    public static final MatrixRecordEntity_.C7011a f8766j = MatrixRecordEntity_.f8772c;

    /* renamed from: k */
    public static final int f8767k = MatrixRecordEntity_.f8775f.f14006c;

    /* renamed from: l */
    public static final int f8768l = MatrixRecordEntity_.f8776g.f14006c;

    /* renamed from: m */
    public static final int f8769m = MatrixRecordEntity_.f8777h.f14006c;

    /* renamed from: com.zykj.blackboard.core.data.dao.MatrixRecordEntityCursor$a */
    public static final class C7008a implements InterfaceC5267b {
        @Override // p037c8.InterfaceC5267b
        /* renamed from: a */
        public Cursor mo2405a(Transaction transaction, long j9, BoxStore boxStore) {
            return new MatrixRecordEntityCursor(transaction, j9, boxStore);
        }
    }

    public MatrixRecordEntityCursor(Transaction transaction, long j9, BoxStore boxStore) {
        super(transaction, j9, MatrixRecordEntity_.f8773d, boxStore);
    }

    /* renamed from: r */
    public final void m7589r(MatrixRecordEntity matrixRecordEntity) {
        matrixRecordEntity.__boxStore = this.f13999d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo7358i(MatrixRecordEntity matrixRecordEntity) {
        return f8766j.mo2406a(matrixRecordEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo7359p(MatrixRecordEntity matrixRecordEntity) {
        ToOne<RecordEntity> toOne = matrixRecordEntity.record;
        if (toOne != null && toOne.m13188u()) {
            Cursor cursorM13123l = m13123l(RecordEntity.class);
            try {
                toOne.m13187t(cursorM13123l);
            } finally {
                cursorM13123l.close();
            }
        }
        String fileName = matrixRecordEntity.getFileName();
        int i9 = fileName != null ? f8767k : 0;
        String validate = matrixRecordEntity.getValidate();
        long jCollect313311 = Cursor.collect313311(this.f13997b, matrixRecordEntity.getId(), 3, i9, fileName, validate != null ? f8768l : 0, validate, 0, null, 0, null, f8769m, matrixRecordEntity.record.m13185n(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        matrixRecordEntity.m7587f(jCollect313311);
        m7589r(matrixRecordEntity);
        m13117a(matrixRecordEntity.matrixEventEntity, MatrixEventEntity.class);
        return jCollect313311;
    }
}
