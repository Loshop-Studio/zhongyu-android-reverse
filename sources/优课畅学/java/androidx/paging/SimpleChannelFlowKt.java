package androidx.paging;

import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.AbstractC9165e;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.AbstractC9269f;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public final class SimpleChannelFlowKt {

    @InterfaceC9539d(m17800c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1", m17801f = "SimpleChannelFlow.kt", m17802l = {49}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1 */
    public static final class C43861 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10574p $block;
        private /* synthetic */ Object L$0;
        int label;

        @InterfaceC9539d(m17800c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1", m17801f = "SimpleChannelFlow.kt", m17802l = {ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL, 68}, m17803m = "invokeSuspend")
        /* renamed from: androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {
            final /* synthetic */ InterfaceC9267d $$this$flow;
            final /* synthetic */ InterfaceC10574p $block;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC9267d interfaceC9267d, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.$$this$flow = interfaceC9267d;
                this.$block = interfaceC10574p;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$flow, this.$block, interfaceC9324c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
            
                if (r6.emit(r13, r12) == r0) goto L20;
             */
            /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007b -> B:7:0x001a). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
                /*
                    r12 = this;
                    java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                    int r1 = r12.label
                    r2 = 2
                    r3 = 1
                    r4 = 0
                    if (r1 == 0) goto L31
                    if (r1 == r3) goto L25
                    if (r1 != r2) goto L1d
                    java.lang.Object r1 = r12.L$1
                    k8.b r1 = (p157k8.InterfaceC9066b) r1
                    java.lang.Object r5 = r12.L$0
                    kotlinx.coroutines.n r5 = (kotlinx.coroutines.InterfaceC9212n) r5
                    kotlin.AbstractC9079b.m15926b(r13)
                L1a:
                    r13 = r1
                    r1 = r5
                    goto L52
                L1d:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L25:
                    java.lang.Object r1 = r12.L$1
                    k8.b r1 = (p157k8.InterfaceC9066b) r1
                    java.lang.Object r5 = r12.L$0
                    kotlinx.coroutines.n r5 = (kotlinx.coroutines.InterfaceC9212n) r5
                    kotlin.AbstractC9079b.m15926b(r13)
                    goto L63
                L31:
                    kotlin.AbstractC9079b.m15926b(r13)
                    java.lang.Object r13 = r12.L$0
                    r5 = r13
                    i8.b0 r5 = (p135i8.InterfaceC8822b0) r5
                    r13 = 0
                    r1 = 6
                    kotlinx.coroutines.channels.a r13 = kotlinx.coroutines.channels.AbstractC9159b.m16529b(r13, r4, r4, r1, r4)
                    androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1 r8 = new androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1
                    x7.p r1 = r12.$block
                    r8.<init>(r13, r1, r4)
                    r9 = 3
                    r10 = 0
                    r6 = 0
                    r7 = 0
                    kotlinx.coroutines.n r1 = p135i8.AbstractC8833f.m14845d(r5, r6, r7, r8, r9, r10)
                    k8.b r13 = r13.iterator()
                L52:
                    r12.L$0 = r1
                    r12.L$1 = r13
                    r12.label = r3
                    java.lang.Object r5 = r13.mo15880a(r12)
                    if (r5 != r0) goto L5f
                    goto L7d
                L5f:
                    r11 = r1
                    r1 = r13
                    r13 = r5
                    r5 = r11
                L63:
                    java.lang.Boolean r13 = (java.lang.Boolean) r13
                    boolean r13 = r13.booleanValue()
                    if (r13 == 0) goto L7e
                    java.lang.Object r13 = r1.next()
                    l8.d r6 = r12.$$this$flow
                    r12.L$0 = r5
                    r12.L$1 = r1
                    r12.label = r2
                    java.lang.Object r13 = r6.emit(r13, r12)
                    if (r13 != r0) goto L1a
                L7d:
                    return r0
                L7e:
                    kotlinx.coroutines.InterfaceC9212n.a.m16777a(r5, r4, r3, r4)
                    h7.p r13 = p123h7.C8736p.f16368a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SimpleChannelFlowKt.C43861.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43861(InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C43861> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$block = interfaceC10574p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C43861 c43861 = new C43861(this.$block, interfaceC9324c);
            c43861.L$0 = obj;
            return c43861;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1((InterfaceC9267d) this.L$0, this.$block, null);
                this.label = 1;
                if (AbstractC9165e.m16556e(anonymousClass1, this) == objM17291f) {
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
        public final Object invoke(InterfaceC9267d interfaceC9267d, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C43861) create(interfaceC9267d, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    public static final <T> InterfaceC9266c simpleChannelFlow(InterfaceC10574p block) {
        AbstractC9133u.m16133g(block, "block");
        return AbstractC9269f.m17038b(AbstractC9268e.m16990B(new C43861(block, null)), -2, null, 2, null);
    }
}
