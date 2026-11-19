package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10575q;

@InterfaceC9539d(m17800c = "androidx.compose.material3.AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1", m17801f = "AppBar.kt", m17802l = {1911}, m17803m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1 extends SuspendLambda implements InterfaceC10575q {
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
    /* synthetic */ float F$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1(TopAppBarScrollBehavior topAppBarScrollBehavior, InterfaceC9324c<? super AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1> interfaceC9324c) {
        super(3, interfaceC9324c);
        this.$scrollBehavior = topAppBarScrollBehavior;
    }

    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, float f10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1 appBarKt$SingleRowTopAppBar$appBarDragModifier$2$1 = new AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1(this.$scrollBehavior, interfaceC9324c);
        appBarKt$SingleRowTopAppBar$appBarDragModifier$2$1.F$0 = f10;
        return appBarKt$SingleRowTopAppBar$appBarDragModifier$2$1.invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            float f10 = this.F$0;
            TopAppBarState state = this.$scrollBehavior.getState();
            DecayAnimationSpec<Float> flingAnimationSpec = this.$scrollBehavior.getFlingAnimationSpec();
            AnimationSpec<Float> snapAnimationSpec = this.$scrollBehavior.getSnapAnimationSpec();
            this.label = 1;
            if (AppBarKt.settleAppBar(state, f10, flingAnimationSpec, snapAnimationSpec, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        return C8736p.f16368a;
    }

    @Override // p300x7.InterfaceC10575q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((InterfaceC8822b0) obj, ((Number) obj2).floatValue(), (InterfaceC9324c<? super C8736p>) obj3);
    }
}
