package kotlinx.coroutines.internal;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata(m13557d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0004H\u0082\bJ\r\u0010\u000e\u001a\u00020\u000f*\u00020\u0004H\u0082\bJ\u0006\u0010\u0010\u001a\u00020\u000fJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012J\r\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0015J\b\u0010\u0016\u001a\u00020\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\t\u0010\t\u001a\u00020\nX\u0082\u0004R\u0011\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\fX\u0082\u0004¨\u0006\u0017"}, m13558d2 = {"Lkotlinx/coroutines/internal/OnDemandAllocatingPool;", ExifInterface.GPS_DIRECTION_TRUE, "", "maxCapacity", "", "create", "Lkotlin/Function1;", "<init>", "(ILkotlin/jvm/functions/Function1;)V", "controlState", "Lkotlinx/atomicfu/AtomicInt;", "elements", "Lkotlinx/atomicfu/AtomicArray;", "tryForbidNewElements", "isClosed", "", "allocate", "close", "", "stateRepresentation", "", "stateRepresentation$kotlinx_coroutines_core", "toString", "kotlinx-coroutines-core"}, m13559k = 1, m13560mv = {2, 1, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nOnDemandAllocatingPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPool\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPoolKt\n*L\n1#1,103:1\n37#1:104\n37#1:105\n28#1,10:106\n37#1:126\n1557#2:116\n1628#2,2:117\n1630#2:121\n1557#2:122\n1628#2,3:123\n97#3,2:119\n*S KotlinDebug\n*F\n+ 1 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPool\n*L\n31#1:104\n50#1:105\n72#1:106,10\n88#1:126\n73#1:116\n73#1:117,2\n73#1:121\n87#1:122\n87#1:123,3\n75#1:119,2\n*E\n"})
/* loaded from: classes5.dex */
public final class OnDemandAllocatingPool<T> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater controlState$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(OnDemandAllocatingPool.class, "controlState$volatile");
    private volatile /* synthetic */ int controlState$volatile;
    private final Function1<Integer, T> create;
    private final /* synthetic */ AtomicReferenceArray elements;
    private final int maxCapacity;

    /* JADX WARN: Multi-variable type inference failed */
    public OnDemandAllocatingPool(int i10, Function1<? super Integer, ? extends T> function1) {
        this.maxCapacity = i10;
        this.create = function1;
        this.elements = new AtomicReferenceArray(i10);
    }

    private final /* synthetic */ int getControlState$volatile() {
        return this.controlState$volatile;
    }

    private final /* synthetic */ AtomicReferenceArray getElements() {
        return this.elements;
    }

    private final boolean isClosed(int i10) {
        return (i10 & Integer.MIN_VALUE) != 0;
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Int(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Object obj, Function1<? super Integer, Unit> function1) {
        while (true) {
            function1.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final /* synthetic */ void setControlState$volatile(int i10) {
        this.controlState$volatile = i10;
    }

    private final int tryForbidNewElements() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = controlState$volatile$FU;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & Integer.MIN_VALUE) != 0) {
                return 0;
            }
        } while (!controlState$volatile$FU.compareAndSet(this, i10, Integer.MIN_VALUE | i10));
        return i10;
    }

    public final boolean allocate() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = controlState$volatile$FU;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((Integer.MIN_VALUE & i10) != 0) {
                return false;
            }
            if (i10 >= this.maxCapacity) {
                return true;
            }
        } while (!controlState$volatile$FU.compareAndSet(this, i10, i10 + 1));
        getElements().set(i10, this.create.invoke(Integer.valueOf(i10)));
        return true;
    }

    public final List<T> close() {
        int i10;
        Object andSet;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = controlState$volatile$FU;
        while (true) {
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & Integer.MIN_VALUE) != 0) {
                i10 = 0;
                break;
            }
            if (controlState$volatile$FU.compareAndSet(this, i10, Integer.MIN_VALUE | i10)) {
                break;
            }
        }
        IntRange intRangeUntil = RangesKt.until(0, i10);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            do {
                andSet = getElements().getAndSet(iNextInt, null);
            } while (andSet == null);
            arrayList.add(andSet);
        }
        return arrayList;
    }

    public final String stateRepresentation$kotlinx_coroutines_core() {
        int i10 = controlState$volatile$FU.get(this);
        IntRange intRangeUntil = RangesKt.until(0, Integer.MAX_VALUE & i10);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(getElements().get(((IntIterator) it).nextInt()));
        }
        return arrayList.toString() + ((i10 & Integer.MIN_VALUE) != 0 ? "[closed]" : "");
    }

    public String toString() {
        return "OnDemandAllocatingPool(" + stateRepresentation$kotlinx_coroutines_core() + ')';
    }
}
