package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.BlackBoardEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import p037c8.InterfaceC5267b;

/* loaded from: classes4.dex */
public final class BlackBoardEntityCursor extends Cursor<BlackBoardEntity> {

    /* renamed from: j */
    public static final BlackBoardEntity_.C6967a f8531j = BlackBoardEntity_.f8535c;

    /* renamed from: k */
    public static final int f8532k = BlackBoardEntity_.f8538f.f14006c;

    /* renamed from: com.zykj.blackboard.core.data.dao.BlackBoardEntityCursor$a */
    public static final class C6964a implements InterfaceC5267b {
        @Override // p037c8.InterfaceC5267b
        /* renamed from: a */
        public Cursor mo2405a(Transaction transaction, long j9, BoxStore boxStore) {
            return new BlackBoardEntityCursor(transaction, j9, boxStore);
        }
    }

    public BlackBoardEntityCursor(Transaction transaction, long j9, BoxStore boxStore) {
        super(transaction, j9, BlackBoardEntity_.f8536d, boxStore);
    }

    /* renamed from: r */
    public final void m7418r(BlackBoardEntity blackBoardEntity) {
        blackBoardEntity.__boxStore = this.f13999d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo7358i(BlackBoardEntity blackBoardEntity) {
        return f8531j.mo2406a(blackBoardEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo7359p(BlackBoardEntity blackBoardEntity) {
        String dir = blackBoardEntity.getDir();
        long jCollect313311 = Cursor.collect313311(this.f13997b, blackBoardEntity.getId(), 3, dir != null ? f8532k : 0, dir, 0, null, 0, null, 0, null, 0, 0L, 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        blackBoardEntity.m7417e(jCollect313311);
        m7418r(blackBoardEntity);
        m13117a(blackBoardEntity.pages, PageEntity.class);
        return jCollect313311;
    }
}
