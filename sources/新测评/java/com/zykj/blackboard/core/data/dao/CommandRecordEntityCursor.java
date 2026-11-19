package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.CommandRecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225r8.InterfaceC9047b;

/* loaded from: classes4.dex */
public final class CommandRecordEntityCursor extends Cursor<CommandRecordEntity> {

    /* renamed from: j */
    public static final CommandRecordEntity_.C6657a f7284j = CommandRecordEntity_.f7290c;

    /* renamed from: k */
    public static final int f7285k = CommandRecordEntity_.f7293f.f13192c;

    /* renamed from: l */
    public static final int f7286l = CommandRecordEntity_.f7294g.f13192c;

    /* renamed from: m */
    public static final int f7287m = CommandRecordEntity_.f7295h.f13192c;

    /* renamed from: com.zykj.blackboard.core.data.dao.CommandRecordEntityCursor$a */
    public static final class C6654a implements InterfaceC9047b {
        @Override // p225r8.InterfaceC9047b
        /* renamed from: a */
        public Cursor mo6269a(Transaction transaction, long j10, BoxStore boxStore) {
            return new CommandRecordEntityCursor(transaction, j10, boxStore);
        }
    }

    public CommandRecordEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, CommandRecordEntity_.f7291d, boxStore);
    }

    /* renamed from: r */
    public final void m6347r(CommandRecordEntity commandRecordEntity) {
        commandRecordEntity.__boxStore = this.f13185d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo6264i(CommandRecordEntity commandRecordEntity) {
        return f7284j.mo6279a(commandRecordEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo6265p(CommandRecordEntity commandRecordEntity) {
        ToOne<RecordEntity> toOne = commandRecordEntity.record;
        if (toOne != null && toOne.m13069r()) {
            Cursor cursorM13003l = m13003l(RecordEntity.class);
            try {
                toOne.m13068q(cursorM13003l);
            } finally {
                cursorM13003l.close();
            }
        }
        String fileName = commandRecordEntity.getFileName();
        int i10 = fileName != null ? f7285k : 0;
        String validate = commandRecordEntity.getValidate();
        long jCollect313311 = Cursor.collect313311(this.f13183b, commandRecordEntity.getId(), 3, i10, fileName, validate != null ? f7286l : 0, validate, 0, null, 0, null, f7287m, commandRecordEntity.record.m13066m(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        commandRecordEntity.m6346f(jCollect313311);
        m6347r(commandRecordEntity);
        m12997a(commandRecordEntity.commandInfoEntity, CommandInfoEntity.class);
        return jCollect313311;
    }
}
