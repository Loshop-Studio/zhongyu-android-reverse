package androidx.compose.runtime;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(m5174d1 = {"\u00000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000\u001a/\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0081\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0002\b\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a0\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\b\rH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0000H\u0000*\u001e\b\u0000\u0010\u0018\u001a\u0004\b\u0000\u0010\u0016\"\b\u0012\u0004\u0012\u00028\u00000\u00172\b\u0012\u0004\u0012\u00028\u00000\u0017*\f\b\u0000\u0010\u0019\"\u00020\u00002\u00020\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001a"}, m5175d2 = {"", "instance", "", "identityHashCode", "R", "lock", "Lkotlin/Function0;", "block", "synchronized", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Landroidx/compose/runtime/Composer;", "composer", "", "Landroidx/compose/runtime/Composable;", "composable", "invokeComposable", "(Landroidx/compose/runtime/Composer;Lkotlin/jvm/functions/Function2;)V", ExifInterface.GPS_DIRECTION_TRUE, "invokeComposableForResult", "(Landroidx/compose/runtime/Composer;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "it", "ensureMutable", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Ljava/util/concurrent/atomic/AtomicReference;", "AtomicReference", "TestOnly", "runtime_release"}, m5176k = 2, m5177mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ActualJvm_jvmKt {
    public static final void ensureMutable(Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    public static final int identityHashCode(Object obj) {
        return System.identityHashCode(obj);
    }

    public static final void invokeComposable(Composer composer, Function2<? super Composer, ? super Integer, Unit> composable) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(composable, "composable");
        ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(composable, 2)).invoke(composer, 1);
    }

    public static final <T> T invokeComposableForResult(Composer composer, Function2<? super Composer, ? super Integer, ? extends T> composable) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(composable, "composable");
        return (T) ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(composable, 2)).invoke(composer, 1);
    }

    @PublishedApi
    /* renamed from: synchronized, reason: not valid java name */
    public static final <R> R m8798synchronized(Object lock, Function0<? extends R> block) {
        R rInvoke;
        Intrinsics.checkNotNullParameter(lock, "lock");
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (lock) {
            try {
                rInvoke = block.invoke();
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        return rInvoke;
    }
}
