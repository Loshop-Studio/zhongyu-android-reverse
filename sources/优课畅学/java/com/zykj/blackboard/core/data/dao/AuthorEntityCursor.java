package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.AuthorEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import p189n6.InterfaceC9429b;

/* loaded from: classes4.dex */
public final class AuthorEntityCursor extends Cursor<AuthorEntity> {
    private static final AuthorEntity_.AuthorEntityIdGetter ID_GETTER = AuthorEntity_.__ID_GETTER;
    private static final int __ID_authorName = AuthorEntity_.authorName.f16872c;
    private static final int __ID_authorId = AuthorEntity_.authorId.f16872c;
    private static final int __ID_schoolId = AuthorEntity_.schoolId.f16872c;
    private static final int __ID_url = AuthorEntity_.url.f16872c;
    private static final int __ID_startTime = AuthorEntity_.startTime.f16872c;
    private static final int __ID_duration = AuthorEntity_.duration.f16872c;

    public static final class Factory implements InterfaceC9429b {
        @Override // p189n6.InterfaceC9429b
        public Cursor<AuthorEntity> createCursor(Transaction transaction, long j10, BoxStore boxStore) {
            return new AuthorEntityCursor(transaction, j10, boxStore);
        }
    }

    public AuthorEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, AuthorEntity_.__INSTANCE, boxStore);
    }

    @Override // io.objectbox.Cursor
    public final long getId(AuthorEntity authorEntity) {
        return ID_GETTER.getId(authorEntity);
    }

    @Override // io.objectbox.Cursor
    public final long put(AuthorEntity authorEntity) {
        String authorName = authorEntity.getAuthorName();
        int i10 = authorName != null ? __ID_authorName : 0;
        String authorId = authorEntity.getAuthorId();
        int i11 = authorId != null ? __ID_authorId : 0;
        String schoolId = authorEntity.getSchoolId();
        int i12 = schoolId != null ? __ID_schoolId : 0;
        String url = authorEntity.getUrl();
        Cursor.collect400000(this.cursor, 0L, 1, i10, authorName, i11, authorId, i12, schoolId, url != null ? __ID_url : 0, url);
        Long startTime = authorEntity.getStartTime();
        int i13 = startTime != null ? __ID_startTime : 0;
        Long duration = authorEntity.getDuration();
        int i14 = duration != null ? __ID_duration : 0;
        long jCollect004000 = Cursor.collect004000(this.cursor, authorEntity.getId(), 2, i13, i13 != 0 ? startTime.longValue() : 0L, i14, i14 != 0 ? duration.longValue() : 0L, 0, 0L, 0, 0L);
        authorEntity.setId(jCollect004000);
        return jCollect004000;
    }
}
