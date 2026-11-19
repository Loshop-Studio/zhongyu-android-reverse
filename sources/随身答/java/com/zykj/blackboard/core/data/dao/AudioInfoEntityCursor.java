package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.AudioInfoEntity_;
import com.zykj.board.EzyCommandEnum;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p037c8.InterfaceC5267b;

/* loaded from: classes4.dex */
public final class AudioInfoEntityCursor extends Cursor<AudioInfoEntity> {

    /* renamed from: k */
    public static final AudioInfoEntity_.C6955a f8452k = AudioInfoEntity_.f8462c;

    /* renamed from: l */
    public static final int f8453l = AudioInfoEntity_.f8465f.f14006c;

    /* renamed from: m */
    public static final int f8454m = AudioInfoEntity_.f8466g.f14006c;

    /* renamed from: n */
    public static final int f8455n = AudioInfoEntity_.f8467h.f14006c;

    /* renamed from: o */
    public static final int f8456o = AudioInfoEntity_.f8468i.f14006c;

    /* renamed from: p */
    public static final int f8457p = AudioInfoEntity_.f8469j.f14006c;

    /* renamed from: q */
    public static final int f8458q = AudioInfoEntity_.f8470k.f14006c;

    /* renamed from: j */
    public final CommandEnumConverter f8459j;

    /* renamed from: com.zykj.blackboard.core.data.dao.AudioInfoEntityCursor$a */
    public static final class C6953a implements InterfaceC5267b {
        @Override // p037c8.InterfaceC5267b
        /* renamed from: a */
        public Cursor mo2405a(Transaction transaction, long j9, BoxStore boxStore) {
            return new AudioInfoEntityCursor(transaction, j9, boxStore);
        }
    }

    public AudioInfoEntityCursor(Transaction transaction, long j9, BoxStore boxStore) {
        super(transaction, j9, AudioInfoEntity_.f8463d, boxStore);
        this.f8459j = new CommandEnumConverter();
    }

    /* renamed from: r */
    public final void m7360r(AudioInfoEntity audioInfoEntity) {
        audioInfoEntity.__boxStore = this.f13999d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo7358i(AudioInfoEntity audioInfoEntity) {
        return f8452k.mo2406a(audioInfoEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo7359p(AudioInfoEntity audioInfoEntity) {
        ToOne<AudioRecordEntity> toOne = audioInfoEntity.record;
        if (toOne != null && toOne.m13188u()) {
            Cursor cursorM13123l = m13123l(AudioRecordEntity.class);
            try {
                toOne.m13187t(cursorM13123l);
            } finally {
                cursorM13123l.close();
            }
        }
        byte[] data = audioInfoEntity.getData();
        int i9 = data != null ? f8457p : 0;
        EzyCommandEnum.CommandEnum commandEnum = audioInfoEntity.getCommandEnum();
        int i10 = commandEnum != null ? f8456o : 0;
        long jCollect313311 = Cursor.collect313311(this.f13997b, audioInfoEntity.getId(), 3, 0, null, 0, null, 0, null, i9, data, f8453l, audioInfoEntity.getDelayTime(), f8454m, audioInfoEntity.getDuration(), f8458q, audioInfoEntity.record.m13185n(), i10, i10 != 0 ? this.f8459j.convertToDatabaseValue(commandEnum).intValue() : 0, f8455n, audioInfoEntity.getIsPlay() ? 1 : 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        audioInfoEntity.m7357k(jCollect313311);
        m7360r(audioInfoEntity);
        return jCollect313311;
    }
}
