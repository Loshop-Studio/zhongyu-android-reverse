package kotlin.concurrent.internal;

import androidx.camera.view.AbstractC0920q;
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
import p289x8.AbstractC9881a;

@Metadata(m13557d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0001\u001a\u001c\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001a\u001c\u0010\u0000\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0001\u001a-\u0010\u0000\u001a\u0002H\t\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\n2\u0006\u0010\u0003\u001a\u0002H\t2\u0006\u0010\u0004\u001a\u0002H\tH\u0001¢\u0006\u0002\u0010\u000b\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\f2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0001\u001a$\u0010\u0000\u001a\u00020\u0005*\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001a5\u0010\u0000\u001a\u0002H\t\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\u000f2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\t2\u0006\u0010\u0004\u001a\u0002H\tH\u0001¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, m13558d2 = {"compareAndExchange", "", "Ljava/util/concurrent/atomic/AtomicInteger;", "expected", "newValue", "", "Ljava/util/concurrent/atomic/AtomicLong;", "", "Ljava/util/concurrent/atomic/AtomicBoolean;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/concurrent/atomic/AtomicReference;", "(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicIntegerArray;", "index", "Ljava/util/concurrent/atomic/AtomicLongArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "(Ljava/util/concurrent/atomic/AtomicReferenceArray;ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, m13559k = 2, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class AtomicIntrinsicsKt {
    @SinceKotlin(version = "2.1")
    @PublishedApi
    public static final int compareAndExchange(AtomicInteger atomicInteger, int i10, int i11) {
        Intrinsics.checkNotNullParameter(atomicInteger, "<this>");
        do {
            int i12 = atomicInteger.get();
            if (i10 != i12) {
                return i12;
            }
        } while (!atomicInteger.compareAndSet(i10, i11));
        return i10;
    }

    @SinceKotlin(version = "2.1")
    @PublishedApi
    public static final long compareAndExchange(AtomicLong atomicLong, long j10, long j11) {
        Intrinsics.checkNotNullParameter(atomicLong, "<this>");
        do {
            long j12 = atomicLong.get();
            if (j10 != j12) {
                return j12;
            }
        } while (!atomicLong.compareAndSet(j10, j11));
        return j10;
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
    public static final <T> T compareAndExchange(AtomicReference<T> atomicReference, T t10, T t11) {
        Intrinsics.checkNotNullParameter(atomicReference, "<this>");
        do {
            T t12 = atomicReference.get();
            if (t10 != t12) {
                return t12;
            }
        } while (!AbstractC0920q.m1034a(atomicReference, t10, t11));
        return t10;
    }

    @SinceKotlin(version = "2.1")
    @PublishedApi
    public static final int compareAndExchange(AtomicIntegerArray atomicIntegerArray, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(atomicIntegerArray, "<this>");
        do {
            int i13 = atomicIntegerArray.get(i10);
            if (i11 != i13) {
                return i13;
            }
        } while (!atomicIntegerArray.compareAndSet(i10, i11, i12));
        return i11;
    }

    @SinceKotlin(version = "2.1")
    @PublishedApi
    public static final long compareAndExchange(AtomicLongArray atomicLongArray, int i10, long j10, long j11) {
        Intrinsics.checkNotNullParameter(atomicLongArray, "<this>");
        do {
            long j12 = atomicLongArray.get(i10);
            if (j10 != j12) {
                return j12;
            }
        } while (!atomicLongArray.compareAndSet(i10, j10, j11));
        return j10;
    }

    @SinceKotlin(version = "2.1")
    @PublishedApi
    public static final <T> T compareAndExchange(AtomicReferenceArray<T> atomicReferenceArray, int i10, T t10, T t11) {
        Intrinsics.checkNotNullParameter(atomicReferenceArray, "<this>");
        do {
            T t12 = atomicReferenceArray.get(i10);
            if (t10 != t12) {
                return t12;
            }
        } while (!AbstractC9881a.m16590a(atomicReferenceArray, i10, t10, t11));
        return t10;
    }
}
