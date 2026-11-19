package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.FileRecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225r8.InterfaceC9047b;

/* loaded from: classes4.dex */
public final class FileRecordEntityCursor extends Cursor<FileRecordEntity> {

    /* renamed from: j */
    public static final FileRecordEntity_.C6664a f7321j = FileRecordEntity_.f7327c;

    /* renamed from: k */
    public static final int f7322k = FileRecordEntity_.f7330f.f13192c;

    /* renamed from: l */
    public static final int f7323l = FileRecordEntity_.f7331g.f13192c;

    /* renamed from: m */
    public static final int f7324m = FileRecordEntity_.f7332h.f13192c;

    /* renamed from: com.zykj.blackboard.core.data.dao.FileRecordEntityCursor$a */
    public static final class C6661a implements InterfaceC9047b {
        @Override // p225r8.InterfaceC9047b
        /* renamed from: a */
        public Cursor mo6269a(Transaction transaction, long j10, BoxStore boxStore) {
            return new FileRecordEntityCursor(transaction, j10, boxStore);
        }
    }

    public FileRecordEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, FileRecordEntity_.f7328d, boxStore);
    }

    /* renamed from: r */
    public final void m6372r(FileRecordEntity fileRecordEntity) {
        fileRecordEntity.__boxStore = this.f13185d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo6264i(FileRecordEntity fileRecordEntity) {
        return f7321j.mo6279a(fileRecordEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo6265p(FileRecordEntity fileRecordEntity) {
        ToOne<RecordEntity> toOne = fileRecordEntity.record;
        if (toOne != null && toOne.m13069r()) {
            Cursor cursorM13003l = m13003l(RecordEntity.class);
            try {
                toOne.m13068q(cursorM13003l);
            } finally {
                cursorM13003l.close();
            }
        }
        String fileName = fileRecordEntity.getFileName();
        int i10 = fileName != null ? f7322k : 0;
        String validate = fileRecordEntity.getValidate();
        long jCollect313311 = Cursor.collect313311(this.f13183b, fileRecordEntity.getId(), 3, i10, fileName, validate != null ? f7323l : 0, validate, 0, null, 0, null, f7324m, fileRecordEntity.record.m13066m(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        fileRecordEntity.m6371f(jCollect313311);
        m6372r(fileRecordEntity);
        m12997a(fileRecordEntity.fileInfoEntity, FileInfoEntity.class);
        return jCollect313311;
    }
}
