package androidx.compose.runtime;

/* loaded from: classes2.dex */
public interface ComposeNodeLifecycleCallback {
    void onDeactivate();

    void onRelease();

    void onReuse();
}
