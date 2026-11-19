package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.AuthorEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.annotation.apihint.Internal;
import p116m5.InterfaceC6109a;

/* loaded from: classes3.dex */
public final class AuthorEntityCursor extends Cursor<AuthorEntity> {
    private static final AuthorEntity_.AuthorEntityIdGetter ID_GETTER = AuthorEntity_.__ID_GETTER;
    private static final int __ID_authorName = AuthorEntity_.authorName.f8916id;
    private static final int __ID_authorId = AuthorEntity_.authorId.f8916id;
    private static final int __ID_schoolId = AuthorEntity_.schoolId.f8916id;
    private static final int __ID_url = AuthorEntity_.url.f8916id;
    private static final int __ID_startTime = AuthorEntity_.startTime.f8916id;
    private static final int __ID_duration = AuthorEntity_.duration.f8916id;

    @Internal
    public static final class Factory implements InterfaceC6109a {
        @Override // p116m5.InterfaceC6109a
        public Cursor<AuthorEntity> createCursor(Transaction transaction, long j7, BoxStore boxStore) {
            return new AuthorEntityCursor(transaction, j7, boxStore);
        }
    }

    public AuthorEntityCursor(Transaction transaction, long j7, BoxStore boxStore) {
        super(transaction, j7, AuthorEntity_.__INSTANCE, boxStore);
    }

    @Override // io.objectbox.Cursor
    public final long getId(AuthorEntity authorEntity) {
        return ID_GETTER.getId(authorEntity);
    }

    @Override // io.objectbox.Cursor
    public final long put(AuthorEntity authorEntity) {
        String authorName = authorEntity.getAuthorName();
        int i = authorName != null ? __ID_authorName : 0;
        String authorId = authorEntity.getAuthorId();
        int i8 = authorId != null ? __ID_authorId : 0;
        String schoolId = authorEntity.getSchoolId();
        int i9 = schoolId != null ? __ID_schoolId : 0;
        String url = authorEntity.getUrl();
        Cursor.collect400000(this.cursor, 0L, 1, i, authorName, i8, authorId, i9, schoolId, url != null ? __ID_url : 0, url);
        Long startTime = authorEntity.getStartTime();
        int i10 = startTime != null ? __ID_startTime : 0;
        Long duration = authorEntity.getDuration();
        int i11 = duration != null ? __ID_duration : 0;
        long jCollect004000 = Cursor.collect004000(this.cursor, authorEntity.getId(), 2, i10, i10 != 0 ? startTime.longValue() : 0L, i11, i11 != 0 ? duration.longValue() : 0L, 0, 0L, 0, 0L);
        authorEntity.setId(jCollect004000);
        return jCollect004000;
    }
}
