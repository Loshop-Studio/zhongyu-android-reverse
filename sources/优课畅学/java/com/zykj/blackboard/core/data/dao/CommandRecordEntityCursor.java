package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.CommandRecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p189n6.InterfaceC9429b;

/* loaded from: classes4.dex */
public final class CommandRecordEntityCursor extends Cursor<CommandRecordEntity> {
    private static final CommandRecordEntity_.CommandRecordEntityIdGetter ID_GETTER = CommandRecordEntity_.__ID_GETTER;
    private static final int __ID_fileName = CommandRecordEntity_.fileName.f16872c;
    private static final int __ID_validate = CommandRecordEntity_.validate.f16872c;
    private static final int __ID_recordId = CommandRecordEntity_.recordId.f16872c;

    public static final class Factory implements InterfaceC9429b {
        @Override // p189n6.InterfaceC9429b
        public Cursor<CommandRecordEntity> createCursor(Transaction transaction, long j10, BoxStore boxStore) {
            return new CommandRecordEntityCursor(transaction, j10, boxStore);
        }
    }

    public CommandRecordEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, CommandRecordEntity_.__INSTANCE, boxStore);
    }

    private void attachEntity(CommandRecordEntity commandRecordEntity) {
        commandRecordEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(CommandRecordEntity commandRecordEntity) {
        return ID_GETTER.getId(commandRecordEntity);
    }

    @Override // io.objectbox.Cursor
    public final long put(CommandRecordEntity commandRecordEntity) {
        ToOne<RecordEntity> toOne = commandRecordEntity.record;
        if (toOne != null && toOne.m15516i()) {
            Cursor<TARGET> relationTargetCursor = getRelationTargetCursor(RecordEntity.class);
            try {
                toOne.m15515h(relationTargetCursor);
            } finally {
                relationTargetCursor.close();
            }
        }
        String fileName = commandRecordEntity.getFileName();
        int i10 = fileName != null ? __ID_fileName : 0;
        String validate = commandRecordEntity.getValidate();
        long jCollect313311 = Cursor.collect313311(this.cursor, commandRecordEntity.getId(), 3, i10, fileName, validate != null ? __ID_validate : 0, validate, 0, null, 0, null, __ID_recordId, commandRecordEntity.record.m15513e(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        commandRecordEntity.setId(jCollect313311);
        attachEntity(commandRecordEntity);
        checkApplyToManyToDb(commandRecordEntity.commandInfoEntity, CommandInfoEntity.class);
        return jCollect313311;
    }
}
