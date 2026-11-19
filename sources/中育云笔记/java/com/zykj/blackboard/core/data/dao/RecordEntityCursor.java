package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.RecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225kc.InterfaceC9909b;

/* loaded from: classes5.dex */
public final class RecordEntityCursor extends Cursor<RecordEntity> {

    /* renamed from: l */
    public static final RecordEntity_.C8415a f18393l = RecordEntity_.f18397e;

    /* renamed from: m */
    public static final int f18394m = RecordEntity_.f18400h.f22265e;

    /* renamed from: com.zykj.blackboard.core.data.dao.RecordEntityCursor$a */
    public static final class C8399a implements InterfaceC9909b {
        @Override // p225kc.InterfaceC9909b
        /* renamed from: a */
        public Cursor mo13991a(Transaction transaction, long j10, BoxStore boxStore) {
            return new RecordEntityCursor(transaction, j10, boxStore);
        }
    }

    public RecordEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, RecordEntity_.f18398f, boxStore);
    }

    /* renamed from: u */
    public final void m14268u(RecordEntity recordEntity) {
        recordEntity.__boxStore = this.f22258f;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final long mo13986i(RecordEntity recordEntity) {
        return f18393l.mo14001a(recordEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final long mo13987s(RecordEntity recordEntity) {
        ToOne<PageEntity> toOne = recordEntity.page;
        if (toOne != null && toOne.m19041m()) {
            Cursor cursorM18975l = m18975l(PageEntity.class);
            try {
                toOne.m19040k(cursorM18975l);
            } finally {
                cursorM18975l.close();
            }
        }
        long jCollect313311 = Cursor.collect313311(this.f22256d, recordEntity.m14261e(), 3, 0, null, 0, null, 0, null, 0, null, f18394m, recordEntity.page.m19038f(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        recordEntity.m14267k(jCollect313311);
        m14268u(recordEntity);
        m18968a(recordEntity.commandList, CommandRecordEntity.class);
        m18968a(recordEntity.fileList, FileRecordEntity.class);
        m18968a(recordEntity.touchList, TouchRecordEntity.class);
        m18968a(recordEntity.matrixList, MatrixRecordEntity.class);
        m18968a(recordEntity.audioList, AudioRecordEntity.class);
        m18968a(recordEntity.textList, TextRecordEntity.class);
        m18968a(recordEntity.geometryList, GeometryRecordEntity.class);
        return jCollect313311;
    }
}
