package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.CommandRecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.relation.ToOne;
import java.io.Closeable;
import p116m5.InterfaceC6109a;

/* loaded from: classes3.dex */
public final class CommandRecordEntityCursor extends Cursor<CommandRecordEntity> {
    private static final CommandRecordEntity_.CommandRecordEntityIdGetter ID_GETTER = CommandRecordEntity_.__ID_GETTER;
    private static final int __ID_fileName = CommandRecordEntity_.fileName.f8916id;
    private static final int __ID_validate = CommandRecordEntity_.validate.f8916id;
    private static final int __ID_recordId = CommandRecordEntity_.recordId.f8916id;

    @Internal
    public static final class Factory implements InterfaceC6109a {
        @Override // p116m5.InterfaceC6109a
        public Cursor<CommandRecordEntity> createCursor(Transaction transaction, long j7, BoxStore boxStore) {
            return new CommandRecordEntityCursor(transaction, j7, boxStore);
        }
    }

    public CommandRecordEntityCursor(Transaction transaction, long j7, BoxStore boxStore) {
        super(transaction, j7, CommandRecordEntity_.__INSTANCE, boxStore);
    }

    private void attachEntity(CommandRecordEntity commandRecordEntity) {
        commandRecordEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(CommandRecordEntity commandRecordEntity) {
        return ID_GETTER.getId(commandRecordEntity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.objectbox.Cursor
    public final long put(CommandRecordEntity commandRecordEntity) {
        ToOne<RecordEntity> toOne = commandRecordEntity.record;
        if (toOne != 0 && toOne.internalRequiresPutTarget()) {
            Closeable relationTargetCursor = getRelationTargetCursor(RecordEntity.class);
            try {
                toOne.internalPutTarget(relationTargetCursor);
            } finally {
                relationTargetCursor.close();
            }
        }
        String fileName = commandRecordEntity.getFileName();
        int i = fileName != null ? __ID_fileName : 0;
        String validate = commandRecordEntity.getValidate();
        long jCollect313311 = Cursor.collect313311(this.cursor, commandRecordEntity.getId(), 3, i, fileName, validate != null ? __ID_validate : 0, validate, 0, null, 0, null, __ID_recordId, commandRecordEntity.record.getTargetId(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        commandRecordEntity.setId(jCollect313311);
        attachEntity(commandRecordEntity);
        checkApplyToManyToDb(commandRecordEntity.commandInfoEntity, CommandInfoEntity.class);
        return jCollect313311;
    }
}
