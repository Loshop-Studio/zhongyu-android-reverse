package androidx.compose.runtime.snapshots;

import androidx.autofill.HintConstants;
import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.internal.WeakReference;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\u009c\u0001\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\n\u001a\b\u0010'\u001a\u00020\tH\u0002\u001a6\u0010'\u001a\u0002H(\"\u0004\b\u0000\u0010(2!\u0010)\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u0002H(0\u000bH\u0002¢\u0006\u0002\u0010*\u001a\b\u0010+\u001a\u00020\tH\u0002\u001a4\u0010,\u001a\u00020\b2\b\u0010-\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\b\b\u0002\u0010/\u001a\u000200H\u0002\u001a\u001f\u00101\u001a\u0002H(\"\b\b\u0000\u0010(*\u0002022\u0006\u00103\u001a\u0002H(H\u0001¢\u0006\u0002\u00104\u001a'\u00101\u001a\u0002H(\"\b\b\u0000\u0010(*\u0002022\u0006\u00103\u001a\u0002H(2\u0006\u00105\u001a\u00020\bH\u0001¢\u0006\u0002\u00106\u001a\b\u00107\u001a\u00020\bH\u0000\u001aL\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\u0014\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\b\b\u0002\u0010:\u001a\u000200H\u0002\u001aB\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bH\u0002\u001a\u0018\u0010=\u001a\u00020\t2\u0006\u00105\u001a\u00020\b2\u0006\u0010>\u001a\u00020\u0012H\u0001\u001a2\u0010?\u001a\u0010\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000202\u0018\u00010@2\n\u0010A\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\fH\u0002\u001a\u0010\u0010E\u001a\u0002002\u0006\u0010>\u001a\u00020\u0012H\u0002\u001a\u0010\u0010F\u001a\u00020\t2\u0006\u0010>\u001a\u00020\u0012H\u0002\u001a\b\u0010G\u001a\u00020HH\u0002\u001a5\u0010I\u001a\u0004\u0018\u0001H(\"\b\b\u0000\u0010(*\u0002022\u0006\u00103\u001a\u0002H(2\n\u0010J\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0002\u0010K\u001a\u0010\u0010L\u001a\u00020\t2\u0006\u0010M\u001a\u00020NH\u0000\u001a\b\u0010O\u001a\u00020HH\u0002\u001a>\u0010P\u001a\u0002H(\"\u0004\b\u0000\u0010(2\u0006\u0010\u0013\u001a\u00020\u00142!\u0010)\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u0002H(0\u000bH\u0002¢\u0006\u0002\u0010Q\u001a/\u0010R\u001a\u0002H(\"\u0004\b\u0000\u0010(2\f\u0010)\u001a\b\u0012\u0004\u0012\u0002H(0SH\u0081\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010T\u001a:\u0010U\u001a\u0002H(\"\b\b\u0000\u0010(*\u00020\b2!\u0010)\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u0002H(0\u000bH\u0002¢\u0006\u0002\u0010V\u001a\u001c\u0010W\u001a\u00020N2\n\u0010X\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u000f\u001a\u00020\fH\u0000\u001a\u0012\u0010Y\u001a\u0004\u0018\u0001022\u0006\u0010>\u001a\u00020\u0012H\u0002\u001a(\u0010Z\u001a\u0002002\n\u00107\u001a\u00060\u0001j\u0002`\u00022\n\u0010[\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u000f\u001a\u00020\fH\u0002\u001a$\u0010Z\u001a\u0002002\u0006\u0010\\\u001a\u0002022\n\u00105\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u000f\u001a\u00020\fH\u0002\u001a\u0010\u0010]\u001a\u00020\t2\u0006\u00105\u001a\u00020\bH\u0002\u001a$\u0010^\u001a\u00020\f*\u00020\f2\n\u0010_\u001a\u00060\u0001j\u0002`\u00022\n\u0010`\u001a\u00060\u0001j\u0002`\u0002H\u0000\u001a!\u0010a\u001a\u000202*\u0002022\u0012\u0010b\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u0002000\u000bH\u0082\b\u001a#\u0010c\u001a\u0002H(\"\b\b\u0000\u0010(*\u000202*\u0002H(2\u0006\u0010>\u001a\u00020\u0012H\u0000¢\u0006\u0002\u0010d\u001a+\u0010e\u001a\u0002H(\"\b\b\u0000\u0010(*\u000202*\u0002H(2\u0006\u0010>\u001a\u00020\u00122\u0006\u00105\u001a\u00020\bH\u0000¢\u0006\u0002\u0010f\u001a+\u0010g\u001a\u0002H(\"\b\b\u0000\u0010(*\u000202*\u0002H(2\u0006\u0010>\u001a\u00020\u00122\u0006\u00105\u001a\u00020\bH\u0002¢\u0006\u0002\u0010f\u001aK\u0010h\u001a\u0002Hi\"\b\b\u0000\u0010(*\u000202\"\u0004\b\u0001\u0010i*\u0002H(2\u0006\u0010>\u001a\u00020\u00122\u0006\u0010j\u001a\u0002H(2\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u0002H(\u0012\u0004\u0012\u0002Hi0\u000b¢\u0006\u0002\bkH\u0080\b¢\u0006\u0002\u0010l\u001a3\u0010m\u001a\u0002H(\"\b\b\u0000\u0010(*\u000202*\u0002H(2\u0006\u0010>\u001a\u00020\u00122\u0006\u00105\u001a\u00020\b2\u0006\u0010j\u001a\u0002H(H\u0000¢\u0006\u0002\u0010n\u001a!\u0010I\u001a\u0002H(\"\b\b\u0000\u0010(*\u000202*\u0002H(2\u0006\u0010>\u001a\u00020\u0012¢\u0006\u0002\u0010d\u001a)\u0010I\u001a\u0002H(\"\b\b\u0000\u0010(*\u000202*\u0002H(2\u0006\u0010>\u001a\u00020\u00122\u0006\u00105\u001a\u00020\b¢\u0006\u0002\u0010f\u001aE\u0010o\u001a\u0002Hi\"\b\b\u0000\u0010(*\u000202\"\u0004\b\u0001\u0010i*\u0002H(2!\u0010)\u001a\u001d\u0012\u0013\u0012\u0011H(¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(3\u0012\u0004\u0012\u0002Hi0\u000bH\u0086\b¢\u0006\u0002\u0010p\u001aC\u0010q\u001a\u0002Hi\"\b\b\u0000\u0010(*\u000202\"\u0004\b\u0001\u0010i*\u0002H(2\u0006\u0010>\u001a\u00020\u00122\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u0002H(\u0012\u0004\u0012\u0002Hi0\u000b¢\u0006\u0002\bkH\u0086\b¢\u0006\u0002\u0010r\u001aK\u0010q\u001a\u0002Hi\"\b\b\u0000\u0010(*\u000202\"\u0004\b\u0001\u0010i*\u0002H(2\u0006\u0010>\u001a\u00020\u00122\u0006\u00105\u001a\u00020\b2\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u0002H(\u0012\u0004\u0012\u0002Hi0\u000b¢\u0006\u0002\bkH\u0086\b¢\u0006\u0002\u0010s\u001a+\u0010t\u001a\u0002H(\"\b\b\u0000\u0010(*\u000202*\u0002H(2\u0006\u0010>\u001a\u00020\u00122\u0006\u00105\u001a\u00020\bH\u0001¢\u0006\u0002\u0010f\"\u0012\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002X\u0082D¢\u0006\u0002\n\u0000\",\u0010\u0003\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\")\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\t0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000\" \u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u000b0\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\"\u001c\u0010\u0016\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u000e\u0010\u001b\u001a\u00020\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001c\u0010!\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010$\"\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0&X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006u"}, m13558d2 = {"INVALID_SNAPSHOT", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "applyObservers", "", "Lkotlin/Function2;", "", "", "Landroidx/compose/runtime/snapshots/Snapshot;", "", "emptyLambda", "Lkotlin/Function1;", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "invalid", "extraStateObjects", "Landroidx/compose/runtime/snapshots/SnapshotWeakSet;", "Landroidx/compose/runtime/snapshots/StateObject;", "globalSnapshot", "Landroidx/compose/runtime/snapshots/GlobalSnapshot;", "globalWriteObservers", "lock", "getLock$annotations", "()V", "getLock", "()Ljava/lang/Object;", "nextSnapshotId", "openSnapshots", "pendingApplyObserverCount", "Landroidx/compose/runtime/internal/AtomicInt;", "pinningTable", "Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "snapshotInitializer", "getSnapshotInitializer$annotations", "getSnapshotInitializer", "()Landroidx/compose/runtime/snapshots/Snapshot;", "threadSnapshot", "Landroidx/compose/runtime/internal/SnapshotThreadLocal;", "advanceGlobalSnapshot", ExifInterface.GPS_DIRECTION_TRUE, "block", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "checkAndOverwriteUnusedRecordsLocked", "createTransparentSnapshotWithNoParentReadObserver", "previousSnapshot", "readObserver", "ownsPreviousSnapshot", "", "current", "Landroidx/compose/runtime/snapshots/StateRecord;", "r", "(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "snapshot", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "currentSnapshot", "mergedReadObserver", "parentObserver", "mergeReadObserver", "mergedWriteObserver", "writeObserver", "notifyWrite", "state", "optimisticMerges", "", "currentSnapshotId", "applyingSnapshot", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "invalidSnapshots", "overwriteUnusedRecordsLocked", "processForUnusedRecordsLocked", "readError", "", "readable", "id", "(Landroidx/compose/runtime/snapshots/StateRecord;JLandroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/StateRecord;", "releasePinningLocked", "handle", "", "reportReadonlySnapshotWrite", "resetGlobalSnapshotLocked", "(Landroidx/compose/runtime/snapshots/GlobalSnapshot;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "sync", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "takeNewSnapshot", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/Snapshot;", "trackPinning", "snapshotId", "usedLocked", "valid", "candidateSnapshot", "data", "validateOpen", "addRange", TypedValues.TransitionType.S_FROM, "until", "findYoungestOr", "predicate", "newOverwritableRecordLocked", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;)Landroidx/compose/runtime/snapshots/StateRecord;", "newWritableRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "newWritableRecordLocked", "overwritable", "R", "candidate", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/StateRecord;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "overwritableRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "withCurrent", "(Landroidx/compose/runtime/snapshots/StateRecord;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "writable", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "writableRecord", "runtime_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 SnapshotWeakSet.kt\nandroidx/compose/runtime/snapshots/SnapshotWeakSet\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2487:1\n1894#1,2:2488\n1894#1,2:2494\n1894#1,2:2504\n1894#1,2:2533\n1894#1,2:2537\n1894#1,2:2541\n2213#1,8:2545\n1894#1,2:2581\n1894#1,2:2585\n1894#1,2:2589\n1894#1,2:2594\n1894#1,2:2598\n1894#1,2:2602\n1894#1,2:2631\n1894#1,2:2635\n33#2,2:2490\n33#2,2:2492\n33#2,2:2496\n33#2,2:2506\n33#2,2:2535\n33#2,2:2539\n33#2,2:2543\n33#2,2:2583\n33#2,2:2587\n33#2,2:2591\n33#2,2:2596\n33#2,2:2600\n33#2,2:2604\n33#2,2:2633\n33#2,2:2637\n27#2:2639\n33#3,6:2498\n231#4,3:2508\n200#4,7:2511\n211#4,3:2519\n214#4,9:2523\n234#4:2532\n231#4,3:2606\n200#4,7:2609\n211#4,3:2617\n214#4,9:2621\n234#4:2630\n1399#5:2518\n1270#5:2522\n1399#5:2616\n1270#5:2620\n125#6,28:2553\n1#7:2593\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n*L\n706#1:2488,2\n1969#1:2494,2\n1988#1:2504,2\n2016#1:2533,2\n2075#1:2537,2\n2097#1:2541,2\n2197#1:2545,8\n2249#1:2581,2\n2277#1:2585,2\n2287#1:2589,2\n2355#1:2594,2\n2366#1:2598,2\n2393#1:2602,2\n2449#1:2631,2\n2460#1:2635,2\n706#1:2490,2\n1895#1:2492,2\n1969#1:2496,2\n1988#1:2506,2\n2016#1:2535,2\n2075#1:2539,2\n2097#1:2543,2\n2249#1:2583,2\n2277#1:2587,2\n2287#1:2591,2\n2355#1:2596,2\n2366#1:2600,2\n2393#1:2604,2\n2449#1:2633,2\n2460#1:2637,2\n1888#1:2639\n1982#1:2498,6\n1990#1:2508,3\n1990#1:2511,7\n1990#1:2519,3\n1990#1:2523,9\n1990#1:2532\n2415#1:2606,3\n2415#1:2609,7\n2415#1:2617,3\n2415#1:2621,9\n2415#1:2630\n1990#1:2518\n1990#1:2522\n2415#1:2616\n2415#1:2620\n2224#1:2553,28\n*E\n"})
/* loaded from: classes2.dex */
public final class SnapshotKt {
    private static final long INVALID_SNAPSHOT = 0;
    private static List<? extends Function2<? super Set<? extends Object>, ? super Snapshot, Unit>> applyObservers;
    private static final SnapshotWeakSet<StateObject> extraStateObjects;
    private static final GlobalSnapshot globalSnapshot;
    private static List<? extends Function1<Object, Unit>> globalWriteObservers;
    private static long nextSnapshotId;
    private static SnapshotIdSet openSnapshots;
    private static AtomicInt pendingApplyObserverCount;
    private static final SnapshotDoubleIndexHeap pinningTable;
    private static final Snapshot snapshotInitializer;
    private static final Function1<SnapshotIdSet, Unit> emptyLambda = new Function1<SnapshotIdSet, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$emptyLambda$1
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SnapshotIdSet snapshotIdSet) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SnapshotIdSet snapshotIdSet) {
            invoke2(snapshotIdSet);
            return Unit.INSTANCE;
        }
    };
    private static final SnapshotThreadLocal<Snapshot> threadSnapshot = new SnapshotThreadLocal<>();
    private static final Object lock = new Object();

    static {
        SnapshotIdSet.Companion companion = SnapshotIdSet.INSTANCE;
        openSnapshots = companion.getEMPTY();
        nextSnapshotId = SnapshotId_jvmKt.toSnapshotId(1) + 1;
        pinningTable = new SnapshotDoubleIndexHeap();
        extraStateObjects = new SnapshotWeakSet<>();
        applyObservers = CollectionsKt.emptyList();
        globalWriteObservers = CollectionsKt.emptyList();
        long j10 = nextSnapshotId;
        nextSnapshotId = 1 + j10;
        GlobalSnapshot globalSnapshot2 = new GlobalSnapshot(j10, companion.getEMPTY());
        openSnapshots = openSnapshots.set(globalSnapshot2.getSnapshotId());
        globalSnapshot = globalSnapshot2;
        snapshotInitializer = globalSnapshot2;
        pendingApplyObserverCount = new AtomicInt(0);
    }

    public static final SnapshotIdSet addRange(SnapshotIdSet snapshotIdSet, long j10, long j11) {
        while (j10 < j11) {
            snapshotIdSet = snapshotIdSet.set(j10);
            j10++;
        }
        return snapshotIdSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> T advanceGlobalSnapshot(kotlin.jvm.functions.Function1<? super androidx.compose.runtime.snapshots.SnapshotIdSet, ? extends T> r15) {
        /*
            androidx.compose.runtime.snapshots.GlobalSnapshot r0 = androidx.compose.runtime.snapshots.SnapshotKt.globalSnapshot
            java.lang.Object r1 = getLock()
            monitor-enter(r1)
            androidx.collection.MutableScatterSet r2 = r0.getModified$runtime_release()     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L17
            androidx.compose.runtime.internal.AtomicInt r3 = androidx.compose.runtime.snapshots.SnapshotKt.pendingApplyObserverCount     // Catch: java.lang.Throwable -> L14
            r4 = 1
            r3.add(r4)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r15 = move-exception
            goto L9e
        L17:
            java.lang.Object r15 = resetGlobalSnapshotLocked(r0, r15)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)
            r1 = 0
            if (r2 == 0) goto L47
            r3 = -1
            java.util.List<? extends kotlin.jvm.functions.Function2<? super java.util.Set<? extends java.lang.Object>, ? super androidx.compose.runtime.snapshots.Snapshot, kotlin.Unit>> r4 = androidx.compose.runtime.snapshots.SnapshotKt.applyObservers     // Catch: java.lang.Throwable -> L39
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L39
            r6 = r1
        L27:
            if (r6 >= r5) goto L3b
            java.lang.Object r7 = r4.get(r6)     // Catch: java.lang.Throwable -> L39
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7     // Catch: java.lang.Throwable -> L39
            java.util.Set r8 = androidx.compose.runtime.collection.ScatterSetWrapperKt.wrapIntoSet(r2)     // Catch: java.lang.Throwable -> L39
            r7.invoke(r8, r0)     // Catch: java.lang.Throwable -> L39
            int r6 = r6 + 1
            goto L27
        L39:
            r15 = move-exception
            goto L41
        L3b:
            androidx.compose.runtime.internal.AtomicInt r0 = androidx.compose.runtime.snapshots.SnapshotKt.pendingApplyObserverCount
            r0.add(r3)
            goto L47
        L41:
            androidx.compose.runtime.internal.AtomicInt r0 = androidx.compose.runtime.snapshots.SnapshotKt.pendingApplyObserverCount
            r0.add(r3)
            throw r15
        L47:
            java.lang.Object r0 = getLock()
            monitor-enter(r0)
            checkAndOverwriteUnusedRecordsLocked()     // Catch: java.lang.Throwable -> L8b
            if (r2 == 0) goto L9a
            java.lang.Object[] r3 = r2.elements     // Catch: java.lang.Throwable -> L8b
            long[] r2 = r2.metadata     // Catch: java.lang.Throwable -> L8b
            int r4 = r2.length     // Catch: java.lang.Throwable -> L8b
            int r4 = r4 + (-2)
            if (r4 < 0) goto L98
            r5 = r1
        L5b:
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L8b
            long r8 = ~r6     // Catch: java.lang.Throwable -> L8b
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L93
            int r8 = r5 - r4
            int r8 = ~r8     // Catch: java.lang.Throwable -> L8b
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r1
        L75:
            if (r10 >= r8) goto L91
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L8d
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L8b
            androidx.compose.runtime.snapshots.StateObject r11 = (androidx.compose.runtime.snapshots.StateObject) r11     // Catch: java.lang.Throwable -> L8b
            processForUnusedRecordsLocked(r11)     // Catch: java.lang.Throwable -> L8b
            goto L8d
        L8b:
            r15 = move-exception
            goto L9c
        L8d:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L75
        L91:
            if (r8 != r9) goto L98
        L93:
            if (r5 == r4) goto L98
            int r5 = r5 + 1
            goto L5b
        L98:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L8b
        L9a:
            monitor-exit(r0)
            return r15
        L9c:
            monitor-exit(r0)
            throw r15
        L9e:
            monitor-exit(r1)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotKt.advanceGlobalSnapshot(kotlin.jvm.functions.Function1):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkAndOverwriteUnusedRecordsLocked() {
        SnapshotWeakSet<StateObject> snapshotWeakSet = extraStateObjects;
        int size$runtime_release = snapshotWeakSet.getSize();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= size$runtime_release) {
                break;
            }
            WeakReference<StateObject> weakReference = snapshotWeakSet.getValues$runtime_release()[i10];
            StateObject stateObject = weakReference != null ? weakReference.get() : null;
            if (stateObject != null && overwriteUnusedRecordsLocked(stateObject)) {
                if (i11 != i10) {
                    snapshotWeakSet.getValues$runtime_release()[i11] = weakReference;
                    snapshotWeakSet.getHashes()[i11] = snapshotWeakSet.getHashes()[i10];
                }
                i11++;
            }
            i10++;
        }
        for (int i12 = i11; i12 < size$runtime_release; i12++) {
            snapshotWeakSet.getValues$runtime_release()[i12] = null;
            snapshotWeakSet.getHashes()[i12] = 0;
        }
        if (i11 != size$runtime_release) {
            snapshotWeakSet.setSize$runtime_release(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Snapshot createTransparentSnapshotWithNoParentReadObserver(Snapshot snapshot, Function1<Object, Unit> function1, boolean z9) {
        boolean z10 = snapshot instanceof MutableSnapshot;
        if (z10 || snapshot == null) {
            return new TransparentObserverMutableSnapshot(z10 ? (MutableSnapshot) snapshot : null, function1, null, false, z9);
        }
        return new TransparentObserverSnapshot(snapshot, function1, false, z9);
    }

    public static /* synthetic */ Snapshot createTransparentSnapshotWithNoParentReadObserver$default(Snapshot snapshot, Function1 function1, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        if ((i10 & 4) != 0) {
            z9 = false;
        }
        return createTransparentSnapshotWithNoParentReadObserver(snapshot, function1, z9);
    }

    @PublishedApi
    public static final <T extends StateRecord> T current(T t10, Snapshot snapshot) {
        T t11;
        T t12 = (T) readable(t10, snapshot.getSnapshotId(), snapshot.getInvalid());
        if (t12 != null) {
            return t12;
        }
        synchronized (getLock()) {
            t11 = (T) readable(t10, snapshot.getSnapshotId(), snapshot.getInvalid());
        }
        if (t11 != null) {
            return t11;
        }
        readError();
        throw new KotlinNothingValueException();
    }

    public static final Snapshot currentSnapshot() {
        Snapshot snapshot = threadSnapshot.get();
        return snapshot == null ? globalSnapshot : snapshot;
    }

    private static final StateRecord findYoungestOr(StateRecord stateRecord, Function1<? super StateRecord, Boolean> function1) {
        StateRecord stateRecord2 = stateRecord;
        while (stateRecord != null) {
            if (function1.invoke(stateRecord).booleanValue()) {
                return stateRecord;
            }
            if (stateRecord2.getSnapshotId() < stateRecord.getSnapshotId()) {
                stateRecord2 = stateRecord;
            }
            stateRecord = stateRecord.getNext();
        }
        return stateRecord2;
    }

    public static final Object getLock() {
        return lock;
    }

    @PublishedApi
    public static /* synthetic */ void getLock$annotations() {
    }

    public static final Snapshot getSnapshotInitializer() {
        return snapshotInitializer;
    }

    @PublishedApi
    public static /* synthetic */ void getSnapshotInitializer$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<Object, Unit> mergedReadObserver(final Function1<Object, Unit> function1, final Function1<Object, Unit> function12, boolean z9) {
        if (!z9) {
            function12 = null;
        }
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new Function1<Object, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt.mergedReadObserver.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                function1.invoke(obj);
                function12.invoke(obj);
            }
        };
    }

    public static /* synthetic */ Function1 mergedReadObserver$default(Function1 function1, Function1 function12, boolean z9, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z9 = true;
        }
        return mergedReadObserver(function1, function12, z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<Object, Unit> mergedWriteObserver(final Function1<Object, Unit> function1, final Function1<Object, Unit> function12) {
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new Function1<Object, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt.mergedWriteObserver.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                function1.invoke(obj);
                function12.invoke(obj);
            }
        };
    }

    public static final <T extends StateRecord> T newOverwritableRecordLocked(T t10, StateObject stateObject) {
        T t11 = (T) usedLocked(stateObject);
        if (t11 != null) {
            t11.setSnapshotId$runtime_release(Long.MAX_VALUE);
            return t11;
        }
        T t12 = (T) t10.create(Long.MAX_VALUE);
        t12.setNext$runtime_release(stateObject.getFirstStateRecord());
        Intrinsics.checkNotNull(t12, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        stateObject.prependStateRecord(t12);
        Intrinsics.checkNotNull(t12, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return t12;
    }

    public static final <T extends StateRecord> T newWritableRecord(T t10, StateObject stateObject, Snapshot snapshot) {
        T t11;
        synchronized (getLock()) {
            t11 = (T) newWritableRecordLocked(t10, stateObject, snapshot);
        }
        return t11;
    }

    private static final <T extends StateRecord> T newWritableRecordLocked(T t10, StateObject stateObject, Snapshot snapshot) {
        T t11 = (T) newOverwritableRecordLocked(t10, stateObject);
        t11.assign(t10);
        t11.setSnapshotId$runtime_release(snapshot.getSnapshotId());
        return t11;
    }

    @PublishedApi
    public static final void notifyWrite(Snapshot snapshot, StateObject stateObject) {
        snapshot.setWriteCount$runtime_release(snapshot.getWriteCount() + 1);
        Function1<Object, Unit> writeObserver$runtime_release = snapshot.getWriteObserver$runtime_release();
        if (writeObserver$runtime_release != null) {
            writeObserver$runtime_release.invoke(stateObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<StateRecord, StateRecord> optimisticMerges(long j10, MutableSnapshot mutableSnapshot, SnapshotIdSet snapshotIdSet) {
        long[] jArr;
        Map<StateRecord, StateRecord> map;
        SnapshotIdSet snapshotIdSet2;
        long[] jArr2;
        Map<StateRecord, StateRecord> map2;
        SnapshotIdSet snapshotIdSet3;
        int i10;
        long j11 = j10;
        MutableScatterSet<StateObject> modified$runtime_release = mutableSnapshot.getModified$runtime_release();
        Map<StateRecord, StateRecord> map3 = null;
        if (modified$runtime_release == null) {
            return null;
        }
        SnapshotIdSet snapshotIdSetM1206or = mutableSnapshot.getInvalid().set(mutableSnapshot.getSnapshotId()).m1206or(mutableSnapshot.getPreviousIds());
        Object[] objArr = modified$runtime_release.elements;
        long[] jArr3 = modified$runtime_release.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            return null;
        }
        HashMap map4 = null;
        int i11 = 0;
        while (true) {
            long j12 = jArr3[i11];
            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((255 & j12) < 128) {
                        StateObject stateObject = (StateObject) objArr[(i11 << 3) + i14];
                        map2 = map3;
                        StateRecord firstStateRecord = stateObject.getFirstStateRecord();
                        i10 = i12;
                        StateRecord stateRecord = readable(firstStateRecord, j11, snapshotIdSet);
                        if (stateRecord == null) {
                            jArr2 = jArr3;
                        } else {
                            jArr2 = jArr3;
                            StateRecord stateRecord2 = readable(firstStateRecord, j11, snapshotIdSetM1206or);
                            if (stateRecord2 != null && !Intrinsics.areEqual(stateRecord, stateRecord2)) {
                                snapshotIdSet3 = snapshotIdSetM1206or;
                                StateRecord stateRecord3 = readable(firstStateRecord, mutableSnapshot.getSnapshotId(), mutableSnapshot.getInvalid());
                                if (stateRecord3 == null) {
                                    readError();
                                    throw new KotlinNothingValueException();
                                }
                                StateRecord stateRecordMergeRecords = stateObject.mergeRecords(stateRecord2, stateRecord, stateRecord3);
                                if (stateRecordMergeRecords == null) {
                                    return map2;
                                }
                                if (map4 == null) {
                                    map4 = new HashMap();
                                }
                                map4.put(stateRecord, stateRecordMergeRecords);
                                map4 = map4;
                            }
                        }
                        snapshotIdSet3 = snapshotIdSetM1206or;
                    } else {
                        jArr2 = jArr3;
                        map2 = map3;
                        snapshotIdSet3 = snapshotIdSetM1206or;
                        i10 = i12;
                    }
                    j12 >>= i10;
                    i14++;
                    j11 = j10;
                    map3 = map2;
                    i12 = i10;
                    jArr3 = jArr2;
                    snapshotIdSetM1206or = snapshotIdSet3;
                }
                jArr = jArr3;
                map = map3;
                snapshotIdSet2 = snapshotIdSetM1206or;
                if (i13 != i12) {
                    return map4;
                }
            } else {
                jArr = jArr3;
                map = map3;
                snapshotIdSet2 = snapshotIdSetM1206or;
            }
            if (i11 == length) {
                return map4;
            }
            i11++;
            j11 = j10;
            map3 = map;
            jArr3 = jArr;
            snapshotIdSetM1206or = snapshotIdSet2;
        }
    }

    public static final <T extends StateRecord, R> R overwritable(T t10, StateObject stateObject, T t11, Function1<? super T, ? extends R> function1) {
        Snapshot current;
        R rInvoke;
        synchronized (getLock()) {
            try {
                current = Snapshot.INSTANCE.getCurrent();
                rInvoke = function1.invoke(overwritableRecord(t10, stateObject, current, t11));
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        notifyWrite(current, stateObject);
        return rInvoke;
    }

    public static final <T extends StateRecord> T overwritableRecord(T t10, StateObject stateObject, Snapshot snapshot, T t11) {
        T t12;
        if (snapshot.getReadOnly()) {
            snapshot.mo20536recordModified$runtime_release(stateObject);
        }
        long snapshotId = snapshot.getSnapshotId();
        if (t11.getSnapshotId() == snapshotId) {
            return t11;
        }
        synchronized (getLock()) {
            t12 = (T) newOverwritableRecordLocked(t10, stateObject);
        }
        t12.setSnapshotId$runtime_release(snapshotId);
        if (t11.getSnapshotId() != SnapshotId_jvmKt.toSnapshotId(1)) {
            snapshot.mo20536recordModified$runtime_release(stateObject);
        }
        return t12;
    }

    private static final boolean overwriteUnusedRecordsLocked(StateObject stateObject) {
        StateRecord stateRecord;
        long jLowestOrDefault = pinningTable.lowestOrDefault(nextSnapshotId);
        StateRecord stateRecord2 = null;
        StateRecord firstStateRecord = null;
        int i10 = 0;
        for (StateRecord firstStateRecord2 = stateObject.getFirstStateRecord(); firstStateRecord2 != null; firstStateRecord2 = firstStateRecord2.getNext()) {
            long snapshotId$runtime_release = firstStateRecord2.getSnapshotId();
            if (snapshotId$runtime_release != INVALID_SNAPSHOT) {
                if (snapshotId$runtime_release >= jLowestOrDefault) {
                    i10++;
                } else if (stateRecord2 == null) {
                    i10++;
                    stateRecord2 = firstStateRecord2;
                } else {
                    if (firstStateRecord2.getSnapshotId() < stateRecord2.getSnapshotId()) {
                        stateRecord = stateRecord2;
                        stateRecord2 = firstStateRecord2;
                    } else {
                        stateRecord = firstStateRecord2;
                    }
                    if (firstStateRecord == null) {
                        firstStateRecord = stateObject.getFirstStateRecord();
                        StateRecord stateRecord3 = firstStateRecord;
                        while (true) {
                            if (firstStateRecord == null) {
                                firstStateRecord = stateRecord3;
                                break;
                            }
                            if (firstStateRecord.getSnapshotId() >= jLowestOrDefault) {
                                break;
                            }
                            if (stateRecord3.getSnapshotId() < firstStateRecord.getSnapshotId()) {
                                stateRecord3 = firstStateRecord;
                            }
                            firstStateRecord = firstStateRecord.getNext();
                        }
                    }
                    stateRecord2.setSnapshotId$runtime_release(INVALID_SNAPSHOT);
                    stateRecord2.assign(firstStateRecord);
                    stateRecord2 = stateRecord;
                }
            }
        }
        return i10 > 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void processForUnusedRecordsLocked(StateObject stateObject) {
        if (overwriteUnusedRecordsLocked(stateObject)) {
            extraStateObjects.add(stateObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void readError() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends StateRecord> T readable(T t10, long j10, SnapshotIdSet snapshotIdSet) {
        T t11 = null;
        while (t10 != null) {
            if (valid(t10, j10, snapshotIdSet) && (t11 == null || t11.getSnapshotId() < t10.getSnapshotId())) {
                t11 = t10;
            }
            t10 = (T) t10.getNext();
        }
        if (t11 != null) {
            return t11;
        }
        return null;
    }

    public static final void releasePinningLocked(int i10) {
        pinningTable.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void reportReadonlySnapshotWrite() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T resetGlobalSnapshotLocked(GlobalSnapshot globalSnapshot2, Function1<? super SnapshotIdSet, ? extends T> function1) {
        long snapshotId = globalSnapshot2.getSnapshotId();
        T tInvoke = function1.invoke(openSnapshots.clear(snapshotId));
        long j10 = nextSnapshotId;
        nextSnapshotId = 1 + j10;
        openSnapshots = openSnapshots.clear(snapshotId);
        globalSnapshot2.setSnapshotId$runtime_release(j10);
        globalSnapshot2.setInvalid$runtime_release(openSnapshots);
        globalSnapshot2.setWriteCount$runtime_release(0);
        globalSnapshot2.setModified(null);
        globalSnapshot2.releasePinnedSnapshotLocked$runtime_release();
        openSnapshots = openSnapshots.set(j10);
        return tInvoke;
    }

    @PublishedApi
    public static final <T> T sync(Function0<? extends T> function0) {
        T tInvoke;
        synchronized (getLock()) {
            try {
                tInvoke = function0.invoke();
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        return tInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends Snapshot> T takeNewSnapshot(final Function1<? super SnapshotIdSet, ? extends T> function1) {
        return (T) advanceGlobalSnapshot(new Function1<SnapshotIdSet, T>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt.takeNewSnapshot.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Incorrect return type in method signature: (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)TT; */
            @Override // kotlin.jvm.functions.Function1
            public final Snapshot invoke(SnapshotIdSet snapshotIdSet) {
                Snapshot snapshot = (Snapshot) function1.invoke(snapshotIdSet);
                synchronized (SnapshotKt.getLock()) {
                    SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(snapshot.getSnapshotId());
                    Unit unit = Unit.INSTANCE;
                }
                return snapshot;
            }
        });
    }

    public static final int trackPinning(long j10, SnapshotIdSet snapshotIdSet) {
        int iAdd;
        long jLowest = snapshotIdSet.lowest(j10);
        synchronized (getLock()) {
            iAdd = pinningTable.add(jLowest);
        }
        return iAdd;
    }

    private static final StateRecord usedLocked(StateObject stateObject) {
        long jLowestOrDefault = pinningTable.lowestOrDefault(nextSnapshotId) - 1;
        SnapshotIdSet empty = SnapshotIdSet.INSTANCE.getEMPTY();
        StateRecord stateRecord = null;
        for (StateRecord firstStateRecord = stateObject.getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext()) {
            if (firstStateRecord.getSnapshotId() != INVALID_SNAPSHOT) {
                if (valid(firstStateRecord, jLowestOrDefault, empty)) {
                    if (stateRecord == null) {
                        stateRecord = firstStateRecord;
                    } else if (firstStateRecord.getSnapshotId() >= stateRecord.getSnapshotId()) {
                        return stateRecord;
                    }
                }
            }
            return firstStateRecord;
        }
        return null;
    }

    private static final boolean valid(long j10, long j11, SnapshotIdSet snapshotIdSet) {
        return (j11 == INVALID_SNAPSHOT || j11 > j10 || snapshotIdSet.get(j11)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateOpen(Snapshot snapshot) {
        long jLowestOrDefault;
        if (openSnapshots.get(snapshot.getSnapshotId())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Snapshot is not open: snapshotId=");
        sb.append(snapshot.getSnapshotId());
        sb.append(", disposed=");
        sb.append(snapshot.getDisposed());
        sb.append(", applied=");
        MutableSnapshot mutableSnapshot = snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null;
        sb.append(mutableSnapshot != null ? Boolean.valueOf(mutableSnapshot.getApplied()) : "read-only");
        sb.append(", lowestPin=");
        synchronized (getLock()) {
            jLowestOrDefault = pinningTable.lowestOrDefault(-1L);
        }
        sb.append(jLowestOrDefault);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final <T extends StateRecord, R> R withCurrent(T t10, Function1<? super T, ? extends R> function1) {
        return function1.invoke(current(t10));
    }

    public static final <T extends StateRecord, R> R writable(T t10, StateObject stateObject, Snapshot snapshot, Function1<? super T, ? extends R> function1) {
        R rInvoke;
        synchronized (getLock()) {
            try {
                rInvoke = function1.invoke(writableRecord(t10, stateObject, snapshot));
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        notifyWrite(snapshot, stateObject);
        return rInvoke;
    }

    @PublishedApi
    public static final <T extends StateRecord> T writableRecord(T t10, StateObject stateObject, Snapshot snapshot) {
        T t11;
        if (snapshot.getReadOnly()) {
            snapshot.mo20536recordModified$runtime_release(stateObject);
        }
        long snapshotId = snapshot.getSnapshotId();
        T t12 = (T) readable(t10, snapshotId, snapshot.getInvalid());
        if (t12 == null) {
            readError();
            throw new KotlinNothingValueException();
        }
        if (t12.getSnapshotId() == snapshot.getSnapshotId()) {
            return t12;
        }
        synchronized (getLock()) {
            t11 = (T) readable(stateObject.getFirstStateRecord(), snapshotId, snapshot.getInvalid());
            if (t11 == null) {
                readError();
                throw new KotlinNothingValueException();
            }
            if (t11.getSnapshotId() != snapshotId) {
                t11 = (T) newWritableRecordLocked(t11, stateObject, snapshot);
            }
        }
        Intrinsics.checkNotNull(t11, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.writableRecord");
        if (t12.getSnapshotId() != SnapshotId_jvmKt.toSnapshotId(1)) {
            snapshot.mo20536recordModified$runtime_release(stateObject);
        }
        return t11;
    }

    private static final boolean valid(StateRecord stateRecord, long j10, SnapshotIdSet snapshotIdSet) {
        return valid(j10, stateRecord.getSnapshotId(), snapshotIdSet);
    }

    public static final <T extends StateRecord> T readable(T t10, StateObject stateObject) {
        T t11;
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot current = companion.getCurrent();
        Function1<Object, Unit> readObserver = current.getReadObserver();
        if (readObserver != null) {
            readObserver.invoke(stateObject);
        }
        T t12 = (T) readable(t10, current.getSnapshotId(), current.getInvalid());
        if (t12 != null) {
            return t12;
        }
        synchronized (getLock()) {
            Snapshot current2 = companion.getCurrent();
            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            t11 = (T) readable(firstStateRecord, current2.getSnapshotId(), current2.getInvalid());
            if (t11 == null) {
                readError();
                throw new KotlinNothingValueException();
            }
        }
        return t11;
    }

    public static final <T extends StateRecord, R> R writable(T t10, StateObject stateObject, Function1<? super T, ? extends R> function1) {
        Snapshot current;
        R rInvoke;
        synchronized (getLock()) {
            try {
                current = Snapshot.INSTANCE.getCurrent();
                rInvoke = function1.invoke(writableRecord(t10, stateObject, current));
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        notifyWrite(current, stateObject);
        return rInvoke;
    }

    @PublishedApi
    public static final <T extends StateRecord> T current(T t10) {
        T t11;
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot current = companion.getCurrent();
        T t12 = (T) readable(t10, current.getSnapshotId(), current.getInvalid());
        if (t12 != null) {
            return t12;
        }
        synchronized (getLock()) {
            Snapshot current2 = companion.getCurrent();
            t11 = (T) readable(t10, current2.getSnapshotId(), current2.getInvalid());
        }
        if (t11 != null) {
            return t11;
        }
        readError();
        throw new KotlinNothingValueException();
    }

    public static final <T extends StateRecord> T readable(T t10, StateObject stateObject, Snapshot snapshot) {
        T t11;
        Function1<Object, Unit> readObserver = snapshot.getReadObserver();
        if (readObserver != null) {
            readObserver.invoke(stateObject);
        }
        T t12 = (T) readable(t10, snapshot.getSnapshotId(), snapshot.getInvalid());
        if (t12 != null) {
            return t12;
        }
        synchronized (getLock()) {
            Snapshot current = Snapshot.INSTANCE.getCurrent();
            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            t11 = (T) readable(firstStateRecord, current.getSnapshotId(), current.getInvalid());
            if (t11 == null) {
                readError();
                throw new KotlinNothingValueException();
            }
        }
        return t11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void advanceGlobalSnapshot() {
        advanceGlobalSnapshot(emptyLambda);
    }
}
