package com.zykj.blackboard.core.record;

import android.util.Log;
import com.zykj.blackboard.core.record.TimeRecord;
import com.zykj.blackboard.listener.RecordListener;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class TimeRecord implements ITimeRecord {
    private boolean isRecord;
    private RecordListener listener;
    private long prevTimeForAudio;
    private long prevTimeForCommand;
    private long startTime;
    private long time;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startRecord$lambda-0, reason: not valid java name */
    public static final void m27460startRecord$lambda0(TimeRecord this$0) throws InterruptedException {
        AbstractC9133u.m16133g(this$0, "this$0");
        long j10 = this$0.startTime;
        while (this$0.isRecord) {
            RecordListener recordListener = this$0.listener;
            if (recordListener != null) {
                recordListener.progress(this$0.getTime(j10));
            }
            j10 += 24;
            Thread.sleep(24L);
        }
    }

    @Override // com.zykj.blackboard.core.record.ITimeRecord
    public long getDelayTime(long j10, boolean z10) {
        if (!this.isRecord) {
            return 0L;
        }
        long j11 = j10 - (z10 ? this.prevTimeForAudio : this.prevTimeForCommand);
        if (z10) {
            this.prevTimeForAudio = j10;
            return j11;
        }
        Log.i("prevTimeForCommand1", String.valueOf(this.prevTimeForCommand));
        this.prevTimeForCommand = j10;
        Log.i("prevTimeForCommand2", String.valueOf(j10));
        return j11;
    }

    @Override // com.zykj.blackboard.core.record.ITimeRecord
    public long getTime(long j10) {
        if (this.isRecord) {
            this.time += j10 - this.startTime;
            this.startTime = j10;
        }
        return this.time;
    }

    @Override // com.zykj.blackboard.core.record.ITimeRecord
    public void init(long j10) {
        this.time = j10;
        this.isRecord = false;
    }

    @Override // com.zykj.blackboard.core.record.ITimeRecord
    public boolean isRecord() {
        return this.isRecord;
    }

    @Override // com.zykj.blackboard.core.record.ITimeRecord
    public void reset() {
        this.time = 0L;
        this.isRecord = false;
    }

    @Override // com.zykj.blackboard.core.record.ITimeRecord
    public void setListener(RecordListener recordListener) {
        AbstractC9133u.m16133g(recordListener, "recordListener");
        this.listener = recordListener;
    }

    public final void setOffsetForAudio(long j10) {
        this.prevTimeForAudio += j10;
    }

    public final void setOffsetForCommand(long j10) {
        this.prevTimeForCommand += j10;
    }

    @Override // com.zykj.blackboard.core.record.ITimeRecord
    public void startRecord(long j10) {
        if (this.isRecord) {
            return;
        }
        this.isRecord = true;
        this.startTime = j10;
        this.prevTimeForCommand = j10 - this.prevTimeForCommand;
        this.prevTimeForAudio = j10 - this.prevTimeForAudio;
        RecordListener recordListener = this.listener;
        if (recordListener != null) {
            recordListener.startRecord();
        }
        new Thread(new Runnable() { // from class: c3.a
            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                TimeRecord.m27460startRecord$lambda0(this.f2318a);
            }
        }).start();
    }

    @Override // com.zykj.blackboard.core.record.ITimeRecord
    public void stopRecord(long j10) {
        if (this.isRecord) {
            this.time += j10 - this.startTime;
            this.isRecord = false;
            this.startTime = 0L;
            this.prevTimeForCommand = 0L;
            this.prevTimeForAudio = j10 - this.prevTimeForAudio;
            RecordListener recordListener = this.listener;
            if (recordListener != null) {
                recordListener.progress(getTime(j10));
            }
            RecordListener recordListener2 = this.listener;
            if (recordListener2 != null) {
                recordListener2.stopRecord();
            }
        }
    }
}
