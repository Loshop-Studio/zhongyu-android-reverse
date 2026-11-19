package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.AbstractC5829j;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;
import p160s6.InterfaceC6565f;

@Metadata(m5109d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005:\u0001LB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010\u0013J\u001d\u0010!\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b!\u0010\u0017J\u000f\u0010\"\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010\u0007J\u0017\u0010#\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b#\u0010\u0013J\u001d\u0010$\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b$\u0010\u0017J\u001d\u0010%\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b%\u0010\u0017J5\u0010+\u001a\u00028\u0001\"\u0004\b\u0001\u0010&2\u001d\u0010*\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(\u0012\u0004\u0012\u00028\u00010'¢\u0006\u0002\b)H\u0082\b¢\u0006\u0004\b+\u0010,J5\u0010-\u001a\u00028\u0001\"\u0004\b\u0001\u0010&2\u001d\u0010*\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(\u0012\u0004\u0012\u00028\u00010'¢\u0006\u0002\b)H\u0082\b¢\u0006\u0004\b-\u0010,J)\u0010.\u001a\u00020\u00112\u0018\u0010*\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00110'H\u0002¢\u0006\u0004\b.\u0010/J0\u00100\u001a\u00028\u0001\"\u0004\b\u0001\u0010&2\u0018\u0010*\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00028\u00010'H\u0082\b¢\u0006\u0004\b0\u0010,J0\u00102\u001a\u00020\u00112\u001e\u0010*\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000010'H\u0082\b¢\u0006\u0004\b2\u0010/J/\u00106\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00028\u00000(2\u0006\u00104\u001a\u0002032\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u000001H\u0002¢\u0006\u0004\b6\u00107J\u001d\u00109\u001a\u00020\b2\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u000001H\u0002¢\u0006\u0004\b9\u0010:R$\u0010<\u001a\u00020\b2\u0006\u0010;\u001a\u00020\b8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0014\u0010B\u001a\u0002038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR \u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000(8@X\u0080\u0004¢\u0006\f\u0012\u0004\bE\u0010\u0007\u001a\u0004\bC\u0010DR\u0014\u0010H\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010AR \u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\r8AX\u0080\u0004¢\u0006\f\u0012\u0004\bJ\u0010\u0007\u001a\u0004\bI\u0010\u000f¨\u0006M"}, m5110d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateSet;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/snapshots/StateObject;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "<init>", "()V", "Landroidx/compose/runtime/snapshots/StateRecord;", "value", "Ld6/s;", "prependStateRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "", "toSet", "()Ljava/util/Set;", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "toString", "()Ljava/lang/String;", "add", "addAll", "clear", "remove", "removeAll", "retainAll", "R", "Lkotlin/Function1;", "Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;", "Lkotlin/ExtensionFunctionType;", "block", "writable", "(Lr6/c;)Ljava/lang/Object;", "withCurrent", "mutateBoolean", "(Lr6/c;)Z", "mutate", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "conditionalUpdate", "", "currentModification", "newSet", "attemptUpdate", "(Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;)Z", "set", "stateRecordWith", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;)Landroidx/compose/runtime/snapshots/StateRecord;", "<set-?>", "firstStateRecord", "Landroidx/compose/runtime/snapshots/StateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "getModification$runtime_release", "()I", "modification", "getReadable$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;", "getReadable$runtime_release$annotations", "readable", "getSize", "size", "getDebuggerDisplayValue", "getDebuggerDisplayValue$annotations", "debuggerDisplayValue", "StateSetStateRecord", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Stable
@SourceDebugExtension({"SMAP\nSnapshotStateSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateSet.kt\nandroidx/compose/runtime/snapshots/SnapshotStateSet\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,268:1\n139#1:269\n161#1,6:272\n167#1:280\n139#1:281\n168#1,9:283\n136#1:292\n177#1,6:302\n161#1,6:308\n167#1:316\n139#1:317\n168#1,9:319\n136#1:328\n177#1,6:338\n136#1:344\n161#1,6:357\n167#1:365\n139#1:366\n168#1,9:368\n136#1:377\n177#1,6:387\n161#1,6:393\n167#1:401\n139#1:402\n168#1,9:404\n136#1:413\n177#1,6:423\n139#1:429\n144#1,5:443\n149#1:450\n139#1:451\n150#1,7:453\n136#1:460\n158#1:470\n139#1:473\n136#1:475\n139#1:489\n136#1:491\n2475#2:270\n2475#2:271\n2475#2:282\n2365#2,2:293\n1894#2,2:295\n2367#2,4:297\n2475#2:318\n2365#2,2:329\n1894#2,2:331\n2367#2,4:333\n2365#2,2:345\n1894#2,2:347\n2367#2,2:351\n2370#2:355\n2475#2:367\n2365#2,2:378\n1894#2,2:380\n2367#2,4:382\n2475#2:403\n2365#2,2:414\n1894#2,2:416\n2367#2,4:418\n2475#2:430\n2365#2,2:431\n1894#2,2:433\n2367#2,4:437\n2475#2:442\n2475#2:452\n2365#2,2:461\n1894#2,2:463\n2367#2,4:465\n2475#2:474\n2365#2,2:476\n1894#2,2:478\n2367#2,4:482\n2475#2:490\n2365#2,2:492\n1894#2,2:494\n2367#2,4:498\n33#3,2:278\n33#3,2:314\n33#3,2:349\n33#3,2:353\n33#3,2:363\n33#3,2:399\n33#3,2:435\n33#3,2:448\n33#3,2:471\n33#3,2:480\n33#3,2:487\n33#3,2:496\n33#3,2:503\n1#4:301\n1#4:337\n1#4:356\n1#4:386\n1#4:422\n1#4:441\n1#4:469\n1#4:486\n1#4:502\n*S KotlinDebug\n*F\n+ 1 SnapshotStateSet.kt\nandroidx/compose/runtime/snapshots/SnapshotStateSet\n*L\n62#1:269\n105#1:272,6\n105#1:280\n105#1:281\n105#1:283,9\n105#1:292\n105#1:302,6\n107#1:308,6\n107#1:316\n107#1:317\n107#1:319,9\n107#1:328\n107#1:338,6\n110#1:344\n118#1:357,6\n118#1:365\n118#1:366\n118#1:368,9\n118#1:377\n118#1:387,6\n120#1:393,6\n120#1:401\n120#1:402\n120#1:404,9\n120#1:413\n120#1:423,6\n132#1:429\n141#1:443,5\n141#1:450\n141#1:451\n141#1:453,7\n141#1:460\n141#1:470\n149#1:473\n156#1:475\n167#1:489\n176#1:491\n62#1:270\n101#1:271\n105#1:282\n105#1:293,2\n105#1:295,2\n105#1:297,4\n107#1:318\n107#1:329,2\n107#1:331,2\n107#1:333,4\n110#1:345,2\n110#1:347,2\n110#1:351,2\n110#1:355\n118#1:367\n118#1:378,2\n118#1:380,2\n118#1:382,4\n120#1:403\n120#1:414,2\n120#1:416,2\n120#1:418,4\n132#1:430\n136#1:431,2\n136#1:433,2\n136#1:437,4\n139#1:442\n141#1:452\n141#1:461,2\n141#1:463,2\n141#1:465,4\n149#1:474\n156#1:476,2\n156#1:478,2\n156#1:482,4\n167#1:490\n176#1:492,2\n176#1:494,2\n176#1:498,4\n105#1:278,2\n107#1:314,2\n110#1:349,2\n111#1:353,2\n118#1:363,2\n120#1:399,2\n136#1:435,2\n141#1:448,2\n148#1:471,2\n156#1:480,2\n166#1:487,2\n176#1:496,2\n189#1:503,2\n105#1:301\n107#1:337\n110#1:356\n118#1:386\n120#1:422\n136#1:441\n141#1:469\n156#1:486\n176#1:502\n*E\n"})
/* loaded from: classes.dex */
public final class SnapshotStateSet<T> implements StateObject, Set<T>, RandomAccess, InterfaceC6565f {
    public static final int $stable = 0;

    @NotNull
    private StateRecord firstStateRecord = stateRecordWith(ExtensionsKt.persistentSetOf());

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B#\b\u0000\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u000e\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u0010R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m5110d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/snapshots/StateRecord;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "set", "<init>", "(JLandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;)V", "value", "Ld6/s;", "assign", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "create", "()Landroidx/compose/runtime/snapshots/StateRecord;", "(J)Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "getSet$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "setSet$runtime_release", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;)V", "", "modification", "I", "getModification$runtime_release", "()I", "setModification$runtime_release", "(I)V", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nSnapshotStateSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateSet.kt\nandroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,268:1\n33#2,2:269\n*S KotlinDebug\n*F\n+ 1 SnapshotStateSet.kt\nandroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord\n*L\n75#1:269,2\n*E\n"})
    public static final class StateSetStateRecord<T> extends StateRecord {
        public static final int $stable = 8;
        private int modification;

        @NotNull
        private PersistentSet<? extends T> set;

        public StateSetStateRecord(long j7, @NotNull PersistentSet<? extends T> persistentSet) {
            super(j7);
            this.set = persistentSet;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@NotNull StateRecord value) {
            synchronized (SnapshotStateSetKt.sync) {
                AbstractC5830k.m5328e(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord>");
                this.set = ((StateSetStateRecord) value).set;
                this.modification = ((StateSetStateRecord) value).modification;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @NotNull
        public StateRecord create() {
            return new StateSetStateRecord(SnapshotKt.currentSnapshot().getSnapshotId(), this.set);
        }

        /* renamed from: getModification$runtime_release, reason: from getter */
        public final int getModification() {
            return this.modification;
        }

        @NotNull
        public final PersistentSet<T> getSet$runtime_release() {
            return this.set;
        }

        public final void setModification$runtime_release(int i) {
            this.modification = i;
        }

        public final void setSet$runtime_release(@NotNull PersistentSet<? extends T> persistentSet) {
            this.set = persistentSet;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @NotNull
        public StateRecord create(long snapshotId) {
            return new StateSetStateRecord(snapshotId, this.set);
        }
    }

    private final boolean attemptUpdate(StateSetStateRecord<T> stateSetStateRecord, int i, PersistentSet<? extends T> persistentSet) {
        boolean z8;
        synchronized (SnapshotStateSetKt.sync) {
            if (stateSetStateRecord.getModification() == i) {
                stateSetStateRecord.setSet$runtime_release(persistentSet);
                z8 = true;
                stateSetStateRecord.setModification$runtime_release(stateSetStateRecord.getModification() + 1);
            } else {
                z8 = false;
            }
        }
        return z8;
    }

    private final boolean conditionalUpdate(InterfaceC6471c block) {
        int modification;
        PersistentSet<T> set$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateSetKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord);
                modification = stateSetStateRecord.getModification();
                set$runtime_release = stateSetStateRecord.getSet$runtime_release();
            }
            AbstractC5830k.m5327d(set$runtime_release);
            PersistentSet<? extends T> persistentSet = (PersistentSet) block.invoke(set$runtime_release);
            if (AbstractC5830k.m5325b(persistentSet, set$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC5830k.m5328e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                zAttemptUpdate = attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord2, this, current), modification, persistentSet);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return true;
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getReadable$runtime_release$annotations() {
    }

    private final <R> R mutate(InterfaceC6471c block) {
        int modification;
        PersistentSet<T> set$runtime_release;
        PersistentSet.Builder<T> builder;
        R r;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateSetKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord);
                modification = stateSetStateRecord.getModification();
                set$runtime_release = stateSetStateRecord.getSet$runtime_release();
            }
            if (set$runtime_release != null && (builder = set$runtime_release.builder()) != null) {
                r = (R) block.invoke(builder);
                PersistentSet<? extends T> persistentSetBuild = builder.build();
                if (AbstractC5830k.m5325b(persistentSetBuild, set$runtime_release)) {
                    break;
                }
                StateRecord firstStateRecord2 = getFirstStateRecord();
                AbstractC5830k.m5328e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
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
        return r;
    }

    private final boolean mutateBoolean(InterfaceC6471c block) {
        int modification;
        PersistentSet<T> set$runtime_release;
        PersistentSet.Builder<T> builder;
        Object objInvoke;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateSetKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord);
                modification = stateSetStateRecord.getModification();
                set$runtime_release = stateSetStateRecord.getSet$runtime_release();
            }
            if (set$runtime_release != null && (builder = set$runtime_release.builder()) != null) {
                objInvoke = block.invoke(builder);
                PersistentSet<? extends T> persistentSetBuild = builder.build();
                if (AbstractC5830k.m5325b(persistentSetBuild, set$runtime_release)) {
                    break;
                }
                StateRecord firstStateRecord2 = getFirstStateRecord();
                AbstractC5830k.m5328e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
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
        return ((Boolean) objInvoke).booleanValue();
    }

    private final StateRecord stateRecordWith(PersistentSet<? extends T> set) {
        StateSetStateRecord stateSetStateRecord = new StateSetStateRecord(SnapshotKt.currentSnapshot().getSnapshotId(), set);
        if (Snapshot.INSTANCE.isInSnapshot()) {
            stateSetStateRecord.setNext$runtime_release(new StateSetStateRecord(SnapshotId_jvmKt.toSnapshotId(1), set));
        }
        return stateSetStateRecord;
    }

    private final <R> R withCurrent(InterfaceC6471c block) {
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return (R) block.invoke(SnapshotKt.current((StateSetStateRecord) firstStateRecord));
    }

    private final <R> R writable(InterfaceC6471c block) {
        Snapshot current;
        R r;
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) firstStateRecord;
        synchronized (SnapshotKt.getLock()) {
            current = Snapshot.INSTANCE.getCurrent();
            r = (R) block.invoke(SnapshotKt.writableRecord(stateSetStateRecord, this, current));
        }
        SnapshotKt.notifyWrite(current, this);
        return r;
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
                AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord);
                modification = stateSetStateRecord.getModification();
                set$runtime_release = stateSetStateRecord.getSet$runtime_release();
            }
            AbstractC5830k.m5327d(set$runtime_release);
            PersistentSet<? extends T> persistentSetAdd = set$runtime_release.add((PersistentSet<T>) element);
            if (AbstractC5830k.m5325b(persistentSetAdd, set$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC5830k.m5328e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
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
    public boolean addAll(@NotNull Collection<? extends T> elements) {
        int modification;
        PersistentSet<T> set$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateSetKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord);
                modification = stateSetStateRecord.getModification();
                set$runtime_release = stateSetStateRecord.getSet$runtime_release();
            }
            AbstractC5830k.m5327d(set$runtime_release);
            PersistentSet<? extends T> persistentSetAddAll = set$runtime_release.addAll(elements);
            if (AbstractC5830k.m5325b(persistentSetAddAll, set$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC5830k.m5328e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
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
        AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
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
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        return getReadable$runtime_release().getSet$runtime_release().containsAll(elements);
    }

    @JvmName(name = "getDebuggerDisplayValue")
    @NotNull
    public final Set<T> getDebuggerDisplayValue() {
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return ((StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord)).getSet$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @NotNull
    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    public final int getModification$runtime_release() {
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return ((StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord)).getModification();
    }

    @NotNull
    public final StateSetStateRecord<T> getReadable$runtime_release() {
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
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
    @NotNull
    public Iterator<T> iterator() {
        return new StateSetIterator(this, getReadable$runtime_release().getSet$runtime_release().iterator());
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@NotNull StateRecord value) {
        value.setNext$runtime_release(getFirstStateRecord());
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
                AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord);
                modification = stateSetStateRecord.getModification();
                set$runtime_release = stateSetStateRecord.getSet$runtime_release();
            }
            AbstractC5830k.m5327d(set$runtime_release);
            PersistentSet<? extends T> persistentSetRemove = set$runtime_release.remove((PersistentSet<T>) element);
            if (AbstractC5830k.m5325b(persistentSetRemove, set$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC5830k.m5328e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
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
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        int modification;
        PersistentSet<T> set$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateSetKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord);
                modification = stateSetStateRecord.getModification();
                set$runtime_release = stateSetStateRecord.getSet$runtime_release();
            }
            AbstractC5830k.m5327d(set$runtime_release);
            PersistentSet<? extends T> persistentSetRemoveAll = set$runtime_release.removeAll((Collection<? extends T>) elements);
            if (AbstractC5830k.m5325b(persistentSetRemoveAll, set$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC5830k.m5328e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
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
    public boolean retainAll(@NotNull final Collection<? extends Object> elements) {
        return mutateBoolean(new InterfaceC6471c() { // from class: androidx.compose.runtime.snapshots.SnapshotStateSet.retainAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public final Boolean invoke(Set<T> set) {
                return Boolean.valueOf(set.retainAll(AbstractC5805t.m5221H0(elements)));
            }
        });
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return AbstractC5829j.m5322a(this);
    }

    @NotNull
    public final Set<T> toSet() {
        return getReadable$runtime_release().getSet$runtime_release();
    }

    @NotNull
    public String toString() {
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return "SnapshotStateSet(value=" + ((StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord)).getSet$runtime_release() + ")@" + hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) AbstractC5829j.m5323b(this, tArr);
    }
}
