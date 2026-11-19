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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u001f\n\u0002\u0010 \n\u0002\b\u001c\b\u0017\u0018\u0000 z2\u00020\u0001:\u0001zBI\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J?\u0010\u0011\u001a\u00020\u00002\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0018\u001a\u00020\u00012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010!\u001a\u00020\tH\u0010¢\u0006\u0004\b \u0010\u0017J\u000f\u0010#\u001a\u00020\tH\u0010¢\u0006\u0004\b\"\u0010\u0017J\u000f\u0010%\u001a\u00020\tH\u0010¢\u0006\u0004\b$\u0010\u0017JG\u00100\u001a\u00020\u00132\n\u0010&\u001a\u00060\u0002j\u0002`\u00032\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0014\u0010,\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0018\u00010*2\u0006\u0010-\u001a\u00020\u0005H\u0000¢\u0006\u0004\b.\u0010/J$\u00106\u001a\u00028\u0000\"\u0004\b\u0000\u001012\f\u00103\u001a\b\u0012\u0004\u0012\u00028\u000002H\u0080\b¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\tH\u0000¢\u0006\u0004\b4\u0010\u0017J\u001b\u0010:\u001a\u00020\t2\n\u00107\u001a\u00060\u0002j\u0002`\u0003H\u0000¢\u0006\u0004\b8\u00109J\u0017\u0010>\u001a\u00020\t2\u0006\u00107\u001a\u00020;H\u0000¢\u0006\u0004\b<\u0010=J\u0017\u0010C\u001a\u00020\t2\u0006\u0010@\u001a\u00020?H\u0000¢\u0006\u0004\bA\u0010BJ\u0017\u0010G\u001a\u00020\t2\u0006\u0010D\u001a\u00020\u0005H\u0000¢\u0006\u0004\bE\u0010FJ\u0017\u0010K\u001a\u00020\t2\u0006\u0010H\u001a\u00020(H\u0010¢\u0006\u0004\bI\u0010JJ\u000f\u0010L\u001a\u00020\tH\u0002¢\u0006\u0004\bL\u0010\u0017J\u000f\u0010M\u001a\u00020\tH\u0002¢\u0006\u0004\bM\u0010\u0017J\u000f\u0010N\u001a\u00020\tH\u0002¢\u0006\u0004\bN\u0010\u0017J\u000f\u0010O\u001a\u00020\tH\u0002¢\u0006\u0004\bO\u0010\u0017R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\n\u0010P\u001a\u0004\bQ\u0010RR(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000b\u0010P\u001a\u0004\bS\u0010RR\"\u0010T\u001a\u00020;8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010=R:\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'2\u000e\u0010Y\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'8\u0010@VX\u0090\u000e¢\u0006\u0012\n\u0004\b)\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R*\u0010`\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010_8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010f\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010FR\"\u0010k\u001a\u00020?8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010BR\u0016\u0010D\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010UR\"\u0010p\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010\u0010\"\u0004\bs\u0010tR\u0014\u0010v\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bu\u0010\u0010R\u0014\u0010y\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bw\u0010x¨\u0006{"}, m5110d2 = {"Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "Lkotlin/Function1;", "", "Ld6/s;", "readObserver", "writeObserver", "<init>", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;Lr6/c;Lr6/c;)V", "", "hasPendingChanges", "()Z", "takeNestedMutableSnapshot", "(Lr6/c;Lr6/c;)Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "apply", "()Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "dispose", "()V", "takeNestedSnapshot", "(Lr6/c;)Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "nestedActivated$runtime_release", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "nestedActivated", "nestedDeactivated$runtime_release", "nestedDeactivated", "notifyObjectsInitialized$runtime_release", "notifyObjectsInitialized", "closeLocked$runtime_release", "closeLocked", "releasePinnedSnapshotsForCloseLocked$runtime_release", "releasePinnedSnapshotsForCloseLocked", "nextId", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/runtime/snapshots/StateObject;", "modified", "", "Landroidx/compose/runtime/snapshots/StateRecord;", "optimisticMerges", "invalidSnapshots", "innerApplyLocked$runtime_release", "(JLandroidx/collection/MutableScatterSet;Ljava/util/Map;Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "innerApplyLocked", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "block", "advance$runtime_release", "(Lr6/a;)Ljava/lang/Object;", "advance", "id", "recordPrevious$runtime_release", "(J)V", "recordPrevious", "", "recordPreviousPinnedSnapshot$runtime_release", "(I)V", "recordPreviousPinnedSnapshot", "", "handles", "recordPreviousPinnedSnapshots$runtime_release", "([I)V", "recordPreviousPinnedSnapshots", "snapshots", "recordPreviousList$runtime_release", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "recordPreviousList", "state", "recordModified$runtime_release", "(Landroidx/compose/runtime/snapshots/StateObject;)V", "recordModified", "validateNotApplied", "validateNotAppliedOrPinned", "abandon", "releasePreviouslyPinnedSnapshotsLocked", "Lr6/c;", "getReadObserver$runtime_release", "()Lr6/c;", "getWriteObserver$runtime_release", "writeCount", "I", "getWriteCount$runtime_release", "()I", "setWriteCount$runtime_release", "<set-?>", "Landroidx/collection/MutableScatterSet;", "getModified$runtime_release", "()Landroidx/collection/MutableScatterSet;", "setModified", "(Landroidx/collection/MutableScatterSet;)V", "", "merged", "Ljava/util/List;", "getMerged$runtime_release", "()Ljava/util/List;", "setMerged$runtime_release", "(Ljava/util/List;)V", "previousIds", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getPreviousIds$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setPreviousIds$runtime_release", "previousPinnedSnapshots", "[I", "getPreviousPinnedSnapshots$runtime_release", "()[I", "setPreviousPinnedSnapshots$runtime_release", "applied", "Z", "getApplied$runtime_release", "setApplied$runtime_release", "(Z)V", "getReadOnly", "readOnly", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "root", "Companion", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/MutableSnapshot\n+ 2 SnapshotObserver.kt\nandroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 4 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 7 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 8 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 9 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 10 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,2487:1\n1101#1,2:2500\n1107#1,3:2506\n1110#1:2513\n1111#1,5:2515\n1101#1,2:2610\n1107#1,3:2617\n1110#1:2624\n1111#1,5:2626\n1101#1,9:2718\n1110#1:2731\n1111#1,5:2733\n193#2,12:2488\n205#2,2:2520\n193#2,12:2598\n205#2,2:2631\n1894#3,2:2502\n1894#3,2:2509\n1894#3,2:2522\n1894#3,2:2538\n1894#3,2:2612\n1894#3,2:2620\n1894#3,2:2703\n1894#3,2:2714\n1894#3,2:2727\n1894#3,2:2738\n1894#3,2:2742\n33#4,2:2504\n33#4,2:2511\n33#4,2:2524\n33#4,2:2540\n33#4,2:2614\n33#4,2:2622\n33#4,2:2705\n33#4,2:2716\n33#4,2:2729\n33#4,2:2740\n33#4,2:2744\n1#5:2514\n1#5:2616\n1#5:2625\n1#5:2691\n1#5:2732\n1#5:2746\n33#6,6:2526\n33#6,6:2532\n33#6,6:2592\n33#6,4:2699\n38#6:2707\n33#6,6:2708\n231#7,3:2542\n200#7,7:2545\n211#7,3:2553\n214#7,9:2557\n234#7:2566\n231#7,3:2567\n200#7,7:2570\n211#7,3:2578\n214#7,9:2582\n234#7:2591\n231#7,3:2649\n200#7,7:2652\n211#7,3:2660\n214#7,9:2664\n234#7:2673\n231#7,3:2674\n200#7,7:2677\n211#7,3:2685\n214#7,2:2689\n217#7,6:2692\n234#7:2698\n1399#8:2552\n1270#8:2556\n1399#8:2577\n1270#8:2581\n1399#8:2659\n1270#8:2663\n1399#8:2684\n1270#8:2688\n33#9,5:2633\n48#9,5:2638\n48#9,5:2644\n205#10:2643\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/MutableSnapshot\n*L\n771#1:2500,2\n771#1:2506,3\n771#1:2513\n771#1:2515,5\n923#1:2610,2\n923#1:2617,3\n923#1:2624\n923#1:2626,5\n1118#1:2718,9\n1118#1:2731\n1118#1:2733,5\n768#1:2488,12\n768#1:2520,2\n917#1:2598,12\n917#1:2631,2\n772#1:2502,2\n771#1:2509,2\n830#1:2522,2\n886#1:2538,2\n924#1:2612,2\n923#1:2620,2\n1084#1:2703,2\n1109#1:2714,2\n1118#1:2727,2\n1121#1:2738,2\n1142#1:2742,2\n772#1:2504,2\n771#1:2511,2\n830#1:2524,2\n886#1:2540,2\n924#1:2614,2\n923#1:2622,2\n1084#1:2705,2\n1109#1:2716,2\n1118#1:2729,2\n1121#1:2740,2\n1142#1:2744,2\n771#1:2514\n923#1:2625\n1118#1:2732\n872#1:2526,6\n878#1:2532,6\n891#1:2592,6\n1081#1:2699,4\n1081#1:2707\n1092#1:2708,6\n889#1:2542,3\n889#1:2545,7\n889#1:2553,3\n889#1:2557,9\n889#1:2566\n890#1:2567,3\n890#1:2570,7\n890#1:2578,3\n890#1:2582,9\n890#1:2591\n989#1:2649,3\n989#1:2652,7\n989#1:2660,3\n989#1:2664,9\n989#1:2673\n1024#1:2674,3\n1024#1:2677,7\n1024#1:2685,3\n1024#1:2689,2\n1024#1:2692,6\n1024#1:2698\n889#1:2552\n889#1:2556\n890#1:2577\n890#1:2581\n989#1:2659\n989#1:2663\n1024#1:2684\n1024#1:2688\n943#1:2633,5\n967#1:2638,5\n971#1:2644,5\n971#1:2643\n*E\n"})
/* loaded from: classes.dex */
public class MutableSnapshot extends Snapshot {
    private boolean applied;

    @Nullable
    private List<? extends StateObject> merged;

    @Nullable
    private MutableScatterSet<StateObject> modified;

    @NotNull
    private SnapshotIdSet previousIds;

    @NotNull
    private int[] previousPinnedSnapshots;

    @Nullable
    private final InterfaceC6471c readObserver;
    private int snapshots;
    private int writeCount;

    @Nullable
    private final InterfaceC6471c writeObserver;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final int[] EmptyIntArray = new int[0];

    @Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m5110d2 = {"Landroidx/compose/runtime/snapshots/MutableSnapshot$Companion;", "", "()V", "EmptyIntArray", "", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        private Companion() {
        }
    }

    public MutableSnapshot(long j7, @NotNull SnapshotIdSet snapshotIdSet, @Nullable InterfaceC6471c interfaceC6471c, @Nullable InterfaceC6471c interfaceC6471c2) {
        super(j7, snapshotIdSet, (AbstractC5824e) null);
        this.readObserver = interfaceC6471c;
        this.writeObserver = interfaceC6471c2;
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
            boolean r14 = kotlin.collections.AbstractC5805t.m5224d0(r14, r15)
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
        for (int i = 0; i < length; i++) {
            SnapshotKt.releasePinningLocked(this.previousPinnedSnapshots[i]);
        }
    }

    public static /* synthetic */ MutableSnapshot takeNestedMutableSnapshot$default(MutableSnapshot mutableSnapshot, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedMutableSnapshot");
        }
        if ((i & 1) != 0) {
            interfaceC6471c = null;
        }
        if ((i & 2) != 0) {
            interfaceC6471c2 = null;
        }
        return mutableSnapshot.takeNestedMutableSnapshot(interfaceC6471c, interfaceC6471c2);
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

    public final <T> T advance$runtime_release(@NotNull InterfaceC6469a block) {
        recordPrevious$runtime_release(getSnapshotId());
        T t8 = (T) block.invoke();
        if (getApplied() || getDisposed()) {
            return t8;
        }
        long snapshotId = getSnapshotId();
        synchronized (SnapshotKt.getLock()) {
            long j7 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId++;
            setSnapshotId$runtime_release(j7);
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getSnapshotId());
        }
        setInvalid$runtime_release(SnapshotKt.addRange(getInvalid(), snapshotId + 1, getSnapshotId()));
        return t8;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0170  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.runtime.snapshots.SnapshotApplyResult apply() {
        /*
            Method dump skipped, instructions count: 406
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
        mo10227nestedDeactivated$runtime_release(this);
        SnapshotObserverKt.dispatchObserverOnPreDispose(this);
    }

    /* renamed from: getApplied$runtime_release, reason: from getter */
    public final boolean getApplied() {
        return this.applied;
    }

    @Nullable
    public final List<StateObject> getMerged$runtime_release() {
        return this.merged;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    public MutableScatterSet<StateObject> getModified$runtime_release() {
        return this.modified;
    }

    @NotNull
    /* renamed from: getPreviousIds$runtime_release, reason: from getter */
    public final SnapshotIdSet getPreviousIds() {
        return this.previousIds;
    }

    @NotNull
    /* renamed from: getPreviousPinnedSnapshots$runtime_release, reason: from getter */
    public final int[] getPreviousPinnedSnapshots() {
        return this.previousPinnedSnapshots;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    /* renamed from: getReadObserver$runtime_release, reason: from getter */
    public InterfaceC6471c getReadObserver() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    public Snapshot getRoot() {
        return this;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: getWriteCount$runtime_release, reason: from getter */
    public int getWriteCount() {
        return this.writeCount;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    /* renamed from: getWriteObserver$runtime_release, reason: from getter */
    public InterfaceC6471c getWriteObserver() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        MutableScatterSet<StateObject> modified$runtime_release = getModified$runtime_release();
        return modified$runtime_release != null && modified$runtime_release.isNotEmpty();
    }

    @NotNull
    public final SnapshotApplyResult innerApplyLocked$runtime_release(long nextId, @NotNull MutableScatterSet<StateObject> modified, @Nullable Map<StateRecord, ? extends StateRecord> optimisticMerges, @NotNull SnapshotIdSet invalidSnapshots) {
        SnapshotIdSet snapshotIdSet;
        Object[] objArr;
        long[] jArr;
        SnapshotIdSet snapshotIdSet2;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j7;
        int i8;
        StateRecord stateRecordMergeRecords;
        SnapshotIdSet snapshotIdSetM1101or = getInvalid().set(getSnapshotId()).m1101or(this.previousIds);
        Object[] objArr3 = modified.elements;
        long[] jArr3 = modified.metadata;
        int length = jArr3.length - 2;
        ArrayList arrayList = null;
        ArrayList arrayListM5240t0 = null;
        if (length >= 0) {
            int i9 = 0;
            while (true) {
                long j8 = jArr3[i9];
                ArrayList arrayList2 = arrayListM5240t0;
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8;
                    int i11 = 8 - ((~(i9 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            i = i10;
                            StateObject stateObject = (StateObject) objArr3[(i9 << 3) + i12];
                            objArr2 = objArr3;
                            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
                            jArr2 = jArr3;
                            ArrayList arrayList3 = arrayList;
                            StateRecord stateRecord = SnapshotKt.readable(firstStateRecord, nextId, invalidSnapshots);
                            if (stateRecord == null) {
                                j7 = j8;
                            } else {
                                j7 = j8;
                                StateRecord stateRecord2 = SnapshotKt.readable(firstStateRecord, getSnapshotId(), snapshotIdSetM1101or);
                                if (stateRecord2 != null && stateRecord2.getSnapshotId() != SnapshotId_jvmKt.toSnapshotId(1) && !stateRecord.equals(stateRecord2)) {
                                    i8 = i12;
                                    snapshotIdSet2 = snapshotIdSetM1101or;
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
                                    if (!stateRecordMergeRecords.equals(stateRecord3)) {
                                        if (stateRecordMergeRecords.equals(stateRecord)) {
                                            ArrayList arrayList4 = arrayList3 == null ? new ArrayList() : arrayList3;
                                            arrayList4.add(new Pair(stateObject, stateRecord.create(getSnapshotId())));
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                            }
                                            ArrayList arrayList5 = arrayList2;
                                            arrayList5.add(stateObject);
                                            arrayList = arrayList4;
                                            arrayList2 = arrayList5;
                                        } else {
                                            arrayList = arrayList3 == null ? new ArrayList() : arrayList3;
                                            arrayList.add(!stateRecordMergeRecords.equals(stateRecord2) ? new Pair(stateObject, stateRecordMergeRecords) : new Pair(stateObject, stateRecord2.create(getSnapshotId())));
                                        }
                                    }
                                }
                                arrayList = arrayList3;
                            }
                            snapshotIdSet2 = snapshotIdSetM1101or;
                            i8 = i12;
                            arrayList = arrayList3;
                        } else {
                            snapshotIdSet2 = snapshotIdSetM1101or;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i10;
                            j7 = j8;
                            i8 = i12;
                        }
                        j8 = j7 >> i;
                        i12 = i8 + 1;
                        objArr3 = objArr2;
                        i10 = i;
                        jArr3 = jArr2;
                        snapshotIdSetM1101or = snapshotIdSet2;
                    }
                    snapshotIdSet = snapshotIdSetM1101or;
                    objArr = objArr3;
                    jArr = jArr3;
                    ArrayList arrayList6 = arrayList;
                    if (i11 != i10) {
                        arrayListM5240t0 = arrayList2;
                        arrayList = arrayList6;
                        break;
                    }
                    arrayList = arrayList6;
                } else {
                    snapshotIdSet = snapshotIdSetM1101or;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                arrayListM5240t0 = arrayList2;
                if (i9 == length) {
                    break;
                }
                i9++;
                objArr3 = objArr;
                jArr3 = jArr;
                snapshotIdSetM1101or = snapshotIdSet;
            }
        }
        if (arrayList != null) {
            advance$runtime_release();
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                Pair pair = (Pair) arrayList.get(i13);
                StateObject stateObject2 = (StateObject) pair.component1();
                StateRecord stateRecord4 = (StateRecord) pair.component2();
                stateRecord4.setSnapshotId$runtime_release(nextId);
                synchronized (SnapshotKt.getLock()) {
                    stateRecord4.setNext$runtime_release(stateObject2.getFirstStateRecord());
                    stateObject2.prependStateRecord(stateRecord4);
                }
            }
        }
        if (arrayListM5240t0 != null) {
            int size2 = arrayListM5240t0.size();
            for (int i14 = 0; i14 < size2; i14++) {
                modified.remove((StateObject) arrayListM5240t0.get(i14));
            }
            List<? extends StateObject> list = this.merged;
            if (list != null) {
                arrayListM5240t0 = AbstractC5805t.m5240t0(list, arrayListM5240t0);
            }
            this.merged = arrayListM5240t0;
        }
        return SnapshotApplyResult.Success.INSTANCE;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedActivated$runtime_release */
    public void mo10226nestedActivated$runtime_release(@NotNull Snapshot snapshot) {
        this.snapshots++;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedDeactivated$runtime_release */
    public void mo10227nestedDeactivated$runtime_release(@NotNull Snapshot snapshot) {
        if (!(this.snapshots > 0)) {
            PreconditionsKt.throwIllegalArgumentException("no pending nested snapshots");
        }
        int i = this.snapshots - 1;
        this.snapshots = i;
        if (i != 0 || this.applied) {
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
    public void mo10229recordModified$runtime_release(@NotNull StateObject state) {
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
        }
    }

    public final void recordPreviousList$runtime_release(@NotNull SnapshotIdSet snapshots) {
        synchronized (SnapshotKt.getLock()) {
            this.previousIds = this.previousIds.m1101or(snapshots);
        }
    }

    public final void recordPreviousPinnedSnapshot$runtime_release(int id) {
        if (id >= 0) {
            int[] iArr = this.previousPinnedSnapshots;
            AbstractC5830k.m5330g(iArr, "<this>");
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
            iArrCopyOf[length] = id;
            this.previousPinnedSnapshots = iArrCopyOf;
        }
    }

    public final void recordPreviousPinnedSnapshots$runtime_release(@NotNull int[] handles) {
        if (handles.length == 0) {
            return;
        }
        int[] iArr = this.previousPinnedSnapshots;
        if (iArr.length != 0) {
            int length = iArr.length;
            int length2 = handles.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
            System.arraycopy(handles, 0, iArrCopyOf, length, length2);
            AbstractC5830k.m5327d(iArrCopyOf);
            handles = iArrCopyOf;
        }
        this.previousPinnedSnapshots = handles;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void releasePinnedSnapshotsForCloseLocked$runtime_release() {
        releasePreviouslyPinnedSnapshotsLocked();
        super.releasePinnedSnapshotsForCloseLocked$runtime_release();
    }

    public final void setApplied$runtime_release(boolean z8) {
        this.applied = z8;
    }

    public final void setMerged$runtime_release(@Nullable List<? extends StateObject> list) {
        this.merged = list;
    }

    public void setModified(@Nullable MutableScatterSet<StateObject> mutableScatterSet) {
        this.modified = mutableScatterSet;
    }

    public final void setPreviousIds$runtime_release(@NotNull SnapshotIdSet snapshotIdSet) {
        this.previousIds = snapshotIdSet;
    }

    public final void setPreviousPinnedSnapshots$runtime_release(@NotNull int[] iArr) {
        this.previousPinnedSnapshots = iArr;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setWriteCount$runtime_release(int i) {
        this.writeCount = i;
    }

    @NotNull
    public MutableSnapshot takeNestedMutableSnapshot(@Nullable InterfaceC6471c readObserver, @Nullable InterfaceC6471c writeObserver) {
        Map<SnapshotObserver, SnapshotInstanceObservers> second;
        NestedMutableSnapshot nestedMutableSnapshot;
        validateNotDisposed$runtime_release();
        validateNotAppliedOrPinned();
        PersistentList persistentList = SnapshotObserverKt.observers;
        InterfaceC6471c interfaceC6471c = readObserver;
        InterfaceC6471c writeObserver2 = writeObserver;
        if (persistentList != null) {
            Pair<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> pairMergeObservers = SnapshotObserverKt.mergeObservers(persistentList, this, false, interfaceC6471c, writeObserver2);
            SnapshotInstanceObservers first = pairMergeObservers.getFirst();
            InterfaceC6471c readObserver2 = first.getReadObserver();
            writeObserver2 = first.getWriteObserver();
            second = pairMergeObservers.getSecond();
            interfaceC6471c = readObserver2;
        } else {
            second = null;
        }
        recordPrevious$runtime_release(getSnapshotId());
        synchronized (SnapshotKt.getLock()) {
            long j7 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId++;
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(j7);
            SnapshotIdSet invalid = getInvalid();
            setInvalid$runtime_release(invalid.set(j7));
            nestedMutableSnapshot = new NestedMutableSnapshot(j7, SnapshotKt.addRange(invalid, getSnapshotId() + 1, j7), SnapshotKt.mergedReadObserver$default(interfaceC6471c, getReadObserver(), false, 4, null), SnapshotKt.mergedWriteObserver(writeObserver2, getWriteObserver()), this);
        }
        if (!getApplied() && !getDisposed()) {
            long snapshotId = getSnapshotId();
            synchronized (SnapshotKt.getLock()) {
                long j8 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId++;
                setSnapshotId$runtime_release(j8);
                SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getSnapshotId());
            }
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid(), snapshotId + 1, getSnapshotId()));
        }
        if (persistentList != null) {
            SnapshotObserverKt.dispatchCreatedObservers(persistentList, this, nestedMutableSnapshot, second);
        }
        return nestedMutableSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    public Snapshot takeNestedSnapshot(@Nullable InterfaceC6471c readObserver) {
        InterfaceC6471c interfaceC6471c;
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
            InterfaceC6471c readObserver2 = first.getReadObserver();
            first.getWriteObserver();
            interfaceC6471c = readObserver2;
            second = pairMergeObservers.getSecond();
        } else {
            interfaceC6471c = readObserver;
            second = null;
        }
        recordPrevious$runtime_release(getSnapshotId());
        synchronized (SnapshotKt.getLock()) {
            long j7 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId++;
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(j7);
            nestedReadonlySnapshot = new NestedReadonlySnapshot(j7, SnapshotKt.addRange(getInvalid(), snapshotId + 1, j7), SnapshotKt.mergedReadObserver$default(interfaceC6471c, getReadObserver(), false, 4, null), this);
        }
        if (!getApplied() && !getDisposed()) {
            long snapshotId2 = getSnapshotId();
            synchronized (SnapshotKt.getLock()) {
                long j8 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId++;
                setSnapshotId$runtime_release(j8);
                SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getSnapshotId());
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
        if (getApplied() || getDisposed()) {
            return;
        }
        long snapshotId = getSnapshotId();
        synchronized (SnapshotKt.getLock()) {
            long j7 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId++;
            setSnapshotId$runtime_release(j7);
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getSnapshotId());
        }
        setInvalid$runtime_release(SnapshotKt.addRange(getInvalid(), snapshotId + 1, getSnapshotId()));
    }
}
