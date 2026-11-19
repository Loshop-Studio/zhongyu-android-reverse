package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.InternalComposeApi;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Thread_jvmKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 d2\u00020\u0001:\u0001dB\u001d\b\u0004\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0015\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\u00002\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f\u0018\u00010\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0086\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0000H\u0011¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0000H\u0011¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b \u0010\u001cJ\u0017\u0010\"\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\"\u0010\u001fJ\u0017\u0010$\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0000H ¢\u0006\u0004\b#\u0010\u001fJ\u0017\u0010&\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0000H ¢\u0006\u0004\b%\u0010\u001fJ\u0017\u0010+\u001a\u00020\f2\u0006\u0010(\u001a\u00020'H ¢\u0006\u0004\b)\u0010*J\u000f\u0010-\u001a\u00020\fH ¢\u0006\u0004\b,\u0010\u000eJ\u000f\u0010/\u001a\u00020\fH\u0000¢\u0006\u0004\b.\u0010\u000eJ\u000f\u00101\u001a\u00020\fH\u0010¢\u0006\u0004\b0\u0010\u000eJ\u000f\u00103\u001a\u00020\fH\u0010¢\u0006\u0004\b2\u0010\u000eJ\u000f\u00105\u001a\u00020\fH\u0000¢\u0006\u0004\b4\u0010\u000eJ\u000f\u00107\u001a\u00020\fH\u0000¢\u0006\u0004\b6\u0010\u000eJ\u000f\u0010:\u001a\u00020\tH\u0000¢\u0006\u0004\b8\u00109R\"\u0010\u0006\u001a\u00020\u00058\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R2\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\u0010@\u001a\u00060\u0002j\u0002`\u00038\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010F\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010\u0015\"\u0004\bI\u0010JR\u001c\u0010K\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bK\u0010L\u0012\u0004\bM\u0010\u000eR\u001a\u0010\n\u001a\u00020\t8VX\u0097\u0004¢\u0006\f\u0012\u0004\bO\u0010\u000e\u001a\u0004\bN\u00109R$\u0010T\u001a\u00020\t2\u0006\u0010P\u001a\u00020\t8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\bQ\u00109\"\u0004\bR\u0010SR\u0014\u0010V\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\bU\u0010\u001cR\u0014\u0010X\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\bW\u0010\u0015R\u0015\u0010Z\u001a\u00020\u00138À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\bY\u0010\u0015R(\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f\u0018\u00010\u000f8 X¡\u0004¢\u0006\f\u0012\u0004\b]\u0010\u000e\u001a\u0004\b[\u0010\\R\"\u0010_\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f\u0018\u00010\u000f8 X \u0004¢\u0006\u0006\u001a\u0004\b^\u0010\\R\u001c\u0010c\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010`8 X \u0004¢\u0006\u0006\u001a\u0004\ba\u0010b\u0082\u0001\u0004efgh¨\u0006i"}, m5110d2 = {"Landroidx/compose/runtime/snapshots/Snapshot;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "<init>", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "", "id", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "Ld6/s;", "dispose", "()V", "Lkotlin/Function1;", "readObserver", "takeNestedSnapshot", "(Lr6/c;)Landroidx/compose/runtime/snapshots/Snapshot;", "", "hasPendingChanges", "()Z", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "block", "enter", "(Lr6/a;)Ljava/lang/Object;", "makeCurrent", "()Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "restoreCurrent", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "unsafeEnter", "oldSnapshot", "unsafeLeave", "nestedActivated$runtime_release", "nestedActivated", "nestedDeactivated$runtime_release", "nestedDeactivated", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "recordModified$runtime_release", "(Landroidx/compose/runtime/snapshots/StateObject;)V", "recordModified", "notifyObjectsInitialized$runtime_release", "notifyObjectsInitialized", "closeAndReleasePinning$runtime_release", "closeAndReleasePinning", "closeLocked$runtime_release", "closeLocked", "releasePinnedSnapshotsForCloseLocked$runtime_release", "releasePinnedSnapshotsForCloseLocked", "validateNotDisposed$runtime_release", "validateNotDisposed", "releasePinnedSnapshotLocked$runtime_release", "releasePinnedSnapshotLocked", "takeoverPinnedSnapshot$runtime_release", "()I", "takeoverPinnedSnapshot", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getInvalid$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setInvalid$runtime_release", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "<set-?>", "J", "getSnapshotId", "()J", "setSnapshotId$runtime_release", "(J)V", "disposed", "Z", "getDisposed$runtime_release", "setDisposed$runtime_release", "(Z)V", "pinningTrackingHandle", "I", "getPinningTrackingHandle$annotations", "getId", "getId$annotations", "value", "getWriteCount$runtime_release", "setWriteCount$runtime_release", "(I)V", "writeCount", "getRoot", "root", "getReadOnly", "readOnly", "isPinned$runtime_release", "isPinned", "getReadObserver", "()Lr6/c;", "getReadObserver$annotations", "getWriteObserver$runtime_release", "writeObserver", "Landroidx/collection/MutableScatterSet;", "getModified$runtime_release", "()Landroidx/collection/MutableScatterSet;", "modified", "Companion", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/ReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/TransparentObserverSnapshot;", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2487:1\n1894#2,2:2488\n1894#2,2:2497\n33#3,2:2490\n33#3,2:2499\n48#4,5:2492\n33#4,5:2501\n1#5:2506\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n112#1:2488,2\n244#1:2497,2\n112#1:2490,2\n244#1:2499,2\n189#1:2492,5\n273#1:2501,5\n*E\n"})
/* loaded from: classes.dex */
public abstract class Snapshot {
    public static final int PreexistingSnapshotId = 1;
    private boolean disposed;

    @NotNull
    private SnapshotIdSet invalid;
    private int pinningTrackingHandle;
    private long snapshotId;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m5109d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00072\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ=\u0010\f\u001a\u00020\u000b2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0014\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00132\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0086\b¢\u0006\u0004\b\u0014\u0010\u0012JQ\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\u001e\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ6\u0010!\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0002\b H\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b!\u0010\u0012J-\u0010%\u001a\u00020$2\u001e\u0010\u001d\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010#\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\"¢\u0006\u0004\b%\u0010&J!\u0010'\u001a\u00020$2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0005¢\u0006\u0004\b)\u0010\u0003J\r\u0010*\u001a\u00020\u0005¢\u0006\u0004\b*\u0010\u0003J\u000f\u0010,\u001a\u00020+H\u0007¢\u0006\u0004\b,\u0010-J\u0011\u0010.\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0004\b.\u0010\u0018J\u0019\u0010/\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0004\b/\u00100R\u0011\u00102\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b1\u0010\u0018R\u0011\u00104\u001a\u0002038F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u00106\u001a\u0002038F¢\u0006\u0006\u001a\u0004\b6\u00105R\u001c\u00109\u001a\u0004\u0018\u00010\u00078@X\u0081\u0004¢\u0006\f\u0012\u0004\b8\u0010\u0003\u001a\u0004\b7\u0010\u0018R\u001a\u0010:\u001a\u00020+8\u0006X\u0086T¢\u0006\f\n\u0004\b:\u0010;\u0012\u0004\b<\u0010\u0003R\u0019\u0010@\u001a\u000203*\u00020=8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0019\u0010@\u001a\u000203*\u00020A8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010B¨\u0006C"}, m5110d2 = {"Landroidx/compose/runtime/snapshots/Snapshot$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Ld6/s;", "readObserver", "Landroidx/compose/runtime/snapshots/Snapshot;", "takeSnapshot", "(Lr6/c;)Landroidx/compose/runtime/snapshots/Snapshot;", "writeObserver", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "takeMutableSnapshot", "(Lr6/c;Lr6/c;)Landroidx/compose/runtime/snapshots/MutableSnapshot;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "block", "global", "(Lr6/a;)Ljava/lang/Object;", "R", "withMutableSnapshot", "observe", "(Lr6/c;Lr6/c;Lr6/a;)Ljava/lang/Object;", "createNonObservableSnapshot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "previous", "makeCurrentNonObservable", "(Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/Snapshot;", "nonObservable", "observer", "restoreNonObservable", "(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Lr6/c;)V", "Landroidx/compose/runtime/DisallowComposableCalls;", "withoutReadObservation", "Lkotlin/Function2;", "", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "registerApplyObserver", "(Lr6/e;)Landroidx/compose/runtime/snapshots/ObserverHandle;", "registerGlobalWriteObserver", "(Lr6/c;)Landroidx/compose/runtime/snapshots/ObserverHandle;", "notifyObjectsInitialized", "sendApplyNotifications", "", "openSnapshotCount", "()I", "removeCurrent", "restoreCurrent", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "getCurrent", "current", "", "isInSnapshot", "()Z", "isApplyObserverNotificationPending", "getCurrentThreadSnapshot", "getCurrentThreadSnapshot$annotations", "currentThreadSnapshot", "PreexistingSnapshotId", "I", "getPreexistingSnapshotId$annotations", "Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;", "getCanBeReused", "(Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;)Z", "canBeReused", "Landroidx/compose/runtime/snapshots/TransparentObserverSnapshot;", "(Landroidx/compose/runtime/snapshots/TransparentObserverSnapshot;)Z", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 4 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,2487:1\n546#1:2493\n546#1:2499\n549#1:2500\n148#2,5:2488\n148#2,5:2494\n1894#3,2:2501\n1894#3,2:2505\n1894#3,2:2509\n1894#3,2:2513\n1894#3,2:2517\n33#4,2:2503\n33#4,2:2507\n33#4,2:2511\n33#4,2:2515\n33#4,2:2519\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n492#1:2493\n554#1:2499\n558#1:2500\n455#1:2488,5\n527#1:2494,5\n623#1:2501,2\n644#1:2505,2\n678#1:2509,2\n624#1:2513,2\n647#1:2517,2\n623#1:2503,2\n644#1:2507,2\n678#1:2511,2\n624#1:2515,2\n647#1:2519,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        private final boolean getCanBeReused(TransparentObserverMutableSnapshot transparentObserverMutableSnapshot) {
            return transparentObserverMutableSnapshot.getThreadId() == Thread_jvmKt.currentThreadId();
        }

        @PublishedApi
        public static /* synthetic */ void getCurrentThreadSnapshot$annotations() {
        }

        public static /* synthetic */ void getPreexistingSnapshotId$annotations() {
        }

        public static /* synthetic */ Object observe$default(Companion companion, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6469a interfaceC6469a, int i, Object obj) {
            if ((i & 1) != 0) {
                interfaceC6471c = null;
            }
            if ((i & 2) != 0) {
                interfaceC6471c2 = null;
            }
            return companion.observe(interfaceC6471c, interfaceC6471c2, interfaceC6469a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void registerApplyObserver$lambda$4(InterfaceC6473e interfaceC6473e) {
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.applyObservers = AbstractC5805t.m5238r0(SnapshotKt.applyObservers, interfaceC6473e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void registerGlobalWriteObserver$lambda$7(InterfaceC6471c interfaceC6471c) {
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.globalWriteObservers = AbstractC5805t.m5238r0(SnapshotKt.globalWriteObservers, interfaceC6471c);
            }
            SnapshotKt.advanceGlobalSnapshot();
        }

        public static /* synthetic */ MutableSnapshot takeMutableSnapshot$default(Companion companion, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, int i, Object obj) {
            if ((i & 1) != 0) {
                interfaceC6471c = null;
            }
            if ((i & 2) != 0) {
                interfaceC6471c2 = null;
            }
            return companion.takeMutableSnapshot(interfaceC6471c, interfaceC6471c2);
        }

        public static /* synthetic */ Snapshot takeSnapshot$default(Companion companion, InterfaceC6471c interfaceC6471c, int i, Object obj) {
            if ((i & 1) != 0) {
                interfaceC6471c = null;
            }
            return companion.takeSnapshot(interfaceC6471c);
        }

        @PublishedApi
        @NotNull
        public final Snapshot createNonObservableSnapshot() {
            return SnapshotKt.createTransparentSnapshotWithNoParentReadObserver$default((Snapshot) SnapshotKt.threadSnapshot.get(), null, false, 6, null);
        }

        @NotNull
        public final Snapshot getCurrent() {
            return SnapshotKt.currentSnapshot();
        }

        @Nullable
        public final Snapshot getCurrentThreadSnapshot() {
            return (Snapshot) SnapshotKt.threadSnapshot.get();
        }

        public final <T> T global(@NotNull InterfaceC6469a block) {
            Snapshot snapshotRemoveCurrent = removeCurrent();
            try {
                return (T) block.invoke();
            } finally {
                restoreCurrent(snapshotRemoveCurrent);
            }
        }

        public final boolean isApplyObserverNotificationPending() {
            return SnapshotKt.pendingApplyObserverCount.get() > 0;
        }

        public final boolean isInSnapshot() {
            return SnapshotKt.threadSnapshot.get() != null;
        }

        @PublishedApi
        @NotNull
        public final Snapshot makeCurrentNonObservable(@Nullable Snapshot previous) {
            if (previous instanceof TransparentObserverMutableSnapshot) {
                TransparentObserverMutableSnapshot transparentObserverMutableSnapshot = (TransparentObserverMutableSnapshot) previous;
                if (transparentObserverMutableSnapshot.getThreadId() == Thread_jvmKt.currentThreadId()) {
                    transparentObserverMutableSnapshot.setReadObserver(null);
                    return previous;
                }
            }
            if (previous instanceof TransparentObserverSnapshot) {
                TransparentObserverSnapshot transparentObserverSnapshot = (TransparentObserverSnapshot) previous;
                if (transparentObserverSnapshot.getThreadId$runtime_release() == Thread_jvmKt.currentThreadId()) {
                    transparentObserverSnapshot.setReadObserver(null);
                    return previous;
                }
            }
            Snapshot snapshotCreateTransparentSnapshotWithNoParentReadObserver$default = SnapshotKt.createTransparentSnapshotWithNoParentReadObserver$default(previous, null, false, 6, null);
            snapshotCreateTransparentSnapshotWithNoParentReadObserver$default.makeCurrent();
            return snapshotCreateTransparentSnapshotWithNoParentReadObserver$default;
        }

        public final void notifyObjectsInitialized() {
            SnapshotKt.currentSnapshot().notifyObjectsInitialized$runtime_release();
        }

        public final <T> T observe(@Nullable InterfaceC6471c readObserver, @Nullable InterfaceC6471c writeObserver, @NotNull InterfaceC6469a block) {
            Snapshot transparentObserverMutableSnapshot;
            if (readObserver == null && writeObserver == null) {
                return (T) block.invoke();
            }
            Snapshot snapshot = (Snapshot) SnapshotKt.threadSnapshot.get();
            if (snapshot instanceof TransparentObserverMutableSnapshot) {
                TransparentObserverMutableSnapshot transparentObserverMutableSnapshot2 = (TransparentObserverMutableSnapshot) snapshot;
                if (transparentObserverMutableSnapshot2.getThreadId() == Thread_jvmKt.currentThreadId()) {
                    InterfaceC6471c readObserver$runtime_release = transparentObserverMutableSnapshot2.getReadObserver();
                    InterfaceC6471c writeObserver$runtime_release = transparentObserverMutableSnapshot2.getWriteObserver();
                    try {
                        ((TransparentObserverMutableSnapshot) snapshot).setReadObserver(SnapshotKt.mergedReadObserver$default(readObserver, readObserver$runtime_release, false, 4, null));
                        ((TransparentObserverMutableSnapshot) snapshot).setWriteObserver(SnapshotKt.mergedWriteObserver(writeObserver, writeObserver$runtime_release));
                        return (T) block.invoke();
                    } finally {
                        transparentObserverMutableSnapshot2.setReadObserver(readObserver$runtime_release);
                        transparentObserverMutableSnapshot2.setWriteObserver(writeObserver$runtime_release);
                    }
                }
            }
            if (snapshot == null || (snapshot instanceof MutableSnapshot)) {
                transparentObserverMutableSnapshot = new TransparentObserverMutableSnapshot(snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null, readObserver, writeObserver, true, false);
            } else {
                if (readObserver == null) {
                    return (T) block.invoke();
                }
                transparentObserverMutableSnapshot = snapshot.takeNestedSnapshot(readObserver);
            }
            try {
                Snapshot snapshotMakeCurrent = transparentObserverMutableSnapshot.makeCurrent();
                try {
                    T t8 = (T) block.invoke();
                    transparentObserverMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    transparentObserverMutableSnapshot.dispose();
                    return t8;
                } catch (Throwable th) {
                    transparentObserverMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    throw th;
                }
            } catch (Throwable th2) {
                transparentObserverMutableSnapshot.dispose();
                throw th2;
            }
        }

        @InternalComposeApi
        public final int openSnapshotCount() {
            return AbstractC5805t.m5217D0(SnapshotKt.openSnapshots).size();
        }

        @NotNull
        public final ObserverHandle registerApplyObserver(@NotNull InterfaceC6473e observer) {
            SnapshotKt.advanceGlobalSnapshot(SnapshotKt.emptyLambda);
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.applyObservers = AbstractC5805t.m5239s0(SnapshotKt.applyObservers, observer);
            }
            return new C2071a(observer, 0);
        }

        @NotNull
        public final ObserverHandle registerGlobalWriteObserver(@NotNull InterfaceC6471c observer) {
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.globalWriteObservers = AbstractC5805t.m5239s0(SnapshotKt.globalWriteObservers, observer);
            }
            SnapshotKt.advanceGlobalSnapshot();
            return new C2071a(observer, 1);
        }

        @PublishedApi
        @Nullable
        public final Snapshot removeCurrent() {
            Snapshot snapshot = (Snapshot) SnapshotKt.threadSnapshot.get();
            if (snapshot != null) {
                SnapshotKt.threadSnapshot.set(null);
            }
            return snapshot;
        }

        @PublishedApi
        public final void restoreCurrent(@Nullable Snapshot previous) {
            if (previous != null) {
                SnapshotKt.threadSnapshot.set(previous);
            }
        }

        @PublishedApi
        public final void restoreNonObservable(@Nullable Snapshot previous, @NotNull Snapshot nonObservable, @Nullable InterfaceC6471c observer) {
            if (previous != nonObservable) {
                nonObservable.restoreCurrent(previous);
                nonObservable.dispose();
            } else if (previous instanceof TransparentObserverMutableSnapshot) {
                ((TransparentObserverMutableSnapshot) previous).setReadObserver(observer);
            } else if (previous instanceof TransparentObserverSnapshot) {
                ((TransparentObserverSnapshot) previous).setReadObserver(observer);
            } else {
                throw new IllegalStateException(("Non-transparent snapshot was reused: " + previous).toString());
            }
        }

        public final void sendApplyNotifications() {
            boolean zHasPendingChanges;
            synchronized (SnapshotKt.getLock()) {
                zHasPendingChanges = SnapshotKt.globalSnapshot.hasPendingChanges();
            }
            if (zHasPendingChanges) {
                SnapshotKt.advanceGlobalSnapshot();
            }
        }

        @NotNull
        public final MutableSnapshot takeMutableSnapshot(@Nullable InterfaceC6471c readObserver, @Nullable InterfaceC6471c writeObserver) {
            MutableSnapshot mutableSnapshotTakeNestedMutableSnapshot;
            Snapshot snapshotCurrentSnapshot = SnapshotKt.currentSnapshot();
            MutableSnapshot mutableSnapshot = snapshotCurrentSnapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshotCurrentSnapshot : null;
            if (mutableSnapshot == null || (mutableSnapshotTakeNestedMutableSnapshot = mutableSnapshot.takeNestedMutableSnapshot(readObserver, writeObserver)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            return mutableSnapshotTakeNestedMutableSnapshot;
        }

        @NotNull
        public final Snapshot takeSnapshot(@Nullable InterfaceC6471c readObserver) {
            return SnapshotKt.currentSnapshot().takeNestedSnapshot(readObserver);
        }

        public final <R> R withMutableSnapshot(@NotNull InterfaceC6469a block) {
            MutableSnapshot mutableSnapshotTakeMutableSnapshot$default = takeMutableSnapshot$default(this, null, null, 3, null);
            try {
                Snapshot snapshotMakeCurrent = mutableSnapshotTakeMutableSnapshot$default.makeCurrent();
                try {
                    R r = (R) block.invoke();
                    mutableSnapshotTakeMutableSnapshot$default.apply().check();
                    return r;
                } finally {
                    mutableSnapshotTakeMutableSnapshot$default.restoreCurrent(snapshotMakeCurrent);
                }
            } finally {
            }
        }

        public final <T> T withoutReadObservation(@NotNull InterfaceC6469a block) {
            Snapshot currentThreadSnapshot = getCurrentThreadSnapshot();
            InterfaceC6471c readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot snapshotMakeCurrentNonObservable = makeCurrentNonObservable(currentThreadSnapshot);
            try {
                return (T) block.invoke();
            } finally {
                restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            }
        }

        private Companion() {
        }

        private final boolean getCanBeReused(TransparentObserverSnapshot transparentObserverSnapshot) {
            return transparentObserverSnapshot.getThreadId$runtime_release() == Thread_jvmKt.currentThreadId();
        }
    }

    public /* synthetic */ Snapshot(int i, SnapshotIdSet snapshotIdSet, AbstractC5824e abstractC5824e) {
        this(i, snapshotIdSet);
    }

    @Deprecated(message = "Use snapshotId instead", replaceWith = @ReplaceWith(expression = "snapshotId", imports = {}))
    public static /* synthetic */ void getId$annotations() {
    }

    private static /* synthetic */ void getPinningTrackingHandle$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getReadObserver$annotations() {
    }

    public static /* synthetic */ Snapshot takeNestedSnapshot$default(Snapshot snapshot, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedSnapshot");
        }
        if ((i & 1) != 0) {
            interfaceC6471c = null;
        }
        return snapshot.takeNestedSnapshot(interfaceC6471c);
    }

    public final void closeAndReleasePinning$runtime_release() {
        synchronized (SnapshotKt.getLock()) {
            closeLocked$runtime_release();
            releasePinnedSnapshotsForCloseLocked$runtime_release();
        }
    }

    public void closeLocked$runtime_release() {
        SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.clear(getSnapshotId());
    }

    public void dispose() {
        this.disposed = true;
        synchronized (SnapshotKt.getLock()) {
            releasePinnedSnapshotLocked$runtime_release();
        }
    }

    public final <T> T enter(@NotNull InterfaceC6469a block) {
        Snapshot snapshotMakeCurrent = makeCurrent();
        try {
            return (T) block.invoke();
        } finally {
            restoreCurrent(snapshotMakeCurrent);
        }
    }

    /* renamed from: getDisposed$runtime_release, reason: from getter */
    public final boolean getDisposed() {
        return this.disposed;
    }

    public int getId() {
        return (int) getSnapshotId();
    }

    @NotNull
    /* renamed from: getInvalid$runtime_release, reason: from getter */
    public SnapshotIdSet getInvalid() {
        return this.invalid;
    }

    @Nullable
    public abstract MutableScatterSet<StateObject> getModified$runtime_release();

    @Nullable
    public abstract InterfaceC6471c getReadObserver();

    public abstract boolean getReadOnly();

    @NotNull
    public abstract Snapshot getRoot();

    public long getSnapshotId() {
        return this.snapshotId;
    }

    public int getWriteCount$runtime_release() {
        return 0;
    }

    @Nullable
    /* renamed from: getWriteObserver$runtime_release */
    public abstract InterfaceC6471c getWriteObserver();

    public abstract boolean hasPendingChanges();

    public final boolean isPinned$runtime_release() {
        return this.pinningTrackingHandle >= 0;
    }

    @PublishedApi
    @Nullable
    public Snapshot makeCurrent() {
        Snapshot snapshot = (Snapshot) SnapshotKt.threadSnapshot.get();
        SnapshotKt.threadSnapshot.set(this);
        return snapshot;
    }

    /* renamed from: nestedActivated$runtime_release */
    public abstract void mo10226nestedActivated$runtime_release(@NotNull Snapshot snapshot);

    /* renamed from: nestedDeactivated$runtime_release */
    public abstract void mo10227nestedDeactivated$runtime_release(@NotNull Snapshot snapshot);

    public abstract void notifyObjectsInitialized$runtime_release();

    /* renamed from: recordModified$runtime_release */
    public abstract void mo10229recordModified$runtime_release(@NotNull StateObject state);

    public final void releasePinnedSnapshotLocked$runtime_release() {
        int i = this.pinningTrackingHandle;
        if (i >= 0) {
            SnapshotKt.releasePinningLocked(i);
            this.pinningTrackingHandle = -1;
        }
    }

    public void releasePinnedSnapshotsForCloseLocked$runtime_release() {
        releasePinnedSnapshotLocked$runtime_release();
    }

    @PublishedApi
    public void restoreCurrent(@Nullable Snapshot snapshot) {
        SnapshotKt.threadSnapshot.set(snapshot);
    }

    public final void setDisposed$runtime_release(boolean z8) {
        this.disposed = z8;
    }

    public void setInvalid$runtime_release(@NotNull SnapshotIdSet snapshotIdSet) {
        this.invalid = snapshotIdSet;
    }

    public void setSnapshotId$runtime_release(long j7) {
        this.snapshotId = j7;
    }

    public void setWriteCount$runtime_release(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    @NotNull
    public abstract Snapshot takeNestedSnapshot(@Nullable InterfaceC6471c readObserver);

    public final int takeoverPinnedSnapshot$runtime_release() {
        int i = this.pinningTrackingHandle;
        this.pinningTrackingHandle = -1;
        return i;
    }

    @Nullable
    public final Snapshot unsafeEnter() {
        return makeCurrent();
    }

    public final void unsafeLeave(@Nullable Snapshot oldSnapshot) {
        if (!(SnapshotKt.threadSnapshot.get() == this)) {
            PreconditionsKt.throwIllegalStateException("Cannot leave snapshot; " + this + " is not the current snapshot");
        }
        restoreCurrent(oldSnapshot);
    }

    public final void validateNotDisposed$runtime_release() {
        if (this.disposed) {
            PreconditionsKt.throwIllegalArgumentException("Cannot use a disposed snapshot");
        }
    }

    public /* synthetic */ Snapshot(long j7, SnapshotIdSet snapshotIdSet, AbstractC5824e abstractC5824e) {
        this(j7, snapshotIdSet);
    }

    private Snapshot(long j7, SnapshotIdSet snapshotIdSet) {
        this.invalid = snapshotIdSet;
        this.snapshotId = j7;
        this.pinningTrackingHandle = j7 != SnapshotKt.INVALID_SNAPSHOT ? SnapshotKt.trackPinning(j7, getInvalid()) : -1;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use id: Long constructor instead")
    private /* synthetic */ Snapshot(int i, SnapshotIdSet snapshotIdSet) {
        this(SnapshotId_jvmKt.toSnapshotId(i), snapshotIdSet, (AbstractC5824e) null);
    }
}
