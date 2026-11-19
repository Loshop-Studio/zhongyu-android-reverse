package coil3.intercept;

import android.content.Context;
import coil3.AbstractC3297h;
import coil3.C3333r;
import coil3.InterfaceC3305k;
import coil3.decode.DataSource;
import coil3.util.ComponentCallbacks2C3337a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p140q.C6397a;
import p140q.C6400d;
import p140q.C6401e;
import p152r6.InterfaceC6473e;
import p154s.C6532f;
import p154s.C6538l;
import p154s.C6540n;
import p169t6.AbstractC6600a;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ls/n;", "<anonymous>", "(Lkotlinx/coroutines/v;)Ls/n;"}, m5111k = 3, m5112mv = {2, 1, 0})
@DebugMetadata(m5302c = "coil3.intercept.EngineInterceptor$intercept$2", m5303f = "EngineInterceptor.kt", m5304i = {}, m5305l = {77}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
@SourceDebugExtension({"SMAP\nEngineInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EngineInterceptor.kt\ncoil3/intercept/EngineInterceptor$intercept$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"})
/* loaded from: classes2.dex */
final class EngineInterceptor$intercept$2 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ C6397a $cacheKey;
    final /* synthetic */ InterfaceC3302d $chain;
    final /* synthetic */ AbstractC3297h $eventListener;
    final /* synthetic */ Object $mappedData;
    final /* synthetic */ C6538l $options;
    final /* synthetic */ C6532f $request;
    int label;
    final /* synthetic */ C3300b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$intercept$2(C3300b c3300b, C6532f c6532f, Object obj, C6538l c6538l, AbstractC3297h abstractC3297h, C6397a c6397a, InterfaceC3302d interfaceC3302d, InterfaceC5631c<? super EngineInterceptor$intercept$2> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = c3300b;
        this.$request = c6532f;
        this.$mappedData = obj;
        this.$options = c6538l;
        this.$eventListener = abstractC3297h;
        this.$cacheKey = c6397a;
        this.$chain = interfaceC3302d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new EngineInterceptor$intercept$2(this.this$0, this.$request, this.$mappedData, this.$options, this.$eventListener, this.$cacheKey, this.$chain, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM2227b;
        boolean z8;
        C6401e c6401eM2277d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            C3300b c3300b = this.this$0;
            C6532f c6532f = this.$request;
            Object obj2 = this.$mappedData;
            C6538l c6538l = this.$options;
            AbstractC3297h abstractC3297h = this.$eventListener;
            this.label = 1;
            objM2227b = C3300b.m2227b(c3300b, c6532f, obj2, c6538l, abstractC3297h, this);
            if (objM2227b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            objM2227b = obj;
        }
        C3299a c3299a = (C3299a) objM2227b;
        ComponentCallbacks2C3337a componentCallbacks2C3337a = this.this$0.f1985b;
        synchronized (componentCallbacks2C3337a) {
            try {
                C3333r c3333r = (C3333r) componentCallbacks2C3337a.f2069a.get();
                if (c3333r == null) {
                    componentCallbacks2C3337a.m2284a();
                } else if (componentCallbacks2C3337a.f2070b == null) {
                    Context context = c3333r.f2045a.f2039a;
                    componentCallbacks2C3337a.f2070b = context;
                    context.registerComponentCallbacks(componentCallbacks2C3337a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C6400d c6400d = this.this$0.f1987d;
        C6397a c6397a = this.$cacheKey;
        C6532f c6532f2 = this.$request;
        if (c6397a == null || !c6532f2.f10869i.getWriteEnabled() || !c3299a.f1980a.mo2175a() || (c6401eM2277d = ((C3333r) c6400d.f10500a).m2277d()) == null) {
            z8 = false;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("coil#is_sampled", Boolean.valueOf(c3299a.f1981b));
            String str = c3299a.f1983d;
            if (str != null) {
                linkedHashMap.put("coil#disk_cache_key", str);
            }
            InterfaceC3305k interfaceC3305k = c3299a.f1980a;
            Map mapM6246x = AbstractC6600a.m6246x(linkedHashMap);
            synchronized (c6401eM2277d.f10503c) {
                long size = interfaceC3305k.getSize();
                if (size < 0) {
                    throw new IllegalStateException(("Image size must be non-negative: " + size).toString());
                }
                c6401eM2277d.f10501a.mo128w(c6397a, interfaceC3305k, mapM6246x, size);
            }
            z8 = true;
        }
        InterfaceC3305k interfaceC3305k2 = c3299a.f1980a;
        C6532f c6532f3 = this.$request;
        DataSource dataSource = c3299a.f1982c;
        C6397a c6397a2 = this.$cacheKey;
        if (!z8) {
            c6397a2 = null;
        }
        C6397a c6397a3 = c6397a2;
        String str2 = c3299a.f1983d;
        boolean z9 = c3299a.f1981b;
        InterfaceC3302d interfaceC3302d = this.$chain;
        return new C6540n(interfaceC3305k2, c6532f3, dataSource, c6397a3, str2, z9, (interfaceC3302d instanceof C3303e) && ((C3303e) interfaceC3302d).f1994g);
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C6540n> interfaceC5631c) {
        return ((EngineInterceptor$intercept$2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
