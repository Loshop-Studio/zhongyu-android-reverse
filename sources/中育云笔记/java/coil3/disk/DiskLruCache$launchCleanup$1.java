package coil3.disk;

import java.io.IOException;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import okio.Okio;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "coil3.disk.DiskLruCache$launchCleanup$1", m26211f = "DiskLruCache.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DiskLruCache$launchCleanup$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f3665c;

    /* renamed from: d */
    public final /* synthetic */ DiskLruCache f3666d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$launchCleanup$1(DiskLruCache diskLruCache, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f3666d = diskLruCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new DiskLruCache$launchCleanup$1(this.f3666d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f3665c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        Object obj2 = this.f3666d.f3639l;
        DiskLruCache diskLruCache = this.f3666d;
        synchronized (obj2) {
            if (!diskLruCache.f3644q || diskLruCache.f3645r) {
                return C10786q.f26013a;
            }
            try {
                diskLruCache.m3094I();
            } catch (IOException unused) {
                diskLruCache.f3646s = true;
            }
            try {
                if (diskLruCache.m3103z()) {
                    diskLruCache.m3096K();
                }
            } catch (IOException unused2) {
                diskLruCache.f3647t = true;
                diskLruCache.f3642o = Okio.buffer(Okio.blackhole());
            }
            return C10786q.f26013a;
        }
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((DiskLruCache$launchCleanup$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
