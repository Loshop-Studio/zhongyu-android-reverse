package com.zykj.blackboard.core.record;

import com.google.protobuf.Message;
import com.zykj.blackboard.core.data.dao.AudioInfoEntity;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.blackboard.core.record.ITimeRecord;
import com.zykj.board.EzyCommandEnum;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;

/* loaded from: classes4.dex */
public abstract class DataRecorder {
    public static final Companion Companion = new Companion(null);
    public static final int MAX_LENGTH = 100;
    private final TimeRecord timeRecord;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    public DataRecorder(TimeRecord timeRecord) {
        this.timeRecord = timeRecord;
    }

    public final AudioInfoEntity buildAudioInfoEntity(long j10, long j11, EzyCommandEnum.CommandEnum commandEnum, InterfaceC10559a buildCallBack) {
        AbstractC9133u.m16133g(commandEnum, "commandEnum");
        AbstractC9133u.m16133g(buildCallBack, "buildCallBack");
        TimeRecord timeRecord = this.timeRecord;
        boolean z10 = timeRecord != null && timeRecord.isRecord();
        byte[] byteArray = ((Message) buildCallBack.invoke()).toByteArray();
        AbstractC9133u.m16132f(byteArray, "buildCallBack().toByteArray()");
        return new AudioInfoEntity(0L, j10, j11, z10, commandEnum, byteArray);
    }

    public final CommandInfoEntity buildCommandInfoEntity(long j10, long j11, EzyCommandEnum.CommandEnum commandEnum, InterfaceC10559a buildCallBack) {
        AbstractC9133u.m16133g(commandEnum, "commandEnum");
        AbstractC9133u.m16133g(buildCallBack, "buildCallBack");
        TimeRecord timeRecord = this.timeRecord;
        boolean z10 = timeRecord != null && timeRecord.isRecord();
        byte[] byteArray = ((Message) buildCallBack.invoke()).toByteArray();
        AbstractC9133u.m16132f(byteArray, "buildCallBack().toByteArray()");
        return new CommandInfoEntity(0L, j10, j11, z10, commandEnum, byteArray);
    }

    public final long getStartEventTime(long j10, long j11) {
        TimeRecord timeRecord = this.timeRecord;
        long delayTime$default = (timeRecord != null ? ITimeRecord.DefaultImpls.getDelayTime$default(timeRecord, j11, false, 2, null) : 0L) - j10;
        if (delayTime$default < 0) {
            return 0L;
        }
        return delayTime$default;
    }

    public final TimeRecord getTimeRecord() {
        return this.timeRecord;
    }
}
