package com.zykj.blackboard.core.record.dataRecorder;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.protobuf.Message;
import com.zykj.blackboard.core.data.dao.AudioInfoEntity;
import com.zykj.blackboard.core.data.dao.AudioRecordEntity;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.blackboard.core.record.DataRecorder;
import com.zykj.blackboard.core.record.TimeRecord;
import com.zykj.board.C4360d;
import com.zykj.board.EzyCommand$CommandSource;
import com.zykj.board.EzyCommandEnum$CommandEnum;
import io.objectbox.relation.ToMany;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 &2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ'\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR$\u0010 \u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, m5110d2 = {"Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;", "Lcom/zykj/blackboard/core/record/DataRecorder;", "Lcom/zykj/blackboard/core/record/TimeRecord;", "timeRecord", "<init>", "(Lcom/zykj/blackboard/core/record/TimeRecord;)V", "Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;", "entity", "Ld6/s;", "updateEntity", "(Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;)V", "checkLength", "()V", "Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;", "initRecordEntity", "()Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;", "buildRecordEntity", "", "fileName", "", TypedValues.TransitionType.S_DURATION, "currentTime", "addAudio", "(Ljava/lang/String;JJ)Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;", "updateAudio", "(Ljava/lang/String;J)Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;", "Lcom/zykj/blackboard/core/data/dao/RecordEntity;", "recordEntity", "setRecord", "(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V", "", "<set-?>", "isRecordChange", "Z", "()Z", "Lcom/zykj/blackboard/core/data/dao/RecordEntity;", "audioRecordEntity", "Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;", "Companion", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class AudioRecord extends DataRecorder {

    @NotNull
    public static final String SOURCE_FILE_NAME_SUFFIX = "_audio.bin";

    @Nullable
    private AudioRecordEntity audioRecordEntity;
    private boolean isRecordChange;

    @Nullable
    private RecordEntity recordEntity;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioRecord(@NotNull TimeRecord timeRecord) {
        super(timeRecord);
        AbstractC5830k.m5330g(timeRecord, "timeRecord");
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
                AbstractC5830k.m5327d(audioRecordEntity);
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
        return (recordEntity == null || (audioList = recordEntity.getAudioList()) == null || (audioRecordEntity = (AudioRecordEntity) AbstractC5805t.m5236p0(audioList)) == null || audioRecordEntity.getAudioInfoEntity().size() >= 100) ? buildRecordEntity() : audioRecordEntity;
    }

    private final void updateEntity(AudioInfoEntity entity) {
        AudioRecordEntity audioRecordEntity = this.audioRecordEntity;
        if (audioRecordEntity != null) {
            entity.getRecord().setTarget(audioRecordEntity);
            entity.put();
            audioRecordEntity.getAudioInfoEntity().add(entity);
            audioRecordEntity.put();
        }
        checkLength();
        this.isRecordChange = true;
    }

    @Nullable
    public final AudioInfoEntity addAudio(@NotNull final String fileName, final long duration, long currentTime) {
        AbstractC5830k.m5330g(fileName, "fileName");
        TimeRecord timeRecord = getTimeRecord();
        AbstractC5830k.m5327d(timeRecord);
        AudioInfoEntity audioInfoEntityBuildAudioInfoEntity = buildAudioInfoEntity(timeRecord.getDelayTime(currentTime, true) - duration, duration, EzyCommandEnum$CommandEnum.ACTION_AUDIO_START, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.record.dataRecorder.AudioRecord.addAudio.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            @NotNull
            public final Message invoke() {
                C4360d c4360dNewBuilder = EzyCommand$CommandSource.CommandInfo.AudioStart.newBuilder();
                String str = fileName;
                c4360dNewBuilder.getClass();
                str.getClass();
                c4360dNewBuilder.f5455b = str;
                c4360dNewBuilder.f5454a |= 1;
                c4360dNewBuilder.onChanged();
                c4360dNewBuilder.m3708i(duration);
                return c4360dNewBuilder.build();
            }
        });
        updateEntity(audioInfoEntityBuildAudioInfoEntity);
        return audioInfoEntityBuildAudioInfoEntity;
    }

    /* renamed from: isRecordChange, reason: from getter */
    public final boolean getIsRecordChange() {
        return this.isRecordChange;
    }

    public final void setRecord(@NotNull RecordEntity recordEntity) {
        AbstractC5830k.m5330g(recordEntity, "recordEntity");
        this.recordEntity = recordEntity;
        this.audioRecordEntity = initRecordEntity();
        this.isRecordChange = false;
    }

    @Nullable
    public final AudioInfoEntity updateAudio(@NotNull String fileName, long duration) {
        ToMany<AudioInfoEntity> audioInfoEntity;
        AudioInfoEntity next;
        AbstractC5830k.m5330g(fileName, "fileName");
        TimeRecord timeRecord = getTimeRecord();
        if (timeRecord != null) {
            timeRecord.setOffsetForAudio(duration);
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
                if (AbstractC5830k.m5325b(EzyCommand$CommandSource.CommandInfo.AudioStart.parseFrom(next.getData()).getFileName(), fileName)) {
                    break;
                }
            }
            AudioInfoEntity audioInfoEntity2 = next;
            if (audioInfoEntity2 != null) {
                audioInfoEntity2.setDuration(duration);
                C4360d c4360dNewBuilder = EzyCommand$CommandSource.CommandInfo.AudioStart.newBuilder();
                c4360dNewBuilder.getClass();
                c4360dNewBuilder.f5455b = fileName;
                c4360dNewBuilder.f5454a |= 1;
                c4360dNewBuilder.onChanged();
                c4360dNewBuilder.m3708i(duration);
                byte[] byteArray = c4360dNewBuilder.build().toByteArray();
                AbstractC5830k.m5329f(byteArray, "builder.build().toByteArray()");
                audioInfoEntity2.setData(byteArray);
                audioInfoEntity2.put();
                return audioInfoEntity2;
            }
        }
        return null;
    }
}
