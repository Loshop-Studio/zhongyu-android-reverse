package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.RecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p037c8.InterfaceC5267b;

/* loaded from: classes4.dex */
public final class RecordEntityCursor extends Cursor<RecordEntity> {

    /* renamed from: j */
    public static final RecordEntity_.C7035a f8832j = RecordEntity_.f8836c;

    /* renamed from: k */
    public static final int f8833k = RecordEntity_.f8839f.f14006c;

    /* renamed from: com.zykj.blackboard.core.data.dao.RecordEntityCursor$a */
    public static final class C7019a implements InterfaceC5267b {
        @Override // p037c8.InterfaceC5267b
        /* renamed from: a */
        public Cursor mo2405a(Transaction transaction, long j9, BoxStore boxStore) {
            return new RecordEntityCursor(transaction, j9, boxStore);
        }
    }

    public RecordEntityCursor(Transaction transaction, long j9, BoxStore boxStore) {
        super(transaction, j9, RecordEntity_.f8837d, boxStore);
    }

    /* renamed from: r */
    public final void m7640r(RecordEntity recordEntity) {
        recordEntity.__boxStore = this.f13999d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo7358i(RecordEntity recordEntity) {
        return f8832j.mo2406a(recordEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo7359p(RecordEntity recordEntity) {
        ToOne<PageEntity> toOne = recordEntity.page;
        if (toOne != null && toOne.m13188u()) {
            Cursor cursorM13123l = m13123l(PageEntity.class);
            try {
                toOne.m13187t(cursorM13123l);
            } finally {
                cursorM13123l.close();
            }
        }
        long jCollect313311 = Cursor.collect313311(this.f13997b, recordEntity.getId(), 3, 0, null, 0, null, 0, null, 0, null, f8833k, recordEntity.page.m13185n(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        recordEntity.m7639k(jCollect313311);
        m7640r(recordEntity);
        m13117a(recordEntity.commandList, CommandRecordEntity.class);
        m13117a(recordEntity.fileList, FileRecordEntity.class);
        m13117a(recordEntity.touchList, TouchRecordEntity.class);
        m13117a(recordEntity.matrixList, MatrixRecordEntity.class);
        m13117a(recordEntity.audioList, AudioRecordEntity.class);
        m13117a(recordEntity.textList, TextRecordEntity.class);
        m13117a(recordEntity.geometryList, GeometryRecordEntity.class);
        return jCollect313311;
    }
}
