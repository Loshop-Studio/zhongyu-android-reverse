package com.zykj.blackboard.core.record;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.protobuf.Message;
import com.zykj.blackboard.core.data.dao.AudioInfoEntity;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.blackboard.core.record.ITimeRecord;
import com.zykj.board.EzyCommandEnum$CommandEnum;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m5110d2 = {"Lcom/zykj/blackboard/core/record/DataRecorder;", "", "Lcom/zykj/blackboard/core/record/TimeRecord;", "timeRecord", "<init>", "(Lcom/zykj/blackboard/core/record/TimeRecord;)V", "", "delayTime", TypedValues.TransitionType.S_DURATION, "Lcom/zykj/board/EzyCommandEnum$CommandEnum;", "commandEnum", "Lkotlin/Function0;", "Lcom/google/protobuf/Message;", "buildCallBack", "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;", "buildCommandInfoEntity", "(JJLcom/zykj/board/EzyCommandEnum$CommandEnum;Lr6/a;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;", "Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;", "buildAudioInfoEntity", "(JJLcom/zykj/board/EzyCommandEnum$CommandEnum;Lr6/a;)Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;", "currentTime", "getStartEventTime", "(JJ)J", "Lcom/zykj/blackboard/core/record/TimeRecord;", "getTimeRecord", "()Lcom/zykj/blackboard/core/record/TimeRecord;", "Companion", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class DataRecorder {
    public static final int MAX_LENGTH = 100;

    @Nullable
    private final TimeRecord timeRecord;

    public DataRecorder(@Nullable TimeRecord timeRecord) {
        this.timeRecord = timeRecord;
    }

    @NotNull
    public final AudioInfoEntity buildAudioInfoEntity(long delayTime, long duration, @NotNull EzyCommandEnum$CommandEnum commandEnum, @NotNull InterfaceC6469a buildCallBack) {
        AbstractC5830k.m5330g(commandEnum, "commandEnum");
        AbstractC5830k.m5330g(buildCallBack, "buildCallBack");
        TimeRecord timeRecord = this.timeRecord;
        boolean z8 = timeRecord != null && timeRecord.getIsRecord();
        byte[] byteArray = ((Message) buildCallBack.invoke()).toByteArray();
        AbstractC5830k.m5329f(byteArray, "buildCallBack().toByteArray()");
        return new AudioInfoEntity(0L, delayTime, duration, z8, commandEnum, byteArray);
    }

    @NotNull
    // RE: 普通编辑仍保存触点时间和笔迹 duration。isPlay 跟随正在录制的状态，决定该笔是否占用回放时长。
    public final CommandInfoEntity buildCommandInfoEntity(long delayTime, long duration, @NotNull EzyCommandEnum$CommandEnum commandEnum, @NotNull InterfaceC6469a buildCallBack) {
        AbstractC5830k.m5330g(commandEnum, "commandEnum");
        AbstractC5830k.m5330g(buildCallBack, "buildCallBack");
        TimeRecord timeRecord = this.timeRecord;
        boolean z8 = timeRecord != null && timeRecord.getIsRecord();
        byte[] byteArray = ((Message) buildCallBack.invoke()).toByteArray();
        AbstractC5830k.m5329f(byteArray, "buildCallBack().toByteArray()");
        return new CommandInfoEntity(0L, delayTime, duration, z8, commandEnum, byteArray);
    }

    public final long getStartEventTime(long duration, long currentTime) {
        TimeRecord timeRecord = this.timeRecord;
        long delayTime$default = (timeRecord != null ? ITimeRecord.DefaultImpls.getDelayTime$default(timeRecord, currentTime, false, 2, null) : 0L) - duration;
        if (delayTime$default < 0) {
            return 0L;
        }
        return delayTime$default;
    }

    @Nullable
    public final TimeRecord getTimeRecord() {
        return this.timeRecord;
    }
}
