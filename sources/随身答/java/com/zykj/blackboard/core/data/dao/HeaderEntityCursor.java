package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.HeaderEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p037c8.InterfaceC5267b;

/* loaded from: classes4.dex */
public final class HeaderEntityCursor extends Cursor<HeaderEntity> {

    /* renamed from: j */
    public static final HeaderEntity_.C7000a f8678j = HeaderEntity_.f8696c;

    /* renamed from: k */
    public static final int f8679k = HeaderEntity_.f8699f.f14006c;

    /* renamed from: l */
    public static final int f8680l = HeaderEntity_.f8700g.f14006c;

    /* renamed from: m */
    public static final int f8681m = HeaderEntity_.f8701h.f14006c;

    /* renamed from: n */
    public static final int f8682n = HeaderEntity_.f8702i.f14006c;

    /* renamed from: o */
    public static final int f8683o = HeaderEntity_.f8703j.f14006c;

    /* renamed from: p */
    public static final int f8684p = HeaderEntity_.f8704k.f14006c;

    /* renamed from: q */
    public static final int f8685q = HeaderEntity_.f8705l.f14006c;

    /* renamed from: r */
    public static final int f8686r = HeaderEntity_.f8706m.f14006c;

    /* renamed from: s */
    public static final int f8687s = HeaderEntity_.f8707n.f14006c;

    /* renamed from: t */
    public static final int f8688t = HeaderEntity_.f8708o.f14006c;

    /* renamed from: u */
    public static final int f8689u = HeaderEntity_.f8709p.f14006c;

    /* renamed from: v */
    public static final int f8690v = HeaderEntity_.f8710q.f14006c;

    /* renamed from: w */
    public static final int f8691w = HeaderEntity_.f8711r.f14006c;

    /* renamed from: x */
    public static final int f8692x = HeaderEntity_.f8712s.f14006c;

    /* renamed from: com.zykj.blackboard.core.data.dao.HeaderEntityCursor$a */
    public static final class C6993a implements InterfaceC5267b {
        @Override // p037c8.InterfaceC5267b
        /* renamed from: a */
        public Cursor mo2405a(Transaction transaction, long j9, BoxStore boxStore) {
            return new HeaderEntityCursor(transaction, j9, boxStore);
        }
    }

    public HeaderEntityCursor(Transaction transaction, long j9, BoxStore boxStore) {
        super(transaction, j9, HeaderEntity_.f8697d, boxStore);
    }

    /* renamed from: r */
    public final void m7542r(HeaderEntity headerEntity) {
        headerEntity.__boxStore = this.f13999d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo7358i(HeaderEntity headerEntity) {
        return f8678j.mo2406a(headerEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo7359p(HeaderEntity headerEntity) {
        Cursor cursorM13123l;
        ToOne<PageEntity> toOne = headerEntity.page;
        if (toOne != null && toOne.m13188u()) {
            cursorM13123l = m13123l(PageEntity.class);
            try {
                toOne.m13187t(cursorM13123l);
                cursorM13123l.close();
            } finally {
            }
        }
        ToOne<BackgroundLineConfigEntity> toOne2 = headerEntity.defaultBackgroundLineConfig;
        if (toOne2 != null && toOne2.m13188u()) {
            cursorM13123l = m13123l(BackgroundLineConfigEntity.class);
            try {
                toOne2.m13187t(cursorM13123l);
                cursorM13123l.close();
            } finally {
            }
        }
        ToOne<BackgroundLineConfigEntity> toOne3 = headerEntity.lastBackgroundLineConfig;
        if (toOne3 != null && toOne3.m13188u()) {
            cursorM13123l = m13123l(BackgroundLineConfigEntity.class);
            try {
                toOne3.m13187t(cursorM13123l);
                cursorM13123l.close();
            } finally {
            }
        }
        ToOne<AuthorEntity> toOne4 = headerEntity.author;
        if (toOne4 != null && toOne4.m13188u()) {
            cursorM13123l = m13123l(AuthorEntity.class);
            try {
                toOne4.m13187t(cursorM13123l);
                cursorM13123l.close();
            } finally {
            }
        }
        ToOne<MoveConfigEntity> toOne5 = headerEntity.moveConfig;
        if (toOne5 != null && toOne5.m13188u()) {
            try {
                toOne5.m13187t(m13123l(MoveConfigEntity.class));
            } finally {
            }
        }
        String convertUrl = headerEntity.getConvertUrl();
        Cursor.collect313311(this.f13997b, 0L, 1, convertUrl != null ? f8685q : 0, convertUrl, 0, null, 0, null, 0, null, f8682n, headerEntity.getCreateDate(), f8683o, headerEntity.getUpdateDate(), f8684p, headerEntity.getDuration(), f8679k, headerEntity.getVersion(), f8680l, headerEntity.getWidth(), f8681m, headerEntity.getHeight(), 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        Cursor.collect313311(this.f13997b, 0L, 0, 0, null, 0, null, 0, null, 0, null, f8688t, headerEntity.page.m13185n(), f8689u, headerEntity.defaultBackgroundLineConfig.m13185n(), f8690v, headerEntity.lastBackgroundLineConfig.m13185n(), f8686r, headerEntity.getDefaultBackgroundColor(), f8687s, headerEntity.getLastBackgroundColor(), 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        long jCollect313311 = Cursor.collect313311(this.f13997b, headerEntity.getId(), 2, 0, null, 0, null, 0, null, 0, null, f8691w, headerEntity.author.m13185n(), f8692x, headerEntity.moveConfig.m13185n(), 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        headerEntity.m7538v(jCollect313311);
        m7542r(headerEntity);
        m13117a(headerEntity.provider, AuthorEntity.class);
        return jCollect313311;
    }
}
