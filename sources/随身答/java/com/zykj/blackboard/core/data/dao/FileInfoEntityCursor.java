package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.FileInfoEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p037c8.InterfaceC5267b;

/* loaded from: classes4.dex */
public final class FileInfoEntityCursor extends Cursor<FileInfoEntity> {

    /* renamed from: j */
    public static final FileInfoEntity_.C6977a f8583j = FileInfoEntity_.f8591c;

    /* renamed from: k */
    public static final int f8584k = FileInfoEntity_.f8594f.f14006c;

    /* renamed from: l */
    public static final int f8585l = FileInfoEntity_.f8595g.f14006c;

    /* renamed from: m */
    public static final int f8586m = FileInfoEntity_.f8596h.f14006c;

    /* renamed from: n */
    public static final int f8587n = FileInfoEntity_.f8597i.f14006c;

    /* renamed from: o */
    public static final int f8588o = FileInfoEntity_.f8598j.f14006c;

    /* renamed from: com.zykj.blackboard.core.data.dao.FileInfoEntityCursor$a */
    public static final class C6975a implements InterfaceC5267b {
        @Override // p037c8.InterfaceC5267b
        /* renamed from: a */
        public Cursor mo2405a(Transaction transaction, long j9, BoxStore boxStore) {
            return new FileInfoEntityCursor(transaction, j9, boxStore);
        }
    }

    public FileInfoEntityCursor(Transaction transaction, long j9, BoxStore boxStore) {
        super(transaction, j9, FileInfoEntity_.f8592d, boxStore);
    }

    /* renamed from: r */
    public final void m7459r(FileInfoEntity fileInfoEntity) {
        fileInfoEntity.__boxStore = this.f13999d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo7358i(FileInfoEntity fileInfoEntity) {
        return f8583j.mo2406a(fileInfoEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo7359p(FileInfoEntity fileInfoEntity) {
        ToOne<FileRecordEntity> toOne = fileInfoEntity.record;
        if (toOne != null && toOne.m13188u()) {
            Cursor cursorM13123l = m13123l(FileRecordEntity.class);
            try {
                toOne.m13187t(cursorM13123l);
            } finally {
                cursorM13123l.close();
            }
        }
        String fileName = fileInfoEntity.getFileName();
        int i9 = fileName != null ? f8584k : 0;
        String validate = fileInfoEntity.getValidate();
        long jCollect313311 = Cursor.collect313311(this.f13997b, fileInfoEntity.getId(), 3, i9, fileName, validate != null ? f8587n : 0, validate, 0, null, 0, null, f8588o, fileInfoEntity.record.m13185n(), f8585l, fileInfoEntity.getWidth(), f8586m, fileInfoEntity.getHeight(), 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        fileInfoEntity.m7458h(jCollect313311);
        m7459r(fileInfoEntity);
        return jCollect313311;
    }
}
