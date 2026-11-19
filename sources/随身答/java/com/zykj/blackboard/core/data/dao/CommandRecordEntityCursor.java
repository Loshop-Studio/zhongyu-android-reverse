package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.CommandRecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p037c8.InterfaceC5267b;

/* loaded from: classes4.dex */
public final class CommandRecordEntityCursor extends Cursor<CommandRecordEntity> {

    /* renamed from: j */
    public static final CommandRecordEntity_.C6974a f8566j = CommandRecordEntity_.f8572c;

    /* renamed from: k */
    public static final int f8567k = CommandRecordEntity_.f8575f.f14006c;

    /* renamed from: l */
    public static final int f8568l = CommandRecordEntity_.f8576g.f14006c;

    /* renamed from: m */
    public static final int f8569m = CommandRecordEntity_.f8577h.f14006c;

    /* renamed from: com.zykj.blackboard.core.data.dao.CommandRecordEntityCursor$a */
    public static final class C6971a implements InterfaceC5267b {
        @Override // p037c8.InterfaceC5267b
        /* renamed from: a */
        public Cursor mo2405a(Transaction transaction, long j9, BoxStore boxStore) {
            return new CommandRecordEntityCursor(transaction, j9, boxStore);
        }
    }

    public CommandRecordEntityCursor(Transaction transaction, long j9, BoxStore boxStore) {
        super(transaction, j9, CommandRecordEntity_.f8573d, boxStore);
    }

    /* renamed from: r */
    public final void m7445r(CommandRecordEntity commandRecordEntity) {
        commandRecordEntity.__boxStore = this.f13999d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo7358i(CommandRecordEntity commandRecordEntity) {
        return f8566j.mo2406a(commandRecordEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo7359p(CommandRecordEntity commandRecordEntity) {
        ToOne<RecordEntity> toOne = commandRecordEntity.record;
        if (toOne != null && toOne.m13188u()) {
            Cursor cursorM13123l = m13123l(RecordEntity.class);
            try {
                toOne.m13187t(cursorM13123l);
            } finally {
                cursorM13123l.close();
            }
        }
        String fileName = commandRecordEntity.getFileName();
        int i9 = fileName != null ? f8567k : 0;
        String validate = commandRecordEntity.getValidate();
        long jCollect313311 = Cursor.collect313311(this.f13997b, commandRecordEntity.getId(), 3, i9, fileName, validate != null ? f8568l : 0, validate, 0, null, 0, null, f8569m, commandRecordEntity.record.m13185n(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        commandRecordEntity.m7443f(jCollect313311);
        m7445r(commandRecordEntity);
        m13117a(commandRecordEntity.commandInfoEntity, CommandInfoEntity.class);
        return jCollect313311;
    }
}
