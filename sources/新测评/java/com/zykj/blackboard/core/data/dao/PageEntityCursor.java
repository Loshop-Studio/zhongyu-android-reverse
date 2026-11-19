package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.PageEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225r8.InterfaceC9047b;

/* loaded from: classes4.dex */
public final class PageEntityCursor extends Cursor<PageEntity> {

    /* renamed from: j */
    public static final PageEntity_.C6701a f7524j = PageEntity_.f7534c;

    /* renamed from: k */
    public static final int f7525k = PageEntity_.f7537f.f13192c;

    /* renamed from: l */
    public static final int f7526l = PageEntity_.f7538g.f13192c;

    /* renamed from: m */
    public static final int f7527m = PageEntity_.f7539h.f13192c;

    /* renamed from: n */
    public static final int f7528n = PageEntity_.f7540i.f13192c;

    /* renamed from: o */
    public static final int f7529o = PageEntity_.f7541j.f13192c;

    /* renamed from: p */
    public static final int f7530p = PageEntity_.f7542k.f13192c;

    /* renamed from: q */
    public static final int f7531q = PageEntity_.f7543l.f13192c;

    /* renamed from: com.zykj.blackboard.core.data.dao.PageEntityCursor$a */
    public static final class C6697a implements InterfaceC9047b {
        @Override // p225r8.InterfaceC9047b
        /* renamed from: a */
        public Cursor mo6269a(Transaction transaction, long j10, BoxStore boxStore) {
            return new PageEntityCursor(transaction, j10, boxStore);
        }
    }

    public PageEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, PageEntity_.f7535d, boxStore);
    }

    /* renamed from: r */
    public final void m6520r(PageEntity pageEntity) {
        pageEntity.__boxStore = this.f13185d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo6264i(PageEntity pageEntity) {
        return f7524j.mo6279a(pageEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo6265p(PageEntity pageEntity) {
        ToOne<BlackBoardEntity> toOne = pageEntity.blackBoardEntity;
        if (toOne != null && toOne.m13069r()) {
            Cursor cursorM13003l = m13003l(BlackBoardEntity.class);
            try {
                toOne.m13068q(cursorM13003l);
                cursorM13003l.close();
            } finally {
            }
        }
        ToOne<RecordEntity> toOne2 = pageEntity.recordEntity;
        if (toOne2 != null && toOne2.m13069r()) {
            Cursor cursorM13003l2 = m13003l(RecordEntity.class);
            try {
                toOne2.m13068q(cursorM13003l2);
                cursorM13003l2.close();
            } finally {
            }
        }
        ToOne<HeaderEntity> toOne3 = pageEntity.headerEntity;
        if (toOne3 != null && toOne3.m13069r()) {
            try {
                toOne3.m13068q(m13003l(HeaderEntity.class));
            } finally {
            }
        }
        String dirName = pageEntity.getDirName();
        int i10 = dirName != null ? f7525k : 0;
        String commandFileName = pageEntity.getCommandFileName();
        long jCollect313311 = Cursor.collect313311(this.f13183b, pageEntity.getId(), 3, i10, dirName, commandFileName != null ? f7527m : 0, commandFileName, 0, null, 0, null, f7529o, pageEntity.blackBoardEntity.m13066m(), f7530p, pageEntity.recordEntity.m13066m(), f7531q, pageEntity.headerEntity.m13066m(), f7528n, pageEntity.getCommandIndex(), f7526l, pageEntity.getIsChange() ? 1 : 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        pageEntity.m6519m(jCollect313311);
        m6520r(pageEntity);
        return jCollect313311;
    }
}
