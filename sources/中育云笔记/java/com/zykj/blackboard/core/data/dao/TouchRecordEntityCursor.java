package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.TouchRecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225kc.InterfaceC9909b;

/* loaded from: classes5.dex */
public final class TouchRecordEntityCursor extends Cursor<TouchRecordEntity> {

    /* renamed from: l */
    public static final TouchRecordEntity_.C8433a f18496l = TouchRecordEntity_.f18502e;

    /* renamed from: m */
    public static final int f18497m = TouchRecordEntity_.f18505h.f22265e;

    /* renamed from: n */
    public static final int f18498n = TouchRecordEntity_.f18506i.f22265e;

    /* renamed from: o */
    public static final int f18499o = TouchRecordEntity_.f18507j.f22265e;

    /* renamed from: com.zykj.blackboard.core.data.dao.TouchRecordEntityCursor$a */
    public static final class C8430a implements InterfaceC9909b {
        @Override // p225kc.InterfaceC9909b
        /* renamed from: a */
        public Cursor mo13991a(Transaction transaction, long j10, BoxStore boxStore) {
            return new TouchRecordEntityCursor(transaction, j10, boxStore);
        }
    }

    public TouchRecordEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, TouchRecordEntity_.f18503f, boxStore);
    }

    /* renamed from: u */
    public final void m14350u(TouchRecordEntity touchRecordEntity) {
        touchRecordEntity.__boxStore = this.f22258f;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final long mo13986i(TouchRecordEntity touchRecordEntity) {
        return f18496l.mo14001a(touchRecordEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final long mo13987s(TouchRecordEntity touchRecordEntity) {
        ToOne<RecordEntity> toOne = touchRecordEntity.record;
        if (toOne != null && toOne.m19041m()) {
            Cursor cursorM18975l = m18975l(RecordEntity.class);
            try {
                toOne.m19040k(cursorM18975l);
            } finally {
                cursorM18975l.close();
            }
        }
        String strM14343a = touchRecordEntity.m14343a();
        int i10 = strM14343a != null ? f18497m : 0;
        String strM14346d = touchRecordEntity.m14346d();
        long jCollect313311 = Cursor.collect313311(this.f22256d, touchRecordEntity.m14344b(), 3, i10, strM14343a, strM14346d != null ? f18498n : 0, strM14346d, 0, null, 0, null, f18499o, touchRecordEntity.record.m19038f(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        touchRecordEntity.m14348f(jCollect313311);
        m14350u(touchRecordEntity);
        m18968a(touchRecordEntity.touchEventList, TouchEventEntity.class);
        return jCollect313311;
    }
}
