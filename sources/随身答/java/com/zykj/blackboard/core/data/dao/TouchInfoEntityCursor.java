package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.TouchInfoEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p037c8.InterfaceC5267b;

/* loaded from: classes4.dex */
public final class TouchInfoEntityCursor extends Cursor<TouchInfoEntity> {

    /* renamed from: j */
    public static final TouchInfoEntity_.C7049a f8917j = TouchInfoEntity_.f8924c;

    /* renamed from: k */
    public static final int f8918k = TouchInfoEntity_.f8927f.f14006c;

    /* renamed from: l */
    public static final int f8919l = TouchInfoEntity_.f8928g.f14006c;

    /* renamed from: m */
    public static final int f8920m = TouchInfoEntity_.f8929h.f14006c;

    /* renamed from: n */
    public static final int f8921n = TouchInfoEntity_.f8930i.f14006c;

    /* renamed from: com.zykj.blackboard.core.data.dao.TouchInfoEntityCursor$a */
    public static final class C7047a implements InterfaceC5267b {
        @Override // p037c8.InterfaceC5267b
        /* renamed from: a */
        public Cursor mo2405a(Transaction transaction, long j9, BoxStore boxStore) {
            return new TouchInfoEntityCursor(transaction, j9, boxStore);
        }
    }

    public TouchInfoEntityCursor(Transaction transaction, long j9, BoxStore boxStore) {
        super(transaction, j9, TouchInfoEntity_.f8925d, boxStore);
    }

    /* renamed from: r */
    public final void m7710r(TouchInfoEntity touchInfoEntity) {
        touchInfoEntity.__boxStore = this.f13999d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo7358i(TouchInfoEntity touchInfoEntity) {
        return f8917j.mo2406a(touchInfoEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo7359p(TouchInfoEntity touchInfoEntity) {
        ToOne<TouchEventEntity> toOne = touchInfoEntity.record;
        if (toOne != null && toOne.m13188u()) {
            Cursor cursorM13123l = m13123l(TouchEventEntity.class);
            try {
                toOne.m13187t(cursorM13123l);
            } finally {
                cursorM13123l.close();
            }
        }
        long jCollect002033 = Cursor.collect002033(this.f13997b, touchInfoEntity.getId(), 3, f8918k, touchInfoEntity.getEventTime(), f8921n, touchInfoEntity.record.m13185n(), f8919l, touchInfoEntity.getX(), f8920m, touchInfoEntity.getY(), 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        touchInfoEntity.m7709g(jCollect002033);
        m7710r(touchInfoEntity);
        return jCollect002033;
    }
}
