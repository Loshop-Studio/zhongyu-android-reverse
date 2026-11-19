package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.FileInfoEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225kc.InterfaceC9909b;

/* loaded from: classes5.dex */
public final class FileInfoEntityCursor extends Cursor<FileInfoEntity> {

    /* renamed from: l */
    public static final FileInfoEntity_.C8357a f18144l = FileInfoEntity_.f18152e;

    /* renamed from: m */
    public static final int f18145m = FileInfoEntity_.f18155h.f22265e;

    /* renamed from: n */
    public static final int f18146n = FileInfoEntity_.f18156i.f22265e;

    /* renamed from: o */
    public static final int f18147o = FileInfoEntity_.f18157j.f22265e;

    /* renamed from: p */
    public static final int f18148p = FileInfoEntity_.f18158k.f22265e;

    /* renamed from: q */
    public static final int f18149q = FileInfoEntity_.f18159l.f22265e;

    /* renamed from: com.zykj.blackboard.core.data.dao.FileInfoEntityCursor$a */
    public static final class C8355a implements InterfaceC9909b {
        @Override // p225kc.InterfaceC9909b
        /* renamed from: a */
        public Cursor mo13991a(Transaction transaction, long j10, BoxStore boxStore) {
            return new FileInfoEntityCursor(transaction, j10, boxStore);
        }
    }

    public FileInfoEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, FileInfoEntity_.f18153f, boxStore);
    }

    /* renamed from: u */
    public final void m14086u(FileInfoEntity fileInfoEntity) {
        fileInfoEntity.__boxStore = this.f22258f;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final long mo13986i(FileInfoEntity fileInfoEntity) {
        return f18144l.mo14001a(fileInfoEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final long mo13987s(FileInfoEntity fileInfoEntity) {
        ToOne<FileRecordEntity> toOne = fileInfoEntity.record;
        if (toOne != null && toOne.m19041m()) {
            Cursor cursorM18975l = m18975l(FileRecordEntity.class);
            try {
                toOne.m19040k(cursorM18975l);
            } finally {
                cursorM18975l.close();
            }
        }
        String strM14078a = fileInfoEntity.m14078a();
        int i10 = strM14078a != null ? f18145m : 0;
        String strM14082e = fileInfoEntity.m14082e();
        long jCollect313311 = Cursor.collect313311(this.f22256d, fileInfoEntity.m14080c(), 3, i10, strM14078a, strM14082e != null ? f18148p : 0, strM14082e, 0, null, 0, null, f18149q, fileInfoEntity.record.m19038f(), f18146n, fileInfoEntity.m14083f(), f18147o, fileInfoEntity.m14079b(), 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        fileInfoEntity.m14085h(jCollect313311);
        m14086u(fileInfoEntity);
        return jCollect313311;
    }
}
