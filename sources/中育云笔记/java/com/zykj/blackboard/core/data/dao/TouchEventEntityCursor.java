package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.TouchEventEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225kc.InterfaceC9909b;

/* loaded from: classes5.dex */
public final class TouchEventEntityCursor extends Cursor<TouchEventEntity> {

    /* renamed from: l */
    public static final TouchEventEntity_.C8426a f18451l = TouchEventEntity_.f18461e;

    /* renamed from: m */
    public static final int f18452m = TouchEventEntity_.f18464h.f22265e;

    /* renamed from: n */
    public static final int f18453n = TouchEventEntity_.f18465i.f22265e;

    /* renamed from: o */
    public static final int f18454o = TouchEventEntity_.f18466j.f22265e;

    /* renamed from: p */
    public static final int f18455p = TouchEventEntity_.f18467k.f22265e;

    /* renamed from: q */
    public static final int f18456q = TouchEventEntity_.f18468l.f22265e;

    /* renamed from: r */
    public static final int f18457r = TouchEventEntity_.f18469m.f22265e;

    /* renamed from: s */
    public static final int f18458s = TouchEventEntity_.f18470n.f22265e;

    /* renamed from: com.zykj.blackboard.core.data.dao.TouchEventEntityCursor$a */
    public static final class C8423a implements InterfaceC9909b {
        @Override // p225kc.InterfaceC9909b
        /* renamed from: a */
        public Cursor mo13991a(Transaction transaction, long j10, BoxStore boxStore) {
            return new TouchEventEntityCursor(transaction, j10, boxStore);
        }
    }

    public TouchEventEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, TouchEventEntity_.f18462f, boxStore);
    }

    /* renamed from: u */
    public final void m14325u(TouchEventEntity touchEventEntity) {
        touchEventEntity.__boxStore = this.f22258f;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final long mo13986i(TouchEventEntity touchEventEntity) {
        return f18451l.mo14001a(touchEventEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final long mo13987s(TouchEventEntity touchEventEntity) {
        ToOne<TouchRecordEntity> toOne = touchEventEntity.record;
        if (toOne != null && toOne.m19041m()) {
            Cursor cursorM18975l = m18975l(TouchRecordEntity.class);
            try {
                toOne.m19040k(cursorM18975l);
            } finally {
                cursorM18975l.close();
            }
        }
        Cursor.collect002033(this.f22256d, 0L, 1, f18458s, touchEventEntity.record.m19038f(), f18453n, touchEventEntity.m14314a(), f18452m, touchEventEntity.m14322i(), f18454o, touchEventEntity.m14318e(), f18455p, touchEventEntity.m14316c(), 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        long jCollect313311 = Cursor.collect313311(this.f22256d, touchEventEntity.m14315b(), 2, 0, null, 0, null, 0, null, 0, null, f18456q, touchEventEntity.m14319f(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, f18457r, touchEventEntity.m14320g(), 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        touchEventEntity.m14324k(jCollect313311);
        m14325u(touchEventEntity);
        m18968a(touchEventEntity.touchInfoList, TouchInfoEntity.class);
        return jCollect313311;
    }
}
