package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(m13559k = 3, m13560mv = {2, 1, 0}, m13562xi = 48)
/* loaded from: classes5.dex */
public /* synthetic */ class SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 extends FunctionReferenceImpl implements Function2<Long, SemaphoreSegment, SemaphoreSegment> {
    public static final SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 INSTANCE = new SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1();

    public SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1() {
        super(2, SemaphoreKt.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ SemaphoreSegment invoke(Long l10, SemaphoreSegment semaphoreSegment) {
        return invoke(l10.longValue(), semaphoreSegment);
    }

    public final SemaphoreSegment invoke(long j10, SemaphoreSegment semaphoreSegment) {
        return SemaphoreKt.createSegment(j10, semaphoreSegment);
    }
}
