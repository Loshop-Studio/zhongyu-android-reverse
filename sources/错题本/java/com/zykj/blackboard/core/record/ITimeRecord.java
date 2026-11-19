package com.zykj.blackboard.core.record;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.listener.RecordListener;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0007H&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0006J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u0006J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m5110d2 = {"Lcom/zykj/blackboard/core/record/ITimeRecord;", "", "", "time", "Ld6/s;", "init", "(J)V", "", "isRecord", "()Z", "currentTime", "getTime", "(J)J", "reset", "()V", "isAudio", "getDelayTime", "(JZ)J", "startRecord", "stopRecord", "Lcom/zykj/blackboard/listener/RecordListener;", "recordListener", "setListener", "(Lcom/zykj/blackboard/listener/RecordListener;)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public interface ITimeRecord {

    @Metadata(m5111k = 3, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static /* synthetic */ long getDelayTime$default(ITimeRecord iTimeRecord, long j7, boolean z8, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDelayTime");
            }
            if ((i & 2) != 0) {
                z8 = false;
            }
            return iTimeRecord.getDelayTime(j7, z8);
        }
    }

    long getDelayTime(long currentTime, boolean isAudio);

    long getTime(long currentTime);

    void init(long time);

    boolean isRecord();

    void reset();

    void setListener(@NotNull RecordListener recordListener);

    void startRecord(long currentTime);

    void stopRecord(long currentTime);
}
