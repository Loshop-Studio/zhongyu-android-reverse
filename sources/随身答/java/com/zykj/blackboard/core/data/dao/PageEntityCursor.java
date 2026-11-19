package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.PageEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p037c8.InterfaceC5267b;

/* loaded from: classes4.dex */
public final class PageEntityCursor extends Cursor<PageEntity> {

    /* renamed from: j */
    public static final PageEntity_.C7018a f8806j = PageEntity_.f8816c;

    /* renamed from: k */
    public static final int f8807k = PageEntity_.f8819f.f14006c;

    /* renamed from: l */
    public static final int f8808l = PageEntity_.f8820g.f14006c;

    /* renamed from: m */
    public static final int f8809m = PageEntity_.f8821h.f14006c;

    /* renamed from: n */
    public static final int f8810n = PageEntity_.f8822i.f14006c;

    /* renamed from: o */
    public static final int f8811o = PageEntity_.f8823j.f14006c;

    /* renamed from: p */
    public static final int f8812p = PageEntity_.f8824k.f14006c;

    /* renamed from: q */
    public static final int f8813q = PageEntity_.f8825l.f14006c;

    /* renamed from: com.zykj.blackboard.core.data.dao.PageEntityCursor$a */
    public static final class C7014a implements InterfaceC5267b {
        @Override // p037c8.InterfaceC5267b
        /* renamed from: a */
        public Cursor mo2405a(Transaction transaction, long j9, BoxStore boxStore) {
            return new PageEntityCursor(transaction, j9, boxStore);
        }
    }

    public PageEntityCursor(Transaction transaction, long j9, BoxStore boxStore) {
        super(transaction, j9, PageEntity_.f8817d, boxStore);
    }

    /* renamed from: r */
    public final void m7622r(PageEntity pageEntity) {
        pageEntity.__boxStore = this.f13999d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo7358i(PageEntity pageEntity) {
        return f8806j.mo2406a(pageEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo7359p(PageEntity pageEntity) {
        ToOne<BlackBoardEntity> toOne = pageEntity.blackBoardEntity;
        if (toOne != null && toOne.m13188u()) {
            Cursor cursorM13123l = m13123l(BlackBoardEntity.class);
            try {
                toOne.m13187t(cursorM13123l);
                cursorM13123l.close();
            } finally {
            }
        }
        ToOne<RecordEntity> toOne2 = pageEntity.recordEntity;
        if (toOne2 != null && toOne2.m13188u()) {
            Cursor cursorM13123l2 = m13123l(RecordEntity.class);
            try {
                toOne2.m13187t(cursorM13123l2);
                cursorM13123l2.close();
            } finally {
            }
        }
        ToOne<HeaderEntity> toOne3 = pageEntity.headerEntity;
        if (toOne3 != null && toOne3.m13188u()) {
            try {
                toOne3.m13187t(m13123l(HeaderEntity.class));
            } finally {
            }
        }
        String dirName = pageEntity.getDirName();
        int i9 = dirName != null ? f8807k : 0;
        String commandFileName = pageEntity.getCommandFileName();
        long jCollect313311 = Cursor.collect313311(this.f13997b, pageEntity.getId(), 3, i9, dirName, commandFileName != null ? f8809m : 0, commandFileName, 0, null, 0, null, f8811o, pageEntity.blackBoardEntity.m13185n(), f8812p, pageEntity.recordEntity.m13185n(), f8813q, pageEntity.headerEntity.m13185n(), f8810n, pageEntity.getCommandIndex(), f8808l, pageEntity.getIsChange() ? 1 : 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        pageEntity.m7621m(jCollect313311);
        m7622r(pageEntity);
        return jCollect313311;
    }
}
