package androidx.datastore.core;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p123h7.C8736p;
import p135i8.AbstractC8875t;
import p135i8.InterfaceC8869r;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p235r8.AbstractC9943b;
import p235r8.InterfaceC9942a;

/* loaded from: classes2.dex */
public abstract class RunOnce {
    private final InterfaceC9942a runMutex = AbstractC9943b.m18571b(false, 1, null);
    private final InterfaceC8869r didRun = AbstractC8875t.m14913b(null, 1, null);

    @InterfaceC9539d(m17800c = "androidx.datastore.core.RunOnce", m17801f = "DataStoreImpl.kt", m17802l = {544, 497}, m17803m = "runIfNeeded")
    /* renamed from: androidx.datastore.core.RunOnce$runIfNeeded$1 */
    public static final class C37591 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C37591(InterfaceC9324c<? super C37591> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RunOnce.this.runIfNeeded(this);
        }
    }

    public final Object awaitComplete(InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objMo14833u = this.didRun.mo14833u(interfaceC9324c);
        return objMo14833u == AbstractC9434a.m17291f() ? objMo14833u : C8736p.f16368a;
    }

    public abstract Object doRun(InterfaceC9324c<? super C8736p> interfaceC9324c);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runIfNeeded(p179m7.InterfaceC9324c<? super p123h7.C8736p> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.datastore.core.RunOnce.C37591
            if (r0 == 0) goto L13
            r0 = r7
            androidx.datastore.core.RunOnce$runIfNeeded$1 r0 = (androidx.datastore.core.RunOnce.C37591) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.RunOnce$runIfNeeded$1 r0 = new androidx.datastore.core.RunOnce$runIfNeeded$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.L$1
            r8.a r1 = (p235r8.InterfaceC9942a) r1
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.RunOnce r0 = (androidx.datastore.core.RunOnce) r0
            kotlin.AbstractC9079b.m15926b(r7)     // Catch: java.lang.Throwable -> L35
            goto L8b
        L35:
            r7 = move-exception
            goto L96
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3f:
            java.lang.Object r2 = r0.L$1
            r8.a r2 = (p235r8.InterfaceC9942a) r2
            java.lang.Object r4 = r0.L$0
            androidx.datastore.core.RunOnce r4 = (androidx.datastore.core.RunOnce) r4
            kotlin.AbstractC9079b.m15926b(r7)
            r7 = r2
            goto L6a
        L4c:
            kotlin.AbstractC9079b.m15926b(r7)
            i8.r r7 = r6.didRun
            boolean r7 = r7.mo16289l()
            if (r7 == 0) goto L5a
            h7.p r7 = p123h7.C8736p.f16368a
            return r7
        L5a:
            r8.a r7 = r6.runMutex
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r2 = r7.lock(r5, r0)
            if (r2 != r1) goto L69
            goto L88
        L69:
            r4 = r6
        L6a:
            i8.r r2 = r4.didRun     // Catch: java.lang.Throwable -> L78
            boolean r2 = r2.mo16289l()     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto L7c
            h7.p r0 = p123h7.C8736p.f16368a     // Catch: java.lang.Throwable -> L78
            r7.unlock(r5)
            return r0
        L78:
            r0 = move-exception
            r1 = r7
            r7 = r0
            goto L96
        L7c:
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L78
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L78
            r0.label = r3     // Catch: java.lang.Throwable -> L78
            java.lang.Object r0 = r4.doRun(r0)     // Catch: java.lang.Throwable -> L78
            if (r0 != r1) goto L89
        L88:
            return r1
        L89:
            r1 = r7
            r0 = r4
        L8b:
            i8.r r7 = r0.didRun     // Catch: java.lang.Throwable -> L35
            h7.p r0 = p123h7.C8736p.f16368a     // Catch: java.lang.Throwable -> L35
            r7.mo14905h(r0)     // Catch: java.lang.Throwable -> L35
            r1.unlock(r5)
            return r0
        L96:
            r1.unlock(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.RunOnce.runIfNeeded(m7.c):java.lang.Object");
    }
}
