package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.HeaderEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225r8.InterfaceC9047b;

/* loaded from: classes4.dex */
public final class HeaderEntityCursor extends Cursor<HeaderEntity> {

    /* renamed from: j */
    public static final HeaderEntity_.C6683a f7396j = HeaderEntity_.f7414c;

    /* renamed from: k */
    public static final int f7397k = HeaderEntity_.f7417f.f13192c;

    /* renamed from: l */
    public static final int f7398l = HeaderEntity_.f7418g.f13192c;

    /* renamed from: m */
    public static final int f7399m = HeaderEntity_.f7419h.f13192c;

    /* renamed from: n */
    public static final int f7400n = HeaderEntity_.f7420i.f13192c;

    /* renamed from: o */
    public static final int f7401o = HeaderEntity_.f7421j.f13192c;

    /* renamed from: p */
    public static final int f7402p = HeaderEntity_.f7422k.f13192c;

    /* renamed from: q */
    public static final int f7403q = HeaderEntity_.f7423l.f13192c;

    /* renamed from: r */
    public static final int f7404r = HeaderEntity_.f7424m.f13192c;

    /* renamed from: s */
    public static final int f7405s = HeaderEntity_.f7425n.f13192c;

    /* renamed from: t */
    public static final int f7406t = HeaderEntity_.f7426o.f13192c;

    /* renamed from: u */
    public static final int f7407u = HeaderEntity_.f7427p.f13192c;

    /* renamed from: v */
    public static final int f7408v = HeaderEntity_.f7428q.f13192c;

    /* renamed from: w */
    public static final int f7409w = HeaderEntity_.f7429r.f13192c;

    /* renamed from: x */
    public static final int f7410x = HeaderEntity_.f7430s.f13192c;

    /* renamed from: com.zykj.blackboard.core.data.dao.HeaderEntityCursor$a */
    public static final class C6676a implements InterfaceC9047b {
        @Override // p225r8.InterfaceC9047b
        /* renamed from: a */
        public Cursor mo6269a(Transaction transaction, long j10, BoxStore boxStore) {
            return new HeaderEntityCursor(transaction, j10, boxStore);
        }
    }

    public HeaderEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, HeaderEntity_.f7415d, boxStore);
    }

    /* renamed from: r */
    public final void m6441r(HeaderEntity headerEntity) {
        headerEntity.__boxStore = this.f13185d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo6264i(HeaderEntity headerEntity) {
        return f7396j.mo6279a(headerEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo6265p(HeaderEntity headerEntity) {
        Cursor cursorM13003l;
        ToOne<PageEntity> toOne = headerEntity.page;
        if (toOne != null && toOne.m13069r()) {
            cursorM13003l = m13003l(PageEntity.class);
            try {
                toOne.m13068q(cursorM13003l);
                cursorM13003l.close();
            } finally {
            }
        }
        ToOne<BackgroundLineConfigEntity> toOne2 = headerEntity.defaultBackgroundLineConfig;
        if (toOne2 != null && toOne2.m13069r()) {
            cursorM13003l = m13003l(BackgroundLineConfigEntity.class);
            try {
                toOne2.m13068q(cursorM13003l);
                cursorM13003l.close();
            } finally {
            }
        }
        ToOne<BackgroundLineConfigEntity> toOne3 = headerEntity.lastBackgroundLineConfig;
        if (toOne3 != null && toOne3.m13069r()) {
            cursorM13003l = m13003l(BackgroundLineConfigEntity.class);
            try {
                toOne3.m13068q(cursorM13003l);
                cursorM13003l.close();
            } finally {
            }
        }
        ToOne<AuthorEntity> toOne4 = headerEntity.author;
        if (toOne4 != null && toOne4.m13069r()) {
            cursorM13003l = m13003l(AuthorEntity.class);
            try {
                toOne4.m13068q(cursorM13003l);
                cursorM13003l.close();
            } finally {
            }
        }
        ToOne<MoveConfigEntity> toOne5 = headerEntity.moveConfig;
        if (toOne5 != null && toOne5.m13069r()) {
            try {
                toOne5.m13068q(m13003l(MoveConfigEntity.class));
            } finally {
            }
        }
        String convertUrl = headerEntity.getConvertUrl();
        Cursor.collect313311(this.f13183b, 0L, 1, convertUrl != null ? f7403q : 0, convertUrl, 0, null, 0, null, 0, null, f7400n, headerEntity.getCreateDate(), f7401o, headerEntity.getUpdateDate(), f7402p, headerEntity.getDuration(), f7397k, headerEntity.getVersion(), f7398l, headerEntity.getWidth(), f7399m, headerEntity.getHeight(), 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        Cursor.collect313311(this.f13183b, 0L, 0, 0, null, 0, null, 0, null, 0, null, f7406t, headerEntity.page.m13066m(), f7407u, headerEntity.defaultBackgroundLineConfig.m13066m(), f7408v, headerEntity.lastBackgroundLineConfig.m13066m(), f7404r, headerEntity.getDefaultBackgroundColor(), f7405s, headerEntity.getLastBackgroundColor(), 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        long jCollect313311 = Cursor.collect313311(this.f13183b, headerEntity.getId(), 2, 0, null, 0, null, 0, null, 0, null, f7409w, headerEntity.author.m13066m(), f7410x, headerEntity.moveConfig.m13066m(), 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        headerEntity.m6438v(jCollect313311);
        m6441r(headerEntity);
        m12997a(headerEntity.provider, AuthorEntity.class);
        return jCollect313311;
    }
}
