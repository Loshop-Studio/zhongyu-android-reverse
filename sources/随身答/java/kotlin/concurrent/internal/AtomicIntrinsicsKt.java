package kotlin.concurrent.internal;

import androidx.camera.view.AbstractC0908q;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import p140i8.AbstractC8151a;

@Metadata(m13412d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0001\u001a\u001c\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001a\u001c\u0010\u0000\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0001\u001a-\u0010\u0000\u001a\u0002H\t\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\n2\u0006\u0010\u0003\u001a\u0002H\t2\u0006\u0010\u0004\u001a\u0002H\tH\u0001¢\u0006\u0002\u0010\u000b\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\f2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0001\u001a$\u0010\u0000\u001a\u00020\u0005*\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001a5\u0010\u0000\u001a\u0002H\t\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\u000f2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\t2\u0006\u0010\u0004\u001a\u0002H\tH\u0001¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, m13413d2 = {"compareAndExchange", "", "Ljava/util/concurrent/atomic/AtomicInteger;", "expected", "newValue", "", "Ljava/util/concurrent/atomic/AtomicLong;", "", "Ljava/util/concurrent/atomic/AtomicBoolean;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/concurrent/atomic/AtomicReference;", "(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicIntegerArray;", "index", "Ljava/util/concurrent/atomic/AtomicLongArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "(Ljava/util/concurrent/atomic/AtomicReferenceArray;ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, m13414k = 2, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class AtomicIntrinsicsKt {
    @SinceKotlin(version = "2.1")
    @PublishedApi
    public static final int compareAndExchange(AtomicInteger atomicInteger, int i9, int i10) {
        Intrinsics.checkNotNullParameter(atomicInteger, "<this>");
        do {
            int i11 = atomicInteger.get();
            if (i9 != i11) {
                return i11;
            }
        } while (!atomicInteger.compareAndSet(i9, i10));
        return i9;
    }

    @SinceKotlin(version = "2.1")
    @PublishedApi
    public static final long compareAndExchange(AtomicLong atomicLong, long j9, long j10) {
        Intrinsics.checkNotNullParameter(atomicLong, "<this>");
        do {
            long j11 = atomicLong.get();
            if (j9 != j11) {
                return j11;
            }
        } while (!atomicLong.compareAndSet(j9, j10));
        return j9;
    }

    @SinceKotlin(version = "2.1")
    @PublishedApi
    public static final boolean compareAndExchange(AtomicBoolean atomicBoolean, boolean z9, boolean z10) {
        Intrinsics.checkNotNullParameter(atomicBoolean, "<this>");
        do {
            boolean z11 = atomicBoolean.get();
            if (z9 != z11) {
                return z11;
            }
        } while (!atomicBoolean.compareAndSet(z9, z10));
        return z9;
    }

    @SinceKotlin(version = "2.1")
    @PublishedApi
    public static final <T> T compareAndExchange(AtomicReference<T> atomicReference, T t9, T t10) {
        Intrinsics.checkNotNullParameter(atomicReference, "<this>");
        do {
            T t11 = atomicReference.get();
            if (t9 != t11) {
                return t11;
            }
        } while (!AbstractC0908q.m812a(atomicReference, t9, t10));
        return t9;
    }

    @SinceKotlin(version = "2.1")
    @PublishedApi
    public static final int compareAndExchange(AtomicIntegerArray atomicIntegerArray, int i9, int i10, int i11) {
        Intrinsics.checkNotNullParameter(atomicIntegerArray, "<this>");
        do {
            int i12 = atomicIntegerArray.get(i9);
            if (i10 != i12) {
                return i12;
            }
        } while (!atomicIntegerArray.compareAndSet(i9, i10, i11));
        return i10;
    }

    @SinceKotlin(version = "2.1")
    @PublishedApi
    public static final long compareAndExchange(AtomicLongArray atomicLongArray, int i9, long j9, long j10) {
        Intrinsics.checkNotNullParameter(atomicLongArray, "<this>");
        do {
            long j11 = atomicLongArray.get(i9);
            if (j9 != j11) {
                return j11;
            }
        } while (!atomicLongArray.compareAndSet(i9, j9, j10));
        return j9;
    }

    @SinceKotlin(version = "2.1")
    @PublishedApi
    public static final <T> T compareAndExchange(AtomicReferenceArray<T> atomicReferenceArray, int i9, T t9, T t10) {
        Intrinsics.checkNotNullParameter(atomicReferenceArray, "<this>");
        do {
            T t11 = atomicReferenceArray.get(i9);
            if (t9 != t11) {
                return t11;
            }
        } while (!AbstractC8151a.m13080a(atomicReferenceArray, i9, t9, t10));
        return t9;
    }
}
