package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.BackgroundLineConfigEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import p225kc.InterfaceC9909b;

/* loaded from: classes5.dex */
public final class BackgroundLineConfigEntityCursor extends Cursor<BackgroundLineConfigEntity> {

    /* renamed from: m */
    public static final BackgroundLineConfigEntity_.C8343a f18074m = BackgroundLineConfigEntity_.f18082e;

    /* renamed from: n */
    public static final int f18075n = BackgroundLineConfigEntity_.f18085h.f22265e;

    /* renamed from: o */
    public static final int f18076o = BackgroundLineConfigEntity_.f18086i.f22265e;

    /* renamed from: p */
    public static final int f18077p = BackgroundLineConfigEntity_.f18087j.f22265e;

    /* renamed from: q */
    public static final int f18078q = BackgroundLineConfigEntity_.f18088k.f22265e;

    /* renamed from: l */
    public final BackgroundLineTypeEnumConverter f18079l;

    /* renamed from: com.zykj.blackboard.core.data.dao.BackgroundLineConfigEntityCursor$a */
    public static final class C8342a implements InterfaceC9909b {
        @Override // p225kc.InterfaceC9909b
        /* renamed from: a */
        public Cursor mo13991a(Transaction transaction, long j10, BoxStore boxStore) {
            return new BackgroundLineConfigEntityCursor(transaction, j10, boxStore);
        }
    }

    public BackgroundLineConfigEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, BackgroundLineConfigEntity_.f18083f, boxStore);
        this.f18079l = new BackgroundLineTypeEnumConverter();
    }

    @Override // io.objectbox.Cursor
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final long mo13986i(BackgroundLineConfigEntity backgroundLineConfigEntity) {
        return f18074m.mo14001a(backgroundLineConfigEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final long mo13987s(BackgroundLineConfigEntity backgroundLineConfigEntity) {
        int i10 = backgroundLineConfigEntity.m14032d() != null ? f18077p : 0;
        long jCollect002033 = Cursor.collect002033(this.f22256d, backgroundLineConfigEntity.m14029a(), 3, f18075n, backgroundLineConfigEntity.m14030b(), i10, i10 != 0 ? this.f18079l.convertToDatabaseValue(r1).intValue() : 0L, f18076o, backgroundLineConfigEntity.m14031c(), f18078q, backgroundLineConfigEntity.m14033e(), 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        backgroundLineConfigEntity.m14035g(jCollect002033);
        return jCollect002033;
    }
}
