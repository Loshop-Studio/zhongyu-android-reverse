package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.PageEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p189n6.InterfaceC9429b;

/* loaded from: classes4.dex */
public final class PageEntityCursor extends Cursor<PageEntity> {
    private static final PageEntity_.PageEntityIdGetter ID_GETTER = PageEntity_.__ID_GETTER;
    private static final int __ID_dirName = PageEntity_.dirName.f16872c;
    private static final int __ID_isChange = PageEntity_.isChange.f16872c;
    private static final int __ID_commandFileName = PageEntity_.commandFileName.f16872c;
    private static final int __ID_commandIndex = PageEntity_.commandIndex.f16872c;
    private static final int __ID_blackBoardEntityId = PageEntity_.blackBoardEntityId.f16872c;
    private static final int __ID_recordEntityId = PageEntity_.recordEntityId.f16872c;
    private static final int __ID_headerEntityId = PageEntity_.headerEntityId.f16872c;

    public static final class Factory implements InterfaceC9429b {
        @Override // p189n6.InterfaceC9429b
        public Cursor<PageEntity> createCursor(Transaction transaction, long j10, BoxStore boxStore) {
            return new PageEntityCursor(transaction, j10, boxStore);
        }
    }

    public PageEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, PageEntity_.__INSTANCE, boxStore);
    }

    private void attachEntity(PageEntity pageEntity) {
        pageEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(PageEntity pageEntity) {
        return ID_GETTER.getId(pageEntity);
    }

    @Override // io.objectbox.Cursor
    public final long put(PageEntity pageEntity) {
        ToOne<BlackBoardEntity> toOne = pageEntity.blackBoardEntity;
        if (toOne != null && toOne.m15516i()) {
            Cursor<TARGET> relationTargetCursor = getRelationTargetCursor(BlackBoardEntity.class);
            try {
                toOne.m15515h(relationTargetCursor);
                relationTargetCursor.close();
            } finally {
            }
        }
        ToOne<RecordEntity> toOne2 = pageEntity.recordEntity;
        if (toOne2 != null && toOne2.m15516i()) {
            Cursor<TARGET> relationTargetCursor2 = getRelationTargetCursor(RecordEntity.class);
            try {
                toOne2.m15515h(relationTargetCursor2);
                relationTargetCursor2.close();
            } finally {
            }
        }
        ToOne<HeaderEntity> toOne3 = pageEntity.headerEntity;
        if (toOne3 != null && toOne3.m15516i()) {
            try {
                toOne3.m15515h(getRelationTargetCursor(HeaderEntity.class));
            } finally {
            }
        }
        String dirName = pageEntity.getDirName();
        int i10 = dirName != null ? __ID_dirName : 0;
        String commandFileName = pageEntity.getCommandFileName();
        long jCollect313311 = Cursor.collect313311(this.cursor, pageEntity.getId(), 3, i10, dirName, commandFileName != null ? __ID_commandFileName : 0, commandFileName, 0, null, 0, null, __ID_blackBoardEntityId, pageEntity.blackBoardEntity.m15513e(), __ID_recordEntityId, pageEntity.recordEntity.m15513e(), __ID_headerEntityId, pageEntity.headerEntity.m15513e(), __ID_commandIndex, pageEntity.getCommandIndex(), __ID_isChange, pageEntity.isChange() ? 1 : 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        pageEntity.setId(jCollect313311);
        attachEntity(pageEntity);
        return jCollect313311;
    }
}
