package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.FileRecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p037c8.InterfaceC5267b;

/* loaded from: classes4.dex */
public final class FileRecordEntityCursor extends Cursor<FileRecordEntity> {

    /* renamed from: j */
    public static final FileRecordEntity_.C6981a f8603j = FileRecordEntity_.f8609c;

    /* renamed from: k */
    public static final int f8604k = FileRecordEntity_.f8612f.f14006c;

    /* renamed from: l */
    public static final int f8605l = FileRecordEntity_.f8613g.f14006c;

    /* renamed from: m */
    public static final int f8606m = FileRecordEntity_.f8614h.f14006c;

    /* renamed from: com.zykj.blackboard.core.data.dao.FileRecordEntityCursor$a */
    public static final class C6978a implements InterfaceC5267b {
        @Override // p037c8.InterfaceC5267b
        /* renamed from: a */
        public Cursor mo2405a(Transaction transaction, long j9, BoxStore boxStore) {
            return new FileRecordEntityCursor(transaction, j9, boxStore);
        }
    }

    public FileRecordEntityCursor(Transaction transaction, long j9, BoxStore boxStore) {
        super(transaction, j9, FileRecordEntity_.f8610d, boxStore);
    }

    /* renamed from: r */
    public final void m7471r(FileRecordEntity fileRecordEntity) {
        fileRecordEntity.__boxStore = this.f13999d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo7358i(FileRecordEntity fileRecordEntity) {
        return f8603j.mo2406a(fileRecordEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo7359p(FileRecordEntity fileRecordEntity) {
        ToOne<RecordEntity> toOne = fileRecordEntity.record;
        if (toOne != null && toOne.m13188u()) {
            Cursor cursorM13123l = m13123l(RecordEntity.class);
            try {
                toOne.m13187t(cursorM13123l);
            } finally {
                cursorM13123l.close();
            }
        }
        String fileName = fileRecordEntity.getFileName();
        int i9 = fileName != null ? f8604k : 0;
        String validate = fileRecordEntity.getValidate();
        long jCollect313311 = Cursor.collect313311(this.f13997b, fileRecordEntity.getId(), 3, i9, fileName, validate != null ? f8605l : 0, validate, 0, null, 0, null, f8606m, fileRecordEntity.record.m13185n(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        fileRecordEntity.m7469f(jCollect313311);
        m7471r(fileRecordEntity);
        m13117a(fileRecordEntity.fileInfoEntity, FileInfoEntity.class);
        return jCollect313311;
    }
}
