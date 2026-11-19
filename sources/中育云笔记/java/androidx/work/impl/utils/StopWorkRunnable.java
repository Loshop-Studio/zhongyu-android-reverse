package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.impl.Processor;
import androidx.work.impl.StartStopToken;
import kotlin.jvm.internal.AbstractC9979u;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class StopWorkRunnable implements Runnable {
    private final Processor processor;
    private final int reason;
    private final boolean stopInForeground;
    private final StartStopToken token;

    public StopWorkRunnable(Processor processor, StartStopToken token, boolean z10, int i10) {
        AbstractC9979u.m20294g(processor, "processor");
        AbstractC9979u.m20294g(token, "token");
        this.processor = processor;
        this.token = token;
        this.stopInForeground = z10;
        this.reason = i10;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zStopForegroundWork = this.stopInForeground ? this.processor.stopForegroundWork(this.token, this.reason) : this.processor.stopWork(this.token, this.reason);
        Logger.get().debug(Logger.tagWithPrefix("StopWorkRunnable"), "StopWorkRunnable for " + this.token.getId().getWorkSpecId() + "; Processor.stopWork = " + zStopForegroundWork);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StopWorkRunnable(Processor processor, StartStopToken token, boolean z10) {
        this(processor, token, z10, WorkInfo.STOP_REASON_UNKNOWN);
        AbstractC9979u.m20294g(processor, "processor");
        AbstractC9979u.m20294g(token, "token");
    }
}
