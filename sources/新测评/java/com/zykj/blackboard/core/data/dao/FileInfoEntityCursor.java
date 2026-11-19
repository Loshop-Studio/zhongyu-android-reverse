package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.FileInfoEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225r8.InterfaceC9047b;

/* loaded from: classes4.dex */
public final class FileInfoEntityCursor extends Cursor<FileInfoEntity> {

    /* renamed from: j */
    public static final FileInfoEntity_.C6660a f7301j = FileInfoEntity_.f7309c;

    /* renamed from: k */
    public static final int f7302k = FileInfoEntity_.f7312f.f13192c;

    /* renamed from: l */
    public static final int f7303l = FileInfoEntity_.f7313g.f13192c;

    /* renamed from: m */
    public static final int f7304m = FileInfoEntity_.f7314h.f13192c;

    /* renamed from: n */
    public static final int f7305n = FileInfoEntity_.f7315i.f13192c;

    /* renamed from: o */
    public static final int f7306o = FileInfoEntity_.f7316j.f13192c;

    /* renamed from: com.zykj.blackboard.core.data.dao.FileInfoEntityCursor$a */
    public static final class C6658a implements InterfaceC9047b {
        @Override // p225r8.InterfaceC9047b
        /* renamed from: a */
        public Cursor mo6269a(Transaction transaction, long j10, BoxStore boxStore) {
            return new FileInfoEntityCursor(transaction, j10, boxStore);
        }
    }

    public FileInfoEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, FileInfoEntity_.f7310d, boxStore);
    }

    /* renamed from: r */
    public final void m6361r(FileInfoEntity fileInfoEntity) {
        fileInfoEntity.__boxStore = this.f13185d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo6264i(FileInfoEntity fileInfoEntity) {
        return f7301j.mo6279a(fileInfoEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo6265p(FileInfoEntity fileInfoEntity) {
        ToOne<FileRecordEntity> toOne = fileInfoEntity.record;
        if (toOne != null && toOne.m13069r()) {
            Cursor cursorM13003l = m13003l(FileRecordEntity.class);
            try {
                toOne.m13068q(cursorM13003l);
            } finally {
                cursorM13003l.close();
            }
        }
        String fileName = fileInfoEntity.getFileName();
        int i10 = fileName != null ? f7302k : 0;
        String validate = fileInfoEntity.getValidate();
        long jCollect313311 = Cursor.collect313311(this.f13183b, fileInfoEntity.getId(), 3, i10, fileName, validate != null ? f7305n : 0, validate, 0, null, 0, null, f7306o, fileInfoEntity.record.m13066m(), f7303l, fileInfoEntity.getWidth(), f7304m, fileInfoEntity.getHeight(), 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        fileInfoEntity.m6360h(jCollect313311);
        m6361r(fileInfoEntity);
        return jCollect313311;
    }
}
