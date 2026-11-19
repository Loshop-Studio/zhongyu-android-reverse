package androidx.compose.p014ui.platform;

import androidx.compose.runtime.SnapshotStateKt;
import kotlin.AbstractC9924b;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3", m26211f = "PlatformTextInputModifierNode.kt", m26212l = {237}, m26213m = "invokeSuspend")
/* renamed from: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3 */
/* loaded from: classes2.dex */
public final class C2987x61f42b4f extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ PlatformTextInputSessionScope $parentSession;
    final /* synthetic */ PlatformTextInputMethodRequest $request;
    int label;
    final /* synthetic */ ChainedPlatformTextInputInterceptor this$0;

    @InterfaceC11829d(m26210c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2", m26211f = "PlatformTextInputModifierNode.kt", m26212l = {238}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ PlatformTextInputSessionScope $parentSession;
        final /* synthetic */ PlatformTextInputMethodRequest $request;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PlatformTextInputMethodRequest platformTextInputMethodRequest, PlatformTextInputSessionScope platformTextInputSessionScope, InterfaceC11588c<? super AnonymousClass2> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$request = platformTextInputMethodRequest;
            this.$parentSession = platformTextInputSessionScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$request, this.$parentSession, interfaceC11588c);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(PlatformTextInputInterceptor platformTextInputInterceptor, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((AnonymousClass2) create(platformTextInputInterceptor, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                PlatformTextInputInterceptor platformTextInputInterceptor = (PlatformTextInputInterceptor) this.L$0;
                PlatformTextInputMethodRequest platformTextInputMethodRequest = this.$request;
                PlatformTextInputSessionScope platformTextInputSessionScope = this.$parentSession;
                this.label = 1;
                if (platformTextInputInterceptor.interceptStartInputMethod(platformTextInputMethodRequest, platformTextInputSessionScope, this) == objM25952f) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2987x61f42b4f(ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor, PlatformTextInputMethodRequest platformTextInputMethodRequest, PlatformTextInputSessionScope platformTextInputSessionScope, InterfaceC11588c<? super C2987x61f42b4f> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = chainedPlatformTextInputInterceptor;
        this.$request = platformTextInputMethodRequest;
        this.$parentSession = platformTextInputSessionScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new C2987x61f42b4f(this.this$0, this.$request, this.$parentSession, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            final ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor = this.this$0;
            InterfaceC11594c interfaceC11594cSnapshotFlow = SnapshotStateKt.snapshotFlow(new InterfaceC9529a() { // from class: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3.1
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final PlatformTextInputInterceptor invoke() {
                    return chainedPlatformTextInputInterceptor.getInterceptor();
                }
            });
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$request, this.$parentSession, null);
            this.label = 1;
            if (AbstractC11596e.m25559i(interfaceC11594cSnapshotFlow, anonymousClass2, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        throw new IllegalStateException("Interceptors flow should never terminate.");
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(C10786q c10786q, InterfaceC11588c<?> interfaceC11588c) {
        return ((C2987x61f42b4f) create(c10786q, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
