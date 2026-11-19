package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.TouchRecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p037c8.InterfaceC5267b;

/* loaded from: classes4.dex */
public final class TouchRecordEntityCursor extends Cursor<TouchRecordEntity> {

    /* renamed from: j */
    public static final TouchRecordEntity_.C7053a f8935j = TouchRecordEntity_.f8941c;

    /* renamed from: k */
    public static final int f8936k = TouchRecordEntity_.f8944f.f14006c;

    /* renamed from: l */
    public static final int f8937l = TouchRecordEntity_.f8945g.f14006c;

    /* renamed from: m */
    public static final int f8938m = TouchRecordEntity_.f8946h.f14006c;

    /* renamed from: com.zykj.blackboard.core.data.dao.TouchRecordEntityCursor$a */
    public static final class C7050a implements InterfaceC5267b {
        @Override // p037c8.InterfaceC5267b
        /* renamed from: a */
        public Cursor mo2405a(Transaction transaction, long j9, BoxStore boxStore) {
            return new TouchRecordEntityCursor(transaction, j9, boxStore);
        }
    }

    public TouchRecordEntityCursor(Transaction transaction, long j9, BoxStore boxStore) {
        super(transaction, j9, TouchRecordEntity_.f8942d, boxStore);
    }

    /* renamed from: r */
    public final void m7722r(TouchRecordEntity touchRecordEntity) {
        touchRecordEntity.__boxStore = this.f13999d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo7358i(TouchRecordEntity touchRecordEntity) {
        return f8935j.mo2406a(touchRecordEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo7359p(TouchRecordEntity touchRecordEntity) {
        ToOne<RecordEntity> toOne = touchRecordEntity.record;
        if (toOne != null && toOne.m13188u()) {
            Cursor cursorM13123l = m13123l(RecordEntity.class);
            try {
                toOne.m13187t(cursorM13123l);
            } finally {
                cursorM13123l.close();
            }
        }
        String fileName = touchRecordEntity.getFileName();
        int i9 = fileName != null ? f8936k : 0;
        String validate = touchRecordEntity.getValidate();
        long jCollect313311 = Cursor.collect313311(this.f13997b, touchRecordEntity.getId(), 3, i9, fileName, validate != null ? f8937l : 0, validate, 0, null, 0, null, f8938m, touchRecordEntity.record.m13185n(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        touchRecordEntity.m7720f(jCollect313311);
        m7722r(touchRecordEntity);
        m13117a(touchRecordEntity.touchEventList, TouchEventEntity.class);
        return jCollect313311;
    }
}
