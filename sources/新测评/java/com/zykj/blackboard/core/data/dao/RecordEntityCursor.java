package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.RecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225r8.InterfaceC9047b;

/* loaded from: classes4.dex */
public final class RecordEntityCursor extends Cursor<RecordEntity> {

    /* renamed from: j */
    public static final RecordEntity_.C6718a f7550j = RecordEntity_.f7554c;

    /* renamed from: k */
    public static final int f7551k = RecordEntity_.f7557f.f13192c;

    /* renamed from: com.zykj.blackboard.core.data.dao.RecordEntityCursor$a */
    public static final class C6702a implements InterfaceC9047b {
        @Override // p225r8.InterfaceC9047b
        /* renamed from: a */
        public Cursor mo6269a(Transaction transaction, long j10, BoxStore boxStore) {
            return new RecordEntityCursor(transaction, j10, boxStore);
        }
    }

    public RecordEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, RecordEntity_.f7555d, boxStore);
    }

    /* renamed from: r */
    public final void m6538r(RecordEntity recordEntity) {
        recordEntity.__boxStore = this.f13185d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo6264i(RecordEntity recordEntity) {
        return f7550j.mo6279a(recordEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo6265p(RecordEntity recordEntity) {
        ToOne<PageEntity> toOne = recordEntity.page;
        if (toOne != null && toOne.m13069r()) {
            Cursor cursorM13003l = m13003l(PageEntity.class);
            try {
                toOne.m13068q(cursorM13003l);
            } finally {
                cursorM13003l.close();
            }
        }
        long jCollect313311 = Cursor.collect313311(this.f13183b, recordEntity.getId(), 3, 0, null, 0, null, 0, null, 0, null, f7551k, recordEntity.page.m13066m(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        recordEntity.m6537k(jCollect313311);
        m6538r(recordEntity);
        m12997a(recordEntity.commandList, CommandRecordEntity.class);
        m12997a(recordEntity.fileList, FileRecordEntity.class);
        m12997a(recordEntity.touchList, TouchRecordEntity.class);
        m12997a(recordEntity.matrixList, MatrixRecordEntity.class);
        m12997a(recordEntity.audioList, AudioRecordEntity.class);
        m12997a(recordEntity.textList, TextRecordEntity.class);
        m12997a(recordEntity.geometryList, GeometryRecordEntity.class);
        return jCollect313311;
    }
}
