package androidx.work.impl;

import androidx.annotation.RestrictTo;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13558d2 = {"Landroidx/work/impl/WorkerStoppedException;", "Ljava/util/concurrent/CancellationException;", "reason", "", "(I)V", "getReason", "()I", "work-runtime_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class WorkerStoppedException extends CancellationException {
    private final int reason;

    public WorkerStoppedException(int i10) {
        this.reason = i10;
    }

    public final int getReason() {
        return this.reason;
    }
}
