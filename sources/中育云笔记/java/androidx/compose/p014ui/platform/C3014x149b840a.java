package androidx.compose.p014ui.platform;

import android.view.View;
import androidx.compose.p014ui.platform.WindowRecomposer_androidKt;
import androidx.compose.runtime.Recomposer;
import androidx.lifecycle.LifecycleOwner;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11612u;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", m26211f = "WindowRecomposer.android.kt", m26212l = {388}, m26213m = "invokeSuspend")
/* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 */
/* loaded from: classes2.dex */
public final class C3014x149b840a extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ Recomposer $recomposer;
    final /* synthetic */ WindowRecomposer_androidKt.C30132 $self;
    final /* synthetic */ LifecycleOwner $source;
    final /* synthetic */ Ref$ObjectRef<MotionDurationScaleImpl> $systemDurationScaleSettingConsumer;
    final /* synthetic */ View $this_createLifecycleAwareWindowRecomposer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3014x149b840a(Ref$ObjectRef<MotionDurationScaleImpl> ref$ObjectRef, Recomposer recomposer, LifecycleOwner lifecycleOwner, WindowRecomposer_androidKt.C30132 c30132, View view, InterfaceC11588c<? super C3014x149b840a> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$systemDurationScaleSettingConsumer = ref$ObjectRef;
        this.$recomposer = recomposer;
        this.$source = lifecycleOwner;
        this.$self = c30132;
        this.$this_createLifecycleAwareWindowRecomposer = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        C3014x149b840a c3014x149b840a = new C3014x149b840a(this.$systemDurationScaleSettingConsumer, this.$recomposer, this.$source, this.$self, this.$this_createLifecycleAwareWindowRecomposer, interfaceC11588c);
        c3014x149b840a.L$0 = obj;
        return c3014x149b840a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12, types: [kotlinx.coroutines.g] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        InterfaceC10045g interfaceC10045g;
        InterfaceC10045g interfaceC10045gM24726d;
        Object objM25952f = AbstractC11725a.m25952f();
        ?? r12 = this.label;
        try {
            if (r12 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
                try {
                    MotionDurationScaleImpl motionDurationScaleImpl = (MotionDurationScaleImpl) this.$systemDurationScaleSettingConsumer.f23402c;
                    if (motionDurationScaleImpl != null) {
                        InterfaceC11612u animationScaleFlowFor = WindowRecomposer_androidKt.getAnimationScaleFlowFor(this.$this_createLifecycleAwareWindowRecomposer.getContext().getApplicationContext());
                        motionDurationScaleImpl.setScaleFactor(((Number) animationScaleFlowFor.getValue()).floatValue());
                        interfaceC10045gM24726d = AbstractC11117h.m24726d(interfaceC11122i0, null, null, new C3015x93d788e4(animationScaleFlowFor, motionDurationScaleImpl, null), 3, null);
                    } else {
                        interfaceC10045gM24726d = null;
                    }
                    Recomposer recomposer = this.$recomposer;
                    this.L$0 = interfaceC10045gM24726d;
                    this.label = 1;
                    r12 = interfaceC10045gM24726d;
                    if (recomposer.runRecomposeAndApplyChanges(this) == objM25952f) {
                        return objM25952f;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC10045g = null;
                    if (interfaceC10045g != null) {
                        InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
                    }
                    this.$source.getLifecycle().removeObserver(this.$self);
                    throw th;
                }
            } else {
                if (r12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC10045g interfaceC10045g2 = (InterfaceC10045g) this.L$0;
                AbstractC9924b.m20071b(obj);
                r12 = interfaceC10045g2;
            }
            if (r12 != 0) {
                InterfaceC10045g.a.m20900a(r12, null, 1, null);
            }
            this.$source.getLifecycle().removeObserver(this.$self);
            return C10786q.f26013a;
        } catch (Throwable th3) {
            th = th3;
            interfaceC10045g = r12;
        }
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((C3014x149b840a) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
