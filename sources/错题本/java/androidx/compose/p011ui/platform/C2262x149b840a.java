package androidx.compose.p011ui.platform;

import android.view.LifecycleOwner;
import android.view.View;
import androidx.compose.p011ui.platform.WindowRecomposer_androidKt;
import androidx.compose.runtime.Recomposer;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
@DebugMetadata(m5302c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", m5303f = "WindowRecomposer.android.kt", m5304i = {0}, m5305l = {388}, m5306m = "invokeSuspend", m5307n = {"durationScaleJob"}, m5308s = {"L$0"})
/* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 */
/* loaded from: classes2.dex */
public final class C2262x149b840a extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ Recomposer $recomposer;
    final /* synthetic */ WindowRecomposer_androidKt.C22612 $self;
    final /* synthetic */ LifecycleOwner $source;
    final /* synthetic */ Ref$ObjectRef<MotionDurationScaleImpl> $systemDurationScaleSettingConsumer;
    final /* synthetic */ View $this_createLifecycleAwareWindowRecomposer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2262x149b840a(Ref$ObjectRef<MotionDurationScaleImpl> ref$ObjectRef, Recomposer recomposer, LifecycleOwner lifecycleOwner, WindowRecomposer_androidKt.C22612 c22612, View view, InterfaceC5631c<? super C2262x149b840a> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$systemDurationScaleSettingConsumer = ref$ObjectRef;
        this.$recomposer = recomposer;
        this.$source = lifecycleOwner;
        this.$self = c22612;
        this.$this_createLifecycleAwareWindowRecomposer = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        C2262x149b840a c2262x149b840a = new C2262x149b840a(this.$systemDurationScaleSettingConsumer, this.$recomposer, this.$source, this.$self, this.$this_createLifecycleAwareWindowRecomposer, interfaceC5631c);
        c2262x149b840a.L$0 = obj;
        return c2262x149b840a;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1c
            if (r1 != r2) goto L14
            java.lang.Object r0 = r7.L$0
            kotlinx.coroutines.w0 r0 = (kotlinx.coroutines.InterfaceC6013w0) r0
            kotlin.AbstractC5774b.m5119b(r8)     // Catch: java.lang.Throwable -> L12
            goto L63
        L12:
            r8 = move-exception
            goto L7a
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            kotlin.AbstractC5774b.m5119b(r8)
            java.lang.Object r8 = r7.L$0
            kotlinx.coroutines.v r8 = (kotlinx.coroutines.InterfaceC6009v) r8
            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.ui.platform.MotionDurationScaleImpl> r1 = r7.$systemDurationScaleSettingConsumer     // Catch: java.lang.Throwable -> L51
            T r1 = r1.element     // Catch: java.lang.Throwable -> L51
            androidx.compose.ui.platform.MotionDurationScaleImpl r1 = (androidx.compose.p011ui.platform.MotionDurationScaleImpl) r1     // Catch: java.lang.Throwable -> L51
            if (r1 == 0) goto L54
            android.view.View r4 = r7.$this_createLifecycleAwareWindowRecomposer     // Catch: java.lang.Throwable -> L51
            android.content.Context r4 = r4.getContext()     // Catch: java.lang.Throwable -> L51
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L51
            kotlinx.coroutines.flow.m0 r4 = androidx.compose.p011ui.platform.WindowRecomposer_androidKt.access$getAnimationScaleFlowFor(r4)     // Catch: java.lang.Throwable -> L51
            java.lang.Object r5 = r4.getValue()     // Catch: java.lang.Throwable -> L51
            java.lang.Number r5 = (java.lang.Number) r5     // Catch: java.lang.Throwable -> L51
            float r5 = r5.floatValue()     // Catch: java.lang.Throwable -> L51
            r1.setScaleFactor(r5)     // Catch: java.lang.Throwable -> L51
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1 r5 = new androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1     // Catch: java.lang.Throwable -> L51
            r5.<init>(r4, r1, r3)     // Catch: java.lang.Throwable -> L51
            r1 = 3
            kotlinx.coroutines.k1 r8 = kotlinx.coroutines.AbstractC6014x.m5651v(r8, r3, r3, r5, r1)     // Catch: java.lang.Throwable -> L51
            goto L55
        L51:
            r8 = move-exception
            r0 = r3
            goto L7a
        L54:
            r8 = r3
        L55:
            androidx.compose.runtime.Recomposer r1 = r7.$recomposer     // Catch: java.lang.Throwable -> L76
            r7.L$0 = r8     // Catch: java.lang.Throwable -> L76
            r7.label = r2     // Catch: java.lang.Throwable -> L76
            java.lang.Object r1 = r1.runRecomposeAndApplyChanges(r7)     // Catch: java.lang.Throwable -> L76
            if (r1 != r0) goto L62
            return r0
        L62:
            r0 = r8
        L63:
            if (r0 == 0) goto L68
            r0.cancel(r3)
        L68:
            androidx.lifecycle.LifecycleOwner r8 = r7.$source
            androidx.lifecycle.Lifecycle r8 = r8.getLifecycle()
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r0 = r7.$self
            r8.removeObserver(r0)
            d6.s r8 = p045d6.C5443s.f8405a
            return r8
        L76:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L7a:
            if (r0 == 0) goto L7f
            r0.cancel(r3)
        L7f:
            androidx.lifecycle.LifecycleOwner r0 = r7.$source
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r1 = r7.$self
            r0.removeObserver(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.platform.C2262x149b840a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((C2262x149b840a) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
