package kotlinx.coroutines.internal;

import androidx.autofill.HintConstants;
import androidx.exifinterface.media.ExifInterface;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

@InternalCoroutinesApi
@Metadata(m13557d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00060\u0004j\u0002`\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\u0017\u001a\u0004\u0018\u00018\u00002!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00150\u0019¢\u0006\u0002\u0010\u001cJ\r\u0010\u001d\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u001eJ\r\u0010\u001f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u001eJ$\u0010 \u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150\u0019H\u0086\b¢\u0006\u0002\u0010\u001cJ\u0013\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00028\u0000¢\u0006\u0002\u0010$J,\u0010%\u001a\u00020\u00152\u0006\u0010#\u001a\u00028\u00002\u0014\u0010&\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00150\u0019H\u0086\b¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\u00152\u0006\u0010#\u001a\u00028\u0000¢\u0006\u0002\u0010)J\u000f\u0010*\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0002\u0010\u001eJ\u0015\u0010+\u001a\u00028\u00002\u0006\u0010,\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010-J\u0015\u0010.\u001a\u00020\"2\u0006\u0010#\u001a\u00028\u0000H\u0001¢\u0006\u0002\u0010$J\u0011\u0010/\u001a\u00020\"2\u0006\u00100\u001a\u00020\u000eH\u0082\u0010J\u0011\u00101\u001a\u00020\"2\u0006\u00100\u001a\u00020\u000eH\u0082\u0010J\u0015\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\tH\u0002¢\u0006\u0002\u00103J\u0018\u00104\u001a\u00020\"2\u0006\u00100\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u000eH\u0002R\u001a\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\t\u0010\u000b\u001a\u00020\fX\u0082\u0004R$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016¨\u00066"}, m13558d2 = {"Lkotlinx/coroutines/internal/ThreadSafeHeap;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "<init>", "()V", "a", "", "[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "_size", "Lkotlinx/atomicfu/AtomicInt;", "value", "", "size", "getSize", "()I", "setSize", "(I)V", "isEmpty", "", "()Z", "find", "predicate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "peek", "()Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "removeFirstOrNull", "removeFirstIf", "addLast", "", "node", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)V", "addLastIf", "cond", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;Lkotlin/jvm/functions/Function1;)Z", "remove", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)Z", "firstImpl", "removeAtImpl", "index", "(I)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "addImpl", "siftUpFrom", "i", "siftDownFrom", "realloc", "()[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "swap", "j", "kotlinx-coroutines-core"}, m13559k = 1, m13560mv = {2, 1, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nThreadSafeHeap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,159:1\n29#2:160\n29#2:162\n29#2:164\n29#2:166\n29#2:168\n29#2:170\n29#2:172\n16#3:161\n16#3:163\n16#3:165\n16#3:167\n16#3:169\n16#3:171\n16#3:173\n1#4:174\n*S KotlinDebug\n*F\n+ 1 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n33#1:160\n41#1:162\n43#1:164\n51#1:166\n60#1:168\n63#1:170\n72#1:172\n33#1:161\n41#1:163\n43#1:165\n51#1:167\n60#1:169\n63#1:171\n72#1:173\n*E\n"})
/* loaded from: classes5.dex */
public class ThreadSafeHeap<T extends ThreadSafeHeapNode & Comparable<? super T>> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater _size$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(ThreadSafeHeap.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    private T[] a;

    private final /* synthetic */ int get_size$volatile() {
        return this._size$volatile;
    }

    private final T[] realloc() {
        T[] tArr = this.a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new ThreadSafeHeapNode[4];
            this.a = tArr2;
            return tArr2;
        }
        if (getSize() < tArr.length) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, getSize() * 2);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        T[] tArr3 = (T[]) ((ThreadSafeHeapNode[]) objArrCopyOf);
        this.a = tArr3;
        return tArr3;
    }

    private final void setSize(int i10) {
        _size$volatile$FU.set(this, i10);
    }

    private final /* synthetic */ void set_size$volatile(int i10) {
        this._size$volatile = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void siftDownFrom(int r6) {
        /*
            r5 = this;
        L0:
            int r0 = r6 * 2
            int r1 = r0 + 1
            int r2 = r5.getSize()
            if (r1 < r2) goto Lb
            goto L3e
        Lb:
            T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>[] r2 = r5.a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r0 = r0 + 2
            int r3 = r5.getSize()
            if (r0 >= r3) goto L2b
            r3 = r2[r0]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L2b
            goto L2c
        L2b:
            r0 = r1
        L2c:
            r1 = r2[r6]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L3f
        L3e:
            return
        L3f:
            r5.swap(r6, r0)
            r6 = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.ThreadSafeHeap.siftDownFrom(int):void");
    }

    private final void siftUpFrom(int i10) {
        while (i10 > 0) {
            T[] tArr = this.a;
            Intrinsics.checkNotNull(tArr);
            int i11 = (i10 - 1) / 2;
            T t10 = tArr[i11];
            Intrinsics.checkNotNull(t10);
            T t11 = tArr[i10];
            Intrinsics.checkNotNull(t11);
            if (((Comparable) t10).compareTo(t11) <= 0) {
                return;
            }
            swap(i10, i11);
            i10 = i11;
        }
    }

    private final void swap(int i10, int j10) {
        T[] tArr = this.a;
        Intrinsics.checkNotNull(tArr);
        T t10 = tArr[j10];
        Intrinsics.checkNotNull(t10);
        T t11 = tArr[i10];
        Intrinsics.checkNotNull(t11);
        tArr[i10] = t10;
        tArr[j10] = t11;
        t10.setIndex(i10);
        t11.setIndex(j10);
    }

    @PublishedApi
    public final void addImpl(T node) {
        node.setHeap(this);
        ThreadSafeHeapNode[] threadSafeHeapNodeArrRealloc = realloc();
        int size = getSize();
        setSize(size + 1);
        threadSafeHeapNodeArrRealloc[size] = node;
        node.setIndex(size);
        siftUpFrom(size);
    }

    public final void addLast(T node) {
        synchronized (this) {
            addImpl(node);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean addLastIf(T node, Function1<? super T, Boolean> cond) {
        boolean z9;
        synchronized (this) {
            try {
                if (cond.invoke(firstImpl()).booleanValue()) {
                    addImpl(node);
                    z9 = true;
                } else {
                    z9 = false;
                }
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        return z9;
    }

    public final T find(Function1<? super T, Boolean> predicate) {
        T t10;
        synchronized (this) {
            try {
                int size = getSize();
                int i10 = 0;
                while (true) {
                    t10 = null;
                    if (i10 >= size) {
                        break;
                    }
                    T[] tArr = this.a;
                    if (tArr != null) {
                        t10 = (Object) tArr[i10];
                    }
                    Intrinsics.checkNotNull(t10);
                    if (predicate.invoke(t10).booleanValue()) {
                        break;
                    }
                    i10++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t10;
    }

    @PublishedApi
    public final T firstImpl() {
        T[] tArr = this.a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int getSize() {
        return _size$volatile$FU.get(this);
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final T peek() {
        T t10;
        synchronized (this) {
            t10 = (T) firstImpl();
        }
        return t10;
    }

    public final boolean remove(T node) {
        boolean z9;
        synchronized (this) {
            if (node.getHeap() == null) {
                z9 = false;
            } else {
                removeAtImpl(node.getIndex());
                z9 = true;
            }
        }
        return z9;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    @kotlin.PublishedApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T removeAtImpl(int r6) {
        /*
            r5 = this;
            T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>[] r0 = r5.a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r5.getSize()
            r2 = -1
            int r1 = r1 + r2
            r5.setSize(r1)
            int r1 = r5.getSize()
            if (r6 >= r1) goto L3d
            int r1 = r5.getSize()
            r5.swap(r6, r1)
            int r1 = r6 + (-1)
            int r1 = r1 / 2
            if (r6 <= 0) goto L3a
            r3 = r0[r6]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L3a
            r5.swap(r6, r1)
            r5.siftUpFrom(r1)
            goto L3d
        L3a:
            r5.siftDownFrom(r6)
        L3d:
            int r6 = r5.getSize()
            r6 = r0[r6]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            r1 = 0
            r6.setHeap(r1)
            r6.setIndex(r2)
            int r2 = r5.getSize()
            r0[r2] = r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.ThreadSafeHeap.removeAtImpl(int):kotlinx.coroutines.internal.ThreadSafeHeapNode");
    }

    public final T removeFirstIf(Function1<? super T, Boolean> predicate) {
        synchronized (this) {
            try {
                ThreadSafeHeapNode threadSafeHeapNodeFirstImpl = firstImpl();
                T t10 = null;
                if (threadSafeHeapNodeFirstImpl == null) {
                    InlineMarker.finallyStart(2);
                    InlineMarker.finallyEnd(2);
                    return null;
                }
                if (predicate.invoke(threadSafeHeapNodeFirstImpl).booleanValue()) {
                    t10 = (T) removeAtImpl(0);
                }
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                return t10;
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
    }

    public final T removeFirstOrNull() {
        T t10;
        synchronized (this) {
            t10 = getSize() > 0 ? (T) removeAtImpl(0) : null;
        }
        return t10;
    }
}
