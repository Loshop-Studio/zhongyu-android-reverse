package retrofit2;

import kotlin.AbstractC9924b;
import kotlin.KotlinNullPointerException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.C9997c;
import p122df.C9031c0;
import p122df.C9052s;
import p122df.InterfaceC9032d;
import p122df.InterfaceC9036f;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11831f;
import sd.InterfaceC11125j;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public abstract class KotlinExtensions {

    /* renamed from: retrofit2.KotlinExtensions$a */
    public static final class C11001a implements InterfaceC9540l {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC9032d f26569c;

        public C11001a(InterfaceC9032d interfaceC9032d) {
            this.f26569c = interfaceC9032d;
        }

        /* renamed from: a */
        public final void m24322a(Throwable th) {
            this.f26569c.cancel();
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m24322a((Throwable) obj);
            return C10786q.f26013a;
        }
    }

    /* renamed from: retrofit2.KotlinExtensions$b */
    public static final class C11002b implements InterfaceC9036f {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC11125j f26570a;

        public C11002b(InterfaceC11125j interfaceC11125j) {
            this.f26570a = interfaceC11125j;
        }

        @Override // p122df.InterfaceC9036f
        /* renamed from: a */
        public void mo17734a(InterfaceC9032d call, Throwable t10) {
            AbstractC9979u.m20294g(call, "call");
            AbstractC9979u.m20294g(t10, "t");
            InterfaceC11125j interfaceC11125j = this.f26570a;
            Result.C9921a c9921a = Result.f23263d;
            interfaceC11125j.resumeWith(Result.m20054c(AbstractC9924b.m20070a(t10)));
        }

        @Override // p122df.InterfaceC9036f
        /* renamed from: b */
        public void mo17735b(InterfaceC9032d call, C9031c0 response) {
            AbstractC9979u.m20294g(call, "call");
            AbstractC9979u.m20294g(response, "response");
            if (!response.m17707e()) {
                InterfaceC11125j interfaceC11125j = this.f26570a;
                Result.C9921a c9921a = Result.f23263d;
                interfaceC11125j.resumeWith(Result.m20054c(AbstractC9924b.m20070a(new HttpException(response))));
                return;
            }
            Object objM17704a = response.m17704a();
            if (objM17704a != null) {
                this.f26570a.resumeWith(Result.m20054c(objM17704a));
                return;
            }
            Object objM19591i = call.request().m19591i(C9052s.class);
            AbstractC9979u.m20291d(objM19591i);
            C9052s c9052s = (C9052s) objM19591i;
            KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException("Response from " + c9052s.m17774b().getName() + '.' + c9052s.m17773a().getName() + " was null but response body type was declared as non-null");
            InterfaceC11125j interfaceC11125j2 = this.f26570a;
            Result.C9921a c9921a2 = Result.f23263d;
            interfaceC11125j2.resumeWith(Result.m20054c(AbstractC9924b.m20070a(kotlinNullPointerException)));
        }
    }

    /* renamed from: retrofit2.KotlinExtensions$c */
    public static final class C11003c implements InterfaceC9540l {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC9032d f26571c;

        public C11003c(InterfaceC9032d interfaceC9032d) {
            this.f26571c = interfaceC9032d;
        }

        /* renamed from: a */
        public final void m24323a(Throwable th) {
            this.f26571c.cancel();
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m24323a((Throwable) obj);
            return C10786q.f26013a;
        }
    }

    /* renamed from: retrofit2.KotlinExtensions$d */
    public static final class C11004d implements InterfaceC9036f {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC11125j f26572a;

        public C11004d(InterfaceC11125j interfaceC11125j) {
            this.f26572a = interfaceC11125j;
        }

        @Override // p122df.InterfaceC9036f
        /* renamed from: a */
        public void mo17734a(InterfaceC9032d call, Throwable t10) {
            AbstractC9979u.m20294g(call, "call");
            AbstractC9979u.m20294g(t10, "t");
            InterfaceC11125j interfaceC11125j = this.f26572a;
            Result.C9921a c9921a = Result.f23263d;
            interfaceC11125j.resumeWith(Result.m20054c(AbstractC9924b.m20070a(t10)));
        }

        @Override // p122df.InterfaceC9036f
        /* renamed from: b */
        public void mo17735b(InterfaceC9032d call, C9031c0 response) {
            AbstractC9979u.m20294g(call, "call");
            AbstractC9979u.m20294g(response, "response");
            if (response.m17707e()) {
                InterfaceC11125j interfaceC11125j = this.f26572a;
                Result.C9921a c9921a = Result.f23263d;
                interfaceC11125j.resumeWith(Result.m20054c(response.m17704a()));
            } else {
                InterfaceC11125j interfaceC11125j2 = this.f26572a;
                Result.C9921a c9921a2 = Result.f23263d;
                interfaceC11125j2.resumeWith(Result.m20054c(AbstractC9924b.m20070a(new HttpException(response))));
            }
        }
    }

    /* renamed from: retrofit2.KotlinExtensions$e */
    public static final class C11005e implements InterfaceC9540l {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC9032d f26573c;

        public C11005e(InterfaceC9032d interfaceC9032d) {
            this.f26573c = interfaceC9032d;
        }

        /* renamed from: a */
        public final void m24324a(Throwable th) {
            this.f26573c.cancel();
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m24324a((Throwable) obj);
            return C10786q.f26013a;
        }
    }

    /* renamed from: retrofit2.KotlinExtensions$f */
    public static final class C11006f implements InterfaceC9036f {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC11125j f26574a;

        public C11006f(InterfaceC11125j interfaceC11125j) {
            this.f26574a = interfaceC11125j;
        }

        @Override // p122df.InterfaceC9036f
        /* renamed from: a */
        public void mo17734a(InterfaceC9032d call, Throwable t10) {
            AbstractC9979u.m20294g(call, "call");
            AbstractC9979u.m20294g(t10, "t");
            InterfaceC11125j interfaceC11125j = this.f26574a;
            Result.C9921a c9921a = Result.f23263d;
            interfaceC11125j.resumeWith(Result.m20054c(AbstractC9924b.m20070a(t10)));
        }

        @Override // p122df.InterfaceC9036f
        /* renamed from: b */
        public void mo17735b(InterfaceC9032d call, C9031c0 response) {
            AbstractC9979u.m20294g(call, "call");
            AbstractC9979u.m20294g(response, "response");
            this.f26574a.resumeWith(Result.m20054c(response));
        }
    }

    /* renamed from: retrofit2.KotlinExtensions$g */
    public static final class RunnableC11007g implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC11588c f26575c;

        /* renamed from: d */
        public final /* synthetic */ Throwable f26576d;

        public RunnableC11007g(InterfaceC11588c interfaceC11588c, Throwable th) {
            this.f26575c = interfaceC11588c;
            this.f26576d = th;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC11588c interfaceC11588cM20224d = IntrinsicsKt__IntrinsicsJvmKt.m20224d(this.f26575c);
            Result.C9921a c9921a = Result.f23263d;
            interfaceC11588cM20224d.resumeWith(Result.m20054c(AbstractC9924b.m20070a(this.f26576d)));
        }
    }

    /* renamed from: a */
    public static final Object m24317a(InterfaceC9032d interfaceC9032d, InterfaceC11588c interfaceC11588c) {
        C9997c c9997c = new C9997c(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c), 1);
        c9997c.m20503F();
        c9997c.mo20536u(new C11001a(interfaceC9032d));
        interfaceC9032d.mo17710c(new C11002b(c9997c));
        Object objM20538x = c9997c.m20538x();
        if (objM20538x == AbstractC11725a.m25952f()) {
            AbstractC11831f.m26221c(interfaceC11588c);
        }
        return objM20538x;
    }

    /* renamed from: b */
    public static final Object m24318b(InterfaceC9032d interfaceC9032d, InterfaceC11588c interfaceC11588c) {
        C9997c c9997c = new C9997c(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c), 1);
        c9997c.m20503F();
        c9997c.mo20536u(new C11003c(interfaceC9032d));
        interfaceC9032d.mo17710c(new C11004d(c9997c));
        Object objM20538x = c9997c.m20538x();
        if (objM20538x == AbstractC11725a.m25952f()) {
            AbstractC11831f.m26221c(interfaceC11588c);
        }
        return objM20538x;
    }

    /* renamed from: c */
    public static final Object m24319c(InterfaceC9032d interfaceC9032d, InterfaceC11588c interfaceC11588c) {
        C9997c c9997c = new C9997c(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c), 1);
        c9997c.m20503F();
        c9997c.mo20536u(new C11005e(interfaceC9032d));
        interfaceC9032d.mo17710c(new C11006f(c9997c));
        Object objM20538x = c9997c.m20538x();
        if (objM20538x == AbstractC11725a.m25952f()) {
            AbstractC11831f.m26221c(interfaceC11588c);
        }
        return objM20538x;
    }

    /* renamed from: d */
    public static final Object m24320d(InterfaceC9032d interfaceC9032d, InterfaceC11588c interfaceC11588c) {
        AbstractC9979u.m20292e(interfaceC9032d, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
        return m24318b(interfaceC9032d, interfaceC11588c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m24321e(java.lang.Throwable r4, vc.InterfaceC11588c r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof retrofit2.KotlinExtensions$suspendAndThrow$1
            if (r0 == 0) goto L13
            r0 = r5
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = (retrofit2.KotlinExtensions$suspendAndThrow$1) r0
            int r1 = r0.f26579e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26579e = r1
            goto L18
        L13:
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = new retrofit2.KotlinExtensions$suspendAndThrow$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f26578d
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f26579e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r4 = r0.f26577c
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            kotlin.AbstractC9924b.m20071b(r5)
            goto L5c
        L35:
            kotlin.AbstractC9924b.m20071b(r5)
            r0.f26577c = r4
            r0.f26579e = r3
            sd.e0 r5 = sd.C11157r0.m24798a()
            kotlin.coroutines.d r2 = r0.getContext()
            retrofit2.KotlinExtensions$g r3 = new retrofit2.KotlinExtensions$g
            r3.<init>(r0, r4)
            r5.dispatch(r2, r3)
            java.lang.Object r4 = p393wc.AbstractC11725a.m25952f()
            java.lang.Object r5 = p393wc.AbstractC11725a.m25952f()
            if (r4 != r5) goto L59
            p409xc.AbstractC11831f.m26221c(r0)
        L59:
            if (r4 != r1) goto L5c
            return r1
        L5c:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.KotlinExtensions.m24321e(java.lang.Throwable, vc.c):java.lang.Object");
    }
}
