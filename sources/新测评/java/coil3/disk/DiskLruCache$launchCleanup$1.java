package coil3.disk;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okio.Okio;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "coil3.disk.DiskLruCache$launchCleanup$1", m13596f = "DiskLruCache.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes3.dex */
public final class DiskLruCache$launchCleanup$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f2990a;

    /* renamed from: b */
    public final /* synthetic */ DiskLruCache f2991b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$launchCleanup$1(DiskLruCache diskLruCache, Continuation continuation) {
        super(2, continuation);
        this.f2991b = diskLruCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DiskLruCache$launchCleanup$1(this.f2991b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f2990a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Object obj2 = this.f2991b.f2964j;
        DiskLruCache diskLruCache = this.f2991b;
        synchronized (obj2) {
            if (!diskLruCache.f2969o || diskLruCache.f2970p) {
                return Unit.INSTANCE;
            }
            try {
                diskLruCache.m3000I();
            } catch (IOException unused) {
                diskLruCache.f2971q = true;
            }
            try {
                if (diskLruCache.m3009z()) {
                    diskLruCache.m3002K();
                }
            } catch (IOException unused2) {
                diskLruCache.f2972r = true;
                diskLruCache.f2967m = Okio.buffer(Okio.blackhole());
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((DiskLruCache$launchCleanup$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
