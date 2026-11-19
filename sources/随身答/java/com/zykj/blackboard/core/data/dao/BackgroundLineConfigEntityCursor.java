package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.BackgroundLineConfigEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import p037c8.InterfaceC5267b;

/* loaded from: classes4.dex */
public final class BackgroundLineConfigEntityCursor extends Cursor<BackgroundLineConfigEntity> {

    /* renamed from: k */
    public static final BackgroundLineConfigEntity_.C6963a f8513k = BackgroundLineConfigEntity_.f8521c;

    /* renamed from: l */
    public static final int f8514l = BackgroundLineConfigEntity_.f8524f.f14006c;

    /* renamed from: m */
    public static final int f8515m = BackgroundLineConfigEntity_.f8525g.f14006c;

    /* renamed from: n */
    public static final int f8516n = BackgroundLineConfigEntity_.f8526h.f14006c;

    /* renamed from: o */
    public static final int f8517o = BackgroundLineConfigEntity_.f8527i.f14006c;

    /* renamed from: j */
    public final BackgroundLineTypeEnumConverter f8518j;

    /* renamed from: com.zykj.blackboard.core.data.dao.BackgroundLineConfigEntityCursor$a */
    public static final class C6962a implements InterfaceC5267b {
        @Override // p037c8.InterfaceC5267b
        /* renamed from: a */
        public Cursor mo2405a(Transaction transaction, long j9, BoxStore boxStore) {
            return new BackgroundLineConfigEntityCursor(transaction, j9, boxStore);
        }
    }

    public BackgroundLineConfigEntityCursor(Transaction transaction, long j9, BoxStore boxStore) {
        super(transaction, j9, BackgroundLineConfigEntity_.f8522d, boxStore);
        this.f8518j = new BackgroundLineTypeEnumConverter();
    }

    @Override // io.objectbox.Cursor
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final long mo7358i(BackgroundLineConfigEntity backgroundLineConfigEntity) {
        return f8513k.mo2406a(backgroundLineConfigEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo7359p(BackgroundLineConfigEntity backgroundLineConfigEntity) {
        int i9 = backgroundLineConfigEntity.getLineType() != null ? f8516n : 0;
        long jCollect002033 = Cursor.collect002033(this.f13997b, backgroundLineConfigEntity.getId(), 3, f8514l, backgroundLineConfigEntity.getLineColor(), i9, i9 != 0 ? this.f8518j.convertToDatabaseValue(r1).intValue() : 0L, f8515m, backgroundLineConfigEntity.getLineSpace(), f8517o, backgroundLineConfigEntity.getLineWidth(), 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        backgroundLineConfigEntity.m7405g(jCollect002033);
        return jCollect002033;
    }
}
