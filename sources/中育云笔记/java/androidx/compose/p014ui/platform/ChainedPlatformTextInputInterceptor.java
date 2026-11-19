package androidx.compose.p014ui.platform;

import androidx.compose.p014ui.SessionMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.AbstractC9924b;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@Stable
/* loaded from: classes2.dex */
final class ChainedPlatformTextInputInterceptor {
    private final MutableState interceptor$delegate;
    private final ChainedPlatformTextInputInterceptor parent;

    @InterfaceC11829d(m26210c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor", m26211f = "PlatformTextInputModifierNode.kt", m26212l = {219}, m26213m = "textInputSession")
    /* renamed from: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$1 */
    public static final class C29831 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29831(InterfaceC11588c<? super C29831> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChainedPlatformTextInputInterceptor.this.textInputSession(null, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2", m26211f = "PlatformTextInputModifierNode.kt", m26212l = {248}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2 */
    public static final class C29842 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9544p $session;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ChainedPlatformTextInputInterceptor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29842(InterfaceC9544p interfaceC9544p, ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor, InterfaceC11588c<? super C29842> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$session = interfaceC9544p;
            this.this$0 = chainedPlatformTextInputInterceptor;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C29842 c29842 = new C29842(this.$session, this.this$0, interfaceC11588c);
            c29842.L$0 = obj;
            return c29842;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(PlatformTextInputSessionScope platformTextInputSessionScope, InterfaceC11588c<?> interfaceC11588c) {
            return ((C29842) create(platformTextInputSessionScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1 chainedPlatformTextInputInterceptor$textInputSession$2$scope$1 = new ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1((PlatformTextInputSessionScope) this.L$0, SessionMutex.m30449constructorimpl(), this.this$0);
                InterfaceC9544p interfaceC9544p = this.$session;
                this.label = 1;
                if (interfaceC9544p.invoke(chainedPlatformTextInputInterceptor$textInputSession$2$scope$1, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public ChainedPlatformTextInputInterceptor(PlatformTextInputInterceptor platformTextInputInterceptor, ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor) {
        this.parent = chainedPlatformTextInputInterceptor;
        this.interceptor$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(platformTextInputInterceptor, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PlatformTextInputInterceptor getInterceptor() {
        return (PlatformTextInputInterceptor) this.interceptor$delegate.getValue();
    }

    private final void setInterceptor(PlatformTextInputInterceptor platformTextInputInterceptor) {
        this.interceptor$delegate.setValue(platformTextInputInterceptor);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object textInputSession(androidx.compose.p014ui.node.Owner r6, p181hd.InterfaceC9544p r7, vc.InterfaceC11588c<?> r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.p014ui.platform.ChainedPlatformTextInputInterceptor.C29831
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$1 r0 = (androidx.compose.p014ui.platform.ChainedPlatformTextInputInterceptor.C29831) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$1 r0 = new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            kotlin.AbstractC9924b.m20071b(r8)
            goto L45
        L31:
            kotlin.AbstractC9924b.m20071b(r8)
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor r8 = r5.parent
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2 r2 = new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2
            r4 = 0
            r2.<init>(r7, r5, r4)
            r0.label = r3
            java.lang.Object r6 = androidx.compose.p014ui.platform.PlatformTextInputModifierNodeKt.access$interceptedTextInputSession(r6, r8, r2, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.platform.ChainedPlatformTextInputInterceptor.textInputSession(androidx.compose.ui.node.Owner, hd.p, vc.c):java.lang.Object");
    }

    public final void updateInterceptor(PlatformTextInputInterceptor platformTextInputInterceptor) {
        setInterceptor(platformTextInputInterceptor);
    }
}
