package androidx.compose.runtime.snapshots;

import androidx.autofill.HintConstants;
import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.internal.WeakReference;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000°\u0001\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u00052\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0015\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001aS\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001aI\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a1\u0010!\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0081\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b!\u0010\"\u001a@\u0010'\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001e2\u0006\u0010$\u001a\u00020#2!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b'\u0010(\u001a8\u0010)\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001e2!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b)\u0010*\u001a\u000f\u0010)\u001a\u00020\tH\u0002¢\u0006\u0004\b)\u0010+\u001a<\u0010,\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u00020\f2!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b,\u0010-\u001a\u0017\u0010/\u001a\u00020\t2\u0006\u0010.\u001a\u00020\fH\u0002¢\u0006\u0004\b/\u00100\u001a/\u00102\u001a\u00020\u00132\n\u0010\r\u001a\u00060\u0000j\u0002`\u00012\n\u00101\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b2\u00103\u001a+\u00102\u001a\u00020\u00132\u0006\u00105\u001a\u0002042\n\u0010.\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b2\u00106\u001a7\u00109\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001e*\u0002042\u0006\u00107\u001a\u00028\u00002\n\u00108\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b9\u0010:\u001a#\u00109\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u000204*\u00028\u00002\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b9\u0010=\u001a+\u00109\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u000204*\u00028\u00002\u0006\u0010<\u001a\u00020;2\u0006\u0010.\u001a\u00020\f¢\u0006\u0004\b9\u0010>\u001a\u000f\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\b@\u0010A\u001a\u0019\u0010B\u001a\u0004\u0018\u0001042\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\bB\u0010C\u001a\u0017\u0010D\u001a\u00020\u00132\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\bD\u0010E\u001a(\u0010G\u001a\u000204*\u0002042\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00130\u0010H\u0082\b¢\u0006\u0004\bG\u0010H\u001a\u000f\u0010I\u001a\u00020\tH\u0002¢\u0006\u0004\bI\u0010+\u001a\u0017\u0010J\u001a\u00020\t2\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\bJ\u0010K\u001a-\u0010L\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u000204*\u00028\u00002\u0006\u0010<\u001a\u00020;2\u0006\u0010.\u001a\u00020\fH\u0001¢\u0006\u0004\bL\u0010>\u001a5\u0010N\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u000204*\u00028\u00002\u0006\u0010<\u001a\u00020;2\u0006\u0010.\u001a\u00020\f2\u0006\u0010M\u001a\u00028\u0000H\u0000¢\u0006\u0004\bN\u0010O\u001a-\u0010P\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u000204*\u00028\u00002\u0006\u0010<\u001a\u00020;2\u0006\u0010.\u001a\u00020\fH\u0000¢\u0006\u0004\bP\u0010>\u001a-\u0010Q\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u000204*\u00028\u00002\u0006\u0010<\u001a\u00020;2\u0006\u0010.\u001a\u00020\fH\u0002¢\u0006\u0004\bQ\u0010>\u001a%\u0010R\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u000204*\u00028\u00002\u0006\u0010<\u001a\u00020;H\u0000¢\u0006\u0004\bR\u0010=\u001a\u001f\u0010S\u001a\u00020\t2\u0006\u0010.\u001a\u00020\f2\u0006\u0010<\u001a\u00020;H\u0001¢\u0006\u0004\bS\u0010T\u001aM\u0010W\u001a\u00028\u0001\"\b\b\u0000\u0010\u001e*\u000204\"\u0004\b\u0001\u0010U*\u00028\u00002\u0006\u0010<\u001a\u00020;2\u0006\u0010.\u001a\u00020\f2\u0017\u0010 \u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010¢\u0006\u0002\bVH\u0086\b¢\u0006\u0004\bW\u0010X\u001aE\u0010W\u001a\u00028\u0001\"\b\b\u0000\u0010\u001e*\u000204\"\u0004\b\u0001\u0010U*\u00028\u00002\u0006\u0010<\u001a\u00020;2\u0017\u0010 \u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010¢\u0006\u0002\bVH\u0086\b¢\u0006\u0004\bW\u0010Y\u001aM\u0010Z\u001a\u00028\u0001\"\b\b\u0000\u0010\u001e*\u000204\"\u0004\b\u0001\u0010U*\u00028\u00002\u0006\u0010<\u001a\u00020;2\u0006\u0010M\u001a\u00028\u00002\u0017\u0010 \u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010¢\u0006\u0002\bVH\u0080\b¢\u0006\u0004\bZ\u0010[\u001a9\u0010a\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u000204\u0018\u00010`2\n\u0010\\\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010^\u001a\u00020]2\u0006\u0010_\u001a\u00020\u0003H\u0002¢\u0006\u0004\ba\u0010b\u001a\u000f\u0010c\u001a\u00020?H\u0002¢\u0006\u0004\bc\u0010A\u001a)\u0010d\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u0002042\u0006\u00107\u001a\u00028\u00002\u0006\u0010.\u001a\u00020\fH\u0001¢\u0006\u0004\bd\u0010e\u001a!\u0010d\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u0002042\u0006\u00107\u001a\u00028\u0000H\u0001¢\u0006\u0004\bd\u0010f\u001aG\u0010g\u001a\u00028\u0001\"\b\b\u0000\u0010\u001e*\u000204\"\u0004\b\u0001\u0010U*\u00028\u00002!\u0010 \u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(7\u0012\u0004\u0012\u00028\u00010\u0010H\u0086\b¢\u0006\u0004\bg\u0010h\u001a+\u0010k\u001a\u00020\u0003*\u00020\u00032\n\u0010i\u001a\u00060\u0000j\u0002`\u00012\n\u0010j\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\bk\u0010l\"/\u0010m\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\t0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010n\"\u0018\u0010o\u001a\u00060\u0000j\u0002`\u00018\u0002X\u0082D¢\u0006\u0006\n\u0004\bo\u0010p\"\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020\f0q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010s\" \u0010t\u001a\u00020\u00118\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bt\u0010u\u0012\u0004\bx\u0010+\u001a\u0004\bv\u0010w\"\u0016\u0010y\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010z\"\u0016\u0010{\u001a\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010p\"\u0014\u0010}\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~\"\u001d\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020;0\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001\":\u0010\u0085\u0001\u001a#\u0012\u001e\u0012\u001c\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00110\u0084\u0001\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u0083\u00010\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001\",\u0010\u0087\u0001\u001a\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u00100\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0086\u0001\"\u0015\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b$\u0010\u0088\u0001\"%\u0010\u0089\u0001\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0016\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u0012\u0005\b\u008c\u0001\u0010+\u001a\u0005\b\u008b\u0001\u0010\u000e\"\u001a\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001¨\u0006\u0090\u0001"}, m5110d2 = {"", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "", "trackPinning", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;)I", "handle", "Ld6/s;", "releasePinningLocked", "(I)V", "Landroidx/compose/runtime/snapshots/Snapshot;", "currentSnapshot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "previousSnapshot", "Lkotlin/Function1;", "", "readObserver", "", "ownsPreviousSnapshot", "createTransparentSnapshotWithNoParentReadObserver", "(Landroidx/compose/runtime/snapshots/Snapshot;Lr6/c;Z)Landroidx/compose/runtime/snapshots/Snapshot;", "parentObserver", "mergeReadObserver", "mergedReadObserver", "(Lr6/c;Lr6/c;Z)Lr6/c;", "writeObserver", "mergedWriteObserver", "(Lr6/c;Lr6/c;)Lr6/c;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "block", "sync", "(Lr6/a;)Ljava/lang/Object;", "Landroidx/compose/runtime/snapshots/GlobalSnapshot;", "globalSnapshot", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "resetGlobalSnapshotLocked", "(Landroidx/compose/runtime/snapshots/GlobalSnapshot;Lr6/c;)Ljava/lang/Object;", "advanceGlobalSnapshot", "(Lr6/c;)Ljava/lang/Object;", "()V", "takeNewSnapshot", "(Lr6/c;)Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "validateOpen", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "candidateSnapshot", "valid", "(JJLandroidx/compose/runtime/snapshots/SnapshotIdSet;)Z", "Landroidx/compose/runtime/snapshots/StateRecord;", "data", "(Landroidx/compose/runtime/snapshots/StateRecord;JLandroidx/compose/runtime/snapshots/SnapshotIdSet;)Z", "r", "id", "readable", "(Landroidx/compose/runtime/snapshots/StateRecord;JLandroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;)Landroidx/compose/runtime/snapshots/StateRecord;", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "", "readError", "()Ljava/lang/Void;", "usedLocked", "(Landroidx/compose/runtime/snapshots/StateObject;)Landroidx/compose/runtime/snapshots/StateRecord;", "overwriteUnusedRecordsLocked", "(Landroidx/compose/runtime/snapshots/StateObject;)Z", "predicate", "findYoungestOr", "(Landroidx/compose/runtime/snapshots/StateRecord;Lr6/c;)Landroidx/compose/runtime/snapshots/StateRecord;", "checkAndOverwriteUnusedRecordsLocked", "processForUnusedRecordsLocked", "(Landroidx/compose/runtime/snapshots/StateObject;)V", "writableRecord", "candidate", "overwritableRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "newWritableRecord", "newWritableRecordLocked", "newOverwritableRecordLocked", "notifyWrite", "(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateObject;)V", "R", "Lkotlin/ExtensionFunctionType;", "writable", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;Lr6/c;)Ljava/lang/Object;", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Lr6/c;)Ljava/lang/Object;", "overwritable", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/StateRecord;Lr6/c;)Ljava/lang/Object;", "currentSnapshotId", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "applyingSnapshot", "invalidSnapshots", "", "optimisticMerges", "(JLandroidx/compose/runtime/snapshots/MutableSnapshot;Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Ljava/util/Map;", "reportReadonlySnapshotWrite", "current", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "withCurrent", "(Landroidx/compose/runtime/snapshots/StateRecord;Lr6/c;)Ljava/lang/Object;", TypedValues.TransitionType.S_FROM, "until", "addRange", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;JJ)Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "emptyLambda", "Lr6/c;", "INVALID_SNAPSHOT", "J", "Landroidx/compose/runtime/internal/SnapshotThreadLocal;", "threadSnapshot", "Landroidx/compose/runtime/internal/SnapshotThreadLocal;", "lock", "Ljava/lang/Object;", "getLock", "()Ljava/lang/Object;", "getLock$annotations", "openSnapshots", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "nextSnapshotId", "Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "pinningTable", "Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "Landroidx/compose/runtime/snapshots/SnapshotWeakSet;", "extraStateObjects", "Landroidx/compose/runtime/snapshots/SnapshotWeakSet;", "", "Lkotlin/Function2;", "", "applyObservers", "Ljava/util/List;", "globalWriteObservers", "Landroidx/compose/runtime/snapshots/GlobalSnapshot;", "snapshotInitializer", "Landroidx/compose/runtime/snapshots/Snapshot;", "getSnapshotInitializer", "getSnapshotInitializer$annotations", "Landroidx/compose/runtime/internal/AtomicInt;", "pendingApplyObserverCount", "Landroidx/compose/runtime/internal/AtomicInt;", "runtime_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 SnapshotWeakSet.kt\nandroidx/compose/runtime/snapshots/SnapshotWeakSet\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2487:1\n1894#1,2:2488\n1894#1,2:2494\n1894#1,2:2504\n1894#1,2:2533\n1894#1,2:2537\n1894#1,2:2541\n2213#1,8:2545\n1894#1,2:2581\n1894#1,2:2585\n1894#1,2:2589\n1894#1,2:2594\n1894#1,2:2598\n1894#1,2:2602\n1894#1,2:2631\n1894#1,2:2635\n33#2,2:2490\n33#2,2:2492\n33#2,2:2496\n33#2,2:2506\n33#2,2:2535\n33#2,2:2539\n33#2,2:2543\n33#2,2:2583\n33#2,2:2587\n33#2,2:2591\n33#2,2:2596\n33#2,2:2600\n33#2,2:2604\n33#2,2:2633\n33#2,2:2637\n27#2:2639\n33#3,6:2498\n231#4,3:2508\n200#4,7:2511\n211#4,3:2519\n214#4,9:2523\n234#4:2532\n231#4,3:2606\n200#4,7:2609\n211#4,3:2617\n214#4,9:2621\n234#4:2630\n1399#5:2518\n1270#5:2522\n1399#5:2616\n1270#5:2620\n125#6,28:2553\n1#7:2593\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n*L\n706#1:2488,2\n1969#1:2494,2\n1988#1:2504,2\n2016#1:2533,2\n2075#1:2537,2\n2097#1:2541,2\n2197#1:2545,8\n2249#1:2581,2\n2277#1:2585,2\n2287#1:2589,2\n2355#1:2594,2\n2366#1:2598,2\n2393#1:2602,2\n2449#1:2631,2\n2460#1:2635,2\n706#1:2490,2\n1895#1:2492,2\n1969#1:2496,2\n1988#1:2506,2\n2016#1:2535,2\n2075#1:2539,2\n2097#1:2543,2\n2249#1:2583,2\n2277#1:2587,2\n2287#1:2591,2\n2355#1:2596,2\n2366#1:2600,2\n2393#1:2604,2\n2449#1:2633,2\n2460#1:2637,2\n1888#1:2639\n1982#1:2498,6\n1990#1:2508,3\n1990#1:2511,7\n1990#1:2519,3\n1990#1:2523,9\n1990#1:2532\n2415#1:2606,3\n2415#1:2609,7\n2415#1:2617,3\n2415#1:2621,9\n2415#1:2630\n1990#1:2518\n1990#1:2522\n2415#1:2616\n2415#1:2620\n2224#1:2553,28\n*E\n"})
/* loaded from: classes.dex */
public final class SnapshotKt {
    private static final long INVALID_SNAPSHOT = 0;

    @NotNull
    private static List<? extends InterfaceC6473e> applyObservers;

    @NotNull
    private static final SnapshotWeakSet<StateObject> extraStateObjects;

    @NotNull
    private static final GlobalSnapshot globalSnapshot;

    @NotNull
    private static List<? extends InterfaceC6471c> globalWriteObservers;
    private static long nextSnapshotId;

    @NotNull
    private static SnapshotIdSet openSnapshots;

    @NotNull
    private static AtomicInt pendingApplyObserverCount;

    @NotNull
    private static final SnapshotDoubleIndexHeap pinningTable;

    @NotNull
    private static final Snapshot snapshotInitializer;

    @NotNull
    private static final InterfaceC6471c emptyLambda = new InterfaceC6471c() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$emptyLambda$1
        public final void invoke(SnapshotIdSet snapshotIdSet) {
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SnapshotIdSet) obj);
            return C5443s.f8405a;
        }
    };

    @NotNull
    private static final SnapshotThreadLocal<Snapshot> threadSnapshot = new SnapshotThreadLocal<>();

    @NotNull
    private static final Object lock = new Object();

    static {
        SnapshotIdSet.Companion companion = SnapshotIdSet.INSTANCE;
        openSnapshots = companion.getEMPTY();
        nextSnapshotId = SnapshotId_jvmKt.toSnapshotId(1) + 1;
        pinningTable = new SnapshotDoubleIndexHeap();
        extraStateObjects = new SnapshotWeakSet<>();
        EmptyList emptyList = EmptyList.INSTANCE;
        applyObservers = emptyList;
        globalWriteObservers = emptyList;
        long j7 = nextSnapshotId;
        nextSnapshotId = 1 + j7;
        GlobalSnapshot globalSnapshot2 = new GlobalSnapshot(j7, companion.getEMPTY());
        openSnapshots = openSnapshots.set(globalSnapshot2.getSnapshotId());
        globalSnapshot = globalSnapshot2;
        snapshotInitializer = globalSnapshot2;
        pendingApplyObserverCount = new AtomicInt(0);
    }

    @NotNull
    public static final SnapshotIdSet addRange(@NotNull SnapshotIdSet snapshotIdSet, long j7, long j8) {
        while (j7 < j8) {
            snapshotIdSet = snapshotIdSet.set(j7);
            j7++;
        }
        return snapshotIdSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> T advanceGlobalSnapshot(p152r6.InterfaceC6471c r15) {
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
            goto L9c
        L17:
            java.lang.Object r15 = resetGlobalSnapshotLocked(r0, r15)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)
            r1 = 0
            if (r2 == 0) goto L47
            r3 = -1
            java.util.List<? extends r6.e> r4 = androidx.compose.runtime.snapshots.SnapshotKt.applyObservers     // Catch: java.lang.Throwable -> L39
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L39
            r6 = r1
        L27:
            if (r6 >= r5) goto L3b
            java.lang.Object r7 = r4.get(r6)     // Catch: java.lang.Throwable -> L39
            r6.e r7 = (p152r6.InterfaceC6473e) r7     // Catch: java.lang.Throwable -> L39
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
            if (r2 == 0) goto L98
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
            goto L9a
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
            monitor-exit(r0)
            return r15
        L9a:
            monitor-exit(r0)
            throw r15
        L9c:
            monitor-exit(r1)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotKt.advanceGlobalSnapshot(r6.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkAndOverwriteUnusedRecordsLocked() {
        SnapshotWeakSet<StateObject> snapshotWeakSet = extraStateObjects;
        int size$runtime_release = snapshotWeakSet.getSize();
        int i = 0;
        int i8 = 0;
        while (true) {
            if (i >= size$runtime_release) {
                break;
            }
            WeakReference<StateObject> weakReference = snapshotWeakSet.getValues$runtime_release()[i];
            StateObject stateObject = weakReference != null ? weakReference.get() : null;
            if (stateObject != null && overwriteUnusedRecordsLocked(stateObject)) {
                if (i8 != i) {
                    snapshotWeakSet.getValues$runtime_release()[i8] = weakReference;
                    snapshotWeakSet.getHashes()[i8] = snapshotWeakSet.getHashes()[i];
                }
                i8++;
            }
            i++;
        }
        for (int i9 = i8; i9 < size$runtime_release; i9++) {
            snapshotWeakSet.getValues$runtime_release()[i9] = null;
            snapshotWeakSet.getHashes()[i9] = 0;
        }
        if (i8 != size$runtime_release) {
            snapshotWeakSet.setSize$runtime_release(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Snapshot createTransparentSnapshotWithNoParentReadObserver(Snapshot snapshot, InterfaceC6471c interfaceC6471c, boolean z8) {
        boolean z9 = snapshot instanceof MutableSnapshot;
        if (z9 || snapshot == null) {
            return new TransparentObserverMutableSnapshot(z9 ? (MutableSnapshot) snapshot : null, interfaceC6471c, null, false, z8);
        }
        return new TransparentObserverSnapshot(snapshot, interfaceC6471c, false, z8);
    }

    public static /* synthetic */ Snapshot createTransparentSnapshotWithNoParentReadObserver$default(Snapshot snapshot, InterfaceC6471c interfaceC6471c, boolean z8, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC6471c = null;
        }
        if ((i & 4) != 0) {
            z8 = false;
        }
        return createTransparentSnapshotWithNoParentReadObserver(snapshot, interfaceC6471c, z8);
    }

    @PublishedApi
    @NotNull
    public static final <T extends StateRecord> T current(@NotNull T t8, @NotNull Snapshot snapshot) {
        T t9;
        T t10 = (T) readable(t8, snapshot.getSnapshotId(), snapshot.getInvalid());
        if (t10 != null) {
            return t10;
        }
        synchronized (getLock()) {
            t9 = (T) readable(t8, snapshot.getSnapshotId(), snapshot.getInvalid());
        }
        if (t9 != null) {
            return t9;
        }
        readError();
        throw new KotlinNothingValueException();
    }

    @NotNull
    public static final Snapshot currentSnapshot() {
        Snapshot snapshot = threadSnapshot.get();
        return snapshot == null ? globalSnapshot : snapshot;
    }

    private static final StateRecord findYoungestOr(StateRecord stateRecord, InterfaceC6471c interfaceC6471c) {
        StateRecord stateRecord2 = stateRecord;
        while (stateRecord != null) {
            if (((Boolean) interfaceC6471c.invoke(stateRecord)).booleanValue()) {
                return stateRecord;
            }
            if (stateRecord2.getSnapshotId() < stateRecord.getSnapshotId()) {
                stateRecord2 = stateRecord;
            }
            stateRecord = stateRecord.getNext();
        }
        return stateRecord2;
    }

    @NotNull
    public static final Object getLock() {
        return lock;
    }

    @PublishedApi
    public static /* synthetic */ void getLock$annotations() {
    }

    @NotNull
    public static final Snapshot getSnapshotInitializer() {
        return snapshotInitializer;
    }

    @PublishedApi
    public static /* synthetic */ void getSnapshotInitializer$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6471c mergedReadObserver(final InterfaceC6471c interfaceC6471c, final InterfaceC6471c interfaceC6471c2, boolean z8) {
        if (!z8) {
            interfaceC6471c2 = null;
        }
        return (interfaceC6471c == null || interfaceC6471c2 == null || interfaceC6471c == interfaceC6471c2) ? interfaceC6471c == null ? interfaceC6471c2 : interfaceC6471c : new InterfaceC6471c() { // from class: androidx.compose.runtime.snapshots.SnapshotKt.mergedReadObserver.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m10243invoke(obj);
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m10243invoke(Object obj) {
                interfaceC6471c.invoke(obj);
                interfaceC6471c2.invoke(obj);
            }
        };
    }

    public static /* synthetic */ InterfaceC6471c mergedReadObserver$default(InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, boolean z8, int i, Object obj) {
        if ((i & 4) != 0) {
            z8 = true;
        }
        return mergedReadObserver(interfaceC6471c, interfaceC6471c2, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6471c mergedWriteObserver(final InterfaceC6471c interfaceC6471c, final InterfaceC6471c interfaceC6471c2) {
        return (interfaceC6471c == null || interfaceC6471c2 == null || interfaceC6471c == interfaceC6471c2) ? interfaceC6471c == null ? interfaceC6471c2 : interfaceC6471c : new InterfaceC6471c() { // from class: androidx.compose.runtime.snapshots.SnapshotKt.mergedWriteObserver.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m10244invoke(obj);
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m10244invoke(Object obj) {
                interfaceC6471c.invoke(obj);
                interfaceC6471c2.invoke(obj);
            }
        };
    }

    @NotNull
    public static final <T extends StateRecord> T newOverwritableRecordLocked(@NotNull T t8, @NotNull StateObject stateObject) {
        T t9 = (T) usedLocked(stateObject);
        if (t9 != null) {
            t9.setSnapshotId$runtime_release(Long.MAX_VALUE);
            return t9;
        }
        T t10 = (T) t8.create(Long.MAX_VALUE);
        t10.setNext$runtime_release(stateObject.getFirstStateRecord());
        stateObject.prependStateRecord(t10);
        return t10;
    }

    @NotNull
    public static final <T extends StateRecord> T newWritableRecord(@NotNull T t8, @NotNull StateObject stateObject, @NotNull Snapshot snapshot) {
        T t9;
        synchronized (getLock()) {
            t9 = (T) newWritableRecordLocked(t8, stateObject, snapshot);
        }
        return t9;
    }

    private static final <T extends StateRecord> T newWritableRecordLocked(T t8, StateObject stateObject, Snapshot snapshot) {
        T t9 = (T) newOverwritableRecordLocked(t8, stateObject);
        t9.assign(t8);
        t9.setSnapshotId$runtime_release(snapshot.getSnapshotId());
        return t9;
    }

    @PublishedApi
    public static final void notifyWrite(@NotNull Snapshot snapshot, @NotNull StateObject stateObject) {
        snapshot.setWriteCount$runtime_release(snapshot.getWriteCount() + 1);
        InterfaceC6471c writeObserver$runtime_release = snapshot.getWriteObserver();
        if (writeObserver$runtime_release != null) {
            writeObserver$runtime_release.invoke(stateObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<StateRecord, StateRecord> optimisticMerges(long j7, MutableSnapshot mutableSnapshot, SnapshotIdSet snapshotIdSet) {
        long[] jArr;
        Map<StateRecord, StateRecord> map;
        SnapshotIdSet snapshotIdSet2;
        long[] jArr2;
        Map<StateRecord, StateRecord> map2;
        SnapshotIdSet snapshotIdSet3;
        int i;
        long j8 = j7;
        MutableScatterSet<StateObject> modified$runtime_release = mutableSnapshot.getModified$runtime_release();
        Map<StateRecord, StateRecord> map3 = null;
        if (modified$runtime_release == null) {
            return null;
        }
        SnapshotIdSet snapshotIdSetM1101or = mutableSnapshot.getInvalid().set(mutableSnapshot.getSnapshotId()).m1101or(mutableSnapshot.getPreviousIds());
        Object[] objArr = modified$runtime_release.elements;
        long[] jArr3 = modified$runtime_release.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            return null;
        }
        HashMap map4 = null;
        int i8 = 0;
        while (true) {
            long j9 = jArr3[i8];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8;
                int i10 = 8 - ((~(i8 - length)) >>> 31);
                int i11 = 0;
                while (i11 < i10) {
                    if ((255 & j9) < 128) {
                        StateObject stateObject = (StateObject) objArr[(i8 << 3) + i11];
                        map2 = map3;
                        StateRecord firstStateRecord = stateObject.getFirstStateRecord();
                        i = i9;
                        StateRecord stateRecord = readable(firstStateRecord, j8, snapshotIdSet);
                        if (stateRecord == null) {
                            jArr2 = jArr3;
                        } else {
                            jArr2 = jArr3;
                            StateRecord stateRecord2 = readable(firstStateRecord, j8, snapshotIdSetM1101or);
                            if (stateRecord2 != null && !stateRecord.equals(stateRecord2)) {
                                snapshotIdSet3 = snapshotIdSetM1101or;
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
                        snapshotIdSet3 = snapshotIdSetM1101or;
                    } else {
                        jArr2 = jArr3;
                        map2 = map3;
                        snapshotIdSet3 = snapshotIdSetM1101or;
                        i = i9;
                    }
                    j9 >>= i;
                    i11++;
                    j8 = j7;
                    map3 = map2;
                    i9 = i;
                    jArr3 = jArr2;
                    snapshotIdSetM1101or = snapshotIdSet3;
                }
                jArr = jArr3;
                map = map3;
                snapshotIdSet2 = snapshotIdSetM1101or;
                if (i10 != i9) {
                    return map4;
                }
            } else {
                jArr = jArr3;
                map = map3;
                snapshotIdSet2 = snapshotIdSetM1101or;
            }
            if (i8 == length) {
                return map4;
            }
            i8++;
            j8 = j7;
            map3 = map;
            jArr3 = jArr;
            snapshotIdSetM1101or = snapshotIdSet2;
        }
    }

    public static final <T extends StateRecord, R> R overwritable(@NotNull T t8, @NotNull StateObject stateObject, @NotNull T t9, @NotNull InterfaceC6471c interfaceC6471c) {
        Snapshot current;
        R r;
        synchronized (getLock()) {
            current = Snapshot.INSTANCE.getCurrent();
            r = (R) interfaceC6471c.invoke(overwritableRecord(t8, stateObject, current, t9));
        }
        notifyWrite(current, stateObject);
        return r;
    }

    @NotNull
    public static final <T extends StateRecord> T overwritableRecord(@NotNull T t8, @NotNull StateObject stateObject, @NotNull Snapshot snapshot, @NotNull T t9) {
        T t10;
        if (snapshot.getReadOnly()) {
            snapshot.mo10229recordModified$runtime_release(stateObject);
        }
        long snapshotId = snapshot.getSnapshotId();
        if (t9.getSnapshotId() == snapshotId) {
            return t9;
        }
        synchronized (getLock()) {
            t10 = (T) newOverwritableRecordLocked(t8, stateObject);
        }
        t10.setSnapshotId$runtime_release(snapshotId);
        if (t9.getSnapshotId() != SnapshotId_jvmKt.toSnapshotId(1)) {
            snapshot.mo10229recordModified$runtime_release(stateObject);
        }
        return t10;
    }

    private static final boolean overwriteUnusedRecordsLocked(StateObject stateObject) {
        StateRecord stateRecord;
        long jLowestOrDefault = pinningTable.lowestOrDefault(nextSnapshotId);
        StateRecord stateRecord2 = null;
        StateRecord firstStateRecord = null;
        int i = 0;
        for (StateRecord firstStateRecord2 = stateObject.getFirstStateRecord(); firstStateRecord2 != null; firstStateRecord2 = firstStateRecord2.getNext()) {
            long snapshotId$runtime_release = firstStateRecord2.getSnapshotId();
            if (snapshotId$runtime_release != INVALID_SNAPSHOT) {
                if (snapshotId$runtime_release >= jLowestOrDefault) {
                    i++;
                } else if (stateRecord2 == null) {
                    i++;
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
        return i > 1;
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
    public static final <T extends StateRecord> T readable(T t8, long j7, SnapshotIdSet snapshotIdSet) {
        T t9 = null;
        while (t8 != null) {
            if (valid(t8, j7, snapshotIdSet) && (t9 == null || t9.getSnapshotId() < t8.getSnapshotId())) {
                t9 = t8;
            }
            t8 = (T) t8.getNext();
        }
        if (t9 != null) {
            return t9;
        }
        return null;
    }

    public static final void releasePinningLocked(int i) {
        pinningTable.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void reportReadonlySnapshotWrite() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T resetGlobalSnapshotLocked(GlobalSnapshot globalSnapshot2, InterfaceC6471c interfaceC6471c) {
        long snapshotId = globalSnapshot2.getSnapshotId();
        T t8 = (T) interfaceC6471c.invoke(openSnapshots.clear(snapshotId));
        long j7 = nextSnapshotId;
        nextSnapshotId = 1 + j7;
        openSnapshots = openSnapshots.clear(snapshotId);
        globalSnapshot2.setSnapshotId$runtime_release(j7);
        globalSnapshot2.setInvalid$runtime_release(openSnapshots);
        globalSnapshot2.setWriteCount$runtime_release(0);
        globalSnapshot2.setModified(null);
        globalSnapshot2.releasePinnedSnapshotLocked$runtime_release();
        openSnapshots = openSnapshots.set(j7);
        return t8;
    }

    @PublishedApi
    public static final <T> T sync(@NotNull InterfaceC6469a interfaceC6469a) {
        T t8;
        synchronized (getLock()) {
            t8 = (T) interfaceC6469a.invoke();
        }
        return t8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends Snapshot> T takeNewSnapshot(final InterfaceC6471c interfaceC6471c) {
        return (T) advanceGlobalSnapshot(new InterfaceC6471c() { // from class: androidx.compose.runtime.snapshots.SnapshotKt.takeNewSnapshot.1
            {
                super(1);
            }

            /* JADX WARN: Incorrect return type in method signature: (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)TT; */
            @Override // p152r6.InterfaceC6471c
            public final Snapshot invoke(SnapshotIdSet snapshotIdSet) {
                Snapshot snapshot = (Snapshot) interfaceC6471c.invoke(snapshotIdSet);
                synchronized (SnapshotKt.getLock()) {
                    SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(snapshot.getSnapshotId());
                }
                return snapshot;
            }
        });
    }

    public static final int trackPinning(long j7, @NotNull SnapshotIdSet snapshotIdSet) {
        int iAdd;
        long jLowest = snapshotIdSet.lowest(j7);
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

    private static final boolean valid(long j7, long j8, SnapshotIdSet snapshotIdSet) {
        return (j8 == INVALID_SNAPSHOT || j8 > j7 || snapshotIdSet.get(j8)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateOpen(Snapshot snapshot) {
        long jLowestOrDefault;
        if (openSnapshots.get(snapshot.getSnapshotId())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
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

    public static final <T extends StateRecord, R> R withCurrent(@NotNull T t8, @NotNull InterfaceC6471c interfaceC6471c) {
        return (R) interfaceC6471c.invoke(current(t8));
    }

    public static final <T extends StateRecord, R> R writable(@NotNull T t8, @NotNull StateObject stateObject, @NotNull Snapshot snapshot, @NotNull InterfaceC6471c interfaceC6471c) {
        R r;
        synchronized (getLock()) {
            r = (R) interfaceC6471c.invoke(writableRecord(t8, stateObject, snapshot));
        }
        notifyWrite(snapshot, stateObject);
        return r;
    }

    @PublishedApi
    @NotNull
    public static final <T extends StateRecord> T writableRecord(@NotNull T t8, @NotNull StateObject stateObject, @NotNull Snapshot snapshot) {
        T t9;
        if (snapshot.getReadOnly()) {
            snapshot.mo10229recordModified$runtime_release(stateObject);
        }
        long snapshotId = snapshot.getSnapshotId();
        T t10 = (T) readable(t8, snapshotId, snapshot.getInvalid());
        if (t10 == null) {
            readError();
            throw new KotlinNothingValueException();
        }
        if (t10.getSnapshotId() == snapshot.getSnapshotId()) {
            return t10;
        }
        synchronized (getLock()) {
            t9 = (T) readable(stateObject.getFirstStateRecord(), snapshotId, snapshot.getInvalid());
            if (t9 == null) {
                readError();
                throw new KotlinNothingValueException();
            }
            if (t9.getSnapshotId() != snapshotId) {
                t9 = (T) newWritableRecordLocked(t9, stateObject, snapshot);
            }
        }
        AbstractC5830k.m5328e(t9, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.writableRecord");
        if (t10.getSnapshotId() != SnapshotId_jvmKt.toSnapshotId(1)) {
            snapshot.mo10229recordModified$runtime_release(stateObject);
        }
        return t9;
    }

    private static final boolean valid(StateRecord stateRecord, long j7, SnapshotIdSet snapshotIdSet) {
        return valid(j7, stateRecord.getSnapshotId(), snapshotIdSet);
    }

    @NotNull
    public static final <T extends StateRecord> T readable(@NotNull T t8, @NotNull StateObject stateObject) {
        T t9;
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot current = companion.getCurrent();
        InterfaceC6471c readObserver = current.getReadObserver();
        if (readObserver != null) {
            readObserver.invoke(stateObject);
        }
        T t10 = (T) readable(t8, current.getSnapshotId(), current.getInvalid());
        if (t10 != null) {
            return t10;
        }
        synchronized (getLock()) {
            Snapshot current2 = companion.getCurrent();
            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
            AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            t9 = (T) readable(firstStateRecord, current2.getSnapshotId(), current2.getInvalid());
            if (t9 == null) {
                readError();
                throw new KotlinNothingValueException();
            }
        }
        return t9;
    }

    public static final <T extends StateRecord, R> R writable(@NotNull T t8, @NotNull StateObject stateObject, @NotNull InterfaceC6471c interfaceC6471c) {
        Snapshot current;
        R r;
        synchronized (getLock()) {
            current = Snapshot.INSTANCE.getCurrent();
            r = (R) interfaceC6471c.invoke(writableRecord(t8, stateObject, current));
        }
        notifyWrite(current, stateObject);
        return r;
    }

    @PublishedApi
    @NotNull
    public static final <T extends StateRecord> T current(@NotNull T t8) {
        T t9;
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot current = companion.getCurrent();
        T t10 = (T) readable(t8, current.getSnapshotId(), current.getInvalid());
        if (t10 != null) {
            return t10;
        }
        synchronized (getLock()) {
            Snapshot current2 = companion.getCurrent();
            t9 = (T) readable(t8, current2.getSnapshotId(), current2.getInvalid());
        }
        if (t9 != null) {
            return t9;
        }
        readError();
        throw new KotlinNothingValueException();
    }

    @NotNull
    public static final <T extends StateRecord> T readable(@NotNull T t8, @NotNull StateObject stateObject, @NotNull Snapshot snapshot) {
        T t9;
        InterfaceC6471c readObserver = snapshot.getReadObserver();
        if (readObserver != null) {
            readObserver.invoke(stateObject);
        }
        T t10 = (T) readable(t8, snapshot.getSnapshotId(), snapshot.getInvalid());
        if (t10 != null) {
            return t10;
        }
        synchronized (getLock()) {
            Snapshot current = Snapshot.INSTANCE.getCurrent();
            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
            AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            t9 = (T) readable(firstStateRecord, current.getSnapshotId(), current.getInvalid());
            if (t9 == null) {
                readError();
                throw new KotlinNothingValueException();
            }
        }
        return t9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void advanceGlobalSnapshot() {
        advanceGlobalSnapshot(emptyLambda);
    }
}
