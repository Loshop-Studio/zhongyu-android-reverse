package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
final class SynchronizedStartStopTokensImpl implements StartStopTokens {
    private final StartStopTokens delegate;
    private final Object lock;

    public SynchronizedStartStopTokensImpl(StartStopTokens delegate) {
        AbstractC9979u.m20294g(delegate, "delegate");
        this.delegate = delegate;
        this.lock = new Object();
    }

    @Override // androidx.work.impl.StartStopTokens
    public boolean contains(WorkGenerationalId id2) {
        boolean zContains;
        AbstractC9979u.m20294g(id2, "id");
        synchronized (this.lock) {
            zContains = this.delegate.contains(id2);
        }
        return zContains;
    }

    @Override // androidx.work.impl.StartStopTokens
    public StartStopToken remove(WorkGenerationalId id2) {
        StartStopToken startStopTokenRemove;
        AbstractC9979u.m20294g(id2, "id");
        synchronized (this.lock) {
            startStopTokenRemove = this.delegate.remove(id2);
        }
        return startStopTokenRemove;
    }

    @Override // androidx.work.impl.StartStopTokens
    public StartStopToken tokenFor(WorkGenerationalId id2) {
        StartStopToken startStopToken;
        AbstractC9979u.m20294g(id2, "id");
        synchronized (this.lock) {
            startStopToken = this.delegate.tokenFor(id2);
        }
        return startStopToken;
    }

    @Override // androidx.work.impl.StartStopTokens
    public List<StartStopToken> remove(String workSpecId) {
        List<StartStopToken> listRemove;
        AbstractC9979u.m20294g(workSpecId, "workSpecId");
        synchronized (this.lock) {
            listRemove = this.delegate.remove(workSpecId);
        }
        return listRemove;
    }
}
