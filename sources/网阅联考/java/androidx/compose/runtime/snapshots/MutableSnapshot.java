package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m5174d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b \b\u0017\u0018\u00002\u00020\u0001BC\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\b\u0010.\u001a\u00020\tH\u0002J\r\u0010/\u001a\u00020\tH\u0000¢\u0006\u0002\b0J'\u0010/\u001a\u0002H1\"\u0004\b\u0000\u001012\f\u00102\u001a\b\u0012\u0004\u0012\u0002H103H\u0080\bø\u0001\u0000¢\u0006\u0004\b0\u00104J\b\u00105\u001a\u000206H\u0016J\r\u00107\u001a\u00020\tH\u0010¢\u0006\u0002\b8J\b\u00109\u001a\u00020\tH\u0016J\b\u0010:\u001a\u00020\rH\u0016J3\u0010;\u001a\u0002062\u0006\u0010<\u001a\u00020\u00032\u0014\u0010=\u001a\u0010\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020?\u0018\u00010>2\u0006\u0010@\u001a\u00020\u0005H\u0000¢\u0006\u0002\bAJ\u0015\u0010B\u001a\u00020\t2\u0006\u0010C\u001a\u00020\u0001H\u0010¢\u0006\u0002\bDJ\u0015\u0010E\u001a\u00020\t2\u0006\u0010C\u001a\u00020\u0001H\u0010¢\u0006\u0002\bFJ\r\u0010G\u001a\u00020\tH\u0010¢\u0006\u0002\bHJ\u0015\u0010I\u001a\u00020\t2\u0006\u0010J\u001a\u00020\u0014H\u0010¢\u0006\u0002\bKJ\u0015\u0010L\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¢\u0006\u0002\bMJ\u0015\u0010N\u001a\u00020\t2\u0006\u0010,\u001a\u00020\u0005H\u0000¢\u0006\u0002\bOJ\u0015\u0010P\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¢\u0006\u0002\bQJ\u0015\u0010R\u001a\u00020\t2\u0006\u0010S\u001a\u00020 H\u0000¢\u0006\u0002\bTJ\r\u0010U\u001a\u00020\tH\u0010¢\u0006\u0002\bVJ\r\u0010W\u001a\u00020\tH\u0000¢\u0006\u0002\bXJ8\u0010Y\u001a\u00020\u00002\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016J\u001e\u0010Z\u001a\u00020\u00012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016J\r\u0010[\u001a\u00020\tH\u0000¢\u0006\u0002\b\\J\r\u0010]\u001a\u00020\tH\u0000¢\u0006\u0002\b^R\u001a\u0010\f\u001a\u00020\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R4\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013@VX\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u000fR\u0014\u0010)\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010&\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006_"}, m5175d2 = {"Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "id", "", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "readObserver", "Lkotlin/Function1;", "", "", "writeObserver", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "applied", "", "getApplied$runtime_release", "()Z", "setApplied$runtime_release", "(Z)V", "<set-?>", "", "Landroidx/compose/runtime/snapshots/StateObject;", "modified", "getModified$runtime_release", "()Ljava/util/Set;", "setModified", "(Ljava/util/Set;)V", "previousIds", "getPreviousIds$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setPreviousIds$runtime_release", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "previousPinnedSnapshots", "", "getPreviousPinnedSnapshots$runtime_release", "()[I", "setPreviousPinnedSnapshots$runtime_release", "([I)V", "getReadObserver$runtime_release", "()Lkotlin/jvm/functions/Function1;", "readOnly", "getReadOnly", "root", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "snapshots", "getWriteObserver$runtime_release", "abandon", "advance", "advance$runtime_release", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "apply", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "closeLocked", "closeLocked$runtime_release", "dispose", "hasPendingChanges", "innerApplyLocked", "snapshotId", "optimisticMerges", "", "Landroidx/compose/runtime/snapshots/StateRecord;", "invalidSnapshots", "innerApplyLocked$runtime_release", "nestedActivated", "snapshot", "nestedActivated$runtime_release", "nestedDeactivated", "nestedDeactivated$runtime_release", "notifyObjectsInitialized", "notifyObjectsInitialized$runtime_release", "recordModified", "state", "recordModified$runtime_release", "recordPrevious", "recordPrevious$runtime_release", "recordPreviousList", "recordPreviousList$runtime_release", "recordPreviousPinnedSnapshot", "recordPreviousPinnedSnapshot$runtime_release", "recordPreviousPinnedSnapshots", "handles", "recordPreviousPinnedSnapshots$runtime_release", "releasePinnedSnapshotsForCloseLocked", "releasePinnedSnapshotsForCloseLocked$runtime_release", "releasePreviouslyPinnedSnapshotsLocked", "releasePreviouslyPinnedSnapshotsLocked$runtime_release", "takeNestedMutableSnapshot", "takeNestedSnapshot", "validateNotApplied", "validateNotApplied$runtime_release", "validateNotAppliedOrPinned", "validateNotAppliedOrPinned$runtime_release", "runtime_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/MutableSnapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2191:1\n955#1,2:2192\n961#1,3:2196\n964#1,6:2201\n955#1,2:2227\n961#1,3:2231\n964#1,6:2236\n955#1,9:2252\n964#1,6:2263\n1686#2:2194\n1686#2:2199\n1686#2:2207\n1686#2:2221\n1686#2:2229\n1686#2:2234\n1686#2:2247\n1686#2:2250\n1686#2:2261\n1686#2:2269\n1686#2:2271\n70#3:2195\n70#3:2200\n70#3:2208\n70#3:2222\n70#3:2230\n70#3:2235\n70#3:2248\n70#3:2251\n70#3:2262\n70#3:2270\n70#3:2272\n33#4,6:2209\n33#4,6:2215\n33#4,4:2243\n38#4:2249\n1855#5,2:2223\n1855#5,2:2225\n184#6:2242\n1#7:2273\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/MutableSnapshot\n*L\n661#1:2192,2\n661#1:2196,3\n661#1:2201,6\n786#1:2227,2\n786#1:2231,3\n786#1:2236,6\n972#1:2252,9\n972#1:2263,6\n662#1:2194\n661#1:2199\n710#1:2207\n761#1:2221\n787#1:2229\n786#1:2234\n939#1:2247\n963#1:2250\n972#1:2261\n975#1:2269\n1000#1:2271\n662#1:2195\n661#1:2200\n710#1:2208\n761#1:2222\n787#1:2230\n786#1:2235\n939#1:2248\n963#1:2251\n972#1:2262\n975#1:2270\n1000#1:2272\n747#1:2209,6\n753#1:2215,6\n936#1:2243,4\n936#1:2249\n764#1:2223,2\n765#1:2225,2\n833#1:2242\n*E\n"})
/* loaded from: classes.dex */
public class MutableSnapshot extends Snapshot {
    public static final int $stable = 8;
    private boolean applied;
    private Set<StateObject> modified;
    private SnapshotIdSet previousIds;
    private int[] previousPinnedSnapshots;
    private final Function1<Object, Unit> readObserver;
    private int snapshots;
    private final Function1<Object, Unit> writeObserver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableSnapshot(int i4, SnapshotIdSet invalid, Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        super(i4, invalid, null);
        Intrinsics.checkNotNullParameter(invalid, "invalid");
        this.readObserver = function1;
        this.writeObserver = function12;
        this.previousIds = SnapshotIdSet.INSTANCE.getEMPTY();
        this.previousPinnedSnapshots = new int[0];
        this.snapshots = 1;
    }

    private final void abandon() {
        Set<StateObject> modified$runtime_release = getModified$runtime_release();
        if (modified$runtime_release != null) {
            validateNotApplied$runtime_release();
            setModified(null);
            int id = getId();
            Iterator<StateObject> it = modified$runtime_release.iterator();
            while (it.hasNext()) {
                for (StateRecord firstStateRecord = it.next().getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext()) {
                    if (firstStateRecord.getSnapshotId() == id || CollectionsKt___CollectionsKt.contains(this.previousIds, Integer.valueOf(firstStateRecord.getSnapshotId()))) {
                        firstStateRecord.setSnapshotId$runtime_release(0);
                    }
                }
            }
        }
        closeAndReleasePinning$runtime_release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MutableSnapshot takeNestedMutableSnapshot$default(MutableSnapshot mutableSnapshot, Function1 function1, Function1 function12, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedMutableSnapshot");
        }
        if ((i4 & 1) != 0) {
            function1 = null;
        }
        if ((i4 & 2) != 0) {
            function12 = null;
        }
        return mutableSnapshot.takeNestedMutableSnapshot(function1, function12);
    }

    public final <T> T advance$runtime_release(Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        recordPrevious$runtime_release(getId());
        T tInvoke = block.invoke();
        if (!getApplied() && !getDisposed()) {
            int id = getId();
            synchronized (SnapshotKt.getLock()) {
                try {
                    int i4 = SnapshotKt.nextSnapshotId;
                    SnapshotKt.nextSnapshotId = i4 + 1;
                    setId$runtime_release(i4);
                    SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getId());
                    Unit unit = Unit.INSTANCE;
                    InlineMarker.finallyStart(1);
                } catch (Throwable th) {
                    InlineMarker.finallyStart(1);
                    InlineMarker.finallyEnd(1);
                    throw th;
                }
            }
            InlineMarker.finallyEnd(1);
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid(), id + 1, getId()));
        }
        return tInvoke;
    }

    public SnapshotApplyResult apply() {
        Map<StateRecord, ? extends StateRecord> mapOptimisticMerges;
        Pair pairM5182to;
        Set<StateObject> modified$runtime_release = getModified$runtime_release();
        if (modified$runtime_release != null) {
            Object obj = SnapshotKt.currentGlobalSnapshot.get();
            Intrinsics.checkNotNullExpressionValue(obj, "currentGlobalSnapshot.get()");
            mapOptimisticMerges = SnapshotKt.optimisticMerges((MutableSnapshot) obj, this, SnapshotKt.openSnapshots.clear(((GlobalSnapshot) SnapshotKt.currentGlobalSnapshot.get()).getId()));
        } else {
            mapOptimisticMerges = null;
        }
        synchronized (SnapshotKt.getLock()) {
            SnapshotKt.validateOpen(this);
            boolean z3 = true;
            if (modified$runtime_release == null || modified$runtime_release.size() == 0) {
                closeLocked$runtime_release();
                GlobalSnapshot previousGlobalSnapshot = (GlobalSnapshot) SnapshotKt.currentGlobalSnapshot.get();
                Intrinsics.checkNotNullExpressionValue(previousGlobalSnapshot, "previousGlobalSnapshot");
                SnapshotKt.takeNewGlobalSnapshot(previousGlobalSnapshot, SnapshotKt.emptyLambda);
                Set<StateObject> modified$runtime_release2 = previousGlobalSnapshot.getModified$runtime_release();
                pairM5182to = (modified$runtime_release2 == null || !(modified$runtime_release2.isEmpty() ^ true)) ? TuplesKt.m5182to(CollectionsKt__CollectionsKt.emptyList(), null) : TuplesKt.m5182to(CollectionsKt___CollectionsKt.toMutableList((Collection) SnapshotKt.applyObservers), modified$runtime_release2);
            } else {
                GlobalSnapshot previousGlobalSnapshot2 = (GlobalSnapshot) SnapshotKt.currentGlobalSnapshot.get();
                SnapshotApplyResult snapshotApplyResultInnerApplyLocked$runtime_release = innerApplyLocked$runtime_release(SnapshotKt.nextSnapshotId, mapOptimisticMerges, SnapshotKt.openSnapshots.clear(previousGlobalSnapshot2.getId()));
                if (!Intrinsics.areEqual(snapshotApplyResultInnerApplyLocked$runtime_release, SnapshotApplyResult.Success.INSTANCE)) {
                    return snapshotApplyResultInnerApplyLocked$runtime_release;
                }
                closeLocked$runtime_release();
                Intrinsics.checkNotNullExpressionValue(previousGlobalSnapshot2, "previousGlobalSnapshot");
                SnapshotKt.takeNewGlobalSnapshot(previousGlobalSnapshot2, SnapshotKt.emptyLambda);
                Set<StateObject> modified$runtime_release3 = previousGlobalSnapshot2.getModified$runtime_release();
                setModified(null);
                previousGlobalSnapshot2.setModified(null);
                pairM5182to = TuplesKt.m5182to(CollectionsKt___CollectionsKt.toMutableList((Collection) SnapshotKt.applyObservers), modified$runtime_release3);
            }
            List list = (List) pairM5182to.component1();
            Set set = (Set) pairM5182to.component2();
            this.applied = true;
            if (!(set == null || set.isEmpty())) {
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((Function2) list.get(i4)).invoke(set, this);
                }
            }
            if (modified$runtime_release != null && !modified$runtime_release.isEmpty()) {
                z3 = false;
            }
            if (!z3) {
                int size2 = list.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    ((Function2) list.get(i5)).invoke(modified$runtime_release, this);
                }
            }
            synchronized (SnapshotKt.getLock()) {
                releasePinnedSnapshotsForCloseLocked$runtime_release();
                if (set != null) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        SnapshotKt.overwriteUnusedRecordsLocked((StateObject) it.next());
                    }
                }
                if (modified$runtime_release != null) {
                    Iterator<T> it2 = modified$runtime_release.iterator();
                    while (it2.hasNext()) {
                        SnapshotKt.overwriteUnusedRecordsLocked((StateObject) it2.next());
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            return SnapshotApplyResult.Success.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void closeLocked$runtime_release() {
        SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.clear(getId()).andNot(this.previousIds);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed()) {
            return;
        }
        super.dispose();
        mo8839nestedDeactivated$runtime_release(this);
    }

    /* renamed from: getApplied$runtime_release, reason: from getter */
    public final boolean getApplied() {
        return this.applied;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Set<StateObject> getModified$runtime_release() {
        return this.modified;
    }

    /* renamed from: getPreviousIds$runtime_release, reason: from getter */
    public final SnapshotIdSet getPreviousIds() {
        return this.previousIds;
    }

    /* renamed from: getPreviousPinnedSnapshots$runtime_release, reason: from getter */
    public final int[] getPreviousPinnedSnapshots() {
        return this.previousPinnedSnapshots;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Function1<Object, Unit> getReadObserver$runtime_release() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot getRoot() {
        return this;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Function1<Object, Unit> getWriteObserver$runtime_release() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        Set<StateObject> modified$runtime_release = getModified$runtime_release();
        return modified$runtime_release != null && (modified$runtime_release.isEmpty() ^ true);
    }

    public final SnapshotApplyResult innerApplyLocked$runtime_release(int snapshotId, Map<StateRecord, ? extends StateRecord> optimisticMerges, SnapshotIdSet invalidSnapshots) {
        StateRecord stateRecord;
        StateRecord stateRecordMergeRecords;
        Intrinsics.checkNotNullParameter(invalidSnapshots, "invalidSnapshots");
        SnapshotIdSet snapshotIdSetM296or = getInvalid().set(getId()).m296or(this.previousIds);
        Set<StateObject> modified$runtime_release = getModified$runtime_release();
        Intrinsics.checkNotNull(modified$runtime_release);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (StateObject stateObject : modified$runtime_release) {
            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
            StateRecord stateRecord2 = SnapshotKt.readable(firstStateRecord, snapshotId, invalidSnapshots);
            if (stateRecord2 != null && (stateRecord = SnapshotKt.readable(firstStateRecord, getId(), snapshotIdSetM296or)) != null && !Intrinsics.areEqual(stateRecord2, stateRecord)) {
                StateRecord stateRecord3 = SnapshotKt.readable(firstStateRecord, getId(), getInvalid());
                if (stateRecord3 == null) {
                    SnapshotKt.readError();
                    throw new KotlinNothingValueException();
                }
                if (optimisticMerges == null || (stateRecordMergeRecords = optimisticMerges.get(stateRecord2)) == null) {
                    stateRecordMergeRecords = stateObject.mergeRecords(stateRecord, stateRecord2, stateRecord3);
                }
                if (stateRecordMergeRecords == null) {
                    return new SnapshotApplyResult.Failure(this);
                }
                if (!Intrinsics.areEqual(stateRecordMergeRecords, stateRecord3)) {
                    if (Intrinsics.areEqual(stateRecordMergeRecords, stateRecord2)) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(TuplesKt.m5182to(stateObject, stateRecord2.create()));
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(stateObject);
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(!Intrinsics.areEqual(stateRecordMergeRecords, stateRecord) ? TuplesKt.m5182to(stateObject, stateRecordMergeRecords) : TuplesKt.m5182to(stateObject, stateRecord.create()));
                    }
                }
            }
        }
        if (arrayList != null) {
            advance$runtime_release();
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                Pair pair = (Pair) arrayList.get(i4);
                StateObject stateObject2 = (StateObject) pair.component1();
                StateRecord stateRecord4 = (StateRecord) pair.component2();
                stateRecord4.setSnapshotId$runtime_release(getId());
                synchronized (SnapshotKt.getLock()) {
                    stateRecord4.setNext$runtime_release(stateObject2.getFirstStateRecord());
                    stateObject2.prependStateRecord(stateRecord4);
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
        if (arrayList2 != null) {
            modified$runtime_release.removeAll(arrayList2);
        }
        return SnapshotApplyResult.Success.INSTANCE;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedActivated$runtime_release */
    public void mo8838nestedActivated$runtime_release(Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        this.snapshots++;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedDeactivated$runtime_release */
    public void mo8839nestedDeactivated$runtime_release(Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        int i4 = this.snapshots;
        if (!(i4 > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i5 = i4 - 1;
        this.snapshots = i5;
        if (i5 != 0 || this.applied) {
            return;
        }
        abandon();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        if (this.applied || getDisposed()) {
            return;
        }
        advance$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: recordModified$runtime_release */
    public void mo8840recordModified$runtime_release(StateObject state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Set<StateObject> modified$runtime_release = getModified$runtime_release();
        if (modified$runtime_release == null) {
            modified$runtime_release = new HashSet<>();
            setModified(modified$runtime_release);
        }
        modified$runtime_release.add(state);
    }

    public final void recordPrevious$runtime_release(int id) {
        synchronized (SnapshotKt.getLock()) {
            this.previousIds = this.previousIds.set(id);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void recordPreviousList$runtime_release(SnapshotIdSet snapshots) {
        Intrinsics.checkNotNullParameter(snapshots, "snapshots");
        synchronized (SnapshotKt.getLock()) {
            this.previousIds = this.previousIds.m296or(snapshots);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void recordPreviousPinnedSnapshot$runtime_release(int id) {
        if (id >= 0) {
            this.previousPinnedSnapshots = ArraysKt___ArraysJvmKt.plus(this.previousPinnedSnapshots, id);
        }
    }

    public final void recordPreviousPinnedSnapshots$runtime_release(int[] handles) {
        Intrinsics.checkNotNullParameter(handles, "handles");
        if (handles.length == 0) {
            return;
        }
        int[] iArr = this.previousPinnedSnapshots;
        if (iArr.length == 0) {
            this.previousPinnedSnapshots = handles;
        } else {
            this.previousPinnedSnapshots = ArraysKt___ArraysJvmKt.plus(iArr, handles);
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void releasePinnedSnapshotsForCloseLocked$runtime_release() {
        releasePreviouslyPinnedSnapshotsLocked$runtime_release();
        super.releasePinnedSnapshotsForCloseLocked$runtime_release();
    }

    public final void releasePreviouslyPinnedSnapshotsLocked$runtime_release() {
        int length = this.previousPinnedSnapshots.length;
        for (int i4 = 0; i4 < length; i4++) {
            SnapshotKt.releasePinningLocked(this.previousPinnedSnapshots[i4]);
        }
    }

    public final void setApplied$runtime_release(boolean z3) {
        this.applied = z3;
    }

    public void setModified(Set<StateObject> set) {
        this.modified = set;
    }

    public final void setPreviousIds$runtime_release(SnapshotIdSet snapshotIdSet) {
        Intrinsics.checkNotNullParameter(snapshotIdSet, "<set-?>");
        this.previousIds = snapshotIdSet;
    }

    public final void setPreviousPinnedSnapshots$runtime_release(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.previousPinnedSnapshots = iArr;
    }

    public MutableSnapshot takeNestedMutableSnapshot(Function1<Object, Unit> readObserver, Function1<Object, Unit> writeObserver) {
        NestedMutableSnapshot nestedMutableSnapshot;
        validateNotDisposed$runtime_release();
        validateNotAppliedOrPinned$runtime_release();
        recordPrevious$runtime_release(getId());
        synchronized (SnapshotKt.getLock()) {
            int i4 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = i4 + 1;
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(i4);
            SnapshotIdSet invalid = getInvalid();
            setInvalid$runtime_release(invalid.set(i4));
            nestedMutableSnapshot = new NestedMutableSnapshot(i4, SnapshotKt.addRange(invalid, getId() + 1, i4), SnapshotKt.mergedReadObserver$default(readObserver, getReadObserver$runtime_release(), false, 4, null), SnapshotKt.mergedWriteObserver(writeObserver, getWriteObserver$runtime_release()), this);
        }
        if (!getApplied() && !getDisposed()) {
            int id = getId();
            synchronized (SnapshotKt.getLock()) {
                int i5 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId = i5 + 1;
                setId$runtime_release(i5);
                SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getId());
                Unit unit = Unit.INSTANCE;
            }
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid(), id + 1, getId()));
        }
        return nestedMutableSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(Function1<Object, Unit> readObserver) {
        NestedReadonlySnapshot nestedReadonlySnapshot;
        validateNotDisposed$runtime_release();
        validateNotAppliedOrPinned$runtime_release();
        int id = getId();
        recordPrevious$runtime_release(getId());
        synchronized (SnapshotKt.getLock()) {
            int i4 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = i4 + 1;
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(i4);
            nestedReadonlySnapshot = new NestedReadonlySnapshot(i4, SnapshotKt.addRange(getInvalid(), id + 1, i4), readObserver, this);
        }
        if (!getApplied() && !getDisposed()) {
            int id2 = getId();
            synchronized (SnapshotKt.getLock()) {
                int i5 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId = i5 + 1;
                setId$runtime_release(i5);
                SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getId());
                Unit unit = Unit.INSTANCE;
            }
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid(), id2 + 1, getId()));
        }
        return nestedReadonlySnapshot;
    }

    public final void validateNotApplied$runtime_release() {
        if (!(!this.applied)) {
            throw new IllegalStateException("Unsupported operation on a snapshot that has been applied".toString());
        }
    }

    public final void validateNotAppliedOrPinned$runtime_release() {
        boolean z3 = true;
        if (this.applied) {
            if (!(((Snapshot) this).pinningTrackingHandle >= 0)) {
                z3 = false;
            }
        }
        if (!z3) {
            throw new IllegalStateException("Unsupported operation on a disposed or applied snapshot".toString());
        }
    }

    public final void advance$runtime_release() {
        recordPrevious$runtime_release(getId());
        Unit unit = Unit.INSTANCE;
        if (getApplied() || getDisposed()) {
            return;
        }
        int id = getId();
        synchronized (SnapshotKt.getLock()) {
            int i4 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = i4 + 1;
            setId$runtime_release(i4);
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getId());
        }
        setInvalid$runtime_release(SnapshotKt.addRange(getInvalid(), id + 1, getId()));
    }
}
