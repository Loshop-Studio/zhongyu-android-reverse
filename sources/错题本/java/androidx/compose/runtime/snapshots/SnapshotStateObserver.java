package androidx.compose.runtime.snapshots;

import androidx.autofill.HintConstants;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMap;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.DerivedStateObserver;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Thread_jvmKt;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.AbstractC5802q;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5835p;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001KB0\u0012'\u0010\b\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u001b\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00040\u0002H\u0082\b¢\u0006\u0004\b\u001b\u0010\nJ$\u0010\u001c\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000b0\u0002H\u0082\b¢\u0006\u0004\b\u001c\u0010\nJ-\u0010\u001f\u001a\u00020\u0019\"\b\b\u0000\u0010\u001d*\u00020\u00012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\u001f\u0010 JA\u0010#\u001a\u00020\u0004\"\b\b\u0000\u0010\u001d*\u00020\u00012\u0006\u0010!\u001a\u00028\u00002\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b#\u0010$J\u001d\u0010%\u001a\u00020\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0001¢\u0006\u0004\b'\u0010(J0\u0010*\u001a\u00020\u00042!\u0010)\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u000b0\u0002¢\u0006\u0004\b*\u0010\nJ\r\u0010+\u001a\u00020\u0004¢\u0006\u0004\b+\u0010\u000fJ\r\u0010,\u001a\u00020\u0004¢\u0006\u0004\b,\u0010\u000fJ%\u00100\u001a\u00020\u00042\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\u0006\u0010/\u001a\u00020.H\u0007¢\u0006\u0004\b0\u00101J\r\u0010'\u001a\u00020\u0004¢\u0006\u0004\b'\u0010\u000fR5\u0010\b\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00102R(\u00105\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000103j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`48\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R,\u0010:\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0004098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R \u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00102R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00190=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u00108R\u0018\u0010F\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010I\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006L"}, m5110d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "Ld6/s;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "callback", "onChangedExecutor", "<init>", "(Lr6/c;)V", "", "drainChanges", "()Z", "sendNotifications", "()V", "", "set", "addChanges", "(Ljava/util/Set;)V", "removeChanges", "()Ljava/util/Set;", "", "report", "()Ljava/lang/Void;", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "block", "forEachScopeMap", "removeScopeMapIf", ExifInterface.GPS_DIRECTION_TRUE, "onChanged", "ensureMap", "(Lr6/c;)Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "scope", "onValueChangedForScope", "observeReads", "(Ljava/lang/Object;Lr6/c;Lr6/a;)V", "withNoObservations", "(Lr6/a;)V", "clear", "(Ljava/lang/Object;)V", "predicate", "clearIf", "start", "stop", "changes", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "notifyChanges", "(Ljava/util/Set;Landroidx/compose/runtime/snapshots/Snapshot;)V", "Lr6/c;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/internal/AtomicReference;", "pendingChanges", "Ljava/util/concurrent/atomic/AtomicReference;", "sendingNotifications", "Z", "Lkotlin/Function2;", "applyObserver", "Lr6/e;", "readObserver", "Landroidx/compose/runtime/collection/MutableVector;", "observedScopeMaps", "Landroidx/compose/runtime/collection/MutableVector;", "observedScopeMapsLock", "Ljava/lang/Object;", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "applyUnsubscribe", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "isPaused", "currentMap", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "", "currentMapThreadId", "J", "ObservedScopeMap", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n*L\n1#1,597:1\n183#1:604\n184#1:616\n187#1:652\n188#1:670\n187#1:671\n188#1:689\n183#1:690\n184#1:702\n1101#2:598\n1083#2,2:599\n27#3:601\n33#3,2:602\n33#3,2:605\n33#3,2:617\n33#3,2:628\n33#3,2:645\n33#3,2:653\n33#3,2:672\n33#3,2:691\n423#4,9:607\n423#4,9:619\n740#4,15:630\n740#4,15:655\n740#4,15:674\n423#4,9:693\n347#4,8:703\n641#4,2:711\n33#5,5:647\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver\n*L\n71#1:604\n71#1:616\n278#1:652\n278#1:670\n289#1:671\n289#1:689\n316#1:690\n316#1:702\n174#1:598\n174#1:599,2\n175#1:601\n65#1:602,2\n71#1:605,2\n183#1:617,2\n187#1:628,2\n222#1:645,2\n278#1:653,2\n289#1:672,2\n316#1:691,2\n71#1:607,9\n183#1:619,9\n187#1:630,15\n278#1:655,15\n289#1:674,15\n316#1:693,9\n327#1:703,8\n330#1:711,2\n229#1:647,5\n*E\n"})
/* loaded from: classes.dex */
public final class SnapshotStateObserver {
    public static final int $stable = 8;

    @Nullable
    private ObserverHandle applyUnsubscribe;

    @Nullable
    private ObservedScopeMap currentMap;
    private boolean isPaused;

    @NotNull
    private final InterfaceC6471c onChangedExecutor;
    private boolean sendingNotifications;

    @NotNull
    private final AtomicReference<Object> pendingChanges = new AtomicReference<>(null);

    @NotNull
    private final InterfaceC6473e applyObserver = new InterfaceC6473e() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$applyObserver$1
        {
            super(2);
        }

        @Override // p152r6.InterfaceC6473e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Set<? extends Object>) obj, (Snapshot) obj2);
            return C5443s.f8405a;
        }

        public final void invoke(Set<? extends Object> set, Snapshot snapshot) {
            this.this$0.addChanges(set);
            if (this.this$0.drainChanges()) {
                this.this$0.sendNotifications();
            }
        }
    };

    @NotNull
    private final InterfaceC6471c readObserver = new InterfaceC6471c() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$readObserver$1
        {
            super(1);
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m10245invoke(obj);
            return C5443s.f8405a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m10245invoke(Object obj) {
            if (this.this$0.isPaused) {
                return;
            }
            Object obj2 = this.this$0.observedScopeMapsLock;
            SnapshotStateObserver snapshotStateObserver = this.this$0;
            synchronized (obj2) {
                SnapshotStateObserver.ObservedScopeMap observedScopeMap = snapshotStateObserver.currentMap;
                AbstractC5830k.m5327d(observedScopeMap);
                observedScopeMap.recordRead(obj);
            }
        }
    };

    @NotNull
    private final MutableVector<ObservedScopeMap> observedScopeMaps = new MutableVector<>(new ObservedScopeMap[16], 0);

    @NotNull
    private final Object observedScopeMapsLock = new Object();
    private long currentMapThreadId = -1;

    public SnapshotStateObserver(@NotNull InterfaceC6471c interfaceC6471c) {
        this.onChangedExecutor = interfaceC6471c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void addChanges(Set<? extends Object> set) {
        Set<? extends Object> setM5240t0;
        while (true) {
            Object obj = this.pendingChanges.get();
            if (obj == null) {
                setM5240t0 = set;
            } else if (obj instanceof Set) {
                setM5240t0 = AbstractC5806u.m5287z(obj, set);
            } else {
                if (!(obj instanceof List)) {
                    report();
                    throw new KotlinNothingValueException();
                }
                setM5240t0 = AbstractC5805t.m5240t0((Collection) obj, AbstractC5806u.m5286y(set));
            }
            AtomicReference<Object> atomicReference = this.pendingChanges;
            while (!atomicReference.compareAndSet(obj, setM5240t0)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean drainChanges() {
        boolean z8;
        synchronized (this.observedScopeMapsLock) {
            z8 = this.sendingNotifications;
        }
        if (z8) {
            return false;
        }
        boolean z9 = false;
        while (true) {
            Set<? extends Object> setRemoveChanges = removeChanges();
            if (setRemoveChanges == null) {
                return z9;
            }
            synchronized (this.observedScopeMapsLock) {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i = 0; i < size; i++) {
                    z9 = observedScopeMapArr[i].recordInvalidation(setRemoveChanges) || z9;
                }
            }
        }
    }

    private final <T> ObservedScopeMap ensureMap(InterfaceC6471c onChanged) {
        ObservedScopeMap observedScopeMap;
        MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
        ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
        int size = mutableVector.getSize();
        int i = 0;
        while (true) {
            if (i >= size) {
                observedScopeMap = null;
                break;
            }
            observedScopeMap = observedScopeMapArr[i];
            if (observedScopeMap.getOnChanged() == onChanged) {
                break;
            }
            i++;
        }
        ObservedScopeMap observedScopeMap2 = observedScopeMap;
        if (observedScopeMap2 != null) {
            return observedScopeMap2;
        }
        AbstractC5830k.m5328e(onChanged, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
        AbstractC5835p.m5354c(1, onChanged);
        ObservedScopeMap observedScopeMap3 = new ObservedScopeMap(onChanged);
        this.observedScopeMaps.add(observedScopeMap3);
        return observedScopeMap3;
    }

    private final void forEachScopeMap(InterfaceC6471c block) {
        synchronized (this.observedScopeMapsLock) {
            MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
            ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i = 0; i < size; i++) {
                block.invoke(observedScopeMapArr[i]);
            }
        }
    }

    private final Set<Object> removeChanges() {
        Set<Object> set;
        while (true) {
            Object obj = this.pendingChanges.get();
            Object objSubList = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else {
                if (!(obj instanceof List)) {
                    report();
                    throw new KotlinNothingValueException();
                }
                List list = (List) obj;
                Set<Object> set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    objSubList = list.get(1);
                } else if (list.size() > 2) {
                    objSubList = list.subList(1, list.size());
                }
                set = set2;
            }
            AtomicReference<Object> atomicReference = this.pendingChanges;
            while (!atomicReference.compareAndSet(obj, objSubList)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            return set;
        }
    }

    private final void removeScopeMapIf(InterfaceC6471c block) {
        synchronized (this.observedScopeMapsLock) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                int i = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    if (((Boolean) block.invoke(mutableVector.content[i8])).booleanValue()) {
                        i++;
                    } else if (i > 0) {
                        ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
                        observedScopeMapArr[i8 - i] = observedScopeMapArr[i8];
                    }
                }
                int i9 = size - i;
                AbstractC5802q.m5186M(null, mutableVector.content, i9, size);
                mutableVector.setSize(i9);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final Void report() {
        ComposerKt.composeRuntimeError("Unexpected notification");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendNotifications() {
        this.onChangedExecutor.invoke(new InterfaceC6469a() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver.sendNotifications.1
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m10246invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m10246invoke() {
                do {
                    Object obj = SnapshotStateObserver.this.observedScopeMapsLock;
                    SnapshotStateObserver snapshotStateObserver = SnapshotStateObserver.this;
                    synchronized (obj) {
                        try {
                            if (!snapshotStateObserver.sendingNotifications) {
                                snapshotStateObserver.sendingNotifications = true;
                                try {
                                    MutableVector mutableVector = snapshotStateObserver.observedScopeMaps;
                                    Object[] objArr = mutableVector.content;
                                    int size = mutableVector.getSize();
                                    for (int i = 0; i < size; i++) {
                                        ((ObservedScopeMap) objArr[i]).notifyInvalidatedScopes();
                                    }
                                    snapshotStateObserver.sendingNotifications = false;
                                } finally {
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } while (SnapshotStateObserver.this.drainChanges());
            }
        });
    }

    public final void clear(@NotNull Object scope) {
        synchronized (this.observedScopeMapsLock) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                int i = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    ObservedScopeMap observedScopeMap = mutableVector.content[i8];
                    observedScopeMap.clearScopeObservations(scope);
                    if (!observedScopeMap.hasScopeObservations()) {
                        i++;
                    } else if (i > 0) {
                        ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
                        observedScopeMapArr[i8 - i] = observedScopeMapArr[i8];
                    }
                }
                int i9 = size - i;
                AbstractC5802q.m5186M(null, mutableVector.content, i9, size);
                mutableVector.setSize(i9);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void clearIf(@NotNull InterfaceC6471c predicate) {
        synchronized (this.observedScopeMapsLock) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                int i = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    ObservedScopeMap observedScopeMap = mutableVector.content[i8];
                    observedScopeMap.removeScopeIf(predicate);
                    if (!observedScopeMap.hasScopeObservations()) {
                        i++;
                    } else if (i > 0) {
                        ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
                        observedScopeMapArr[i8 - i] = observedScopeMapArr[i8];
                    }
                }
                int i9 = size - i;
                AbstractC5802q.m5186M(null, mutableVector.content, i9, size);
                mutableVector.setSize(i9);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @TestOnly
    public final void notifyChanges(@NotNull Set<? extends Object> changes, @NotNull Snapshot snapshot) {
        this.applyObserver.invoke(changes, snapshot);
    }

    public final <T> void observeReads(@NotNull T scope, @NotNull InterfaceC6471c onValueChangedForScope, @NotNull InterfaceC6469a block) {
        ObservedScopeMap observedScopeMapEnsureMap;
        synchronized (this.observedScopeMapsLock) {
            observedScopeMapEnsureMap = ensureMap(onValueChangedForScope);
        }
        boolean z8 = this.isPaused;
        ObservedScopeMap observedScopeMap = this.currentMap;
        long j7 = this.currentMapThreadId;
        if (j7 != -1) {
            if (!(j7 == Thread_jvmKt.currentThreadId())) {
                PreconditionsKt.throwIllegalArgumentException("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j7 + "), currentThread={id=" + Thread_jvmKt.currentThreadId() + ", name=" + Thread_jvmKt.currentThreadName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            }
        }
        try {
            this.isPaused = false;
            this.currentMap = observedScopeMapEnsureMap;
            this.currentMapThreadId = Thread_jvmKt.currentThreadId();
            observedScopeMapEnsureMap.observe(scope, this.readObserver, block);
        } finally {
            this.currentMap = observedScopeMap;
            this.isPaused = z8;
            this.currentMapThreadId = j7;
        }
    }

    public final void start() {
        this.applyUnsubscribe = Snapshot.INSTANCE.registerApplyObserver(this.applyObserver);
    }

    public final void stop() {
        ObserverHandle observerHandle = this.applyUnsubscribe;
        if (observerHandle != null) {
            observerHandle.dispose();
        }
    }

    @Deprecated(message = "Replace with Snapshot.withoutReadObservation()", replaceWith = @ReplaceWith(expression = "Snapshot.withoutReadObservation(block)", imports = {"androidx.compose.runtime.snapshots.Snapshot"}))
    public final void withNoObservations(@NotNull InterfaceC6469a block) {
        boolean z8 = this.isPaused;
        this.isPaused = true;
        try {
            block.invoke();
        } finally {
            this.isPaused = z8;
        }
    }

    @Metadata(m5109d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u0011J7\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0019\u0010\u0011J0\u0010\u001e\u001a\u00020\u00032!\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u001c0\u0002¢\u0006\u0004\b\u001e\u0010\u0006J\r\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0003¢\u0006\u0004\b!\u0010\"J\u001b\u0010%\u001a\u00020\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010#¢\u0006\u0004\b%\u0010&J\u0019\u0010)\u001a\u00020\u00032\n\u0010(\u001a\u0006\u0012\u0002\b\u00030'¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0003¢\u0006\u0004\b+\u0010\"R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010.R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010/R\u001e\u00100\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00102R&\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b4\u00105R&\u00107\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00105R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0001088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001e\u0010<\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030'0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0017\u0010?\u001a\u00020>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u00102R*\u0010D\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030'038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bD\u00105R<\u0010G\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030'\u0012\u0006\u0012\u0004\u0018\u00010\u00010Ej\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030'\u0012\u0006\u0012\u0004\u0018\u00010\u0001`F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006I"}, m5110d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "", "Lkotlin/Function1;", "Ld6/s;", "onChanged", "<init>", "(Lr6/c;)V", "value", "", "currentToken", "currentScope", "Landroidx/collection/MutableObjectIntMap;", "recordedValues", "recordRead", "(Ljava/lang/Object;ILjava/lang/Object;Landroidx/collection/MutableObjectIntMap;)V", "scope", "clearObsoleteStateReads", "(Ljava/lang/Object;)V", "removeObservation", "(Ljava/lang/Object;Ljava/lang/Object;)V", "readObserver", "Lkotlin/Function0;", "block", "observe", "(Ljava/lang/Object;Lr6/c;Lr6/a;)V", "clearScopeObservations", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "", "predicate", "removeScopeIf", "hasScopeObservations", "()Z", "clear", "()V", "", "changes", "recordInvalidation", "(Ljava/util/Set;)Z", "Landroidx/compose/runtime/DerivedState;", "derivedState", "rereadDerivedState", "(Landroidx/compose/runtime/DerivedState;)V", "notifyInvalidatedScopes", "Lr6/c;", "getOnChanged", "()Lr6/c;", "Ljava/lang/Object;", "currentScopeReads", "Landroidx/collection/MutableObjectIntMap;", "I", "Landroidx/compose/runtime/collection/ScopeMap;", "valueToScopes", "Landroidx/collection/MutableScatterMap;", "Landroidx/collection/MutableScatterMap;", "scopeToValues", "Landroidx/collection/MutableScatterSet;", "invalidated", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/runtime/collection/MutableVector;", "statesToReread", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/DerivedStateObserver;", "derivedStateObserver", "Landroidx/compose/runtime/DerivedStateObserver;", "getDerivedStateObserver", "()Landroidx/compose/runtime/DerivedStateObserver;", "deriveStateScopeCount", "dependencyToDerivedStates", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "recordedDerivedStateValues", "Ljava/util/HashMap;", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 6 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 8 ObjectIntMap.kt\nandroidx/collection/MutableObjectIntMap\n+ 9 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 10 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 11 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n+ 12 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 13 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n+ 14 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 15 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,597:1\n1101#2:598\n1083#2,2:599\n403#3,3:601\n367#3,6:604\n377#3,3:611\n380#3,2:615\n383#3,6:618\n406#3:624\n367#3,6:636\n377#3,3:643\n380#3,2:647\n383#3,6:653\n395#3,4:660\n367#3,6:664\n377#3,3:671\n380#3,9:675\n399#3:684\n395#3,4:700\n367#3,6:704\n377#3,3:711\n380#3,9:715\n399#3:724\n1399#4:610\n1270#4:614\n1399#4:642\n1270#4:646\n1399#4:670\n1270#4:674\n1399#4:692\n1270#4:696\n1399#4:710\n1270#4:714\n1399#4:748\n1270#4:752\n1399#4:772\n1270#4:776\n1399#4:795\n1270#4:799\n1399#4:838\n1270#4:842\n1399#4:874\n1270#4:878\n1399#4:912\n1270#4:916\n1399#4:935\n1270#4:939\n1399#4:978\n1270#4:982\n1399#4:1014\n1270#4:1018\n1399#4:1061\n1270#4:1065\n1399#4:1090\n1270#4:1094\n57#5:617\n57#5:625\n57#5:755\n393#6,6:626\n399#6,2:633\n44#7:632\n519#7:1035\n423#7,9:1036\n775#8:635\n777#8,4:649\n781#8:659\n842#9:685\n844#9:699\n845#9,3:725\n848#9:734\n329#10,6:686\n339#10,3:693\n342#10,2:697\n345#10,6:728\n41#11,3:735\n46#11:900\n48#11:1034\n231#12,3:738\n200#12,7:741\n211#12,3:749\n214#12,2:753\n231#12,3:762\n200#12,7:765\n211#12,3:773\n214#12,2:777\n231#12,3:785\n200#12,7:788\n211#12,3:796\n214#12,9:800\n234#12:809\n217#12,6:814\n234#12:820\n231#12,3:828\n200#12,7:831\n211#12,3:839\n214#12,9:843\n234#12:852\n231#12,3:864\n200#12,7:867\n211#12,3:875\n214#12,9:879\n234#12:888\n217#12,6:893\n234#12:899\n231#12,3:902\n200#12,7:905\n211#12,3:913\n214#12,2:917\n231#12,3:925\n200#12,7:928\n211#12,3:936\n214#12,9:940\n234#12:949\n217#12,6:954\n234#12:960\n231#12,3:968\n200#12,7:971\n211#12,3:979\n214#12,9:983\n234#12:992\n231#12,3:1004\n200#12,7:1007\n211#12,3:1015\n214#12,9:1019\n234#12:1028\n231#12,3:1051\n200#12,7:1054\n211#12,3:1062\n214#12,2:1066\n217#12,6:1069\n234#12:1075\n231#12,3:1080\n200#12,7:1083\n211#12,3:1091\n214#12,9:1095\n234#12:1104\n67#13,6:756\n67#13,6:779\n75#13,4:810\n75#13:821\n67#13,6:822\n75#13,4:853\n78#13:857\n67#13,6:858\n75#13,4:889\n67#13,6:919\n75#13,4:950\n75#13:961\n67#13,6:962\n75#13,4:993\n78#13:997\n67#13,6:998\n75#13,4:1029\n67#13,6:1045\n75#13,4:1076\n1855#14:901\n1856#14:1033\n1#15:1068\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n*L\n365#1:598\n365#1:599,2\n431#1:601,3\n431#1:604,6\n431#1:611,3\n431#1:615,2\n431#1:618,6\n431#1:624\n472#1:636,6\n472#1:643,3\n472#1:647,2\n472#1:653,6\n484#1:660,4\n484#1:664,6\n484#1:671,3\n484#1:675,9\n484#1:684\n492#1:700,4\n492#1:704,6\n492#1:711,3\n492#1:715,9\n492#1:724\n431#1:610\n431#1:614\n472#1:642\n472#1:646\n484#1:670\n484#1:674\n489#1:692\n489#1:696\n492#1:710\n492#1:714\n529#1:748\n529#1:752\n536#1:772\n536#1:776\n548#1:795\n548#1:799\n548#1:838\n548#1:842\n559#1:874\n559#1:878\n536#1:912\n536#1:916\n548#1:935\n548#1:939\n548#1:978\n548#1:982\n559#1:1014\n559#1:1018\n577#1:1061\n577#1:1065\n592#1:1090\n592#1:1094\n433#1:617\n441#1:625\n530#1:755\n459#1:626,6\n459#1:633,2\n459#1:632\n565#1:1035\n566#1:1036,9\n472#1:635\n472#1:649,4\n472#1:659\n489#1:685\n489#1:699\n489#1:725,3\n489#1:734\n489#1:686,6\n489#1:693,3\n489#1:697,2\n489#1:728,6\n529#1:735,3\n529#1:900\n529#1:1034\n529#1:738,3\n529#1:741,7\n529#1:749,3\n529#1:753,2\n536#1:762,3\n536#1:765,7\n536#1:773,3\n536#1:777,2\n548#1:785,3\n548#1:788,7\n548#1:796,3\n548#1:800,9\n548#1:809\n536#1:814,6\n536#1:820\n548#1:828,3\n548#1:831,7\n548#1:839,3\n548#1:843,9\n548#1:852\n559#1:864,3\n559#1:867,7\n559#1:875,3\n559#1:879,9\n559#1:888\n529#1:893,6\n529#1:899\n536#1:902,3\n536#1:905,7\n536#1:913,3\n536#1:917,2\n548#1:925,3\n548#1:928,7\n548#1:936,3\n548#1:940,9\n548#1:949\n536#1:954,6\n536#1:960\n548#1:968,3\n548#1:971,7\n548#1:979,3\n548#1:983,9\n548#1:992\n559#1:1004,3\n559#1:1007,7\n559#1:1015,3\n559#1:1019,9\n559#1:1028\n577#1:1051,3\n577#1:1054,7\n577#1:1062,3\n577#1:1066,2\n577#1:1069,6\n577#1:1075\n592#1:1080,3\n592#1:1083,7\n592#1:1091,3\n592#1:1095,9\n592#1:1104\n536#1:756,6\n548#1:779,6\n548#1:810,4\n536#1:821\n548#1:822,6\n548#1:853,4\n536#1:857\n559#1:858,6\n559#1:889,4\n548#1:919,6\n548#1:950,4\n536#1:961\n548#1:962,6\n548#1:993,4\n536#1:997\n559#1:998,6\n559#1:1029,4\n577#1:1045,6\n577#1:1076,4\n529#1:901\n529#1:1033\n*E\n"})
    public static final class ObservedScopeMap {

        @Nullable
        private Object currentScope;

        @Nullable
        private MutableObjectIntMap<Object> currentScopeReads;
        private int deriveStateScopeCount;

        @NotNull
        private final MutableScatterSet<Object> invalidated;

        @NotNull
        private final InterfaceC6471c onChanged;

        @NotNull
        private final MutableScatterMap<Object, MutableObjectIntMap<Object>> scopeToValues;
        private int currentToken = -1;

        @NotNull
        private final MutableScatterMap<Object, Object> valueToScopes = ScopeMap.m10209constructorimpl$default(null, 1, null);

        @NotNull
        private final MutableVector<DerivedState<?>> statesToReread = new MutableVector<>(new DerivedState[16], 0);

        @NotNull
        private final DerivedStateObserver derivedStateObserver = new DerivedStateObserver() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1
            @Override // androidx.compose.runtime.DerivedStateObserver
            public void done(DerivedState<?> derivedState) {
                SnapshotStateObserver.ObservedScopeMap observedScopeMap = this.this$0;
                observedScopeMap.deriveStateScopeCount--;
            }

            @Override // androidx.compose.runtime.DerivedStateObserver
            public void start(DerivedState<?> derivedState) {
                this.this$0.deriveStateScopeCount++;
            }
        };

        @NotNull
        private final MutableScatterMap<Object, Object> dependencyToDerivedStates = ScopeMap.m10209constructorimpl$default(null, 1, null);

        @NotNull
        private final HashMap<DerivedState<?>, Object> recordedDerivedStateValues = new HashMap<>();

        public ObservedScopeMap(@NotNull InterfaceC6471c interfaceC6471c) {
            this.onChanged = interfaceC6471c;
            AbstractC5824e abstractC5824e = null;
            int i = 1;
            int i8 = 0;
            this.scopeToValues = new MutableScatterMap<>(i8, i, abstractC5824e);
            this.invalidated = new MutableScatterSet<>(i8, i, abstractC5824e);
        }

        private final void clearObsoleteStateReads(Object scope) {
            int i = this.currentToken;
            MutableObjectIntMap<Object> mutableObjectIntMap = this.currentScopeReads;
            if (mutableObjectIntMap == null) {
                return;
            }
            long[] jArr = mutableObjectIntMap.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i8 = 0;
            while (true) {
                long j7 = jArr[i8];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j7) < 128) {
                            int i11 = (i8 << 3) + i10;
                            Object obj = mutableObjectIntMap.keys[i11];
                            boolean z8 = mutableObjectIntMap.values[i11] != i;
                            if (z8) {
                                removeObservation(scope, obj);
                            }
                            if (z8) {
                                mutableObjectIntMap.removeValueAt(i11);
                            }
                        }
                        j7 >>= 8;
                    }
                    if (i9 != 8) {
                        return;
                    }
                }
                if (i8 == length) {
                    return;
                } else {
                    i8++;
                }
            }
        }

        private final void removeObservation(Object scope, Object value) {
            ScopeMap.m10216removeimpl(this.valueToScopes, value, scope);
            if (!(value instanceof DerivedState) || ScopeMap.m10210containsimpl(this.valueToScopes, value)) {
                return;
            }
            ScopeMap.m10217removeScopeimpl(this.dependencyToDerivedStates, value);
            this.recordedDerivedStateValues.remove(value);
        }

        public final void clear() {
            ScopeMap.m10207clearimpl(this.valueToScopes);
            this.scopeToValues.clear();
            ScopeMap.m10207clearimpl(this.dependencyToDerivedStates);
            this.recordedDerivedStateValues.clear();
        }

        public final void clearScopeObservations(@NotNull Object scope) {
            MutableObjectIntMap<Object> mutableObjectIntMapRemove = this.scopeToValues.remove(scope);
            if (mutableObjectIntMapRemove == null) {
                return;
            }
            Object[] objArr = mutableObjectIntMapRemove.keys;
            int[] iArr = mutableObjectIntMapRemove.values;
            long[] jArr = mutableObjectIntMapRemove.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                long j7 = jArr[i];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j7) < 128) {
                            int i10 = (i << 3) + i9;
                            Object obj = objArr[i10];
                            int i11 = iArr[i10];
                            removeObservation(scope, obj);
                        }
                        j7 >>= 8;
                    }
                    if (i8 != 8) {
                        return;
                    }
                }
                if (i == length) {
                    return;
                } else {
                    i++;
                }
            }
        }

        @NotNull
        public final DerivedStateObserver getDerivedStateObserver() {
            return this.derivedStateObserver;
        }

        @NotNull
        public final InterfaceC6471c getOnChanged() {
            return this.onChanged;
        }

        public final boolean hasScopeObservations() {
            return this.scopeToValues.isNotEmpty();
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void notifyInvalidatedScopes() {
            /*
                r17 = this;
                r0 = r17
                androidx.collection.MutableScatterSet<java.lang.Object> r1 = r0.invalidated
                r6.c r2 = r0.onChanged
                java.lang.Object[] r3 = r1.elements
                long[] r4 = r1.metadata
                int r5 = r4.length
                int r5 = r5 + (-2)
                if (r5 < 0) goto L49
                r6 = 0
                r7 = r6
            L11:
                r8 = r4[r7]
                long r10 = ~r8
                r12 = 7
                long r10 = r10 << r12
                long r10 = r10 & r8
                r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r10 = r10 & r12
                int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r10 == 0) goto L44
                int r10 = r7 - r5
                int r10 = ~r10
                int r10 = r10 >>> 31
                r11 = 8
                int r10 = 8 - r10
                r12 = r6
            L2b:
                if (r12 >= r10) goto L42
                r13 = 255(0xff, double:1.26E-321)
                long r13 = r13 & r8
                r15 = 128(0x80, double:6.3E-322)
                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r13 >= 0) goto L3e
                int r13 = r7 << 3
                int r13 = r13 + r12
                r13 = r3[r13]
                r2.invoke(r13)
            L3e:
                long r8 = r8 >> r11
                int r12 = r12 + 1
                goto L2b
            L42:
                if (r10 != r11) goto L49
            L44:
                if (r7 == r5) goto L49
                int r7 = r7 + 1
                goto L11
            L49:
                r1.clear()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap.notifyInvalidatedScopes():void");
        }

        public final void observe(@NotNull Object scope, @NotNull InterfaceC6471c readObserver, @NotNull InterfaceC6469a block) {
            Object obj = this.currentScope;
            MutableObjectIntMap<Object> mutableObjectIntMap = this.currentScopeReads;
            int i = this.currentToken;
            this.currentScope = scope;
            this.currentScopeReads = this.scopeToValues.get(scope);
            if (this.currentToken == -1) {
                this.currentToken = Long.hashCode(SnapshotKt.currentSnapshot().getSnapshotId());
            }
            DerivedStateObserver derivedStateObserver = this.derivedStateObserver;
            MutableVector<DerivedStateObserver> mutableVectorDerivedStateObservers = SnapshotStateKt.derivedStateObservers();
            try {
                mutableVectorDerivedStateObservers.add(derivedStateObserver);
                Snapshot.INSTANCE.observe(readObserver, null, block);
                mutableVectorDerivedStateObservers.removeAt(mutableVectorDerivedStateObservers.getSize() - 1);
                Object obj2 = this.currentScope;
                AbstractC5830k.m5327d(obj2);
                clearObsoleteStateReads(obj2);
                this.currentScope = obj;
                this.currentScopeReads = mutableObjectIntMap;
                this.currentToken = i;
            } catch (Throwable th) {
                mutableVectorDerivedStateObservers.removeAt(mutableVectorDerivedStateObservers.getSize() - 1);
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x023f  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x02a2 A[PHI: r11
          0x02a2: PHI (r11v42 boolean) = (r11v41 boolean), (r11v43 boolean) binds: [B:111:0x027a, B:119:0x02a0] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:179:0x03fc A[PHI: r13
          0x03fc: PHI (r13v8 boolean) = (r13v7 boolean), (r13v10 boolean) binds: [B:170:0x03d0, B:178:0x03fa] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:216:0x04bf A[PHI: r11
          0x04bf: PHI (r11v14 boolean) = (r11v13 boolean), (r11v15 boolean) binds: [B:207:0x0497, B:215:0x04bd] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:220:0x04cf  */
        /* JADX WARN: Removed duplicated region for block: B:223:0x04d9  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0146 A[PHI: r37
          0x0146: PHI (r37v5 boolean) = (r37v4 boolean), (r37v6 boolean) binds: [B:47:0x011a, B:56:0x0144] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0151  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x022f A[PHI: r11
          0x022f: PHI (r11v52 boolean) = (r11v51 boolean), (r11v53 boolean) binds: [B:87:0x0207, B:95:0x022d] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean recordInvalidation(@org.jetbrains.annotations.NotNull java.util.Set<? extends java.lang.Object> r44) {
            /*
                Method dump skipped, instructions count: 1364
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap.recordInvalidation(java.util.Set):boolean");
        }

        public final void recordRead(@NotNull Object value) {
            Object obj = this.currentScope;
            AbstractC5830k.m5327d(obj);
            int i = this.currentToken;
            MutableObjectIntMap<Object> mutableObjectIntMap = this.currentScopeReads;
            if (mutableObjectIntMap == null) {
                mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
                this.currentScopeReads = mutableObjectIntMap;
                this.scopeToValues.set(obj, mutableObjectIntMap);
            }
            recordRead(value, i, obj, mutableObjectIntMap);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void removeScopeIf(@org.jetbrains.annotations.NotNull p152r6.InterfaceC6471c r34) {
            /*
                Method dump skipped, instructions count: 225
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap.removeScopeIf(r6.c):void");
        }

        public final void rereadDerivedState(@NotNull DerivedState<?> derivedState) {
            long[] jArr;
            long[] jArr2;
            int i;
            MutableObjectIntMap<Object> mutableObjectIntMap;
            MutableScatterMap<Object, MutableObjectIntMap<Object>> mutableScatterMap = this.scopeToValues;
            int iHashCode = Long.hashCode(SnapshotKt.currentSnapshot().getSnapshotId());
            Object obj = this.valueToScopes.get(derivedState);
            if (obj == null) {
                return;
            }
            AbstractC5824e abstractC5824e = null;
            int i8 = 1;
            int i9 = 0;
            if (!(obj instanceof MutableScatterSet)) {
                MutableObjectIntMap<Object> mutableObjectIntMap2 = mutableScatterMap.get(obj);
                if (mutableObjectIntMap2 == null) {
                    mutableObjectIntMap2 = new MutableObjectIntMap<>(i9, i8, abstractC5824e);
                    mutableScatterMap.set(obj, mutableObjectIntMap2);
                }
                recordRead(derivedState, iHashCode, obj, mutableObjectIntMap2);
                return;
            }
            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
            Object[] objArr = mutableScatterSet.elements;
            long[] jArr3 = mutableScatterSet.metadata;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                long j7 = jArr3[i10];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8;
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j7 & 255) < 128) {
                            i = i11;
                            Object obj2 = objArr[(i10 << 3) + i13];
                            MutableObjectIntMap<Object> mutableObjectIntMap3 = mutableScatterMap.get(obj2);
                            jArr2 = jArr3;
                            if (mutableObjectIntMap3 == null) {
                                mutableObjectIntMap = new MutableObjectIntMap<>(i9, i8, abstractC5824e);
                                mutableScatterMap.set(obj2, mutableObjectIntMap);
                            } else {
                                mutableObjectIntMap = mutableObjectIntMap3;
                            }
                            recordRead(derivedState, iHashCode, obj2, mutableObjectIntMap);
                        } else {
                            jArr2 = jArr3;
                            i = i11;
                        }
                        j7 >>= i;
                        i13++;
                        i11 = i;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i12 != i11) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i10 == length) {
                    return;
                }
                i10++;
                jArr3 = jArr;
            }
        }

        private final void recordRead(Object value, int currentToken, Object currentScope, MutableObjectIntMap<Object> recordedValues) {
            int i;
            int i8;
            int i9;
            if (this.deriveStateScopeCount > 0) {
                return;
            }
            int iPut = recordedValues.put(value, currentToken, -1);
            int i10 = 2;
            if (!(value instanceof DerivedState) || iPut == currentToken) {
                i = 2;
                i8 = -1;
            } else {
                DerivedState.Record currentRecord = ((DerivedState) value).getCurrentRecord();
                this.recordedDerivedStateValues.put(value, currentRecord.getCurrentValue());
                ObjectIntMap<StateObject> dependencies = currentRecord.getDependencies();
                MutableScatterMap<Object, Object> mutableScatterMap = this.dependencyToDerivedStates;
                ScopeMap.m10217removeScopeimpl(mutableScatterMap, value);
                Object[] objArr = dependencies.keys;
                long[] jArr = dependencies.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j7 = jArr[i11];
                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            int i13 = 0;
                            while (i13 < i12) {
                                if ((j7 & 255) < 128) {
                                    i9 = i10;
                                    StateObject stateObject = (StateObject) objArr[(i11 << 3) + i13];
                                    if (stateObject instanceof StateObjectImpl) {
                                        ((StateObjectImpl) stateObject).m10248recordReadInh_f27i8$runtime_release(ReaderKind.m10231constructorimpl(i9));
                                    }
                                    ScopeMap.m10203addimpl(mutableScatterMap, stateObject, value);
                                } else {
                                    i9 = i10;
                                }
                                j7 >>= 8;
                                i13++;
                                i10 = i9;
                            }
                            i = i10;
                            if (i12 != 8) {
                                break;
                            }
                        } else {
                            i = i10;
                        }
                        if (i11 == length) {
                            break;
                        }
                        i11++;
                        i10 = i;
                    }
                } else {
                    i = 2;
                }
                i8 = -1;
            }
            if (iPut == i8) {
                if (value instanceof StateObjectImpl) {
                    ((StateObjectImpl) value).m10248recordReadInh_f27i8$runtime_release(ReaderKind.m10231constructorimpl(i));
                }
                ScopeMap.m10203addimpl(this.valueToScopes, value, currentScope);
            }
        }
    }

    public final void clear() {
        synchronized (this.observedScopeMapsLock) {
            MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
            ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i = 0; i < size; i++) {
                observedScopeMapArr[i].clear();
            }
        }
    }
}
