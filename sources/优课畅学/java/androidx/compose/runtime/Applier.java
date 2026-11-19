package androidx.compose.runtime;

import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public interface Applier<N> {

    public static final class DefaultImpls {
        @Deprecated
        public static <N> void apply(Applier<N> applier, InterfaceC10574p interfaceC10574p, Object obj) {
            Applier.super.apply(interfaceC10574p, obj);
        }

        @Deprecated
        public static <N> void onBeginChanges(Applier<N> applier) {
            Applier.super.onBeginChanges();
        }

        @Deprecated
        public static <N> void onEndChanges(Applier<N> applier) {
            Applier.super.onEndChanges();
        }

        @Deprecated
        public static <N> void reuse(Applier<N> applier) {
            Applier.super.reuse();
        }
    }

    default void apply(InterfaceC10574p interfaceC10574p, Object obj) {
        interfaceC10574p.invoke(getCurrent(), obj);
    }

    void clear();

    void down(N n10);

    N getCurrent();

    void insertBottomUp(int i10, N n10);

    void insertTopDown(int i10, N n10);

    void move(int i10, int i11, int i12);

    default void onBeginChanges() {
    }

    default void onEndChanges() {
    }

    void remove(int i10, int i11);

    default void reuse() {
        N current = getCurrent();
        ComposeNodeLifecycleCallback composeNodeLifecycleCallback = current instanceof ComposeNodeLifecycleCallback ? (ComposeNodeLifecycleCallback) current : null;
        if (composeNodeLifecycleCallback != null) {
            composeNodeLifecycleCallback.onReuse();
        }
    }

    /* renamed from: up */
    void mo972up();
}
