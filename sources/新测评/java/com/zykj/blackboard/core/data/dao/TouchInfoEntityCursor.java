package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.TouchInfoEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225r8.InterfaceC9047b;

/* loaded from: classes4.dex */
public final class TouchInfoEntityCursor extends Cursor<TouchInfoEntity> {

    /* renamed from: j */
    public static final TouchInfoEntity_.C6732a f7635j = TouchInfoEntity_.f7642c;

    /* renamed from: k */
    public static final int f7636k = TouchInfoEntity_.f7645f.f13192c;

    /* renamed from: l */
    public static final int f7637l = TouchInfoEntity_.f7646g.f13192c;

    /* renamed from: m */
    public static final int f7638m = TouchInfoEntity_.f7647h.f13192c;

    /* renamed from: n */
    public static final int f7639n = TouchInfoEntity_.f7648i.f13192c;

    /* renamed from: com.zykj.blackboard.core.data.dao.TouchInfoEntityCursor$a */
    public static final class C6730a implements InterfaceC9047b {
        @Override // p225r8.InterfaceC9047b
        /* renamed from: a */
        public Cursor mo6269a(Transaction transaction, long j10, BoxStore boxStore) {
            return new TouchInfoEntityCursor(transaction, j10, boxStore);
        }
    }

    public TouchInfoEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, TouchInfoEntity_.f7643d, boxStore);
    }

    /* renamed from: r */
    public final void m6607r(TouchInfoEntity touchInfoEntity) {
        touchInfoEntity.__boxStore = this.f13185d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo6264i(TouchInfoEntity touchInfoEntity) {
        return f7635j.mo6279a(touchInfoEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo6265p(TouchInfoEntity touchInfoEntity) {
        ToOne<TouchEventEntity> toOne = touchInfoEntity.record;
        if (toOne != null && toOne.m13069r()) {
            Cursor cursorM13003l = m13003l(TouchEventEntity.class);
            try {
                toOne.m13068q(cursorM13003l);
            } finally {
                cursorM13003l.close();
            }
        }
        long jCollect002033 = Cursor.collect002033(this.f13183b, touchInfoEntity.getId(), 3, f7636k, touchInfoEntity.getEventTime(), f7639n, touchInfoEntity.record.m13066m(), f7637l, touchInfoEntity.getX(), f7638m, touchInfoEntity.getY(), 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        touchInfoEntity.m6606g(jCollect002033);
        m6607r(touchInfoEntity);
        return jCollect002033;
    }
}
