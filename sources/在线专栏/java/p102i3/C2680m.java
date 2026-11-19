package p102i3;

import kotlin.coroutines.jvm.internal.AbstractC2748d;
import kotlin.coroutines.jvm.internal.InterfaceC2750f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p128o2.C2925r;
import p142q2.InterfaceC3012d;
import p171x2.InterfaceC3474p;

/* renamed from: i3.m */
/* loaded from: classes.dex */
public final class C2680m<T> implements InterfaceC2669b<T> {

    /* renamed from: a */
    @NotNull
    private final InterfaceC2669b<T> f10632a;

    /* renamed from: b */
    @NotNull
    private final InterfaceC3474p<InterfaceC2669b<? super T>, InterfaceC3012d<? super C2925r>, Object> f10633b;

    @InterfaceC2750f(m9206c = "kotlinx.coroutines.flow.SubscribedFlowCollector", m9207f = "Share.kt", m9208l = {410, 414}, m9209m = "onSubscription")
    /* renamed from: i3.m$a */
    static final class a extends AbstractC2748d {

        /* renamed from: a */
        Object f10634a;

        /* renamed from: b */
        Object f10635b;

        /* renamed from: c */
        /* synthetic */ Object f10636c;

        /* renamed from: d */
        final /* synthetic */ C2680m<T> f10637d;

        /* renamed from: e */
        int f10638e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C2680m<T> c2680m, InterfaceC3012d<? super a> interfaceC3012d) {
            super(interfaceC3012d);
            this.f10637d = c2680m;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f10636c = obj;
            this.f10638e |= Integer.MIN_VALUE;
            return this.f10637d.m9000c(this);
        }
    }

    @Override // p102i3.InterfaceC2669b
    @Nullable
    /* renamed from: a */
    public Object mo8120a(T t3, @NotNull InterfaceC3012d<? super C2925r> interfaceC3012d) {
        return this.f10632a.mo8120a(t3, interfaceC3012d);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m9000c(@org.jetbrains.annotations.NotNull p142q2.InterfaceC3012d<? super p128o2.C2925r> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p102i3.C2680m.a
            if (r0 == 0) goto L13
            r0 = r7
            i3.m$a r0 = (p102i3.C2680m.a) r0
            int r1 = r0.f10638e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10638e = r1
            goto L18
        L13:
            i3.m$a r0 = new i3.m$a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f10636c
            java.lang.Object r1 = p146r2.C3031b.m10172c()
            int r2 = r0.f10638e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p128o2.C2920m.m9994b(r7)
            goto L7a
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.f10635b
            j3.f r2 = (p107j3.C2699f) r2
            java.lang.Object r4 = r0.f10634a
            i3.m r4 = (p102i3.C2680m) r4
            p128o2.C2920m.m9994b(r7)     // Catch: java.lang.Throwable -> L40
            goto L61
        L40:
            r7 = move-exception
            goto L82
        L42:
            p128o2.C2920m.m9994b(r7)
            i3.b<T> r7 = r6.f10632a
            q2.g r2 = r0.getContext()
            j3.f r5 = new j3.f
            r5.<init>(r7, r2)
            x2.p<i3.b<? super T>, q2.d<? super o2.r>, java.lang.Object> r7 = r6.f10633b     // Catch: java.lang.Throwable -> L80
            r0.f10634a = r6     // Catch: java.lang.Throwable -> L80
            r0.f10635b = r5     // Catch: java.lang.Throwable -> L80
            r0.f10638e = r4     // Catch: java.lang.Throwable -> L80
            java.lang.Object r7 = r7.mo2812d(r5, r0)     // Catch: java.lang.Throwable -> L80
            if (r7 != r1) goto L5f
            return r1
        L5f:
            r4 = r6
            r2 = r5
        L61:
            r2.releaseIntercepted()
            i3.b<T> r7 = r4.f10632a
            boolean r2 = r7 instanceof p102i3.C2680m
            if (r2 == 0) goto L7d
            i3.m r7 = (p102i3.C2680m) r7
            r2 = 0
            r0.f10634a = r2
            r0.f10635b = r2
            r0.f10638e = r3
            java.lang.Object r7 = r7.m9000c(r0)
            if (r7 != r1) goto L7a
            return r1
        L7a:
            o2.r r7 = p128o2.C2925r.f11415a
            return r7
        L7d:
            o2.r r7 = p128o2.C2925r.f11415a
            return r7
        L80:
            r7 = move-exception
            r2 = r5
        L82:
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p102i3.C2680m.m9000c(q2.d):java.lang.Object");
    }
}
