package androidx.compose.runtime;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.snapshots.StateFactoryMarker;
import kotlin.jvm.internal.AbstractC9977s;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
final /* synthetic */ class SnapshotStateKt__DerivedStateKt {
    private static final SnapshotThreadLocal<IntRef> calculationBlockNestedLevel = new SnapshotThreadLocal<>();
    private static final SnapshotThreadLocal<MutableVector<DerivedStateObserver>> derivedStateObservers = new SnapshotThreadLocal<>();

    public static final MutableVector<DerivedStateObserver> derivedStateObservers() {
        SnapshotThreadLocal<MutableVector<DerivedStateObserver>> snapshotThreadLocal = derivedStateObservers;
        MutableVector<DerivedStateObserver> mutableVector = snapshotThreadLocal.get();
        if (mutableVector != null) {
            return mutableVector;
        }
        MutableVector<DerivedStateObserver> mutableVector2 = new MutableVector<>(new DerivedStateObserver[0], 0);
        snapshotThreadLocal.set(mutableVector2);
        return mutableVector2;
    }

    @StateFactoryMarker
    public static final <T> State<T> derivedStateOf(InterfaceC9529a interfaceC9529a) {
        return new DerivedSnapshotState(interfaceC9529a, null);
    }

    private static final <R> R notifyObservers$SnapshotStateKt__DerivedStateKt(DerivedState<?> derivedState, InterfaceC9529a interfaceC9529a) {
        MutableVector<DerivedStateObserver> mutableVectorDerivedStateObservers = SnapshotStateKt.derivedStateObservers();
        DerivedStateObserver[] derivedStateObserverArr = mutableVectorDerivedStateObservers.content;
        int size = mutableVectorDerivedStateObservers.getSize();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            derivedStateObserverArr[i11].start(derivedState);
        }
        try {
            return (R) interfaceC9529a.invoke();
        } finally {
            AbstractC9977s.m20286b(1);
            DerivedStateObserver[] derivedStateObserverArr2 = mutableVectorDerivedStateObservers.content;
            int size2 = mutableVectorDerivedStateObservers.getSize();
            while (i10 < size2) {
                derivedStateObserverArr2[i10].done(derivedState);
                i10++;
            }
            AbstractC9977s.m20285a(1);
        }
    }

    public static final <R> void observeDerivedStateRecalculations(DerivedStateObserver derivedStateObserver, InterfaceC9529a interfaceC9529a) {
        MutableVector<DerivedStateObserver> mutableVectorDerivedStateObservers = SnapshotStateKt.derivedStateObservers();
        try {
            mutableVectorDerivedStateObservers.add(derivedStateObserver);
            interfaceC9529a.invoke();
        } finally {
            AbstractC9977s.m20286b(1);
            mutableVectorDerivedStateObservers.removeAt(mutableVectorDerivedStateObservers.getSize() - 1);
            AbstractC9977s.m20285a(1);
        }
    }

    private static final <T> T withCalculationNestedLevel$SnapshotStateKt__DerivedStateKt(InterfaceC9540l interfaceC9540l) {
        IntRef intRef = (IntRef) calculationBlockNestedLevel.get();
        if (intRef == null) {
            intRef = new IntRef(0);
            calculationBlockNestedLevel.set(intRef);
        }
        return (T) interfaceC9540l.invoke(intRef);
    }

    @StateFactoryMarker
    public static final <T> State<T> derivedStateOf(SnapshotMutationPolicy<T> snapshotMutationPolicy, InterfaceC9529a interfaceC9529a) {
        return new DerivedSnapshotState(interfaceC9529a, snapshotMutationPolicy);
    }
}
