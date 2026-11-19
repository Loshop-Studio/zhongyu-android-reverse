package androidx.compose.runtime;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.snapshots.StateFactoryMarker;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000\u001a\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\nH\u0007\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\b0\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\nH\u0007\u001a0\u0010\r\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0082\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0014\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0016\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0080\b\u001a*\u0010\u0017\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\b0\u0018H\u0082\b¢\u0006\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m13558d2 = {"calculationBlockNestedLevel", "Landroidx/compose/runtime/internal/SnapshotThreadLocal;", "Landroidx/compose/runtime/internal/IntRef;", "derivedStateObservers", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/DerivedStateObserver;", "derivedStateOf", "Landroidx/compose/runtime/State;", ExifInterface.GPS_DIRECTION_TRUE, "calculation", "Lkotlin/Function0;", "policy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "notifyObservers", "R", "derivedState", "Landroidx/compose/runtime/DerivedState;", "block", "notifyObservers$SnapshotStateKt__DerivedStateKt", "(Landroidx/compose/runtime/DerivedState;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "observeDerivedStateRecalculations", "", "observer", "withCalculationNestedLevel", "Lkotlin/Function1;", "withCalculationNestedLevel$SnapshotStateKt__DerivedStateKt", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "runtime_release"}, m13559k = 5, m13560mv = {1, 9, 0}, m13562xi = 48, m13563xs = "androidx/compose/runtime/SnapshotStateKt")
@SourceDebugExtension({"SMAP\nDerivedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,401:1\n1#2:402\n1084#3:403\n423#4,9:404\n423#4,9:413\n44#4:422\n*S KotlinDebug\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n*L\n370#1:403\n374#1:404,9\n378#1:413,9\n398#1:422\n*E\n"})
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
    public static final <T> State<T> derivedStateOf(Function0<? extends T> function0) {
        return new DerivedSnapshotState(function0, null);
    }

    private static final <R> R notifyObservers$SnapshotStateKt__DerivedStateKt(DerivedState<?> derivedState, Function0<? extends R> function0) {
        MutableVector<DerivedStateObserver> mutableVectorDerivedStateObservers = SnapshotStateKt.derivedStateObservers();
        DerivedStateObserver[] derivedStateObserverArr = mutableVectorDerivedStateObservers.content;
        int size = mutableVectorDerivedStateObservers.getSize();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            derivedStateObserverArr[i11].start(derivedState);
        }
        try {
            return function0.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            DerivedStateObserver[] derivedStateObserverArr2 = mutableVectorDerivedStateObservers.content;
            int size2 = mutableVectorDerivedStateObservers.getSize();
            while (i10 < size2) {
                derivedStateObserverArr2[i10].done(derivedState);
                i10++;
            }
            InlineMarker.finallyEnd(1);
        }
    }

    public static final <R> void observeDerivedStateRecalculations(DerivedStateObserver derivedStateObserver, Function0<? extends R> function0) {
        MutableVector<DerivedStateObserver> mutableVectorDerivedStateObservers = SnapshotStateKt.derivedStateObservers();
        try {
            mutableVectorDerivedStateObservers.add(derivedStateObserver);
            function0.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            mutableVectorDerivedStateObservers.removeAt(mutableVectorDerivedStateObservers.getSize() - 1);
            InlineMarker.finallyEnd(1);
        }
    }

    private static final <T> T withCalculationNestedLevel$SnapshotStateKt__DerivedStateKt(Function1<? super IntRef, ? extends T> function1) {
        IntRef intRef = (IntRef) calculationBlockNestedLevel.get();
        if (intRef == null) {
            intRef = new IntRef(0);
            calculationBlockNestedLevel.set(intRef);
        }
        return function1.invoke(intRef);
    }

    @StateFactoryMarker
    public static final <T> State<T> derivedStateOf(SnapshotMutationPolicy<T> snapshotMutationPolicy, Function0<? extends T> function0) {
        return new DerivedSnapshotState(function0, snapshotMutationPolicy);
    }
}
