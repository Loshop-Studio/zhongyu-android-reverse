package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.BlackBoardEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import p225kc.InterfaceC9909b;

/* loaded from: classes5.dex */
public final class BlackBoardEntityCursor extends Cursor<BlackBoardEntity> {

    /* renamed from: l */
    public static final BlackBoardEntity_.C8347a f18092l = BlackBoardEntity_.f18096e;

    /* renamed from: m */
    public static final int f18093m = BlackBoardEntity_.f18099h.f22265e;

    /* renamed from: com.zykj.blackboard.core.data.dao.BlackBoardEntityCursor$a */
    public static final class C8344a implements InterfaceC9909b {
        @Override // p225kc.InterfaceC9909b
        /* renamed from: a */
        public Cursor mo13991a(Transaction transaction, long j10, BoxStore boxStore) {
            return new BlackBoardEntityCursor(transaction, j10, boxStore);
        }
    }

    public BlackBoardEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, BlackBoardEntity_.f18097f, boxStore);
    }

    /* renamed from: u */
    public final void m14045u(BlackBoardEntity blackBoardEntity) {
        blackBoardEntity.__boxStore = this.f22258f;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final long mo13986i(BlackBoardEntity blackBoardEntity) {
        return f18092l.mo14001a(blackBoardEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final long mo13987s(BlackBoardEntity blackBoardEntity) {
        String strM14039a = blackBoardEntity.m14039a();
        long jCollect313311 = Cursor.collect313311(this.f22256d, blackBoardEntity.m14040b(), 3, strM14039a != null ? f18093m : 0, strM14039a, 0, null, 0, null, 0, null, 0, 0L, 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        blackBoardEntity.m14044f(jCollect313311);
        m14045u(blackBoardEntity);
        m18968a(blackBoardEntity.pages, PageEntity.class);
        return jCollect313311;
    }
}
