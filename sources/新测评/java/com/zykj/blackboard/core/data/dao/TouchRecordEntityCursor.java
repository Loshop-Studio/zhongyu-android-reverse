package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.TouchRecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225r8.InterfaceC9047b;

/* loaded from: classes4.dex */
public final class TouchRecordEntityCursor extends Cursor<TouchRecordEntity> {

    /* renamed from: j */
    public static final TouchRecordEntity_.C6736a f7653j = TouchRecordEntity_.f7659c;

    /* renamed from: k */
    public static final int f7654k = TouchRecordEntity_.f7662f.f13192c;

    /* renamed from: l */
    public static final int f7655l = TouchRecordEntity_.f7663g.f13192c;

    /* renamed from: m */
    public static final int f7656m = TouchRecordEntity_.f7664h.f13192c;

    /* renamed from: com.zykj.blackboard.core.data.dao.TouchRecordEntityCursor$a */
    public static final class C6733a implements InterfaceC9047b {
        @Override // p225r8.InterfaceC9047b
        /* renamed from: a */
        public Cursor mo6269a(Transaction transaction, long j10, BoxStore boxStore) {
            return new TouchRecordEntityCursor(transaction, j10, boxStore);
        }
    }

    public TouchRecordEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, TouchRecordEntity_.f7660d, boxStore);
    }

    /* renamed from: r */
    public final void m6618r(TouchRecordEntity touchRecordEntity) {
        touchRecordEntity.__boxStore = this.f13185d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo6264i(TouchRecordEntity touchRecordEntity) {
        return f7653j.mo6279a(touchRecordEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo6265p(TouchRecordEntity touchRecordEntity) {
        ToOne<RecordEntity> toOne = touchRecordEntity.record;
        if (toOne != null && toOne.m13069r()) {
            Cursor cursorM13003l = m13003l(RecordEntity.class);
            try {
                toOne.m13068q(cursorM13003l);
            } finally {
                cursorM13003l.close();
            }
        }
        String fileName = touchRecordEntity.getFileName();
        int i10 = fileName != null ? f7654k : 0;
        String validate = touchRecordEntity.getValidate();
        long jCollect313311 = Cursor.collect313311(this.f13183b, touchRecordEntity.getId(), 3, i10, fileName, validate != null ? f7655l : 0, validate, 0, null, 0, null, f7656m, touchRecordEntity.record.m13066m(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        touchRecordEntity.m6617f(jCollect313311);
        m6618r(touchRecordEntity);
        m12997a(touchRecordEntity.touchEventList, TouchEventEntity.class);
        return jCollect313311;
    }
}
