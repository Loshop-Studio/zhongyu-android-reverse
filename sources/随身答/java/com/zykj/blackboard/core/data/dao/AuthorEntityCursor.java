package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.AuthorEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import p037c8.InterfaceC5267b;

/* loaded from: classes4.dex */
public final class AuthorEntityCursor extends Cursor<AuthorEntity> {

    /* renamed from: j */
    public static final AuthorEntity_.C6961a f8492j = AuthorEntity_.f8501c;

    /* renamed from: k */
    public static final int f8493k = AuthorEntity_.f8504f.f14006c;

    /* renamed from: l */
    public static final int f8494l = AuthorEntity_.f8505g.f14006c;

    /* renamed from: m */
    public static final int f8495m = AuthorEntity_.f8506h.f14006c;

    /* renamed from: n */
    public static final int f8496n = AuthorEntity_.f8507i.f14006c;

    /* renamed from: o */
    public static final int f8497o = AuthorEntity_.f8508j.f14006c;

    /* renamed from: p */
    public static final int f8498p = AuthorEntity_.f8509k.f14006c;

    /* renamed from: com.zykj.blackboard.core.data.dao.AuthorEntityCursor$a */
    public static final class C6960a implements InterfaceC5267b {
        @Override // p037c8.InterfaceC5267b
        /* renamed from: a */
        public Cursor mo2405a(Transaction transaction, long j9, BoxStore boxStore) {
            return new AuthorEntityCursor(transaction, j9, boxStore);
        }
    }

    public AuthorEntityCursor(Transaction transaction, long j9, BoxStore boxStore) {
        super(transaction, j9, AuthorEntity_.f8502d, boxStore);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final long mo7358i(AuthorEntity authorEntity) {
        return f8492j.mo2406a(authorEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo7359p(AuthorEntity authorEntity) {
        String authorName = authorEntity.getAuthorName();
        int i9 = authorName != null ? f8493k : 0;
        String authorId = authorEntity.getAuthorId();
        int i10 = authorId != null ? f8494l : 0;
        String schoolId = authorEntity.getSchoolId();
        int i11 = schoolId != null ? f8495m : 0;
        String url = authorEntity.getUrl();
        Cursor.collect400000(this.f13997b, 0L, 1, i9, authorName, i10, authorId, i11, schoolId, url != null ? f8496n : 0, url);
        Long startTime = authorEntity.getStartTime();
        int i12 = startTime != null ? f8497o : 0;
        Long duration = authorEntity.getDuration();
        int i13 = duration != null ? f8498p : 0;
        long jCollect004000 = Cursor.collect004000(this.f13997b, authorEntity.getId(), 2, i12, i12 != 0 ? startTime.longValue() : 0L, i13, i13 != 0 ? duration.longValue() : 0L, 0, 0L, 0, 0L);
        authorEntity.m7395i(jCollect004000);
        return jCollect004000;
    }
}
