package androidx.compose.foundation.layout;

import android.view.WindowInsetsAnimationController;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2", m26211f = "WindowInsetsConnection.android.kt", m26212l = {345}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class WindowInsetsNestedScrollConnection$fling$2 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ WindowInsetsAnimationController $animationController;
    final /* synthetic */ int $current;
    final /* synthetic */ Ref$FloatRef $endVelocity;
    final /* synthetic */ float $flingAmount;
    final /* synthetic */ int $hidden;
    final /* synthetic */ int $shown;
    final /* synthetic */ SplineBasedFloatDecayAnimationSpec $spec;
    final /* synthetic */ boolean $targetShown;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1", m26211f = "WindowInsetsConnection.android.kt", m26212l = {329}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1 */
    public static final class C14361 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ WindowInsetsAnimationController $animationController;
        final /* synthetic */ int $current;
        final /* synthetic */ Ref$FloatRef $endVelocity;
        final /* synthetic */ float $flingAmount;
        final /* synthetic */ int $hidden;
        final /* synthetic */ int $shown;
        final /* synthetic */ SplineBasedFloatDecayAnimationSpec $spec;
        final /* synthetic */ boolean $targetShown;
        int label;
        final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14361(int i10, float f10, SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec, int i11, int i12, WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, Ref$FloatRef ref$FloatRef, WindowInsetsAnimationController windowInsetsAnimationController, boolean z10, InterfaceC11588c<? super C14361> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$current = i10;
            this.$flingAmount = f10;
            this.$spec = splineBasedFloatDecayAnimationSpec;
            this.$hidden = i11;
            this.$shown = i12;
            this.this$0 = windowInsetsNestedScrollConnection;
            this.$endVelocity = ref$FloatRef;
            this.$animationController = windowInsetsAnimationController;
            this.$targetShown = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C14361(this.$current, this.$flingAmount, this.$spec, this.$hidden, this.$shown, this.this$0, this.$endVelocity, this.$animationController, this.$targetShown, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                float f10 = this.$current;
                float f11 = this.$flingAmount;
                SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec = this.$spec;
                final int i11 = this.$hidden;
                final int i12 = this.$shown;
                final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.this$0;
                final Ref$FloatRef ref$FloatRef = this.$endVelocity;
                final WindowInsetsAnimationController windowInsetsAnimationController = this.$animationController;
                final boolean z10 = this.$targetShown;
                InterfaceC9544p interfaceC9544p = new InterfaceC9544p() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.fling.2.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p181hd.InterfaceC9544p
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke(((Number) obj2).floatValue(), ((Number) obj3).floatValue());
                        return C10786q.f26013a;
                    }

                    public final void invoke(float f12, float f13) {
                        float f14 = i11;
                        if (f12 <= i12 && f14 <= f12) {
                            windowInsetsNestedScrollConnection.adjustInsets(f12);
                            return;
                        }
                        ref$FloatRef.f23399c = f13;
                        windowInsetsAnimationController.finish(z10);
                        windowInsetsNestedScrollConnection.animationController = null;
                        InterfaceC10045g interfaceC10045g = windowInsetsNestedScrollConnection.animationJob;
                        if (interfaceC10045g != null) {
                            interfaceC10045g.cancel(new WindowInsetsAnimationCancelledException());
                        }
                    }
                };
                this.label = 1;
                if (SuspendAnimationKt.animateDecay(f10, f11, splineBasedFloatDecayAnimationSpec, interfaceC9544p, this) == objM25952f) {
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
            return ((C14361) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsNestedScrollConnection$fling$2(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, int i10, float f10, SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec, int i11, int i12, Ref$FloatRef ref$FloatRef, WindowInsetsAnimationController windowInsetsAnimationController, boolean z10, InterfaceC11588c<? super WindowInsetsNestedScrollConnection$fling$2> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = windowInsetsNestedScrollConnection;
        this.$current = i10;
        this.$flingAmount = f10;
        this.$spec = splineBasedFloatDecayAnimationSpec;
        this.$hidden = i11;
        this.$shown = i12;
        this.$endVelocity = ref$FloatRef;
        this.$animationController = windowInsetsAnimationController;
        this.$targetShown = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        WindowInsetsNestedScrollConnection$fling$2 windowInsetsNestedScrollConnection$fling$2 = new WindowInsetsNestedScrollConnection$fling$2(this.this$0, this.$current, this.$flingAmount, this.$spec, this.$hidden, this.$shown, this.$endVelocity, this.$animationController, this.$targetShown, interfaceC11588c);
        windowInsetsNestedScrollConnection$fling$2.L$0 = obj;
        return windowInsetsNestedScrollConnection$fling$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
            WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.this$0;
            windowInsetsNestedScrollConnection.animationJob = AbstractC11117h.m24726d(interfaceC11122i0, null, null, new C14361(this.$current, this.$flingAmount, this.$spec, this.$hidden, this.$shown, windowInsetsNestedScrollConnection, this.$endVelocity, this.$animationController, this.$targetShown, null), 3, null);
            InterfaceC10045g interfaceC10045g = this.this$0.animationJob;
            if (interfaceC10045g != null) {
                this.label = 1;
                if (interfaceC10045g.mo20458v(this) == objM25952f) {
                    return objM25952f;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        this.this$0.animationJob = null;
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((WindowInsetsNestedScrollConnection$fling$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
