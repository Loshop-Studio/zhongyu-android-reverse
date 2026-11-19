package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.ThreadLocal;
import kotlinx.coroutines.internal.ThreadLocalKey;

@Metadata(m13557d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u0002H\u0002¢\u0006\u0002\u0010\u0005\u001a\u0016\u0010\u0006\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\u0003H\u0086H¢\u0006\u0002\u0010\b\u001a\u0016\u0010\t\u001a\u00020\n*\u0006\u0012\u0002\b\u00030\u0003H\u0086H¢\u0006\u0002\u0010\b¨\u0006\u000b"}, m13558d2 = {"asContextElement", "Lkotlinx/coroutines/ThreadContextElement;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/ThreadLocal;", "value", "(Ljava/lang/ThreadLocal;Ljava/lang/Object;)Lkotlinx/coroutines/ThreadContextElement;", "isPresent", "", "(Ljava/lang/ThreadLocal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ensurePresent", "", "kotlinx-coroutines-core"}, m13559k = 2, m13560mv = {2, 1, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nThreadContextElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadContextElement.kt\nkotlinx/coroutines/ThreadContextElementKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,285:1\n263#1:286\n1#2:287\n*S KotlinDebug\n*F\n+ 1 ThreadContextElement.kt\nkotlinx/coroutines/ThreadContextElementKt\n*L\n284#1:286\n*E\n"})
/* loaded from: classes5.dex */
public final class ThreadContextElementKt {
    public static final <T> ThreadContextElement<T> asContextElement(ThreadLocal<T> threadLocal, T t10) {
        return new ThreadLocal(t10, threadLocal);
    }

    public static /* synthetic */ ThreadContextElement asContextElement$default(ThreadLocal threadLocal, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = threadLocal.get();
        }
        return asContextElement(threadLocal, obj);
    }

    public static final Object ensurePresent(ThreadLocal<?> threadLocal, Continuation<? super Unit> continuation) {
        if (continuation.getContext().get(new ThreadLocalKey(threadLocal)) != null) {
            return Unit.INSTANCE;
        }
        throw new IllegalStateException(("ThreadLocal " + threadLocal + " is missing from context " + continuation.getContext()).toString());
    }

    private static final Object ensurePresent$$forInline(ThreadLocal<?> threadLocal, Continuation<? super Unit> continuation) {
        InlineMarker.mark(3);
        throw null;
    }

    public static final Object isPresent(ThreadLocal<?> threadLocal, Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(continuation.getContext().get(new ThreadLocalKey(threadLocal)) != null);
    }

    private static final Object isPresent$$forInline(ThreadLocal<?> threadLocal, Continuation<? super Boolean> continuation) {
        InlineMarker.mark(3);
        throw null;
    }
}
