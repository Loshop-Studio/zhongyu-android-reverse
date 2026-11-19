package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.AudioInfoEntity_;
import com.zykj.board.EzyCommandEnum;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225r8.InterfaceC9047b;

/* loaded from: classes4.dex */
public final class AudioInfoEntityCursor extends Cursor<AudioInfoEntity> {

    /* renamed from: k */
    public static final AudioInfoEntity_.C6638a f7170k = AudioInfoEntity_.f7180c;

    /* renamed from: l */
    public static final int f7171l = AudioInfoEntity_.f7183f.f13192c;

    /* renamed from: m */
    public static final int f7172m = AudioInfoEntity_.f7184g.f13192c;

    /* renamed from: n */
    public static final int f7173n = AudioInfoEntity_.f7185h.f13192c;

    /* renamed from: o */
    public static final int f7174o = AudioInfoEntity_.f7186i.f13192c;

    /* renamed from: p */
    public static final int f7175p = AudioInfoEntity_.f7187j.f13192c;

    /* renamed from: q */
    public static final int f7176q = AudioInfoEntity_.f7188k.f13192c;

    /* renamed from: j */
    public final CommandEnumConverter f7177j;

    /* renamed from: com.zykj.blackboard.core.data.dao.AudioInfoEntityCursor$a */
    public static final class C6636a implements InterfaceC9047b {
        @Override // p225r8.InterfaceC9047b
        /* renamed from: a */
        public Cursor mo6269a(Transaction transaction, long j10, BoxStore boxStore) {
            return new AudioInfoEntityCursor(transaction, j10, boxStore);
        }
    }

    public AudioInfoEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, AudioInfoEntity_.f7181d, boxStore);
        this.f7177j = new CommandEnumConverter();
    }

    /* renamed from: r */
    public final void m6266r(AudioInfoEntity audioInfoEntity) {
        audioInfoEntity.__boxStore = this.f13185d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo6264i(AudioInfoEntity audioInfoEntity) {
        return f7170k.mo6279a(audioInfoEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo6265p(AudioInfoEntity audioInfoEntity) {
        ToOne<AudioRecordEntity> toOne = audioInfoEntity.record;
        if (toOne != null && toOne.m13069r()) {
            Cursor cursorM13003l = m13003l(AudioRecordEntity.class);
            try {
                toOne.m13068q(cursorM13003l);
            } finally {
                cursorM13003l.close();
            }
        }
        byte[] data = audioInfoEntity.getData();
        int i10 = data != null ? f7175p : 0;
        EzyCommandEnum.CommandEnum commandEnum = audioInfoEntity.getCommandEnum();
        int i11 = commandEnum != null ? f7174o : 0;
        long jCollect313311 = Cursor.collect313311(this.f13183b, audioInfoEntity.getId(), 3, 0, null, 0, null, 0, null, i10, data, f7171l, audioInfoEntity.getDelayTime(), f7172m, audioInfoEntity.getDuration(), f7176q, audioInfoEntity.record.m13066m(), i11, i11 != 0 ? this.f7177j.convertToDatabaseValue(commandEnum).intValue() : 0, f7173n, audioInfoEntity.getIsPlay() ? 1 : 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        audioInfoEntity.m6263k(jCollect313311);
        m6266r(audioInfoEntity);
        return jCollect313311;
    }
}
