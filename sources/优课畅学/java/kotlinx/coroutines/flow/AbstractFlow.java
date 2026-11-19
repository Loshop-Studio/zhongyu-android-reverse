package kotlinx.coroutines.flow;

import com.tencent.smtt.sdk.TbsListener;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

/* loaded from: classes5.dex */
public abstract class AbstractFlow implements InterfaceC9266c {

    @InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.AbstractFlow", m17801f = "Flow.kt", m17802l = {TbsListener.ErrorCode.DEXOAT_EXCEPTION}, m17803m = "collect")
    /* renamed from: kotlinx.coroutines.flow.AbstractFlow$collect$1 */
    public static final class C91671 extends ContinuationImpl {

        /* renamed from: a */
        public Object f17683a;

        /* renamed from: b */
        public /* synthetic */ Object f17684b;

        /* renamed from: d */
        public int f17686d;

        public C91671(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f17684b = obj;
            this.f17686d |= Integer.MIN_VALUE;
            return AbstractFlow.this.collect(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p169l8.InterfaceC9266c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(p169l8.InterfaceC9267d r6, p179m7.InterfaceC9324c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.AbstractFlow.C91671
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.AbstractFlow$collect$1 r0 = (kotlinx.coroutines.flow.AbstractFlow.C91671) r0
            int r1 = r0.f17686d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17686d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.AbstractFlow$collect$1 r0 = new kotlinx.coroutines.flow.AbstractFlow$collect$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f17684b
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f17686d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f17683a
            kotlinx.coroutines.flow.internal.SafeCollector r6 = (kotlinx.coroutines.flow.internal.SafeCollector) r6
            kotlin.AbstractC9079b.m15926b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.AbstractC9079b.m15926b(r7)
            kotlinx.coroutines.flow.internal.SafeCollector r7 = new kotlinx.coroutines.flow.internal.SafeCollector
            kotlin.coroutines.d r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f17683a = r7     // Catch: java.lang.Throwable -> L55
            r0.f17686d = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.mo16568f(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            h7.p r6 = p123h7.C8736p.f16368a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.AbstractFlow.collect(l8.d, m7.c):java.lang.Object");
    }

    /* renamed from: f */
    public abstract Object mo16568f(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c);
}
