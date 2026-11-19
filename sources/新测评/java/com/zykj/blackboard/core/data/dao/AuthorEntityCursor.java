package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.AuthorEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import p225r8.InterfaceC9047b;

/* loaded from: classes4.dex */
public final class AuthorEntityCursor extends Cursor<AuthorEntity> {

    /* renamed from: j */
    public static final AuthorEntity_.C6644a f7210j = AuthorEntity_.f7219c;

    /* renamed from: k */
    public static final int f7211k = AuthorEntity_.f7222f.f13192c;

    /* renamed from: l */
    public static final int f7212l = AuthorEntity_.f7223g.f13192c;

    /* renamed from: m */
    public static final int f7213m = AuthorEntity_.f7224h.f13192c;

    /* renamed from: n */
    public static final int f7214n = AuthorEntity_.f7225i.f13192c;

    /* renamed from: o */
    public static final int f7215o = AuthorEntity_.f7226j.f13192c;

    /* renamed from: p */
    public static final int f7216p = AuthorEntity_.f7227k.f13192c;

    /* renamed from: com.zykj.blackboard.core.data.dao.AuthorEntityCursor$a */
    public static final class C6643a implements InterfaceC9047b {
        @Override // p225r8.InterfaceC9047b
        /* renamed from: a */
        public Cursor mo6269a(Transaction transaction, long j10, BoxStore boxStore) {
            return new AuthorEntityCursor(transaction, j10, boxStore);
        }
    }

    public AuthorEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, AuthorEntity_.f7220d, boxStore);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final long mo6264i(AuthorEntity authorEntity) {
        return f7210j.mo6279a(authorEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo6265p(AuthorEntity authorEntity) {
        String authorName = authorEntity.getAuthorName();
        int i10 = authorName != null ? f7211k : 0;
        String authorId = authorEntity.getAuthorId();
        int i11 = authorId != null ? f7212l : 0;
        String schoolId = authorEntity.getSchoolId();
        int i12 = schoolId != null ? f7213m : 0;
        String url = authorEntity.getUrl();
        Cursor.collect400000(this.f13183b, 0L, 1, i10, authorName, i11, authorId, i12, schoolId, url != null ? f7214n : 0, url);
        Long startTime = authorEntity.getStartTime();
        int i13 = startTime != null ? f7215o : 0;
        Long duration = authorEntity.getDuration();
        int i14 = duration != null ? f7216p : 0;
        long jCollect004000 = Cursor.collect004000(this.f13183b, authorEntity.getId(), 2, i13, i13 != 0 ? startTime.longValue() : 0L, i14, i14 != 0 ? duration.longValue() : 0L, 0, 0L, 0, 0L);
        authorEntity.m6302i(jCollect004000);
        return jCollect004000;
    }
}
