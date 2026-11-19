package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity_;
import com.zykj.board.EzyCommandEnum;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225r8.InterfaceC9047b;

/* loaded from: classes4.dex */
public final class CommandInfoEntityCursor extends Cursor<CommandInfoEntity> {

    /* renamed from: k */
    public static final CommandInfoEntity_.C6653a f7261k = CommandInfoEntity_.f7271c;

    /* renamed from: l */
    public static final int f7262l = CommandInfoEntity_.f7274f.f13192c;

    /* renamed from: m */
    public static final int f7263m = CommandInfoEntity_.f7275g.f13192c;

    /* renamed from: n */
    public static final int f7264n = CommandInfoEntity_.f7276h.f13192c;

    /* renamed from: o */
    public static final int f7265o = CommandInfoEntity_.f7277i.f13192c;

    /* renamed from: p */
    public static final int f7266p = CommandInfoEntity_.f7278j.f13192c;

    /* renamed from: q */
    public static final int f7267q = CommandInfoEntity_.f7279k.f13192c;

    /* renamed from: j */
    public final CommandEnumConverter f7268j;

    /* renamed from: com.zykj.blackboard.core.data.dao.CommandInfoEntityCursor$a */
    public static final class C6651a implements InterfaceC9047b {
        @Override // p225r8.InterfaceC9047b
        /* renamed from: a */
        public Cursor mo6269a(Transaction transaction, long j10, BoxStore boxStore) {
            return new CommandInfoEntityCursor(transaction, j10, boxStore);
        }
    }

    public CommandInfoEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, CommandInfoEntity_.f7272d, boxStore);
        this.f7268j = new CommandEnumConverter();
    }

    /* renamed from: r */
    public final void m6336r(CommandInfoEntity commandInfoEntity) {
        commandInfoEntity.__boxStore = this.f13185d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo6264i(CommandInfoEntity commandInfoEntity) {
        return f7261k.mo6279a(commandInfoEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo6265p(CommandInfoEntity commandInfoEntity) {
        ToOne<CommandRecordEntity> toOne = commandInfoEntity.record;
        if (toOne != null && toOne.m13069r()) {
            Cursor cursorM13003l = m13003l(CommandRecordEntity.class);
            try {
                toOne.m13068q(cursorM13003l);
            } finally {
                cursorM13003l.close();
            }
        }
        byte[] data = commandInfoEntity.getData();
        int i10 = data != null ? f7266p : 0;
        EzyCommandEnum.CommandEnum commandEnum = commandInfoEntity.getCommandEnum();
        int i11 = commandEnum != null ? f7265o : 0;
        long jCollect313311 = Cursor.collect313311(this.f13183b, commandInfoEntity.getId(), 3, 0, null, 0, null, 0, null, i10, data, f7262l, commandInfoEntity.getDelayTime(), f7263m, commandInfoEntity.getDuration(), f7267q, commandInfoEntity.record.m13066m(), i11, i11 != 0 ? this.f7268j.convertToDatabaseValue(commandEnum).intValue() : 0, f7264n, commandInfoEntity.getIsPlay() ? 1 : 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        commandInfoEntity.m6335i(jCollect313311);
        m6336r(commandInfoEntity);
        return jCollect313311;
    }
}
