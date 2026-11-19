package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity_;
import com.zykj.board.EzyCommandEnum$CommandEnum;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.relation.ToOne;
import p116m5.InterfaceC6109a;

/* loaded from: classes3.dex */
public final class CommandInfoEntityCursor extends Cursor<CommandInfoEntity> {
    private final CommandEnumConverter commandEnumConverter;
    private static final CommandInfoEntity_.CommandInfoEntityIdGetter ID_GETTER = CommandInfoEntity_.__ID_GETTER;
    private static final int __ID_delayTime = CommandInfoEntity_.delayTime.f8916id;
    private static final int __ID_duration = CommandInfoEntity_.duration.f8916id;
    private static final int __ID_isPlay = CommandInfoEntity_.isPlay.f8916id;
    private static final int __ID_commandEnum = CommandInfoEntity_.commandEnum.f8916id;
    private static final int __ID_data = CommandInfoEntity_.data.f8916id;
    private static final int __ID_recordId = CommandInfoEntity_.recordId.f8916id;

    @Internal
    public static final class Factory implements InterfaceC6109a {
        @Override // p116m5.InterfaceC6109a
        public Cursor<CommandInfoEntity> createCursor(Transaction transaction, long j7, BoxStore boxStore) {
            return new CommandInfoEntityCursor(transaction, j7, boxStore);
        }
    }

    public CommandInfoEntityCursor(Transaction transaction, long j7, BoxStore boxStore) {
        super(transaction, j7, CommandInfoEntity_.__INSTANCE, boxStore);
        this.commandEnumConverter = new CommandEnumConverter();
    }

    private void attachEntity(CommandInfoEntity commandInfoEntity) {
        commandInfoEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(CommandInfoEntity commandInfoEntity) {
        return ID_GETTER.getId(commandInfoEntity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.objectbox.Cursor
    public final long put(CommandInfoEntity commandInfoEntity) {
        ToOne<CommandRecordEntity> toOne = commandInfoEntity.record;
        if (toOne != null && toOne.internalRequiresPutTarget()) {
            Cursor<TARGET> relationTargetCursor = getRelationTargetCursor(CommandRecordEntity.class);
            try {
                toOne.internalPutTarget(relationTargetCursor);
            } finally {
                relationTargetCursor.close();
            }
        }
        byte[] data = commandInfoEntity.getData();
        int i = data != null ? __ID_data : 0;
        EzyCommandEnum$CommandEnum commandEnum = commandInfoEntity.getCommandEnum();
        int i8 = commandEnum != null ? __ID_commandEnum : 0;
        long jCollect313311 = Cursor.collect313311(this.cursor, commandInfoEntity.getId(), 3, 0, null, 0, null, 0, null, i, data, __ID_delayTime, commandInfoEntity.getDelayTime(), __ID_duration, commandInfoEntity.getDuration(), __ID_recordId, commandInfoEntity.record.getTargetId(), i8, i8 != 0 ? this.commandEnumConverter.convertToDatabaseValue(commandEnum).intValue() : 0, __ID_isPlay, commandInfoEntity.isPlay() ? 1 : 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        commandInfoEntity.setId(jCollect313311);
        attachEntity(commandInfoEntity);
        return jCollect313311;
    }
}
