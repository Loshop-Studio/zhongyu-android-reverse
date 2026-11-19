package p107j3;

import kotlin.coroutines.jvm.internal.AbstractC2748d;
import kotlin.coroutines.jvm.internal.C2752h;
import kotlin.coroutines.jvm.internal.InterfaceC2749e;
import kotlin.jvm.internal.AbstractC2770m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p082e3.C2488n;
import p087f3.C2591q1;
import p102i3.InterfaceC2669b;
import p128o2.C2919l;
import p128o2.C2925r;
import p142q2.C3016h;
import p142q2.InterfaceC3012d;
import p142q2.InterfaceC3015g;
import p146r2.C3033d;
import p171x2.InterfaceC3474p;

/* renamed from: j3.f */
/* loaded from: classes.dex */
public final class C2699f<T> extends AbstractC2748d implements InterfaceC2669b<T> {

    /* renamed from: a */
    @NotNull
    public final InterfaceC2669b<T> f10664a;

    /* renamed from: b */
    @NotNull
    public final InterfaceC3015g f10665b;

    /* renamed from: c */
    public final int f10666c;

    /* renamed from: d */
    @Nullable
    private InterfaceC3015g f10667d;

    /* renamed from: e */
    @Nullable
    private InterfaceC3012d<? super C2925r> f10668e;

    /* renamed from: j3.f$a */
    static final class a extends AbstractC2770m implements InterfaceC3474p<Integer, InterfaceC3015g.b, Integer> {

        /* renamed from: a */
        public static final a f10669a = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final int m9022a(int i4, @NotNull InterfaceC3015g.b bVar) {
            return i4 + 1;
        }

        @Override // p171x2.InterfaceC3474p
        /* renamed from: d */
        public /* bridge */ /* synthetic */ Integer mo2812d(Integer num, InterfaceC3015g.b bVar) {
            return Integer.valueOf(m9022a(num.intValue(), bVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2699f(@NotNull InterfaceC2669b<? super T> interfaceC2669b, @NotNull InterfaceC3015g interfaceC3015g) {
        super(C2698e.f10662a, C3016h.f11678a);
        this.f10664a = interfaceC2669b;
        this.f10665b = interfaceC3015g;
        this.f10666c = ((Number) interfaceC3015g.fold(0, a.f10669a)).intValue();
    }

    /* renamed from: e */
    private final void m9019e(InterfaceC3015g interfaceC3015g, InterfaceC3015g interfaceC3015g2, T t3) {
        if (interfaceC3015g2 instanceof C2697d) {
            m9021j((C2697d) interfaceC3015g2, t3);
        }
        C2701h.m9026a(this, interfaceC3015g);
        this.f10667d = interfaceC3015g;
    }

    /* renamed from: i */
    private final Object m9020i(InterfaceC3012d<? super C2925r> interfaceC3012d, T t3) {
        InterfaceC3015g context = interfaceC3012d.getContext();
        C2591q1.m8653f(context);
        InterfaceC3015g interfaceC3015g = this.f10667d;
        if (interfaceC3015g != context) {
            m9019e(context, interfaceC3015g, t3);
        }
        this.f10668e = interfaceC3012d;
        return C2700g.f10670a.mo9025c(this.f10664a, t3, this);
    }

    /* renamed from: j */
    private final void m9021j(C2697d c2697d, Object obj) {
        throw new IllegalStateException(C2488n.m8329f("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + c2697d.f10660a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // p102i3.InterfaceC2669b
    @Nullable
    /* renamed from: a */
    public Object mo8120a(T t3, @NotNull InterfaceC3012d<? super C2925r> interfaceC3012d) {
        try {
            Object objM9020i = m9020i(interfaceC3012d, t3);
            if (objM9020i == C3033d.m10175c()) {
                C2752h.m9217c(interfaceC3012d);
            }
            return objM9020i == C3033d.m10175c() ? objM9020i : C2925r.f11415a;
        } catch (Throwable th) {
            this.f10667d = new C2697d(th);
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC2745a, kotlin.coroutines.jvm.internal.InterfaceC2749e
    @Nullable
    public InterfaceC2749e getCallerFrame() {
        InterfaceC3012d<? super C2925r> interfaceC3012d = this.f10668e;
        if (interfaceC3012d instanceof InterfaceC2749e) {
            return (InterfaceC2749e) interfaceC3012d;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC2748d, p142q2.InterfaceC3012d
    @NotNull
    public InterfaceC3015g getContext() {
        InterfaceC3012d<? super C2925r> interfaceC3012d = this.f10668e;
        InterfaceC3015g context = interfaceC3012d == null ? null : interfaceC3012d.getContext();
        return context == null ? C3016h.f11678a : context;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
    @NotNull
    public Object invokeSuspend(@NotNull Object obj) {
        Throwable thM9990b = C2919l.m9990b(obj);
        if (thM9990b != null) {
            this.f10667d = new C2697d(thM9990b);
        }
        InterfaceC3012d<? super C2925r> interfaceC3012d = this.f10668e;
        if (interfaceC3012d != null) {
            interfaceC3012d.resumeWith(obj);
        }
        return C3033d.m10175c();
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC2748d, kotlin.coroutines.jvm.internal.AbstractC2745a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
