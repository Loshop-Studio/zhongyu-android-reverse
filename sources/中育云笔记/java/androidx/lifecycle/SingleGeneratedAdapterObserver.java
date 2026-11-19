package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class SingleGeneratedAdapterObserver implements LifecycleEventObserver {
    private final GeneratedAdapter generatedAdapter;

    public SingleGeneratedAdapterObserver(GeneratedAdapter generatedAdapter) {
        AbstractC9979u.m20294g(generatedAdapter, "generatedAdapter");
        this.generatedAdapter = generatedAdapter;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        AbstractC9979u.m20294g(source, "source");
        AbstractC9979u.m20294g(event, "event");
        this.generatedAdapter.callMethods(source, event, false, null);
        this.generatedAdapter.callMethods(source, event, true, null);
    }
}
