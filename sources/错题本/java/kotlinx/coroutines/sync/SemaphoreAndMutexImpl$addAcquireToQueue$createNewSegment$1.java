package kotlinx.coroutines.sync;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p076h7.AbstractC5643f;
import p076h7.C5644g;
import p152r6.InterfaceC6473e;

@Metadata(m5111k = 3, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
final /* synthetic */ class SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 extends FunctionReferenceImpl implements InterfaceC6473e {
    public static final SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 INSTANCE = new SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1();

    public SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1() {
        super(2, AbstractC5643f.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
    }

    public final C5644g invoke(long j7, C5644g c5644g) {
        int i = AbstractC5643f.f8770a;
        return new C5644g(j7, c5644g, 0);
    }

    @Override // p152r6.InterfaceC6473e
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).longValue(), (C5644g) obj2);
    }
}
