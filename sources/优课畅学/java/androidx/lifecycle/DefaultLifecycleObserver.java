package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public interface DefaultLifecycleObserver extends LifecycleObserver {
    default void onCreate(LifecycleOwner owner) {
        AbstractC9133u.m16133g(owner, "owner");
    }

    default void onDestroy(LifecycleOwner owner) {
        AbstractC9133u.m16133g(owner, "owner");
    }

    default void onPause(LifecycleOwner owner) {
        AbstractC9133u.m16133g(owner, "owner");
    }

    default void onResume(LifecycleOwner owner) {
        AbstractC9133u.m16133g(owner, "owner");
    }

    default void onStart(LifecycleOwner owner) {
        AbstractC9133u.m16133g(owner, "owner");
    }

    default void onStop(LifecycleOwner owner) {
        AbstractC9133u.m16133g(owner, "owner");
    }
}
