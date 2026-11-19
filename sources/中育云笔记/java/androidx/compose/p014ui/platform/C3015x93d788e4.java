package androidx.compose.p014ui.platform;

import kotlin.AbstractC9924b;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11595d;
import p379vd.InterfaceC11612u;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", m26211f = "WindowRecomposer.android.kt", m26212l = {383}, m26213m = "invokeSuspend")
/* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1 */
/* loaded from: classes2.dex */
public final class C3015x93d788e4 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ InterfaceC11612u $durationScaleStateFlow;
    final /* synthetic */ MotionDurationScaleImpl $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3015x93d788e4(InterfaceC11612u interfaceC11612u, MotionDurationScaleImpl motionDurationScaleImpl, InterfaceC11588c<? super C3015x93d788e4> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$durationScaleStateFlow = interfaceC11612u;
        this.$it = motionDurationScaleImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new C3015x93d788e4(this.$durationScaleStateFlow, this.$it, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC11612u interfaceC11612u = this.$durationScaleStateFlow;
            final MotionDurationScaleImpl motionDurationScaleImpl = this.$it;
            InterfaceC11595d interfaceC11595d = new InterfaceC11595d() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1.1
                @Override // p379vd.InterfaceC11595d
                public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC11588c interfaceC11588c) {
                    return emit(((Number) obj2).floatValue(), (InterfaceC11588c<? super C10786q>) interfaceC11588c);
                }

                public final Object emit(float f10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    motionDurationScaleImpl.setScaleFactor(f10);
                    return C10786q.f26013a;
                }
            };
            this.label = 1;
            if (interfaceC11612u.collect(interfaceC11595d, this) == objM25952f) {
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

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((C3015x93d788e4) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
