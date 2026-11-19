package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.TouchEventEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225r8.InterfaceC9047b;

/* loaded from: classes4.dex */
public final class TouchEventEntityCursor extends Cursor<TouchEventEntity> {

    /* renamed from: j */
    public static final TouchEventEntity_.C6729a f7608j = TouchEventEntity_.f7618c;

    /* renamed from: k */
    public static final int f7609k = TouchEventEntity_.f7621f.f13192c;

    /* renamed from: l */
    public static final int f7610l = TouchEventEntity_.f7622g.f13192c;

    /* renamed from: m */
    public static final int f7611m = TouchEventEntity_.f7623h.f13192c;

    /* renamed from: n */
    public static final int f7612n = TouchEventEntity_.f7624i.f13192c;

    /* renamed from: o */
    public static final int f7613o = TouchEventEntity_.f7625j.f13192c;

    /* renamed from: p */
    public static final int f7614p = TouchEventEntity_.f7626k.f13192c;

    /* renamed from: q */
    public static final int f7615q = TouchEventEntity_.f7627l.f13192c;

    /* renamed from: com.zykj.blackboard.core.data.dao.TouchEventEntityCursor$a */
    public static final class C6726a implements InterfaceC9047b {
        @Override // p225r8.InterfaceC9047b
        /* renamed from: a */
        public Cursor mo6269a(Transaction transaction, long j10, BoxStore boxStore) {
            return new TouchEventEntityCursor(transaction, j10, boxStore);
        }
    }

    public TouchEventEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, TouchEventEntity_.f7619d, boxStore);
    }

    /* renamed from: r */
    public final void m6594r(TouchEventEntity touchEventEntity) {
        touchEventEntity.__boxStore = this.f13185d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo6264i(TouchEventEntity touchEventEntity) {
        return f7608j.mo6279a(touchEventEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo6265p(TouchEventEntity touchEventEntity) {
        ToOne<TouchRecordEntity> toOne = touchEventEntity.record;
        if (toOne != null && toOne.m13069r()) {
            Cursor cursorM13003l = m13003l(TouchRecordEntity.class);
            try {
                toOne.m13068q(cursorM13003l);
            } finally {
                cursorM13003l.close();
            }
        }
        Cursor.collect002033(this.f13183b, 0L, 1, f7615q, touchEventEntity.record.m13066m(), f7610l, touchEventEntity.getColor(), f7609k, touchEventEntity.getWidth(), f7611m, touchEventEntity.getSpacing(), f7612n, touchEventEntity.getItemLength(), 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        long jCollect313311 = Cursor.collect313311(this.f13183b, touchEventEntity.getId(), 2, 0, null, 0, null, 0, null, 0, null, f7613o, touchEventEntity.getStyle(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, f7614p, touchEventEntity.getTextSize(), 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        touchEventEntity.m6593k(jCollect313311);
        m6594r(touchEventEntity);
        m12997a(touchEventEntity.touchInfoList, TouchInfoEntity.class);
        return jCollect313311;
    }
}
