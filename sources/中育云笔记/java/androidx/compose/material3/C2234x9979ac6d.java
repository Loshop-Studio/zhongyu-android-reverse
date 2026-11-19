package androidx.compose.material3;

import android.window.BackEvent;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.material3.internal.PredictiveBack;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.material3.ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackStarted$1", m26211f = "ModalBottomSheet.android.kt", m26212l = {404}, m26213m = "invokeSuspend")
/* renamed from: androidx.compose.material3.ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackStarted$1 */
/* loaded from: classes2.dex */
public final class C2234x9979ac6d extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ BackEvent $backEvent;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $predictiveBackProgress;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234x9979ac6d(Animatable<Float, AnimationVector1D> animatable, BackEvent backEvent, InterfaceC11588c<? super C2234x9979ac6d> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$predictiveBackProgress = animatable;
        this.$backEvent = backEvent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new C2234x9979ac6d(this.$predictiveBackProgress, this.$backEvent, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            Animatable<Float, AnimationVector1D> animatable = this.$predictiveBackProgress;
            Float fM26207b = AbstractC11826a.m26207b(PredictiveBack.INSTANCE.transform$material3_release(this.$backEvent.getProgress()));
            this.label = 1;
            if (animatable.snapTo(fM26207b, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((C2234x9979ac6d) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
