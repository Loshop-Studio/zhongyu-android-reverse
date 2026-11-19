package androidx.compose.runtime;

@InternalComposeTracingApi
/* loaded from: classes2.dex */
public interface CompositionTracer {
    boolean isTraceInProgress();

    void traceEventEnd();

    void traceEventStart(int i10, int i11, int i12, String str);
}
