package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.BlackBoardEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import p225r8.InterfaceC9047b;

/* loaded from: classes4.dex */
public final class BlackBoardEntityCursor extends Cursor<BlackBoardEntity> {

    /* renamed from: j */
    public static final BlackBoardEntity_.C6650a f7249j = BlackBoardEntity_.f7253c;

    /* renamed from: k */
    public static final int f7250k = BlackBoardEntity_.f7256f.f13192c;

    /* renamed from: com.zykj.blackboard.core.data.dao.BlackBoardEntityCursor$a */
    public static final class C6647a implements InterfaceC9047b {
        @Override // p225r8.InterfaceC9047b
        /* renamed from: a */
        public Cursor mo6269a(Transaction transaction, long j10, BoxStore boxStore) {
            return new BlackBoardEntityCursor(transaction, j10, boxStore);
        }
    }

    public BlackBoardEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, BlackBoardEntity_.f7254d, boxStore);
    }

    /* renamed from: r */
    public final void m6321r(BlackBoardEntity blackBoardEntity) {
        blackBoardEntity.__boxStore = this.f13185d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo6264i(BlackBoardEntity blackBoardEntity) {
        return f7249j.mo6279a(blackBoardEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo6265p(BlackBoardEntity blackBoardEntity) {
        String dir = blackBoardEntity.getDir();
        long jCollect313311 = Cursor.collect313311(this.f13183b, blackBoardEntity.getId(), 3, dir != null ? f7250k : 0, dir, 0, null, 0, null, 0, null, 0, 0L, 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        blackBoardEntity.m6320e(jCollect313311);
        m6321r(blackBoardEntity);
        m12997a(blackBoardEntity.pages, PageEntity.class);
        return jCollect313311;
    }
}
