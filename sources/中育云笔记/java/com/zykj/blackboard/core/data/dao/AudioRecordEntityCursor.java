package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.AudioRecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225kc.InterfaceC9909b;

/* loaded from: classes5.dex */
public final class AudioRecordEntityCursor extends Cursor<AudioRecordEntity> {

    /* renamed from: l */
    public static final AudioRecordEntity_.C8339a f18036l = AudioRecordEntity_.f18042e;

    /* renamed from: m */
    public static final int f18037m = AudioRecordEntity_.f18045h.f22265e;

    /* renamed from: n */
    public static final int f18038n = AudioRecordEntity_.f18046i.f22265e;

    /* renamed from: o */
    public static final int f18039o = AudioRecordEntity_.f18047j.f22265e;

    /* renamed from: com.zykj.blackboard.core.data.dao.AudioRecordEntityCursor$a */
    public static final class C8336a implements InterfaceC9909b {
        @Override // p225kc.InterfaceC9909b
        /* renamed from: a */
        public Cursor mo13991a(Transaction transaction, long j10, BoxStore boxStore) {
            return new AudioRecordEntityCursor(transaction, j10, boxStore);
        }
    }

    public AudioRecordEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, AudioRecordEntity_.f18043f, boxStore);
    }

    /* renamed from: u */
    public final void m14010u(AudioRecordEntity audioRecordEntity) {
        audioRecordEntity.__boxStore = this.f22258f;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final long mo13986i(AudioRecordEntity audioRecordEntity) {
        return f18036l.mo14001a(audioRecordEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final long mo13987s(AudioRecordEntity audioRecordEntity) {
        ToOne<RecordEntity> toOne = audioRecordEntity.record;
        if (toOne != null && toOne.m19041m()) {
            Cursor cursorM18975l = m18975l(RecordEntity.class);
            try {
                toOne.m19040k(cursorM18975l);
            } finally {
                cursorM18975l.close();
            }
        }
        String strM14004b = audioRecordEntity.m14004b();
        int i10 = strM14004b != null ? f18037m : 0;
        String strM14006d = audioRecordEntity.m14006d();
        long jCollect313311 = Cursor.collect313311(this.f22256d, audioRecordEntity.m14005c(), 3, i10, strM14004b, strM14006d != null ? f18038n : 0, strM14006d, 0, null, 0, null, f18039o, audioRecordEntity.record.m19038f(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        audioRecordEntity.m14008f(jCollect313311);
        m14010u(audioRecordEntity);
        m18968a(audioRecordEntity.audioInfoEntity, AudioInfoEntity.class);
        return jCollect313311;
    }
}
