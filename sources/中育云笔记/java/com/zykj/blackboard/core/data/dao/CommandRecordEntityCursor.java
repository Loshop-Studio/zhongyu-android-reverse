package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.CommandRecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225kc.InterfaceC9909b;

/* loaded from: classes5.dex */
public final class CommandRecordEntityCursor extends Cursor<CommandRecordEntity> {

    /* renamed from: l */
    public static final CommandRecordEntity_.C8354a f18127l = CommandRecordEntity_.f18133e;

    /* renamed from: m */
    public static final int f18128m = CommandRecordEntity_.f18136h.f22265e;

    /* renamed from: n */
    public static final int f18129n = CommandRecordEntity_.f18137i.f22265e;

    /* renamed from: o */
    public static final int f18130o = CommandRecordEntity_.f18138j.f22265e;

    /* renamed from: com.zykj.blackboard.core.data.dao.CommandRecordEntityCursor$a */
    public static final class C8351a implements InterfaceC9909b {
        @Override // p225kc.InterfaceC9909b
        /* renamed from: a */
        public Cursor mo13991a(Transaction transaction, long j10, BoxStore boxStore) {
            return new CommandRecordEntityCursor(transaction, j10, boxStore);
        }
    }

    public CommandRecordEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, CommandRecordEntity_.f18134f, boxStore);
    }

    /* renamed from: u */
    public final void m14072u(CommandRecordEntity commandRecordEntity) {
        commandRecordEntity.__boxStore = this.f22258f;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final long mo13986i(CommandRecordEntity commandRecordEntity) {
        return f18127l.mo14001a(commandRecordEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final long mo13987s(CommandRecordEntity commandRecordEntity) {
        ToOne<RecordEntity> toOne = commandRecordEntity.record;
        if (toOne != null && toOne.m19041m()) {
            Cursor cursorM18975l = m18975l(RecordEntity.class);
            try {
                toOne.m19040k(cursorM18975l);
            } finally {
                cursorM18975l.close();
            }
        }
        String strM14066b = commandRecordEntity.m14066b();
        int i10 = strM14066b != null ? f18128m : 0;
        String strM14068d = commandRecordEntity.m14068d();
        long jCollect313311 = Cursor.collect313311(this.f22256d, commandRecordEntity.m14067c(), 3, i10, strM14066b, strM14068d != null ? f18129n : 0, strM14068d, 0, null, 0, null, f18130o, commandRecordEntity.record.m19038f(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        commandRecordEntity.m14070f(jCollect313311);
        m14072u(commandRecordEntity);
        m18968a(commandRecordEntity.commandInfoEntity, CommandInfoEntity.class);
        return jCollect313311;
    }
}
