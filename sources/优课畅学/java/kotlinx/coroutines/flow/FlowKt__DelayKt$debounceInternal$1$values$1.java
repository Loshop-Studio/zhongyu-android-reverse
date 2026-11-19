package kotlinx.coroutines.flow;

import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p157k8.InterfaceC9071g;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", m17801f = "Delay.kt", m17802l = {204}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class FlowKt__DelayKt$debounceInternal$1$values$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f17734a;

    /* renamed from: b */
    public /* synthetic */ Object f17735b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC9266c f17736c;

    /* renamed from: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1 */
    public static final class C91711 implements InterfaceC9267d {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC9071g f17737a;

        public C91711(InterfaceC9071g interfaceC9071g) {
            this.f17737a = interfaceC9071g;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p169l8.InterfaceC9267d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r5, p179m7.InterfaceC9324c r6) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1) r0
                int r1 = r0.f17740c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f17740c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f17738a
                java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                int r2 = r0.f17740c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.AbstractC9079b.m15926b(r6)
                goto L43
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.AbstractC9079b.m15926b(r6)
                k8.g r6 = r4.f17737a
                if (r5 != 0) goto L3a
                n8.d0 r5 = p180m8.AbstractC9339l.f18395a
            L3a:
                r0.f17740c = r3
                java.lang.Object r5 = r6.send(r5, r0)
                if (r5 != r1) goto L43
                return r1
            L43:
                h7.p r5 = p123h7.C8736p.f16368a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1.C91711.emit(java.lang.Object, m7.c):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$values$1(InterfaceC9266c interfaceC9266c, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f17736c = interfaceC9266c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        FlowKt__DelayKt$debounceInternal$1$values$1 flowKt__DelayKt$debounceInternal$1$values$1 = new FlowKt__DelayKt$debounceInternal$1$values$1(this.f17736c, interfaceC9324c);
        flowKt__DelayKt$debounceInternal$1$values$1.f17735b = obj;
        return flowKt__DelayKt$debounceInternal$1$values$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f17734a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC9071g interfaceC9071g = (InterfaceC9071g) this.f17735b;
            InterfaceC9266c interfaceC9266c = this.f17736c;
            C91711 c91711 = new C91711(interfaceC9071g);
            this.f17734a = 1;
            if (interfaceC9266c.collect(c91711, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        return C8736p.f16368a;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC9071g interfaceC9071g, InterfaceC9324c interfaceC9324c) {
        return ((FlowKt__DelayKt$debounceInternal$1$values$1) create(interfaceC9071g, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }
}
