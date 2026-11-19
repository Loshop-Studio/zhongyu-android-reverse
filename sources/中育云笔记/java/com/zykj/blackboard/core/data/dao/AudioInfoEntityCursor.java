package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.AudioInfoEntity_;
import com.zykj.board.EzyCommandEnum;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225kc.InterfaceC9909b;

/* loaded from: classes5.dex */
public final class AudioInfoEntityCursor extends Cursor<AudioInfoEntity> {

    /* renamed from: m */
    public static final AudioInfoEntity_.C8335a f18013m = AudioInfoEntity_.f18023e;

    /* renamed from: n */
    public static final int f18014n = AudioInfoEntity_.f18026h.f22265e;

    /* renamed from: o */
    public static final int f18015o = AudioInfoEntity_.f18027i.f22265e;

    /* renamed from: p */
    public static final int f18016p = AudioInfoEntity_.f18028j.f22265e;

    /* renamed from: q */
    public static final int f18017q = AudioInfoEntity_.f18029k.f22265e;

    /* renamed from: r */
    public static final int f18018r = AudioInfoEntity_.f18030l.f22265e;

    /* renamed from: s */
    public static final int f18019s = AudioInfoEntity_.f18031m.f22265e;

    /* renamed from: l */
    public final CommandEnumConverter f18020l;

    /* renamed from: com.zykj.blackboard.core.data.dao.AudioInfoEntityCursor$a */
    public static final class C8333a implements InterfaceC9909b {
        @Override // p225kc.InterfaceC9909b
        /* renamed from: a */
        public Cursor mo13991a(Transaction transaction, long j10, BoxStore boxStore) {
            return new AudioInfoEntityCursor(transaction, j10, boxStore);
        }
    }

    public AudioInfoEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, AudioInfoEntity_.f18024f, boxStore);
        this.f18020l = new CommandEnumConverter();
    }

    /* renamed from: u */
    public final void m13988u(AudioInfoEntity audioInfoEntity) {
        audioInfoEntity.__boxStore = this.f22258f;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final long mo13986i(AudioInfoEntity audioInfoEntity) {
        return f18013m.mo14001a(audioInfoEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final long mo13987s(AudioInfoEntity audioInfoEntity) {
        ToOne<AudioRecordEntity> toOne = audioInfoEntity.record;
        if (toOne != null && toOne.m19041m()) {
            Cursor cursorM18975l = m18975l(AudioRecordEntity.class);
            try {
                toOne.m19040k(cursorM18975l);
            } finally {
                cursorM18975l.close();
            }
        }
        byte[] bArrM13976b = audioInfoEntity.m13976b();
        int i10 = bArrM13976b != null ? f18018r : 0;
        EzyCommandEnum.CommandEnum commandEnumM13975a = audioInfoEntity.m13975a();
        int i11 = commandEnumM13975a != null ? f18017q : 0;
        long jCollect313311 = Cursor.collect313311(this.f22256d, audioInfoEntity.m13979e(), 3, 0, null, 0, null, 0, null, i10, bArrM13976b, f18014n, audioInfoEntity.m13977c(), f18015o, audioInfoEntity.m13978d(), f18019s, audioInfoEntity.record.m19038f(), i11, i11 != 0 ? this.f18020l.convertToDatabaseValue(commandEnumM13975a).intValue() : 0, f18016p, audioInfoEntity.m13981g() ? 1 : 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        audioInfoEntity.m13985k(jCollect313311);
        m13988u(audioInfoEntity);
        return jCollect313311;
    }
}
