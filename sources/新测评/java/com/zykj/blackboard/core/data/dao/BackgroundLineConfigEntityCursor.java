package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.BackgroundLineConfigEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import p225r8.InterfaceC9047b;

/* loaded from: classes4.dex */
public final class BackgroundLineConfigEntityCursor extends Cursor<BackgroundLineConfigEntity> {

    /* renamed from: k */
    public static final BackgroundLineConfigEntity_.C6646a f7231k = BackgroundLineConfigEntity_.f7239c;

    /* renamed from: l */
    public static final int f7232l = BackgroundLineConfigEntity_.f7242f.f13192c;

    /* renamed from: m */
    public static final int f7233m = BackgroundLineConfigEntity_.f7243g.f13192c;

    /* renamed from: n */
    public static final int f7234n = BackgroundLineConfigEntity_.f7244h.f13192c;

    /* renamed from: o */
    public static final int f7235o = BackgroundLineConfigEntity_.f7245i.f13192c;

    /* renamed from: j */
    public final BackgroundLineTypeEnumConverter f7236j;

    /* renamed from: com.zykj.blackboard.core.data.dao.BackgroundLineConfigEntityCursor$a */
    public static final class C6645a implements InterfaceC9047b {
        @Override // p225r8.InterfaceC9047b
        /* renamed from: a */
        public Cursor mo6269a(Transaction transaction, long j10, BoxStore boxStore) {
            return new BackgroundLineConfigEntityCursor(transaction, j10, boxStore);
        }
    }

    public BackgroundLineConfigEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, BackgroundLineConfigEntity_.f7240d, boxStore);
        this.f7236j = new BackgroundLineTypeEnumConverter();
    }

    @Override // io.objectbox.Cursor
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final long mo6264i(BackgroundLineConfigEntity backgroundLineConfigEntity) {
        return f7231k.mo6279a(backgroundLineConfigEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo6265p(BackgroundLineConfigEntity backgroundLineConfigEntity) {
        int i10 = backgroundLineConfigEntity.getLineType() != null ? f7234n : 0;
        long jCollect002033 = Cursor.collect002033(this.f13183b, backgroundLineConfigEntity.getId(), 3, f7232l, backgroundLineConfigEntity.getLineColor(), i10, i10 != 0 ? this.f7236j.convertToDatabaseValue(r1).intValue() : 0L, f7233m, backgroundLineConfigEntity.getLineSpace(), f7235o, backgroundLineConfigEntity.getLineWidth(), 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        backgroundLineConfigEntity.m6312g(jCollect002033);
        return jCollect002033;
    }
}
