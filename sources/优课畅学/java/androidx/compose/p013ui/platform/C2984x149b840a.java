package androidx.compose.p013ui.platform;

import android.view.View;
import androidx.compose.p013ui.platform.WindowRecomposer_androidKt;
import androidx.compose.runtime.Recomposer;
import androidx.lifecycle.LifecycleOwner;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.InterfaceC9212n;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9280q;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", m17801f = "WindowRecomposer.android.kt", m17802l = {388}, m17803m = "invokeSuspend")
/* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 */
/* loaded from: classes2.dex */
public final class C2984x149b840a extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ Recomposer $recomposer;
    final /* synthetic */ WindowRecomposer_androidKt.C29832 $self;
    final /* synthetic */ LifecycleOwner $source;
    final /* synthetic */ Ref$ObjectRef<MotionDurationScaleImpl> $systemDurationScaleSettingConsumer;
    final /* synthetic */ View $this_createLifecycleAwareWindowRecomposer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2984x149b840a(Ref$ObjectRef<MotionDurationScaleImpl> ref$ObjectRef, Recomposer recomposer, LifecycleOwner lifecycleOwner, WindowRecomposer_androidKt.C29832 c29832, View view, InterfaceC9324c<? super C2984x149b840a> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$systemDurationScaleSettingConsumer = ref$ObjectRef;
        this.$recomposer = recomposer;
        this.$source = lifecycleOwner;
        this.$self = c29832;
        this.$this_createLifecycleAwareWindowRecomposer = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        C2984x149b840a c2984x149b840a = new C2984x149b840a(this.$systemDurationScaleSettingConsumer, this.$recomposer, this.$source, this.$self, this.$this_createLifecycleAwareWindowRecomposer, interfaceC9324c);
        c2984x149b840a.L$0 = obj;
        return c2984x149b840a;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((C2984x149b840a) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12, types: [kotlinx.coroutines.n] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        InterfaceC9212n interfaceC9212n;
        InterfaceC9212n interfaceC9212nM14861d;
        Object objM17291f = AbstractC9434a.m17291f();
        ?? r12 = this.label;
        try {
            if (r12 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.L$0;
                try {
                    MotionDurationScaleImpl motionDurationScaleImpl = (MotionDurationScaleImpl) this.$systemDurationScaleSettingConsumer.f17473a;
                    if (motionDurationScaleImpl != null) {
                        InterfaceC9280q animationScaleFlowFor = WindowRecomposer_androidKt.getAnimationScaleFlowFor(this.$this_createLifecycleAwareWindowRecomposer.getContext().getApplicationContext());
                        motionDurationScaleImpl.setScaleFactor(((Number) animationScaleFlowFor.getValue()).floatValue());
                        interfaceC9212nM14861d = AbstractC8839h.m14861d(interfaceC8822b0, null, null, new C2985x93d788e4(animationScaleFlowFor, motionDurationScaleImpl, null), 3, null);
                    } else {
                        interfaceC9212nM14861d = null;
                    }
                    Recomposer recomposer = this.$recomposer;
                    this.L$0 = interfaceC9212nM14861d;
                    this.label = 1;
                    r12 = interfaceC9212nM14861d;
                    if (recomposer.runRecomposeAndApplyChanges(this) == objM17291f) {
                        return objM17291f;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC9212n = null;
                    if (interfaceC9212n != null) {
                        InterfaceC9212n.a.m16777a(interfaceC9212n, null, 1, null);
                    }
                    this.$source.getLifecycle().removeObserver(this.$self);
                    throw th;
                }
            } else {
                if (r12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC9212n interfaceC9212n2 = (InterfaceC9212n) this.L$0;
                AbstractC9079b.m15926b(obj);
                r12 = interfaceC9212n2;
            }
            if (r12 != 0) {
                InterfaceC9212n.a.m16777a(r12, null, 1, null);
            }
            this.$source.getLifecycle().removeObserver(this.$self);
            return C8736p.f16368a;
        } catch (Throwable th3) {
            th = th3;
            interfaceC9212n = r12;
        }
    }
}
