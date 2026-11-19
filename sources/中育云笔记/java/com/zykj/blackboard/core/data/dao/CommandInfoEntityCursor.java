package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity_;
import com.zykj.board.EzyCommandEnum;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225kc.InterfaceC9909b;

/* loaded from: classes5.dex */
public final class CommandInfoEntityCursor extends Cursor<CommandInfoEntity> {

    /* renamed from: m */
    public static final CommandInfoEntity_.C8350a f18104m = CommandInfoEntity_.f18114e;

    /* renamed from: n */
    public static final int f18105n = CommandInfoEntity_.f18117h.f22265e;

    /* renamed from: o */
    public static final int f18106o = CommandInfoEntity_.f18118i.f22265e;

    /* renamed from: p */
    public static final int f18107p = CommandInfoEntity_.f18119j.f22265e;

    /* renamed from: q */
    public static final int f18108q = CommandInfoEntity_.f18120k.f22265e;

    /* renamed from: r */
    public static final int f18109r = CommandInfoEntity_.f18121l.f22265e;

    /* renamed from: s */
    public static final int f18110s = CommandInfoEntity_.f18122m.f22265e;

    /* renamed from: l */
    public final CommandEnumConverter f18111l;

    /* renamed from: com.zykj.blackboard.core.data.dao.CommandInfoEntityCursor$a */
    public static final class C8348a implements InterfaceC9909b {
        @Override // p225kc.InterfaceC9909b
        /* renamed from: a */
        public Cursor mo13991a(Transaction transaction, long j10, BoxStore boxStore) {
            return new CommandInfoEntityCursor(transaction, j10, boxStore);
        }
    }

    public CommandInfoEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, CommandInfoEntity_.f18115f, boxStore);
        this.f18111l = new CommandEnumConverter();
    }

    /* renamed from: u */
    public final void m14060u(CommandInfoEntity commandInfoEntity) {
        commandInfoEntity.__boxStore = this.f22258f;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final long mo13986i(CommandInfoEntity commandInfoEntity) {
        return f18104m.mo14001a(commandInfoEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final long mo13987s(CommandInfoEntity commandInfoEntity) {
        ToOne<CommandRecordEntity> toOne = commandInfoEntity.record;
        if (toOne != null && toOne.m19041m()) {
            Cursor cursorM18975l = m18975l(CommandRecordEntity.class);
            try {
                toOne.m19040k(cursorM18975l);
            } finally {
                cursorM18975l.close();
            }
        }
        byte[] bArrM14052b = commandInfoEntity.m14052b();
        int i10 = bArrM14052b != null ? f18109r : 0;
        EzyCommandEnum.CommandEnum commandEnumM14051a = commandInfoEntity.m14051a();
        int i11 = commandEnumM14051a != null ? f18108q : 0;
        long jCollect313311 = Cursor.collect313311(this.f22256d, commandInfoEntity.m14055e(), 3, 0, null, 0, null, 0, null, i10, bArrM14052b, f18105n, commandInfoEntity.m14053c(), f18106o, commandInfoEntity.m14054d(), f18110s, commandInfoEntity.record.m19038f(), i11, i11 != 0 ? this.f18111l.convertToDatabaseValue(commandEnumM14051a).intValue() : 0, f18107p, commandInfoEntity.m14057g() ? 1 : 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        commandInfoEntity.m14059i(jCollect313311);
        m14060u(commandInfoEntity);
        return jCollect313311;
    }
}
