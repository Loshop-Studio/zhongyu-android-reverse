package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.FileRecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225kc.InterfaceC9909b;

/* loaded from: classes5.dex */
public final class FileRecordEntityCursor extends Cursor<FileRecordEntity> {

    /* renamed from: l */
    public static final FileRecordEntity_.C8361a f18164l = FileRecordEntity_.f18170e;

    /* renamed from: m */
    public static final int f18165m = FileRecordEntity_.f18173h.f22265e;

    /* renamed from: n */
    public static final int f18166n = FileRecordEntity_.f18174i.f22265e;

    /* renamed from: o */
    public static final int f18167o = FileRecordEntity_.f18175j.f22265e;

    /* renamed from: com.zykj.blackboard.core.data.dao.FileRecordEntityCursor$a */
    public static final class C8358a implements InterfaceC9909b {
        @Override // p225kc.InterfaceC9909b
        /* renamed from: a */
        public Cursor mo13991a(Transaction transaction, long j10, BoxStore boxStore) {
            return new FileRecordEntityCursor(transaction, j10, boxStore);
        }
    }

    public FileRecordEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, FileRecordEntity_.f18171f, boxStore);
    }

    /* renamed from: u */
    public final void m14098u(FileRecordEntity fileRecordEntity) {
        fileRecordEntity.__boxStore = this.f22258f;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final long mo13986i(FileRecordEntity fileRecordEntity) {
        return f18164l.mo14001a(fileRecordEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final long mo13987s(FileRecordEntity fileRecordEntity) {
        ToOne<RecordEntity> toOne = fileRecordEntity.record;
        if (toOne != null && toOne.m19041m()) {
            Cursor cursorM18975l = m18975l(RecordEntity.class);
            try {
                toOne.m19040k(cursorM18975l);
            } finally {
                cursorM18975l.close();
            }
        }
        String strM14092b = fileRecordEntity.m14092b();
        int i10 = strM14092b != null ? f18165m : 0;
        String strM14094d = fileRecordEntity.m14094d();
        long jCollect313311 = Cursor.collect313311(this.f22256d, fileRecordEntity.m14093c(), 3, i10, strM14092b, strM14094d != null ? f18166n : 0, strM14094d, 0, null, 0, null, f18167o, fileRecordEntity.record.m19038f(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        fileRecordEntity.m14096f(jCollect313311);
        m14098u(fileRecordEntity);
        m18968a(fileRecordEntity.fileInfoEntity, FileInfoEntity.class);
        return jCollect313311;
    }
}
