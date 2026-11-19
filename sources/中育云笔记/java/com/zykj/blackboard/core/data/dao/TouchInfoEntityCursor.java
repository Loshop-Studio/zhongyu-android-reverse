package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.TouchInfoEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225kc.InterfaceC9909b;

/* loaded from: classes5.dex */
public final class TouchInfoEntityCursor extends Cursor<TouchInfoEntity> {

    /* renamed from: l */
    public static final TouchInfoEntity_.C8429a f18478l = TouchInfoEntity_.f18485e;

    /* renamed from: m */
    public static final int f18479m = TouchInfoEntity_.f18488h.f22265e;

    /* renamed from: n */
    public static final int f18480n = TouchInfoEntity_.f18489i.f22265e;

    /* renamed from: o */
    public static final int f18481o = TouchInfoEntity_.f18490j.f22265e;

    /* renamed from: p */
    public static final int f18482p = TouchInfoEntity_.f18491k.f22265e;

    /* renamed from: com.zykj.blackboard.core.data.dao.TouchInfoEntityCursor$a */
    public static final class C8427a implements InterfaceC9909b {
        @Override // p225kc.InterfaceC9909b
        /* renamed from: a */
        public Cursor mo13991a(Transaction transaction, long j10, BoxStore boxStore) {
            return new TouchInfoEntityCursor(transaction, j10, boxStore);
        }
    }

    public TouchInfoEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, TouchInfoEntity_.f18486f, boxStore);
    }

    /* renamed from: u */
    public final void m14338u(TouchInfoEntity touchInfoEntity) {
        touchInfoEntity.__boxStore = this.f22258f;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final long mo13986i(TouchInfoEntity touchInfoEntity) {
        return f18478l.mo14001a(touchInfoEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final long mo13987s(TouchInfoEntity touchInfoEntity) {
        ToOne<TouchEventEntity> toOne = touchInfoEntity.record;
        if (toOne != null && toOne.m19041m()) {
            Cursor cursorM18975l = m18975l(TouchEventEntity.class);
            try {
                toOne.m19040k(cursorM18975l);
            } finally {
                cursorM18975l.close();
            }
        }
        long jCollect002033 = Cursor.collect002033(this.f22256d, touchInfoEntity.m14332b(), 3, f18479m, touchInfoEntity.m14331a(), f18482p, touchInfoEntity.record.m19038f(), f18480n, touchInfoEntity.m14334d(), f18481o, touchInfoEntity.m14335e(), 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        touchInfoEntity.m14337g(jCollect002033);
        m14338u(touchInfoEntity);
        return jCollect002033;
    }
}
