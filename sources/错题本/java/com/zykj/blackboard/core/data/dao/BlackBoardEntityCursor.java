package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.BlackBoardEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.annotation.apihint.Internal;
import p116m5.InterfaceC6109a;

/* loaded from: classes3.dex */
public final class BlackBoardEntityCursor extends Cursor<BlackBoardEntity> {
    private static final BlackBoardEntity_.BlackBoardEntityIdGetter ID_GETTER = BlackBoardEntity_.__ID_GETTER;
    private static final int __ID_dir = BlackBoardEntity_.dir.f8916id;

    @Internal
    public static final class Factory implements InterfaceC6109a {
        @Override // p116m5.InterfaceC6109a
        public Cursor<BlackBoardEntity> createCursor(Transaction transaction, long j7, BoxStore boxStore) {
            return new BlackBoardEntityCursor(transaction, j7, boxStore);
        }
    }

    public BlackBoardEntityCursor(Transaction transaction, long j7, BoxStore boxStore) {
        super(transaction, j7, BlackBoardEntity_.__INSTANCE, boxStore);
    }

    private void attachEntity(BlackBoardEntity blackBoardEntity) {
        blackBoardEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(BlackBoardEntity blackBoardEntity) {
        return ID_GETTER.getId(blackBoardEntity);
    }

    @Override // io.objectbox.Cursor
    public final long put(BlackBoardEntity blackBoardEntity) {
        String dir = blackBoardEntity.getDir();
        long jCollect313311 = Cursor.collect313311(this.cursor, blackBoardEntity.getId(), 3, dir != null ? __ID_dir : 0, dir, 0, null, 0, null, 0, null, 0, 0L, 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        blackBoardEntity.setId(jCollect313311);
        attachEntity(blackBoardEntity);
        checkApplyToManyToDb(blackBoardEntity.pages, PageEntity.class);
        return jCollect313311;
    }
}
