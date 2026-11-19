package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.TouchEventEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p037c8.InterfaceC5267b;

/* loaded from: classes4.dex */
public final class TouchEventEntityCursor extends Cursor<TouchEventEntity> {

    /* renamed from: j */
    public static final TouchEventEntity_.C7046a f8890j = TouchEventEntity_.f8900c;

    /* renamed from: k */
    public static final int f8891k = TouchEventEntity_.f8903f.f14006c;

    /* renamed from: l */
    public static final int f8892l = TouchEventEntity_.f8904g.f14006c;

    /* renamed from: m */
    public static final int f8893m = TouchEventEntity_.f8905h.f14006c;

    /* renamed from: n */
    public static final int f8894n = TouchEventEntity_.f8906i.f14006c;

    /* renamed from: o */
    public static final int f8895o = TouchEventEntity_.f8907j.f14006c;

    /* renamed from: p */
    public static final int f8896p = TouchEventEntity_.f8908k.f14006c;

    /* renamed from: q */
    public static final int f8897q = TouchEventEntity_.f8909l.f14006c;

    /* renamed from: com.zykj.blackboard.core.data.dao.TouchEventEntityCursor$a */
    public static final class C7043a implements InterfaceC5267b {
        @Override // p037c8.InterfaceC5267b
        /* renamed from: a */
        public Cursor mo2405a(Transaction transaction, long j9, BoxStore boxStore) {
            return new TouchEventEntityCursor(transaction, j9, boxStore);
        }
    }

    public TouchEventEntityCursor(Transaction transaction, long j9, BoxStore boxStore) {
        super(transaction, j9, TouchEventEntity_.f8901d, boxStore);
    }

    /* renamed from: r */
    public final void m7697r(TouchEventEntity touchEventEntity) {
        touchEventEntity.__boxStore = this.f13999d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo7358i(TouchEventEntity touchEventEntity) {
        return f8890j.mo2406a(touchEventEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo7359p(TouchEventEntity touchEventEntity) {
        ToOne<TouchRecordEntity> toOne = touchEventEntity.record;
        if (toOne != null && toOne.m13188u()) {
            Cursor cursorM13123l = m13123l(TouchRecordEntity.class);
            try {
                toOne.m13187t(cursorM13123l);
            } finally {
                cursorM13123l.close();
            }
        }
        Cursor.collect002033(this.f13997b, 0L, 1, f8897q, touchEventEntity.record.m13185n(), f8892l, touchEventEntity.getColor(), f8891k, touchEventEntity.getWidth(), f8893m, touchEventEntity.getSpacing(), f8894n, touchEventEntity.getItemLength(), 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        long jCollect313311 = Cursor.collect313311(this.f13997b, touchEventEntity.getId(), 2, 0, null, 0, null, 0, null, 0, null, f8895o, touchEventEntity.getStyle(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, f8896p, touchEventEntity.getTextSize(), 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        touchEventEntity.m7696k(jCollect313311);
        m7697r(touchEventEntity);
        m13117a(touchEventEntity.touchInfoList, TouchInfoEntity.class);
        return jCollect313311;
    }
}
