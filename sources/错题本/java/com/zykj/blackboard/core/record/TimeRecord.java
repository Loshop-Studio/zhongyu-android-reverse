package com.zykj.blackboard.core.record;

import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.listener.RecordListener;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009a8.RunnableC0023a;

@Metadata(m5109d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\tJ\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\tJ\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\tJ\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\tJ\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m5110d2 = {"Lcom/zykj/blackboard/core/record/TimeRecord;", "Lcom/zykj/blackboard/core/record/ITimeRecord;", "<init>", "()V", "Ld6/s;", "reset", "", "time", "init", "(J)V", "", "isRecord", "()Z", "currentTime", "getTime", "(J)J", "isAudio", "getDelayTime", "(JZ)J", "startRecord", "stopRecord", TypedValues.CycleType.S_WAVE_OFFSET, "setOffsetForAudio", "setOffsetForCommand", "Lcom/zykj/blackboard/listener/RecordListener;", "recordListener", "setListener", "(Lcom/zykj/blackboard/listener/RecordListener;)V", "J", "startTime", "prevTimeForCommand", "prevTimeForAudio", "Z", "listener", "Lcom/zykj/blackboard/listener/RecordListener;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class TimeRecord implements ITimeRecord {
    private boolean isRecord;

    @Nullable
    private RecordListener listener;
    private long prevTimeForAudio;
    private long prevTimeForCommand;
    private long startTime;
    private long time;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startRecord$lambda-0, reason: not valid java name */
    public static final void m13796startRecord$lambda0(TimeRecord this$0) throws InterruptedException {
        AbstractC5830k.m5330g(this$0, "this$0");
        long j7 = this$0.startTime;
        while (this$0.isRecord) {
            RecordListener recordListener = this$0.listener;
            if (recordListener != null) {
                recordListener.progress(this$0.getTime(j7));
            }
            j7 += 24;
            Thread.sleep(24L);
        }
    }

    @Override // com.zykj.blackboard.core.record.ITimeRecord
    public long getDelayTime(long currentTime, boolean isAudio) {
        if (!this.isRecord) {
            return 0L;
        }
        long j7 = currentTime - (isAudio ? this.prevTimeForAudio : this.prevTimeForCommand);
        if (isAudio) {
            this.prevTimeForAudio = currentTime;
            return j7;
        }
        Log.i("prevTimeForCommand1", String.valueOf(this.prevTimeForCommand));
        this.prevTimeForCommand = currentTime;
        Log.i("prevTimeForCommand2", String.valueOf(currentTime));
        return j7;
    }

    @Override // com.zykj.blackboard.core.record.ITimeRecord
    public long getTime(long currentTime) {
        if (this.isRecord) {
            this.time = (currentTime - this.startTime) + this.time;
            this.startTime = currentTime;
        }
        return this.time;
    }

    @Override // com.zykj.blackboard.core.record.ITimeRecord
    public void init(long time) {
        this.time = time;
        this.isRecord = false;
    }

    @Override // com.zykj.blackboard.core.record.ITimeRecord
    /* renamed from: isRecord, reason: from getter */
    public boolean getIsRecord() {
        return this.isRecord;
    }

    @Override // com.zykj.blackboard.core.record.ITimeRecord
    public void reset() {
        this.time = 0L;
        this.isRecord = false;
    }

    @Override // com.zykj.blackboard.core.record.ITimeRecord
    public void setListener(@NotNull RecordListener recordListener) {
        AbstractC5830k.m5330g(recordListener, "recordListener");
        this.listener = recordListener;
    }

    public final void setOffsetForAudio(long offset) {
        this.prevTimeForAudio += offset;
    }

    public final void setOffsetForCommand(long offset) {
        this.prevTimeForCommand += offset;
    }

    @Override // com.zykj.blackboard.core.record.ITimeRecord
    public void startRecord(long currentTime) {
        if (this.isRecord) {
            return;
        }
        this.isRecord = true;
        this.startTime = currentTime;
        this.prevTimeForCommand = currentTime - this.prevTimeForCommand;
        this.prevTimeForAudio = currentTime - this.prevTimeForAudio;
        RecordListener recordListener = this.listener;
        if (recordListener != null) {
            recordListener.startRecord();
        }
        new Thread(new RunnableC0023a(this, 25)).start();
    }

    @Override // com.zykj.blackboard.core.record.ITimeRecord
    public void stopRecord(long currentTime) {
        if (this.isRecord) {
            this.time = (currentTime - this.startTime) + this.time;
            this.isRecord = false;
            this.startTime = 0L;
            this.prevTimeForCommand = 0L;
            this.prevTimeForAudio = currentTime - this.prevTimeForAudio;
            RecordListener recordListener = this.listener;
            if (recordListener != null) {
                recordListener.progress(getTime(currentTime));
            }
            RecordListener recordListener2 = this.listener;
            if (recordListener2 != null) {
                recordListener2.stopRecord();
            }
        }
    }
}
