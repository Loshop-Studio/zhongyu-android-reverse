package kotlinx.coroutines.flow;

import com.tencent.smtt.sdk.TbsListener;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

/* loaded from: classes5.dex */
public final class FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 implements InterfaceC9266c {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC9266c f17788a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC10574p f17789b;

    @InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", m17801f = "Limit.kt", m17802l = {TbsListener.ErrorCode.DOWNLOAD_RETRYTIMES302_EXCEED}, m17803m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1 */
    public static final class C91761 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f17790a;

        /* renamed from: b */
        public int f17791b;

        /* renamed from: d */
        public Object f17793d;

        public C91761(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f17790a = obj;
            this.f17791b |= Integer.MIN_VALUE;
            return FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(InterfaceC9266c interfaceC9266c, InterfaceC10574p interfaceC10574p) {
        this.f17788a = interfaceC9266c;
        this.f17789b = interfaceC10574p;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p169l8.InterfaceC9266c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(p169l8.InterfaceC9267d r6, p179m7.InterfaceC9324c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1.C91761
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1.C91761) r0
            int r1 = r0.f17791b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17791b = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f17790a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f17791b
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f17793d
            kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 r6 = (kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1) r6
            kotlin.AbstractC9079b.m15926b(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
            goto L53
        L2d:
            r7 = move-exception
            goto L50
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.AbstractC9079b.m15926b(r7)
            l8.c r7 = r5.f17788a
            kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 r2 = new kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1
            x7.p r4 = r5.f17789b
            r2.<init>(r4, r6)
            r0.f17793d = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4e
            r0.f17791b = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4e
            java.lang.Object r6 = r7.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4e
            if (r6 != r1) goto L53
            return r1
        L4e:
            r7 = move-exception
            r6 = r2
        L50:
            p180m8.AbstractC9335h.m17167a(r7, r6)
        L53:
            h7.p r6 = p123h7.C8736p.f16368a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1.collect(l8.d, m7.c):java.lang.Object");
    }
}
