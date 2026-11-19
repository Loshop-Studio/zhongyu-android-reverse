package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableSet;

@Metadata(m7879d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010)\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0001BB\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001fJ\u0016\u0010 \u001a\u00020\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016J\b\u0010#\u001a\u00020$H\u0016J)\u0010%\u001a\u00020\u001d2\u001e\u0010&\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(0'H\u0082\bJ\u0016\u0010)\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u001fJ\u0016\u0010*\u001a\u00020\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016J\b\u0010+\u001a\u00020\u001dH\u0016J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0096\u0002J.\u0010.\u001a\u0002H/\"\u0004\b\u0001\u0010/2\u0018\u0010&\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u0002H/0'H\u0082\b¢\u0006\u0002\u00100J\"\u00101\u001a\u00020\u001d2\u0018\u0010&\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u001d0'H\u0002J\u0010\u00102\u001a\u00020$2\u0006\u00103\u001a\u00020\rH\u0016J\u0015\u00104\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001fJ\u0016\u00105\u001a\u00020\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016J\u0016\u00106\u001a\u00020\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016J\u0016\u00107\u001a\u00020\r2\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0002J\f\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000\bJ\b\u0010:\u001a\u00020;H\u0016J3\u0010<\u001a\u0002H/\"\u0004\b\u0001\u0010/2\u001d\u0010&\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u0004\u0012\u0002H/0'¢\u0006\u0002\b=H\u0082\b¢\u0006\u0002\u00100J3\u0010>\u001a\u0002H/\"\u0004\b\u0001\u0010/2\u001d\u0010&\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u0004\u0012\u0002H/0'¢\u0006\u0002\b=H\u0082\b¢\u0006\u0002\u00100J(\u0010?\u001a\u00020\u001d*\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010@\u001a\u00020\u00122\f\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0002R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b8AX\u0080\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0014¨\u0006C"}, m7880d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateSet;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/snapshots/StateObject;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "()V", "debuggerDisplayValue", "", "getDebuggerDisplayValue$annotations", "getDebuggerDisplayValue", "()Ljava/util/Set;", "<set-?>", "Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "modification", "", "getModification$runtime_release", "()I", "readable", "Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;", "getReadable$runtime_release$annotations", "getReadable$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;", "size", "getSize", "add", "", "element", "(Ljava/lang/Object;)Z", "addAll", "elements", "", "clear", "", "conditionalUpdate", "block", "Lkotlin/Function1;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "contains", "containsAll", "isEmpty", "iterator", "", "mutate", "R", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "mutateBoolean", "prependStateRecord", "value", "remove", "removeAll", "retainAll", "stateRecordWith", "set", "toSet", "toString", "", "withCurrent", "Lkotlin/ExtensionFunctionType;", "writable", "attemptUpdate", "currentModification", "newSet", "StateSetStateRecord", "runtime_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
@Stable
@SourceDebugExtension({"SMAP\nSnapshotStateSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateSet.kt\nandroidx/compose/runtime/snapshots/SnapshotStateSet\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,268:1\n139#1:269\n161#1,6:272\n167#1:280\n139#1:281\n168#1,9:283\n136#1:292\n177#1,6:302\n161#1,6:308\n167#1:316\n139#1:317\n168#1,9:319\n136#1:328\n177#1,6:338\n136#1:344\n161#1,6:357\n167#1:365\n139#1:366\n168#1,9:368\n136#1:377\n177#1,6:387\n161#1,6:393\n167#1:401\n139#1:402\n168#1,9:404\n136#1:413\n177#1,6:423\n139#1:429\n144#1,5:443\n149#1:450\n139#1:451\n150#1,7:453\n136#1:460\n158#1:470\n139#1:473\n136#1:475\n139#1:489\n136#1:491\n2475#2:270\n2475#2:271\n2475#2:282\n2365#2,2:293\n1894#2,2:295\n2367#2,4:297\n2475#2:318\n2365#2,2:329\n1894#2,2:331\n2367#2,4:333\n2365#2,2:345\n1894#2,2:347\n2367#2,2:351\n2370#2:355\n2475#2:367\n2365#2,2:378\n1894#2,2:380\n2367#2,4:382\n2475#2:403\n2365#2,2:414\n1894#2,2:416\n2367#2,4:418\n2475#2:430\n2365#2,2:431\n1894#2,2:433\n2367#2,4:437\n2475#2:442\n2475#2:452\n2365#2,2:461\n1894#2,2:463\n2367#2,4:465\n2475#2:474\n2365#2,2:476\n1894#2,2:478\n2367#2,4:482\n2475#2:490\n2365#2,2:492\n1894#2,2:494\n2367#2,4:498\n33#3,2:278\n33#3,2:314\n33#3,2:349\n33#3,2:353\n33#3,2:363\n33#3,2:399\n33#3,2:435\n33#3,2:448\n33#3,2:471\n33#3,2:480\n33#3,2:487\n33#3,2:496\n33#3,2:503\n1#4:301\n1#4:337\n1#4:356\n1#4:386\n1#4:422\n1#4:441\n1#4:469\n1#4:486\n1#4:502\n*S KotlinDebug\n*F\n+ 1 SnapshotStateSet.kt\nandroidx/compose/runtime/snapshots/SnapshotStateSet\n*L\n62#1:269\n105#1:272,6\n105#1:280\n105#1:281\n105#1:283,9\n105#1:292\n105#1:302,6\n107#1:308,6\n107#1:316\n107#1:317\n107#1:319,9\n107#1:328\n107#1:338,6\n110#1:344\n118#1:357,6\n118#1:365\n118#1:366\n118#1:368,9\n118#1:377\n118#1:387,6\n120#1:393,6\n120#1:401\n120#1:402\n120#1:404,9\n120#1:413\n120#1:423,6\n132#1:429\n141#1:443,5\n141#1:450\n141#1:451\n141#1:453,7\n141#1:460\n141#1:470\n149#1:473\n156#1:475\n167#1:489\n176#1:491\n62#1:270\n101#1:271\n105#1:282\n105#1:293,2\n105#1:295,2\n105#1:297,4\n107#1:318\n107#1:329,2\n107#1:331,2\n107#1:333,4\n110#1:345,2\n110#1:347,2\n110#1:351,2\n110#1:355\n118#1:367\n118#1:378,2\n118#1:380,2\n118#1:382,4\n120#1:403\n120#1:414,2\n120#1:416,2\n120#1:418,4\n132#1:430\n136#1:431,2\n136#1:433,2\n136#1:437,4\n139#1:442\n141#1:452\n141#1:461,2\n141#1:463,2\n141#1:465,4\n149#1:474\n156#1:476,2\n156#1:478,2\n156#1:482,4\n167#1:490\n176#1:492,2\n176#1:494,2\n176#1:498,4\n105#1:278,2\n107#1:314,2\n110#1:349,2\n111#1:353,2\n118#1:363,2\n120#1:399,2\n136#1:435,2\n141#1:448,2\n148#1:471,2\n156#1:480,2\n166#1:487,2\n176#1:496,2\n189#1:503,2\n105#1:301\n107#1:337\n110#1:356\n118#1:386\n120#1:422\n136#1:441\n141#1:469\n156#1:486\n176#1:502\n*E\n"})
/* loaded from: classes2.dex */
public final class SnapshotStateSet<T> implements StateObject, Set<T>, RandomAccess, KMutableSet {
    public static final int $stable = 0;
    private StateRecord firstStateRecord = stateRecordWith(ExtensionsKt.persistentSetOf());

    @StabilityInferred(parameters = 0)
    @Metadata(m7879d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B!\b\u0000\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\u0014\u0010\u0016\u001a\u00020\u00022\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016R\u001a\u0010\t\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, m7880d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/snapshots/StateRecord;", "snapshotId", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "set", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "(JLandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;)V", "modification", "", "getModification$runtime_release", "()I", "setModification$runtime_release", "(I)V", "getSet$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "setSet$runtime_release", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;)V", "assign", "", "value", "create", "runtime_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
    @SourceDebugExtension({"SMAP\nSnapshotStateSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateSet.kt\nandroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,268:1\n33#2,2:269\n*S KotlinDebug\n*F\n+ 1 SnapshotStateSet.kt\nandroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord\n*L\n75#1:269,2\n*E\n"})
    public static final class StateSetStateRecord<T> extends StateRecord {
        public static final int $stable = 8;
        private int modification;
        private PersistentSet<? extends T> set;

        public StateSetStateRecord(long j6, PersistentSet<? extends T> persistentSet) {
            super(j6);
            this.set = persistentSet;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord value) {
            synchronized (SnapshotStateSetKt.sync) {
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord>");
                this.set = ((StateSetStateRecord) value).set;
                this.modification = ((StateSetStateRecord) value).modification;
                Unit unit = Unit.INSTANCE;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return new StateSetStateRecord(SnapshotKt.currentSnapshot().getSnapshotId(), this.set);
        }

        /* renamed from: getModification$runtime_release, reason: from getter */
        public final int getModification() {
            return this.modification;
        }

        public final PersistentSet<T> getSet$runtime_release() {
            return this.set;
        }

        public final void setModification$runtime_release(int i6) {
            this.modification = i6;
        }

        public final void setSet$runtime_release(PersistentSet<? extends T> persistentSet) {
            this.set = persistentSet;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create(long snapshotId) {
            return new StateSetStateRecord(snapshotId, this.set);
        }
    }

    private final boolean attemptUpdate(StateSetStateRecord<T> stateSetStateRecord, int i6, PersistentSet<? extends T> persistentSet) {
        boolean z6;
        synchronized (SnapshotStateSetKt.sync) {
            if (stateSetStateRecord.getModification() == i6) {
                stateSetStateRecord.setSet$runtime_release(persistentSet);
                z6 = true;
                stateSetStateRecord.setModification$runtime_release(stateSetStateRecord.getModification() + 1);
            } else {
                z6 = false;
            }
        }
        return z6;
    }

    private final boolean conditionalUpdate(Function1<? super PersistentSet<? extends T>, ? extends PersistentSet<? extends T>> block) {
        int modification;
        PersistentSet<T> set$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateSetKt.sync) {
                try {
                    StateRecord firstStateRecord = getFirstStateRecord();
                    Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                    StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord);
                    modification = stateSetStateRecord.getModification();
                    set$runtime_release = stateSetStateRecord.getSet$runtime_release();
                    Unit unit = Unit.INSTANCE;
                    InlineMarker.finallyStart(1);
                } catch (Throwable th) {
                    InlineMarker.finallyStart(1);
                    InlineMarker.finallyEnd(1);
                    throw th;
                }
            }
            InlineMarker.finallyEnd(1);
            Intrinsics.checkNotNull(set$runtime_release);
            PersistentSet<? extends T> persistentSetInvoke = block.invoke(set$runtime_release);
            if (Intrinsics.areEqual(persistentSetInvoke, set$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.INSTANCE.getCurrent();
                    zAttemptUpdate = attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord2, this, current), modification, persistentSetInvoke);
                    InlineMarker.finallyStart(1);
                } catch (Throwable th2) {
                    InlineMarker.finallyStart(1);
                    InlineMarker.finallyEnd(1);
                    throw th2;
                }
            }
            InlineMarker.finallyEnd(1);
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return true;
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getReadable$runtime_release$annotations() {
    }

    private final <R> R mutate(Function1<? super Set<T>, ? extends R> block) {
        int modification;
        PersistentSet<T> set$runtime_release;
        PersistentSet.Builder<T> builder;
        R rInvoke;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateSetKt.sync) {
                try {
                    StateRecord firstStateRecord = getFirstStateRecord();
                    Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                    StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord);
                    modification = stateSetStateRecord.getModification();
                    set$runtime_release = stateSetStateRecord.getSet$runtime_release();
                    Unit unit = Unit.INSTANCE;
                    InlineMarker.finallyStart(1);
                } catch (Throwable th) {
                    InlineMarker.finallyStart(1);
                    InlineMarker.finallyEnd(1);
                    throw th;
                }
            }
            InlineMarker.finallyEnd(1);
            if (set$runtime_release != null && (builder = set$runtime_release.builder()) != null) {
                rInvoke = block.invoke(builder);
                PersistentSet<? extends T> persistentSetBuild = builder.build();
                if (Intrinsics.areEqual(persistentSetBuild, set$runtime_release)) {
                    break;
                }
                StateRecord firstStateRecord2 = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) firstStateRecord2;
                synchronized (SnapshotKt.getLock()) {
                    try {
                        current = Snapshot.INSTANCE.getCurrent();
                        zAttemptUpdate = attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord2, this, current), modification, persistentSetBuild);
                        InlineMarker.finallyStart(1);
                    } catch (Throwable th2) {
                        InlineMarker.finallyStart(1);
                        InlineMarker.finallyEnd(1);
                        throw th2;
                    }
                }
                InlineMarker.finallyEnd(1);
                SnapshotKt.notifyWrite(current, this);
            } else {
                throw new IllegalStateException("No set to mutate");
            }
        } while (!zAttemptUpdate);
        return rInvoke;
    }

    private final boolean mutateBoolean(Function1<? super Set<T>, Boolean> block) {
        int modification;
        PersistentSet<T> set$runtime_release;
        PersistentSet.Builder<T> builder;
        Boolean boolInvoke;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateSetKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord);
                modification = stateSetStateRecord.getModification();
                set$runtime_release = stateSetStateRecord.getSet$runtime_release();
                Unit unit = Unit.INSTANCE;
            }
            if (set$runtime_release != null && (builder = set$runtime_release.builder()) != null) {
                boolInvoke = block.invoke(builder);
                PersistentSet<? extends T> persistentSetBuild = builder.build();
                if (Intrinsics.areEqual(persistentSetBuild, set$runtime_release)) {
                    break;
                }
                StateRecord firstStateRecord2 = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) firstStateRecord2;
                synchronized (SnapshotKt.getLock()) {
                    current = Snapshot.INSTANCE.getCurrent();
                    zAttemptUpdate = attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord2, this, current), modification, persistentSetBuild);
                }
                SnapshotKt.notifyWrite(current, this);
            } else {
                throw new IllegalStateException("No set to mutate");
            }
        } while (!zAttemptUpdate);
        return boolInvoke.booleanValue();
    }

    private final StateRecord stateRecordWith(PersistentSet<? extends T> set) {
        StateSetStateRecord stateSetStateRecord = new StateSetStateRecord(SnapshotKt.currentSnapshot().getSnapshotId(), set);
        if (Snapshot.INSTANCE.isInSnapshot()) {
            stateSetStateRecord.setNext$runtime_release(new StateSetStateRecord(SnapshotId_jvmKt.toSnapshotId(1), set));
        }
        return stateSetStateRecord;
    }

    private final <R> R withCurrent(Function1<? super StateSetStateRecord<T>, ? extends R> block) {
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return block.invoke(SnapshotKt.current((StateSetStateRecord) firstStateRecord));
    }

    private final <R> R writable(Function1<? super StateSetStateRecord<T>, ? extends R> block) {
        Snapshot current;
        R rInvoke;
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) firstStateRecord;
        synchronized (SnapshotKt.getLock()) {
            try {
                current = Snapshot.INSTANCE.getCurrent();
                rInvoke = block.invoke(SnapshotKt.writableRecord(stateSetStateRecord, this, current));
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        SnapshotKt.notifyWrite(current, this);
        return rInvoke;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(T element) {
        int modification;
        PersistentSet<T> set$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateSetKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord);
                modification = stateSetStateRecord.getModification();
                set$runtime_release = stateSetStateRecord.getSet$runtime_release();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(set$runtime_release);
            PersistentSet<? extends T> persistentSetAdd = set$runtime_release.add((PersistentSet<T>) element);
            if (Intrinsics.areEqual(persistentSetAdd, set$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                zAttemptUpdate = attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord2, this, current), modification, persistentSetAdd);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends T> elements) {
        int modification;
        PersistentSet<T> set$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateSetKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord);
                modification = stateSetStateRecord.getModification();
                set$runtime_release = stateSetStateRecord.getSet$runtime_release();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(set$runtime_release);
            PersistentSet<? extends T> persistentSetAddAll = set$runtime_release.addAll(elements);
            if (Intrinsics.areEqual(persistentSetAddAll, set$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                zAttemptUpdate = attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord2, this, current), modification, persistentSetAddAll);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        Snapshot current;
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) firstStateRecord;
        synchronized (SnapshotKt.getLock()) {
            current = Snapshot.INSTANCE.getCurrent();
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord, this, current);
            synchronized (SnapshotStateSetKt.sync) {
                stateSetStateRecord2.setSet$runtime_release(ExtensionsKt.persistentSetOf());
                stateSetStateRecord2.setModification$runtime_release(stateSetStateRecord2.getModification() + 1);
            }
        }
        SnapshotKt.notifyWrite(current, this);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object element) {
        return getReadable$runtime_release().getSet$runtime_release().contains(element);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        return getReadable$runtime_release().getSet$runtime_release().containsAll(elements);
    }

    @JvmName(name = "getDebuggerDisplayValue")
    public final Set<T> getDebuggerDisplayValue() {
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return ((StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord)).getSet$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    public final int getModification$runtime_release() {
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return ((StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord)).getModification();
    }

    public final StateSetStateRecord<T> getReadable$runtime_release() {
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return (StateSetStateRecord) SnapshotKt.readable((StateSetStateRecord) firstStateRecord, this);
    }

    public int getSize() {
        return getReadable$runtime_release().getSet$runtime_release().size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return getReadable$runtime_release().getSet$runtime_release().isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return new StateSetIterator(this, getReadable$runtime_release().getSet$runtime_release().iterator());
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord value) {
        value.setNext$runtime_release(getFirstStateRecord());
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        this.firstStateRecord = (StateSetStateRecord) value;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object element) {
        int modification;
        PersistentSet<T> set$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateSetKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord);
                modification = stateSetStateRecord.getModification();
                set$runtime_release = stateSetStateRecord.getSet$runtime_release();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(set$runtime_release);
            PersistentSet<? extends T> persistentSetRemove = set$runtime_release.remove((PersistentSet<T>) element);
            if (Intrinsics.areEqual(persistentSetRemove, set$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                zAttemptUpdate = attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord2, this, current), modification, persistentSetRemove);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        int modification;
        PersistentSet<T> set$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateSetKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord);
                modification = stateSetStateRecord.getModification();
                set$runtime_release = stateSetStateRecord.getSet$runtime_release();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(set$runtime_release);
            PersistentSet<? extends T> persistentSetRemoveAll = set$runtime_release.removeAll((Collection<? extends T>) elements);
            if (Intrinsics.areEqual(persistentSetRemoveAll, set$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                zAttemptUpdate = attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord2, this, current), modification, persistentSetRemoveAll);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(final Collection<? extends Object> elements) {
        return mutateBoolean(new Function1<Set<T>, Boolean>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateSet.retainAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Set<T> set) {
                return Boolean.valueOf(set.retainAll(CollectionsKt.toSet(elements)));
            }
        });
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public final Set<T> toSet() {
        return getReadable$runtime_release().getSet$runtime_release();
    }

    public String toString() {
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return "SnapshotStateSet(value=" + ((StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord)).getSet$runtime_release() + ")@" + hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) CollectionToArray.toArray(this, tArr);
    }
}
