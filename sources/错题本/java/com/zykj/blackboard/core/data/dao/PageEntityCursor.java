package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.PageEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.relation.ToOne;
import p116m5.InterfaceC6109a;

/* loaded from: classes3.dex */
public final class PageEntityCursor extends Cursor<PageEntity> {
    private static final PageEntity_.PageEntityIdGetter ID_GETTER = PageEntity_.__ID_GETTER;
    private static final int __ID_dirName = PageEntity_.dirName.f8916id;
    private static final int __ID_isChange = PageEntity_.isChange.f8916id;
    private static final int __ID_commandFileName = PageEntity_.commandFileName.f8916id;
    private static final int __ID_commandIndex = PageEntity_.commandIndex.f8916id;
    private static final int __ID_blackBoardEntityId = PageEntity_.blackBoardEntityId.f8916id;
    private static final int __ID_recordEntityId = PageEntity_.recordEntityId.f8916id;
    private static final int __ID_headerEntityId = PageEntity_.headerEntityId.f8916id;

    @Internal
    public static final class Factory implements InterfaceC6109a {
        @Override // p116m5.InterfaceC6109a
        public Cursor<PageEntity> createCursor(Transaction transaction, long j7, BoxStore boxStore) {
            return new PageEntityCursor(transaction, j7, boxStore);
        }
    }

    public PageEntityCursor(Transaction transaction, long j7, BoxStore boxStore) {
        super(transaction, j7, PageEntity_.__INSTANCE, boxStore);
    }

    private void attachEntity(PageEntity pageEntity) {
        pageEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(PageEntity pageEntity) {
        return ID_GETTER.getId(pageEntity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.objectbox.Cursor
    public final long put(PageEntity pageEntity) {
        ToOne<BlackBoardEntity> toOne = pageEntity.blackBoardEntity;
        if (toOne != null && toOne.internalRequiresPutTarget()) {
            Cursor<TARGET> relationTargetCursor = getRelationTargetCursor(BlackBoardEntity.class);
            try {
                toOne.internalPutTarget(relationTargetCursor);
                relationTargetCursor.close();
            } finally {
            }
        }
        ToOne<RecordEntity> toOne2 = pageEntity.recordEntity;
        if (toOne2 != null && toOne2.internalRequiresPutTarget()) {
            Cursor<TARGET> relationTargetCursor2 = getRelationTargetCursor(RecordEntity.class);
            try {
                toOne2.internalPutTarget(relationTargetCursor2);
                relationTargetCursor2.close();
            } finally {
            }
        }
        ToOne<HeaderEntity> toOne3 = pageEntity.headerEntity;
        if (toOne3 != null && toOne3.internalRequiresPutTarget()) {
            try {
                toOne3.internalPutTarget(getRelationTargetCursor(HeaderEntity.class));
            } finally {
            }
        }
        String dirName = pageEntity.getDirName();
        int i = dirName != null ? __ID_dirName : 0;
        String commandFileName = pageEntity.getCommandFileName();
        long jCollect313311 = Cursor.collect313311(this.cursor, pageEntity.getId(), 3, i, dirName, commandFileName != null ? __ID_commandFileName : 0, commandFileName, 0, null, 0, null, __ID_blackBoardEntityId, pageEntity.blackBoardEntity.getTargetId(), __ID_recordEntityId, pageEntity.recordEntity.getTargetId(), __ID_headerEntityId, pageEntity.headerEntity.getTargetId(), __ID_commandIndex, pageEntity.getCommandIndex(), __ID_isChange, pageEntity.isChange() ? 1 : 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        pageEntity.setId(jCollect313311);
        attachEntity(pageEntity);
        return jCollect313311;
    }
}
