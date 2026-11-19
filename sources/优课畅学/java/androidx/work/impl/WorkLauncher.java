package androidx.work.impl;

import androidx.work.WorkInfo;
import androidx.work.WorkerParameters;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public interface WorkLauncher {
    default void startWork(StartStopToken workSpecId) {
        AbstractC9133u.m16133g(workSpecId, "workSpecId");
        startWork(workSpecId, null);
    }

    void startWork(StartStopToken startStopToken, WorkerParameters.RuntimeExtras runtimeExtras);

    default void stopWork(StartStopToken workSpecId) {
        AbstractC9133u.m16133g(workSpecId, "workSpecId");
        stopWork(workSpecId, WorkInfo.STOP_REASON_UNKNOWN);
    }

    void stopWork(StartStopToken startStopToken, int i10);

    default void stopWorkWithReason(StartStopToken workSpecId, int i10) {
        AbstractC9133u.m16133g(workSpecId, "workSpecId");
        stopWork(workSpecId, i10);
    }
}
