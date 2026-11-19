package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.AudioRecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225r8.InterfaceC9047b;

/* loaded from: classes4.dex */
public final class AudioRecordEntityCursor extends Cursor<AudioRecordEntity> {

    /* renamed from: j */
    public static final AudioRecordEntity_.C6642a f7193j = AudioRecordEntity_.f7199c;

    /* renamed from: k */
    public static final int f7194k = AudioRecordEntity_.f7202f.f13192c;

    /* renamed from: l */
    public static final int f7195l = AudioRecordEntity_.f7203g.f13192c;

    /* renamed from: m */
    public static final int f7196m = AudioRecordEntity_.f7204h.f13192c;

    /* renamed from: com.zykj.blackboard.core.data.dao.AudioRecordEntityCursor$a */
    public static final class C6639a implements InterfaceC9047b {
        @Override // p225r8.InterfaceC9047b
        /* renamed from: a */
        public Cursor mo6269a(Transaction transaction, long j10, BoxStore boxStore) {
            return new AudioRecordEntityCursor(transaction, j10, boxStore);
        }
    }

    public AudioRecordEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, AudioRecordEntity_.f7200d, boxStore);
    }

    /* renamed from: r */
    public final void m6287r(AudioRecordEntity audioRecordEntity) {
        audioRecordEntity.__boxStore = this.f13185d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo6264i(AudioRecordEntity audioRecordEntity) {
        return f7193j.mo6279a(audioRecordEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo6265p(AudioRecordEntity audioRecordEntity) {
        ToOne<RecordEntity> toOne = audioRecordEntity.record;
        if (toOne != null && toOne.m13069r()) {
            Cursor cursorM13003l = m13003l(RecordEntity.class);
            try {
                toOne.m13068q(cursorM13003l);
            } finally {
                cursorM13003l.close();
            }
        }
        String fileName = audioRecordEntity.getFileName();
        int i10 = fileName != null ? f7194k : 0;
        String validate = audioRecordEntity.getValidate();
        long jCollect313311 = Cursor.collect313311(this.f13183b, audioRecordEntity.getId(), 3, i10, fileName, validate != null ? f7195l : 0, validate, 0, null, 0, null, f7196m, audioRecordEntity.record.m13066m(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        audioRecordEntity.m6286f(jCollect313311);
        m6287r(audioRecordEntity);
        m12997a(audioRecordEntity.audioInfoEntity, AudioInfoEntity.class);
        return jCollect313311;
    }
}
