package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity_;
import com.zykj.board.EzyCommandEnum;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p189n6.InterfaceC9429b;

/* loaded from: classes4.dex */
public final class CommandInfoEntityCursor extends Cursor<CommandInfoEntity> {
    private final CommandEnumConverter commandEnumConverter;
    private static final CommandInfoEntity_.CommandInfoEntityIdGetter ID_GETTER = CommandInfoEntity_.__ID_GETTER;
    private static final int __ID_delayTime = CommandInfoEntity_.delayTime.f16872c;
    private static final int __ID_duration = CommandInfoEntity_.duration.f16872c;
    private static final int __ID_isPlay = CommandInfoEntity_.isPlay.f16872c;
    private static final int __ID_commandEnum = CommandInfoEntity_.commandEnum.f16872c;
    private static final int __ID_data = CommandInfoEntity_.data.f16872c;
    private static final int __ID_recordId = CommandInfoEntity_.recordId.f16872c;

    public static final class Factory implements InterfaceC9429b {
        @Override // p189n6.InterfaceC9429b
        public Cursor<CommandInfoEntity> createCursor(Transaction transaction, long j10, BoxStore boxStore) {
            return new CommandInfoEntityCursor(transaction, j10, boxStore);
        }
    }

    public CommandInfoEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, CommandInfoEntity_.__INSTANCE, boxStore);
        this.commandEnumConverter = new CommandEnumConverter();
    }

    private void attachEntity(CommandInfoEntity commandInfoEntity) {
        commandInfoEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(CommandInfoEntity commandInfoEntity) {
        return ID_GETTER.getId(commandInfoEntity);
    }

    @Override // io.objectbox.Cursor
    public final long put(CommandInfoEntity commandInfoEntity) {
        ToOne<CommandRecordEntity> toOne = commandInfoEntity.record;
        if (toOne != null && toOne.m15516i()) {
            Cursor<TARGET> relationTargetCursor = getRelationTargetCursor(CommandRecordEntity.class);
            try {
                toOne.m15515h(relationTargetCursor);
            } finally {
                relationTargetCursor.close();
            }
        }
        byte[] data = commandInfoEntity.getData();
        int i10 = data != null ? __ID_data : 0;
        EzyCommandEnum.CommandEnum commandEnum = commandInfoEntity.getCommandEnum();
        int i11 = commandEnum != null ? __ID_commandEnum : 0;
        long jCollect313311 = Cursor.collect313311(this.cursor, commandInfoEntity.getId(), 3, 0, null, 0, null, 0, null, i10, data, __ID_delayTime, commandInfoEntity.getDelayTime(), __ID_duration, commandInfoEntity.getDuration(), __ID_recordId, commandInfoEntity.record.m15513e(), i11, i11 != 0 ? this.commandEnumConverter.convertToDatabaseValue(commandEnum).intValue() : 0, __ID_isPlay, commandInfoEntity.isPlay() ? 1 : 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        commandInfoEntity.setId(jCollect313311);
        attachEntity(commandInfoEntity);
        return jCollect313311;
    }
}
