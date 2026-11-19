package kotlinx.coroutines.sync;

import be.AbstractC5198j;
import be.C5199k;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9544p;

/* loaded from: classes6.dex */
public /* synthetic */ class SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 extends FunctionReferenceImpl implements InterfaceC9544p {

    /* renamed from: c */
    public static final SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 f24057c = new SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1();

    public SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1() {
        super(2, AbstractC5198j.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
    }

    /* renamed from: g */
    public final C5199k m21039g(long j10, C5199k c5199k) {
        return AbstractC5198j.m2759j(j10, c5199k);
    }

    @Override // p181hd.InterfaceC9544p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m21039g(((Number) obj).longValue(), (C5199k) obj2);
    }
}
