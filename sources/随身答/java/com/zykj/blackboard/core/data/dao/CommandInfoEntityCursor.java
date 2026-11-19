package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity_;
import com.zykj.board.EzyCommandEnum;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p037c8.InterfaceC5267b;

/* loaded from: classes4.dex */
public final class CommandInfoEntityCursor extends Cursor<CommandInfoEntity> {

    /* renamed from: k */
    public static final CommandInfoEntity_.C6970a f8543k = CommandInfoEntity_.f8553c;

    /* renamed from: l */
    public static final int f8544l = CommandInfoEntity_.f8556f.f14006c;

    /* renamed from: m */
    public static final int f8545m = CommandInfoEntity_.f8557g.f14006c;

    /* renamed from: n */
    public static final int f8546n = CommandInfoEntity_.f8558h.f14006c;

    /* renamed from: o */
    public static final int f8547o = CommandInfoEntity_.f8559i.f14006c;

    /* renamed from: p */
    public static final int f8548p = CommandInfoEntity_.f8560j.f14006c;

    /* renamed from: q */
    public static final int f8549q = CommandInfoEntity_.f8561k.f14006c;

    /* renamed from: j */
    public final CommandEnumConverter f8550j;

    /* renamed from: com.zykj.blackboard.core.data.dao.CommandInfoEntityCursor$a */
    public static final class C6968a implements InterfaceC5267b {
        @Override // p037c8.InterfaceC5267b
        /* renamed from: a */
        public Cursor mo2405a(Transaction transaction, long j9, BoxStore boxStore) {
            return new CommandInfoEntityCursor(transaction, j9, boxStore);
        }
    }

    public CommandInfoEntityCursor(Transaction transaction, long j9, BoxStore boxStore) {
        super(transaction, j9, CommandInfoEntity_.f8554d, boxStore);
        this.f8550j = new CommandEnumConverter();
    }

    /* renamed from: r */
    public final void m7433r(CommandInfoEntity commandInfoEntity) {
        commandInfoEntity.__boxStore = this.f13999d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo7358i(CommandInfoEntity commandInfoEntity) {
        return f8543k.mo2406a(commandInfoEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo7359p(CommandInfoEntity commandInfoEntity) {
        ToOne<CommandRecordEntity> toOne = commandInfoEntity.record;
        if (toOne != null && toOne.m13188u()) {
            Cursor cursorM13123l = m13123l(CommandRecordEntity.class);
            try {
                toOne.m13187t(cursorM13123l);
            } finally {
                cursorM13123l.close();
            }
        }
        byte[] data = commandInfoEntity.getData();
        int i9 = data != null ? f8548p : 0;
        EzyCommandEnum.CommandEnum commandEnum = commandInfoEntity.getCommandEnum();
        int i10 = commandEnum != null ? f8547o : 0;
        long jCollect313311 = Cursor.collect313311(this.f13997b, commandInfoEntity.getId(), 3, 0, null, 0, null, 0, null, i9, data, f8544l, commandInfoEntity.getDelayTime(), f8545m, commandInfoEntity.getDuration(), f8549q, commandInfoEntity.record.m13185n(), i10, i10 != 0 ? this.f8550j.convertToDatabaseValue(commandEnum).intValue() : 0, f8546n, commandInfoEntity.getIsPlay() ? 1 : 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        commandInfoEntity.m7432i(jCollect313311);
        m7433r(commandInfoEntity);
        return jCollect313311;
    }
}
