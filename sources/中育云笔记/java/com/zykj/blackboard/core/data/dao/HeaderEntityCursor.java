package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.HeaderEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225kc.InterfaceC9909b;

/* loaded from: classes5.dex */
public final class HeaderEntityCursor extends Cursor<HeaderEntity> {

    /* renamed from: l */
    public static final HeaderEntity_.C8380a f18239l = HeaderEntity_.f18259e;

    /* renamed from: m */
    public static final int f18240m = HeaderEntity_.f18262h.f22265e;

    /* renamed from: n */
    public static final int f18241n = HeaderEntity_.f18263i.f22265e;

    /* renamed from: o */
    public static final int f18242o = HeaderEntity_.f18264j.f22265e;

    /* renamed from: p */
    public static final int f18243p = HeaderEntity_.f18265k.f22265e;

    /* renamed from: q */
    public static final int f18244q = HeaderEntity_.f18266l.f22265e;

    /* renamed from: r */
    public static final int f18245r = HeaderEntity_.f18267m.f22265e;

    /* renamed from: s */
    public static final int f18246s = HeaderEntity_.f18268n.f22265e;

    /* renamed from: t */
    public static final int f18247t = HeaderEntity_.f18269o.f22265e;

    /* renamed from: u */
    public static final int f18248u = HeaderEntity_.f18270p.f22265e;

    /* renamed from: v */
    public static final int f18249v = HeaderEntity_.f18271q.f22265e;

    /* renamed from: w */
    public static final int f18250w = HeaderEntity_.f18272r.f22265e;

    /* renamed from: x */
    public static final int f18251x = HeaderEntity_.f18273s.f22265e;

    /* renamed from: y */
    public static final int f18252y = HeaderEntity_.f18274t.f22265e;

    /* renamed from: z */
    public static final int f18253z = HeaderEntity_.f18275u.f22265e;

    /* renamed from: com.zykj.blackboard.core.data.dao.HeaderEntityCursor$a */
    public static final class C8373a implements InterfaceC9909b {
        @Override // p225kc.InterfaceC9909b
        /* renamed from: a */
        public Cursor mo13991a(Transaction transaction, long j10, BoxStore boxStore) {
            return new HeaderEntityCursor(transaction, j10, boxStore);
        }
    }

    public HeaderEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, HeaderEntity_.f18260f, boxStore);
    }

    /* renamed from: u */
    public final void m14169u(HeaderEntity headerEntity) {
        headerEntity.__boxStore = this.f22258f;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final long mo13986i(HeaderEntity headerEntity) {
        return f18239l.mo14001a(headerEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final long mo13987s(HeaderEntity headerEntity) {
        Cursor cursorM18975l;
        ToOne<PageEntity> toOne = headerEntity.page;
        if (toOne != null && toOne.m19041m()) {
            cursorM18975l = m18975l(PageEntity.class);
            try {
                toOne.m19040k(cursorM18975l);
                cursorM18975l.close();
            } finally {
            }
        }
        ToOne<BackgroundLineConfigEntity> toOne2 = headerEntity.defaultBackgroundLineConfig;
        if (toOne2 != null && toOne2.m19041m()) {
            cursorM18975l = m18975l(BackgroundLineConfigEntity.class);
            try {
                toOne2.m19040k(cursorM18975l);
                cursorM18975l.close();
            } finally {
            }
        }
        ToOne<BackgroundLineConfigEntity> toOne3 = headerEntity.lastBackgroundLineConfig;
        if (toOne3 != null && toOne3.m19041m()) {
            cursorM18975l = m18975l(BackgroundLineConfigEntity.class);
            try {
                toOne3.m19040k(cursorM18975l);
                cursorM18975l.close();
            } finally {
            }
        }
        ToOne<AuthorEntity> toOne4 = headerEntity.author;
        if (toOne4 != null && toOne4.m19041m()) {
            cursorM18975l = m18975l(AuthorEntity.class);
            try {
                toOne4.m19040k(cursorM18975l);
                cursorM18975l.close();
            } finally {
            }
        }
        ToOne<MoveConfigEntity> toOne5 = headerEntity.moveConfig;
        if (toOne5 != null && toOne5.m19041m()) {
            try {
                toOne5.m19040k(m18975l(MoveConfigEntity.class));
            } finally {
            }
        }
        String strM14145b = headerEntity.m14145b();
        Cursor.collect313311(this.f22256d, 0L, 1, strM14145b != null ? f18246s : 0, strM14145b, 0, null, 0, null, 0, null, f18243p, headerEntity.m14146c(), f18244q, headerEntity.m14157n(), f18245r, headerEntity.m14149f(), f18240m, headerEntity.m14158o(), f18241n, headerEntity.m14159p(), f18242o, headerEntity.m14150g(), 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        Cursor.collect313311(this.f22256d, 0L, 0, 0, null, 0, null, 0, null, 0, null, f18249v, headerEntity.page.m19038f(), f18250w, headerEntity.defaultBackgroundLineConfig.m19038f(), f18251x, headerEntity.lastBackgroundLineConfig.m19038f(), f18247t, headerEntity.m14147d(), f18248u, headerEntity.m14152i(), 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        long jCollect313311 = Cursor.collect313311(this.f22256d, headerEntity.m14151h(), 2, 0, null, 0, null, 0, null, 0, null, f18252y, headerEntity.author.m19038f(), f18253z, headerEntity.moveConfig.m19038f(), 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        headerEntity.m14165v(jCollect313311);
        m14169u(headerEntity);
        m18968a(headerEntity.provider, AuthorEntity.class);
        return jCollect313311;
    }
}
