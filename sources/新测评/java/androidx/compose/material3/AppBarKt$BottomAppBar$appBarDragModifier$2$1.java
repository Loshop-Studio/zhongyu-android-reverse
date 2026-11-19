package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "velocity", ""}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.compose.material3.AppBarKt$BottomAppBar$appBarDragModifier$2$1", m13596f = "AppBar.kt", m13597i = {}, m13598l = {877}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes2.dex */
public final class AppBarKt$BottomAppBar$appBarDragModifier$2$1 extends SuspendLambda implements Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> {
    final /* synthetic */ BottomAppBarScrollBehavior $scrollBehavior;
    /* synthetic */ float F$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$BottomAppBar$appBarDragModifier$2$1(BottomAppBarScrollBehavior bottomAppBarScrollBehavior, Continuation<? super AppBarKt$BottomAppBar$appBarDragModifier$2$1> continuation) {
        super(3, continuation);
        this.$scrollBehavior = bottomAppBarScrollBehavior;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Float f10, Continuation<? super Unit> continuation) {
        return invoke(coroutineScope, f10.floatValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            float f10 = this.F$0;
            BottomAppBarState state = this.$scrollBehavior.getState();
            DecayAnimationSpec<Float> flingAnimationSpec = this.$scrollBehavior.getFlingAnimationSpec();
            AnimationSpec<Float> snapAnimationSpec = this.$scrollBehavior.getSnapAnimationSpec();
            this.label = 1;
            if (AppBarKt.settleAppBarBottom(state, f10, flingAnimationSpec, snapAnimationSpec, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    public final Object invoke(CoroutineScope coroutineScope, float f10, Continuation<? super Unit> continuation) {
        AppBarKt$BottomAppBar$appBarDragModifier$2$1 appBarKt$BottomAppBar$appBarDragModifier$2$1 = new AppBarKt$BottomAppBar$appBarDragModifier$2$1(this.$scrollBehavior, continuation);
        appBarKt$BottomAppBar$appBarDragModifier$2$1.F$0 = f10;
        return appBarKt$BottomAppBar$appBarDragModifier$2$1.invokeSuspend(Unit.INSTANCE);
    }
}
