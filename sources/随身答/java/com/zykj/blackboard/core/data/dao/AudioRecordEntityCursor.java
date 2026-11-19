package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.AudioRecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p037c8.InterfaceC5267b;

/* loaded from: classes4.dex */
public final class AudioRecordEntityCursor extends Cursor<AudioRecordEntity> {

    /* renamed from: j */
    public static final AudioRecordEntity_.C6959a f8475j = AudioRecordEntity_.f8481c;

    /* renamed from: k */
    public static final int f8476k = AudioRecordEntity_.f8484f.f14006c;

    /* renamed from: l */
    public static final int f8477l = AudioRecordEntity_.f8485g.f14006c;

    /* renamed from: m */
    public static final int f8478m = AudioRecordEntity_.f8486h.f14006c;

    /* renamed from: com.zykj.blackboard.core.data.dao.AudioRecordEntityCursor$a */
    public static final class C6956a implements InterfaceC5267b {
        @Override // p037c8.InterfaceC5267b
        /* renamed from: a */
        public Cursor mo2405a(Transaction transaction, long j9, BoxStore boxStore) {
            return new AudioRecordEntityCursor(transaction, j9, boxStore);
        }
    }

    public AudioRecordEntityCursor(Transaction transaction, long j9, BoxStore boxStore) {
        super(transaction, j9, AudioRecordEntity_.f8482d, boxStore);
    }

    /* renamed from: r */
    public final void m7380r(AudioRecordEntity audioRecordEntity) {
        audioRecordEntity.__boxStore = this.f13999d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo7358i(AudioRecordEntity audioRecordEntity) {
        return f8475j.mo2406a(audioRecordEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo7359p(AudioRecordEntity audioRecordEntity) {
        ToOne<RecordEntity> toOne = audioRecordEntity.record;
        if (toOne != null && toOne.m13188u()) {
            Cursor cursorM13123l = m13123l(RecordEntity.class);
            try {
                toOne.m13187t(cursorM13123l);
            } finally {
                cursorM13123l.close();
            }
        }
        String fileName = audioRecordEntity.getFileName();
        int i9 = fileName != null ? f8476k : 0;
        String validate = audioRecordEntity.getValidate();
        long jCollect313311 = Cursor.collect313311(this.f13997b, audioRecordEntity.getId(), 3, i9, fileName, validate != null ? f8477l : 0, validate, 0, null, 0, null, f8478m, audioRecordEntity.record.m13185n(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        audioRecordEntity.m7378f(jCollect313311);
        m7380r(audioRecordEntity);
        m13117a(audioRecordEntity.audioInfoEntity, AudioInfoEntity.class);
        return jCollect313311;
    }
}
