package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.AudioInfoEntity_;
import com.zykj.board.EzyCommandEnum;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p189n6.InterfaceC9429b;

/* loaded from: classes4.dex */
public final class AudioInfoEntityCursor extends Cursor<AudioInfoEntity> {
    private final CommandEnumConverter commandEnumConverter;
    private static final AudioInfoEntity_.AudioInfoEntityIdGetter ID_GETTER = AudioInfoEntity_.__ID_GETTER;
    private static final int __ID_delayTime = AudioInfoEntity_.delayTime.f16872c;
    private static final int __ID_duration = AudioInfoEntity_.duration.f16872c;
    private static final int __ID_isPlay = AudioInfoEntity_.isPlay.f16872c;
    private static final int __ID_commandEnum = AudioInfoEntity_.commandEnum.f16872c;
    private static final int __ID_data = AudioInfoEntity_.data.f16872c;
    private static final int __ID_recordId = AudioInfoEntity_.recordId.f16872c;

    public static final class Factory implements InterfaceC9429b {
        @Override // p189n6.InterfaceC9429b
        public Cursor<AudioInfoEntity> createCursor(Transaction transaction, long j10, BoxStore boxStore) {
            return new AudioInfoEntityCursor(transaction, j10, boxStore);
        }
    }

    public AudioInfoEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, AudioInfoEntity_.__INSTANCE, boxStore);
        this.commandEnumConverter = new CommandEnumConverter();
    }

    private void attachEntity(AudioInfoEntity audioInfoEntity) {
        audioInfoEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(AudioInfoEntity audioInfoEntity) {
        return ID_GETTER.getId(audioInfoEntity);
    }

    @Override // io.objectbox.Cursor
    public final long put(AudioInfoEntity audioInfoEntity) {
        ToOne<AudioRecordEntity> toOne = audioInfoEntity.record;
        if (toOne != null && toOne.m15516i()) {
            Cursor<TARGET> relationTargetCursor = getRelationTargetCursor(AudioRecordEntity.class);
            try {
                toOne.m15515h(relationTargetCursor);
            } finally {
                relationTargetCursor.close();
            }
        }
        byte[] data = audioInfoEntity.getData();
        int i10 = data != null ? __ID_data : 0;
        EzyCommandEnum.CommandEnum commandEnum = audioInfoEntity.getCommandEnum();
        int i11 = commandEnum != null ? __ID_commandEnum : 0;
        long jCollect313311 = Cursor.collect313311(this.cursor, audioInfoEntity.getId(), 3, 0, null, 0, null, 0, null, i10, data, __ID_delayTime, audioInfoEntity.getDelayTime(), __ID_duration, audioInfoEntity.getDuration(), __ID_recordId, audioInfoEntity.record.m15513e(), i11, i11 != 0 ? this.commandEnumConverter.convertToDatabaseValue(commandEnum).intValue() : 0, __ID_isPlay, audioInfoEntity.isPlay() ? 1 : 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        audioInfoEntity.setId(jCollect313311);
        attachEntity(audioInfoEntity);
        return jCollect313311;
    }
}
