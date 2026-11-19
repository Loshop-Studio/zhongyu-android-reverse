package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserver;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0017\u0018\u0000 j2\u00020\u0001:\u0001jBG\b\u0000\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0002\u0010\fJ\b\u0010;\u001a\u00020\nH\u0002J\r\u0010<\u001a\u00020\nH\u0000¢\u0006\u0002\b=J$\u0010<\u001a\u0002H>\"\u0004\b\u0000\u0010>2\f\u0010?\u001a\b\u0012\u0004\u0012\u0002H>0@H\u0080\b¢\u0006\u0004\b=\u0010AJ\b\u0010B\u001a\u00020CH\u0016J\r\u0010D\u001a\u00020\nH\u0010¢\u0006\u0002\bEJ\b\u0010F\u001a\u00020\nH\u0016J\b\u0010G\u001a\u00020\u000eH\u0016JE\u0010H\u001a\u00020C2\n\u0010I\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u001b2\u0014\u0010J\u001a\u0010\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020L\u0018\u00010K2\u0006\u0010M\u001a\u00020\u0006H\u0000¢\u0006\u0002\bNJ\u0015\u0010O\u001a\u00020\n2\u0006\u0010P\u001a\u00020\u0001H\u0010¢\u0006\u0002\bQJ\u0015\u0010R\u001a\u00020\n2\u0006\u0010P\u001a\u00020\u0001H\u0010¢\u0006\u0002\bSJ\r\u0010T\u001a\u00020\nH\u0010¢\u0006\u0002\bUJ\u0015\u0010V\u001a\u00020\n2\u0006\u0010W\u001a\u00020\u0015H\u0010¢\u0006\u0002\bXJ\u0019\u0010Y\u001a\u00020\n2\n\u0010Z\u001a\u00060\u0003j\u0002`\u0004H\u0000¢\u0006\u0002\b[J\u0015\u0010\\\u001a\u00020\n2\u0006\u00103\u001a\u00020\u0006H\u0000¢\u0006\u0002\b]J\u0015\u0010^\u001a\u00020\n2\u0006\u0010Z\u001a\u000204H\u0000¢\u0006\u0002\b_J\u0015\u0010`\u001a\u00020\n2\u0006\u0010a\u001a\u00020'H\u0000¢\u0006\u0002\bbJ\r\u0010c\u001a\u00020\nH\u0010¢\u0006\u0002\bdJ\b\u0010e\u001a\u00020\nH\u0002J8\u0010f\u001a\u00020\u00002\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016J\u001e\u0010g\u001a\u00020\u00012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016J\b\u0010h\u001a\u00020\nH\u0002J\b\u0010i\u001a\u00020\nH\u0002R\u001a\u0010\r\u001a\u00020\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R4\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001b2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001b@VX\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020'X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0010R\u0014\u00100\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u000e\u00103\u001a\u000204X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00105\u001a\u000204X\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010-¨\u0006k"}, m13558d2 = {"Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshotId", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "readObserver", "Lkotlin/Function1;", "", "", "writeObserver", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "applied", "", "getApplied$runtime_release", "()Z", "setApplied$runtime_release", "(Z)V", "merged", "", "Landroidx/compose/runtime/snapshots/StateObject;", "getMerged$runtime_release", "()Ljava/util/List;", "setMerged$runtime_release", "(Ljava/util/List;)V", "<set-?>", "Landroidx/collection/MutableScatterSet;", "modified", "getModified$runtime_release", "()Landroidx/collection/MutableScatterSet;", "setModified", "(Landroidx/collection/MutableScatterSet;)V", "previousIds", "getPreviousIds$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setPreviousIds$runtime_release", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "previousPinnedSnapshots", "", "getPreviousPinnedSnapshots$runtime_release", "()[I", "setPreviousPinnedSnapshots$runtime_release", "([I)V", "getReadObserver$runtime_release", "()Lkotlin/jvm/functions/Function1;", "readOnly", "getReadOnly", "root", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "snapshots", "", "writeCount", "getWriteCount$runtime_release", "()I", "setWriteCount$runtime_release", "(I)V", "getWriteObserver$runtime_release", "abandon", "advance", "advance$runtime_release", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "apply", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "closeLocked", "closeLocked$runtime_release", "dispose", "hasPendingChanges", "innerApplyLocked", "nextId", "optimisticMerges", "", "Landroidx/compose/runtime/snapshots/StateRecord;", "invalidSnapshots", "innerApplyLocked$runtime_release", "nestedActivated", "snapshot", "nestedActivated$runtime_release", "nestedDeactivated", "nestedDeactivated$runtime_release", "notifyObjectsInitialized", "notifyObjectsInitialized$runtime_release", "recordModified", "state", "recordModified$runtime_release", "recordPrevious", "id", "recordPrevious$runtime_release", "recordPreviousList", "recordPreviousList$runtime_release", "recordPreviousPinnedSnapshot", "recordPreviousPinnedSnapshot$runtime_release", "recordPreviousPinnedSnapshots", "handles", "recordPreviousPinnedSnapshots$runtime_release", "releasePinnedSnapshotsForCloseLocked", "releasePinnedSnapshotsForCloseLocked$runtime_release", "releasePreviouslyPinnedSnapshotsLocked", "takeNestedMutableSnapshot", "takeNestedSnapshot", "validateNotApplied", "validateNotAppliedOrPinned", "Companion", "runtime_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/MutableSnapshot\n+ 2 SnapshotObserver.kt\nandroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 4 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 7 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 8 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 9 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 10 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,2487:1\n1101#1,2:2500\n1107#1,3:2506\n1110#1:2513\n1111#1,5:2515\n1101#1,2:2610\n1107#1,3:2617\n1110#1:2624\n1111#1,5:2626\n1101#1,9:2718\n1110#1:2731\n1111#1,5:2733\n193#2,12:2488\n205#2,2:2520\n193#2,12:2598\n205#2,2:2631\n1894#3,2:2502\n1894#3,2:2509\n1894#3,2:2522\n1894#3,2:2538\n1894#3,2:2612\n1894#3,2:2620\n1894#3,2:2703\n1894#3,2:2714\n1894#3,2:2727\n1894#3,2:2738\n1894#3,2:2742\n33#4,2:2504\n33#4,2:2511\n33#4,2:2524\n33#4,2:2540\n33#4,2:2614\n33#4,2:2622\n33#4,2:2705\n33#4,2:2716\n33#4,2:2729\n33#4,2:2740\n33#4,2:2744\n1#5:2514\n1#5:2616\n1#5:2625\n1#5:2691\n1#5:2732\n1#5:2746\n33#6,6:2526\n33#6,6:2532\n33#6,6:2592\n33#6,4:2699\n38#6:2707\n33#6,6:2708\n231#7,3:2542\n200#7,7:2545\n211#7,3:2553\n214#7,9:2557\n234#7:2566\n231#7,3:2567\n200#7,7:2570\n211#7,3:2578\n214#7,9:2582\n234#7:2591\n231#7,3:2649\n200#7,7:2652\n211#7,3:2660\n214#7,9:2664\n234#7:2673\n231#7,3:2674\n200#7,7:2677\n211#7,3:2685\n214#7,2:2689\n217#7,6:2692\n234#7:2698\n1399#8:2552\n1270#8:2556\n1399#8:2577\n1270#8:2581\n1399#8:2659\n1270#8:2663\n1399#8:2684\n1270#8:2688\n33#9,5:2633\n48#9,5:2638\n48#9,5:2644\n205#10:2643\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/MutableSnapshot\n*L\n771#1:2500,2\n771#1:2506,3\n771#1:2513\n771#1:2515,5\n923#1:2610,2\n923#1:2617,3\n923#1:2624\n923#1:2626,5\n1118#1:2718,9\n1118#1:2731\n1118#1:2733,5\n768#1:2488,12\n768#1:2520,2\n917#1:2598,12\n917#1:2631,2\n772#1:2502,2\n771#1:2509,2\n830#1:2522,2\n886#1:2538,2\n924#1:2612,2\n923#1:2620,2\n1084#1:2703,2\n1109#1:2714,2\n1118#1:2727,2\n1121#1:2738,2\n1142#1:2742,2\n772#1:2504,2\n771#1:2511,2\n830#1:2524,2\n886#1:2540,2\n924#1:2614,2\n923#1:2622,2\n1084#1:2705,2\n1109#1:2716,2\n1118#1:2729,2\n1121#1:2740,2\n1142#1:2744,2\n771#1:2514\n923#1:2625\n1118#1:2732\n872#1:2526,6\n878#1:2532,6\n891#1:2592,6\n1081#1:2699,4\n1081#1:2707\n1092#1:2708,6\n889#1:2542,3\n889#1:2545,7\n889#1:2553,3\n889#1:2557,9\n889#1:2566\n890#1:2567,3\n890#1:2570,7\n890#1:2578,3\n890#1:2582,9\n890#1:2591\n989#1:2649,3\n989#1:2652,7\n989#1:2660,3\n989#1:2664,9\n989#1:2673\n1024#1:2674,3\n1024#1:2677,7\n1024#1:2685,3\n1024#1:2689,2\n1024#1:2692,6\n1024#1:2698\n889#1:2552\n889#1:2556\n890#1:2577\n890#1:2581\n989#1:2659\n989#1:2663\n1024#1:2684\n1024#1:2688\n943#1:2633,5\n967#1:2638,5\n971#1:2644,5\n971#1:2643\n*E\n"})
/* loaded from: classes2.dex */
public class MutableSnapshot extends Snapshot {
    private boolean applied;
    private List<? extends StateObject> merged;
    private MutableScatterSet<StateObject> modified;
    private SnapshotIdSet previousIds;
    private int[] previousPinnedSnapshots;
    private final Function1<Object, Unit> readObserver;
    private int snapshots;
    private int writeCount;
    private final Function1<Object, Unit> writeObserver;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int[] EmptyIntArray = new int[0];

    @Metadata(m13557d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m13558d2 = {"Landroidx/compose/runtime/snapshots/MutableSnapshot$Companion;", "", "()V", "EmptyIntArray", "", "runtime_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public MutableSnapshot(long j10, SnapshotIdSet snapshotIdSet, Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        super(j10, snapshotIdSet, (DefaultConstructorMarker) null);
        this.readObserver = function1;
        this.writeObserver = function12;
        this.previousIds = SnapshotIdSet.INSTANCE.getEMPTY();
        this.previousPinnedSnapshots = EmptyIntArray;
        this.snapshots = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void abandon() {
        /*
            r17 = this;
            r0 = r17
            androidx.collection.MutableScatterSet r1 = r0.getModified$runtime_release()
            if (r1 == 0) goto L7f
            r0.validateNotApplied()
            r2 = 0
            r0.setModified(r2)
            long r2 = r0.getSnapshotId()
            java.lang.Object[] r4 = r1.elements
            long[] r1 = r1.metadata
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L7f
            r6 = 0
            r7 = r6
        L1e:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L7a
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L38:
            if (r12 >= r10) goto L78
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L74
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            androidx.compose.runtime.snapshots.StateObject r13 = (androidx.compose.runtime.snapshots.StateObject) r13
            androidx.compose.runtime.snapshots.StateRecord r13 = r13.getFirstStateRecord()
        L4e:
            if (r13 == 0) goto L74
            long r14 = r13.getSnapshotId()
            int r14 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r14 == 0) goto L68
            androidx.compose.runtime.snapshots.SnapshotIdSet r14 = r0.previousIds
            long r15 = r13.getSnapshotId()
            java.lang.Long r15 = java.lang.Long.valueOf(r15)
            boolean r14 = kotlin.collections.CollectionsKt.contains(r14, r15)
            if (r14 == 0) goto L6f
        L68:
            long r14 = androidx.compose.runtime.snapshots.SnapshotKt.access$getINVALID_SNAPSHOT$p()
            r13.setSnapshotId$runtime_release(r14)
        L6f:
            androidx.compose.runtime.snapshots.StateRecord r13 = r13.getNext()
            goto L4e
        L74:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L38
        L78:
            if (r10 != r11) goto L7f
        L7a:
            if (r7 == r5) goto L7f
            int r7 = r7 + 1
            goto L1e
        L7f:
            r0.closeAndReleasePinning$runtime_release()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.MutableSnapshot.abandon():void");
    }

    private final void releasePreviouslyPinnedSnapshotsLocked() {
        int length = this.previousPinnedSnapshots.length;
        for (int i10 = 0; i10 < length; i10++) {
            SnapshotKt.releasePinningLocked(this.previousPinnedSnapshots[i10]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MutableSnapshot takeNestedMutableSnapshot$default(MutableSnapshot mutableSnapshot, Function1 function1, Function1 function12, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedMutableSnapshot");
        }
        if ((i10 & 1) != 0) {
            function1 = null;
        }
        if ((i10 & 2) != 0) {
            function12 = null;
        }
        return mutableSnapshot.takeNestedMutableSnapshot(function1, function12);
    }

    private final void validateNotApplied() {
        if (this.applied) {
            PreconditionsKt.throwIllegalStateException("Unsupported operation on a snapshot that has been applied");
        }
    }

    private final void validateNotAppliedOrPinned() {
        if (!this.applied || ((Snapshot) this).pinningTrackingHandle >= 0) {
            return;
        }
        PreconditionsKt.throwIllegalStateException("Unsupported operation on a disposed or applied snapshot");
    }

    public final <T> T advance$runtime_release(Function0<? extends T> block) {
        recordPrevious$runtime_release(getSnapshotId());
        T tInvoke = block.invoke();
        if (getApplied() || getDisposed()) {
            return tInvoke;
        }
        long snapshotId = getSnapshotId();
        synchronized (SnapshotKt.getLock()) {
            try {
                long j10 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId++;
                setSnapshotId$runtime_release(j10);
                SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getSnapshotId());
                Unit unit = Unit.INSTANCE;
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        setInvalid$runtime_release(SnapshotKt.addRange(getInvalid(), snapshotId + 1, getSnapshotId()));
        return tInvoke;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.runtime.snapshots.SnapshotApplyResult apply() {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.MutableSnapshot.apply():androidx.compose.runtime.snapshots.SnapshotApplyResult");
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void closeLocked$runtime_release() {
        SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.clear(getSnapshotId()).andNot(this.previousIds);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed()) {
            return;
        }
        super.dispose();
        mo20535nestedDeactivated$runtime_release(this);
        SnapshotObserverKt.dispatchObserverOnPreDispose(this);
    }

    /* renamed from: getApplied$runtime_release, reason: from getter */
    public final boolean getApplied() {
        return this.applied;
    }

    public final List<StateObject> getMerged$runtime_release() {
        return this.merged;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public MutableScatterSet<StateObject> getModified$runtime_release() {
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
    /* renamed from: getReadObserver$runtime_release */
    public Function1<Object, Unit> getReadObserver() {
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
    /* renamed from: getWriteCount$runtime_release, reason: from getter */
    public int getWriteCount() {
        return this.writeCount;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Function1<Object, Unit> getWriteObserver$runtime_release() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        MutableScatterSet<StateObject> modified$runtime_release = getModified$runtime_release();
        return modified$runtime_release != null && modified$runtime_release.isNotEmpty();
    }

    public final SnapshotApplyResult innerApplyLocked$runtime_release(long nextId, MutableScatterSet<StateObject> modified, Map<StateRecord, ? extends StateRecord> optimisticMerges, SnapshotIdSet invalidSnapshots) {
        SnapshotIdSet snapshotIdSet;
        Object[] objArr;
        long[] jArr;
        SnapshotIdSet snapshotIdSet2;
        Object[] objArr2;
        long[] jArr2;
        int i10;
        long j10;
        int i11;
        StateRecord stateRecordMergeRecords;
        SnapshotIdSet snapshotIdSetM1206or = getInvalid().set(getSnapshotId()).m1206or(this.previousIds);
        Object[] objArr3 = modified.elements;
        long[] jArr3 = modified.metadata;
        int length = jArr3.length - 2;
        ArrayList arrayList = null;
        List<? extends StateObject> listPlus = null;
        if (length >= 0) {
            int i12 = 0;
            while (true) {
                long j11 = jArr3[i12];
                List<? extends StateObject> arrayList2 = listPlus;
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j11 & 255) < 128) {
                            i10 = i13;
                            StateObject stateObject = (StateObject) objArr3[(i12 << 3) + i15];
                            objArr2 = objArr3;
                            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
                            jArr2 = jArr3;
                            ArrayList arrayList3 = arrayList;
                            StateRecord stateRecord = SnapshotKt.readable(firstStateRecord, nextId, invalidSnapshots);
                            if (stateRecord == null) {
                                j10 = j11;
                            } else {
                                j10 = j11;
                                StateRecord stateRecord2 = SnapshotKt.readable(firstStateRecord, getSnapshotId(), snapshotIdSetM1206or);
                                if (stateRecord2 != null && stateRecord2.getSnapshotId() != SnapshotId_jvmKt.toSnapshotId(1) && !Intrinsics.areEqual(stateRecord, stateRecord2)) {
                                    i11 = i15;
                                    snapshotIdSet2 = snapshotIdSetM1206or;
                                    StateRecord stateRecord3 = SnapshotKt.readable(firstStateRecord, getSnapshotId(), getInvalid());
                                    if (stateRecord3 == null) {
                                        SnapshotKt.readError();
                                        throw new KotlinNothingValueException();
                                    }
                                    if (optimisticMerges == null || (stateRecordMergeRecords = optimisticMerges.get(stateRecord)) == null) {
                                        stateRecordMergeRecords = stateObject.mergeRecords(stateRecord2, stateRecord, stateRecord3);
                                    }
                                    if (stateRecordMergeRecords == null) {
                                        return new SnapshotApplyResult.Failure(this);
                                    }
                                    if (!Intrinsics.areEqual(stateRecordMergeRecords, stateRecord3)) {
                                        if (Intrinsics.areEqual(stateRecordMergeRecords, stateRecord)) {
                                            ArrayList arrayList4 = arrayList3 == null ? new ArrayList() : arrayList3;
                                            arrayList4.add(TuplesKt.m13565to(stateObject, stateRecord.create(getSnapshotId())));
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList<>();
                                            }
                                            List<? extends StateObject> list = arrayList2;
                                            list.add(stateObject);
                                            arrayList = arrayList4;
                                            arrayList2 = list;
                                        } else {
                                            arrayList = arrayList3 == null ? new ArrayList() : arrayList3;
                                            arrayList.add(!Intrinsics.areEqual(stateRecordMergeRecords, stateRecord2) ? TuplesKt.m13565to(stateObject, stateRecordMergeRecords) : TuplesKt.m13565to(stateObject, stateRecord2.create(getSnapshotId())));
                                        }
                                    }
                                }
                                arrayList = arrayList3;
                            }
                            snapshotIdSet2 = snapshotIdSetM1206or;
                            i11 = i15;
                            arrayList = arrayList3;
                        } else {
                            snapshotIdSet2 = snapshotIdSetM1206or;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i10 = i13;
                            j10 = j11;
                            i11 = i15;
                        }
                        j11 = j10 >> i10;
                        i15 = i11 + 1;
                        objArr3 = objArr2;
                        i13 = i10;
                        jArr3 = jArr2;
                        snapshotIdSetM1206or = snapshotIdSet2;
                    }
                    snapshotIdSet = snapshotIdSetM1206or;
                    objArr = objArr3;
                    jArr = jArr3;
                    ArrayList arrayList5 = arrayList;
                    if (i14 != i13) {
                        listPlus = arrayList2;
                        arrayList = arrayList5;
                        break;
                    }
                    arrayList = arrayList5;
                } else {
                    snapshotIdSet = snapshotIdSetM1206or;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                listPlus = arrayList2;
                if (i12 == length) {
                    break;
                }
                i12++;
                objArr3 = objArr;
                jArr3 = jArr;
                snapshotIdSetM1206or = snapshotIdSet;
            }
        }
        if (arrayList != null) {
            advance$runtime_release();
            int size = arrayList.size();
            for (int i16 = 0; i16 < size; i16++) {
                Pair pair = (Pair) arrayList.get(i16);
                StateObject stateObject2 = (StateObject) pair.component1();
                StateRecord stateRecord4 = (StateRecord) pair.component2();
                stateRecord4.setSnapshotId$runtime_release(nextId);
                synchronized (SnapshotKt.getLock()) {
                    stateRecord4.setNext$runtime_release(stateObject2.getFirstStateRecord());
                    stateObject2.prependStateRecord(stateRecord4);
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
        if (listPlus != null) {
            int size2 = listPlus.size();
            for (int i17 = 0; i17 < size2; i17++) {
                modified.remove(listPlus.get(i17));
            }
            List<? extends StateObject> list2 = this.merged;
            if (list2 != null) {
                listPlus = CollectionsKt.plus((Collection) list2, (Iterable) listPlus);
            }
            this.merged = listPlus;
        }
        return SnapshotApplyResult.Success.INSTANCE;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedActivated$runtime_release */
    public void mo20534nestedActivated$runtime_release(Snapshot snapshot) {
        this.snapshots++;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedDeactivated$runtime_release */
    public void mo20535nestedDeactivated$runtime_release(Snapshot snapshot) {
        if (!(this.snapshots > 0)) {
            PreconditionsKt.throwIllegalArgumentException("no pending nested snapshots");
        }
        int i10 = this.snapshots - 1;
        this.snapshots = i10;
        if (i10 != 0 || this.applied) {
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
    public void mo20536recordModified$runtime_release(StateObject state) {
        MutableScatterSet<StateObject> modified$runtime_release = getModified$runtime_release();
        if (modified$runtime_release == null) {
            modified$runtime_release = ScatterSetKt.mutableScatterSetOf();
            setModified(modified$runtime_release);
        }
        modified$runtime_release.add(state);
    }

    public final void recordPrevious$runtime_release(long id) {
        synchronized (SnapshotKt.getLock()) {
            this.previousIds = this.previousIds.set(id);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void recordPreviousList$runtime_release(SnapshotIdSet snapshots) {
        synchronized (SnapshotKt.getLock()) {
            this.previousIds = this.previousIds.m1206or(snapshots);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void recordPreviousPinnedSnapshot$runtime_release(int id) {
        if (id >= 0) {
            this.previousPinnedSnapshots = ArraysKt.plus(this.previousPinnedSnapshots, id);
        }
    }

    public final void recordPreviousPinnedSnapshots$runtime_release(int[] handles) {
        if (handles.length == 0) {
            return;
        }
        int[] iArr = this.previousPinnedSnapshots;
        if (iArr.length != 0) {
            handles = ArraysKt.plus(iArr, handles);
        }
        this.previousPinnedSnapshots = handles;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void releasePinnedSnapshotsForCloseLocked$runtime_release() {
        releasePreviouslyPinnedSnapshotsLocked();
        super.releasePinnedSnapshotsForCloseLocked$runtime_release();
    }

    public final void setApplied$runtime_release(boolean z9) {
        this.applied = z9;
    }

    public final void setMerged$runtime_release(List<? extends StateObject> list) {
        this.merged = list;
    }

    public void setModified(MutableScatterSet<StateObject> mutableScatterSet) {
        this.modified = mutableScatterSet;
    }

    public final void setPreviousIds$runtime_release(SnapshotIdSet snapshotIdSet) {
        this.previousIds = snapshotIdSet;
    }

    public final void setPreviousPinnedSnapshots$runtime_release(int[] iArr) {
        this.previousPinnedSnapshots = iArr;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setWriteCount$runtime_release(int i10) {
        this.writeCount = i10;
    }

    public MutableSnapshot takeNestedMutableSnapshot(Function1<Object, Unit> readObserver, Function1<Object, Unit> writeObserver) {
        Map<SnapshotObserver, SnapshotInstanceObservers> second;
        NestedMutableSnapshot nestedMutableSnapshot;
        validateNotDisposed$runtime_release();
        validateNotAppliedOrPinned();
        PersistentList persistentList = SnapshotObserverKt.observers;
        Function1<Object, Unit> function1 = readObserver;
        Function1<Object, Unit> writeObserver2 = writeObserver;
        if (persistentList != null) {
            Pair<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> pairMergeObservers = SnapshotObserverKt.mergeObservers(persistentList, this, false, function1, writeObserver2);
            SnapshotInstanceObservers first = pairMergeObservers.getFirst();
            Function1<Object, Unit> readObserver2 = first.getReadObserver();
            writeObserver2 = first.getWriteObserver();
            second = pairMergeObservers.getSecond();
            function1 = readObserver2;
        } else {
            second = null;
        }
        recordPrevious$runtime_release(getSnapshotId());
        synchronized (SnapshotKt.getLock()) {
            long j10 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId++;
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(j10);
            SnapshotIdSet invalid = getInvalid();
            setInvalid$runtime_release(invalid.set(j10));
            nestedMutableSnapshot = new NestedMutableSnapshot(j10, SnapshotKt.addRange(invalid, getSnapshotId() + 1, j10), SnapshotKt.mergedReadObserver$default(function1, getReadObserver(), false, 4, null), SnapshotKt.mergedWriteObserver(writeObserver2, getWriteObserver$runtime_release()), this);
        }
        if (!getApplied() && !getDisposed()) {
            long snapshotId = getSnapshotId();
            synchronized (SnapshotKt.getLock()) {
                long j11 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId++;
                setSnapshotId$runtime_release(j11);
                SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getSnapshotId());
                Unit unit = Unit.INSTANCE;
            }
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid(), snapshotId + 1, getSnapshotId()));
        }
        if (persistentList != null) {
            SnapshotObserverKt.dispatchCreatedObservers(persistentList, this, nestedMutableSnapshot, second);
        }
        return nestedMutableSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(Function1<Object, Unit> readObserver) {
        Function1<Object, Unit> function1;
        Map<SnapshotObserver, SnapshotInstanceObservers> second;
        NestedReadonlySnapshot nestedReadonlySnapshot;
        validateNotDisposed$runtime_release();
        validateNotAppliedOrPinned();
        long snapshotId = getSnapshotId();
        MutableSnapshot mutableSnapshot = this instanceof GlobalSnapshot ? null : this;
        PersistentList persistentList = SnapshotObserverKt.observers;
        if (persistentList != null) {
            Pair<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> pairMergeObservers = SnapshotObserverKt.mergeObservers(persistentList, mutableSnapshot, true, readObserver, null);
            SnapshotInstanceObservers first = pairMergeObservers.getFirst();
            Function1<Object, Unit> readObserver2 = first.getReadObserver();
            first.getWriteObserver();
            function1 = readObserver2;
            second = pairMergeObservers.getSecond();
        } else {
            function1 = readObserver;
            second = null;
        }
        recordPrevious$runtime_release(getSnapshotId());
        synchronized (SnapshotKt.getLock()) {
            long j10 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId++;
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(j10);
            nestedReadonlySnapshot = new NestedReadonlySnapshot(j10, SnapshotKt.addRange(getInvalid(), snapshotId + 1, j10), SnapshotKt.mergedReadObserver$default(function1, getReadObserver(), false, 4, null), this);
        }
        if (!getApplied() && !getDisposed()) {
            long snapshotId2 = getSnapshotId();
            synchronized (SnapshotKt.getLock()) {
                long j11 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId++;
                setSnapshotId$runtime_release(j11);
                SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getSnapshotId());
                Unit unit = Unit.INSTANCE;
            }
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid(), snapshotId2 + 1, getSnapshotId()));
        }
        if (persistentList != null) {
            SnapshotObserverKt.dispatchCreatedObservers(persistentList, mutableSnapshot, nestedReadonlySnapshot, second);
        }
        return nestedReadonlySnapshot;
    }

    public final void advance$runtime_release() {
        recordPrevious$runtime_release(getSnapshotId());
        Unit unit = Unit.INSTANCE;
        if (getApplied() || getDisposed()) {
            return;
        }
        long snapshotId = getSnapshotId();
        synchronized (SnapshotKt.getLock()) {
            long j10 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId++;
            setSnapshotId$runtime_release(j10);
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getSnapshotId());
        }
        setInvalid$runtime_release(SnapshotKt.addRange(getInvalid(), snapshotId + 1, getSnapshotId()));
    }
}
