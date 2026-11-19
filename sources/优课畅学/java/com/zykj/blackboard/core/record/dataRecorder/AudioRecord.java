package com.zykj.blackboard.core.record.dataRecorder;

import com.google.protobuf.Message;
import com.zykj.blackboard.core.data.dao.AudioInfoEntity;
import com.zykj.blackboard.core.data.dao.AudioRecordEntity;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.blackboard.core.record.DataRecorder;
import com.zykj.blackboard.core.record.TimeRecord;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyCommandEnum;
import io.objectbox.relation.ToMany;
import java.util.Iterator;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8778f0;
import p300x7.InterfaceC10559a;

/* loaded from: classes4.dex */
public final class AudioRecord extends DataRecorder {
    public static final Companion Companion = new Companion(null);
    public static final String SOURCE_FILE_NAME_SUFFIX = "_audio.bin";
    private AudioRecordEntity audioRecordEntity;
    private boolean isRecordChange;
    private RecordEntity recordEntity;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioRecord(TimeRecord timeRecord) {
        super(timeRecord);
        AbstractC9133u.m16133g(timeRecord, "timeRecord");
    }

    private final AudioRecordEntity buildRecordEntity() {
        RecordEntity recordEntity = this.recordEntity;
        if (recordEntity == null) {
            return null;
        }
        AudioRecordEntity audioRecordEntity = new AudioRecordEntity(0L, UUID.randomUUID() + SOURCE_FILE_NAME_SUFFIX, "");
        recordEntity.getAudioList().add(audioRecordEntity);
        recordEntity.put();
        return audioRecordEntity;
    }

    private final synchronized void checkLength() {
        try {
            AudioRecordEntity audioRecordEntity = this.audioRecordEntity;
            if (audioRecordEntity == null) {
                this.audioRecordEntity = buildRecordEntity();
            } else {
                AbstractC9133u.m16130d(audioRecordEntity);
                if (audioRecordEntity.getAudioInfoEntity().size() >= 100) {
                    this.audioRecordEntity = buildRecordEntity();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final AudioRecordEntity initRecordEntity() {
        ToMany<AudioRecordEntity> audioList;
        AudioRecordEntity audioRecordEntity;
        RecordEntity recordEntity = this.recordEntity;
        return (recordEntity == null || (audioList = recordEntity.getAudioList()) == null || (audioRecordEntity = (AudioRecordEntity) AbstractC8778f0.m14579y0(audioList)) == null || audioRecordEntity.getAudioInfoEntity().size() >= 100) ? buildRecordEntity() : audioRecordEntity;
    }

    private final void updateEntity(AudioInfoEntity audioInfoEntity) throws IllegalAccessException, IllegalArgumentException {
        AudioRecordEntity audioRecordEntity = this.audioRecordEntity;
        if (audioRecordEntity != null) {
            audioInfoEntity.getRecord().m15518k(audioRecordEntity);
            audioInfoEntity.put();
            audioRecordEntity.getAudioInfoEntity().add(audioInfoEntity);
            audioRecordEntity.put();
        }
        checkLength();
        this.isRecordChange = true;
    }

    public final AudioInfoEntity addAudio(final String fileName, final long j10, long j11) {
        AbstractC9133u.m16133g(fileName, "fileName");
        TimeRecord timeRecord = getTimeRecord();
        AbstractC9133u.m16130d(timeRecord);
        AudioInfoEntity audioInfoEntityBuildAudioInfoEntity = buildAudioInfoEntity(timeRecord.getDelayTime(j11, true) - j10, j10, EzyCommandEnum.CommandEnum.ACTION_AUDIO_START, new InterfaceC10559a() { // from class: com.zykj.blackboard.core.record.dataRecorder.AudioRecord.addAudio.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Message invoke() {
                EzyCommand.CommandSource.CommandInfo.AudioStart.C7182b c7182bM7462k = EzyCommand.CommandSource.CommandInfo.AudioStart.m7462k();
                c7182bM7462k.m7487s(fileName);
                c7182bM7462k.m7485q(j10);
                EzyCommand.CommandSource.CommandInfo.AudioStart audioStartBuild = c7182bM7462k.build();
                AbstractC9133u.m16132f(audioStartBuild, "builder.build()");
                return audioStartBuild;
            }
        });
        updateEntity(audioInfoEntityBuildAudioInfoEntity);
        return audioInfoEntityBuildAudioInfoEntity;
    }

    public final boolean isRecordChange() {
        return this.isRecordChange;
    }

    public final void setRecord(RecordEntity recordEntity) {
        AbstractC9133u.m16133g(recordEntity, "recordEntity");
        this.recordEntity = recordEntity;
        this.audioRecordEntity = initRecordEntity();
        this.isRecordChange = false;
    }

    public final AudioInfoEntity updateAudio(String fileName, long j10) {
        ToMany<AudioInfoEntity> audioInfoEntity;
        AudioInfoEntity next;
        AbstractC9133u.m16133g(fileName, "fileName");
        TimeRecord timeRecord = getTimeRecord();
        if (timeRecord != null) {
            timeRecord.setOffsetForAudio(j10);
        }
        AudioRecordEntity audioRecordEntity = this.audioRecordEntity;
        if (audioRecordEntity != null && (audioInfoEntity = audioRecordEntity.getAudioInfoEntity()) != null) {
            Iterator<AudioInfoEntity> it = audioInfoEntity.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC9133u.m16128b(EzyCommand.CommandSource.CommandInfo.AudioStart.m7464o(next.getData()).getFileName(), fileName)) {
                    break;
                }
            }
            AudioInfoEntity audioInfoEntity2 = next;
            if (audioInfoEntity2 != null) {
                audioInfoEntity2.setDuration(j10);
                EzyCommand.CommandSource.CommandInfo.AudioStart.C7182b c7182bM7462k = EzyCommand.CommandSource.CommandInfo.AudioStart.m7462k();
                c7182bM7462k.m7487s(fileName);
                c7182bM7462k.m7485q(j10);
                byte[] byteArray = c7182bM7462k.build().toByteArray();
                AbstractC9133u.m16132f(byteArray, "builder.build().toByteArray()");
                audioInfoEntity2.setData(byteArray);
                audioInfoEntity2.put();
                return audioInfoEntity2;
            }
        }
        return null;
    }
}
