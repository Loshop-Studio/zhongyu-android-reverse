package androidx.compose.foundation.layout;

import android.view.WindowInsetsAnimationController;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3", m26211f = "WindowInsetsConnection.android.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class WindowInsetsNestedScrollConnection$fling$3 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ WindowInsetsAnimationController $animationController;
    final /* synthetic */ int $current;
    final /* synthetic */ float $flingAmount;
    final /* synthetic */ int $target;
    final /* synthetic */ boolean $targetShown;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1", m26211f = "WindowInsetsConnection.android.kt", m26212l = {355}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1 */
    public static final class C14371 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ WindowInsetsAnimationController $animationController;
        final /* synthetic */ int $current;
        final /* synthetic */ float $flingAmount;
        final /* synthetic */ int $target;
        final /* synthetic */ boolean $targetShown;
        int label;
        final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14371(int i10, int i11, float f10, WindowInsetsAnimationController windowInsetsAnimationController, boolean z10, WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, InterfaceC11588c<? super C14371> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$current = i10;
            this.$target = i11;
            this.$flingAmount = f10;
            this.$animationController = windowInsetsAnimationController;
            this.$targetShown = z10;
            this.this$0 = windowInsetsNestedScrollConnection;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C14371(this.$current, this.$target, this.$flingAmount, this.$animationController, this.$targetShown, this.this$0, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C14371 c14371;
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                Animatable animatableAnimatable$default = AnimatableKt.Animatable$default(this.$current, 0.0f, 2, null);
                Float fM26207b = AbstractC11826a.m26207b(this.$target);
                Float fM26207b2 = AbstractC11826a.m26207b(this.$flingAmount);
                final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.this$0;
                InterfaceC9540l interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.fling.3.1.1
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((Animatable<Float, AnimationVector1D>) obj2);
                        return C10786q.f26013a;
                    }

                    public final void invoke(Animatable<Float, AnimationVector1D> animatable) {
                        windowInsetsNestedScrollConnection.adjustInsets(animatable.getValue().floatValue());
                    }
                };
                this.label = 1;
                c14371 = this;
                if (Animatable.animateTo$default(animatableAnimatable$default, fM26207b, null, fM26207b2, interfaceC9540l, c14371, 2, null) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                c14371 = this;
            }
            c14371.$animationController.finish(c14371.$targetShown);
            c14371.this$0.animationController = null;
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C14371) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsNestedScrollConnection$fling$3(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, int i10, int i11, float f10, WindowInsetsAnimationController windowInsetsAnimationController, boolean z10, InterfaceC11588c<? super WindowInsetsNestedScrollConnection$fling$3> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = windowInsetsNestedScrollConnection;
        this.$current = i10;
        this.$target = i11;
        this.$flingAmount = f10;
        this.$animationController = windowInsetsAnimationController;
        this.$targetShown = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        WindowInsetsNestedScrollConnection$fling$3 windowInsetsNestedScrollConnection$fling$3 = new WindowInsetsNestedScrollConnection$fling$3(this.this$0, this.$current, this.$target, this.$flingAmount, this.$animationController, this.$targetShown, interfaceC11588c);
        windowInsetsNestedScrollConnection$fling$3.L$0 = obj;
        return windowInsetsNestedScrollConnection$fling$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.this$0;
        windowInsetsNestedScrollConnection.animationJob = AbstractC11117h.m24726d(interfaceC11122i0, null, null, new C14371(this.$current, this.$target, this.$flingAmount, this.$animationController, this.$targetShown, windowInsetsNestedScrollConnection, null), 3, null);
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((WindowInsetsNestedScrollConnection$fling$3) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
