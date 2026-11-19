package coil3.disk;

import java.io.IOException;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import okio.Okio;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 1, 0})
@DebugMetadata(m5302c = "coil3.disk.DiskLruCache$launchCleanup$1", m5303f = "DiskLruCache.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes2.dex */
final class DiskLruCache$launchCleanup$1 extends SuspendLambda implements InterfaceC6473e {
    int label;
    final /* synthetic */ C3288f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$launchCleanup$1(C3288f c3288f, InterfaceC5631c<? super DiskLruCache$launchCleanup$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = c3288f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new DiskLruCache$launchCleanup$1(this.this$0, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5774b.m5119b(obj);
        C3288f c3288f = this.this$0;
        synchronized (c3288f.f1957h) {
            if (!c3288f.f1962m || c3288f.f1963n) {
                return C5443s.f8405a;
            }
            try {
                c3288f.m2224l();
            } catch (IOException unused) {
                c3288f.f1964o = true;
            }
            try {
                if (c3288f.f1959j >= 2000) {
                    c3288f.m2225n();
                }
            } catch (IOException unused2) {
                c3288f.f1965p = true;
                c3288f.f1960k = Okio.buffer(Okio.blackhole());
            }
            return C5443s.f8405a;
        }
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((DiskLruCache$launchCleanup$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
