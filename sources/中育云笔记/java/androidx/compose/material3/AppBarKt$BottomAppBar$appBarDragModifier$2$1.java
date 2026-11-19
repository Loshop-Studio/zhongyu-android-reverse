package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.material3.AppBarKt$BottomAppBar$appBarDragModifier$2$1", m26211f = "AppBar.kt", m26212l = {877}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AppBarKt$BottomAppBar$appBarDragModifier$2$1 extends SuspendLambda implements InterfaceC9545q {
    final /* synthetic */ BottomAppBarScrollBehavior $scrollBehavior;
    /* synthetic */ float F$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$BottomAppBar$appBarDragModifier$2$1(BottomAppBarScrollBehavior bottomAppBarScrollBehavior, InterfaceC11588c<? super AppBarKt$BottomAppBar$appBarDragModifier$2$1> interfaceC11588c) {
        super(3, interfaceC11588c);
        this.$scrollBehavior = bottomAppBarScrollBehavior;
    }

    @Override // p181hd.InterfaceC9545q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((InterfaceC11122i0) obj, ((Number) obj2).floatValue(), (InterfaceC11588c<? super C10786q>) obj3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            float f10 = this.F$0;
            BottomAppBarState state = this.$scrollBehavior.getState();
            DecayAnimationSpec<Float> flingAnimationSpec = this.$scrollBehavior.getFlingAnimationSpec();
            AnimationSpec<Float> snapAnimationSpec = this.$scrollBehavior.getSnapAnimationSpec();
            this.label = 1;
            if (AppBarKt.settleAppBarBottom(state, f10, flingAnimationSpec, snapAnimationSpec, this) == objM25952f) {
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

    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, float f10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        AppBarKt$BottomAppBar$appBarDragModifier$2$1 appBarKt$BottomAppBar$appBarDragModifier$2$1 = new AppBarKt$BottomAppBar$appBarDragModifier$2$1(this.$scrollBehavior, interfaceC11588c);
        appBarKt$BottomAppBar$appBarDragModifier$2$1.F$0 = f10;
        return appBarKt$BottomAppBar$appBarDragModifier$2$1.invokeSuspend(C10786q.f26013a);
    }
}
