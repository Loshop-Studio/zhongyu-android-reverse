package kotlinx.coroutines.internal;

import androidx.autofill.HintConstants;
import androidx.camera.view.AbstractC0908q;
import androidx.concurrent.futures.AbstractC3152a;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import p140i8.AbstractC8151a;

@Metadata(m13412d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001ag\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\u0002H\u00022\u0006\u0010\u0004\u001a\u00020\u000526\u0010\u0006\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u0002H\u00020\u0007H\u0000¢\u0006\u0002\u0010\u000b\u001a+\u0010\f\u001a\u00020\r\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\u0002H\u0080\b\u001as\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u0002H\u000228\b\b\u0010\u0006\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u0002H\u00020\u0007H\u0080\b\u001a!\u0010\u0012\u001a\u0002H\u0013\"\u000e\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00130\u0014*\u0002H\u0013H\u0000¢\u0006\u0002\u0010\u0015\u001a8\u0010\u0016\u001a\u00020\r*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\r0\u001bH\u0082\b\"\u000e\u0010\u001d\u001a\u00020\u0019X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m13413d2 = {"findSegmentInternal", "Lkotlinx/coroutines/internal/SegmentOrClosed;", ExifInterface.LATITUDE_SOUTH, "Lkotlinx/coroutines/internal/Segment;", "id", "", "createNewSegment", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "prev", "(Lkotlinx/coroutines/internal/Segment;JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "moveForward", "", "Lkotlinx/atomicfu/AtomicRef;", TypedValues.TransitionType.S_TO, "findSegmentAndMoveForward", "startFrom", "close", "N", "Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "addConditionally", "Lkotlinx/atomicfu/AtomicInt;", "delta", "", "condition", "Lkotlin/Function1;", "cur", "POINTERS_SHIFT", "CLOSED", "Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, m13414k = 2, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 2 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n*L\n1#1,265:1\n42#1,8:280\n103#2,7:266\n103#2,7:273\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n*L\n70#1:280,8\n23#1:266,7\n81#1:273,7\n*E\n"})
/* loaded from: classes5.dex */
public final class ConcurrentLinkedListKt {
    private static final Symbol CLOSED = new Symbol("CLOSED");
    private static final int POINTERS_SHIFT = 16;

    private static final /* synthetic */ boolean addConditionally$atomicfu$ATOMIC_ARRAY$Int(AtomicIntegerArray atomicIntegerArray, int i9, int i10, Function1<? super Integer, Boolean> function1) {
        int i11;
        do {
            i11 = atomicIntegerArray.get(i9);
            if (!function1.invoke(Integer.valueOf(i11)).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerArray.compareAndSet(i9, i11, i11 + i10));
        return true;
    }

    private static final /* synthetic */ boolean addConditionally$atomicfu$ATOMIC_FIELD_UPDATER$Int(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Object obj, int i9, Function1<? super Integer, Boolean> function1) {
        int i10;
        do {
            i10 = atomicIntegerFieldUpdater.get(obj);
            if (!function1.invoke(Integer.valueOf(i10)).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i10, i10 + i9));
        return true;
    }

    private static final /* synthetic */ boolean addConditionally$atomicfu$BOXED_ATOMIC$Int(AtomicInteger atomicInteger, int i9, Function1<? super Integer, Boolean> function1) {
        int i10;
        do {
            i10 = atomicInteger.get();
            if (!function1.invoke(Integer.valueOf(i10)).booleanValue()) {
                return false;
            }
        } while (!atomicInteger.compareAndSet(i10, i10 + i9));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlinx.coroutines.internal.ConcurrentLinkedListNode] */
    public static final <N extends ConcurrentLinkedListNode<N>> N close(N n9) {
        while (true) {
            Object nextOrClosed = n9.getNextOrClosed();
            if (nextOrClosed == CLOSED) {
                return n9;
            }
            ?? r02 = (ConcurrentLinkedListNode) nextOrClosed;
            if (r02 != 0) {
                n9 = r02;
            } else if (n9.markAsClosed()) {
                return n9;
            }
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> Object findSegmentAndMoveForward$atomicfu$ATOMIC_ARRAY$Any(AtomicReferenceArray atomicReferenceArray, int i9, long j9, S s9, Function2<? super Long, ? super S, ? extends S> function2) {
        while (true) {
            Object objFindSegmentInternal = findSegmentInternal(s9, j9, function2);
            if (SegmentOrClosed.m26298isClosedimpl(objFindSegmentInternal)) {
                return objFindSegmentInternal;
            }
            Segment segmentM26296getSegmentimpl = SegmentOrClosed.m26296getSegmentimpl(objFindSegmentInternal);
            while (true) {
                Segment segment = (Segment) atomicReferenceArray.get(i9);
                if (segment.id >= segmentM26296getSegmentimpl.id) {
                    return objFindSegmentInternal;
                }
                if (!segmentM26296getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                if (AbstractC8151a.m13080a(atomicReferenceArray, i9, segment, segmentM26296getSegmentimpl)) {
                    if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                    return objFindSegmentInternal;
                }
                if (segmentM26296getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                    segmentM26296getSegmentimpl.remove();
                }
            }
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> Object findSegmentAndMoveForward$atomicfu$ATOMIC_FIELD_UPDATER$Any(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, long j9, S s9, Function2<? super Long, ? super S, ? extends S> function2) {
        while (true) {
            Object objFindSegmentInternal = findSegmentInternal(s9, j9, function2);
            if (SegmentOrClosed.m26298isClosedimpl(objFindSegmentInternal)) {
                return objFindSegmentInternal;
            }
            Segment segmentM26296getSegmentimpl = SegmentOrClosed.m26296getSegmentimpl(objFindSegmentInternal);
            while (true) {
                Segment segment = (Segment) atomicReferenceFieldUpdater.get(obj);
                if (segment.id >= segmentM26296getSegmentimpl.id) {
                    return objFindSegmentInternal;
                }
                if (!segmentM26296getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                if (AbstractC3152a.m1323a(atomicReferenceFieldUpdater, obj, segment, segmentM26296getSegmentimpl)) {
                    if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                    return objFindSegmentInternal;
                }
                if (segmentM26296getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                    segmentM26296getSegmentimpl.remove();
                }
            }
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> Object findSegmentAndMoveForward$atomicfu$BOXED_ATOMIC$Any(AtomicReference atomicReference, long j9, S s9, Function2<? super Long, ? super S, ? extends S> function2) {
        while (true) {
            Object objFindSegmentInternal = findSegmentInternal(s9, j9, function2);
            if (SegmentOrClosed.m26298isClosedimpl(objFindSegmentInternal)) {
                return objFindSegmentInternal;
            }
            Segment segmentM26296getSegmentimpl = SegmentOrClosed.m26296getSegmentimpl(objFindSegmentInternal);
            while (true) {
                Segment segment = (Segment) atomicReference.get();
                if (segment.id >= segmentM26296getSegmentimpl.id) {
                    return objFindSegmentInternal;
                }
                if (!segmentM26296getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                if (AbstractC0908q.m812a(atomicReference, segment, segmentM26296getSegmentimpl)) {
                    if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                    return objFindSegmentInternal;
                }
                if (segmentM26296getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                    segmentM26296getSegmentimpl.remove();
                }
            }
        }
    }

    public static final <S extends Segment<S>> Object findSegmentInternal(S s9, long j9, Function2<? super Long, ? super S, ? extends S> function2) {
        while (true) {
            if (s9.id >= j9 && !s9.isRemoved()) {
                return SegmentOrClosed.m26293constructorimpl(s9);
            }
            Object nextOrClosed = s9.getNextOrClosed();
            if (nextOrClosed == CLOSED) {
                return SegmentOrClosed.m26293constructorimpl(CLOSED);
            }
            S sInvoke = (S) ((ConcurrentLinkedListNode) nextOrClosed);
            if (sInvoke == null) {
                sInvoke = function2.invoke(Long.valueOf(s9.id + 1), s9);
                if (s9.trySetNext(sInvoke)) {
                    if (s9.isRemoved()) {
                        s9.remove();
                    }
                }
            }
            s9 = sInvoke;
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> boolean moveForward$atomicfu$ATOMIC_ARRAY$Any(AtomicReferenceArray atomicReferenceArray, int i9, S s9) {
        while (true) {
            Segment segment = (Segment) atomicReferenceArray.get(i9);
            if (segment.id >= s9.id) {
                return true;
            }
            if (!s9.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            if (AbstractC8151a.m13080a(atomicReferenceArray, i9, segment, s9)) {
                if (segment.decPointers$kotlinx_coroutines_core()) {
                    segment.remove();
                }
                return true;
            }
            if (s9.decPointers$kotlinx_coroutines_core()) {
                s9.remove();
            }
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> boolean moveForward$atomicfu$ATOMIC_FIELD_UPDATER$Any(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, S s9) {
        while (true) {
            Segment segment = (Segment) atomicReferenceFieldUpdater.get(obj);
            if (segment.id >= s9.id) {
                return true;
            }
            if (!s9.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            if (AbstractC3152a.m1323a(atomicReferenceFieldUpdater, obj, segment, s9)) {
                if (segment.decPointers$kotlinx_coroutines_core()) {
                    segment.remove();
                }
                return true;
            }
            if (s9.decPointers$kotlinx_coroutines_core()) {
                s9.remove();
            }
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> boolean moveForward$atomicfu$BOXED_ATOMIC$Any(AtomicReference atomicReference, S s9) {
        while (true) {
            Segment segment = (Segment) atomicReference.get();
            if (segment.id >= s9.id) {
                return true;
            }
            if (!s9.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            if (AbstractC0908q.m812a(atomicReference, segment, s9)) {
                if (segment.decPointers$kotlinx_coroutines_core()) {
                    segment.remove();
                }
                return true;
            }
            if (s9.decPointers$kotlinx_coroutines_core()) {
                s9.remove();
            }
        }
    }
}
