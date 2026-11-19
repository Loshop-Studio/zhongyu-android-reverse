package retrofit2;

import java.lang.reflect.Method;
import kotlin.coroutines.jvm.internal.AbstractC2748d;
import kotlin.coroutines.jvm.internal.C2752h;
import kotlin.coroutines.jvm.internal.InterfaceC2750f;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p087f3.C2576m;
import p087f3.InterfaceC2572l;
import p128o2.C2912e;
import p128o2.C2919l;
import p128o2.C2920m;
import p142q2.InterfaceC3012d;
import p146r2.C3032c;
import p146r2.C3033d;

/* loaded from: classes.dex */
public final class KotlinExtensions {

    @InterfaceC2750f(m9206c = "retrofit2.KotlinExtensions", m9207f = "KotlinExtensions.kt", m9208l = {113}, m9209m = "suspendAndThrow")
    /* renamed from: retrofit2.KotlinExtensions$suspendAndThrow$1 */
    static final class C30401 extends AbstractC2748d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C30401(InterfaceC3012d interfaceC3012d) {
            super(interfaceC3012d);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KotlinExtensions.suspendAndThrow(null, this);
        }
    }

    @Nullable
    public static final <T> Object await(@NotNull Call<T> call, @NotNull InterfaceC3012d<? super T> interfaceC3012d) {
        final C2576m c2576m = new C2576m(C3032c.m10174b(interfaceC3012d), 1);
        c2576m.mo8590h(new C3036x19835f10(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$2$2
            @Override // retrofit2.Callback
            public void onFailure(@NotNull Call<T> call2, @NotNull Throwable t3) {
                C2769l.m9242f(call2, "call");
                C2769l.m9242f(t3, "t");
                InterfaceC2572l interfaceC2572l = c2576m;
                C2919l.a aVar = C2919l.f11409a;
                interfaceC2572l.resumeWith(C2919l.m9989a(C2920m.m9993a(t3)));
            }

            @Override // retrofit2.Callback
            public void onResponse(@NotNull Call<T> call2, @NotNull Response<T> response) {
                C2769l.m9242f(call2, "call");
                C2769l.m9242f(response, "response");
                if (!response.isSuccessful()) {
                    InterfaceC2572l interfaceC2572l = c2576m;
                    HttpException httpException = new HttpException(response);
                    C2919l.a aVar = C2919l.f11409a;
                    interfaceC2572l.resumeWith(C2919l.m9989a(C2920m.m9993a(httpException)));
                    return;
                }
                T tBody = response.body();
                if (tBody != null) {
                    InterfaceC2572l interfaceC2572l2 = c2576m;
                    C2919l.a aVar2 = C2919l.f11409a;
                    interfaceC2572l2.resumeWith(C2919l.m9989a(tBody));
                    return;
                }
                Object objTag = call2.request().tag(Invocation.class);
                if (objTag == null) {
                    C2769l.m9250n();
                }
                C2769l.m9238b(objTag, "call.request().tag(Invocation::class.java)!!");
                Method method = ((Invocation) objTag).method();
                StringBuilder sb = new StringBuilder();
                sb.append("Response from ");
                C2769l.m9238b(method, "method");
                Class<?> declaringClass = method.getDeclaringClass();
                C2769l.m9238b(declaringClass, "method.declaringClass");
                sb.append(declaringClass.getName());
                sb.append('.');
                sb.append(method.getName());
                sb.append(" was null but response body type was declared as non-null");
                C2912e c2912e = new C2912e(sb.toString());
                InterfaceC2572l interfaceC2572l3 = c2576m;
                C2919l.a aVar3 = C2919l.f11409a;
                interfaceC2572l3.resumeWith(C2919l.m9989a(C2920m.m9993a(c2912e)));
            }
        });
        Object objM8621s = c2576m.m8621s();
        if (objM8621s == C3033d.m10175c()) {
            C2752h.m9217c(interfaceC3012d);
        }
        return objM8621s;
    }

    @Nullable
    public static final <T> Object awaitNullable(@NotNull Call<T> call, @NotNull InterfaceC3012d<? super T> interfaceC3012d) {
        final C2576m c2576m = new C2576m(C3032c.m10174b(interfaceC3012d), 1);
        c2576m.mo8590h(new C3037x19835f11(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$4$2
            @Override // retrofit2.Callback
            public void onFailure(@NotNull Call<T> call2, @NotNull Throwable t3) {
                C2769l.m9242f(call2, "call");
                C2769l.m9242f(t3, "t");
                InterfaceC2572l interfaceC2572l = c2576m;
                C2919l.a aVar = C2919l.f11409a;
                interfaceC2572l.resumeWith(C2919l.m9989a(C2920m.m9993a(t3)));
            }

            @Override // retrofit2.Callback
            public void onResponse(@NotNull Call<T> call2, @NotNull Response<T> response) {
                C2769l.m9242f(call2, "call");
                C2769l.m9242f(response, "response");
                if (response.isSuccessful()) {
                    InterfaceC2572l interfaceC2572l = c2576m;
                    T tBody = response.body();
                    C2919l.a aVar = C2919l.f11409a;
                    interfaceC2572l.resumeWith(C2919l.m9989a(tBody));
                    return;
                }
                InterfaceC2572l interfaceC2572l2 = c2576m;
                HttpException httpException = new HttpException(response);
                C2919l.a aVar2 = C2919l.f11409a;
                interfaceC2572l2.resumeWith(C2919l.m9989a(C2920m.m9993a(httpException)));
            }
        });
        Object objM8621s = c2576m.m8621s();
        if (objM8621s == C3033d.m10175c()) {
            C2752h.m9217c(interfaceC3012d);
        }
        return objM8621s;
    }

    @Nullable
    public static final <T> Object awaitResponse(@NotNull Call<T> call, @NotNull InterfaceC3012d<? super Response<T>> interfaceC3012d) {
        final C2576m c2576m = new C2576m(C3032c.m10174b(interfaceC3012d), 1);
        c2576m.mo8590h(new C3038xc95e9eb1(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$awaitResponse$2$2
            @Override // retrofit2.Callback
            public void onFailure(@NotNull Call<T> call2, @NotNull Throwable t3) {
                C2769l.m9242f(call2, "call");
                C2769l.m9242f(t3, "t");
                InterfaceC2572l interfaceC2572l = c2576m;
                C2919l.a aVar = C2919l.f11409a;
                interfaceC2572l.resumeWith(C2919l.m9989a(C2920m.m9993a(t3)));
            }

            @Override // retrofit2.Callback
            public void onResponse(@NotNull Call<T> call2, @NotNull Response<T> response) {
                C2769l.m9242f(call2, "call");
                C2769l.m9242f(response, "response");
                InterfaceC2572l interfaceC2572l = c2576m;
                C2919l.a aVar = C2919l.f11409a;
                interfaceC2572l.resumeWith(C2919l.m9989a(response));
            }
        });
        Object objM8621s = c2576m.m8621s();
        if (objM8621s == C3033d.m10175c()) {
            C2752h.m9217c(interfaceC3012d);
        }
        return objM8621s;
    }

    public static final /* synthetic */ <T> T create(@NotNull Retrofit create) {
        C2769l.m9242f(create, "$this$create");
        C2769l.m9245i(4, "T");
        return (T) create.create(Object.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object suspendAndThrow(@org.jetbrains.annotations.NotNull final java.lang.Exception r4, @org.jetbrains.annotations.NotNull p142q2.InterfaceC3012d<?> r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof retrofit2.KotlinExtensions.C30401
            if (r0 == 0) goto L13
            r0 = r5
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = (retrofit2.KotlinExtensions.C30401) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = new retrofit2.KotlinExtensions$suspendAndThrow$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = p146r2.C3031b.m10172c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            java.lang.Exception r4 = (java.lang.Exception) r4
            p128o2.C2920m.m9994b(r5)
            goto L5c
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            p128o2.C2920m.m9994b(r5)
            r0.L$0 = r4
            r0.label = r3
            f3.e0 r5 = p087f3.C2605v0.m8750a()
            q2.g r2 = r0.getContext()
            retrofit2.KotlinExtensions$suspendAndThrow$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1 r3 = new retrofit2.KotlinExtensions$suspendAndThrow$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1
            r3.<init>()
            r5.mo2905J(r2, r3)
            java.lang.Object r4 = p146r2.C3031b.m10172c()
            java.lang.Object r5 = p146r2.C3031b.m10172c()
            if (r4 != r5) goto L59
            kotlin.coroutines.jvm.internal.C2752h.m9217c(r0)
        L59:
            if (r4 != r1) goto L5c
            return r1
        L5c:
            o2.r r4 = p128o2.C2925r.f11415a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.KotlinExtensions.suspendAndThrow(java.lang.Exception, q2.d):java.lang.Object");
    }
}
