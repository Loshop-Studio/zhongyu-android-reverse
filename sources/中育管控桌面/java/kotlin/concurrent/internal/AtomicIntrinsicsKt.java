package kotlin.concurrent.internal;

import androidx.compose.animation.core.AbstractC0433h;
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
import p028c5.AbstractC4509a;

@Metadata(m7879d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0001\u001a\u001c\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001a\u001c\u0010\u0000\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0001\u001a-\u0010\u0000\u001a\u0002H\t\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\n2\u0006\u0010\u0003\u001a\u0002H\t2\u0006\u0010\u0004\u001a\u0002H\tH\u0001¢\u0006\u0002\u0010\u000b\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\f2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0001\u001a$\u0010\u0000\u001a\u00020\u0005*\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001a5\u0010\u0000\u001a\u0002H\t\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\u000f2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\t2\u0006\u0010\u0004\u001a\u0002H\tH\u0001¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, m7880d2 = {"compareAndExchange", "", "Ljava/util/concurrent/atomic/AtomicInteger;", "expected", "newValue", "", "Ljava/util/concurrent/atomic/AtomicLong;", "", "Ljava/util/concurrent/atomic/AtomicBoolean;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/concurrent/atomic/AtomicReference;", "(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicIntegerArray;", "index", "Ljava/util/concurrent/atomic/AtomicLongArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "(Ljava/util/concurrent/atomic/AtomicReferenceArray;ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, m7881k = 2, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class AtomicIntrinsicsKt {
    @SinceKotlin(version = "2.1")
    @PublishedApi
    public static final int compareAndExchange(AtomicInteger atomicInteger, int i6, int i7) {
        Intrinsics.checkNotNullParameter(atomicInteger, "<this>");
        do {
            int i8 = atomicInteger.get();
            if (i6 != i8) {
                return i8;
            }
        } while (!atomicInteger.compareAndSet(i6, i7));
        return i6;
    }

    @SinceKotlin(version = "2.1")
    @PublishedApi
    public static final long compareAndExchange(AtomicLong atomicLong, long j6, long j7) {
        Intrinsics.checkNotNullParameter(atomicLong, "<this>");
        do {
            long j8 = atomicLong.get();
            if (j6 != j8) {
                return j8;
            }
        } while (!atomicLong.compareAndSet(j6, j7));
        return j6;
    }

    @SinceKotlin(version = "2.1")
    @PublishedApi
    public static final boolean compareAndExchange(AtomicBoolean atomicBoolean, boolean z6, boolean z7) {
        Intrinsics.checkNotNullParameter(atomicBoolean, "<this>");
        do {
            boolean z8 = atomicBoolean.get();
            if (z6 != z8) {
                return z8;
            }
        } while (!atomicBoolean.compareAndSet(z6, z7));
        return z6;
    }

    @SinceKotlin(version = "2.1")
    @PublishedApi
    public static final <T> T compareAndExchange(AtomicReference<T> atomicReference, T t6, T t7) {
        Intrinsics.checkNotNullParameter(atomicReference, "<this>");
        do {
            T t8 = atomicReference.get();
            if (t6 != t8) {
                return t8;
            }
        } while (!AbstractC0433h.m112a(atomicReference, t6, t7));
        return t6;
    }

    @SinceKotlin(version = "2.1")
    @PublishedApi
    public static final int compareAndExchange(AtomicIntegerArray atomicIntegerArray, int i6, int i7, int i8) {
        Intrinsics.checkNotNullParameter(atomicIntegerArray, "<this>");
        do {
            int i9 = atomicIntegerArray.get(i6);
            if (i7 != i9) {
                return i9;
            }
        } while (!atomicIntegerArray.compareAndSet(i6, i7, i8));
        return i7;
    }

    @SinceKotlin(version = "2.1")
    @PublishedApi
    public static final long compareAndExchange(AtomicLongArray atomicLongArray, int i6, long j6, long j7) {
        Intrinsics.checkNotNullParameter(atomicLongArray, "<this>");
        do {
            long j8 = atomicLongArray.get(i6);
            if (j6 != j8) {
                return j8;
            }
        } while (!atomicLongArray.compareAndSet(i6, j6, j7));
        return j6;
    }

    @SinceKotlin(version = "2.1")
    @PublishedApi
    public static final <T> T compareAndExchange(AtomicReferenceArray<T> atomicReferenceArray, int i6, T t6, T t7) {
        Intrinsics.checkNotNullParameter(atomicReferenceArray, "<this>");
        do {
            T t8 = atomicReferenceArray.get(i6);
            if (t6 != t8) {
                return t8;
            }
        } while (!AbstractC4509a.m1601a(atomicReferenceArray, i6, t6, t7));
        return t6;
    }
}
