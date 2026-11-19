package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.PageEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225kc.InterfaceC9909b;

/* loaded from: classes5.dex */
public final class PageEntityCursor extends Cursor<PageEntity> {

    /* renamed from: l */
    public static final PageEntity_.C8398a f18367l = PageEntity_.f18377e;

    /* renamed from: m */
    public static final int f18368m = PageEntity_.f18380h.f22265e;

    /* renamed from: n */
    public static final int f18369n = PageEntity_.f18381i.f22265e;

    /* renamed from: o */
    public static final int f18370o = PageEntity_.f18382j.f22265e;

    /* renamed from: p */
    public static final int f18371p = PageEntity_.f18383k.f22265e;

    /* renamed from: q */
    public static final int f18372q = PageEntity_.f18384l.f22265e;

    /* renamed from: r */
    public static final int f18373r = PageEntity_.f18385m.f22265e;

    /* renamed from: s */
    public static final int f18374s = PageEntity_.f18386n.f22265e;

    /* renamed from: com.zykj.blackboard.core.data.dao.PageEntityCursor$a */
    public static final class C8394a implements InterfaceC9909b {
        @Override // p225kc.InterfaceC9909b
        /* renamed from: a */
        public Cursor mo13991a(Transaction transaction, long j10, BoxStore boxStore) {
            return new PageEntityCursor(transaction, j10, boxStore);
        }
    }

    public PageEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, PageEntity_.f18378f, boxStore);
    }

    /* renamed from: u */
    public final void m14250u(PageEntity pageEntity) {
        pageEntity.__boxStore = this.f22258f;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final long mo13986i(PageEntity pageEntity) {
        return f18367l.mo14001a(pageEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final long mo13987s(PageEntity pageEntity) {
        ToOne<BlackBoardEntity> toOne = pageEntity.blackBoardEntity;
        if (toOne != null && toOne.m19041m()) {
            Cursor cursorM18975l = m18975l(BlackBoardEntity.class);
            try {
                toOne.m19040k(cursorM18975l);
                cursorM18975l.close();
            } finally {
            }
        }
        ToOne<RecordEntity> toOne2 = pageEntity.recordEntity;
        if (toOne2 != null && toOne2.m19041m()) {
            Cursor cursorM18975l2 = m18975l(RecordEntity.class);
            try {
                toOne2.m19040k(cursorM18975l2);
                cursorM18975l2.close();
            } finally {
            }
        }
        ToOne<HeaderEntity> toOne3 = pageEntity.headerEntity;
        if (toOne3 != null && toOne3.m19041m()) {
            try {
                toOne3.m19040k(m18975l(HeaderEntity.class));
            } finally {
            }
        }
        String strM14239d = pageEntity.m14239d();
        int i10 = strM14239d != null ? f18368m : 0;
        String strM14237b = pageEntity.m14237b();
        long jCollect313311 = Cursor.collect313311(this.f22256d, pageEntity.m14241f(), 3, i10, strM14239d, strM14237b != null ? f18370o : 0, strM14237b, 0, null, 0, null, f18372q, pageEntity.blackBoardEntity.m19038f(), f18373r, pageEntity.recordEntity.m19038f(), f18374s, pageEntity.headerEntity.m19038f(), f18371p, pageEntity.m14238c(), f18369n, pageEntity.m14243h() ? 1 : 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        pageEntity.m14249n(jCollect313311);
        m14250u(pageEntity);
        return jCollect313311;
    }
}
