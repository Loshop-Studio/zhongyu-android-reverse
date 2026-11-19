package kotlinx.coroutines.sync;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p235r8.AbstractC9945d;
import p235r8.C9946e;
import p300x7.InterfaceC10574p;

/* loaded from: classes5.dex */
public /* synthetic */ class SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 extends FunctionReferenceImpl implements InterfaceC10574p {

    /* renamed from: a */
    public static final SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 f18192a = new SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1();

    public SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1() {
        super(2, AbstractC9945d.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
    }

    /* renamed from: d */
    public final C9946e m16906d(long j10, C9946e c9946e) {
        return AbstractC9945d.m18583j(j10, c9946e);
    }

    @Override // p300x7.InterfaceC10574p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m16906d(((Number) obj).longValue(), (C9946e) obj2);
    }
}
