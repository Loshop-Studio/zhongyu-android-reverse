package kotlinx.coroutines.flow;

import com.tencent.smtt.sdk.TbsListener;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p169l8.InterfaceC9275l;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

/* loaded from: classes5.dex */
public final class SubscribedSharedFlow implements InterfaceC9275l {

    /* renamed from: a */
    public final InterfaceC9275l f17979a;

    /* renamed from: b */
    public final InterfaceC10574p f17980b;

    @InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.SubscribedSharedFlow", m17801f = "Share.kt", m17802l = {TbsListener.ErrorCode.INFO_CAN_NOT_LOAD_TBS}, m17803m = "collect")
    /* renamed from: kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1 */
    public static final class C91971 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f17981a;

        /* renamed from: c */
        public int f17983c;

        public C91971(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f17981a = obj;
            this.f17983c |= Integer.MIN_VALUE;
            return SubscribedSharedFlow.this.collect(null, this);
        }
    }

    public SubscribedSharedFlow(InterfaceC9275l interfaceC9275l, InterfaceC10574p interfaceC10574p) {
        this.f17979a = interfaceC9275l;
        this.f17980b = interfaceC10574p;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p169l8.InterfaceC9275l, p169l8.InterfaceC9266c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(p169l8.InterfaceC9267d r6, p179m7.InterfaceC9324c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.SubscribedSharedFlow.C91971
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1 r0 = (kotlinx.coroutines.flow.SubscribedSharedFlow.C91971) r0
            int r1 = r0.f17983c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17983c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1 r0 = new kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f17981a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f17983c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            kotlin.AbstractC9079b.m15926b(r7)
            goto L46
        L31:
            kotlin.AbstractC9079b.m15926b(r7)
            l8.l r7 = r5.f17979a
            kotlinx.coroutines.flow.SubscribedFlowCollector r2 = new kotlinx.coroutines.flow.SubscribedFlowCollector
            x7.p r4 = r5.f17980b
            r2.<init>(r6, r4)
            r0.f17983c = r3
            java.lang.Object r6 = r7.collect(r2, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SubscribedSharedFlow.collect(l8.d, m7.c):java.lang.Object");
    }

    @Override // p169l8.InterfaceC9275l
    /* renamed from: d */
    public List mo16672d() {
        return this.f17979a.mo16672d();
    }
}
