package retrofit2;

import ca.C5281c0;
import ca.C5302s;
import ca.InterfaceC5282d;
import ca.InterfaceC5286f;
import kotlin.AbstractC9079b;
import kotlin.KotlinNullPointerException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.C9155c;
import p123h7.C8736p;
import p135i8.InterfaceC8845j;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9541f;
import p300x7.InterfaceC10570l;

/* loaded from: classes5.dex */
public abstract class KotlinExtensions {

    /* renamed from: retrofit2.KotlinExtensions$a */
    public static final class C9948a implements InterfaceC10570l {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC5282d f19929a;

        public C9948a(InterfaceC5282d interfaceC5282d) {
            this.f19929a = interfaceC5282d;
        }

        /* renamed from: a */
        public final void m18595a(Throwable th) {
            this.f19929a.cancel();
        }

        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m18595a((Throwable) obj);
            return C8736p.f16368a;
        }
    }

    /* renamed from: retrofit2.KotlinExtensions$b */
    public static final class C9949b implements InterfaceC5286f {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC8845j f19930a;

        public C9949b(InterfaceC8845j interfaceC8845j) {
            this.f19930a = interfaceC8845j;
        }

        @Override // ca.InterfaceC5286f
        /* renamed from: a */
        public void mo2273a(InterfaceC5282d call, Throwable t10) {
            AbstractC9133u.m16133g(call, "call");
            AbstractC9133u.m16133g(t10, "t");
            InterfaceC8845j interfaceC8845j = this.f19930a;
            Result.C9076a c9076a = Result.f17350b;
            interfaceC8845j.resumeWith(Result.m15909b(AbstractC9079b.m15925a(t10)));
        }

        @Override // ca.InterfaceC5286f
        /* renamed from: b */
        public void mo2274b(InterfaceC5282d call, C5281c0 response) {
            AbstractC9133u.m16133g(call, "call");
            AbstractC9133u.m16133g(response, "response");
            if (!response.m2246e()) {
                InterfaceC8845j interfaceC8845j = this.f19930a;
                Result.C9076a c9076a = Result.f17350b;
                interfaceC8845j.resumeWith(Result.m15909b(AbstractC9079b.m15925a(new HttpException(response))));
                return;
            }
            Object objM2243a = response.m2243a();
            if (objM2243a != null) {
                this.f19930a.resumeWith(Result.m15909b(objM2243a));
                return;
            }
            Object objM15051k = call.mo2248a().m15051k(C5302s.class);
            AbstractC9133u.m16130d(objM15051k);
            C5302s c5302s = (C5302s) objM15051k;
            KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException("Response from " + c5302s.m2316b().getName() + '.' + c5302s.m2315a().getName() + " was null but response body type was declared as non-null");
            InterfaceC8845j interfaceC8845j2 = this.f19930a;
            Result.C9076a c9076a2 = Result.f17350b;
            interfaceC8845j2.resumeWith(Result.m15909b(AbstractC9079b.m15925a(kotlinNullPointerException)));
        }
    }

    /* renamed from: retrofit2.KotlinExtensions$c */
    public static final class C9950c implements InterfaceC10570l {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC5282d f19931a;

        public C9950c(InterfaceC5282d interfaceC5282d) {
            this.f19931a = interfaceC5282d;
        }

        /* renamed from: a */
        public final void m18596a(Throwable th) {
            this.f19931a.cancel();
        }

        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m18596a((Throwable) obj);
            return C8736p.f16368a;
        }
    }

    /* renamed from: retrofit2.KotlinExtensions$d */
    public static final class C9951d implements InterfaceC5286f {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC8845j f19932a;

        public C9951d(InterfaceC8845j interfaceC8845j) {
            this.f19932a = interfaceC8845j;
        }

        @Override // ca.InterfaceC5286f
        /* renamed from: a */
        public void mo2273a(InterfaceC5282d call, Throwable t10) {
            AbstractC9133u.m16133g(call, "call");
            AbstractC9133u.m16133g(t10, "t");
            InterfaceC8845j interfaceC8845j = this.f19932a;
            Result.C9076a c9076a = Result.f17350b;
            interfaceC8845j.resumeWith(Result.m15909b(AbstractC9079b.m15925a(t10)));
        }

        @Override // ca.InterfaceC5286f
        /* renamed from: b */
        public void mo2274b(InterfaceC5282d call, C5281c0 response) {
            AbstractC9133u.m16133g(call, "call");
            AbstractC9133u.m16133g(response, "response");
            if (response.m2246e()) {
                InterfaceC8845j interfaceC8845j = this.f19932a;
                Result.C9076a c9076a = Result.f17350b;
                interfaceC8845j.resumeWith(Result.m15909b(response.m2243a()));
            } else {
                InterfaceC8845j interfaceC8845j2 = this.f19932a;
                Result.C9076a c9076a2 = Result.f17350b;
                interfaceC8845j2.resumeWith(Result.m15909b(AbstractC9079b.m15925a(new HttpException(response))));
            }
        }
    }

    /* renamed from: retrofit2.KotlinExtensions$e */
    public static final class C9952e implements InterfaceC10570l {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC5282d f19933a;

        public C9952e(InterfaceC5282d interfaceC5282d) {
            this.f19933a = interfaceC5282d;
        }

        /* renamed from: a */
        public final void m18597a(Throwable th) {
            this.f19933a.cancel();
        }

        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m18597a((Throwable) obj);
            return C8736p.f16368a;
        }
    }

    /* renamed from: retrofit2.KotlinExtensions$f */
    public static final class C9953f implements InterfaceC5286f {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC8845j f19934a;

        public C9953f(InterfaceC8845j interfaceC8845j) {
            this.f19934a = interfaceC8845j;
        }

        @Override // ca.InterfaceC5286f
        /* renamed from: a */
        public void mo2273a(InterfaceC5282d call, Throwable t10) {
            AbstractC9133u.m16133g(call, "call");
            AbstractC9133u.m16133g(t10, "t");
            InterfaceC8845j interfaceC8845j = this.f19934a;
            Result.C9076a c9076a = Result.f17350b;
            interfaceC8845j.resumeWith(Result.m15909b(AbstractC9079b.m15925a(t10)));
        }

        @Override // ca.InterfaceC5286f
        /* renamed from: b */
        public void mo2274b(InterfaceC5282d call, C5281c0 response) {
            AbstractC9133u.m16133g(call, "call");
            AbstractC9133u.m16133g(response, "response");
            this.f19934a.resumeWith(Result.m15909b(response));
        }
    }

    /* renamed from: retrofit2.KotlinExtensions$g */
    public static final class RunnableC9954g implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC9324c f19935a;

        /* renamed from: b */
        public final /* synthetic */ Throwable f19936b;

        public RunnableC9954g(InterfaceC9324c interfaceC9324c, Throwable th) {
            this.f19935a = interfaceC9324c;
            this.f19936b = th;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC9324c interfaceC9324cM16079d = IntrinsicsKt__IntrinsicsJvmKt.m16079d(this.f19935a);
            Result.C9076a c9076a = Result.f17350b;
            interfaceC9324cM16079d.resumeWith(Result.m15909b(AbstractC9079b.m15925a(this.f19936b)));
        }
    }

    /* renamed from: a */
    public static final Object m18590a(InterfaceC5282d interfaceC5282d, InterfaceC9324c interfaceC9324c) {
        C9155c c9155c = new C9155c(IntrinsicsKt__IntrinsicsJvmKt.m16079d(interfaceC9324c), 1);
        c9155c.m16343D();
        c9155c.mo14873r(new C9948a(interfaceC5282d));
        interfaceC5282d.mo2249d(new C9949b(c9155c));
        Object objM16372x = c9155c.m16372x();
        if (objM16372x == AbstractC9434a.m17291f()) {
            AbstractC9541f.m17811c(interfaceC9324c);
        }
        return objM16372x;
    }

    /* renamed from: b */
    public static final Object m18591b(InterfaceC5282d interfaceC5282d, InterfaceC9324c interfaceC9324c) {
        C9155c c9155c = new C9155c(IntrinsicsKt__IntrinsicsJvmKt.m16079d(interfaceC9324c), 1);
        c9155c.m16343D();
        c9155c.mo14873r(new C9950c(interfaceC5282d));
        interfaceC5282d.mo2249d(new C9951d(c9155c));
        Object objM16372x = c9155c.m16372x();
        if (objM16372x == AbstractC9434a.m17291f()) {
            AbstractC9541f.m17811c(interfaceC9324c);
        }
        return objM16372x;
    }

    /* renamed from: c */
    public static final Object m18592c(InterfaceC5282d interfaceC5282d, InterfaceC9324c interfaceC9324c) {
        C9155c c9155c = new C9155c(IntrinsicsKt__IntrinsicsJvmKt.m16079d(interfaceC9324c), 1);
        c9155c.m16343D();
        c9155c.mo14873r(new C9952e(interfaceC5282d));
        interfaceC5282d.mo2249d(new C9953f(c9155c));
        Object objM16372x = c9155c.m16372x();
        if (objM16372x == AbstractC9434a.m17291f()) {
            AbstractC9541f.m17811c(interfaceC9324c);
        }
        return objM16372x;
    }

    /* renamed from: d */
    public static final Object m18593d(InterfaceC5282d interfaceC5282d, InterfaceC9324c interfaceC9324c) {
        AbstractC9133u.m16131e(interfaceC5282d, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
        return m18591b(interfaceC5282d, interfaceC9324c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m18594e(java.lang.Throwable r4, p179m7.InterfaceC9324c r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof retrofit2.KotlinExtensions$suspendAndThrow$1
            if (r0 == 0) goto L13
            r0 = r5
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = (retrofit2.KotlinExtensions$suspendAndThrow$1) r0
            int r1 = r0.f19939c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19939c = r1
            goto L18
        L13:
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = new retrofit2.KotlinExtensions$suspendAndThrow$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f19938b
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f19939c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r4 = r0.f19937a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            kotlin.AbstractC9079b.m15926b(r5)
            goto L5c
        L35:
            kotlin.AbstractC9079b.m15926b(r5)
            r0.f19937a = r4
            r0.f19939c = r3
            kotlinx.coroutines.CoroutineDispatcher r5 = p135i8.C8843i0.m14866a()
            kotlin.coroutines.d r2 = r0.getContext()
            retrofit2.KotlinExtensions$g r3 = new retrofit2.KotlinExtensions$g
            r3.<init>(r0, r4)
            r5.dispatch(r2, r3)
            java.lang.Object r4 = p190n7.AbstractC9434a.m17291f()
            java.lang.Object r5 = p190n7.AbstractC9434a.m17291f()
            if (r4 != r5) goto L59
            p201o7.AbstractC9541f.m17811c(r0)
        L59:
            if (r4 != r1) goto L5c
            return r1
        L5c:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.KotlinExtensions.m18594e(java.lang.Throwable, m7.c):java.lang.Object");
    }
}
