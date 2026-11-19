package com.zykj.blackboard.core.record;

import com.zykj.blackboard.listener.RecordListener;

/* loaded from: classes4.dex */
public interface ITimeRecord {

    public static final class DefaultImpls {
        public static /* synthetic */ long getDelayTime$default(ITimeRecord iTimeRecord, long j10, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDelayTime");
            }
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return iTimeRecord.getDelayTime(j10, z10);
        }
    }

    long getDelayTime(long j10, boolean z10);

    long getTime(long j10);

    void init(long j10);

    boolean isRecord();

    void reset();

    void setListener(RecordListener recordListener);

    void startRecord(long j10);

    void stopRecord(long j10);
}
